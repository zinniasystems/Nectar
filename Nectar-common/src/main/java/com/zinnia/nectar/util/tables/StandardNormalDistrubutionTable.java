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

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/**
 * Statistical Standard normal distribution table
 */


public class StandardNormalDistrubutionTable {

	Map<Double,Double> NTable = new TreeMap<Double,Double>()
	{{
		put(-3.4,0.0003);
		put(-3.3,0.0004);
		put(-3.2,0.0006);
		put(-3.1,0.0008);
		put(-3.0,0.0011);
		put(-2.9,0.0016);
		put(-2.8,0.0022);
		put(-2.7,0.0030);
		put(-2.6,0.0040);
		put(-2.5,0.0054);
		put(-2.4,0.0071);
		put(-2.3,0.0094);
		put(-2.2,0.0122);
		put(-2.1,0.0158);
		put(-2.0,.0202);
		put(-1.9,0.0256);
		put(-1.8,0.0322);
		put(-1.7,0.0401);
		put(-1.6,0.0495);
		put(-1.5,0.0606);
		put(-1.4,0.0735);
		put(-1.3,0.0885);
		put(-1.2,0.1056);
		put(-1.1,0.1251);
		put(-1.0,0.1469);
		put(-0.9,0.1711);
		put(-.8,0.1977);
		put(-.7,0.2266);
		put(-.6,0.2578);
		put(-.5,0.2912);
		put(-.4,0.3264);
		put(-.3,0.3632);
		put(-.2,0.4013);
		put(-.1,0.4404);
		put(-0.0,0.4801);
		put(0.0,0.5199);
		put(0.1,0.5596);
		put(0.2,0.5987);
		put(0.3,0.6368);
		put(0.4,0.6736);
		put(.5,0.7088);
		put(.6,0.7422);
		put(.7,0.7734);
		put(0.8,0.8023);
		put(.9,0.8289);
		put(1.0,0.8531);
		put(1.1,0.8749);
		put(1.2,0.8944);
		put(1.3,0.9115);
		put(1.4,0.9265);
		put(1.5,0.9394);
		put(1.6,0.9505);
		put(1.7,0.9599);
		put(1.8,0.9678);
		put(1.9,0.9744);
		put(2.0,0.9798);
		put(2.1,0.9842);
		put(2.2,0.9878);
		put(2.3,0.9906);
		put(2.4,0.9929);
		put(2.5,0.9946);
		put(2.6,0.9960);
		put(2.7,0.9970);
		put(2.8,0.9978);
		put(2.9,0.9984);
		put(3.0,0.9989);
		put(3.1,0.9992);
		put(3.2,0.9994);
		put(3.3,0.9996);
		put(3.4,0.9997);


	}};
	private double getInterPolatedNValue(double n)
	{
		double nValue;
		Set<Double> keySet=NTable.keySet();
		Iterator<Double> setIterator = keySet.iterator();
		Double lower = 0.0;
		Double higher = 0.0;
		while(setIterator.hasNext())
		{
			Double value = setIterator.next();
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
	

		double lowerValue=  NTable.get(lower);
		double higherValue =  NTable.get(higher);

		nValue = lowerValue+((higherValue-lowerValue)*((n-lower)/(higher-lower)));
		


		return nValue;
	}
	public double getNValue(double n)
	{
		double nValue = 0;


		if(NTable.containsKey(n))
		{
			nValue=NTable.get(n);
		}
		else
		{
			nValue=getInterPolatedNValue(n);
		}




		return nValue;

	}

}
