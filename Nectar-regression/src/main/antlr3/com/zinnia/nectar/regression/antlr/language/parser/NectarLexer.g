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

lexer grammar NectarLexer;

@lexer::header  {
package com.zinnia.nectar.regression.antlr.language.parser;
}
LEFT_PAREN  : '(';

RIGHT_PAREN : ')';

FORWARDSLASH : '/';

HELP  : '?' | 'help'| 'HELP';

SIGMAX  : 'sigmax';

SIGMAXY : 'sigmaxy';

SIGMAXSQUARE : 'sigmaxsquare';

MEAN : 'mean';

CORR : 'corr';

CORRMATRIX :'corrmatrix';

MULTIPLEREG : 'multiplereg';

FORWARDSELECTION : 'forwardselection';

SORT : 'sort';

COV: 'cov';

COVMATRIX : 'covmatrix';

STDIN_OP :  '<<';

DOT : '.';

COMMA : ',';

EXTN  : ('csv' | 'txt');

NEWLINE : ('\r'? '\n')+;

ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'.'|'a'..'z'|'A'..'Z')*
    ;

   
fragment FLOAT  : INT '.' '0'..'9'+;

fragment SPACE  : ' ' | '\t';

WHITESPACE  : SPACE+ { $channel = HIDDEN; };

SINGLE_COMMENT  : '//' ~('\r' | '\n')* NEWLINE { skip(); };

MULTI_COMMENT options { 
greedy = false;
 }
    : '/*' .* '*/' NEWLINE? { skip(); };
    
INT : '0'..'9'+
    ;
 
DOUBLE : ('0'..'9')* '.' ('0'..'9')+ | ('0'..'9')+
    ;