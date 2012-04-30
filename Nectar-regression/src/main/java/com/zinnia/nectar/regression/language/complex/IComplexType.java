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

package com.zinnia.nectar.regression.language.complex;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * Its interface which tells the complex functions implemented in Nectar using the basic API . 
 */
/**
 * @author hadoop
 *
 */
public interface IComplexType {
	/**
	 * 
	 * @param inputFilePath - input file path in HDFS
	 * @param xColumn 
	 * @param yColumn 
	 * @param n - no.of rows
	 * @return correlation between two columns
	 */
	public Future<Double> correlation(String inputFilePath,int xColumn,int yColumn,int n);
	/**
	 * 
	 * @param inputFilePath
	 * @param columns
	 * @param n - no.of rows
	 * @return correlation matrix
	 */
	public Future<Double[][]> correlationmatrix(String inputFilePath,List<Integer> columns,int n);
	/**
	 * 
	 * @param inputFilePath
	 * @param columns . Last column in list is treated as target column
	 * @param n - no.of rows
	 * @return multiple regression equation with constant
	 */
	public Future<Map<Integer,Double>> multipleregression(String inputFilePath,List<Integer> columns,int n);
	/**
	 * 
	 * @param inputFilePath
	 * @param columns
	 * @param n - no.of rows
	 * @param levelOfSignificance - 0.1 0r 0.5
	 * @return Multiple Regression equation after forward selection
	 */
	public Map<Integer,Double> forwardSelection(String inputFilePath,List<Integer> columns,int n,double levelOfSignificance);
	/**
	 * @param inputFilePath
	 * @param xColumn
	 * @param yColumn
	 * @param n - no.of rows
	 * @return covariance between two columns
	 */
	public Future<Double> covariance(String inputFilePath,int xColumn,int yColumn,int n);
	/**
	 * @param inputFilePath
	 * @param columns
	 * @param n
	 * @return covariance matrix
	 */
	public Future<Double[][]> covariancematrix(String inputFilePath,List<Integer> columns,int n);
	/**
	 * @param matrixPathA
	 * @param matrixPathB
	 * @return 
	 */
	public Future<String> matrixmultiply(String matrixPathA,String matrixPathB);
	/**
	 * @param matrixPath
	 * @return
	 */
	public Future<String> matrixTranspose(String matrixPath);
}
