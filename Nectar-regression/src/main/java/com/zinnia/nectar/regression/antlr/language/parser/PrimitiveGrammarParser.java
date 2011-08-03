// $ANTLR 3.3 Nov 30, 2010 12:45:30 PrimitiveGrammar.g 2011-08-01 17:15:37



package com.zinnia.nectar.regression.antlr.language.parser;
import com.zinnia.nectar.regression.language.primitive.PrimitiveTypeImplFactory;
import com.zinnia.nectar.regression.language.primitive.IPrimitiveType;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.zinnia.nectar.regression.language.complex.impl.ComplexTypeImpl ;
//import com.zinnia.hpm.regression.language.complex.impl.ComplexTypeImpl ;


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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "DOUBLE", "ID", "WS", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'sigmax'", "'('", "')'", "'<<'", "'sigmaxsquare'", "'sigmaxy'", "'mean'", "'corr'", "'corrmatrix'", "','", "'multiplereg'", "'forwardselection'", "'HELP'", "'help'", "'>>'", "'.'"
    };
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int INT=4;
    public static final int DOUBLE=5;
    public static final int ID=6;
    public static final int WS=7;
    public static final int ESC_SEQ=8;
    public static final int STRING=9;
    public static final int HEX_DIGIT=10;
    public static final int UNICODE_ESC=11;
    public static final int OCTAL_ESC=12;

    // delegates
    // delegators


        public PrimitiveGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PrimitiveGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PrimitiveGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "PrimitiveGrammar.g"; }


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
    // PrimitiveGrammar.g:70:1: start : ( ( 'sigmax' ) '(' INT ')' '<<' input | sigmaxsquare );
    public final void start() throws RecognitionException {
        Token INT1=null;

         paraphrases.push("\n"+"USAGE :sigmax(column_no)<<input_file"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // PrimitiveGrammar.g:73:3: ( ( 'sigmax' ) '(' INT ')' '<<' input | sigmaxsquare )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=17 && LA1_0<=21)||(LA1_0>=23 && LA1_0<=26)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // PrimitiveGrammar.g:73:5: ( 'sigmax' ) '(' INT ')' '<<' input
                    {
                    // PrimitiveGrammar.g:73:5: ( 'sigmax' )
                    // PrimitiveGrammar.g:73:6: 'sigmax'
                    {
                    match(input,13,FOLLOW_13_in_start55); 

                    }

                    match(input,14,FOLLOW_14_in_start58); 
                    INT1=(Token)match(input,INT,FOLLOW_INT_in_start60); 
                    match(input,15,FOLLOW_15_in_start62); 
                    match(input,16,FOLLOW_16_in_start64); 
                    pushFollow(FOLLOW_input_in_start66);
                    input();

                    state._fsp--;

                     n=Integer.parseInt((INT1!=null?INT1.getText():null));
                                            
                                          
                                            
                                         primitiveImpl=PrimitiveTypeImplFactory.getInstance(ip);
                                         Future<Double> value;
										try {
											value = primitiveImpl.sigmax(ip,n);
											System.out.println("Sigmax is "+value.get());
										} catch (Exception e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
                                                        
                                                 
                                                 

                    }
                    break;
                case 2 :
                    // PrimitiveGrammar.g:89:7: sigmaxsquare
                    {
                    pushFollow(FOLLOW_sigmaxsquare_in_start95);
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
    // $ANTLR end "start"


    // $ANTLR start "sigmaxsquare"
    // PrimitiveGrammar.g:94:1: sigmaxsquare : ( ( 'sigmaxsquare' ) '(' INT ')' '<<' input | sigmaxy );
    public final void sigmaxsquare() throws RecognitionException {
        Token INT2=null;

         paraphrases.push("\n"+"USAGE :sigmaxsquare(column_no)<<input_file"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // PrimitiveGrammar.g:98:3: ( ( 'sigmaxsquare' ) '(' INT ')' '<<' input | sigmaxy )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=18 && LA2_0<=21)||(LA2_0>=23 && LA2_0<=26)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // PrimitiveGrammar.g:98:4: ( 'sigmaxsquare' ) '(' INT ')' '<<' input
                    {
                    // PrimitiveGrammar.g:98:4: ( 'sigmaxsquare' )
                    // PrimitiveGrammar.g:98:5: 'sigmaxsquare'
                    {
                    match(input,17,FOLLOW_17_in_sigmaxsquare123); 

                    }

                    match(input,14,FOLLOW_14_in_sigmaxsquare126); 
                    INT2=(Token)match(input,INT,FOLLOW_INT_in_sigmaxsquare128); 
                    match(input,15,FOLLOW_15_in_sigmaxsquare130); 
                    match(input,16,FOLLOW_16_in_sigmaxsquare132); 
                    pushFollow(FOLLOW_input_in_sigmaxsquare134);
                    input();

                    state._fsp--;

                        n=Integer.parseInt((INT2!=null?INT2.getText():null));
                                        
                                    
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
                    break;
                case 2 :
                    // PrimitiveGrammar.g:112:7: sigmaxy
                    {
                    pushFollow(FOLLOW_sigmaxy_in_sigmaxsquare162);
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
    // PrimitiveGrammar.g:114:1: sigmaxy : ( ( 'sigmaxy' ) '(' INT xypart | mean );
    public final void sigmaxy() throws RecognitionException {
        Token INT3=null;

         paraphrases.push("\n"+"USAGE :sigmaxy(column_no1,column_no2)<<input_file"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // PrimitiveGrammar.g:118:3: ( ( 'sigmaxy' ) '(' INT xypart | mean )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=19 && LA3_0<=21)||(LA3_0>=23 && LA3_0<=26)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // PrimitiveGrammar.g:118:4: ( 'sigmaxy' ) '(' INT xypart
                    {
                    // PrimitiveGrammar.g:118:4: ( 'sigmaxy' )
                    // PrimitiveGrammar.g:118:5: 'sigmaxy'
                    {
                    match(input,18,FOLLOW_18_in_sigmaxy187); 

                    }

                    match(input,14,FOLLOW_14_in_sigmaxy190); 
                    INT3=(Token)match(input,INT,FOLLOW_INT_in_sigmaxy192); 
                       x=Integer.parseInt((INT3!=null?INT3.getText():null));
                    pushFollow(FOLLOW_xypart_in_sigmaxy213);
                    xypart();

                    state._fsp--;


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
                    break;
                case 2 :
                    // PrimitiveGrammar.g:131:6: mean
                    {
                    pushFollow(FOLLOW_mean_in_sigmaxy244);
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
    // PrimitiveGrammar.g:133:1: mean : ( ( 'mean' ) '(' INT ')' idpart | corr );
    public final void mean() throws RecognitionException {
        Token INT4=null;

         paraphrases.push("\n"+"USAGE :mean(column_no)<<input_file(total_no_of_rows)"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // PrimitiveGrammar.g:137:3: ( ( 'mean' ) '(' INT ')' idpart | corr )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=20 && LA4_0<=21)||(LA4_0>=23 && LA4_0<=26)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // PrimitiveGrammar.g:137:5: ( 'mean' ) '(' INT ')' idpart
                    {
                    // PrimitiveGrammar.g:137:5: ( 'mean' )
                    // PrimitiveGrammar.g:137:6: 'mean'
                    {
                    match(input,19,FOLLOW_19_in_mean270); 

                    }

                    match(input,14,FOLLOW_14_in_mean273); 
                    INT4=(Token)match(input,INT,FOLLOW_INT_in_mean275); 
                       cn=Integer.parseInt((INT4!=null?INT4.getText():null));
                    match(input,15,FOLLOW_15_in_mean296); 
                    pushFollow(FOLLOW_idpart_in_mean309);
                    idpart();

                    state._fsp--;


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
                    break;
                case 2 :
                    // PrimitiveGrammar.g:151:8: corr
                    {
                    pushFollow(FOLLOW_corr_in_mean348);
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
    // PrimitiveGrammar.g:155:1: corr : ( ( 'corr' ) '(' INT xypart '(' npart ')' | corrmatrix );
    public final void corr() throws RecognitionException {
        Token INT5=null;

         paraphrases.push("\n"+"USAGE :corr(column_no1,column_no2)<<input_file(total_no_of_rows)"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // PrimitiveGrammar.g:159:3: ( ( 'corr' ) '(' INT xypart '(' npart ')' | corrmatrix )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21||(LA5_0>=23 && LA5_0<=26)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // PrimitiveGrammar.g:159:4: ( 'corr' ) '(' INT xypart '(' npart ')'
                    {
                    // PrimitiveGrammar.g:159:4: ( 'corr' )
                    // PrimitiveGrammar.g:159:6: 'corr'
                    {
                    match(input,20,FOLLOW_20_in_corr376); 

                    }

                    match(input,14,FOLLOW_14_in_corr379); 
                    INT5=(Token)match(input,INT,FOLLOW_INT_in_corr381); 
                     x=Integer.parseInt((INT5!=null?INT5.getText():null));
                    pushFollow(FOLLOW_xypart_in_corr398);
                    xypart();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_corr416); 
                    pushFollow(FOLLOW_npart_in_corr418);
                    npart();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_corr420); 

                              
                              
                                                     Future<Double> value=complexTypeImpl.correlation(ip,x,y,nn); 
                                           try
                                                  {
                                                       System.out.println("correlation is "+value.get());  
                                                       }
                                                       catch(Exception e)
                                                       {
                                                       }
                                                 

                    }
                    break;
                case 2 :
                    // PrimitiveGrammar.g:176:13: corrmatrix
                    {
                    pushFollow(FOLLOW_corrmatrix_in_corr517);
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
    // PrimitiveGrammar.g:178:1: corrmatrix : ( ( 'corrmatrix' ) '(' INT ',' ofpart | multiplereg );
    public final void corrmatrix() throws RecognitionException {
        Token INT6=null;

         paraphrases.push("\n"+"USAGE :corrmatrix(column_nos)<<input_file(total_no_of_rows)"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // PrimitiveGrammar.g:183:3: ( ( 'corrmatrix' ) '(' INT ',' ofpart | multiplereg )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=23 && LA6_0<=26)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // PrimitiveGrammar.g:183:4: ( 'corrmatrix' ) '(' INT ',' ofpart
                    {
                    // PrimitiveGrammar.g:183:4: ( 'corrmatrix' )
                    // PrimitiveGrammar.g:183:6: 'corrmatrix'
                    {
                    match(input,21,FOLLOW_21_in_corrmatrix548); 

                    }

                    match(input,14,FOLLOW_14_in_corrmatrix580); 
                    INT6=(Token)match(input,INT,FOLLOW_INT_in_corrmatrix584); 
                     list.add(Integer.parseInt((INT6!=null?INT6.getText():null)));   
                    match(input,22,FOLLOW_22_in_corrmatrix622); 
                    pushFollow(FOLLOW_ofpart_in_corrmatrix641);
                    ofpart();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // PrimitiveGrammar.g:192:12: multiplereg
                    {
                    pushFollow(FOLLOW_multiplereg_in_corrmatrix676);
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
    // PrimitiveGrammar.g:195:1: multiplereg : ( ( 'multiplereg' ) '(' INT ',' mulregpart | forwardselection );
    public final void multiplereg() throws RecognitionException {
        Token INT7=null;

         paraphrases.push("\n"+"USAGE :multiplereg(column_nos)<<input_file(total_no_rows)"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // PrimitiveGrammar.g:200:3: ( ( 'multiplereg' ) '(' INT ',' mulregpart | forwardselection )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=24 && LA7_0<=26)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // PrimitiveGrammar.g:200:5: ( 'multiplereg' ) '(' INT ',' mulregpart
                    {
                    // PrimitiveGrammar.g:200:5: ( 'multiplereg' )
                    // PrimitiveGrammar.g:200:7: 'multiplereg'
                    {
                    match(input,23,FOLLOW_23_in_multiplereg708); 

                    }

                    match(input,14,FOLLOW_14_in_multiplereg741); 
                    INT7=(Token)match(input,INT,FOLLOW_INT_in_multiplereg744); 
                     list.add(Integer.parseInt((INT7!=null?INT7.getText():null)));   
                    match(input,22,FOLLOW_22_in_multiplereg780); 
                    pushFollow(FOLLOW_mulregpart_in_multiplereg803);
                    mulregpart();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // PrimitiveGrammar.g:208:13: forwardselection
                    {
                    pushFollow(FOLLOW_forwardselection_in_multiplereg828);
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
    // PrimitiveGrammar.g:212:1: forwardselection : ( ( 'forwardselection' ) '(' INT ',' forwardpart | help );
    public final void forwardselection() throws RecognitionException {
        Token INT8=null;

         paraphrases.push("\n"+"USAGE :forwardselection(column_nos)<<input_file(total_no_of_rows,level_of_significance)"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // PrimitiveGrammar.g:217:3: ( ( 'forwardselection' ) '(' INT ',' forwardpart | help )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=25 && LA8_0<=26)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // PrimitiveGrammar.g:217:4: ( 'forwardselection' ) '(' INT ',' forwardpart
                    {
                    // PrimitiveGrammar.g:217:4: ( 'forwardselection' )
                    // PrimitiveGrammar.g:217:6: 'forwardselection'
                    {
                    match(input,24,FOLLOW_24_in_forwardselection859); 

                    }

                    match(input,14,FOLLOW_14_in_forwardselection874); 
                    INT8=(Token)match(input,INT,FOLLOW_INT_in_forwardselection876); 
                     list.add(Integer.parseInt((INT8!=null?INT8.getText():null)));   
                    match(input,22,FOLLOW_22_in_forwardselection905); 
                    pushFollow(FOLLOW_forwardpart_in_forwardselection917);
                    forwardpart();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // PrimitiveGrammar.g:222:7: help
                    {
                    pushFollow(FOLLOW_help_in_forwardselection933);
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
    // PrimitiveGrammar.g:227:1: help : ( 'HELP' | 'help' ) ;
    public final void help() throws RecognitionException {
        try {
            // PrimitiveGrammar.g:231:3: ( ( 'HELP' | 'help' ) )
            // PrimitiveGrammar.g:231:6: ( 'HELP' | 'help' )
            {
            if ( (input.LA(1)>=25 && input.LA(1)<=26) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


                System.out.println("\n"+"Usage of the commands are as follows:"+"\n"+"1.sigmax"+"\n"+"sigmax(column_no)<<input_file"+"\n"+"2.sigmaxsquare"+"\n"+"sigmaxsquare(column_no)<<input_file"+"\n"+"3.sigmaxy"+"\n"+"sigmaxy(column_no1,column_no2)<<input_file"+"\n"+"4.mean"+"\n"+"mean(column_no)<<input_file(total_no_of_rows)"+"\n"+"5.correlation"+"\n"+"corr(column_no1,column_no2)<<input_file(total_no_of_rows)"+"\n"+"6.correlation matrix"+"\n"+"corrmatrix(column_nos)<<input_file(total_no_of_rows)"+"\n"+"7.multiple regression"+"\n"+"multiplereg(column_nos)<<input_file(total_no_of_rows)"+"\n"+"8.forward selection"+"\n"+"forwardselection(column_nos)<<input_file(total_no_of_rows,level_of_significance)"+"\n"+"NOTE: The tab separated input_file must be in hdfs"+"\n \n"); 
                        

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
    // PrimitiveGrammar.g:238:1: ofpart : INT morecol idpart ;
    public final void ofpart() throws RecognitionException {
        Token INT9=null;

        try {
            // PrimitiveGrammar.g:238:8: ( INT morecol idpart )
            // PrimitiveGrammar.g:238:17: INT morecol idpart
            {
            INT9=(Token)match(input,INT,FOLLOW_INT_in_ofpart1024); 
              list.add(Integer.parseInt((INT9!=null?INT9.getText():null)));
            pushFollow(FOLLOW_morecol_in_ofpart1053);
            morecol();

            state._fsp--;

            pushFollow(FOLLOW_idpart_in_ofpart1078);
            idpart();

            state._fsp--;

             
                                                      
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
    // PrimitiveGrammar.g:270:1: mulregpart : INT morecol idpart ;
    public final void mulregpart() throws RecognitionException {
        Token INT10=null;

        try {
            // PrimitiveGrammar.g:270:13: ( INT morecol idpart )
            // PrimitiveGrammar.g:270:19: INT morecol idpart
            {
            INT10=(Token)match(input,INT,FOLLOW_INT_in_mulregpart1153); 
              list.add(Integer.parseInt((INT10!=null?INT10.getText():null)));
            pushFollow(FOLLOW_morecol_in_mulregpart1182);
            morecol();

            state._fsp--;

            pushFollow(FOLLOW_idpart_in_mulregpart1207);
            idpart();

            state._fsp--;


                                              
                                              Future<Map<Integer,Double>> value=complexTypeImpl.multipleregression(ip,list,n);
                                      try{
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
    // PrimitiveGrammar.g:290:1: forwardpart : INT morecol levelofsignificance ;
    public final void forwardpart() throws RecognitionException {
        Token INT11=null;

        try {
            // PrimitiveGrammar.g:290:13: ( INT morecol levelofsignificance )
            // PrimitiveGrammar.g:290:19: INT morecol levelofsignificance
            {
            INT11=(Token)match(input,INT,FOLLOW_INT_in_forwardpart1277); 
              list.add(Integer.parseInt((INT11!=null?INT11.getText():null)));
            pushFollow(FOLLOW_morecol_in_forwardpart1326);
            morecol();

            state._fsp--;

            pushFollow(FOLLOW_levelofsignificance_in_forwardpart1371);
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
    // PrimitiveGrammar.g:304:1: morecol : ( ')' | ',' INT morecol );
    public final void morecol() throws RecognitionException {
        Token INT12=null;

        try {
            // PrimitiveGrammar.g:304:11: ( ')' | ',' INT morecol )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // PrimitiveGrammar.g:304:13: ')'
                    {
                    match(input,15,FOLLOW_15_in_morecol1446); 

                    }
                    break;
                case 2 :
                    // PrimitiveGrammar.g:308:9: ',' INT morecol
                    {
                    match(input,22,FOLLOW_22_in_morecol1484); 
                    INT12=(Token)match(input,INT,FOLLOW_INT_in_morecol1503); 
                     list.add(Integer.parseInt((INT12!=null?INT12.getText():null))); 
                    pushFollow(FOLLOW_morecol_in_morecol1528);
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
    // PrimitiveGrammar.g:316:1: xypart : ',' INT ')' '<<' input ;
    public final void xypart() throws RecognitionException {
        Token INT13=null;

        try {
            // PrimitiveGrammar.g:316:9: ( ',' INT ')' '<<' input )
            // PrimitiveGrammar.g:316:12: ',' INT ')' '<<' input
            {
            match(input,22,FOLLOW_22_in_xypart1568); 
            INT13=(Token)match(input,INT,FOLLOW_INT_in_xypart1570); 
            match(input,15,FOLLOW_15_in_xypart1573); 
            match(input,16,FOLLOW_16_in_xypart1575); 
            pushFollow(FOLLOW_input_in_xypart1577);
            input();

            state._fsp--;

               y=Integer.parseInt((INT13!=null?INT13.getText():null));
                              
                            

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
    // PrimitiveGrammar.g:322:1: npart : INT ;
    public final void npart() throws RecognitionException {
        Token INT14=null;

        try {
            // PrimitiveGrammar.g:322:7: ( INT )
            // PrimitiveGrammar.g:322:9: INT
            {
            INT14=(Token)match(input,INT,FOLLOW_INT_in_npart1600); 
              nn=Integer.parseInt((INT14!=null?INT14.getText():null)); 

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
    // PrimitiveGrammar.g:326:1: idpart : '<<' input '(' INT ')' ;
    public final void idpart() throws RecognitionException {
        Token INT15=null;

        try {
            // PrimitiveGrammar.g:326:9: ( '<<' input '(' INT ')' )
            // PrimitiveGrammar.g:326:12: '<<' input '(' INT ')'
            {
            match(input,16,FOLLOW_16_in_idpart1657); 
            pushFollow(FOLLOW_input_in_idpart1659);
            input();

            state._fsp--;

            match(input,14,FOLLOW_14_in_idpart1662); 
            INT15=(Token)match(input,INT,FOLLOW_INT_in_idpart1664); 
            match(input,15,FOLLOW_15_in_idpart1666); 
              n=Integer.parseInt((INT15!=null?INT15.getText():null));
                                
                    

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
    // PrimitiveGrammar.g:331:1: levelofsignificance : '<<' input '(' INT ',' DOUBLE ')' ;
    public final void levelofsignificance() throws RecognitionException {
        Token INT16=null;
        Token DOUBLE17=null;

        try {
            // PrimitiveGrammar.g:331:21: ( '<<' input '(' INT ',' DOUBLE ')' )
            // PrimitiveGrammar.g:331:23: '<<' input '(' INT ',' DOUBLE ')'
            {
            match(input,16,FOLLOW_16_in_levelofsignificance1696); 
            pushFollow(FOLLOW_input_in_levelofsignificance1698);
            input();

            state._fsp--;

            match(input,14,FOLLOW_14_in_levelofsignificance1701); 
            INT16=(Token)match(input,INT,FOLLOW_INT_in_levelofsignificance1703); 
            match(input,22,FOLLOW_22_in_levelofsignificance1706); 
              n=Integer.parseInt((INT16!=null?INT16.getText():null)); 
            DOUBLE17=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_levelofsignificance1728); 
            match(input,15,FOLLOW_15_in_levelofsignificance1731); 
             level = Double.parseDouble((DOUBLE17!=null?DOUBLE17.getText():null));  

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
    // PrimitiveGrammar.g:335:1: out : '>>' ID ;
    public final void out() throws RecognitionException {
        Token ID18=null;

        try {
            // PrimitiveGrammar.g:335:7: ( '>>' ID )
            // PrimitiveGrammar.g:335:9: '>>' ID
            {
            match(input,27,FOLLOW_27_in_out1760); 
            ID18=(Token)match(input,ID,FOLLOW_ID_in_out1763); 
                 op= (ID18!=null?ID18.getText():null);  

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
    // PrimitiveGrammar.g:341:1: ext : ID ;
    public final void ext() throws RecognitionException {
        Token ID19=null;

        try {
            // PrimitiveGrammar.g:341:7: ( ID )
            // PrimitiveGrammar.g:341:12: ID
            {
            ID19=(Token)match(input,ID,FOLLOW_ID_in_ext1795); 
              extn = (ID19!=null?ID19.getText():null); 

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
    // PrimitiveGrammar.g:345:1: input : ( ID | ID '.' ext );
    public final void input() throws RecognitionException {
        Token ID20=null;
        Token ID21=null;

        try {
            // PrimitiveGrammar.g:345:11: ( ID | ID '.' ext )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==28) ) {
                    alt10=2;
                }
                else if ( (LA10_1==EOF||LA10_1==14) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // PrimitiveGrammar.g:345:13: ID
                    {
                    ID20=(Token)match(input,ID,FOLLOW_ID_in_input1829); 
                        ip=(ID20!=null?ID20.getText():null);

                    }
                    break;
                case 2 :
                    // PrimitiveGrammar.g:347:7: ID '.' ext
                    {
                    ID21=(Token)match(input,ID,FOLLOW_ID_in_input1851); 
                    match(input,28,FOLLOW_28_in_input1855); 
                      ip=(ID21!=null?ID21.getText():null);
                    pushFollow(FOLLOW_ext_in_input1875);
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


 

    public static final BitSet FOLLOW_13_in_start55 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_start58 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_start60 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_start62 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_start64 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_input_in_start66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sigmaxsquare_in_start95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_sigmaxsquare123 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_sigmaxsquare126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_sigmaxsquare128 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_sigmaxsquare130 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_sigmaxsquare132 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_input_in_sigmaxsquare134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sigmaxy_in_sigmaxsquare162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_sigmaxy187 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_sigmaxy190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_sigmaxy192 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_xypart_in_sigmaxy213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mean_in_sigmaxy244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_mean270 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_mean273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_mean275 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_mean296 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_idpart_in_mean309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_corr_in_mean348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_corr376 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_corr379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_corr381 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_xypart_in_corr398 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_corr416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_npart_in_corr418 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_corr420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_corrmatrix_in_corr517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_corrmatrix548 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_corrmatrix580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_corrmatrix584 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_corrmatrix622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ofpart_in_corrmatrix641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplereg_in_corrmatrix676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_multiplereg708 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_multiplereg741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_multiplereg744 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_multiplereg780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_mulregpart_in_multiplereg803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forwardselection_in_multiplereg828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_forwardselection859 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_forwardselection874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_forwardselection876 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_forwardselection905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_forwardpart_in_forwardselection917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_help_in_forwardselection933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_help974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_ofpart1024 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_morecol_in_ofpart1053 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_idpart_in_ofpart1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_mulregpart1153 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_morecol_in_mulregpart1182 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_idpart_in_mulregpart1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_forwardpart1277 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_morecol_in_forwardpart1326 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_levelofsignificance_in_forwardpart1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_morecol1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_morecol1484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_morecol1503 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_morecol_in_morecol1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_xypart1568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_xypart1570 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_xypart1573 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_xypart1575 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_input_in_xypart1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_npart1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_idpart1657 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_input_in_idpart1659 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_idpart1662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_idpart1664 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_idpart1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_levelofsignificance1696 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_input_in_levelofsignificance1698 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_levelofsignificance1701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_levelofsignificance1703 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_levelofsignificance1706 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DOUBLE_in_levelofsignificance1728 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_levelofsignificance1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_out1760 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_out1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ext1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_input1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_input1851 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_input1855 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ext_in_input1875 = new BitSet(new long[]{0x0000000000000002L});

}