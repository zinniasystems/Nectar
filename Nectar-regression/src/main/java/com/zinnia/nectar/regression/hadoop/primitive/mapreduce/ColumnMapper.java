package com.zinnia.nectar.regression.hadoop.primitive.mapreduce;

import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import com.zinnia.nectar.util.hadoop.writable.IndexPair;


public class ColumnMapper extends Mapper<LongWritable, Text, IndexPair, DoubleWritable> 
{
	private String delim = "\t";
	
	@Override
	protected void map(LongWritable key, Text value,Context context)
	throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		int index = context.getConfiguration().getInt("index", 0);
		String[] values = value.toString().split(delim);
		double val = Double.parseDouble(values[index]);
		IndexPair indexPair=new IndexPair(key.get(), index);
		context.write(indexPair, new DoubleWritable(val));
	}
	
}
