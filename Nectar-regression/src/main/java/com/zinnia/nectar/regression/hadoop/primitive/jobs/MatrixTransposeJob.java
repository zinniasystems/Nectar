package com.zinnia.nectar.regression.hadoop.primitive.jobs;

import java.util.UUID;
import java.util.concurrent.Callable;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.SequenceFileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.zinnia.nectar.regression.hadoop.primitive.mapreduce.MatrixTransposeMapper;
import com.zinnia.nectar.regression.hadoop.primitive.mapreduce.MatrixTransposeReducer;

public class MatrixTransposeJob implements Callable<String> {
	
	private String path;
	private int numCols;
	
	public MatrixTransposeJob(String path, int numCols) {
		super();
		this.path = path;
		this.numCols = numCols;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		String outpath="out"+UUID.randomUUID();
		Configuration configuration=new Configuration();
		configuration.setInt("numCols", numCols);
		configuration.set("outpath", path);
		Job job=new Job(configuration, "Matrix Transpose");
		job.setJarByClass(MatrixTransposeJob.class);
		job.setMapperClass(MatrixTransposeMapper.class);
		job.setReducerClass(MatrixTransposeReducer.class);
		job.setInputFormatClass(SequenceFileInputFormat.class);
		job.setMapOutputKeyClass(LongWritable.class);
		job.setMapOutputValueClass(DoubleWritable.class);
		job.setOutputKeyClass(NullWritable.class);
		job.setOutputValueClass(Text.class);
		FileInputFormat.addInputPath(job, new Path(path+"/0/part-m-00000"));
		FileOutputFormat.setOutputPath(job, new Path(outpath));
		job.waitForCompletion(true);
		return outpath;
	}

}
