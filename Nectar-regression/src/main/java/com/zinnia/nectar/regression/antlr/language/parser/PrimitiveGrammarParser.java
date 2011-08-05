// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g 2011-08-05 14:17:38


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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "DOUBLE", "ID", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'\\n'", "'\\t'", "'\\r'", "' '", "'sigmax'", "'('", "')'", "'<<'", "'sigmaxsquare'", "'sigmaxy'", "'mean'", "'corr'", "'corrmatrix'", "','", "'multiplereg'", "'forwardselection'", "'HELP'", "'help'", "'>>'", "'.'"
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
    public static final int UNICODE_ESC=10;
    public static final int T__20=20;
    public static final int OCTAL_ESC=11;
    public static final int HEX_DIGIT=9;
    public static final int INT=4;
    public static final int ID=6;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int ESC_SEQ=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int DOUBLE=5;
    public static final int STRING=8;

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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:68:1: start : ( ( '\\n' | '\\t' | '\\r' | ( ' ' )+ ) EOF | sigmax );
    public final void start() throws RecognitionException {
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:68:7: ( ( '\\n' | '\\t' | '\\r' | ( ' ' )+ ) EOF | sigmax )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=12 && LA3_0<=15)) ) {
                alt3=1;
            }
            else if ( (LA3_0==16||(LA3_0>=20 && LA3_0<=24)||(LA3_0>=26 && LA3_0<=29)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:68:9: ( '\\n' | '\\t' | '\\r' | ( ' ' )+ ) EOF
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:68:9: ( '\\n' | '\\t' | '\\r' | ( ' ' )+ )
                    int alt2=4;
                    switch ( input.LA(1) ) {
                    case 12:
                        {
                        alt2=1;
                        }
                        break;
                    case 13:
                        {
                        alt2=2;
                        }
                        break;
                    case 14:
                        {
                        alt2=3;
                        }
                        break;
                    case 15:
                        {
                        alt2=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }

                    switch (alt2) {
                        case 1 :
                            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:68:10: '\\n'
                            {
                            match(input,12,FOLLOW_12_in_start38); 

                            }
                            break;
                        case 2 :
                            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:68:15: '\\t'
                            {
                            match(input,13,FOLLOW_13_in_start40); 

                            }
                            break;
                        case 3 :
                            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:68:20: '\\r'
                            {
                            match(input,14,FOLLOW_14_in_start42); 

                            }
                            break;
                        case 4 :
                            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:68:25: ( ' ' )+
                            {
                            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:68:25: ( ' ' )+
                            int cnt1=0;
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==15) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:68:25: ' '
                            	    {
                            	    match(input,15,FOLLOW_15_in_start44); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt1 >= 1 ) break loop1;
                                        EarlyExitException eee =
                                            new EarlyExitException(1, input);
                                        throw eee;
                                }
                                cnt1++;
                            } while (true);


                            }
                            break;

                    }

                    match(input,EOF,FOLLOW_EOF_in_start48); 
                    System.out.println("Type HELP or help for usage of all commands");

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:70:7: sigmax
                    {
                    pushFollow(FOLLOW_sigmax_in_start66);
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:73:1: sigmax : ( ( 'sigmax' ) '(' INT ')' '<<' input | sigmaxsquare );
    public final void sigmax() throws RecognitionException {
        Token INT1=null;

         paraphrases.push("\n"+"USAGE :sigmax(column_no)<<input_file"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:76:3: ( ( 'sigmax' ) '(' INT ')' '<<' input | sigmaxsquare )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=20 && LA4_0<=24)||(LA4_0>=26 && LA4_0<=29)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:76:5: ( 'sigmax' ) '(' INT ')' '<<' input
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:76:5: ( 'sigmax' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:76:6: 'sigmax'
                    {
                    match(input,16,FOLLOW_16_in_sigmax94); 

                    }

                    match(input,17,FOLLOW_17_in_sigmax97); 
                    INT1=(Token)match(input,INT,FOLLOW_INT_in_sigmax99); 
                    match(input,18,FOLLOW_18_in_sigmax101); 
                    match(input,19,FOLLOW_19_in_sigmax103); 
                    pushFollow(FOLLOW_input_in_sigmax105);
                    input();

                    state._fsp--;

                     
                                                        
                                                        try {
                                                        n=Integer.parseInt((INT1!=null?INT1.getText():null));
                                                        }
                                                         catch(Exception e)
                                                       {
                                                       }
                                          
                                            
                                         primitiveImpl=PrimitiveTypeImplFactory.getInstance(ip);
                                         Future<Double> value=primitiveImpl.sigmax(ip,n);
                                                        
                                                  try
                                                  {
                                                       System.out.println("Sigmax is "+value.get());
                                                       }
                                                       catch(Exception e)
                                                       {
                                                        System.out.println("Sigma Job terminated due to exception. Check nectar logs for more information");
                                                       }
                                                 

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:99:7: sigmaxsquare
                    {
                    pushFollow(FOLLOW_sigmaxsquare_in_sigmax134);
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:104:1: sigmaxsquare : ( ( 'sigmaxsquare' ) '(' INT ')' '<<' input | sigmaxy );
    public final void sigmaxsquare() throws RecognitionException {
        Token INT2=null;

         paraphrases.push("\n"+"USAGE :sigmaxsquare(column_no)<<input_file"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:108:3: ( ( 'sigmaxsquare' ) '(' INT ')' '<<' input | sigmaxy )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=21 && LA5_0<=24)||(LA5_0>=26 && LA5_0<=29)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:108:4: ( 'sigmaxsquare' ) '(' INT ')' '<<' input
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:108:4: ( 'sigmaxsquare' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:108:5: 'sigmaxsquare'
                    {
                    match(input,20,FOLLOW_20_in_sigmaxsquare162); 

                    }

                    match(input,17,FOLLOW_17_in_sigmaxsquare165); 
                    INT2=(Token)match(input,INT,FOLLOW_INT_in_sigmaxsquare167); 
                    match(input,18,FOLLOW_18_in_sigmaxsquare169); 
                    match(input,19,FOLLOW_19_in_sigmaxsquare171); 
                    pushFollow(FOLLOW_input_in_sigmaxsquare173);
                    input();

                    state._fsp--;

                        
                                                     try {
                                                        n=Integer.parseInt((INT2!=null?INT2.getText():null));
                                                        }
                                                         catch(Exception e)
                                                       {
                                                       }
                                        
                                    
                                                 primitiveImpl=PrimitiveTypeImplFactory.getInstance(ip);
                                                 Future<Double> value=primitiveImpl.sigmaxSquare(ip,n); 
                                           try
                                                  {
                                                        System.out.println("Sigmax square is "+value.get());  
                                                       }
                                                       catch(Exception e)
                                                       {
                                                          System.out.println("Sigma square Job terminated due to exception. Check nectar logs for more information");
                                                       }
                                                 

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:129:7: sigmaxy
                    {
                    pushFollow(FOLLOW_sigmaxy_in_sigmaxsquare201);
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:131:1: sigmaxy : ( ( 'sigmaxy' ) '(' INT xypart | mean );
    public final void sigmaxy() throws RecognitionException {
        Token INT3=null;

         paraphrases.push("\n"+"USAGE :sigmaxy(column_no1,column_no2)<<input_file"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:135:3: ( ( 'sigmaxy' ) '(' INT xypart | mean )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=22 && LA6_0<=24)||(LA6_0>=26 && LA6_0<=29)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:135:4: ( 'sigmaxy' ) '(' INT xypart
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:135:4: ( 'sigmaxy' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:135:5: 'sigmaxy'
                    {
                    match(input,21,FOLLOW_21_in_sigmaxy226); 

                    }

                    match(input,17,FOLLOW_17_in_sigmaxy229); 
                    INT3=(Token)match(input,INT,FOLLOW_INT_in_sigmaxy231); 
                       
                                                  
                                                try {
                                                x=Integer.parseInt((INT3!=null?INT3.getText():null));
                                                }
                                                catch(Exception e) {
                                                }
                                                
                    pushFollow(FOLLOW_xypart_in_sigmaxy252);
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
                                                          System.out.println("SigmaXY Job terminated due to exception. Check nectar logs for more information");
                                                       }
                                                 

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:156:6: mean
                    {
                    pushFollow(FOLLOW_mean_in_sigmaxy283);
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:158:1: mean : ( ( 'mean' ) '(' INT ')' idpart | corr );
    public final void mean() throws RecognitionException {
        Token INT4=null;

         paraphrases.push("\n"+"USAGE :mean(column_no)<<input_file(total_no_of_rows)"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:162:3: ( ( 'mean' ) '(' INT ')' idpart | corr )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=23 && LA7_0<=24)||(LA7_0>=26 && LA7_0<=29)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:162:5: ( 'mean' ) '(' INT ')' idpart
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:162:5: ( 'mean' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:162:6: 'mean'
                    {
                    match(input,22,FOLLOW_22_in_mean309); 

                    }

                    match(input,17,FOLLOW_17_in_mean312); 
                    INT4=(Token)match(input,INT,FOLLOW_INT_in_mean314); 
                      try { cn=Integer.parseInt((INT4!=null?INT4.getText():null));} catch(Exception e) { } 
                    match(input,18,FOLLOW_18_in_mean335); 
                    pushFollow(FOLLOW_idpart_in_mean348);
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
                                                          System.out.println("Mean Job terminated due to exception. Check nectar logs for more information");
                                                       }
                                                 

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:177:8: corr
                    {
                    pushFollow(FOLLOW_corr_in_mean387);
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:181:1: corr : ( ( 'corr' ) '(' INT xypart '(' npart ')' | corrmatrix );
    public final void corr() throws RecognitionException {
        Token INT5=null;

         paraphrases.push("\n"+"USAGE :corr(column_no1,column_no2)<<input_file(total_no_of_rows)"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:185:3: ( ( 'corr' ) '(' INT xypart '(' npart ')' | corrmatrix )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24||(LA8_0>=26 && LA8_0<=29)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:185:4: ( 'corr' ) '(' INT xypart '(' npart ')'
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:185:4: ( 'corr' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:185:6: 'corr'
                    {
                    match(input,23,FOLLOW_23_in_corr415); 

                    }

                    match(input,17,FOLLOW_17_in_corr418); 
                    INT5=(Token)match(input,INT,FOLLOW_INT_in_corr420); 
                     try {x=Integer.parseInt((INT5!=null?INT5.getText():null));} catch(Exception e) { }
                    pushFollow(FOLLOW_xypart_in_corr437);
                    xypart();

                    state._fsp--;

                    match(input,17,FOLLOW_17_in_corr455); 
                    pushFollow(FOLLOW_npart_in_corr457);
                    npart();

                    state._fsp--;

                    match(input,18,FOLLOW_18_in_corr459); 

                              
                              
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
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:202:13: corrmatrix
                    {
                    pushFollow(FOLLOW_corrmatrix_in_corr556);
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:204:1: corrmatrix : ( ( 'corrmatrix' ) '(' INT ',' ofpart | multiplereg );
    public final void corrmatrix() throws RecognitionException {
        Token INT6=null;

         paraphrases.push("\n"+"USAGE :corrmatrix(column_nos)<<input_file(total_no_of_rows)"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:209:3: ( ( 'corrmatrix' ) '(' INT ',' ofpart | multiplereg )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=26 && LA9_0<=29)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:209:4: ( 'corrmatrix' ) '(' INT ',' ofpart
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:209:4: ( 'corrmatrix' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:209:6: 'corrmatrix'
                    {
                    match(input,24,FOLLOW_24_in_corrmatrix587); 

                    }

                    match(input,17,FOLLOW_17_in_corrmatrix619); 
                    INT6=(Token)match(input,INT,FOLLOW_INT_in_corrmatrix623); 
                     try { list.add(Integer.parseInt((INT6!=null?INT6.getText():null)));   } catch(Exception e) { } 
                    match(input,25,FOLLOW_25_in_corrmatrix661); 
                    pushFollow(FOLLOW_ofpart_in_corrmatrix680);
                    ofpart();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:218:12: multiplereg
                    {
                    pushFollow(FOLLOW_multiplereg_in_corrmatrix715);
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:221:1: multiplereg : ( ( 'multiplereg' ) '(' INT ',' mulregpart | forwardselection );
    public final void multiplereg() throws RecognitionException {
        Token INT7=null;

         paraphrases.push("\n"+"USAGE :multiplereg(column_nos)<<input_file(total_no_rows)"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:226:3: ( ( 'multiplereg' ) '(' INT ',' mulregpart | forwardselection )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=27 && LA10_0<=29)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:226:5: ( 'multiplereg' ) '(' INT ',' mulregpart
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:226:5: ( 'multiplereg' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:226:7: 'multiplereg'
                    {
                    match(input,26,FOLLOW_26_in_multiplereg747); 

                    }

                    match(input,17,FOLLOW_17_in_multiplereg780); 
                    INT7=(Token)match(input,INT,FOLLOW_INT_in_multiplereg783); 
                     try { list.add(Integer.parseInt((INT7!=null?INT7.getText():null)));   } catch(Exception e) { } 
                    match(input,25,FOLLOW_25_in_multiplereg819); 
                    pushFollow(FOLLOW_mulregpart_in_multiplereg842);
                    mulregpart();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:234:13: forwardselection
                    {
                    pushFollow(FOLLOW_forwardselection_in_multiplereg867);
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:238:1: forwardselection : ( ( 'forwardselection' ) '(' INT ',' forwardpart | help );
    public final void forwardselection() throws RecognitionException {
        Token INT8=null;

         paraphrases.push("\n"+"USAGE :forwardselection(column_nos)<<input_file(total_no_of_rows,level_of_significance)"+"\n"+"Type HELP or help for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:243:3: ( ( 'forwardselection' ) '(' INT ',' forwardpart | help )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=28 && LA11_0<=29)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:243:4: ( 'forwardselection' ) '(' INT ',' forwardpart
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:243:4: ( 'forwardselection' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:243:6: 'forwardselection'
                    {
                    match(input,27,FOLLOW_27_in_forwardselection898); 

                    }

                    match(input,17,FOLLOW_17_in_forwardselection913); 
                    INT8=(Token)match(input,INT,FOLLOW_INT_in_forwardselection915); 
                     try { list.add(Integer.parseInt((INT8!=null?INT8.getText():null)));   } catch(Exception e) { } 
                    match(input,25,FOLLOW_25_in_forwardselection944); 
                    pushFollow(FOLLOW_forwardpart_in_forwardselection956);
                    forwardpart();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:248:7: help
                    {
                    pushFollow(FOLLOW_help_in_forwardselection972);
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:253:1: help : ( 'HELP' | 'help' ) ;
    public final void help() throws RecognitionException {
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:257:3: ( ( 'HELP' | 'help' ) )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:257:6: ( 'HELP' | 'help' )
            {
            if ( (input.LA(1)>=28 && input.LA(1)<=29) ) {
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:264:1: ofpart : INT morecol idpart ;
    public final void ofpart() throws RecognitionException {
        Token INT9=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:264:8: ( INT morecol idpart )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:264:17: INT morecol idpart
            {
            INT9=(Token)match(input,INT,FOLLOW_INT_in_ofpart1063); 
             try { list.add(Integer.parseInt((INT9!=null?INT9.getText():null)));} catch(Exception e) { } 
            pushFollow(FOLLOW_morecol_in_ofpart1092);
            morecol();

            state._fsp--;

            pushFollow(FOLLOW_idpart_in_ofpart1117);
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:296:1: mulregpart : INT morecol idpart ;
    public final void mulregpart() throws RecognitionException {
        Token INT10=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:296:13: ( INT morecol idpart )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:296:19: INT morecol idpart
            {
            INT10=(Token)match(input,INT,FOLLOW_INT_in_mulregpart1192); 
             try { list.add(Integer.parseInt((INT10!=null?INT10.getText():null)));} catch(Exception e) { } 
            pushFollow(FOLLOW_morecol_in_mulregpart1222);
            morecol();

            state._fsp--;

            pushFollow(FOLLOW_idpart_in_mulregpart1247);
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:316:1: forwardpart : INT morecol levelofsignificance ;
    public final void forwardpart() throws RecognitionException {
        Token INT11=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:316:13: ( INT morecol levelofsignificance )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:316:19: INT morecol levelofsignificance
            {
            INT11=(Token)match(input,INT,FOLLOW_INT_in_forwardpart1317); 
             try { list.add(Integer.parseInt((INT11!=null?INT11.getText():null)));} catch(Exception e) { } 
            pushFollow(FOLLOW_morecol_in_forwardpart1367);
            morecol();

            state._fsp--;

            pushFollow(FOLLOW_levelofsignificance_in_forwardpart1412);
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:330:1: morecol : ( ')' | ',' INT morecol );
    public final void morecol() throws RecognitionException {
        Token INT12=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:330:11: ( ')' | ',' INT morecol )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:330:13: ')'
                    {
                    match(input,18,FOLLOW_18_in_morecol1487); 

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:334:9: ',' INT morecol
                    {
                    match(input,25,FOLLOW_25_in_morecol1525); 
                    INT12=(Token)match(input,INT,FOLLOW_INT_in_morecol1544); 
                     try { list.add(Integer.parseInt((INT12!=null?INT12.getText():null)));} catch(Exception e) { } 
                    pushFollow(FOLLOW_morecol_in_morecol1570);
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:342:1: xypart : ',' INT ')' '<<' input ;
    public final void xypart() throws RecognitionException {
        Token INT13=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:342:9: ( ',' INT ')' '<<' input )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:342:12: ',' INT ')' '<<' input
            {
            match(input,25,FOLLOW_25_in_xypart1610); 
            INT13=(Token)match(input,INT,FOLLOW_INT_in_xypart1612); 
            match(input,18,FOLLOW_18_in_xypart1615); 
            match(input,19,FOLLOW_19_in_xypart1617); 
            pushFollow(FOLLOW_input_in_xypart1619);
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:348:1: npart : INT ;
    public final void npart() throws RecognitionException {
        Token INT14=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:348:7: ( INT )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:348:9: INT
            {
            INT14=(Token)match(input,INT,FOLLOW_INT_in_npart1642); 
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:352:1: idpart : '<<' input '(' INT ')' ;
    public final void idpart() throws RecognitionException {
        Token INT15=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:352:9: ( '<<' input '(' INT ')' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:352:12: '<<' input '(' INT ')'
            {
            match(input,19,FOLLOW_19_in_idpart1699); 
            pushFollow(FOLLOW_input_in_idpart1701);
            input();

            state._fsp--;

            match(input,17,FOLLOW_17_in_idpart1704); 
            INT15=(Token)match(input,INT,FOLLOW_INT_in_idpart1706); 
            match(input,18,FOLLOW_18_in_idpart1708); 
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:357:1: levelofsignificance : '<<' input '(' INT ',' DOUBLE ')' ;
    public final void levelofsignificance() throws RecognitionException {
        Token INT16=null;
        Token DOUBLE17=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:357:21: ( '<<' input '(' INT ',' DOUBLE ')' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:357:23: '<<' input '(' INT ',' DOUBLE ')'
            {
            match(input,19,FOLLOW_19_in_levelofsignificance1738); 
            pushFollow(FOLLOW_input_in_levelofsignificance1740);
            input();

            state._fsp--;

            match(input,17,FOLLOW_17_in_levelofsignificance1743); 
            INT16=(Token)match(input,INT,FOLLOW_INT_in_levelofsignificance1745); 
            match(input,25,FOLLOW_25_in_levelofsignificance1748); 
             try { n=Integer.parseInt((INT16!=null?INT16.getText():null)); }catch(Exception e) { } 
            DOUBLE17=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_levelofsignificance1770); 
            match(input,18,FOLLOW_18_in_levelofsignificance1773); 
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:361:1: out : '>>' ID ;
    public final void out() throws RecognitionException {
        Token ID18=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:361:7: ( '>>' ID )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:361:9: '>>' ID
            {
            match(input,30,FOLLOW_30_in_out1802); 
            ID18=(Token)match(input,ID,FOLLOW_ID_in_out1805); 
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:367:1: ext : ID ;
    public final void ext() throws RecognitionException {
        Token ID19=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:367:7: ( ID )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:367:12: ID
            {
            ID19=(Token)match(input,ID,FOLLOW_ID_in_ext1837); 
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
    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:371:1: input : ( ID | ID '.' ext );
    public final void input() throws RecognitionException {
        Token ID20=null;
        Token ID21=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:371:11: ( ID | ID '.' ext )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==31) ) {
                    alt13=2;
                }
                else if ( (LA13_1==EOF||LA13_1==17) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:371:13: ID
                    {
                    ID20=(Token)match(input,ID,FOLLOW_ID_in_input1871); 
                      try {  ip=(ID20!=null?ID20.getText():null);} catch(Exception e) { } 

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:373:7: ID '.' ext
                    {
                    ID21=(Token)match(input,ID,FOLLOW_ID_in_input1893); 
                    match(input,31,FOLLOW_31_in_input1897); 
                      try {ip=(ID21!=null?ID21.getText():null);}catch(Exception e) { } 
                    pushFollow(FOLLOW_ext_in_input1917);
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


 

    public static final BitSet FOLLOW_12_in_start38 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_13_in_start40 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_14_in_start42 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_15_in_start44 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EOF_in_start48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sigmax_in_start66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_sigmax94 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_sigmax97 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_sigmax99 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_sigmax101 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_sigmax103 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_input_in_sigmax105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sigmaxsquare_in_sigmax134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_sigmaxsquare162 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_sigmaxsquare165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_sigmaxsquare167 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_sigmaxsquare169 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_sigmaxsquare171 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_input_in_sigmaxsquare173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sigmaxy_in_sigmaxsquare201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_sigmaxy226 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_sigmaxy229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_sigmaxy231 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_xypart_in_sigmaxy252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mean_in_sigmaxy283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_mean309 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_mean312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_mean314 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_mean335 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idpart_in_mean348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_corr_in_mean387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_corr415 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_corr418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_corr420 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_xypart_in_corr437 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_corr455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_npart_in_corr457 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_corr459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_corrmatrix_in_corr556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_corrmatrix587 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_corrmatrix619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_corrmatrix623 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_corrmatrix661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ofpart_in_corrmatrix680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplereg_in_corrmatrix715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_multiplereg747 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_multiplereg780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_multiplereg783 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_multiplereg819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_mulregpart_in_multiplereg842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forwardselection_in_multiplereg867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_forwardselection898 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_forwardselection913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_forwardselection915 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_forwardselection944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_forwardpart_in_forwardselection956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_help_in_forwardselection972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_help1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_ofpart1063 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_morecol_in_ofpart1092 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idpart_in_ofpart1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_mulregpart1192 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_morecol_in_mulregpart1222 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idpart_in_mulregpart1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_forwardpart1317 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_morecol_in_forwardpart1367 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_levelofsignificance_in_forwardpart1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_morecol1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_morecol1525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_morecol1544 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_morecol_in_morecol1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_xypart1610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_xypart1612 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_xypart1615 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_xypart1617 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_input_in_xypart1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_npart1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_idpart1699 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_input_in_idpart1701 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_idpart1704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_idpart1706 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_idpart1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_levelofsignificance1738 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_input_in_levelofsignificance1740 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_levelofsignificance1743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_levelofsignificance1745 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_levelofsignificance1748 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DOUBLE_in_levelofsignificance1770 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_levelofsignificance1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_out1802 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_out1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ext1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_input1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_input1893 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_input1897 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ext_in_input1917 = new BitSet(new long[]{0x0000000000000002L});

}