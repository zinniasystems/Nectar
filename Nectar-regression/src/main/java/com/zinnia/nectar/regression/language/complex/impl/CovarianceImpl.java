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

public class CovarianceImpl implements Callable<Double>
{
	private String inputFilePath;
	private int xColumn;
	private int yColumn;
	private int n;
	
	public CovarianceImpl(String inputFilePath, int xColumn, int yColumn, int n) {
		this.inputFilePath = inputFilePath;
		this.xColumn = xColumn;
		this.yColumn = yColumn;
		this.n = n;
	}

	public Double call() throws Exception 
	{
		// TODO Auto-generated method stub
		IPrimitiveType primitiveType = PrimitiveTypeImplFactory.getInstance(inputFilePath);
		Future<Double> sigmaxFuture = primitiveType.sigmax(inputFilePath,xColumn);
		Future<Double> sigmayFuture = primitiveType.sigmax(inputFilePath,yColumn);
		Future<Double> sigmaxyFuture = primitiveType.sigmaxy(inputFilePath,xColumn,yColumn);
		
		double sigmax = sigmaxFuture.get();
		double sigmay = sigmayFuture.get();
		double sigmaxy = sigmaxyFuture.get();
		
		double covariance = (sigmaxy/n)-((sigmax/n)*(sigmay/n));
		return covariance;
	}
}
