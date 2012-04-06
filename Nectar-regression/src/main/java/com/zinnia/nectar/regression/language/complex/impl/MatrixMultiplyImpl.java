package com.zinnia.nectar.regression.language.complex.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import com.zinnia.nectar.regression.language.primitive.IPrimitiveType;
import com.zinnia.nectar.regression.language.primitive.PrimitiveTypeImplFactory;

public class MatrixMultiplyImpl implements Callable<String> {

	private String matrixPathA;
	private String matrixPathB;

	public MatrixMultiplyImpl(String matrixPathA, String matrixPathB) {
		this.matrixPathA = matrixPathA;
		this.matrixPathB = matrixPathB;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		int index=0;
		String output=new String();
		List<Future<String>> futureList=new ArrayList<Future<String>>();
		List<String> outPaths=new ArrayList<String>();
		int numRowsA = getNumRows(matrixPathA);
		int numColsA = getNumCols(matrixPathA);
		int numRowsB = getNumRows(matrixPathB);
		int numColsB = getNumCols(matrixPathB);
		if(numColsA==numRowsB){
			String outpath="out"+UUID.randomUUID();
			IPrimitiveType primitiveType = PrimitiveTypeImplFactory.getInstance(matrixPathB); 
			while(index<numColsB){
				Future<String> future=primitiveType.separateMatrixColumns(matrixPathB, index);
				futureList.add(future);
				index++;
			}
			index=0;
			while(index<numColsB){
				outPaths.add(futureList.get(index).get());
				index++;
			}
			Future<String> futureVal=primitiveType.multiplyMatrices(matrixPathA, outPaths, numColsB);
			output=futureVal.get();
		}
		return output;
	}

	private int getNumCols(String matrixPath) throws IOException {
		// TODO Auto-generated method stub
		FileSystem fileSystem = FileSystem.get(new Configuration());
		System.out.println("Enter num cols");
		FSDataInputStream stream = fileSystem.open(new Path(matrixPath));
		String line = stream.readLine();
		stream.close();
		fileSystem.close();
		int columns = line.split("\t").length;
		return columns;
	}

	private int getNumRows(String matrixPath) throws IOException {
		// TODO Auto-generated method stub
		FileSystem fileSystem = FileSystem.get(new Configuration());
		System.out.println("Enter num rows:"+matrixPath);
		FSDataInputStream stream = fileSystem.open(new Path(matrixPath));
		int rows = 0;
		while(stream.readLine() != null){
			++rows;
		}
		stream.close();
		fileSystem.close();
		return rows;
	}
}

