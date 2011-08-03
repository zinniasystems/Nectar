// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g 2011-08-03 12:27:36



package com.zinnia.nectar.regression.antlr.language.parser;
import com.zinnia.nectar.regression.language.primitive.PrimitiveTypeImplFactory;
import com.zinnia.nectar.regression.language.primitive.IPrimitiveType;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.zinnia.nectar.regression.language.complex.impl.ComplexTypeImpl ;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
public class PrimitiveGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "DOUBLE", "ID", "WS", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'\\n'", "' '", "'sigmax'", "'('", "')'", "'<<'", "'sigmaxsquare'", "'sigmaxy'", "'mean'", "'corr'", "'corrmatrix'", "','", "'multiplereg'", "'forwardselection'", "'HELP'", "'help'", "'>>'", "'.'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int UNICODE_ESC=11;
    public static final int T__20=20;
    public static final int OCTAL_ESC=12;
    public static final int HEX_DIGIT=10;
    public static final int INT=4;
    public static final int ID=6;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int ESC_SEQ=8;
    public static final int WS=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int DOUBLE=5;
    public static final int STRING=9;

    // delegates
    // delegators


        public PrimitiveGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PrimitiveGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PrimitiveGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g"; }


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





    // $ANTLR start "start"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:69:1: start : ( ( '\\n' | ' ' ) | sigmax );
    public final void start() throws RecognitionException {
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:69:7: ( ( '\\n' | ' ' ) | sigmax )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=13 && LA1_0<=14)) ) {
                alt1=1;
            }
            else if ( (LA1_0==15||(LA1_0>=19 && LA1_0<=23)||(LA1_0>=25 && LA1_0<=28)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:69:8: ( '\\n' | ' ' )
                    {
                    if ( (input.LA(1)>=13 && input.LA(1)<=14) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     System.out.println("Type HELP or help for usage of commands");

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:71:7: sigmax
                    {
                    pushFollow(FOLLOW_sigmax_in_start62);
                    sigmax();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "start"


    // $ANTLR start "sigmax"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:74:1: sigmax : ( ( 'sigmax' ) '(' INT ')' '<<' input | sigmaxsquare );
    public final void sigmax() throws RecognitionException {
        Token INT1=null;

         paraphrases.push("\n"+"USAGE :sigmax(column_no)<<input_file"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:77:3: ( ( 'sigmax' ) '(' INT ')' '<<' input | sigmaxsquare )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=19 && LA2_0<=23)||(LA2_0>=25 && LA2_0<=28)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:77:5: ( 'sigmax' ) '(' INT ')' '<<' input
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:77:5: ( 'sigmax' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:77:6: 'sigmax'
                    {
                    match(input,15,FOLLOW_15_in_sigmax92); 

                    }

                    match(input,16,FOLLOW_16_in_sigmax95); 
                    INT1=(Token)match(input,INT,FOLLOW_INT_in_sigmax97); 
                    match(input,17,FOLLOW_17_in_sigmax99); 
                    match(input,18,FOLLOW_18_in_sigmax101); 
                    pushFollow(FOLLOW_input_in_sigmax103);
                    input();

                    state._fsp--;

                     
                                                        
                                                        try {
                                                        n=Integer.parseInt((INT1!=null?INT1.getText():null));
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
                                                       catch(Exception e)
                                                       {
                                                       
                                                       }
                                                 

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:101:7: sigmaxsquare
                    {
                    pushFollow(FOLLOW_sigmaxsquare_in_sigmax132);
                    sigmaxsquare();

                    state._fsp--;


                    }
                    break;

            }
             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "sigmax"


    // $ANTLR start "sigmaxsquare"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:106:1: sigmaxsquare : ( ( 'sigmaxsquare' ) '(' INT ')' '<<' input | sigmaxy );
    public final void sigmaxsquare() throws RecognitionException {
        Token INT2=null;

         paraphrases.push("\n"+"USAGE :sigmaxsquare(column_no)<<input_file"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:110:3: ( ( 'sigmaxsquare' ) '(' INT ')' '<<' input | sigmaxy )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=20 && LA3_0<=23)||(LA3_0>=25 && LA3_0<=28)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:110:4: ( 'sigmaxsquare' ) '(' INT ')' '<<' input
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:110:4: ( 'sigmaxsquare' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:110:5: 'sigmaxsquare'
                    {
                    match(input,19,FOLLOW_19_in_sigmaxsquare160); 

                    }

                    match(input,16,FOLLOW_16_in_sigmaxsquare163); 
                    INT2=(Token)match(input,INT,FOLLOW_INT_in_sigmaxsquare165); 
                    match(input,17,FOLLOW_17_in_sigmaxsquare167); 
                    match(input,18,FOLLOW_18_in_sigmaxsquare169); 
                    pushFollow(FOLLOW_input_in_sigmaxsquare171);
                    input();

                    state._fsp--;

                        
                                                     try {
                                                        n=Integer.parseInt((INT2!=null?INT2.getText():null));
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
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:131:7: sigmaxy
                    {
                    pushFollow(FOLLOW_sigmaxy_in_sigmaxsquare199);
                    sigmaxy();

                    state._fsp--;


                    }
                    break;

            }
             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "sigmaxsquare"


    // $ANTLR start "sigmaxy"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:133:1: sigmaxy : ( ( 'sigmaxy' ) '(' INT xypart | mean );
    public final void sigmaxy() throws RecognitionException {
        Token INT3=null;

         paraphrases.push("\n"+"USAGE :sigmaxy(column_no1,column_no2)<<input_file"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:137:3: ( ( 'sigmaxy' ) '(' INT xypart | mean )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=21 && LA4_0<=23)||(LA4_0>=25 && LA4_0<=28)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:137:4: ( 'sigmaxy' ) '(' INT xypart
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:137:4: ( 'sigmaxy' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:137:5: 'sigmaxy'
                    {
                    match(input,20,FOLLOW_20_in_sigmaxy224); 

                    }

                    match(input,16,FOLLOW_16_in_sigmaxy227); 
                    INT3=(Token)match(input,INT,FOLLOW_INT_in_sigmaxy229); 
                       
                                                  
                                                try {
                                                x=Integer.parseInt((INT3!=null?INT3.getText():null));
                                                }
                                                catch(Exception e) {
                                                }
                                                
                    pushFollow(FOLLOW_xypart_in_sigmaxy250);
                    xypart();

                    state._fsp--;


                                              
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
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:158:6: mean
                    {
                    pushFollow(FOLLOW_mean_in_sigmaxy281);
                    mean();

                    state._fsp--;


                    }
                    break;

            }
             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "sigmaxy"


    // $ANTLR start "mean"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:160:1: mean : ( ( 'mean' ) '(' INT ')' idpart | corr );
    public final void mean() throws RecognitionException {
        Token INT4=null;

         paraphrases.push("\n"+"USAGE :mean(column_no)<<input_file(total_no_of_rows)"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:164:3: ( ( 'mean' ) '(' INT ')' idpart | corr )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=22 && LA5_0<=23)||(LA5_0>=25 && LA5_0<=28)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:164:5: ( 'mean' ) '(' INT ')' idpart
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:164:5: ( 'mean' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:164:6: 'mean'
                    {
                    match(input,21,FOLLOW_21_in_mean307); 

                    }

                    match(input,16,FOLLOW_16_in_mean310); 
                    INT4=(Token)match(input,INT,FOLLOW_INT_in_mean312); 
                      try { cn=Integer.parseInt((INT4!=null?INT4.getText():null));} catch(Exception e) { } 
                    match(input,17,FOLLOW_17_in_mean333); 
                    pushFollow(FOLLOW_idpart_in_mean346);
                    idpart();

                    state._fsp--;


                                               
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
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:179:8: corr
                    {
                    pushFollow(FOLLOW_corr_in_mean385);
                    corr();

                    state._fsp--;


                    }
                    break;

            }
             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "mean"


    // $ANTLR start "corr"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:183:1: corr : ( ( 'corr' ) '(' INT xypart '(' npart ')' | corrmatrix );
    public final void corr() throws RecognitionException {
        Token INT5=null;

         paraphrases.push("\n"+"USAGE :corr(column_no1,column_no2)<<input_file(total_no_of_rows)"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:187:3: ( ( 'corr' ) '(' INT xypart '(' npart ')' | corrmatrix )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23||(LA6_0>=25 && LA6_0<=28)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:187:4: ( 'corr' ) '(' INT xypart '(' npart ')'
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:187:4: ( 'corr' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:187:6: 'corr'
                    {
                    match(input,22,FOLLOW_22_in_corr413); 

                    }

                    match(input,16,FOLLOW_16_in_corr416); 
                    INT5=(Token)match(input,INT,FOLLOW_INT_in_corr418); 
                     try {x=Integer.parseInt((INT5!=null?INT5.getText():null));} catch(Exception e) { }
                    pushFollow(FOLLOW_xypart_in_corr435);
                    xypart();

                    state._fsp--;

                    match(input,16,FOLLOW_16_in_corr453); 
                    pushFollow(FOLLOW_npart_in_corr455);
                    npart();

                    state._fsp--;

                    match(input,17,FOLLOW_17_in_corr457); 

                              
                              
                                                     
                                           try
                                                  {  Future<Double> value=complexTypeImpl.correlation(ip,x,y,nn);
                                                       System.out.println("correlation is "+value.get());  
                                                       }
                                                       catch(Exception e)
                                                       {
                                                       }
                                                 

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:204:13: corrmatrix
                    {
                    pushFollow(FOLLOW_corrmatrix_in_corr554);
                    corrmatrix();

                    state._fsp--;


                    }
                    break;

            }
             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "corr"


    // $ANTLR start "corrmatrix"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:206:1: corrmatrix : ( ( 'corrmatrix' ) '(' INT ',' ofpart | multiplereg );
    public final void corrmatrix() throws RecognitionException {
        Token INT6=null;

         paraphrases.push("\n"+"USAGE :corrmatrix(column_nos)<<input_file(total_no_of_rows)"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:211:3: ( ( 'corrmatrix' ) '(' INT ',' ofpart | multiplereg )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=25 && LA7_0<=28)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:211:4: ( 'corrmatrix' ) '(' INT ',' ofpart
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:211:4: ( 'corrmatrix' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:211:6: 'corrmatrix'
                    {
                    match(input,23,FOLLOW_23_in_corrmatrix585); 

                    }

                    match(input,16,FOLLOW_16_in_corrmatrix617); 
                    INT6=(Token)match(input,INT,FOLLOW_INT_in_corrmatrix621); 
                     try { list.add(Integer.parseInt((INT6!=null?INT6.getText():null)));   } catch(Exception e) { } 
                    match(input,24,FOLLOW_24_in_corrmatrix659); 
                    pushFollow(FOLLOW_ofpart_in_corrmatrix678);
                    ofpart();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:220:12: multiplereg
                    {
                    pushFollow(FOLLOW_multiplereg_in_corrmatrix713);
                    multiplereg();

                    state._fsp--;


                    }
                    break;

            }
             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "corrmatrix"


    // $ANTLR start "multiplereg"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:223:1: multiplereg : ( ( 'multiplereg' ) '(' INT ',' mulregpart | forwardselection );
    public final void multiplereg() throws RecognitionException {
        Token INT7=null;

         paraphrases.push("\n"+"USAGE :multiplereg(column_nos)<<input_file(total_no_rows)"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:228:3: ( ( 'multiplereg' ) '(' INT ',' mulregpart | forwardselection )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=26 && LA8_0<=28)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:228:5: ( 'multiplereg' ) '(' INT ',' mulregpart
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:228:5: ( 'multiplereg' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:228:7: 'multiplereg'
                    {
                    match(input,25,FOLLOW_25_in_multiplereg745); 

                    }

                    match(input,16,FOLLOW_16_in_multiplereg778); 
                    INT7=(Token)match(input,INT,FOLLOW_INT_in_multiplereg781); 
                     try { list.add(Integer.parseInt((INT7!=null?INT7.getText():null)));   } catch(Exception e) { } 
                    match(input,24,FOLLOW_24_in_multiplereg817); 
                    pushFollow(FOLLOW_mulregpart_in_multiplereg840);
                    mulregpart();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:236:13: forwardselection
                    {
                    pushFollow(FOLLOW_forwardselection_in_multiplereg865);
                    forwardselection();

                    state._fsp--;


                    }
                    break;

            }
             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "multiplereg"


    // $ANTLR start "forwardselection"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:240:1: forwardselection : ( ( 'forwardselection' ) '(' INT ',' forwardpart | help );
    public final void forwardselection() throws RecognitionException {
        Token INT8=null;

         paraphrases.push("\n"+"USAGE :forwardselection(column_nos)<<input_file(total_no_of_rows,level_of_significance)"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:245:3: ( ( 'forwardselection' ) '(' INT ',' forwardpart | help )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=27 && LA9_0<=28)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:245:4: ( 'forwardselection' ) '(' INT ',' forwardpart
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:245:4: ( 'forwardselection' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:245:6: 'forwardselection'
                    {
                    match(input,26,FOLLOW_26_in_forwardselection896); 

                    }

                    match(input,16,FOLLOW_16_in_forwardselection911); 
                    INT8=(Token)match(input,INT,FOLLOW_INT_in_forwardselection913); 
                     try { list.add(Integer.parseInt((INT8!=null?INT8.getText():null)));   } catch(Exception e) { } 
                    match(input,24,FOLLOW_24_in_forwardselection942); 
                    pushFollow(FOLLOW_forwardpart_in_forwardselection954);
                    forwardpart();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:250:7: help
                    {
                    pushFollow(FOLLOW_help_in_forwardselection970);
                    help();

                    state._fsp--;


                    }
                    break;

            }
             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "forwardselection"


    // $ANTLR start "help"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:255:1: help : ( 'HELP' | 'help' ) ;
    public final void help() throws RecognitionException {
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:259:3: ( ( 'HELP' | 'help' ) )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:259:6: ( 'HELP' | 'help' )
            {
            if ( (input.LA(1)>=27 && input.LA(1)<=28) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


                System.out.println("\n"+"Usage of the commands are as follows:"+"\n"+"1.sigmax"+"\n"+"sigmax(column_no)<<input_file"+"\n"+"2.sigmaxsquare"+"\n"+"sigmaxsquare(column_no)<<input_file"+"\n"+"3.sigmaxy"+"\n"+"sigmaxy(column_no1,column_no2)<<input_file"+"\n"+"4.mean"+"\n"+"mean(column_no)<<input_file(total_no_of_rows)"+"\n"+"5.correlation"+"\n"+"corr(column_no1,column_no2)<<input_file(total_no_of_rows)"+"\n"+"6.correlation matrix"+"\n"+"corrmatrix(column_nos)<<input_file(total_no_of_rows)"+"\n"+"7.multiple regression"+"\n"+"multiplereg(column_nos)<<input_file(total_no_of_rows)"+"\n"+"8.forward selection"+"\n"+"forwardselection(column_nos)<<input_file(total_no_of_rows,level_of_significance)"+"\n"+"NOTE: The tab separated input_file must be in hdfs"+"\n"); 
                        

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "help"


    // $ANTLR start "ofpart"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:266:1: ofpart : INT morecol idpart ;
    public final void ofpart() throws RecognitionException {
        Token INT9=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:266:8: ( INT morecol idpart )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:266:17: INT morecol idpart
            {
            INT9=(Token)match(input,INT,FOLLOW_INT_in_ofpart1061); 
             try { list.add(Integer.parseInt((INT9!=null?INT9.getText():null)));} catch(Exception e) { } 
            pushFollow(FOLLOW_morecol_in_ofpart1090);
            morecol();

            state._fsp--;

            pushFollow(FOLLOW_idpart_in_ofpart1115);
            idpart();

            state._fsp--;

             
                                                      
                                       
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ofpart"


    // $ANTLR start "mulregpart"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:299:1: mulregpart : INT morecol idpart ;
    public final void mulregpart() throws RecognitionException {
        Token INT10=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:299:13: ( INT morecol idpart )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:299:19: INT morecol idpart
            {
            INT10=(Token)match(input,INT,FOLLOW_INT_in_mulregpart1190); 
             try { list.add(Integer.parseInt((INT10!=null?INT10.getText():null)));} catch(Exception e) { } 
            pushFollow(FOLLOW_morecol_in_mulregpart1220);
            morecol();

            state._fsp--;

            pushFollow(FOLLOW_idpart_in_mulregpart1245);
            idpart();

            state._fsp--;


                                              
                                              
                                      try{
                                      Future<Map<Integer,Double>> value=complexTypeImpl.multipleregression(ip,list,n);
                                      System.out.print(value.get().values());
                                      }
                                      catch(Exception e)
                                      {
                                      
                                      }
                                               
                                                      
                                             

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "mulregpart"


    // $ANTLR start "forwardpart"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:320:1: forwardpart : INT morecol levelofsignificance ;
    public final void forwardpart() throws RecognitionException {
        Token INT11=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:320:13: ( INT morecol levelofsignificance )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:320:19: INT morecol levelofsignificance
            {
            INT11=(Token)match(input,INT,FOLLOW_INT_in_forwardpart1315); 
             try { list.add(Integer.parseInt((INT11!=null?INT11.getText():null)));} catch(Exception e) { } 
            pushFollow(FOLLOW_morecol_in_forwardpart1365);
            morecol();

            state._fsp--;

            pushFollow(FOLLOW_levelofsignificance_in_forwardpart1410);
            levelofsignificance();

            state._fsp--;


                              
                                                          
                                                                
                                  complexTypeImpl.forwardSelection(ip,list,n,level);
                                                 
                                                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "forwardpart"


    // $ANTLR start "morecol"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:334:1: morecol : ( ')' | ',' INT morecol );
    public final void morecol() throws RecognitionException {
        Token INT12=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:334:11: ( ')' | ',' INT morecol )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:334:13: ')'
                    {
                    match(input,17,FOLLOW_17_in_morecol1485); 

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:338:9: ',' INT morecol
                    {
                    match(input,24,FOLLOW_24_in_morecol1523); 
                    INT12=(Token)match(input,INT,FOLLOW_INT_in_morecol1542); 
                     try { list.add(Integer.parseInt((INT12!=null?INT12.getText():null)));} catch(Exception e) { } 
                    pushFollow(FOLLOW_morecol_in_morecol1568);
                    morecol();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "morecol"


    // $ANTLR start "xypart"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:346:1: xypart : ',' INT ')' '<<' input ;
    public final void xypart() throws RecognitionException {
        Token INT13=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:346:9: ( ',' INT ')' '<<' input )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:346:12: ',' INT ')' '<<' input
            {
            match(input,24,FOLLOW_24_in_xypart1608); 
            INT13=(Token)match(input,INT,FOLLOW_INT_in_xypart1610); 
            match(input,17,FOLLOW_17_in_xypart1613); 
            match(input,18,FOLLOW_18_in_xypart1615); 
            pushFollow(FOLLOW_input_in_xypart1617);
            input();

            state._fsp--;

             try {  y=Integer.parseInt((INT13!=null?INT13.getText():null)); } catch(Exception e) { }
                              
                            

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "xypart"


    // $ANTLR start "npart"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:352:1: npart : INT ;
    public final void npart() throws RecognitionException {
        Token INT14=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:352:7: ( INT )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:352:9: INT
            {
            INT14=(Token)match(input,INT,FOLLOW_INT_in_npart1640); 
             try { nn=Integer.parseInt((INT14!=null?INT14.getText():null)); } catch(Exception e) { }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "npart"


    // $ANTLR start "idpart"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:356:1: idpart : '<<' input '(' INT ')' ;
    public final void idpart() throws RecognitionException {
        Token INT15=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:356:9: ( '<<' input '(' INT ')' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:356:12: '<<' input '(' INT ')'
            {
            match(input,18,FOLLOW_18_in_idpart1697); 
            pushFollow(FOLLOW_input_in_idpart1699);
            input();

            state._fsp--;

            match(input,16,FOLLOW_16_in_idpart1702); 
            INT15=(Token)match(input,INT,FOLLOW_INT_in_idpart1704); 
            match(input,17,FOLLOW_17_in_idpart1706); 
             try { n=Integer.parseInt((INT15!=null?INT15.getText():null)); } catch(Exception e) { }
                                
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "idpart"


    // $ANTLR start "levelofsignificance"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:361:1: levelofsignificance : '<<' input '(' INT ',' DOUBLE ')' ;
    public final void levelofsignificance() throws RecognitionException {
        Token INT16=null;
        Token DOUBLE17=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:361:21: ( '<<' input '(' INT ',' DOUBLE ')' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:361:23: '<<' input '(' INT ',' DOUBLE ')'
            {
            match(input,18,FOLLOW_18_in_levelofsignificance1736); 
            pushFollow(FOLLOW_input_in_levelofsignificance1738);
            input();

            state._fsp--;

            match(input,16,FOLLOW_16_in_levelofsignificance1741); 
            INT16=(Token)match(input,INT,FOLLOW_INT_in_levelofsignificance1743); 
            match(input,24,FOLLOW_24_in_levelofsignificance1746); 
             try { n=Integer.parseInt((INT16!=null?INT16.getText():null)); }catch(Exception e) { } 
            DOUBLE17=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_levelofsignificance1768); 
            match(input,17,FOLLOW_17_in_levelofsignificance1771); 
            try { level = Double.parseDouble((DOUBLE17!=null?DOUBLE17.getText():null));  } catch(Exception e) { } 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "levelofsignificance"


    // $ANTLR start "out"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:365:1: out : '>>' ID ;
    public final void out() throws RecognitionException {
        Token ID18=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:365:7: ( '>>' ID )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:365:9: '>>' ID
            {
            match(input,29,FOLLOW_29_in_out1800); 
            ID18=(Token)match(input,ID,FOLLOW_ID_in_out1803); 
                try { op= (ID18!=null?ID18.getText():null);  } catch(Exception e) { } 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "out"


    // $ANTLR start "ext"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:371:1: ext : ID ;
    public final void ext() throws RecognitionException {
        Token ID19=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:371:7: ( ID )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:371:12: ID
            {
            ID19=(Token)match(input,ID,FOLLOW_ID_in_ext1835); 
             try { extn = (ID19!=null?ID19.getText():null); } catch(Exception e) { } 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ext"


    // $ANTLR start "input"
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:375:1: input : ( ID | ID '.' ext );
    public final void input() throws RecognitionException {
        Token ID20=null;
        Token ID21=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:375:11: ( ID | ID '.' ext )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==30) ) {
                    alt11=2;
                }
                else if ( (LA11_1==EOF||LA11_1==16) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:375:13: ID
                    {
                    ID20=(Token)match(input,ID,FOLLOW_ID_in_input1869); 
                      try {  ip=(ID20!=null?ID20.getText():null);} catch(Exception e) { } 

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:377:7: ID '.' ext
                    {
                    ID21=(Token)match(input,ID,FOLLOW_ID_in_input1891); 
                    match(input,30,FOLLOW_30_in_input1895); 
                      try {ip=(ID21!=null?ID21.getText():null);}catch(Exception e) { } 
                    pushFollow(FOLLOW_ext_in_input1915);
                    ext();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "input"

    // Delegated rules


 

    public static final BitSet FOLLOW_set_in_start37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sigmax_in_start62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_sigmax92 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_sigmax95 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_sigmax97 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_sigmax99 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_sigmax101 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_input_in_sigmax103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sigmaxsquare_in_sigmax132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_sigmaxsquare160 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_sigmaxsquare163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_sigmaxsquare165 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_sigmaxsquare167 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_sigmaxsquare169 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_input_in_sigmaxsquare171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sigmaxy_in_sigmaxsquare199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_sigmaxy224 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_sigmaxy227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_sigmaxy229 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_xypart_in_sigmaxy250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mean_in_sigmaxy281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_mean307 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_mean310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_mean312 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_mean333 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_idpart_in_mean346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_corr_in_mean385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_corr413 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_corr416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_corr418 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_xypart_in_corr435 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_corr453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_npart_in_corr455 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_corr457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_corrmatrix_in_corr554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_corrmatrix585 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_corrmatrix617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_corrmatrix621 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_corrmatrix659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ofpart_in_corrmatrix678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplereg_in_corrmatrix713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_multiplereg745 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_multiplereg778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_multiplereg781 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_multiplereg817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_mulregpart_in_multiplereg840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forwardselection_in_multiplereg865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_forwardselection896 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_forwardselection911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_forwardselection913 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_forwardselection942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_forwardpart_in_forwardselection954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_help_in_forwardselection970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_help1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_ofpart1061 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_morecol_in_ofpart1090 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_idpart_in_ofpart1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_mulregpart1190 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_morecol_in_mulregpart1220 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_idpart_in_mulregpart1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_forwardpart1315 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_morecol_in_forwardpart1365 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_levelofsignificance_in_forwardpart1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_morecol1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_morecol1523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_morecol1542 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_morecol_in_morecol1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_xypart1608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_xypart1610 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_xypart1613 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_xypart1615 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_input_in_xypart1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_npart1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_idpart1697 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_input_in_idpart1699 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_idpart1702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_idpart1704 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_idpart1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_levelofsignificance1736 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_input_in_levelofsignificance1738 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_levelofsignificance1741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_levelofsignificance1743 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_levelofsignificance1746 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DOUBLE_in_levelofsignificance1768 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_levelofsignificance1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_out1800 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_out1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ext1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_input1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_input1891 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_input1895 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ext_in_input1915 = new BitSet(new long[]{0x0000000000000002L});

}