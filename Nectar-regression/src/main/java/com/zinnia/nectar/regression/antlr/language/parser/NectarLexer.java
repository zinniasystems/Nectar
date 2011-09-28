// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g 2011-09-28 13:48:05

package com.zinnia.nectar.regression.antlr.language.parser;


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
public class NectarLexer extends Lexer {
    public static final int HELP=6;
    public static final int EXTN=21;
    public static final int COVMATRIX=17;
    public static final int CORRMATRIX=12;
    public static final int SIGMAX=7;
    public static final int MEAN=10;
    public static final int MULTI_COMMENT=29;
    public static final int MULTIPLEREG=13;
    public static final int WHITESPACE=27;
    public static final int SORT=15;
    public static final int FLOAT=25;
    public static final int INT=24;
    public static final int ID=23;
    public static final int SPACE=26;
    public static final int EOF=-1;
    public static final int SIGMAXY=8;
    public static final int RIGHT_PAREN=5;
    public static final int STDIN_OP=18;
    public static final int NEWLINE=22;
    public static final int COV=16;
    public static final int COMMA=20;
    public static final int FORWARDSELECTION=14;
    public static final int DOUBLE=30;
    public static final int LEFT_PAREN=4;
    public static final int SINGLE_COMMENT=28;
    public static final int SIGMAXSQUARE=9;
    public static final int DOT=19;
    public static final int CORR=11;

    // delegates
    // delegators

    public NectarLexer() {;} 
    public NectarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public NectarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g"; }

