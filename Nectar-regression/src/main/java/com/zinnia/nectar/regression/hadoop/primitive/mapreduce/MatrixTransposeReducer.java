package com.zinnia.nectar.regression.hadoop.primitive.mapreduce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MatrixTransposeReducer extends Reducer<LongWritable, DoubleWritable, NullWritable, Text> {

	/* (non-Javadoc)
	 * @see org.apache.hadoop.mapreduce.Reducer#reduce(java.lang.Object, java.lang.Iterable, org.apache.hadoop.mapreduce.Reducer.Context)
	 */
	@Override
	protected void reduce(LongWritable key, Iterable<DoubleWritable> values,Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer();
		List<Double> list=new ArrayList<Double>();
		for(DoubleWritable value:values){
			list.add(value.get());
		}
		System.out.println("Break");
		
		for(int i=list.size()-1;i>=0;--i){
			buffer.append(list.get(i)+"\t");
		}
		context.write(NullWritable.get(), new Text(buffer.toString()));
	}
	
}
