package com.zinnia.nectar.regression.hadoop.primitive.jobs;

import java.util.UUID;
import java.util.concurrent.Callable;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.zinnia.nectar.regression.hadoop.primitive.mapreduce.ColumnMapper;

public class SeparateColumnsJob implements Callable<String> {
	private String matrixPath;
	private int index;
	
	public SeparateColumnsJob(String matrixPath, int index) {
		super();
		this.matrixPath = matrixPath;
		this.index = index;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		String output=new String();
		Configuration configuration=new Configuration(); 
		configuration.setInt("index", index);
		Job job = new Job(configuration, "Separating colums Job");
		job.setJarByClass(SeparateColumnsJob.class);
		job.setMapperClass(ColumnMapper.class);
		job.setOutputKeyClass(NullWritable.class);
		job.setOutputValueClass(DoubleWritable.class);
		
		output="output"+UUID.randomUUID()+"/"+index;
		FileInputFormat.addInputPath(job, new Path(matrixPath));
		FileOutputFormat.setOutputPath(job, new Path(output));

		job.setNumReduceTasks(0);
		job.waitForCompletion(true);
		return output;
	}
}
