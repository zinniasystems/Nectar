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

grammar PrimitiveGrammar;



@header {


package com.zinnia.nectar.regression.antlr.language.parser;
import com.zinnia.nectar.regression.language.primitive.PrimitiveTypeImplFactory;
import com.zinnia.nectar.regression.language.primitive.IPrimitiveType;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import com.zinnia.nectar.regression.language.complex.impl.ComplexTypeImpl ;

}


@lexer::header
{
package com.zinnia.nectar.regression.antlr.language.parser;
}

@members
{
String ip,op,extn;// ip=inputfilepath  op=outputfilepath
List<Integer> list = new ArrayList<Integer>();
int n,cn,x,y,nn;     //n=no. cn=colno. x=xval y=yval nn= corr no.  
int k=0; // index
double level;
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


start :( '\n'| ' ' ) { System.out.println("Type HELP or help for usage of commands");}
      |
      sigmax
      ;

sigmax  
@init { paraphrases.push("\n"+"USAGE :sigmax(column_no)<<input_file"+"\n"+"Type HELP or help for usage of all commands"); }
@after { paraphrases.pop(); }
  : ('sigmax') '(' INT ')' '<<' input   { 
                                    
                                    try {
                                    n=Integer.parseInt($INT.text);
                                    }
                                     catch(Exception e)
                                   {
                                   }
                      
                        
                    
                                    
                              try
                              {
                               primitiveImpl=PrimitiveTypeImplFactory.getInstance(ip);
                     Future<Double> value=primitiveImpl.sigmax(ip,n);
                                   System.out.println("Sigmax is "+value.get());
                                   }
                                   catch(ExecutionException e)
                                   {
                                    System.out.println("Job terminated due to exception :"+e.getMessage());
                                   }
                             }
                
    | sigmaxsquare
    ;



sigmaxsquare
@init { paraphrases.push("\n"+"USAGE :sigmaxsquare(column_no)<<input_file"+"\n"+"Type HELP or help for usage of all commands"); }
@after { paraphrases.pop(); }

  :('sigmaxsquare') '(' INT ')' '<<' input  {    
                                 try {
                                    n=Integer.parseInt($INT.text);
                                    }
                                     catch(Exception e)
                                   {
                                   }
                    
                
                             
                       try
                              {
                              primitiveImpl=PrimitiveTypeImplFactory.getInstance(ip);
                             Future<Double> value=primitiveImpl.sigmaxSquare(ip,n); 
                                    System.out.println("Sigmax square is "+value.get());  
                                   }
                                   catch(Exception e)
                                   {
                                   }
                             }
                
    | sigmaxy
    ;
sigmaxy
@init { paraphrases.push("\n"+"USAGE :sigmaxy(column_no1,column_no2)<<input_file"+"\n"+"Type HELP or help for usage of all commands"); }
@after { paraphrases.pop(); }

  :('sigmaxy') '(' INT      {   
                              
                            try {
                            x=Integer.parseInt($INT.text);
                            }
                            catch(Exception e) {
                            }
                            }
            xypart    {
                          
                       try
                              { 
                              primitiveImpl=PrimitiveTypeImplFactory.getInstance(ip);
                                  Future<Double> value=primitiveImpl.sigmaxy(ip,x,y);
                                    System.out.println("Sigmaxy is "+value.get());  
                                   }
                                   catch(Exception e)
                                   {
                                   }
                             }
                  
    |mean
    ;
mean
@init { paraphrases.push("\n"+"USAGE :mean(column_no)<<input_file(total_no_of_rows)"+"\n"+"Type HELP or help for usage of all commands"); }
@after { paraphrases.pop(); }

  : ('mean') '(' INT         {  try { cn=Integer.parseInt($INT.text);} catch(Exception e) { } }
         ')' 
          idpart                  {
                           
                               try
                              {     
                                primitiveImpl=PrimitiveTypeImplFactory.getInstance(ip);
                                    Future<Double> value=primitiveImpl.mean(ip,cn,n);
                                    System.out.println("mean is "+value.get());  
                                   }
                                   catch(Exception e)
                                   {
                                   }
                             }
          
     | corr
    ;


corr
@init { paraphrases.push("\n"+"USAGE :corr(column_no1,column_no2)<<input_file(total_no_of_rows)"+"\n"+"Type HELP or help for usage of all commands"); }
@after { paraphrases.pop(); }

  :( 'corr') '(' INT    { try {x=Integer.parseInt($INT.text);} catch(Exception e) { }}
          xypart        
        '(' npart ')'     {
          
          
                                 
                       try
                              {  Future<Double> value=complexTypeImpl.correlation(ip,x,y,nn);
                                   System.out.println("correlation is "+value.get());  
                                   }
                                   catch(Exception e)
                                   {
                                   }
                             }
                            
                                         
     
          | corrmatrix
      ;
corrmatrix  
@init { paraphrases.push("\n"+"USAGE :corrmatrix(column_nos)<<input_file(total_no_of_rows)"+"\n"+"Type HELP or help for usage of all commands"); }
@after { paraphrases.pop(); }


  :( 'corrmatrix' )       
      
              '('   INT         { try { list.add(Integer.parseInt($INT.text));   } catch(Exception e) { } }
          
               ','
      
          ofpart
          
          
          |multiplereg
      ;

multiplereg 
@init { paraphrases.push("\n"+"USAGE :multiplereg(column_nos)<<input_file(total_no_rows)"+"\n"+"Type HELP or help for usage of all commands"); }
@after { paraphrases.pop(); }


  : ( 'multiplereg')     
            
            '('  INT            { try { list.add(Integer.parseInt($INT.text));   } catch(Exception e) { } }
          
          ','
          
          mulregpart
          
          | forwardselection
      ;


forwardselection
@init { paraphrases.push("\n"+"USAGE :forwardselection(column_nos)<<input_file(total_no_of_rows,level_of_significance)"+"\n"+"Type HELP or help for usage of all commands"); }
@after { paraphrases.pop(); }


  :( 'forwardselection')
            '(' INT            { try { list.add(Integer.parseInt($INT.text));   } catch(Exception e) { } }
              ','
          forwardpart
      |
      help
          ;
          
  

help

  

  :  ('HELP' |'help')    {
    System.out.println("\n"+"Usage of the commands are as follows:"+"\n"+"1.sigmax"+"\n"+"sigmax(column_no)<<input_file"+"\n"+"2.sigmaxsquare"+"\n"+"sigmaxsquare(column_no)<<input_file"+"\n"+"3.sigmaxy"+"\n"+"sigmaxy(column_no1,column_no2)<<input_file"+"\n"+"4.mean"+"\n"+"mean(column_no)<<input_file(total_no_of_rows)"+"\n"+"5.correlation"+"\n"+"corr(column_no1,column_no2)<<input_file(total_no_of_rows)"+"\n"+"6.correlation matrix"+"\n"+"corrmatrix(column_nos)<<input_file(total_no_of_rows)"+"\n"+"7.multiple regression"+"\n"+"multiplereg(column_nos)<<input_file(total_no_of_rows)"+"\n"+"8.forward selection"+"\n"+"forwardselection(column_nos)<<input_file(total_no_of_rows,level_of_significance)"+"\n"+"NOTE: The tab separated input_file must be in hdfs"+"\n"); 
            } 
  ;         
          


ofpart :        INT   { try { list.add(Integer.parseInt($INT.text));} catch(Exception e) { } }
        
              morecol
        
              idpart               { 
                                          
                           
                       try
                              {
                                
                                Future<Double[][]> value=complexTypeImpl.correlationmatrix(ip,list,n);
                              
                                Double[][] matrix=value.get(); 
                               
                                  System.out.println("Correlation matrix is"); 
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
                                   }
                     }
      
            ;    
          
           
mulregpart  :     INT    { try { list.add(Integer.parseInt($INT.text));} catch(Exception e) { } }
        
              morecol
        
              idpart             {
                                  
                                  
                          try{
                          Future<Map<Integer,Double>> value=complexTypeImpl.multipleregression(ip,list,n);
                          System.out.print(value.get().values());
                          }
                          catch(Exception e)
                          {
                          
                          }
                                   
                                          
                                 }       
              ;
          
           
forwardpart :     INT    { try { list.add(Integer.parseInt($INT.text));} catch(Exception e) { } }
                  
                        morecol
                  
                        levelofsignificance  {
                  
                                              
                                                    
                      complexTypeImpl.forwardSelection(ip,list,n,level);
                                     
                                        }       
                                      
               ;

morecol   : ')'
        
        |
        
        ','
        
        INT      { try { list.add(Integer.parseInt($INT.text));} catch(Exception e) { } }
        
        morecol
        ;        
      
      
xypart  :  ',' INT  ')' '<<' input      { try {  y=Integer.parseInt($INT.text); } catch(Exception e) { }
                  
                }
  ;
  
  
npart : INT         { try { nn=Integer.parseInt($INT.text); } catch(Exception e) { }}
  ;             
          
          
idpart  :  '<<' input  '(' INT ')'          { try { n=Integer.parseInt($INT.text); } catch(Exception e) { }
                    
        }
        ;
  
levelofsignificance : '<<' input  '(' INT  ','          { try { n=Integer.parseInt($INT.text); }catch(Exception e) { } }
         DOUBLE  ')'        {try { level = Double.parseDouble($DOUBLE.text);  } catch(Exception e) { } }
         ;

out   : '>>'  ID      {    try { op= $ID.text;  } catch(Exception e) { } }
    ;
  
  


ext   :    ID       { try { extn = $ID.text; } catch(Exception e) { } }
    ;
    
    
input     : ID     {  try {  ip=$ID.text;} catch(Exception e) { } }
      |
      ID   '.'    {  try {ip=$ID.text;}catch(Exception e) { } }
      
      ext
      ;
    
    
ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'.'|'a'..'z'|'A'..'Z')*
    ;

INT : '0'..'9'+
    ;

      
DOUBLE : ('0'..'9')* '.' ('0'..'9')+ | ('0'..'9')+
    ;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '\'' ( ESC_SEQ | ~('\\'|'\'') )* '\''
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
