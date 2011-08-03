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

import com.zinnia.nectar.regression.hadoop.primitive.mapreduce.DoubleSumReducer;
import com.zinnia.nectar.regression.hadoop.primitive.mapreduce.SigmaMapper;
import com.zinnia.nectar.util.hadoop.FieldSeperator;

public class SigmaJob implements Callable<Double>{

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
	public Double call() throws Exception{
		// TODO Auto-generated method stub
		double value = 0;
		JobControl jobControl = new JobControl("sigmajob");
		Job job;
		try {
			job = new Job();
			job.setJarByClass(SigmaJob.class);
			log.info("Sigma Job initialized");
			log.warn("Processing...Do not terminate/close");
			log.debug("Mapping process started");
			ChainMapper.addMapper(job, FieldSeperator.FieldSeperationMapper.class,DoubleWritable.class,Text.class,NullWritable.class,Text.class,job.getConfiguration());
			ChainMapper.addMapper(job, SigmaMapper.class,NullWritable.class,Text.class,Text.class,DoubleWritable.class,job.getConfiguration());
			job.getConfiguration().set("fields.spec", ""+column);

			job.setReducerClass(DoubleSumReducer.class);
			
			FileInputFormat.addInputPath(job, new Path(inputFilePath));
			
			FileOutputFormat.setOutputPath(job,new Path(outputFilePath));
			job.setMapOutputValueClass(DoubleWritable.class);
			job.setMapOutputKeyClass(Text.class);
			job.setInputFormatClass(TextInputFormat.class);
			log.debug("Mapping process completed");
			
			log.debug("Reducing process started");
			ControlledJob controlledJob = new ControlledJob(job.getConfiguration());
			jobControl.addJob(controlledJob);
			Thread thread = new Thread(jobControl);
			thread.start();
			while(!jobControl.allFinished())
			{
				Thread.sleep(10000);
			}
			log.debug("Reducing process completed");
			jobControl.stop();
			log.info("Sigma Job completed");
			FileSystem fs = FileSystem.get(job.getConfiguration());
			FSDataInputStream in =fs.open(new Path(outputFilePath+"/part-r-00000"));
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
			String valueLine = bufferedReader.readLine();
			String [] fields = valueLine.split("\t");
			value = Double.parseDouble(fields[1]);
			bufferedReader.close();
			in.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			log.error("Exception occured : "+e1.getMessage());
			throw new Exception(e1.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
}
