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

parser grammar NectarParser;

options {
  language = Java;
  output = AST;
  tokenVocab = NectarLexer;
  
}
tokens {
TOK_SIGMAX;
TOK_SIGMAXY;
TOK_SIGMAXSQUARE;
TOK_MEAN;
TOK_CORR;
TOK_CORRMATRIX;
TOK_MULTIPLEREG;
TOK_FORWARDSELECTION;
TOK_SORT;
TOK_COV;
TOK_COVMATRIX;
TOK_HELP;
}

@header {
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
  List<String> filenameList = new ArrayList<String>();
    IPrimitiveType primitiveImpl; 
  ComplexTypeImpl complexTypeImpl = new ComplexTypeImpl();  
	
	//error handling
Stack paraphrases = new Stack();
public String getErrorMessage(RecognitionException e,
String[] tokenNames)
{
String msg = super.getErrorMessage(e, tokenNames);
if ( paraphrases.size()>0 ) {
String paraphrase = (String)paraphrases.peek();
msg = msg+" "+paraphrase;
}
return msg;
}
}



start : statement EOF!
       ;
statement : sigmax | sigmaxy | sigmaxsquare | mean |correlation | correlationmatrix | multiplereg | forwardselection | sort | cov | covmatrix | help
          ;
          
sigmax  
@init { paraphrases.push("\n"+"USAGE :sigmax(column_no)<<input_file"+"\n"+"Type [HELP|help|?] for usage of all commands"); }
@after { paraphrases.pop(); }
: SIGMAX LEFT_PAREN column_no=INT RIGHT_PAREN STDIN_OP ip=ID-> ^(TOK_SIGMAX $column_no $ip)     
    |
  SIGMAX LEFT_PAREN column_no=INT RIGHT_PAREN STDIN_OP directory=ID (filenameList+=FORWARDSLASH filenameList+=ID)+ -> ^(TOK_SIGMAX $column_no $directory ($filenameList $filenameList)+)
 ;


sigmaxy
@init { paraphrases.push("\n"+"USAGE :sigmaxy(column_no1,column_no2)<<input_file"+"\n"+"Type [HELP|help|?] for usage of all commands"); }
@after { paraphrases.pop(); }
: SIGMAXY LEFT_PAREN column_x=INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip=ID -> ^(TOK_SIGMAXY $column_x $column_y $ip)
   |
   SIGMAXY LEFT_PAREN column_x=INT COMMA column_y= INT RIGHT_PAREN STDIN_OP directory=ID (filenameList+=FORWARDSLASH filenameList+=ID)+ -> ^(TOK_SIGMAXY $column_x $column_y $directory ($filenameList $filenameList)+)
    ;     
      
sigmaxsquare 
@init { paraphrases.push("\n"+"USAGE :sigmaxsquare(column_no)<<input_file"+"\n"+"Type [HELP|help|?] for usage of all commands"); }
@after { paraphrases.pop(); }
: SIGMAXSQUARE LEFT_PAREN column_x=INT RIGHT_PAREN STDIN_OP  ip=ID -> ^(TOK_SIGMAXSQUARE $column_x $ip)
    |
    SIGMAXSQUARE LEFT_PAREN column_x=INT RIGHT_PAREN STDIN_OP directory=ID (filenameList+=FORWARDSLASH filenameList+=ID)+-> ^(TOK_SIGMAXSQUARE $column_x $directory ($filenameList $filenameList)+)
      ;
      
