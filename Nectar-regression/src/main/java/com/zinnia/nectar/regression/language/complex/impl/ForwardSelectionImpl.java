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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.zinnia.nectar.regression.language.primitive.IPrimitiveType;
import com.zinnia.nectar.regression.language.primitive.PrimitiveTypeImplFactory;
import com.zinnia.nectar.util.tables.TTable;

public class ForwardSelectionImpl {

	private List<Integer> selectedVariables;
	private String inputFilePath;
	private List<Integer> columns;

	private int n;
	public ForwardSelectionImpl(String inputFilePath, List<Integer> columns, int n) {
		super();
		this.inputFilePath = inputFilePath;
		this.columns = columns;
		this.n = n;

	}

	public Map<Integer,Double> forwardSelection(double levelOfConfidence) throws InterruptedException, ExecutionException
	{
		selectedVariables = new ArrayList<Integer>();
		Map<Integer,Double> outputValues = new HashMap<Integer,Double>(); 
		MultipleRegressionImpl multipleRegressionImpl = new MultipleRegressionImpl(inputFilePath,columns,n);
		Map<Integer, Double> stdDeviations = multipleRegressionImpl.getStandardDeviations();
		Map<Integer, Double> means = multipleRegressionImpl.getMean();
		Double[][] corrMatrix = multipleRegressionImpl.getCorrelationMatrix();
		boolean shouldContinue = true;
		while(shouldContinue && columns.size()-1!=selectedVariables.size())
		{
			
			Map<Integer,Double> tScores = new HashMap<Integer,Double>();
			for(int i=0;i<columns.size()-1;i++)
			{
				int column = columns.get(i);
				if(!selectedVariables.contains(column))
				{
					List<Integer> cols = new ArrayList<Integer>();
					for(Integer selectedColumn : selectedVariables)
						cols.add(selectedColumn);
					cols.add(column);
					cols.add(columns.get(columns.size()-1));
					Double [][] partialCorrMatrix = getPartialCorrelationMatrix(cols,corrMatrix);
					MultipleRegressionImpl impl = new MultipleRegressionImpl(inputFilePath,cols,n);
					outputValues= impl.doRegression(partialCorrMatrix,columns.get(columns.size()-1), stdDeviations, means);
					double tScore = getTScore(cols, column, outputValues, stdDeviations);
					
					tScores.put(column, tScore);
					
				}

			}
			int selectedColumn=shouldContinue(tScores,levelOfConfidence);
			if(selectedColumn<0)
			{
				shouldContinue=false;
			}
			else
			{
				
				selectedVariables.add(selectedColumn);
			}
		}


		


		return outputValues;

	}

	private Double[][] getPartialCorrelationMatrix(List<Integer> cols,
			Double[][] fullCorrMatrix) {
		// TODO Auto-generated method stub
		Double[][] partialCorrMatrix = new Double[cols.size()][cols.size()];

		for(int i=0;i<columns.size();i++)
		{
			if(cols.contains(columns.get(i)))
			{
				int index = cols.indexOf(columns.get(i));
				partialCorrMatrix[index]=fullCorrMatrix[i];
			}

		}
		return partialCorrMatrix;
	}

	private int shouldContinue(Map<Integer,Double> tScores,double levelOfConfidence) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		TTable tTable = new TTable();
		double tScoreCritical = tTable.getTCriticalValueput(n-selectedVariables.size()-2,levelOfConfidence);
		int maxColumn = -1;
		double maxTscore = Double.NEGATIVE_INFINITY;
		Iterator<Integer> keySetIterator = tScores.keySet().iterator();
		while(keySetIterator.hasNext())
		{
			int column = keySetIterator.next();

			double tScore = tScores.get(column);
			
			if(tScore>maxTscore)
			{
				maxTscore=tScore;
				maxColumn=column;	
			}
		}

		
		int selectedColumn = maxTscore>=tScoreCritical?maxColumn :-1;
		return selectedColumn;


	}
	public double getTScore(List<Integer> columns,int column,Map<Integer,Double> paramValues,Map<Integer,Double>standardDeviations) throws InterruptedException, ExecutionException
	{
		
		Map<Integer,Double> tScores = new HashMap<Integer,Double>(); 
		IPrimitiveType primitiveImpl = PrimitiveTypeImplFactory.getInstance(inputFilePath);
		Future<Double > yDiffFuture =primitiveImpl.ydiffjob(inputFilePath, columns,paramValues);
		
		double yDiffValue = yDiffFuture.get();

		double stdDeviation = standardDeviations.get(column);
		double variance = stdDeviation*stdDeviation;
		double numerator = Math.sqrt(yDiffValue/(n-2));
		double denominator = Math.sqrt(variance*n);
		double SE = numerator/denominator;
		
		double tScore = paramValues.get(column)/SE;
		
		return tScore;
}



}

