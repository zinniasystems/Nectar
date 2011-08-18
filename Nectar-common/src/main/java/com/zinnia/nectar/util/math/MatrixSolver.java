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

package com.zinnia.nectar.util.math;

import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.LUDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealVector;
/**
 * 
 * Class to solve simultaneous equation using apache math library
 *
 */

public class MatrixSolver {

	public static double [] solveMatrix(double [][] coefficientMatrix,double [] rhsVector)
	{
		RealVector x = null;
		try
		{
		RealMatrix a = new Array2DRowRealMatrix(coefficientMatrix);
		RealVector b = new ArrayRealVector(rhsVector);
		DecompositionSolver solver = new LUDecompositionImpl(a).getSolver();
		x = solver.solve(b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
       
		double [] result;
		result=x.toArray(); 

		return result;
	}
}
