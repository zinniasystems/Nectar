package com.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.zinnia.nectar.regression.language.primitive.IPrimitiveType;
import com.zinnia.nectar.regression.language.primitive.PrimitiveTypeImplFactory;

public class Covariance {

	/**
	 * Implements covariance of two columns using following equation
	 * Cov(x,y) = 1/n*n *( n*sigma(xy) - (sigmax*sigmay))
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		IPrimitiveType primitiveType = PrimitiveTypeImplFactory.getInstance("book.csv"); // find the files under samples/files and put into HDFS input directory
		int columnx = 1; 
		int columny = 4;
		int n = 30;
		
		Future<Double> sigmaxFuture = primitiveType.sigmax("book.csv",columnx);
		Future<Double> sigmayFuture = primitiveType.sigmax("book.csv",columny);
		Future<Double> sigmaxyFuture = primitiveType.sigmaxy("book.csv",columnx,columny);
		
		double sigmax = sigmaxFuture.get();
		double sigmay = sigmayFuture.get();
		double sigmaxy = sigmaxyFuture.get();
		
		System.out.println(sigmax+"  "+sigmay+" "+sigmaxy);
		double cov = (n*sigmaxy-(sigmax*sigmay))/(n*n);
		System.out.println("cov is "+cov);
		
		
		
		
		

	}

}
