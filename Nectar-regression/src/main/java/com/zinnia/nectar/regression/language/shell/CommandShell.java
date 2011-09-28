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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import jline.ConsoleReader;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.TreeIterator;
import org.antlr.stringtemplate.StringTemplate;

import com.zinnia.nectar.regression.antlr.language.parser.NectarLexer;
import com.zinnia.nectar.regression.antlr.language.parser.NectarParser;
import com.zinnia.nectar.regression.antlr.language.parser.NectarTree;

/**
 * 
 * Command line interface for the Nectar
 *
 */
public class CommandShell {
	public static void main(String args[]) throws Exception
	{
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
				else if(command.equals(""))
				{
					System.out.println("Type [HELP|help|?] for the usage of commands");
				}
				else if(command.equals("version"))
				{
					System.out.println("Nectar version 0.0.1");
				}
				else{
					ByteArrayInputStream byteArray = new ByteArrayInputStream(command.getBytes(Charset.defaultCharset()));

					
					NectarLexer lexer = new NectarLexer(new ANTLRInputStream(byteArray));
					CommonTokenStream tokens = new CommonTokenStream(lexer);
					NectarParser parser = new NectarParser(tokens); 
					NectarParser.start_return r = parser.start(); 
					CommonTree commonTree = (CommonTree)r.getTree();
					//System.out.println(commonTree.toStringTree());
					
					if ( parser.getNumberOfSyntaxErrors()<=0 ) {
						CommonTreeNodeStream nodes = new CommonTreeNodeStream(commonTree);
						TreeIterator treeIter = new TreeIterator(commonTree);
						NectarTree walker = new NectarTree(nodes);
						walker.start();
						}
//					System.out.println();
//					System.out.println("...............................");
//					DOTTreeGenerator dotTreeGenerator = new DOTTreeGenerator();
//					StringTemplate stringTemplate = dotTreeGenerator.toDOT(commonTree);
//					System.out.println(stringTemplate);
//					System.out.println("...............................");
				}
			}


			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}



