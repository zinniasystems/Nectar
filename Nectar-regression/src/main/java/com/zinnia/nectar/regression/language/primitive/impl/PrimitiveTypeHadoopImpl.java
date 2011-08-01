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

package com.zinnia.nectar.regression.language.primitive.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.zinnia.nectar.config.Preferences;
import com.zinnia.nectar.regression.hadoop.primitive.jobs.MeanJob;
import com.zinnia.nectar.regression.hadoop.primitive.jobs.SigmaJob;
import com.zinnia.nectar.regression.hadoop.primitive.jobs.SigmaSqJob;
import com.zinnia.nectar.regression.hadoop.primitive.jobs.SigmaXYJob;
import com.zinnia.nectar.regression.hadoop.primitive.jobs.YDiffJob;
import com.zinnia.nectar.regression.language.primitive.IPrimitiveType;


public class PrimitiveTypeHadoopImpl implements IPrimitiveType {
	Random random = new Random(400);
	private int MAX_THREADS;
	final String inputDirectory = "input/";
	private ExecutorService executorService;

	public PrimitiveTypeHadoopImpl()
	{
		Preferences.init();
		MAX_THREADS=Preferences.NO_OF_PARALLEL_JOBS;
		executorService = Executors.newFixedThreadPool(MAX_THREADS);
		
		
	}
	public Future<Double> sigmax(String inputFilePath, int column) {
		// TODO Auto-generated method stub
		String completeInputFilePath = inputDirectory+inputFilePath;
		String outputFilePath = "output/output"+System.currentTimeMillis()+random.nextInt()+UUID.randomUUID();
		SigmaJob sigmaJob = new SigmaJob(completeInputFilePath,outputFilePath,column);
		Future<Double> value=executorService.submit(sigmaJob);
		return value;
	}


	public Future<Double> sigmaxSquare(String inputFilePath,
			int column) {
		String completeInputFilePath = inputDirectory+inputFilePath;
		String outputFilePath = "output/output"+System.currentTimeMillis()+random.nextInt()+UUID.randomUUID();
		SigmaSqJob sigmaSqJob = new SigmaSqJob(completeInputFilePath,outputFilePath,column);
		Future<Double> value = executorService.submit(sigmaSqJob);

		return value;
	}


	public Future<Double> mean(String inputFilePath, int column,
			int n) {
		String completeInputFilePath = inputDirectory+inputFilePath;
		String outputFilePath = "output/output"+System.currentTimeMillis()+random.nextInt()+UUID.randomUUID();
		MeanJob meanJob = new MeanJob(completeInputFilePath,outputFilePath,column,n);
		Future<Double> value = executorService.submit(meanJob);
		return value;
	}


	public Future<Double> sigmaxy(String inputFilePath,int x,
			int y) {
		String completeInputFilePath = inputDirectory+inputFilePath;
		String outputFilePath = "output/output"+System.currentTimeMillis()+random.nextInt()+UUID.randomUUID();
		SigmaXYJob sigmaxyJob = new SigmaXYJob(completeInputFilePath,outputFilePath,x,y);
		Future<Double> value = executorService.submit(sigmaxyJob);
		return value;
	}
	public Future<Double> ydiffjob(String inputFilePath, List<Integer> columns,
			Map<Integer,Double> paramValues) {
		String completeInputFilePath = inputDirectory+inputFilePath;
		String outputFilePath = "output/output"+System.currentTimeMillis()+random.nextInt()+UUID.randomUUID();
		/* Prepare column list */
		String [] columnStringArray = new String[columns.size()]; 
		List<String> paramValueStringList = new ArrayList<String>();
		for(int i=0;i<columns.size();i++)
		{
			int column = columns.get(i);
			columnStringArray[i]=""+column;
			
			if(column!=columns.get(columns.size()-1)) //last column will be output column
			{
				paramValueStringList.add(""+paramValues.get(column));
				
			}
		}
        String [] paramValueArray = paramValueStringList.toArray(new String[paramValueStringList.size()]);    
		YDiffJob yDiffJob = new YDiffJob(completeInputFilePath,outputFilePath,columnStringArray,paramValueArray);
		Future<Double> value=executorService.submit(yDiffJob);
		
		return value;
	}




}
