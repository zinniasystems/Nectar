/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zinnia.nectar.regression.hadoop.primitive.jobs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.chain.ChainMapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.jobcontrol.ControlledJob;
import org.apache.hadoop.mapreduce.lib.jobcontrol.JobControl;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.zinnia.nectar.config.NectarException;
import com.zinnia.nectar.regression.hadoop.primitive.mapreduce.DoubleSumReducer;
import com.zinnia.nectar.regression.hadoop.primitive.mapreduce.SigmaMapper;
import com.zinnia.nectar.util.hadoop.FieldSeperator;

public class SigmaJob implements Callable<Double>{

	static Job job;
	static ControlledJob controlledJob;
	static FileSystem fs;
	Log log=LogFactory.getLog(SigmaJob.class);
	private String inputFilePath;
	private int column;
	private String outputFilePath;				
	public SigmaJob(String inputFilePath,String outputFilePath,int column) {
		super();
		this.column=column;
		this.inputFilePath = inputFilePath;
		this.outputFilePath=outputFilePath;
	}

	@Override
	public Double call() throws NectarException  {
		double value = 0;
		JobControl jobControl = new JobControl("sigmajob");
		try {
			job = new Job();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		job.setJarByClass(SigmaJob.class);
		log.info("Sigma Job initialized");
		log.warn("Sigma job: Processing...Do not terminate/close");
		log.debug("Sigma job: Mapping process started");
		try {
			ChainMapper.addMapper(job, FieldSeperator.FieldSeperationMapper.class,DoubleWritable.class,Text.class,NullWritable.class,Text.class,job.getConfiguration());
			ChainMapper.addMapper(job, SigmaMapper.class,NullWritable.class,Text.class,Text.class,DoubleWritable.class,job.getConfiguration());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		job.getConfiguration().set("fields.spec", ""+column);

		job.setReducerClass(DoubleSumReducer.class);

		try {
			FileInputFormat.addInputPath(job, new Path(inputFilePath));
			fs = FileSystem.get(job.getConfiguration());
			if(!fs.exists(new Path(inputFilePath)))
			{
				throw new NectarException("Exception occured:File "+inputFilePath+" not found ");
			}
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			String trace =new String();
			log.error(e2.toString());
			for(StackTraceElement s:e2.getStackTrace()){
				trace+="\n\t at "+s.toString();
			}
			log.debug(trace);
			log.debug("Sigma Job terminated abruptly\n");
			throw new NectarException();
		}
		FileOutputFormat.setOutputPath(job,new Path(outputFilePath));
		job.setMapOutputValueClass(DoubleWritable.class);
		job.setMapOutputKeyClass(Text.class);
		job.setInputFormatClass(TextInputFormat.class);
		log.debug("Sigma job: Mapping process completed");

		log.debug("Sigma job: Reducing process started");
		try {
			controlledJob = new ControlledJob(job.getConfiguration());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jobControl.addJob(controlledJob);
		Thread thread = new Thread(jobControl);
		thread.start();
		while(!jobControl.allFinished())
		{
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		jobControl.stop();
		try {
			FSDataInputStream in =fs.open(new Path(outputFilePath+"/part-r-00000"));
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
			String valueLine = bufferedReader.readLine();
			String [] fields = valueLine.split("\t");
			value = Double.parseDouble(fields[1]);
			bufferedReader.close();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.error("Exception occured: Output file cannot be read.");
			log.debug(e.getMessage());
			log.debug("Sigma Job terminated abruptly\n");
			throw new NectarException();
		}
		log.debug("Sigma job: Reducing process completed");
		log.info("Sigma Job completed\n");
		return value;
	}
}
