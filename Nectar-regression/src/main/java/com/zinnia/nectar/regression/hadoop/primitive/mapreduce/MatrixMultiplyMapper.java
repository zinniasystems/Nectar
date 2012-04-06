package com.zinnia.nectar.regression.hadoop.primitive.mapreduce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MatrixMultiplyMapper extends Mapper<LongWritable, Text, LongWritable, Text> 
{
	private String delim = "\t";
	private int numRows;
	
	@Override
	protected void setup(Context context) throws IOException,
	InterruptedException {
		// TODO Auto-generated method stub
		Configuration configuration=context.getConfiguration();
		numRows = configuration.getInt("numColsB", 0);
	}

	@Override
	protected void map(LongWritable key, Text value,Context context)
	throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		double sum = 0,x,y;
		int count = 0;
		StringBuffer buffer = new StringBuffer();
		Path[] cacheFiles=context.getLocalCacheFiles();
		
		while(count <= numRows-1){
			StringTokenizer tokenizer = new StringTokenizer(value.toString(), delim);
			BufferedReader reader=new BufferedReader(new FileReader(cacheFiles[count].toString()));
			String line = "";
		
			while(tokenizer.hasMoreTokens() && (line=reader.readLine()) != null){
				x = Double.parseDouble(tokenizer.nextToken());
				y = Double.parseDouble(line);
				sum += x*y;
			}
			
			buffer.append(sum+"\t");
			count++;
			reader.close();
			sum = 0;
		}
		context.write(key,new Text(buffer.toString()));
	}
}