    // $ANTLR start "LEFT_PAREN"
    public final void mLEFT_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:30:13: ( '(' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:30:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_PAREN"

    // $ANTLR start "RIGHT_PAREN"
    public final void mRIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:32:13: ( ')' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:32:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_PAREN"

    // $ANTLR start "HELP"
    public final void mHELP() throws RecognitionException {
        try {
            int _type = HELP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:34:7: ( '?' | 'help' | 'HELP' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case '?':
                {
                alt1=1;
                }
                break;
            case 'h':
                {
                alt1=2;
                }
                break;
            case 'H':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:34:9: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:34:15: 'help'
                    {
                    match("help"); 


                    }
                    break;
                case 3 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:34:23: 'HELP'
                    {
                    match("HELP"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HELP"

    // $ANTLR start "SIGMAX"
    public final void mSIGMAX() throws RecognitionException {
        try {
            int _type = SIGMAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:36:9: ( 'sigmax' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:36:11: 'sigmax'
            {
            match("sigmax"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIGMAX"

    // $ANTLR start "SIGMAXY"
    public final void mSIGMAXY() throws RecognitionException {
        try {
            int _type = SIGMAXY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:38:9: ( 'sigmaxy' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:38:11: 'sigmaxy'
            {
            match("sigmaxy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIGMAXY"

    // $ANTLR start "SIGMAXSQUARE"
    public final void mSIGMAXSQUARE() throws RecognitionException {
        try {
            int _type = SIGMAXSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:40:14: ( 'sigmaxsquare' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:40:16: 'sigmaxsquare'
            {
            match("sigmaxsquare"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIGMAXSQUARE"

    // $ANTLR start "MEAN"
    public final void mMEAN() throws RecognitionException {
        try {
            int _type = MEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:42:6: ( 'mean' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:42:8: 'mean'
            {
            match("mean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MEAN"

    // $ANTLR start "CORR"
    public final void mCORR() throws RecognitionException {
        try {
            int _type = CORR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:44:6: ( 'corr' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:44:8: 'corr'
            {
            match("corr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CORR"

    // $ANTLR start "CORRMATRIX"
    public final void mCORRMATRIX() throws RecognitionException {
        try {
            int _type = CORRMATRIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:46:12: ( 'corrmatrix' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:46:13: 'corrmatrix'
            {
            match("corrmatrix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CORRMATRIX"

    // $ANTLR start "MULTIPLEREG"
    public final void mMULTIPLEREG() throws RecognitionException {
        try {
            int _type = MULTIPLEREG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:48:13: ( 'multiplereg' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:48:15: 'multiplereg'
            {
            match("multiplereg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTIPLEREG"

    // $ANTLR start "FORWARDSELECTION"
    public final void mFORWARDSELECTION() throws RecognitionException {
        try {
            int _type = FORWARDSELECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:50:18: ( 'forwardselection' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:50:20: 'forwardselection'
            {
            match("forwardselection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORWARDSELECTION"

    // $ANTLR start "SORT"
    public final void mSORT() throws RecognitionException {
        try {
            int _type = SORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:52:6: ( 'sort' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:52:8: 'sort'
            {
            match("sort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SORT"

    // $ANTLR start "COV"
    public final void mCOV() throws RecognitionException {
        try {
            int _type = COV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:54:4: ( 'cov' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:54:6: 'cov'
            {
            match("cov"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COV"

    // $ANTLR start "COVMATRIX"
    public final void mCOVMATRIX() throws RecognitionException {
        try {
            int _type = COVMATRIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:56:11: ( 'covmatrix' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:56:13: 'covmatrix'
            {
            match("covmatrix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COVMATRIX"

    // $ANTLR start "STDIN_OP"
    public final void mSTDIN_OP() throws RecognitionException {
        try {
            int _type = STDIN_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:58:10: ( '<<' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:58:13: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STDIN_OP"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:60:5: ( '.' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:60:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:62:7: ( ',' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:62:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EXTN"
    public final void mEXTN() throws RecognitionException {
        try {
            int _type = EXTN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:64:7: ( ( 'csv' | 'txt' ) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:64:9: ( 'csv' | 'txt' )
            {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:64:9: ( 'csv' | 'txt' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='c') ) {
                alt2=1;
            }
            else if ( (LA2_0=='t') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:64:10: 'csv'
                    {
                    match("csv"); 


                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:64:18: 'txt'
                    {
                    match("txt"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTN"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:66:9: ( ( ( '\\r' )? '\\n' )+ )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:66:11: ( ( '\\r' )? '\\n' )+
            {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:66:11: ( ( '\\r' )? '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:66:12: ( '\\r' )? '\\n'
            	    {
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:66:12: ( '\\r' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0=='\r') ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:66:12: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:68:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' | 'a' .. 'z' | 'A' .. 'Z' )* )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:68:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' | 'a' .. 'z' | 'A' .. 'Z' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:68:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' | 'a' .. 'z' | 'A' .. 'Z' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='.'||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:72:17: ( INT '.' ( '0' .. '9' )+ )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:72:19: INT '.' ( '0' .. '9' )+
            {
            mINT(); 
            match('.'); 
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:72:27: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:72:27: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:74:17: ( ' ' | '\\t' )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:76:13: ( ( SPACE )+ )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:76:15: ( SPACE )+
            {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:76:15: ( SPACE )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:76:15: SPACE
            	    {
            	    mSPACE(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "SINGLE_COMMENT"
    public final void mSINGLE_COMMENT() throws RecognitionException {
        try {
            int _type = SINGLE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:78:17: ( '//' (~ ( '\\r' | '\\n' ) )* NEWLINE )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:78:19: '//' (~ ( '\\r' | '\\n' ) )* NEWLINE
            {
            match("//"); 

            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:78:24: (~ ( '\\r' | '\\n' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:78:24: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            mNEWLINE(); 
             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SINGLE_COMMENT"

    // $ANTLR start "MULTI_COMMENT"
    public final void mMULTI_COMMENT() throws RecognitionException {
        try {
            int _type = MULTI_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:83:5: ( '/*' ( . )* '*/' ( NEWLINE )? )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:83:7: '/*' ( . )* '*/' ( NEWLINE )?
            {
            match("/*"); 

            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:83:12: ( . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:83:12: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 

            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:83:20: ( NEWLINE )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:83:20: NEWLINE
                    {
                    mNEWLINE(); 

                    }
                    break;

            }

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTI_COMMENT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:85:5: ( ( '0' .. '9' )+ )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:85:7: ( '0' .. '9' )+
            {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:85:7: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:85:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:88:8: ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:88:10: ( '0' .. '9' )* '.' ( '0' .. '9' )+
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:88:10: ( '0' .. '9' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:88:11: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('.'); 
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:88:26: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:88:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:88:40: ( '0' .. '9' )+
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:88:40: ( '0' .. '9' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:88:41: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE"

    public void mTokens() throws RecognitionException {
        // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:8: ( LEFT_PAREN | RIGHT_PAREN | HELP | SIGMAX | SIGMAXY | SIGMAXSQUARE | MEAN | CORR | CORRMATRIX | MULTIPLEREG | FORWARDSELECTION | SORT | COV | COVMATRIX | STDIN_OP | DOT | COMMA | EXTN | NEWLINE | ID | WHITESPACE | SINGLE_COMMENT | MULTI_COMMENT | INT | DOUBLE )
        int alt16=25;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:10: LEFT_PAREN
                {
                mLEFT_PAREN(); 

                }
                break;
            case 2 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:21: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 

                }
                break;
            case 3 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:33: HELP
                {
                mHELP(); 

                }
                break;
            case 4 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:38: SIGMAX
                {
                mSIGMAX(); 

                }
                break;
            case 5 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:45: SIGMAXY
                {
                mSIGMAXY(); 

                }
                break;
            case 6 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:53: SIGMAXSQUARE
                {
                mSIGMAXSQUARE(); 

                }
                break;
            case 7 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:66: MEAN
                {
                mMEAN(); 

                }
                break;
            case 8 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:71: CORR
                {
                mCORR(); 

                }
                break;
            case 9 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:76: CORRMATRIX
                {
                mCORRMATRIX(); 

                }
                break;
            case 10 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:87: MULTIPLEREG
                {
                mMULTIPLEREG(); 

                }
                break;
            case 11 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:99: FORWARDSELECTION
                {
                mFORWARDSELECTION(); 

                }
                break;
            case 12 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:116: SORT
                {
                mSORT(); 

                }
                break;
            case 13 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:121: COV
                {
                mCOV(); 

                }
                break;
            case 14 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:125: COVMATRIX
                {
                mCOVMATRIX(); 

                }
                break;
            case 15 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:135: STDIN_OP
                {
                mSTDIN_OP(); 

                }
                break;
            case 16 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:144: DOT
                {
                mDOT(); 

                }
                break;
            case 17 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:148: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 18 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:154: EXTN
                {
                mEXTN(); 

                }
                break;
            case 19 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:159: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 20 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:167: ID
                {
                mID(); 

                }
                break;
            case 21 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:170: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 22 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:181: SINGLE_COMMENT
                {
                mSINGLE_COMMENT(); 

                }
                break;
            case 23 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:196: MULTI_COMMENT
                {
                mMULTI_COMMENT(); 

                }
                break;
            case 24 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:210: INT
                {
                mINT(); 

                }
                break;
            case 25 :
                // com/zinnia/nectar/regression/antlr/language/parser/NectarLexer.g:1:214: DOUBLE
                {
                mDOUBLE(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA15_eotS =
        "\1\uffff\1\3\2\uffff";
    static final String DFA15_eofS =
        "\4\uffff";
    static final String DFA15_minS =
        "\2\56\2\uffff";
    static final String DFA15_maxS =
        "\2\71\2\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA15_specialS =
        "\4\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "88:1: DOUBLE : ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ );";
        }
    }
    static final String DFA16_eotS =
        "\4\uffff\6\17\1\uffff\1\34\1\uffff\1\17\4\uffff\1\41\11\17\2\uffff"+
        "\1\17\3\uffff\7\17\1\65\1\66\1\17\1\66\2\3\1\17\1\71\1\72\1\17\1"+
        "\75\1\17\2\uffff\2\17\2\uffff\2\17\1\uffff\2\17\1\107\4\17\1\114"+
        "\1\17\1\uffff\4\17\1\uffff\10\17\1\132\3\17\1\136\1\uffff\2\17\1"+
        "\141\1\uffff\1\17\1\143\1\uffff\1\17\1\uffff\3\17\1\150\1\uffff";
    static final String DFA16_eofS =
        "\151\uffff";
    static final String DFA16_minS =
        "\1\11\3\uffff\1\145\1\105\1\151\1\145\2\157\1\uffff\1\60\1\uffff"+
        "\1\170\3\uffff\1\52\1\56\1\154\1\114\1\147\1\162\1\141\1\154\1\162"+
        "\1\166\1\162\2\uffff\1\164\3\uffff\1\160\1\120\1\155\1\164\1\156"+
        "\1\164\1\162\2\56\1\167\3\56\1\141\2\56\1\151\1\56\1\141\2\uffff"+
        "\1\141\1\170\2\uffff\1\160\1\141\1\uffff\1\164\1\162\1\56\1\154"+
        "\1\164\1\162\1\144\1\56\1\161\1\uffff\1\145\1\162\1\151\1\163\1"+
        "\uffff\1\165\1\162\1\151\1\170\1\145\1\141\1\145\1\170\1\56\1\154"+
        "\1\162\1\147\1\56\1\uffff\2\145\1\56\1\uffff\1\143\1\56\1\uffff"+
        "\1\164\1\uffff\1\151\1\157\1\156\1\56\1\uffff";
    static final String DFA16_maxS =
        "\1\172\3\uffff\1\145\1\105\1\157\1\165\1\163\1\157\1\uffff\1\71"+
        "\1\uffff\1\170\3\uffff\1\57\1\71\1\154\1\114\1\147\1\162\1\141\1"+
        "\154\2\166\1\162\2\uffff\1\164\3\uffff\1\160\1\120\1\155\1\164\1"+
        "\156\1\164\1\162\2\172\1\167\3\172\1\141\2\172\1\151\1\172\1\141"+
        "\2\uffff\1\141\1\170\2\uffff\1\160\1\141\1\uffff\1\164\1\162\1\172"+
        "\1\154\1\164\1\162\1\144\1\172\1\161\1\uffff\1\145\1\162\1\151\1"+
        "\163\1\uffff\1\165\1\162\1\151\1\170\1\145\1\141\1\145\1\170\1\172"+
        "\1\154\1\162\1\147\1\172\1\uffff\2\145\1\172\1\uffff\1\143\1\172"+
        "\1\uffff\1\164\1\uffff\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\6\uffff\1\17\1\uffff\1\21\1\uffff\1\23\1\24"+
        "\1\25\13\uffff\1\20\1\31\1\uffff\1\26\1\27\1\30\23\uffff\1\15\1"+
        "\22\2\uffff\1\14\1\7\2\uffff\1\10\11\uffff\1\4\4\uffff\1\5\15\uffff"+
        "\1\16\3\uffff\1\11\2\uffff\1\12\1\uffff\1\6\4\uffff\1\13";
    static final String DFA16_specialS =
        "\151\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\20\1\16\2\uffff\1\16\22\uffff\1\20\7\uffff\1\1\1\2\2\uffff"+
            "\1\14\1\uffff\1\13\1\21\12\22\2\uffff\1\12\2\uffff\1\3\1\uffff"+
            "\7\17\1\5\22\17\4\uffff\1\17\1\uffff\2\17\1\10\2\17\1\11\1\17"+
            "\1\4\4\17\1\7\5\17\1\6\1\15\6\17",
            "",
            "",
            "",
            "\1\23",
            "\1\24",
            "\1\25\5\uffff\1\26",
            "\1\27\17\uffff\1\30",
            "\1\31\3\uffff\1\32",
            "\1\33",
            "",
            "\12\35",
            "",
            "\1\36",
            "",
            "",
            "",
            "\1\40\4\uffff\1\37",
            "\1\35\1\uffff\12\22",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50\3\uffff\1\51",
            "\1\52",
            "\1\53",
            "",
            "",
            "\1\54",
            "",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\14\17"+
            "\1\64\15\17",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\67",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\70",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\73",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\14\17"+
            "\1\74\15\17",
            "\1\76",
            "",
            "",
            "\1\77",
            "\1\100",
            "",
            "",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\22\17"+
            "\1\106\5\17\1\105\1\17",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\1\137",
            "\1\140",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\1\142",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( LEFT_PAREN | RIGHT_PAREN | HELP | SIGMAX | SIGMAXY | SIGMAXSQUARE | MEAN | CORR | CORRMATRIX | MULTIPLEREG | FORWARDSELECTION | SORT | COV | COVMATRIX | STDIN_OP | DOT | COMMA | EXTN | NEWLINE | ID | WHITESPACE | SINGLE_COMMENT | MULTI_COMMENT | INT | DOUBLE );";
        }
    }
 

}