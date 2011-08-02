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
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


import com.zinnia.nectar.regression.language.complex.IComplexType;

public class ComplexTypeImpl implements IComplexType {
	final private int MAX_THREADS=100;
	ExecutorService executorService = Executors.newFixedThreadPool(MAX_THREADS);

	public Future<Double> correlation(String inputFilePath, int xColumn,
			int yColumn, int n) {
		CorrelationImpl correlationImpl = new CorrelationImpl(inputFilePath,xColumn,yColumn,n);
		return executorService.submit(correlationImpl);


	}
	public Future<Double> variance(String inputFilePath,int column,int n)
	{
		VarianceImpl varianceImpl = new VarianceImpl(inputFilePath,column,n);
		return executorService.submit(varianceImpl);
	}


	public Future<Double[][]> correlationmatrix(String inputFilePath,
			List<Integer> columns, int n) {
		CorrelationMatrixImpl correlationMatrixImpl = new CorrelationMatrixImpl(inputFilePath,columns,n);
		return executorService.submit(correlationMatrixImpl);

	}

	public Future<Map<Integer,Double> > multipleregression(String inputFilePath,
			List<Integer> columns, int n) {
		MultipleRegressionImpl multipleRegressionImpl = new MultipleRegressionImpl(inputFilePath,columns,n);
		try
		{
		return executorService.submit(multipleRegressionImpl);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;

	}


	public Map<Integer, Double> forwardSelection(String inputFilePath,
			List<Integer> columns, int n, double levelOfSignificance) {
		ForwardSelectionImpl forwardSelectionImpl = new ForwardSelectionImpl(inputFilePath,columns,n);
		try {
			return forwardSelectionImpl.forwardSelection(levelOfSignificance);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}











}