mean 
@init { paraphrases.push("\n"+"USAGE :mean(column_no)<<input_file(total_no_of_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); }
@after { paraphrases.pop(); }
: MEAN  LEFT_PAREN column_x=INT   RIGHT_PAREN  STDIN_OP  ip=ID LEFT_PAREN total_rows=INT  RIGHT_PAREN -> ^(TOK_MEAN $column_x $ip $total_rows)
  |
  MEAN  LEFT_PAREN column_x=INT   RIGHT_PAREN  STDIN_OP  directory=ID (filenameList+=FORWARDSLASH filenameList+=ID)+ LEFT_PAREN total_rows=INT RIGHT_PAREN -> ^(TOK_MEAN $column_x $directory ($filenameList $filenameList)+ $total_rows)
      ;
      
correlation 
@init { paraphrases.push("\n"+"USAGE :corr(column_no1,column_no2)<<input_file(total_no_of_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); }
@after { paraphrases.pop(); }
: CORR LEFT_PAREN column_x=INT COMMA column_y=INT RIGHT_PAREN STDIN_OP ip=ID LEFT_PAREN total_rows=INT  RIGHT_PAREN -> ^(TOK_CORR $column_x $column_y $ip $total_rows)
  |
   CORR LEFT_PAREN column_x=INT COMMA column_y=INT RIGHT_PAREN STDIN_OP directory=ID (filenameList+=FORWARDSLASH filenameList+=ID)+ LEFT_PAREN total_rows=INT  RIGHT_PAREN -> ^(TOK_CORR $column_x $column_y  $directory ($filenameList $filenameList)+ $total_rows)
      ;//package com.zinnia.nectar.ast.test;
      
correlationmatrix 
@init { paraphrases.push("\n"+"USAGE :corrmatrix(column_nos)<<input_file(total_no_of_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); }
@after { paraphrases.pop(); }
: CORRMATRIX LEFT_PAREN col=INT (COMMA morecol+=INT)* RIGHT_PAREN STDIN_OP ip=ID LEFT_PAREN total_rows=INT  RIGHT_PAREN-> ^(TOK_CORRMATRIX  $col $morecol* $ip $total_rows)
  |
  CORRMATRIX LEFT_PAREN col=INT (COMMA morecol+=INT)* RIGHT_PAREN STDIN_OP directory=ID (filenameList+=FORWARDSLASH filenameList+=ID)+ LEFT_PAREN total_rows=INT  RIGHT_PAREN-> ^(TOK_CORRMATRIX  $col $morecol* $directory ($filenameList $filenameList)+ $total_rows)
      ;
      
multiplereg 
@init { paraphrases.push("\n"+"USAGE :multiplereg(column_nos)<<input_file(total_no_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); }
@after { paraphrases.pop(); }
: MULTIPLEREG LEFT_PAREN col=INT (COMMA morecol+=INT)* RIGHT_PAREN STDIN_OP ip=ID LEFT_PAREN total_rows=INT  RIGHT_PAREN ->^(TOK_MULTIPLEREG $col $morecol* $ip $total_rows)
|
MULTIPLEREG LEFT_PAREN col=INT (COMMA morecol+=INT)* RIGHT_PAREN STDIN_OP  directory=ID (filenameList+=FORWARDSLASH filenameList+=ID)+ LEFT_PAREN total_rows=INT  RIGHT_PAREN ->^(TOK_MULTIPLEREG $col $morecol* $directory ($filenameList $filenameList)+ $total_rows)
      ;
        
forwardselection 
@init { paraphrases.push("\n"+"USAGE :forwardselection(column_nos)<<input_file(total_no_of_rows,level_of_significance)"+"\n"+"Type [HELP|help|?] for usage of all commands"); }
@after { paraphrases.pop(); }
: FORWARDSELECTION  LEFT_PAREN col=INT (COMMA morecol+=INT)* RIGHT_PAREN STDIN_OP ip=ID LEFT_PAREN total_rows=INT COMMA levelofsignificance=DOUBLE  RIGHT_PAREN ->^(TOK_FORWARDSELECTION $col $morecol* $ip $total_rows $levelofsignificance )
|
FORWARDSELECTION  LEFT_PAREN col=INT (COMMA morecol+=INT)* RIGHT_PAREN STDIN_OP directory=ID (filenameList+=FORWARDSLASH filenameList+=ID)+ LEFT_PAREN total_rows=INT COMMA levelofsignificance=DOUBLE  RIGHT_PAREN ->^(TOK_FORWARDSELECTION $col $morecol* $directory ($filenameList $filenameList)+ $total_rows $levelofsignificance )
      ;
        
sort 
@init { paraphrases.push("\n"+"USAGE :sort(column_no)<<input_file"+"\n"+"Type [HELP|help|?] for usage of all commands"); }
@after { paraphrases.pop(); }
: SORT  LEFT_PAREN column_no=INT RIGHT_PAREN STDIN_OP ip=ID ->^(TOK_SORT $column_no $ip ) 
|
SORT  LEFT_PAREN column_no=INT RIGHT_PAREN STDIN_OP directory=ID (filenameList+=FORWARDSLASH filenameList+=ID)+ ->^(TOK_SORT $column_no $directory ($filenameList $filenameList)+)
  ; 
    
cov 
@init { paraphrases.push("\n"+"USAGE :cov(column_no1,column_no2)<<input_file(total_no_of_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); }
@after { paraphrases.pop(); }
: COV LEFT_PAREN column_x=INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip=ID LEFT_PAREN total_rows=INT  RIGHT_PAREN-> ^(TOK_COV $column_x $column_y $ip $total_rows)
 |
 COV LEFT_PAREN column_x=INT COMMA column_y= INT RIGHT_PAREN STDIN_OP directory=ID (filenameList+=FORWARDSLASH filenameList+=ID)+ LEFT_PAREN total_rows=INT  RIGHT_PAREN-> ^(TOK_COV $column_x $column_y $directory ($filenameList $filenameList)+ $total_rows)
      ;     
        
covmatrix 
@init { paraphrases.push("\n"+"USAGE :covmatrix(column_nos)<<input_file(total_no_of_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); }
@after { paraphrases.pop(); }
: COVMATRIX  LEFT_PAREN col=INT (COMMA morecol+=INT)* RIGHT_PAREN STDIN_OP ip=ID LEFT_PAREN total_rows=INT  RIGHT_PAREN-> ^(TOK_COVMATRIX  $col $morecol* $ip $total_rows)
 |
 COVMATRIX  LEFT_PAREN col=INT (COMMA morecol+=INT)* RIGHT_PAREN STDIN_OP directory=ID (filenameList+=FORWARDSLASH filenameList+=ID)+ LEFT_PAREN total_rows=INT  RIGHT_PAREN-> ^(TOK_COVMATRIX  $col $morecol* $directory ($filenameList $filenameList)+ $total_rows)
      ;
          
help : HELP terminator 
    ;

terminator: NEWLINE | EOF
      ;   
    
    