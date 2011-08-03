// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g 2011-08-03 12:27:37

package com.zinnia.nectar.regression.antlr.language.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PrimitiveGrammarLexer extends Lexer {
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
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__16=16;
    public static final int WS=7;
    public static final int ESC_SEQ=8;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int DOUBLE=5;
    public static final int STRING=9;

    // delegates
    // delegators

    public PrimitiveGrammarLexer() {;} 
    public PrimitiveGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PrimitiveGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:7:7: ( '\\n' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:7:9: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:8:7: ( ' ' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:8:9: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:9:7: ( 'sigmax' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:9:9: 'sigmax'
            {
            match("sigmax"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:10:7: ( '(' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:10:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:11:7: ( ')' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:11:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:12:7: ( '<<' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:12:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:13:7: ( 'sigmaxsquare' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:13:9: 'sigmaxsquare'
            {
            match("sigmaxsquare"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:14:7: ( 'sigmaxy' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:14:9: 'sigmaxy'
            {
            match("sigmaxy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:15:7: ( 'mean' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:15:9: 'mean'
            {
            match("mean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:16:7: ( 'corr' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:16:9: 'corr'
            {
            match("corr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:17:7: ( 'corrmatrix' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:17:9: 'corrmatrix'
            {
            match("corrmatrix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:18:7: ( ',' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:19:7: ( 'multiplereg' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:19:9: 'multiplereg'
            {
            match("multiplereg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:20:7: ( 'forwardselection' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:20:9: 'forwardselection'
            {
            match("forwardselection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:21:7: ( 'HELP' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:21:9: 'HELP'
            {
            match("HELP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:22:7: ( 'help' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:22:9: 'help'
            {
            match("help"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:23:7: ( '>>' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:23:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:24:7: ( '.' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:24:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:383:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' | 'a' .. 'z' | 'A' .. 'Z' )* )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:383:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' | 'a' .. 'z' | 'A' .. 'Z' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:383:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' | 'a' .. 'z' | 'A' .. 'Z' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:
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
            	    break loop1;
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:386:5: ( ( '0' .. '9' )+ )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:386:7: ( '0' .. '9' )+
            {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:386:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:386:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:390:8: ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:390:10: ( '0' .. '9' )* '.' ( '0' .. '9' )+
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:390:10: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:390:11: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('.'); 
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:390:26: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:390:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:390:40: ( '0' .. '9' )+
                    {
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:390:40: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:390:41: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:392:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:392:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:400:5: ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:400:8: '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\''
            {
            match('\''); 
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:400:13: ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:400:15: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:400:25: ~ ( '\\\\' | '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:404:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:404:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
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
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:408:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt8=1;
                    }
                    break;
                case 'u':
                    {
                    alt8=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:408:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:409:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:410:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:415:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\\') ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>='0' && LA9_1<='3')) ) {
                    int LA9_2 = input.LA(3);

                    if ( ((LA9_2>='0' && LA9_2<='7')) ) {
                        int LA9_4 = input.LA(4);

                        if ( ((LA9_4>='0' && LA9_4<='7')) ) {
                            alt9=1;
                        }
                        else {
                            alt9=2;}
                    }
                    else {
                        alt9=3;}
                }
                else if ( ((LA9_1>='4' && LA9_1<='7')) ) {
                    int LA9_3 = input.LA(3);

                    if ( ((LA9_3>='0' && LA9_3<='7')) ) {
                        alt9=2;
                    }
                    else {
                        alt9=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:415:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:415:14: ( '0' .. '3' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:415:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:415:25: ( '0' .. '7' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:415:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:415:36: ( '0' .. '7' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:415:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:416:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:416:14: ( '0' .. '7' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:416:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:416:25: ( '0' .. '7' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:416:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:417:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:417:14: ( '0' .. '7' )
                    // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:417:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:422:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:422:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | ID | INT | DOUBLE | WS | STRING )
        int alt10=23;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:118: ID
                {
                mID(); 

                }
                break;
            case 20 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:121: INT
                {
                mINT(); 

                }
                break;
            case 21 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:125: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 22 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:132: WS
                {
                mWS(); 

                }
                break;
            case 23 :
                // com/zinnia/nectar/regression/antlr/language/parser/PrimitiveGrammar.g:1:135: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA6_eotS =
        "\1\uffff\1\3\2\uffff";
    static final String DFA6_eofS =
        "\4\uffff";
    static final String DFA6_minS =
        "\2\56\2\uffff";
    static final String DFA6_maxS =
        "\2\71\2\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\4\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "390:1: DOUBLE : ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ );";
        }
    }
    static final String DFA10_eotS =
        "\3\uffff\1\17\3\uffff\2\17\1\uffff\3\17\1\uffff\1\34\1\uffff\1\36"+
        "\4\uffff\7\17\3\uffff\10\17\1\56\1\17\1\61\1\17\1\63\1\64\1\17\1"+
        "\uffff\2\17\1\uffff\1\17\2\uffff\1\73\4\17\1\100\1\uffff\4\17\1"+
        "\uffff\11\17\1\116\2\17\1\121\1\uffff\1\17\1\123\1\uffff\1\17\1"+
        "\uffff\3\17\1\130\1\uffff";
    static final String DFA10_eofS =
        "\131\uffff";
    static final String DFA10_minS =
        "\1\11\2\uffff\1\151\3\uffff\1\145\1\157\1\uffff\1\157\1\105\1\145"+
        "\1\uffff\1\60\1\uffff\1\56\4\uffff\1\147\1\141\1\154\2\162\1\114"+
        "\1\154\3\uffff\1\155\1\156\1\164\1\162\1\167\1\120\1\160\1\141\1"+
        "\56\1\151\1\56\1\141\2\56\1\170\1\uffff\1\160\1\141\1\uffff\1\162"+
        "\2\uffff\1\56\1\154\1\164\1\144\1\161\1\56\1\uffff\1\145\1\162\1"+
        "\163\1\165\1\uffff\1\162\1\151\1\145\1\141\1\145\1\170\1\154\1\162"+
        "\1\147\1\56\2\145\1\56\1\uffff\1\143\1\56\1\uffff\1\164\1\uffff"+
        "\1\151\1\157\1\156\1\56\1\uffff";
    static final String DFA10_maxS =
        "\1\172\2\uffff\1\151\3\uffff\1\165\1\157\1\uffff\1\157\1\105\1\145"+
        "\1\uffff\1\71\1\uffff\1\71\4\uffff\1\147\1\141\1\154\2\162\1\114"+
        "\1\154\3\uffff\1\155\1\156\1\164\1\162\1\167\1\120\1\160\1\141\1"+
        "\172\1\151\1\172\1\141\2\172\1\170\1\uffff\1\160\1\141\1\uffff\1"+
        "\162\2\uffff\1\172\1\154\1\164\1\144\1\161\1\172\1\uffff\1\145\1"+
        "\162\1\163\1\165\1\uffff\1\162\1\151\1\145\1\141\1\145\1\170\1\154"+
        "\1\162\1\147\1\172\2\145\1\172\1\uffff\1\143\1\172\1\uffff\1\164"+
        "\1\uffff\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\2\uffff\1\14\3\uffff\1\21\1"+
        "\uffff\1\23\1\uffff\1\26\1\27\1\1\1\2\7\uffff\1\22\1\25\1\24\17"+
        "\uffff\1\11\2\uffff\1\12\1\uffff\1\17\1\20\6\uffff\1\3\4\uffff\1"+
        "\10\15\uffff\1\13\2\uffff\1\15\1\uffff\1\7\4\uffff\1\16";
    static final String DFA10_specialS =
        "\131\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\21\1\1\2\uffff\1\21\22\uffff\1\2\6\uffff\1\22\1\4\1\5\2\uffff"+
            "\1\11\1\uffff\1\16\1\uffff\12\20\2\uffff\1\6\1\uffff\1\15\2"+
            "\uffff\7\17\1\13\22\17\4\uffff\1\17\1\uffff\2\17\1\10\2\17\1"+
            "\12\1\17\1\14\4\17\1\7\5\17\1\3\7\17",
            "",
            "",
            "\1\25",
            "",
            "",
            "",
            "\1\26\17\uffff\1\27",
            "\1\30",
            "",
            "\1\31",
            "\1\32",
            "\1\33",
            "",
            "\12\35",
            "",
            "\1\35\1\uffff\12\20",
            "",
            "",
            "",
            "",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "",
            "",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\57",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\14\17"+
            "\1\60\15\17",
            "\1\62",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\65",
            "",
            "\1\66",
            "\1\67",
            "",
            "\1\70",
            "",
            "",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\22\17"+
            "\1\71\5\17\1\72\1\17",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\117",
            "\1\120",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\1\122",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\1\124",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\17\1\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | ID | INT | DOUBLE | WS | STRING );";
        }
    }
 

}