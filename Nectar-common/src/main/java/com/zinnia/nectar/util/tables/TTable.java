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

package com.zinnia.nectar.util.tables;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/**
 * Statistical T table
 */

public class TTable {

	int INFINITY=9999;
	Map<Integer,Double> nintyNineMap = new TreeMap<Integer,Double>()

	{
		{
			put(1,6.314);
			put(2,9.20);
			put(3,2.353);
			put(4,2.132);
			put(5,2.015);
			put(6,1.943);
			put(7,1.895);
			put(8,1.860);
			put(9,1.833);
			put(10,1.812);
			put(11,1.796);
			put(12,1.782);
			put(13,1.771);
			put(14,1.761);
			put(15,1.753);
			put(16,1.746);
			put(17,1.740);
			put(18,1.734);
			put(19,1.729);
			put(20,1.725);
			put(21,1.721);
			put(22,1.717);
			put(23,1.714);
			put(24,1.711);
			put(25,1.708);
			put(26,1.706);
			put(27,1.703);
			put(28,1.701);
			put(29,1.699);
			put(30,1.697);
			put(40,1.684);
			put(60,1.671);
			put(120,1.658);
			put(INFINITY,1.645);
		}
	};




	Map<Integer,Double> nintyFiveMap=new HashMap<Integer,Double>()
	{

		{
			put(1,12.706);
			put(2,4.303);
			put(3,3.182);
			put(4,2.776);
			put(5,2.571);
			put(6,2.447);
			put(7,2.365);
			put(8,2.306);
			put(9,2.262);
			put(10,2.228);
			put(11,2.201);
			put(12,2.179);
			put(13,2.160);
			put(14,2.145);
			put(15,2.131);
			put(16,2.120);
			put(17,2.110);
			put(18,2.101);
			put(19,2.093);
			put(20,2.086);
			put(21,2.080);
			put(22,2.074);
			put(23,2.069);
			put(24,2.064);
			put(25,2.060);
			put(26,2.056);
			put(27,2.052);
			put(28,2.048);
			put(29,2.045);
			put(30,2.042);
			put(40,2.021);
			put(60,2.00);
			put(120,1.980);
			put(INFINITY,1.960);
		}
	};


	private double getInterPolatedTValue(int n,Map<Integer,Double> valueMap)
	{
		double tValue;
		Set<Integer> keySet=valueMap.keySet();
		Iterator<Integer> setIterator = keySet.iterator();
		int lower = 0;
		int higher = 0;
		while(setIterator.hasNext())
		{
			int value = setIterator.next();
			if(value<n)
			{
				lower=value;
			}
			else
			{
				higher=value;
				break;
			}

		}
		double lowerValue=  valueMap.get(lower);
		double higherValue =  valueMap.get(higher);

		tValue = lowerValue+((higherValue-lowerValue)*((n-lower)/(higher-lower)));

		return tValue;
	}
	public double getTCriticalValueput(int n,double levelOfSignificance)
	{
		double tCriticalValue = 0;
		Map<Integer,Double> valueMap = null ;
		if(levelOfSignificance==0.1)
		{
			valueMap=nintyNineMap;
		}
		else  if(levelOfSignificance==0.5)
		{
			valueMap=nintyFiveMap;
		}


		if(n>120)
		{
			tCriticalValue=valueMap.get(INFINITY);
		}
		else if(valueMap.containsKey(n))
		{
			tCriticalValue=valueMap.get(n);
		}
		else
		{
			tCriticalValue=getInterPolatedTValue(n,valueMap);
		}




		return tCriticalValue;

	}

}
