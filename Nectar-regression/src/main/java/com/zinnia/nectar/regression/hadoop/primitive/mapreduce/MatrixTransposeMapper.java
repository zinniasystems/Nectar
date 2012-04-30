package com.zinnia.nectar.regression.hadoop.primitive.mapreduce;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.SequenceFile;
import org.apache.hadoop.mapreduce.Mapper;

import com.zinnia.nectar.util.hadoop.writable.IndexPair;


public class MatrixTransposeMapper extends Mapper<IndexPair, DoubleWritable, LongWritable, DoubleWritable>{

	private int numCols;
	private String path;
	private FileSystem fileSystem;
	/* (non-Javadoc)
	 * @see org.apache.hadoop.mapreduce.Mapper#setup(org.apache.hadoop.mapreduce.Mapper.Context)
	 */
	@Override
	protected void setup(Context context)
	throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Configuration configuration=context.getConfiguration();
		fileSystem=FileSystem.get(configuration);
		numCols=configuration.getInt("numCols", 0);
		path=configuration.get("outpath");
		
		for(int i=1;i<numCols;i++){
			SequenceFile.Reader reader=new SequenceFile.Reader(fileSystem, new Path(path+"/"+i+"/part-m-00000"), configuration);
			IndexPair indexPair=new IndexPair();
			DoubleWritable doubleWritable=new DoubleWritable();
			while(reader.next(indexPair, doubleWritable)){
				context.write(new LongWritable(indexPair.getColIndex()), doubleWritable);
			}
			reader.close();
		}
		
	}
	/* (non-Javadoc)
	 * @see org.apache.hadoop.mapreduce.Mapper#map(java.lang.Object, java.lang.Object, org.apache.hadoop.mapreduce.Mapper.Context)
	 */
	@Override
	protected void map(IndexPair key, DoubleWritable value,Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		context.write(new LongWritable(key.getColIndex()), value);
	}
	
}
