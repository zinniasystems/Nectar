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
import java.util.concurrent.Future;

import com.zinnia.nectar.regression.language.primitive.IPrimitiveType;
import com.zinnia.nectar.regression.language.primitive.PrimitiveTypeImplFactory;

public class VarianceImpl implements Callable<Double> {
	private String inputFilePath;
	private int column;
	private int n;
	/**
	 * @param inputFilePath
	 * @param column
	 */
	public VarianceImpl(String inputFilePath, int column,int n) {
		super();
		this.inputFilePath = inputFilePath;
		this.column = column;
		this.n=n;
	}
	public Double call() throws Exception {
		// TODO Auto-generated method stub
		
		IPrimitiveType primitiveImpl = PrimitiveTypeImplFactory.getInstance(inputFilePath);
		Future<Double> sigmaxFuture = primitiveImpl.sigmax(inputFilePath,column);
		Future<Double> sigmaxsqFuture = primitiveImpl.sigmaxSquare(inputFilePath,column);
		double sigmax= sigmaxFuture.get();
		double sigmaxsq = sigmaxsqFuture.get();
		double sigmaxwsq= sigmax * sigmax;
		double variance = (sigmaxsq/n ) - (sigmaxwsq/(n*n));
		
		return variance;
	}
	
}
