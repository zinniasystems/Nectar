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

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class CovarianceMatrixImpl implements Callable<Double[][]>
{
	private String inputFilePath;
	private List<Integer> columns;
	private int n;
	public CovarianceMatrixImpl(String inputFilePath, List<Integer> columns,
			int n) {
		this.inputFilePath = inputFilePath;
		this.columns = columns;
		this.n = n;
	}
	
	public Double[][] call() throws Exception {
		// TODO Auto-generated method stub
		ComplexTypeImpl complexTypeImpl=new ComplexTypeImpl();
		Double[][] covarianceMatrix=new Double[columns.size()][columns.size()];
		Object[][] covarianceFutureMatrix=new Object[columns.size()][columns.size()];
		
		for(int i=0;i<columns.size();i++)
		{
			for(int j=0;j<columns.size();j++)
			{
				if(i>=j)
				{
					Future<Double> covarianceFuture=complexTypeImpl.covariance(inputFilePath, columns.get(i), columns.get(j), n);
					covarianceFutureMatrix[i][j]=covarianceFuture;
					covarianceFutureMatrix[j][i]=covarianceFuture;
				}
			}
		}
		
		for(int i=0;i<columns.size();i++)
		{
			for(int j=0;j<columns.size();j++)
			{
				Future<Double> covariance=(Future<Double>) covarianceFutureMatrix[i][j];
				covarianceMatrix[i][j]=covariance.get();
			}
		}
		return covarianceMatrix;
	}
}
