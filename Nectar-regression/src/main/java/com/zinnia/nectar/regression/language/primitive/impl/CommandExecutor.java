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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Callable;

import com.zinnia.nectar.regression.language.primitive.Preferences;
/**
 * 
 *Its a worker design pattern class to run the Hadoop job commands;
 *
 */
public class CommandExecutor implements Callable<Double> {

	String command;
	String outputFilePath;


	public CommandExecutor(String command,String outputFilePath) {
		this.command = command;
		this.outputFilePath=outputFilePath;
	}

	public Double call() {
		
		//try to get a free process from process queue
		try {
			PrimitiveTypeHadoopImpl.processQueue.take();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Runtime runtime = Runtime.getRuntime();
		Process process = null;
		try {
			process = runtime.exec(command);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean completed=false;
		Double value = null;


		while(!completed)
		{
			try
			{
				int exitValue=process.exitValue();
				
				completed=true;
                FileReader fileReader = null;
				try {
					
					if(exitValue==0)
					{
				
					fileReader = new FileReader("/tmp/"+outputFilePath+"/part-r-00000");
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String valueLine = null;
				try {
					valueLine = bufferedReader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				String [] fields = valueLine.split("\t");
				value = Double.parseDouble(fields[1]); 
				
			}
			catch(IllegalThreadStateException ex)
			{
                  try {
					Thread.sleep(5000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			File outputDirectory = new File ("/tmp/"+outputFilePath);
			outputDirectory.delete(); // clears up the output directory for space concerns
		}
		try {
			PrimitiveTypeHadoopImpl.processQueue.put(new Object());
			process.destroy(); //destroys the process so that memory will be released
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;	
	}

}
