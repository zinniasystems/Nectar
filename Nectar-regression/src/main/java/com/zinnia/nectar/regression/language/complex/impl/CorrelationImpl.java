/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zinnia.nectar.regression.language.complex.impl;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.zinnia.nectar.regression.language.primitive.IPrimitiveType;
import com.zinnia.nectar.regression.language.primitive.PrimitiveTypeImplFactory;
/**
 * 
 * Implements Correlation coefficient using standard equations.
 *
 */

public class CorrelationImpl implements Callable<Double> {

	private String inputFilePath;
	private int xColumn;
	private int yColumn;
	private int n;

	public CorrelationImpl(String inputFilePath, int xColumn, int yColumn, int n) {
		this.inputFilePath = inputFilePath;
		this.xColumn = xColumn;
		this.yColumn = yColumn;
		this.n = n;
	}

	public Double call() throws Exception{
		IPrimitiveType primitiveImpl=PrimitiveTypeImplFactory.getInstance(inputFilePath);
		Future<Double> sigmaxFuture = null;
		try {
			sigmaxFuture = primitiveImpl.sigmax(inputFilePath, xColumn);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		Future<Double> sigmayFuture = null;
		try {
			sigmayFuture = primitiveImpl.sigmax(inputFilePath, yColumn);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		Future<Double> sigmaxyFuture= primitiveImpl.sigmaxy(inputFilePath, xColumn, yColumn);
		Future<Double> sigmaxsqFuture = primitiveImpl.sigmaxSquare(inputFilePath, xColumn);
		Future<Double> sigmaysqFuture = primitiveImpl.sigmaxSquare(inputFilePath, yColumn);

		double sigmax = 0;
		try {
			sigmax = sigmaxFuture.get();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} catch (ExecutionException e) {
			
			e.printStackTrace();
		}

		double sigmay = 0;
		try {
			sigmay = sigmayFuture.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		double sigmaxsq = 0;
		try {
			sigmaxsq = sigmaxsqFuture.get();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			e1.printStackTrace();
		}
		double sigmaysq = 0;
		try {
			sigmaysq = sigmaysqFuture.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			
			e.printStackTrace();
		}

		double sigmaxy = 0;
		try {
			sigmaxy = sigmaxyFuture.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {

			e.printStackTrace();
		}


		double sigmaxwsq= sigmax * sigmax;
		double sigmaywsq = sigmay * sigmay;
		double numerator = (n * sigmaxy) - (sigmax * sigmay) ;
		double denominator= Math.sqrt(( n* sigmaxsq - sigmaxwsq ) * (n* sigmaysq - sigmaywsq));
		double divval = numerator / denominator ;

		return divval;

	}

}
