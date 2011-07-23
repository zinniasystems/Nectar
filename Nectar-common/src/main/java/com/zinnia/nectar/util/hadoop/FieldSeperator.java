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

package com.zinnia.nectar.util.hadoop;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;

/*
 * This class is a common utility class to seperate the fields from input file
 */
public class FieldSeperator {



	public static class FieldSeperationMapper extends Mapper<LongWritable,Text,NullWritable,Text>
	{
		String fields[] ;
		public void map(LongWritable key,Text value,Context context) throws IOException,InterruptedException
		{

			String[] inputFields = value.toString().split("\t");
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append(inputFields[Integer.parseInt(fields[0])-1]);
			for(int i=1;i<fields.length;i++)
			{
				int index=Integer.parseInt(fields[i])-1;
				stringBuffer.append("\t"+inputFields[index]);
			}
			context.write(NullWritable.get(),new Text(stringBuffer.toString()));

		}

		@Override
		protected void setup(Context context)
		throws IOException, InterruptedException {

			String fieldString = context.getConfiguration().get("fields.spec");
			splitFields(fieldString);
		}

		private void splitFields(String fieldString)
		{

			if(!fieldString.contains(",")) //only one field
			{
				fields= new String[1];
				fields[0]=fieldString;
			}
			else
			{
				fields=fieldString.split(",");
			}
		}

	}

	public static class FileSeperationReducer extends Reducer<NullWritable,Text,NullWritable,Text>
	{
		protected void reduce(NullWritable key, Iterable<Text> values,
				Context context)
		throws IOException, InterruptedException {
		
			Iterator<Text> iterator = values.iterator();

			while(iterator.hasNext())
			{
				context.write(NullWritable.get(),iterator.next());
			}
		}


	}



}
