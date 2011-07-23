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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.zinnia.nectar.regression.language.primitive.IPrimitiveType;
import com.zinnia.nectar.regression.language.primitive.PrimitiveTypeImplFactory;
import com.zinnia.nectar.util.math.MatrixSolver;

/**
 * 
 * Implements Linear Multiple Regression . Last column in the column list will be trated as target column
 *
 */

public class MultipleRegressionImpl  implements Callable<Map<Integer,Double> > {

	private String inputFilePath;
	private List<Integer> columns;
	private int n;
	public MultipleRegressionImpl(String inputFilePath, List<Integer> columns, int n) {
		this.inputFilePath = inputFilePath;
		this.columns=columns;
		this.n = n;
	}


	public Map<Integer,Double>  call() throws Exception {
		// TODO Auto-generated method stub

		
		int columnSize=columns.size();
		Map<Integer,Double> standardDeviations=getStandardDeviations();
		Map<Integer,Double>  meanVals= getMean();
		Double[][] corrMatrix = getCorrelationMatrix();
		
		for(int i=0;i<columnSize;i++)
		{
			for(int j=0;j<columnSize;j++)
			{
				System.out.print(corrMatrix[i][j]);
				System.out.print("\t");
			}
			
		}

		return doRegression(corrMatrix,columns.get(columnSize-1),standardDeviations, meanVals);

	}

	public Map<Integer,Double>  doRegression(Double [][] corrMatrix ,int targetColumn,Map<Integer,Double> standardDeviations,Map<Integer,Double> meanValues)
	{
		double [] eigenVector = getEigenVector(corrMatrix);
		Map<Integer,Double> betaValues = new HashMap<Integer,Double>();
		double dependentStandardDeviation = standardDeviations.get(targetColumn);
		double dependentMean = meanValues.get(targetColumn);

		for(int i=0;i<eigenVector.length;i++) {
			double evalue = eigenVector[i] *( dependentStandardDeviation/ standardDeviations.get(columns.get(i)) ); 
			betaValues.put(columns.get(i), evalue);
		} 
		double meanSum=0;
		 for(int column : columns)
		{
			if(column!=targetColumn)
			{
				double value =meanValues.get(column)*betaValues.get(column);
				meanSum+=value;
			}
		}

		double constant = dependentMean-meanSum;		
		betaValues.put(0,constant);

		
		return betaValues;

	}


	public Map<Integer,Double> getStandardDeviations() throws InterruptedException, ExecutionException
	{
		
		Map<Integer,Double> standardDeviations=new HashMap<Integer,Double>();
		Map<Integer,Future<Double>> varianceFutures=new HashMap<Integer,Future<Double>>();
		ComplexTypeImpl complexImpl = new ComplexTypeImpl();
		for(int column : columns)
		{
			Future<Double> varianceFuture=complexImpl.variance(inputFilePath, column, n);
			varianceFutures.put(column,varianceFuture);
		}
		for(int column : columns)
		{
			
			double variance = varianceFutures.get(column).get();
			
			double standardDeviation = Math.sqrt(variance);
			standardDeviations.put(column,standardDeviation);
		}

		return standardDeviations;

	}

	public Map<Integer,Double> getMean() throws InterruptedException, ExecutionException
	{
		Map<Integer,Double> means =new HashMap<Integer,Double>();
		Map<Integer,Future<Double>> meanFutures=new HashMap<Integer,Future<Double>>();
		IPrimitiveType primitiveImpl = PrimitiveTypeImplFactory.getInstance(inputFilePath);
		for(int column : columns)
		{
			Future<Double> meanFuture=primitiveImpl.mean(inputFilePath, column, n);
			meanFutures.put(column,meanFuture);
		}
		for(int column : columns)
		{
			double mean = meanFutures.get(column).get();
			means.put(column,mean);
		}
		return means;


	}

	public double[] getEigenVector(Double[][] corrMatrix)
	{
		double coefficientMatrix[][]= new double[columns.size()-1][columns.size()-1] ;
		double rhsVector[]=new double[columns.size()-1];
		int coefficientIndex = columns.size()-1;
		for(int i=0;i<coefficientIndex;i++)
		{
			for(int j=0;j<coefficientIndex;j++)
			{
				coefficientMatrix[i][j]=corrMatrix[i][j];

			}
		}
		for(int i=0;i<coefficientIndex;i++)

		{ 
			rhsVector[i] = (double) corrMatrix[i][coefficientIndex];

		}
		double [] result = MatrixSolver.solveMatrix(coefficientMatrix, rhsVector);
		return result;

	}

	public Double[][] getCorrelationMatrix() throws InterruptedException, ExecutionException
	{
		ComplexTypeImpl correlationMatrixImpl = new ComplexTypeImpl();
		Future<Double[][]> corrmatrixFuture = correlationMatrixImpl.correlationmatrix(inputFilePath, columns, n);
		Double[][] corrmatrix=corrmatrixFuture.get();
		return corrmatrix;
	}


}











