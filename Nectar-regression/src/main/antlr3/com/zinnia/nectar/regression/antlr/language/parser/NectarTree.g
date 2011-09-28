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

tree grammar NectarTree;

options {
  language = Java;
  output = AST;
  tokenVocab = NectarParser;
  ASTLabelType = CommonTree;
 }

tokens {
TOK_SIGMAX;
TOK_SIGMAXY;
TOK_SIGMAXSQUARE;
TOK_CORR;
TOK_MEAN;
TOK_CORRMATRIX;
TOK_MULTIPLEREG;
TOK_FORWARDSELECTION;
TOK_COV;
TOK_COVMATRIX;
TOK_HELP;

}

@header {
//package com.zinnia.nectar.ast.test;
package com.zinnia.nectar.regression.antlr.language.parser;

import com.zinnia.nectar.regression.language.primitive.PrimitiveTypeImplFactory;
import com.zinnia.nectar.regression.language.primitive.IPrimitiveType;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.zinnia.nectar.regression.language.complex.impl.ComplexTypeImpl ;

}


@members { 

List<Integer> list = new ArrayList<Integer>();
IPrimitiveType primitiveImpl; 
ComplexTypeImpl complexTypeImpl = new ComplexTypeImpl();  

  private static void outln(Object obj) {
    System.out.println(obj);
  }
 
}

start : statement  
       ;
statement : sigmax | sigmaxy | sigmaxsquare| mean  |correlation | correlationmatrix | multiplereg | forwardselection |sort | cov | covmatrix |help
          ;
          
sigmax 
:  ^(TOK_SIGMAX column_no=INT ip=ID )  { 
                       primitiveImpl=PrimitiveTypeImplFactory.getInstance($ip.text);
                        Future<Double> value=primitiveImpl.sigmax($ip.text,Integer.parseInt($column_no.text));
                           try
                              {
                                   outln("Sigmax:"+value.get());
                                   }
                                   catch(Exception e)
                                   {
                                    System.out.println("Sigma Job terminated due to exception. Check nectar logs for more information");
                                   }
                             
                       }     
      ;
sigmaxy : ^(TOK_SIGMAXY column_x=INT column_y=INT ip=ID) { 
                         primitiveImpl=PrimitiveTypeImplFactory.getInstance($ip.text);
                         Future<Double> value=primitiveImpl.sigmaxy($ip.text,Integer.parseInt($column_x.text),Integer.parseInt($column_y.text)); 
                       try
                              {
                                    System.out.println("Sigmaxy:"+value.get());  
                                   }
                                   catch(Exception e)
                                   {
                                      System.out.println("SigmaXY Job terminated due to exception. Check nectar logs for more information");
                                   }
                         }
      ;   
sigmaxsquare : ^(TOK_SIGMAXSQUARE column_x=INT ip=ID) {
                           primitiveImpl=PrimitiveTypeImplFactory.getInstance($ip.text);
                           Future<Double> value=primitiveImpl.sigmaxSquare($ip.text,Integer.parseInt($column_x.text)); 
                           try
                              {
                                    System.out.println("Sigmaxsquare:"+value.get());  
                                   }
                                   catch(Exception e)
                                   {
                                      System.out.println("Sigmaxsquare Job terminated due to exception. Check nectar logs for more information");
                                   }


                          }
      ;   
      
mean :  ^(TOK_MEAN column_x=INT ip=ID total_rows=INT)  {
                             primitiveImpl=PrimitiveTypeImplFactory.getInstance($ip.text);
                             Future<Double> value=primitiveImpl.mean($ip.text,Integer.parseInt($column_x.text),Integer.parseInt($total_rows.text));
                               try
                              {
                                    System.out.println("Mean:"+value.get());  
                                   }
                                   catch(Exception e)
                                   {
                                      System.out.println("Mean Job terminated due to exception. Check nectar logs for more information");
                                   }

            }
      ;

correlation : ^(TOK_CORR column_x=INT column_y=INT ip=ID total_rows=INT) {
                   Future<Double> value=complexTypeImpl.correlation($ip.text,Integer.parseInt($column_x.text),Integer.parseInt($column_y.text),Integer.parseInt($total_rows.text)); 
                    try  {
                                   System.out.println("correlation:"+value.get());  
                           }
                    catch(Exception e)
                                   {
                                   }
                    }
      ;

correlationmatrix: ^(TOK_CORRMATRIX col=INT morecol+=INT* ip=ID total_rows=INT) {
                    list.add(Integer.parseInt($col.text));
                      for(Object object : $morecol)
                      {
                       
                        CommonTree commonTree = (CommonTree) object;
                          String colValue = commonTree.token.getText();
                          list.add(Integer.parseInt(colValue));
                   
                      }
                      
                        Future<Double[][]> value=complexTypeImpl.correlationmatrix($ip.text,list,Integer.parseInt($total_rows.text)); 
                       try 
                              {
                                  Double[][] matrix=value.get(); 
                                  System.out.println("Correlation matrix:"); 
                                  for(int i=0;i<list.size();i++)
                                   {
                                   for(int j=0;j<list.size();j++)
                                   {
                                       System.out.print(matrix[i][j] + "\t");
                                   }
                                    System.out.println();
                                   }  
                                   }
                                   catch(Exception e)
                                   { 
                                   e.printStackTrace();
                                   }
 
 }    
    ;
    
