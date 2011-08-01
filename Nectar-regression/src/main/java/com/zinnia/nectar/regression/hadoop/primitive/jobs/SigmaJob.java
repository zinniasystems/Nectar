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
import java.io.InputStreamReader;
import java.util.concurrent.Callable;

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
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


import com.zinnia.nectar.config.Preferences;
import com.zinnia.nectar.regression.hadoop.primitive.mapreduce.DoubleSumReducer;
import com.zinnia.nectar.regression.hadoop.primitive.mapreduce.SigmaMapper;
import com.zinnia.nectar.util.hadoop.FieldSeperator;

public class SigmaJob implements Callable<Double>{

	Logger logger=Logger.getLogger(SigmaJob.class);
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
	public Double call() throws Exception {
		// TODO Auto-generated method stub
		DOMConfigurator.configure(Preferences.LOG_PATH);
		JobControl jobControl = new JobControl("sigmajob");
		Job job = new Job();
		logger.info("Sigma JOB started");
		job.setJarByClass(SigmaJob.class);

		ChainMapper.addMapper(job, FieldSeperator.FieldSeperationMapper.class,DoubleWritable.class,Text.class,NullWritable.class,Text.class,job.getConfiguration());
		
		ChainMapper.addMapper(job, SigmaMapper.class,NullWritable.class,Text.class,Text.class,DoubleWritable.class,job.getConfiguration());
		
		job.getConfiguration().set("fields.spec", ""+column);
		job.setReducerClass(DoubleSumReducer.class);
		
		FileInputFormat.addInputPath(job, new Path(inputFilePath));
		logger.warn("Processing...Do not terminate/close");
		FileOutputFormat.setOutputPath(job,new Path(outputFilePath));
		job.setMapOutputValueClass(DoubleWritable.class);
		job.setMapOutputKeyClass(Text.class);
		job.setInputFormatClass(TextInputFormat.class);
		
		ControlledJob controlledJob = new ControlledJob(job.getConfiguration());
		jobControl.addJob(controlledJob);
		Thread thread = new Thread(jobControl);
		thread.start();
		while(!jobControl.allFinished())
		{
			Thread.sleep(10000);
		}
		jobControl.stop();
		logger.info("Sigma JOB ended");
		FileSystem fs = FileSystem.get(job.getConfiguration());
		FSDataInputStream in =fs.open(new Path(outputFilePath+"/part-r-00000"));
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
		String valueLine = bufferedReader.readLine();
		String [] fields = valueLine.split("\t");
		double value = Double.parseDouble(fields[1]);
		bufferedReader.close();
		in.close();
		return value;
		
		
	}
}
