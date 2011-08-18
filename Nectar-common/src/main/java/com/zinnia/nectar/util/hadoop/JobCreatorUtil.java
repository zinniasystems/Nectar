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

package com.zinnia.nectar.util.hadoop;

import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.mapreduce.InputFormat;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/*
 * Utility class to create the Hadoop jobs
 */
public class JobCreatorUtil {
	
	public Job createJob(Class<? extends Mapper> mapperClass,Class<? extends WritableComparable> mapperOutputKeyClass,Class<? extends WritableComparable> mapperOutputValueClass,Class<? extends InputFormat> inputFormatClass,String[] inputFilePaths,String outputFilePath) throws IOException
	{
		Job job = new Job();
		job.setMapperClass(mapperClass);
		job.setMapOutputKeyClass(mapperOutputKeyClass);
		job.setMapOutputValueClass(mapperOutputValueClass);
		for(String inputFilePath : inputFilePaths)
		{
			FileInputFormat.addInputPath(job, new Path(inputFilePath));
		}
		FileOutputFormat.setOutputPath(job, new Path(outputFilePath));
		job.setInputFormatClass(inputFormatClass);
		
		
		
		return job;
	}
	public Job createJob(Class<? extends Mapper> mapperClass,Class<? extends Reducer> reducerClass,Class<? extends WritableComparable> mapperOutputKeyClass,Class<? extends WritableComparable> mapperOutputValueClass,Class<? extends WritableComparable> outputKeyClass,Class <? extends WritableComparable> outputValueClass,Class< ? extends InputFormat> inputFormatClass,String[] inputFilePaths,String outputFilePath) throws IOException
	{
		Job job = createJob(mapperClass, mapperOutputKeyClass, mapperOutputValueClass, inputFormatClass, inputFilePaths, outputFilePath);
		job.setReducerClass(reducerClass);
		job.setOutputKeyClass(outputKeyClass);
		job.setOutputValueClass(outputValueClass);
		return job;
	}

}
