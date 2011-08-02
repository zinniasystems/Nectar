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

package com.zinnia.nectar.regression.language.shell;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import jline.ConsoleReader;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import com.zinnia.nectar.regression.antlr.language.parser.PrimitiveGrammarLexer;
import com.zinnia.nectar.regression.antlr.language.parser.PrimitiveGrammarParser;
/**
 * 
 * Command line interface for the Nectar
 *
 */
public class CommandShell {
	public static void main(String args[]) throws IOException
	{
		
		//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		ConsoleReader consoleReader = new ConsoleReader();
		consoleReader.setDefaultPrompt("nectar>");
		String command;
		while(true)
		{
			try {
				
				command=consoleReader.readLine();
				if(command.equals("exit"))
				{
					System.exit(0);
				}
//				else if(command.equals("help"))
//				{
//					System.out.println("See command shell manual for available functions");
//				}
				else if(command.equals("version"))
				{
					System.out.println("Nectar version 0.0.1");
				}
				else{
					ByteArrayInputStream byteArray = new ByteArrayInputStream(command.getBytes(Charset.defaultCharset()));

					PrimitiveGrammarLexer lex = new PrimitiveGrammarLexer(new ANTLRInputStream(byteArray));
					CommonTokenStream tokens = new CommonTokenStream(lex);

					PrimitiveGrammarParser g = new PrimitiveGrammarParser(tokens);
					try {
						g.start();		
					} catch (RecognitionException e) {
						e.printStackTrace();
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
