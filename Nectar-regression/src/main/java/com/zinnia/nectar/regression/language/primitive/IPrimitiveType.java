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

package com.zinnia.nectar.regression.language.primitive;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
/**
 * 
 * Its a base class for Nectar API. It provides the basic statistical functions using Hadoop Map/Reduce. 
 *
 */
public interface IPrimitiveType
{
	/**
	 * @param inputFilePath
	 * @param column
	 * @return summation of a column
	 */
	Future<Double> sigmax(String inputFilePath,int column);
	/**
	 * @param inputFilePath
	 * @param column
	 * @return sum of the squares of a column
	 */
	Future<Double> sigmaxSquare(String inputFilePath,int column);
	/**
	 * @param inputFilePath
	 * @param x
	 * @param y
	 * @return sum of the product of two column values
	 */
	Future<Double> sigmaxy(String inputFilePath,int x,int y);
	/**
	 * @param inputFilePath
	 * @param column
	 * @return a sorted array
	 */
	Future<Double[]> sort(String inputFilePath,int column);
	/**
	 * @param inputFilePath
	 * @param column
	 * @param n
	 * @return mean of a column
	 */
	Future<Double> mean(String inputFilePath,int column,int n);
	/**
	 * Experimental API to run the different equation on a single row in map reduce. As of now its only useful for forward selection . But in future 
	 * will be generalized for all kind of scenarios.
	 * @param inputFilePath
	 * @param columns
	 * @param paramValues
	 * @return
	 */
	Future<Double> ydiffjob(String inputFilePath, List<Integer> columns,
			Map<Integer,Double> paramValues); 

}
