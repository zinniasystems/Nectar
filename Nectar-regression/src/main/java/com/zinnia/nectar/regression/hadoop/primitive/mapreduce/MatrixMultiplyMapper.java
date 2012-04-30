package com.zinnia.nectar.regression.hadoop.primitive.mapreduce;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.SequenceFile;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import com.zinnia.nectar.util.hadoop.writable.IndexPair;


public class MatrixMultiplyMapper extends Mapper<LongWritable, Text, LongWritable, Text> 
{
	private String delim = "\t";
	private int numRows;
	private String matrixB="";
	
	@Override
	protected void setup(Context context) throws IOException,
	InterruptedException {
		// TODO Auto-generated method stub
		Configuration configuration=context.getConfiguration();
		numRows = configuration.getInt("numColsB", 0);
		matrixB = configuration.get("matrixB");
	}

	@Override
	protected void map(LongWritable key, Text value,Context context)
	throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		double sum = 0,x,y;
		int count = 0;
		StringBuffer buffer = new StringBuffer();
		
		FileSystem fs=FileSystem.get(context.getConfiguration());
		while(count <= numRows-1){
			StringTokenizer tokenizer = new StringTokenizer(value.toString(), delim);
			
			SequenceFile.Reader reader=new SequenceFile.Reader(fs, new Path(matrixB+"/"+count+"/part-m-00000"), context.getConfiguration());
			IndexPair indexPair=new IndexPair();
			DoubleWritable doubleWritable=new DoubleWritable();
			while(tokenizer.hasMoreTokens() && reader.next(indexPair, doubleWritable)){
				x = Double.parseDouble(tokenizer.nextToken());
				y = doubleWritable.get();
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
