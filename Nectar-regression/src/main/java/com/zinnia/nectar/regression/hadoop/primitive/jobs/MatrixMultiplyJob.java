package com.zinnia.nectar.regression.hadoop.primitive.jobs;

import java.util.UUID;
import java.util.concurrent.Callable;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.zinnia.nectar.regression.hadoop.primitive.mapreduce.MatrixMultiplyMapper;


public class MatrixMultiplyJob implements Callable<String> {

	private String matrixPathA;
	private String outPath;
	private int numColsB;
	
	
	public MatrixMultiplyJob(String matrixPathA, String outPath, int numColsB) {
		super();
		this.matrixPathA = matrixPathA;
		this.outPath = outPath;
		this.numColsB = numColsB;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.setInt("numColsB", numColsB);
		configuration.set("matrixB", outPath);
		Job job = new Job(configuration, "Multiply Matrix");

		String output="output"+UUID.randomUUID();
		job.setJarByClass(MatrixMultiplyJob.class);
		job.setMapperClass(MatrixMultiplyMapper.class);
		job.setReducerClass(Reducer.class);
		job.setOutputKeyClass(LongWritable.class);
		job.setOutputValueClass(Text.class);

		FileInputFormat.addInputPath(job, new Path(matrixPathA));
		FileOutputFormat.setOutputPath(job, new Path(output));

		job.waitForCompletion(true);
		return output;
	}

}
