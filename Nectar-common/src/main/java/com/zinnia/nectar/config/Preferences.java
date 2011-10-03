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

package com.zinnia.nectar.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * Preferences for Nectar API
 *
 */
public class Preferences {
	public static int NO_OF_PARALLEL_JOBS;
	public static void init()
	{
		Properties properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream("configuration.cfg");
			try {
				properties.load(fis);
				if(properties.getProperty("NO_OF_PARALLEL_JOBS")!=null)
				{
					NO_OF_PARALLEL_JOBS=Integer.parseInt(properties.getProperty("NO_OF_PARALLEL_JOBS"));
				}
				else
				{
					NO_OF_PARALLEL_JOBS=4;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
