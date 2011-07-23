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

import java.io.IOException;

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
import com.zinnia.nectar.regression.hadoop.primitive.mapreduce.YDiffMapper;
import com.zinnia.nectar.util.hadoop.FieldSeperator;

public class YDiffJob {

	private String inputFilePath;
	private String[] columns;
	private String[] paramValues;
	private String outputFilePath; //="output/result";
	public YDiffJob(String inputFilePath ,String outputFilePath,String[] columns,String [] paramValues) {
		
		super();
		this.paramValues=paramValues;
		this.columns=columns;
		this.outputFilePath= outputFilePath;		
		this.inputFilePath = inputFilePath;
	}
	
	
	public void createRunHadoop() throws IOException, InterruptedException
	{
		JobControl jobControl = new JobControl("YDiff job");

		Job job = new Job();
		job.setJarByClass(YDiffJob.class);
		
	
		
		ChainMapper.addMapper(job, FieldSeperator.FieldSeperationMapper.class,DoubleWritable.class,Text.class,NullWritable.class,Text.class,job.getConfiguration());
		
		ChainMapper.addMapper(job, YDiffMapper.class,NullWritable.class,Text.class,Text.class,DoubleWritable.class,job.getConfiguration());
		
		String fieldSpec = getFieldSpecForColumns();
		job.getConfiguration().set("fields.spec",fieldSpec);
		job.getConfiguration().setStrings("paramValues",paramValues);
		job.setReducerClass(DoubleSumReducer.class);
		FileInputFormat.addInputPath(job, new Path(inputFilePath));
		FileOutputFormat.setOutputPath(job,new Path(outputFilePath));
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(DoubleWritable.class);
		job.setInputFormatClass(TextInputFormat.class);
		
		ControlledJob controlledJob = new ControlledJob(job.getConfiguration());
		jobControl.addJob(controlledJob);
		Thread thread = new Thread(jobControl);
		thread.start();
		while(!jobControl.allFinished())
		{
			Thread.sleep(10000);
		}
		
		FileSystem fs = FileSystem.get(job.getConfiguration());
		fs.copyToLocalFile(new Path(outputFilePath),new Path("/tmp/"+outputFilePath));
		System.exit(0);

	}
	 private String getFieldSpecForColumns()
	 {
		 StringBuilder fieldSpec = new StringBuilder();
		  for(String column : columns)
		  {
			  fieldSpec.append(column);
			  fieldSpec.append(",");
		  }
		  fieldSpec.deleteCharAt(fieldSpec.lastIndexOf(","));
		return fieldSpec.toString();
	 }
	public static void main(String args[])
	{
		String inputFilePath = args[0];
		String outputFilePath = args[1];
		String[] columns = args[2].split(",");
		String [] paramValues = args[3].split(",");
		YDiffJob ydiffJob = new YDiffJob(inputFilePath,outputFilePath,columns,paramValues);
		try {
			ydiffJob.createRunHadoop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
