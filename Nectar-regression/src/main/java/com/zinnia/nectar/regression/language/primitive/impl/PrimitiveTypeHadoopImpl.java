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

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.zinnia.nectar.regression.language.primitive.IPrimitiveType;
import com.zinnia.nectar.regression.language.primitive.Preferences;


public class PrimitiveTypeHadoopImpl implements IPrimitiveType {
	public String HADOOP_HOME;
	public static String JAR_NAME="Nectar-regression-0.0.1-SNAPSHOT.jar";
	
	Random random = new Random(400);
	CommandExecutor commandExecutor;
	final private int MAX_THREADS=30;
	public static BlockingQueue<Object> processQueue;
	private int NO_OF_PROCESS;
	private ExecutorService executorService;
	private void initializeProcessQueue()
	{
		for(int i=0;i<NO_OF_PROCESS;i++)
		{
			try {
				processQueue.put(new Object());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public PrimitiveTypeHadoopImpl()
	{
		Preferences.init();
		HADOOP_HOME=Preferences.HADOOP_HOME;
		NO_OF_PROCESS=Preferences.NO_OF_PARALLEL_JOBS;
		processQueue= new ArrayBlockingQueue<Object>(NO_OF_PROCESS);
		initializeProcessQueue();
		executorService = Executors.newFixedThreadPool(MAX_THREADS);
	}
	



	public Future<Double> sigmax(String inputFilePath, int column) {
		// TODO Auto-generated method stub
		String outputFilePath = "output/output"+System.currentTimeMillis()+random.nextInt()+UUID.randomUUID();
		String command=HADOOP_HOME+"bin/hadoop jar "+HADOOP_HOME+JAR_NAME+" "+
		" com.zinnia.nectar.regression.hadoop.primitive.jobs.SigmaJob input/"+inputFilePath+" "+outputFilePath+" "+column;
		commandExecutor= new CommandExecutor(command,outputFilePath);
		Future<Double> value=executorService.submit(commandExecutor);



		return value;
	}


	public Future<Double> sigmaxSquare(String inputFilePath,
			int column) {
		// TODO Auto-generated method stub
		String outputFilePath = "output/output"+System.currentTimeMillis()+random.nextInt()+UUID.randomUUID();

		String command=HADOOP_HOME+"bin/hadoop jar "+HADOOP_HOME+JAR_NAME+" "+
		"com.zinnia.nectar.regression.hadoop.primitive.jobs.SigmaSqJob input/"+inputFilePath+" "+outputFilePath+" "+column;
		commandExecutor= new CommandExecutor(command,outputFilePath);
		Future<Double> value=executorService.submit(commandExecutor);


		return value;
	}


	public Future<Double> mean(String inputFilePath, int column,
			int n) {
		String outputFilePath = "output/output"+System.currentTimeMillis()+random.nextInt()+UUID.randomUUID();
		String command=HADOOP_HOME+"bin/hadoop jar "+HADOOP_HOME+JAR_NAME+" "+
		" com.zinnia.nectar.regression.hadoop.primitive.jobs.MeanJob input/"+inputFilePath+" "+outputFilePath+" "+column+" "+n;
		commandExecutor= new CommandExecutor(command,outputFilePath);
		Future<Double> value=executorService.submit(commandExecutor);


		return value;
	}


	public Future<Double> sigmaxy(String inputFilePath,int x,
			int y) {
		// TODO Auto-generated method stub
		String outputFilePath = "output/output"+System.currentTimeMillis()+random.nextInt()+UUID.randomUUID();
		String command=HADOOP_HOME+"bin/hadoop jar "+HADOOP_HOME+JAR_NAME+" "+
		" com.zinnia.nectar.regression.hadoop.primitive.jobs.SigmaXYJob input/"+inputFilePath+" "+outputFilePath+" "+x+" "+y;
		commandExecutor= new CommandExecutor(command,outputFilePath);
		Future<Double> value=executorService.submit(commandExecutor);


		return value;
	}
	public Future<Double> ydiffjob(String inputFilePath, List<Integer> columns,
			Map<Integer,Double> paramValues) {
		String outputFilePath = "output/output"+System.currentTimeMillis()+random.nextInt()+UUID.randomUUID();
		String command=HADOOP_HOME+"bin/hadoop jar "+HADOOP_HOME+JAR_NAME+" "+
		" com.zinnia.nectar.regression.hadoop.primitive.jobs.YDiffJob input/"+inputFilePath+" "+outputFilePath+" ";
		String params = new String();
		StringBuilder columnString = new StringBuilder();
		StringBuilder paramValsString = new StringBuilder();
		paramValsString.append(paramValues.get(0)+",");
		for(int column : columns)
		{
			columnString.append(column);
			columnString.append(",");
			if(column!=columns.get(columns.size()-1)) //last column will be output column
			{
				paramValsString.append(paramValues.get(column));
				paramValsString.append(",");
			}
		}
		columnString.deleteCharAt(columnString.lastIndexOf(","));
		paramValsString.deleteCharAt(paramValsString.lastIndexOf(","));
		params = params+" "+columnString.toString();
		params = params+" "+paramValsString.toString();
		command = command+" "+params;
		commandExecutor= new CommandExecutor(command,outputFilePath);
		Future<Double> value=executorService.submit(commandExecutor);


		return value;
	}




}
