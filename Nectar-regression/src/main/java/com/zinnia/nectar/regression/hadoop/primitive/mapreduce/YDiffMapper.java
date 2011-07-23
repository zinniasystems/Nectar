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

package com.zinnia.nectar.regression.hadoop.primitive.mapreduce;

import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;





public class YDiffMapper<K,V> extends Mapper<K,V,Text,DoubleWritable>{
	private String[] paramValues;
	@Override
	protected void map(K key, V value,
			Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 String columnValues [] = value.toString().split("\t");
		 double yCapValue = 0;
		 double constant = Double.parseDouble(paramValues[0]);
		 yCapValue+=constant;
		 for(int i=0;i<columnValues.length-1;i++)
		 {
			double val = Double.parseDouble(columnValues[i]);
			double paramValue = Double.parseDouble(paramValues[i+1]);
			yCapValue+=(val*paramValue);
		 }
		 double yValue = Double.parseDouble(columnValues[columnValues.length-1]);
		 double yDiffValue = yCapValue-yValue;
		 double yDiffSquare = yDiffValue * yDiffValue;
		 context.write(new Text("ydiff"),new DoubleWritable(yDiffSquare));
	}

	@Override
	protected void setup(Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		paramValues = context.getConfiguration().getStrings("paramValues");
	}
	

}
