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


package com.zinnia.antlr.language.parser;
import com.zinnia.nectar.regression.language.primitive.PrimitiveTypeImplFactory;
import com.zinnia.nectar.regression.language.primitive.IPrimitiveType;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.zinnia.nectar.regression.language.complex.impl.ComplexTypeImpl ;
}


@lexer::header
{
package com.zinnia.antlr.language.parser;
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
}



start 	: ('sigmax') '(' INT ')' '<<' input		{ n=Integer.parseInt($INT.text);
												
											
												
										        primitiveImpl=PrimitiveTypeImplFactory.getInstance(ip);
						                        Future<Double> value=primitiveImpl.sigmax(ip,n);
						                        
						                  try
						                  {
      						                 System.out.println("Sigmax is "+value.get());
      						                 }
      						                 catch(Exception e)
      						                 {
      						                 }
						                 }
								
		| ('sigmaxsquare') '(' INT ')' '<<' input  { 	 n=Integer.parseInt($INT.text);
									  
								
								             primitiveImpl=PrimitiveTypeImplFactory.getInstance(ip);
								             Future<Double> value=primitiveImpl.sigmaxSquare(ip,n); 
											 try
						                  {
      						                  System.out.println("Sigmax square is "+value.get());  
      						                 }
      						                 catch(Exception e)
      						                 {
      						                 }
						                 }
								
		| ('sigmaxy') '(' INT			{   x=Integer.parseInt($INT.text);}
					xypart				{
										     primitiveImpl=PrimitiveTypeImplFactory.getInstance(ip);
					                        Future<Double> value=primitiveImpl.sigmaxy(ip,x,y); 
											 try
						                  {
      						                  System.out.println("Sigmaxy is "+value.get());  
      						                 }
      						                 catch(Exception e)
      						                 {
      						                 }
						                 }
									
		| ('mean') '(' INT 				 {   cn=Integer.parseInt($INT.text);}
				 ')' 
				  idpart                  {
				  					       primitiveImpl=PrimitiveTypeImplFactory.getInstance(ip);
				                            Future<Double> value=primitiveImpl.mean(ip,cn,n);
				  										 try
						                  {
      						                  System.out.println("mean is "+value.get());  
      						                 }
      						                 catch(Exception e)
      						                 {
      						                 }
						                 }
				  
		 | ( 'corr') '(' INT 		{ x=Integer.parseInt($INT.text);}
					xypart				
				'(' npart	')'			{
					
					
					                       Future<Double> value=complexTypeImpl.correlation(ip,x,y,nn); 
											 try
						                  {
      						                 System.out.println("correlation is "+value.get());  
      						                 }
      						                 catch(Exception e)
      						                 {
      						                 }
						                 }
						                
												                 
     
    			| ( 'corrmatrix' )  			
    	
    			  	'('   INT 				{ list.add(Integer.parseInt($INT.text));   }
     	 		
  		  	 		 ','
     	
     			ofpart
     			
     			
     			| ( 'multiplereg')     
     				
     				'('  INT					  { list.add(Integer.parseInt($INT.text));   }
     	 		
     	 		','
     	 		
     	 		mulregpart
     	 		
     	 		| ( 'forwardselection')
     	 			'(' INT						 { list.add(Integer.parseInt($INT.text));   }
     	 				','
     	 		forwardpart
     	 		;
     			
     			
     			
   ofpart :  		  INT		{  list.add(Integer.parseInt($INT.text));}
     	  
     				  morecol
     	  
     				  idpart               { 
     	                                    
     	  									Future<Double[][]> value=complexTypeImpl.correlationmatrix(ip,list,n); 
											 try
						                  {
						             
						                  
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
					
					 
mulregpart	:		  INT		{  list.add(Integer.parseInt($INT.text));}
     	  
     				  morecol
     	  
     				  idpart             {
     	  
     				                       
     	                                    
     	  									Future<Map<Integer,Double>> values=complexTypeImpl.multipleregression(ip,list,n);
     	  									try{
     	  									 System.out.println("Regression Equation is ");
     	  									  System.out.println("Constant = "+values.get(0));
     	  									  for( int i=0;i<list.size()-1;i++)
     	  									   {
     	  									   	int column = list.get(i);
     	  									   	System.out.println(column+" variable value = "+values.get(column);
     	  									   	
     	  									   }
     	  									 
     	  									}
     	  									catch(Exception e)
     	  									{
     	  									
     	  									}
     	  									 
      						  		      }       
      				;
					
					 
forwardpart	:		  INT		{  list.add(Integer.parseInt($INT.text));}
					     	  
					     				  morecol
					     	  
					     				  levelofsignificance  {
					     	  
					     				                        
					     	                                    
					     	  									complexTypeImpl.forwardSelection(ip,list,n,level);
					     	  									 
					      						  		      }       
					      						          
					     ;

morecol 	:	')'
				
				|
				
				','
				
				INT			{ list.add(Integer.parseInt($INT.text)); }
				
				morecol
				;				 
			
		  
xypart 	:  ',' INT  ')' '<<' input			{   y=Integer.parseInt($INT.text);
								  
								}
	;
	
	
npart	: INT 				{  nn=Integer.parseInt($INT.text); }
	;						  
				  
				  
idpart	:	 '<<' input  '(' INT ')' 					{  n=Integer.parseInt($INT.text);
											//  
								
				}
				;
	
levelofsignificance : '<<' input  '(' INT  ',' 					{  n=Integer.parseInt($INT.text); }
				 DOUBLE  ')'				{ level = Double.parseDouble($DOUBLE.text);  }
				 ;

out		:	'>>' 	ID  		{  		op= $ID.text;  }
		;
	
	


ext		: 	 ID 			{  extn = $ID.text; }
		;
		
		
input 		: ID     {		ip=$ID.text;}
			|
			ID   '.'		{  ip=$ID.text;}
			
			ext
			;
		
		
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'.'|'a'..'z'|'A'..'Z')*
    ;

INT :	'0'..'9'+
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