multiplereg : ^(TOK_MULTIPLEREG col=INT morecol+=INT* ip=ID total_rows=INT)       {
                  list.add(Integer.parseInt($col.text));
                      for(Object object : $morecol)
                      {
                       
                        CommonTree commonTree = (CommonTree) object;
                          String colValue = commonTree.token.getText();
                          list.add(Integer.parseInt(colValue));
                   
                      }
                        Future<Map<Integer,Double>> value=complexTypeImpl.multipleregression($ip.text,list,Integer.parseInt($total_rows.text));
                          try{
                          System.out.print(value.get().values());
                          }
                          catch(Exception e)
                          {
                           e.printStackTrace();
                          }
  }   
  ;  
 
 forwardselection : ^(TOK_FORWARDSELECTION col=INT morecol+=INT* ip=ID total_rows=INT levelofsignificance=DOUBLE ) {
                              list.add(Integer.parseInt($col.text));
                      for(Object object : $morecol)
                      {
                       
                        CommonTree commonTree = (CommonTree) object;
                          String colValue = commonTree.token.getText();
                          list.add(Integer.parseInt(colValue));
                   
                      }
                      
                       complexTypeImpl.forwardSelection($ip.text,list,Integer.parseInt($total_rows.text),Double.parseDouble($levelofsignificance.text));
                       
        
        
        }
 ; 
 
sort :^(TOK_SORT column_no=INT ip=ID )  {

                         primitiveImpl=PrimitiveTypeImplFactory.getInstance($ip.text);
                        Future<Double[]> value=primitiveImpl.sort($ip.text,Integer.parseInt($column_no.text));
                                   try {Double[] sortArray=value.get(); 
                                  System.out.println("Sort:"); 
                                  for(int i=0;i<sortArray.length;i++) {
                                  outln(sortArray[i]);
                                  }
                                  }
                                   catch(Exception e)
                                   { 
                                   outln("Sort Job terminated due to exception. Check nectar logs for more information");
                                  }
                        
                       }     
      ;
 
 cov : ^(TOK_COV column_x=INT column_y=INT ip=ID total_rows=INT) {
            Future<Double> value=complexTypeImpl.covariance($ip.text,Integer.parseInt($column_x.text),Integer.parseInt($column_y.text),Integer.parseInt($total_rows.text)); 
                    try  {
                                   System.out.println("Covariance:"+value.get());  
                           }
                    catch(Exception e)
                                   {
                                   }
 
      
      
      }
      ;     
        
covmatrix : ^(TOK_COVMATRIX  col=INT morecol+=INT* ip=ID total_rows=INT)  {
                         list.add(Integer.parseInt($col.text));
                      for(Object object : $morecol)
                      {
                       
                        CommonTree commonTree = (CommonTree) object;
                          String colValue = commonTree.token.getText();
                          list.add(Integer.parseInt(colValue));
                   
                      }
                      
                        Future<Double[][]> value=complexTypeImpl.covariancematrix($ip.text,list,Integer.parseInt($total_rows.text)); 
                       try 
                              {
                                  Double[][] matrix=value.get(); 
                                  System.out.println("Covariance matrix:"); 
                                  for(int i=0;i<list.size();i++)
                                   {
                                   for(int j=0;j<list.size();j++)
                                   {
                                       System.out.print(matrix[i][j] + "\t");
                                   }
                                    System.out.println();
                                   }  
                                   }
                                   catch(Exception e)
                                   { 
                                   e.printStackTrace();
                                   }
         }
      ;
 
      
help : HELP terminator  {
      outln("Usage of the commands are as follows:");
      outln("1.sigmax"+"\n"+"sigmax(column_no)<<input_file"+"\n"+"2.sigmaxsquare"+"\n"+"sigmaxsquare(column_no)<<input_file");
      outln("3.sigmaxy"+"\n"+"sigmaxy(column_no1,column_no2)<<input_file"+"\n"+"4.mean"+"\n"+"mean(column_no)<<input_file(total_no_of_rows)"); 
      outln("5.correlation"+"\n"+"corr(column_no1,column_no2)<<input_file(total_no_of_rows)"+"\n"+"6.correlation matrix");
      outln("corrmatrix(column_nos)<<input_file(total_no_of_rows)"+"\n"+"7.multiple regression"+"\n"+"multiplereg(column_nos)<<input_file(total_no_of_rows)");
      outln("8.forward selection"+"\n"+"forwardselection(column_nos)<<input_file(total_no_of_rows,level_of_significance)"+"\n"+"9.sort"+"\n"+"sort(column_no)<<input_file"+"\n"+"10.covariance"+"\n"+"cov(column_no1,column_no2)<<input_file(total_no_of_rows)");
      outln("11.covariance matrix"+"\n"+"covmatrix(column_nos)<<input_file(total_no_of_rows)");
      outln("NOTE: The tab separated input_file must be in hdfs"); 
      }
    ;
terminator: NEWLINE | EOF
      ;   
    
    