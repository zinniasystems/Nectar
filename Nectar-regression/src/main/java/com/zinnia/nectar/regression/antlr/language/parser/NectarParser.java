// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g 2011-10-03 15:18:48

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


import org.antlr.runtime.tree.*;

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
public class NectarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LEFT_PAREN", "RIGHT_PAREN", "FORWARDSLASH", "HELP", "SIGMAX", "SIGMAXY", "SIGMAXSQUARE", "MEAN", "CORR", "CORRMATRIX", "MULTIPLEREG", "FORWARDSELECTION", "SORT", "COV", "COVMATRIX", "STDIN_OP", "DOT", "COMMA", "EXTN", "NEWLINE", "ID", "INT", "FLOAT", "SPACE", "WHITESPACE", "SINGLE_COMMENT", "MULTI_COMMENT", "DOUBLE", "TOK_SIGMAX", "TOK_SIGMAXY", "TOK_SIGMAXSQUARE", "TOK_MEAN", "TOK_CORR", "TOK_CORRMATRIX", "TOK_MULTIPLEREG", "TOK_FORWARDSELECTION", "TOK_SORT", "TOK_COV", "TOK_COVMATRIX", "TOK_HELP"
    };
    public static final int HELP=7;
    public static final int EXTN=22;
    public static final int COVMATRIX=18;
    public static final int TOK_FORWARDSELECTION=39;
    public static final int FORWARDSLASH=6;
    public static final int CORRMATRIX=13;
    public static final int MEAN=11;
    public static final int MULTI_COMMENT=30;
    public static final int TOK_COV=41;
    public static final int MULTIPLEREG=14;
    public static final int TOK_COVMATRIX=42;
    public static final int FLOAT=26;
    public static final int ID=24;
    public static final int SPACE=27;
    public static final int EOF=-1;
    public static final int SIGMAXY=9;
    public static final int RIGHT_PAREN=5;
    public static final int STDIN_OP=19;
    public static final int COV=17;
    public static final int COMMA=21;
    public static final int TOK_CORR=36;
    public static final int DOUBLE=31;
    public static final int SINGLE_COMMENT=29;
    public static final int SIGMAXSQUARE=10;
    public static final int DOT=20;
    public static final int SIGMAX=8;
    public static final int TOK_SIGMAXSQUARE=34;
    public static final int SORT=16;
    public static final int WHITESPACE=28;
    public static final int INT=25;
    public static final int TOK_SORT=40;
    public static final int TOK_MEAN=35;
    public static final int TOK_MULTIPLEREG=38;
    public static final int TOK_CORRMATRIX=37;
    public static final int NEWLINE=23;
    public static final int FORWARDSELECTION=15;
    public static final int LEFT_PAREN=4;
    public static final int TOK_SIGMAX=32;
    public static final int TOK_HELP=43;
    public static final int TOK_SIGMAXY=33;
    public static final int CORR=12;

    // delegates
    // delegators


        public NectarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public NectarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return NectarParser.tokenNames; }
    public String getGrammarFileName() { return "com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g"; }

     
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


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:1: start : statement EOF ;
    public final NectarParser.start_return start() throws RecognitionException {
        NectarParser.start_return retval = new NectarParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        NectarParser.statement_return statement1 = null;


        Object EOF2_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:7: ( statement EOF )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:9: statement EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_in_start105);
            statement1=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_start107); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:77:1: statement : ( sigmax | sigmaxy | sigmaxsquare | mean | correlation | correlationmatrix | multiplereg | forwardselection | sort | cov | covmatrix | help );
    public final NectarParser.statement_return statement() throws RecognitionException {
        NectarParser.statement_return retval = new NectarParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        NectarParser.sigmax_return sigmax3 = null;

        NectarParser.sigmaxy_return sigmaxy4 = null;

        NectarParser.sigmaxsquare_return sigmaxsquare5 = null;

        NectarParser.mean_return mean6 = null;

        NectarParser.correlation_return correlation7 = null;

        NectarParser.correlationmatrix_return correlationmatrix8 = null;

        NectarParser.multiplereg_return multiplereg9 = null;

        NectarParser.forwardselection_return forwardselection10 = null;

        NectarParser.sort_return sort11 = null;

        NectarParser.cov_return cov12 = null;

        NectarParser.covmatrix_return covmatrix13 = null;

        NectarParser.help_return help14 = null;



        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:77:11: ( sigmax | sigmaxy | sigmaxsquare | mean | correlation | correlationmatrix | multiplereg | forwardselection | sort | cov | covmatrix | help )
            int alt1=12;
            switch ( input.LA(1) ) {
            case SIGMAX:
                {
                alt1=1;
                }
                break;
            case SIGMAXY:
                {
                alt1=2;
                }
                break;
            case SIGMAXSQUARE:
                {
                alt1=3;
                }
                break;
            case MEAN:
                {
                alt1=4;
                }
                break;
            case CORR:
                {
                alt1=5;
                }
                break;
            case CORRMATRIX:
                {
                alt1=6;
                }
                break;
            case MULTIPLEREG:
                {
                alt1=7;
                }
                break;
            case FORWARDSELECTION:
                {
                alt1=8;
                }
                break;
            case SORT:
                {
                alt1=9;
                }
                break;
            case COV:
                {
                alt1=10;
                }
                break;
            case COVMATRIX:
                {
                alt1=11;
                }
                break;
            case HELP:
                {
                alt1=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:77:13: sigmax
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sigmax_in_statement123);
                    sigmax3=sigmax();

                    state._fsp--;

                    adaptor.addChild(root_0, sigmax3.getTree());

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:77:22: sigmaxy
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sigmaxy_in_statement127);
                    sigmaxy4=sigmaxy();

                    state._fsp--;

                    adaptor.addChild(root_0, sigmaxy4.getTree());

                    }
                    break;
                case 3 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:77:32: sigmaxsquare
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sigmaxsquare_in_statement131);
                    sigmaxsquare5=sigmaxsquare();

                    state._fsp--;

                    adaptor.addChild(root_0, sigmaxsquare5.getTree());

                    }
                    break;
                case 4 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:77:47: mean
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_mean_in_statement135);
                    mean6=mean();

                    state._fsp--;

                    adaptor.addChild(root_0, mean6.getTree());

                    }
                    break;
                case 5 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:77:53: correlation
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_correlation_in_statement138);
                    correlation7=correlation();

                    state._fsp--;

                    adaptor.addChild(root_0, correlation7.getTree());

                    }
                    break;
                case 6 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:77:67: correlationmatrix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_correlationmatrix_in_statement142);
                    correlationmatrix8=correlationmatrix();

                    state._fsp--;

                    adaptor.addChild(root_0, correlationmatrix8.getTree());

                    }
                    break;
                case 7 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:77:87: multiplereg
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_multiplereg_in_statement146);
                    multiplereg9=multiplereg();

                    state._fsp--;

                    adaptor.addChild(root_0, multiplereg9.getTree());

                    }
                    break;
                case 8 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:77:101: forwardselection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forwardselection_in_statement150);
                    forwardselection10=forwardselection();

                    state._fsp--;

                    adaptor.addChild(root_0, forwardselection10.getTree());

                    }
                    break;
                case 9 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:77:120: sort
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sort_in_statement154);
                    sort11=sort();

                    state._fsp--;

                    adaptor.addChild(root_0, sort11.getTree());

                    }
                    break;
                case 10 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:77:127: cov
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cov_in_statement158);
                    cov12=cov();

                    state._fsp--;

                    adaptor.addChild(root_0, cov12.getTree());

                    }
                    break;
                case 11 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:77:133: covmatrix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_covmatrix_in_statement162);
                    covmatrix13=covmatrix();

                    state._fsp--;

                    adaptor.addChild(root_0, covmatrix13.getTree());

                    }
                    break;
                case 12 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:77:145: help
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_help_in_statement166);
                    help14=help();

                    state._fsp--;

                    adaptor.addChild(root_0, help14.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class sigmax_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sigmax"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:80:1: sigmax : ( SIGMAX LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SIGMAX $column_no $ip) | SIGMAX LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ -> ^( TOK_SIGMAX $column_no $directory ( $filenameList $filenameList)+ ) );
    public final NectarParser.sigmax_return sigmax() throws RecognitionException {
        NectarParser.sigmax_return retval = new NectarParser.sigmax_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_no=null;
        Token ip=null;
        Token directory=null;
        Token SIGMAX15=null;
        Token LEFT_PAREN16=null;
        Token RIGHT_PAREN17=null;
        Token STDIN_OP18=null;
        Token SIGMAX19=null;
        Token LEFT_PAREN20=null;
        Token RIGHT_PAREN21=null;
        Token STDIN_OP22=null;
        Token filenameList=null;
        List list_filenameList=null;

        Object column_no_tree=null;
        Object ip_tree=null;
        Object directory_tree=null;
        Object SIGMAX15_tree=null;
        Object LEFT_PAREN16_tree=null;
        Object RIGHT_PAREN17_tree=null;
        Object STDIN_OP18_tree=null;
        Object SIGMAX19_tree=null;
        Object LEFT_PAREN20_tree=null;
        Object RIGHT_PAREN21_tree=null;
        Object STDIN_OP22_tree=null;
        Object filenameList_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FORWARDSLASH=new RewriteRuleTokenStream(adaptor,"token FORWARDSLASH");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SIGMAX=new RewriteRuleTokenStream(adaptor,"token SIGMAX");

         paraphrases.push("\n"+"USAGE :sigmax(column_no)<<input_file"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:83:1: ( SIGMAX LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SIGMAX $column_no $ip) | SIGMAX LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ -> ^( TOK_SIGMAX $column_no $directory ( $filenameList $filenameList)+ ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SIGMAX) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==LEFT_PAREN) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==INT) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==RIGHT_PAREN) ) {
                            int LA3_4 = input.LA(5);

                            if ( (LA3_4==STDIN_OP) ) {
                                int LA3_5 = input.LA(6);

                                if ( (LA3_5==ID) ) {
                                    int LA3_6 = input.LA(7);

                                    if ( (LA3_6==EOF) ) {
                                        alt3=1;
                                    }
                                    else if ( (LA3_6==FORWARDSLASH) ) {
                                        alt3=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 3, 6, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:83:3: SIGMAX LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP ip= ID
                    {
                    SIGMAX15=(Token)match(input,SIGMAX,FOLLOW_SIGMAX_in_sigmax207);  
                    stream_SIGMAX.add(SIGMAX15);

                    LEFT_PAREN16=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_sigmax209);  
                    stream_LEFT_PAREN.add(LEFT_PAREN16);

                    column_no=(Token)match(input,INT,FOLLOW_INT_in_sigmax213);  
                    stream_INT.add(column_no);

                    RIGHT_PAREN17=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_sigmax215);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN17);

                    STDIN_OP18=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_sigmax217);  
                    stream_STDIN_OP.add(STDIN_OP18);

                    ip=(Token)match(input,ID,FOLLOW_ID_in_sigmax221);  
                    stream_ID.add(ip);



                    // AST REWRITE
                    // elements: column_no, ip
                    // token labels: column_no, ip
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_column_no=new RewriteRuleTokenStream(adaptor,"token column_no",column_no);
                    RewriteRuleTokenStream stream_ip=new RewriteRuleTokenStream(adaptor,"token ip",ip);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:61: -> ^( TOK_SIGMAX $column_no $ip)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:83:64: ^( TOK_SIGMAX $column_no $ip)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_SIGMAX, "TOK_SIGMAX"), root_1);

                        adaptor.addChild(root_1, stream_column_no.nextNode());
                        adaptor.addChild(root_1, stream_ip.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:85:3: SIGMAX LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+
                    {
                    SIGMAX19=(Token)match(input,SIGMAX,FOLLOW_SIGMAX_in_sigmax247);  
                    stream_SIGMAX.add(SIGMAX19);

                    LEFT_PAREN20=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_sigmax249);  
                    stream_LEFT_PAREN.add(LEFT_PAREN20);

                    column_no=(Token)match(input,INT,FOLLOW_INT_in_sigmax253);  
                    stream_INT.add(column_no);

                    RIGHT_PAREN21=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_sigmax255);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN21);

                    STDIN_OP22=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_sigmax257);  
                    stream_STDIN_OP.add(STDIN_OP22);

                    directory=(Token)match(input,ID,FOLLOW_ID_in_sigmax261);  
                    stream_ID.add(directory);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:85:69: (filenameList+= FORWARDSLASH filenameList+= ID )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==FORWARDSLASH) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:85:70: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    filenameList=(Token)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_sigmax266);  
                    	    stream_FORWARDSLASH.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    filenameList=(Token)match(input,ID,FOLLOW_ID_in_sigmax270);  
                    	    stream_ID.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);


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



                    // AST REWRITE
                    // elements: filenameList, column_no, directory, filenameList
                    // token labels: directory, column_no
                    // rule labels: retval
                    // token list labels: filenameList
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_directory=new RewriteRuleTokenStream(adaptor,"token directory",directory);
                    RewriteRuleTokenStream stream_column_no=new RewriteRuleTokenStream(adaptor,"token column_no",column_no);
                    RewriteRuleTokenStream stream_filenameList=new RewriteRuleTokenStream(adaptor,"token filenameList", list_filenameList);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 85:116: -> ^( TOK_SIGMAX $column_no $directory ( $filenameList $filenameList)+ )
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:85:119: ^( TOK_SIGMAX $column_no $directory ( $filenameList $filenameList)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_SIGMAX, "TOK_SIGMAX"), root_1);

                        adaptor.addChild(root_1, stream_column_no.nextNode());
                        adaptor.addChild(root_1, stream_directory.nextNode());
                        if ( !(stream_filenameList.hasNext()||stream_filenameList.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_filenameList.hasNext()||stream_filenameList.hasNext() ) {
                            adaptor.addChild(root_1, stream_filenameList.nextNode());
                            adaptor.addChild(root_1, stream_filenameList.nextNode());

                        }
                        stream_filenameList.reset();
                        stream_filenameList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sigmax"

    public static class sigmaxy_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sigmaxy"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:89:1: sigmaxy : ( SIGMAXY LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SIGMAXY $column_x $column_y $ip) | SIGMAXY LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ -> ^( TOK_SIGMAXY $column_x $column_y $directory ( $filenameList $filenameList)+ ) );
    public final NectarParser.sigmaxy_return sigmaxy() throws RecognitionException {
        NectarParser.sigmaxy_return retval = new NectarParser.sigmaxy_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_x=null;
        Token column_y=null;
        Token ip=null;
        Token directory=null;
        Token SIGMAXY23=null;
        Token LEFT_PAREN24=null;
        Token COMMA25=null;
        Token RIGHT_PAREN26=null;
        Token STDIN_OP27=null;
        Token SIGMAXY28=null;
        Token LEFT_PAREN29=null;
        Token COMMA30=null;
        Token RIGHT_PAREN31=null;
        Token STDIN_OP32=null;
        Token filenameList=null;
        List list_filenameList=null;

        Object column_x_tree=null;
        Object column_y_tree=null;
        Object ip_tree=null;
        Object directory_tree=null;
        Object SIGMAXY23_tree=null;
        Object LEFT_PAREN24_tree=null;
        Object COMMA25_tree=null;
        Object RIGHT_PAREN26_tree=null;
        Object STDIN_OP27_tree=null;
        Object SIGMAXY28_tree=null;
        Object LEFT_PAREN29_tree=null;
        Object COMMA30_tree=null;
        Object RIGHT_PAREN31_tree=null;
        Object STDIN_OP32_tree=null;
        Object filenameList_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FORWARDSLASH=new RewriteRuleTokenStream(adaptor,"token FORWARDSLASH");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SIGMAXY=new RewriteRuleTokenStream(adaptor,"token SIGMAXY");

         paraphrases.push("\n"+"USAGE :sigmaxy(column_no1,column_no2)<<input_file"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:92:1: ( SIGMAXY LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SIGMAXY $column_x $column_y $ip) | SIGMAXY LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ -> ^( TOK_SIGMAXY $column_x $column_y $directory ( $filenameList $filenameList)+ ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:92:3: SIGMAXY LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID
                    {
                    SIGMAXY23=(Token)match(input,SIGMAXY,FOLLOW_SIGMAXY_in_sigmaxy314);  
                    stream_SIGMAXY.add(SIGMAXY23);

                    LEFT_PAREN24=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_sigmaxy316);  
                    stream_LEFT_PAREN.add(LEFT_PAREN24);

                    column_x=(Token)match(input,INT,FOLLOW_INT_in_sigmaxy320);  
                    stream_INT.add(column_x);

                    COMMA25=(Token)match(input,COMMA,FOLLOW_COMMA_in_sigmaxy322);  
                    stream_COMMA.add(COMMA25);

                    column_y=(Token)match(input,INT,FOLLOW_INT_in_sigmaxy327);  
                    stream_INT.add(column_y);

                    RIGHT_PAREN26=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_sigmaxy329);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN26);

                    STDIN_OP27=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_sigmaxy331);  
                    stream_STDIN_OP.add(STDIN_OP27);

                    ip=(Token)match(input,ID,FOLLOW_ID_in_sigmaxy335);  
                    stream_ID.add(ip);



                    // AST REWRITE
                    // elements: column_x, ip, column_y
                    // token labels: column_x, column_y, ip
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_column_x=new RewriteRuleTokenStream(adaptor,"token column_x",column_x);
                    RewriteRuleTokenStream stream_column_y=new RewriteRuleTokenStream(adaptor,"token column_y",column_y);
                    RewriteRuleTokenStream stream_ip=new RewriteRuleTokenStream(adaptor,"token ip",ip);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 92:82: -> ^( TOK_SIGMAXY $column_x $column_y $ip)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:92:85: ^( TOK_SIGMAXY $column_x $column_y $ip)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_SIGMAXY, "TOK_SIGMAXY"), root_1);

                        adaptor.addChild(root_1, stream_column_x.nextNode());
                        adaptor.addChild(root_1, stream_column_y.nextNode());
                        adaptor.addChild(root_1, stream_ip.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:94:4: SIGMAXY LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+
                    {
                    SIGMAXY28=(Token)match(input,SIGMAXY,FOLLOW_SIGMAXY_in_sigmaxy360);  
                    stream_SIGMAXY.add(SIGMAXY28);

                    LEFT_PAREN29=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_sigmaxy362);  
                    stream_LEFT_PAREN.add(LEFT_PAREN29);

                    column_x=(Token)match(input,INT,FOLLOW_INT_in_sigmaxy366);  
                    stream_INT.add(column_x);

                    COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_sigmaxy368);  
                    stream_COMMA.add(COMMA30);

                    column_y=(Token)match(input,INT,FOLLOW_INT_in_sigmaxy373);  
                    stream_INT.add(column_y);

                    RIGHT_PAREN31=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_sigmaxy375);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN31);

                    STDIN_OP32=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_sigmaxy377);  
                    stream_STDIN_OP.add(STDIN_OP32);

                    directory=(Token)match(input,ID,FOLLOW_ID_in_sigmaxy381);  
                    stream_ID.add(directory);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:94:90: (filenameList+= FORWARDSLASH filenameList+= ID )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==FORWARDSLASH) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:94:91: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    filenameList=(Token)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_sigmaxy386);  
                    	    stream_FORWARDSLASH.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    filenameList=(Token)match(input,ID,FOLLOW_ID_in_sigmaxy390);  
                    	    stream_ID.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);


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



                    // AST REWRITE
                    // elements: column_x, directory, column_y, filenameList, filenameList
                    // token labels: directory, column_x, column_y
                    // rule labels: retval
                    // token list labels: filenameList
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_directory=new RewriteRuleTokenStream(adaptor,"token directory",directory);
                    RewriteRuleTokenStream stream_column_x=new RewriteRuleTokenStream(adaptor,"token column_x",column_x);
                    RewriteRuleTokenStream stream_column_y=new RewriteRuleTokenStream(adaptor,"token column_y",column_y);
                    RewriteRuleTokenStream stream_filenameList=new RewriteRuleTokenStream(adaptor,"token filenameList", list_filenameList);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 94:137: -> ^( TOK_SIGMAXY $column_x $column_y $directory ( $filenameList $filenameList)+ )
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:94:140: ^( TOK_SIGMAXY $column_x $column_y $directory ( $filenameList $filenameList)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_SIGMAXY, "TOK_SIGMAXY"), root_1);

                        adaptor.addChild(root_1, stream_column_x.nextNode());
                        adaptor.addChild(root_1, stream_column_y.nextNode());
                        adaptor.addChild(root_1, stream_directory.nextNode());
                        if ( !(stream_filenameList.hasNext()||stream_filenameList.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_filenameList.hasNext()||stream_filenameList.hasNext() ) {
                            adaptor.addChild(root_1, stream_filenameList.nextNode());
                            adaptor.addChild(root_1, stream_filenameList.nextNode());

                        }
                        stream_filenameList.reset();
                        stream_filenameList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sigmaxy"

    public static class sigmaxsquare_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sigmaxsquare"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:97:1: sigmaxsquare : ( SIGMAXSQUARE LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SIGMAXSQUARE $column_x $ip) | SIGMAXSQUARE LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ -> ^( TOK_SIGMAXSQUARE $column_x $directory ( $filenameList $filenameList)+ ) );
    public final NectarParser.sigmaxsquare_return sigmaxsquare() throws RecognitionException {
        NectarParser.sigmaxsquare_return retval = new NectarParser.sigmaxsquare_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_x=null;
        Token ip=null;
        Token directory=null;
        Token SIGMAXSQUARE33=null;
        Token LEFT_PAREN34=null;
        Token RIGHT_PAREN35=null;
        Token STDIN_OP36=null;
        Token SIGMAXSQUARE37=null;
        Token LEFT_PAREN38=null;
        Token RIGHT_PAREN39=null;
        Token STDIN_OP40=null;
        Token filenameList=null;
        List list_filenameList=null;

        Object column_x_tree=null;
        Object ip_tree=null;
        Object directory_tree=null;
        Object SIGMAXSQUARE33_tree=null;
        Object LEFT_PAREN34_tree=null;
        Object RIGHT_PAREN35_tree=null;
        Object STDIN_OP36_tree=null;
        Object SIGMAXSQUARE37_tree=null;
        Object LEFT_PAREN38_tree=null;
        Object RIGHT_PAREN39_tree=null;
        Object STDIN_OP40_tree=null;
        Object filenameList_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FORWARDSLASH=new RewriteRuleTokenStream(adaptor,"token FORWARDSLASH");
        RewriteRuleTokenStream stream_SIGMAXSQUARE=new RewriteRuleTokenStream(adaptor,"token SIGMAXSQUARE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

         paraphrases.push("\n"+"USAGE :sigmaxsquare(column_no)<<input_file"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:100:1: ( SIGMAXSQUARE LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SIGMAXSQUARE $column_x $ip) | SIGMAXSQUARE LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ -> ^( TOK_SIGMAXSQUARE $column_x $directory ( $filenameList $filenameList)+ ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==SIGMAXSQUARE) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==LEFT_PAREN) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==INT) ) {
                        int LA7_3 = input.LA(4);

                        if ( (LA7_3==RIGHT_PAREN) ) {
                            int LA7_4 = input.LA(5);

                            if ( (LA7_4==STDIN_OP) ) {
                                int LA7_5 = input.LA(6);

                                if ( (LA7_5==ID) ) {
                                    int LA7_6 = input.LA(7);

                                    if ( (LA7_6==FORWARDSLASH) ) {
                                        alt7=2;
                                    }
                                    else if ( (LA7_6==EOF) ) {
                                        alt7=1;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 7, 6, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 7, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:100:3: SIGMAXSQUARE LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP ip= ID
                    {
                    SIGMAXSQUARE33=(Token)match(input,SIGMAXSQUARE,FOLLOW_SIGMAXSQUARE_in_sigmaxsquare451);  
                    stream_SIGMAXSQUARE.add(SIGMAXSQUARE33);

                    LEFT_PAREN34=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_sigmaxsquare453);  
                    stream_LEFT_PAREN.add(LEFT_PAREN34);

                    column_x=(Token)match(input,INT,FOLLOW_INT_in_sigmaxsquare457);  
                    stream_INT.add(column_x);

                    RIGHT_PAREN35=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_sigmaxsquare459);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN35);

                    STDIN_OP36=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_sigmaxsquare461);  
                    stream_STDIN_OP.add(STDIN_OP36);

                    ip=(Token)match(input,ID,FOLLOW_ID_in_sigmaxsquare466);  
                    stream_ID.add(ip);



                    // AST REWRITE
                    // elements: column_x, ip
                    // token labels: column_x, ip
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_column_x=new RewriteRuleTokenStream(adaptor,"token column_x",column_x);
                    RewriteRuleTokenStream stream_ip=new RewriteRuleTokenStream(adaptor,"token ip",ip);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 100:68: -> ^( TOK_SIGMAXSQUARE $column_x $ip)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:100:71: ^( TOK_SIGMAXSQUARE $column_x $ip)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_SIGMAXSQUARE, "TOK_SIGMAXSQUARE"), root_1);

                        adaptor.addChild(root_1, stream_column_x.nextNode());
                        adaptor.addChild(root_1, stream_ip.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:102:5: SIGMAXSQUARE LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+
                    {
                    SIGMAXSQUARE37=(Token)match(input,SIGMAXSQUARE,FOLLOW_SIGMAXSQUARE_in_sigmaxsquare490);  
                    stream_SIGMAXSQUARE.add(SIGMAXSQUARE37);

                    LEFT_PAREN38=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_sigmaxsquare492);  
                    stream_LEFT_PAREN.add(LEFT_PAREN38);

                    column_x=(Token)match(input,INT,FOLLOW_INT_in_sigmaxsquare496);  
                    stream_INT.add(column_x);

                    RIGHT_PAREN39=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_sigmaxsquare498);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN39);

                    STDIN_OP40=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_sigmaxsquare500);  
                    stream_STDIN_OP.add(STDIN_OP40);

                    directory=(Token)match(input,ID,FOLLOW_ID_in_sigmaxsquare504);  
                    stream_ID.add(directory);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:102:76: (filenameList+= FORWARDSLASH filenameList+= ID )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==FORWARDSLASH) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:102:77: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    filenameList=(Token)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_sigmaxsquare509);  
                    	    stream_FORWARDSLASH.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    filenameList=(Token)match(input,ID,FOLLOW_ID_in_sigmaxsquare513);  
                    	    stream_ID.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);


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



                    // AST REWRITE
                    // elements: column_x, directory, filenameList, filenameList
                    // token labels: directory, column_x
                    // rule labels: retval
                    // token list labels: filenameList
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_directory=new RewriteRuleTokenStream(adaptor,"token directory",directory);
                    RewriteRuleTokenStream stream_column_x=new RewriteRuleTokenStream(adaptor,"token column_x",column_x);
                    RewriteRuleTokenStream stream_filenameList=new RewriteRuleTokenStream(adaptor,"token filenameList", list_filenameList);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 102:122: -> ^( TOK_SIGMAXSQUARE $column_x $directory ( $filenameList $filenameList)+ )
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:102:125: ^( TOK_SIGMAXSQUARE $column_x $directory ( $filenameList $filenameList)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_SIGMAXSQUARE, "TOK_SIGMAXSQUARE"), root_1);

                        adaptor.addChild(root_1, stream_column_x.nextNode());
                        adaptor.addChild(root_1, stream_directory.nextNode());
                        if ( !(stream_filenameList.hasNext()||stream_filenameList.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_filenameList.hasNext()||stream_filenameList.hasNext() ) {
                            adaptor.addChild(root_1, stream_filenameList.nextNode());
                            adaptor.addChild(root_1, stream_filenameList.nextNode());

                        }
                        stream_filenameList.reset();
                        stream_filenameList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sigmaxsquare"

    public static class mean_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mean"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:105:1: mean : ( MEAN LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_MEAN $column_x $ip $total_rows) | MEAN LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_MEAN $column_x $directory ( $filenameList $filenameList)+ $total_rows) );
    public final NectarParser.mean_return mean() throws RecognitionException {
        NectarParser.mean_return retval = new NectarParser.mean_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_x=null;
        Token ip=null;
        Token total_rows=null;
        Token directory=null;
        Token MEAN41=null;
        Token LEFT_PAREN42=null;
        Token RIGHT_PAREN43=null;
        Token STDIN_OP44=null;
        Token LEFT_PAREN45=null;
        Token RIGHT_PAREN46=null;
        Token MEAN47=null;
        Token LEFT_PAREN48=null;
        Token RIGHT_PAREN49=null;
        Token STDIN_OP50=null;
        Token LEFT_PAREN51=null;
        Token RIGHT_PAREN52=null;
        Token filenameList=null;
        List list_filenameList=null;

        Object column_x_tree=null;
        Object ip_tree=null;
        Object total_rows_tree=null;
        Object directory_tree=null;
        Object MEAN41_tree=null;
        Object LEFT_PAREN42_tree=null;
        Object RIGHT_PAREN43_tree=null;
        Object STDIN_OP44_tree=null;
        Object LEFT_PAREN45_tree=null;
        Object RIGHT_PAREN46_tree=null;
        Object MEAN47_tree=null;
        Object LEFT_PAREN48_tree=null;
        Object RIGHT_PAREN49_tree=null;
        Object STDIN_OP50_tree=null;
        Object LEFT_PAREN51_tree=null;
        Object RIGHT_PAREN52_tree=null;
        Object filenameList_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FORWARDSLASH=new RewriteRuleTokenStream(adaptor,"token FORWARDSLASH");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MEAN=new RewriteRuleTokenStream(adaptor,"token MEAN");

         paraphrases.push("\n"+"USAGE :mean(column_no)<<input_file(total_no_of_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:108:1: ( MEAN LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_MEAN $column_x $ip $total_rows) | MEAN LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_MEAN $column_x $directory ( $filenameList $filenameList)+ $total_rows) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==MEAN) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==LEFT_PAREN) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==INT) ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3==RIGHT_PAREN) ) {
                            int LA9_4 = input.LA(5);

                            if ( (LA9_4==STDIN_OP) ) {
                                int LA9_5 = input.LA(6);

                                if ( (LA9_5==ID) ) {
                                    int LA9_6 = input.LA(7);

                                    if ( (LA9_6==LEFT_PAREN) ) {
                                        alt9=1;
                                    }
                                    else if ( (LA9_6==FORWARDSLASH) ) {
                                        alt9=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 9, 6, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 9, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:108:3: MEAN LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN
                    {
                    MEAN41=(Token)match(input,MEAN,FOLLOW_MEAN_in_mean567);  
                    stream_MEAN.add(MEAN41);

                    LEFT_PAREN42=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_mean570);  
                    stream_LEFT_PAREN.add(LEFT_PAREN42);

                    column_x=(Token)match(input,INT,FOLLOW_INT_in_mean574);  
                    stream_INT.add(column_x);

                    RIGHT_PAREN43=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_mean578);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN43);

                    STDIN_OP44=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_mean581);  
                    stream_STDIN_OP.add(STDIN_OP44);

                    ip=(Token)match(input,ID,FOLLOW_ID_in_mean586);  
                    stream_ID.add(ip);

                    LEFT_PAREN45=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_mean588);  
                    stream_LEFT_PAREN.add(LEFT_PAREN45);

                    total_rows=(Token)match(input,INT,FOLLOW_INT_in_mean592);  
                    stream_INT.add(total_rows);

                    RIGHT_PAREN46=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_mean595);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN46);



                    // AST REWRITE
                    // elements: column_x, total_rows, ip
                    // token labels: column_x, total_rows, ip
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_column_x=new RewriteRuleTokenStream(adaptor,"token column_x",column_x);
                    RewriteRuleTokenStream stream_total_rows=new RewriteRuleTokenStream(adaptor,"token total_rows",total_rows);
                    RewriteRuleTokenStream stream_ip=new RewriteRuleTokenStream(adaptor,"token ip",ip);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:103: -> ^( TOK_MEAN $column_x $ip $total_rows)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:108:106: ^( TOK_MEAN $column_x $ip $total_rows)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_MEAN, "TOK_MEAN"), root_1);

                        adaptor.addChild(root_1, stream_column_x.nextNode());
                        adaptor.addChild(root_1, stream_ip.nextNode());
                        adaptor.addChild(root_1, stream_total_rows.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:110:3: MEAN LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN
                    {
                    MEAN47=(Token)match(input,MEAN,FOLLOW_MEAN_in_mean618);  
                    stream_MEAN.add(MEAN47);

                    LEFT_PAREN48=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_mean621);  
                    stream_LEFT_PAREN.add(LEFT_PAREN48);

                    column_x=(Token)match(input,INT,FOLLOW_INT_in_mean625);  
                    stream_INT.add(column_x);

                    RIGHT_PAREN49=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_mean629);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN49);

                    STDIN_OP50=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_mean632);  
                    stream_STDIN_OP.add(STDIN_OP50);

                    directory=(Token)match(input,ID,FOLLOW_ID_in_mean637);  
                    stream_ID.add(directory);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:110:71: (filenameList+= FORWARDSLASH filenameList+= ID )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==FORWARDSLASH) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:110:72: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    filenameList=(Token)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_mean642);  
                    	    stream_FORWARDSLASH.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    filenameList=(Token)match(input,ID,FOLLOW_ID_in_mean646);  
                    	    stream_ID.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    LEFT_PAREN51=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_mean650);  
                    stream_LEFT_PAREN.add(LEFT_PAREN51);

                    total_rows=(Token)match(input,INT,FOLLOW_INT_in_mean654);  
                    stream_INT.add(total_rows);

                    RIGHT_PAREN52=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_mean656);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN52);



                    // AST REWRITE
                    // elements: filenameList, total_rows, directory, filenameList, column_x
                    // token labels: directory, column_x, total_rows
                    // rule labels: retval
                    // token list labels: filenameList
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_directory=new RewriteRuleTokenStream(adaptor,"token directory",directory);
                    RewriteRuleTokenStream stream_column_x=new RewriteRuleTokenStream(adaptor,"token column_x",column_x);
                    RewriteRuleTokenStream stream_total_rows=new RewriteRuleTokenStream(adaptor,"token total_rows",total_rows);
                    RewriteRuleTokenStream stream_filenameList=new RewriteRuleTokenStream(adaptor,"token filenameList", list_filenameList);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:156: -> ^( TOK_MEAN $column_x $directory ( $filenameList $filenameList)+ $total_rows)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:110:159: ^( TOK_MEAN $column_x $directory ( $filenameList $filenameList)+ $total_rows)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_MEAN, "TOK_MEAN"), root_1);

                        adaptor.addChild(root_1, stream_column_x.nextNode());
                        adaptor.addChild(root_1, stream_directory.nextNode());
                        if ( !(stream_filenameList.hasNext()||stream_filenameList.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_filenameList.hasNext()||stream_filenameList.hasNext() ) {
                            adaptor.addChild(root_1, stream_filenameList.nextNode());
                            adaptor.addChild(root_1, stream_filenameList.nextNode());

                        }
                        stream_filenameList.reset();
                        stream_filenameList.reset();
                        adaptor.addChild(root_1, stream_total_rows.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mean"

    public static class correlation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "correlation"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:113:1: correlation : ( CORR LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORR $column_x $column_y $ip $total_rows) | CORR LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORR $column_x $column_y $directory ( $filenameList $filenameList)+ $total_rows) );
    public final NectarParser.correlation_return correlation() throws RecognitionException {
        NectarParser.correlation_return retval = new NectarParser.correlation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_x=null;
        Token column_y=null;
        Token ip=null;
        Token total_rows=null;
        Token directory=null;
        Token CORR53=null;
        Token LEFT_PAREN54=null;
        Token COMMA55=null;
        Token RIGHT_PAREN56=null;
        Token STDIN_OP57=null;
        Token LEFT_PAREN58=null;
        Token RIGHT_PAREN59=null;
        Token CORR60=null;
        Token LEFT_PAREN61=null;
        Token COMMA62=null;
        Token RIGHT_PAREN63=null;
        Token STDIN_OP64=null;
        Token LEFT_PAREN65=null;
        Token RIGHT_PAREN66=null;
        Token filenameList=null;
        List list_filenameList=null;

        Object column_x_tree=null;
        Object column_y_tree=null;
        Object ip_tree=null;
        Object total_rows_tree=null;
        Object directory_tree=null;
        Object CORR53_tree=null;
        Object LEFT_PAREN54_tree=null;
        Object COMMA55_tree=null;
        Object RIGHT_PAREN56_tree=null;
        Object STDIN_OP57_tree=null;
        Object LEFT_PAREN58_tree=null;
        Object RIGHT_PAREN59_tree=null;
        Object CORR60_tree=null;
        Object LEFT_PAREN61_tree=null;
        Object COMMA62_tree=null;
        Object RIGHT_PAREN63_tree=null;
        Object STDIN_OP64_tree=null;
        Object LEFT_PAREN65_tree=null;
        Object RIGHT_PAREN66_tree=null;
        Object filenameList_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FORWARDSLASH=new RewriteRuleTokenStream(adaptor,"token FORWARDSLASH");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CORR=new RewriteRuleTokenStream(adaptor,"token CORR");

         paraphrases.push("\n"+"USAGE :corr(column_no1,column_no2)<<input_file(total_no_of_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:116:1: ( CORR LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORR $column_x $column_y $ip $total_rows) | CORR LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORR $column_x $column_y $directory ( $filenameList $filenameList)+ $total_rows) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:116:3: CORR LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN
                    {
                    CORR53=(Token)match(input,CORR,FOLLOW_CORR_in_correlation712);  
                    stream_CORR.add(CORR53);

                    LEFT_PAREN54=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_correlation714);  
                    stream_LEFT_PAREN.add(LEFT_PAREN54);

                    column_x=(Token)match(input,INT,FOLLOW_INT_in_correlation718);  
                    stream_INT.add(column_x);

                    COMMA55=(Token)match(input,COMMA,FOLLOW_COMMA_in_correlation720);  
                    stream_COMMA.add(COMMA55);

                    column_y=(Token)match(input,INT,FOLLOW_INT_in_correlation724);  
                    stream_INT.add(column_y);

                    RIGHT_PAREN56=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_correlation726);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN56);

                    STDIN_OP57=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_correlation728);  
                    stream_STDIN_OP.add(STDIN_OP57);

                    ip=(Token)match(input,ID,FOLLOW_ID_in_correlation732);  
                    stream_ID.add(ip);

                    LEFT_PAREN58=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_correlation734);  
                    stream_LEFT_PAREN.add(LEFT_PAREN58);

                    total_rows=(Token)match(input,INT,FOLLOW_INT_in_correlation738);  
                    stream_INT.add(total_rows);

                    RIGHT_PAREN59=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_correlation741);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN59);



                    // AST REWRITE
                    // elements: column_x, ip, column_y, total_rows
                    // token labels: column_x, total_rows, column_y, ip
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_column_x=new RewriteRuleTokenStream(adaptor,"token column_x",column_x);
                    RewriteRuleTokenStream stream_total_rows=new RewriteRuleTokenStream(adaptor,"token total_rows",total_rows);
                    RewriteRuleTokenStream stream_column_y=new RewriteRuleTokenStream(adaptor,"token column_y",column_y);
                    RewriteRuleTokenStream stream_ip=new RewriteRuleTokenStream(adaptor,"token ip",ip);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:117: -> ^( TOK_CORR $column_x $column_y $ip $total_rows)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:116:120: ^( TOK_CORR $column_x $column_y $ip $total_rows)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_CORR, "TOK_CORR"), root_1);

                        adaptor.addChild(root_1, stream_column_x.nextNode());
                        adaptor.addChild(root_1, stream_column_y.nextNode());
                        adaptor.addChild(root_1, stream_ip.nextNode());
                        adaptor.addChild(root_1, stream_total_rows.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:118:4: CORR LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN
                    {
                    CORR60=(Token)match(input,CORR,FOLLOW_CORR_in_correlation768);  
                    stream_CORR.add(CORR60);

                    LEFT_PAREN61=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_correlation770);  
                    stream_LEFT_PAREN.add(LEFT_PAREN61);

                    column_x=(Token)match(input,INT,FOLLOW_INT_in_correlation774);  
                    stream_INT.add(column_x);

                    COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_correlation776);  
                    stream_COMMA.add(COMMA62);

                    column_y=(Token)match(input,INT,FOLLOW_INT_in_correlation780);  
                    stream_INT.add(column_y);

                    RIGHT_PAREN63=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_correlation782);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN63);

                    STDIN_OP64=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_correlation784);  
                    stream_STDIN_OP.add(STDIN_OP64);

                    directory=(Token)match(input,ID,FOLLOW_ID_in_correlation788);  
                    stream_ID.add(directory);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:118:86: (filenameList+= FORWARDSLASH filenameList+= ID )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==FORWARDSLASH) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:118:87: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    filenameList=(Token)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_correlation793);  
                    	    stream_FORWARDSLASH.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    filenameList=(Token)match(input,ID,FOLLOW_ID_in_correlation797);  
                    	    stream_ID.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    LEFT_PAREN65=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_correlation801);  
                    stream_LEFT_PAREN.add(LEFT_PAREN65);

                    total_rows=(Token)match(input,INT,FOLLOW_INT_in_correlation805);  
                    stream_INT.add(total_rows);

                    RIGHT_PAREN66=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_correlation808);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN66);



                    // AST REWRITE
                    // elements: filenameList, filenameList, column_y, directory, total_rows, column_x
                    // token labels: directory, column_x, total_rows, column_y
                    // rule labels: retval
                    // token list labels: filenameList
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_directory=new RewriteRuleTokenStream(adaptor,"token directory",directory);
                    RewriteRuleTokenStream stream_column_x=new RewriteRuleTokenStream(adaptor,"token column_x",column_x);
                    RewriteRuleTokenStream stream_total_rows=new RewriteRuleTokenStream(adaptor,"token total_rows",total_rows);
                    RewriteRuleTokenStream stream_column_y=new RewriteRuleTokenStream(adaptor,"token column_y",column_y);
                    RewriteRuleTokenStream stream_filenameList=new RewriteRuleTokenStream(adaptor,"token filenameList", list_filenameList);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 118:172: -> ^( TOK_CORR $column_x $column_y $directory ( $filenameList $filenameList)+ $total_rows)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:118:175: ^( TOK_CORR $column_x $column_y $directory ( $filenameList $filenameList)+ $total_rows)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_CORR, "TOK_CORR"), root_1);

                        adaptor.addChild(root_1, stream_column_x.nextNode());
                        adaptor.addChild(root_1, stream_column_y.nextNode());
                        adaptor.addChild(root_1, stream_directory.nextNode());
                        if ( !(stream_filenameList.hasNext()||stream_filenameList.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_filenameList.hasNext()||stream_filenameList.hasNext() ) {
                            adaptor.addChild(root_1, stream_filenameList.nextNode());
                            adaptor.addChild(root_1, stream_filenameList.nextNode());

                        }
                        stream_filenameList.reset();
                        stream_filenameList.reset();
                        adaptor.addChild(root_1, stream_total_rows.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "correlation"

    public static class correlationmatrix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "correlationmatrix"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:121:1: correlationmatrix : ( CORRMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORRMATRIX $col ( $morecol)* $ip $total_rows) | CORRMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORRMATRIX $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows) );
    public final NectarParser.correlationmatrix_return correlationmatrix() throws RecognitionException {
        NectarParser.correlationmatrix_return retval = new NectarParser.correlationmatrix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token col=null;
        Token ip=null;
        Token total_rows=null;
        Token directory=null;
        Token CORRMATRIX67=null;
        Token LEFT_PAREN68=null;
        Token COMMA69=null;
        Token RIGHT_PAREN70=null;
        Token STDIN_OP71=null;
        Token LEFT_PAREN72=null;
        Token RIGHT_PAREN73=null;
        Token CORRMATRIX74=null;
        Token LEFT_PAREN75=null;
        Token COMMA76=null;
        Token RIGHT_PAREN77=null;
        Token STDIN_OP78=null;
        Token LEFT_PAREN79=null;
        Token RIGHT_PAREN80=null;
        Token morecol=null;
        Token filenameList=null;
        List list_morecol=null;
        List list_filenameList=null;

        Object col_tree=null;
        Object ip_tree=null;
        Object total_rows_tree=null;
        Object directory_tree=null;
        Object CORRMATRIX67_tree=null;
        Object LEFT_PAREN68_tree=null;
        Object COMMA69_tree=null;
        Object RIGHT_PAREN70_tree=null;
        Object STDIN_OP71_tree=null;
        Object LEFT_PAREN72_tree=null;
        Object RIGHT_PAREN73_tree=null;
        Object CORRMATRIX74_tree=null;
        Object LEFT_PAREN75_tree=null;
        Object COMMA76_tree=null;
        Object RIGHT_PAREN77_tree=null;
        Object STDIN_OP78_tree=null;
        Object LEFT_PAREN79_tree=null;
        Object RIGHT_PAREN80_tree=null;
        Object morecol_tree=null;
        Object filenameList_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FORWARDSLASH=new RewriteRuleTokenStream(adaptor,"token FORWARDSLASH");
        RewriteRuleTokenStream stream_CORRMATRIX=new RewriteRuleTokenStream(adaptor,"token CORRMATRIX");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

         paraphrases.push("\n"+"USAGE :corrmatrix(column_nos)<<input_file(total_no_of_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:124:1: ( CORRMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORRMATRIX $col ( $morecol)* $ip $total_rows) | CORRMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORRMATRIX $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows) )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:124:3: CORRMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN
                    {
                    CORRMATRIX67=(Token)match(input,CORRMATRIX,FOLLOW_CORRMATRIX_in_correlationmatrix868);  
                    stream_CORRMATRIX.add(CORRMATRIX67);

                    LEFT_PAREN68=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_correlationmatrix870);  
                    stream_LEFT_PAREN.add(LEFT_PAREN68);

                    col=(Token)match(input,INT,FOLLOW_INT_in_correlationmatrix874);  
                    stream_INT.add(col);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:124:33: ( COMMA morecol+= INT )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:124:34: COMMA morecol+= INT
                    	    {
                    	    COMMA69=(Token)match(input,COMMA,FOLLOW_COMMA_in_correlationmatrix877);  
                    	    stream_COMMA.add(COMMA69);

                    	    morecol=(Token)match(input,INT,FOLLOW_INT_in_correlationmatrix881);  
                    	    stream_INT.add(morecol);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    RIGHT_PAREN70=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_correlationmatrix885);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN70);

                    STDIN_OP71=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_correlationmatrix887);  
                    stream_STDIN_OP.add(STDIN_OP71);

                    ip=(Token)match(input,ID,FOLLOW_ID_in_correlationmatrix891);  
                    stream_ID.add(ip);

                    LEFT_PAREN72=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_correlationmatrix893);  
                    stream_LEFT_PAREN.add(LEFT_PAREN72);

                    total_rows=(Token)match(input,INT,FOLLOW_INT_in_correlationmatrix897);  
                    stream_INT.add(total_rows);

                    RIGHT_PAREN73=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_correlationmatrix900);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN73);



                    // AST REWRITE
                    // elements: total_rows, col, ip, morecol
                    // token labels: col, total_rows, ip
                    // rule labels: retval
                    // token list labels: morecol
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_col=new RewriteRuleTokenStream(adaptor,"token col",col);
                    RewriteRuleTokenStream stream_total_rows=new RewriteRuleTokenStream(adaptor,"token total_rows",total_rows);
                    RewriteRuleTokenStream stream_ip=new RewriteRuleTokenStream(adaptor,"token ip",ip);
                    RewriteRuleTokenStream stream_morecol=new RewriteRuleTokenStream(adaptor,"token morecol", list_morecol);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 124:120: -> ^( TOK_CORRMATRIX $col ( $morecol)* $ip $total_rows)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:124:123: ^( TOK_CORRMATRIX $col ( $morecol)* $ip $total_rows)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_CORRMATRIX, "TOK_CORRMATRIX"), root_1);

                        adaptor.addChild(root_1, stream_col.nextNode());
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:124:146: ( $morecol)*
                        while ( stream_morecol.hasNext() ) {
                            adaptor.addChild(root_1, stream_morecol.nextNode());

                        }
                        stream_morecol.reset();
                        adaptor.addChild(root_1, stream_ip.nextNode());
                        adaptor.addChild(root_1, stream_total_rows.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:126:3: CORRMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN
                    {
                    CORRMATRIX74=(Token)match(input,CORRMATRIX,FOLLOW_CORRMATRIX_in_correlationmatrix927);  
                    stream_CORRMATRIX.add(CORRMATRIX74);

                    LEFT_PAREN75=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_correlationmatrix929);  
                    stream_LEFT_PAREN.add(LEFT_PAREN75);

                    col=(Token)match(input,INT,FOLLOW_INT_in_correlationmatrix933);  
                    stream_INT.add(col);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:126:33: ( COMMA morecol+= INT )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:126:34: COMMA morecol+= INT
                    	    {
                    	    COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_correlationmatrix936);  
                    	    stream_COMMA.add(COMMA76);

                    	    morecol=(Token)match(input,INT,FOLLOW_INT_in_correlationmatrix940);  
                    	    stream_INT.add(morecol);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    RIGHT_PAREN77=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_correlationmatrix944);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN77);

                    STDIN_OP78=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_correlationmatrix946);  
                    stream_STDIN_OP.add(STDIN_OP78);

                    directory=(Token)match(input,ID,FOLLOW_ID_in_correlationmatrix950);  
                    stream_ID.add(directory);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:126:89: (filenameList+= FORWARDSLASH filenameList+= ID )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==FORWARDSLASH) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:126:90: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    filenameList=(Token)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_correlationmatrix955);  
                    	    stream_FORWARDSLASH.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    filenameList=(Token)match(input,ID,FOLLOW_ID_in_correlationmatrix959);  
                    	    stream_ID.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);


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

                    LEFT_PAREN79=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_correlationmatrix963);  
                    stream_LEFT_PAREN.add(LEFT_PAREN79);

                    total_rows=(Token)match(input,INT,FOLLOW_INT_in_correlationmatrix967);  
                    stream_INT.add(total_rows);

                    RIGHT_PAREN80=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_correlationmatrix970);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN80);



                    // AST REWRITE
                    // elements: filenameList, col, directory, morecol, total_rows, filenameList
                    // token labels: col, directory, total_rows
                    // rule labels: retval
                    // token list labels: filenameList, morecol
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_col=new RewriteRuleTokenStream(adaptor,"token col",col);
                    RewriteRuleTokenStream stream_directory=new RewriteRuleTokenStream(adaptor,"token directory",directory);
                    RewriteRuleTokenStream stream_total_rows=new RewriteRuleTokenStream(adaptor,"token total_rows",total_rows);
                    RewriteRuleTokenStream stream_filenameList=new RewriteRuleTokenStream(adaptor,"token filenameList", list_filenameList);
                    RewriteRuleTokenStream stream_morecol=new RewriteRuleTokenStream(adaptor,"token morecol", list_morecol);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:174: -> ^( TOK_CORRMATRIX $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:126:177: ^( TOK_CORRMATRIX $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_CORRMATRIX, "TOK_CORRMATRIX"), root_1);

                        adaptor.addChild(root_1, stream_col.nextNode());
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:126:200: ( $morecol)*
                        while ( stream_morecol.hasNext() ) {
                            adaptor.addChild(root_1, stream_morecol.nextNode());

                        }
                        stream_morecol.reset();
                        adaptor.addChild(root_1, stream_directory.nextNode());
                        if ( !(stream_filenameList.hasNext()||stream_filenameList.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_filenameList.hasNext()||stream_filenameList.hasNext() ) {
                            adaptor.addChild(root_1, stream_filenameList.nextNode());
                            adaptor.addChild(root_1, stream_filenameList.nextNode());

                        }
                        stream_filenameList.reset();
                        stream_filenameList.reset();
                        adaptor.addChild(root_1, stream_total_rows.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "correlationmatrix"

    public static class multiplereg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplereg"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:129:1: multiplereg : ( MULTIPLEREG LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_MULTIPLEREG $col ( $morecol)* $ip $total_rows) | MULTIPLEREG LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_MULTIPLEREG $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows) );
    public final NectarParser.multiplereg_return multiplereg() throws RecognitionException {
        NectarParser.multiplereg_return retval = new NectarParser.multiplereg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token col=null;
        Token ip=null;
        Token total_rows=null;
        Token directory=null;
        Token MULTIPLEREG81=null;
        Token LEFT_PAREN82=null;
        Token COMMA83=null;
        Token RIGHT_PAREN84=null;
        Token STDIN_OP85=null;
        Token LEFT_PAREN86=null;
        Token RIGHT_PAREN87=null;
        Token MULTIPLEREG88=null;
        Token LEFT_PAREN89=null;
        Token COMMA90=null;
        Token RIGHT_PAREN91=null;
        Token STDIN_OP92=null;
        Token LEFT_PAREN93=null;
        Token RIGHT_PAREN94=null;
        Token morecol=null;
        Token filenameList=null;
        List list_morecol=null;
        List list_filenameList=null;

        Object col_tree=null;
        Object ip_tree=null;
        Object total_rows_tree=null;
        Object directory_tree=null;
        Object MULTIPLEREG81_tree=null;
        Object LEFT_PAREN82_tree=null;
        Object COMMA83_tree=null;
        Object RIGHT_PAREN84_tree=null;
        Object STDIN_OP85_tree=null;
        Object LEFT_PAREN86_tree=null;
        Object RIGHT_PAREN87_tree=null;
        Object MULTIPLEREG88_tree=null;
        Object LEFT_PAREN89_tree=null;
        Object COMMA90_tree=null;
        Object RIGHT_PAREN91_tree=null;
        Object STDIN_OP92_tree=null;
        Object LEFT_PAREN93_tree=null;
        Object RIGHT_PAREN94_tree=null;
        Object morecol_tree=null;
        Object filenameList_tree=null;
        RewriteRuleTokenStream stream_MULTIPLEREG=new RewriteRuleTokenStream(adaptor,"token MULTIPLEREG");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FORWARDSLASH=new RewriteRuleTokenStream(adaptor,"token FORWARDSLASH");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

         paraphrases.push("\n"+"USAGE :multiplereg(column_nos)<<input_file(total_no_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:132:1: ( MULTIPLEREG LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_MULTIPLEREG $col ( $morecol)* $ip $total_rows) | MULTIPLEREG LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_MULTIPLEREG $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:132:3: MULTIPLEREG LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN
                    {
                    MULTIPLEREG81=(Token)match(input,MULTIPLEREG,FOLLOW_MULTIPLEREG_in_multiplereg1030);  
                    stream_MULTIPLEREG.add(MULTIPLEREG81);

                    LEFT_PAREN82=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_multiplereg1032);  
                    stream_LEFT_PAREN.add(LEFT_PAREN82);

                    col=(Token)match(input,INT,FOLLOW_INT_in_multiplereg1036);  
                    stream_INT.add(col);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:132:34: ( COMMA morecol+= INT )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:132:35: COMMA morecol+= INT
                    	    {
                    	    COMMA83=(Token)match(input,COMMA,FOLLOW_COMMA_in_multiplereg1039);  
                    	    stream_COMMA.add(COMMA83);

                    	    morecol=(Token)match(input,INT,FOLLOW_INT_in_multiplereg1043);  
                    	    stream_INT.add(morecol);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    RIGHT_PAREN84=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_multiplereg1047);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN84);

                    STDIN_OP85=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_multiplereg1049);  
                    stream_STDIN_OP.add(STDIN_OP85);

                    ip=(Token)match(input,ID,FOLLOW_ID_in_multiplereg1053);  
                    stream_ID.add(ip);

                    LEFT_PAREN86=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_multiplereg1055);  
                    stream_LEFT_PAREN.add(LEFT_PAREN86);

                    total_rows=(Token)match(input,INT,FOLLOW_INT_in_multiplereg1059);  
                    stream_INT.add(total_rows);

                    RIGHT_PAREN87=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_multiplereg1062);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN87);



                    // AST REWRITE
                    // elements: col, total_rows, ip, morecol
                    // token labels: col, total_rows, ip
                    // rule labels: retval
                    // token list labels: morecol
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_col=new RewriteRuleTokenStream(adaptor,"token col",col);
                    RewriteRuleTokenStream stream_total_rows=new RewriteRuleTokenStream(adaptor,"token total_rows",total_rows);
                    RewriteRuleTokenStream stream_ip=new RewriteRuleTokenStream(adaptor,"token ip",ip);
                    RewriteRuleTokenStream stream_morecol=new RewriteRuleTokenStream(adaptor,"token morecol", list_morecol);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 132:122: -> ^( TOK_MULTIPLEREG $col ( $morecol)* $ip $total_rows)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:132:124: ^( TOK_MULTIPLEREG $col ( $morecol)* $ip $total_rows)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_MULTIPLEREG, "TOK_MULTIPLEREG"), root_1);

                        adaptor.addChild(root_1, stream_col.nextNode());
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:132:147: ( $morecol)*
                        while ( stream_morecol.hasNext() ) {
                            adaptor.addChild(root_1, stream_morecol.nextNode());

                        }
                        stream_morecol.reset();
                        adaptor.addChild(root_1, stream_ip.nextNode());
                        adaptor.addChild(root_1, stream_total_rows.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:134:1: MULTIPLEREG LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN
                    {
                    MULTIPLEREG88=(Token)match(input,MULTIPLEREG,FOLLOW_MULTIPLEREG_in_multiplereg1084);  
                    stream_MULTIPLEREG.add(MULTIPLEREG88);

                    LEFT_PAREN89=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_multiplereg1086);  
                    stream_LEFT_PAREN.add(LEFT_PAREN89);

                    col=(Token)match(input,INT,FOLLOW_INT_in_multiplereg1090);  
                    stream_INT.add(col);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:134:32: ( COMMA morecol+= INT )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:134:33: COMMA morecol+= INT
                    	    {
                    	    COMMA90=(Token)match(input,COMMA,FOLLOW_COMMA_in_multiplereg1093);  
                    	    stream_COMMA.add(COMMA90);

                    	    morecol=(Token)match(input,INT,FOLLOW_INT_in_multiplereg1097);  
                    	    stream_INT.add(morecol);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    RIGHT_PAREN91=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_multiplereg1101);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN91);

                    STDIN_OP92=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_multiplereg1103);  
                    stream_STDIN_OP.add(STDIN_OP92);

                    directory=(Token)match(input,ID,FOLLOW_ID_in_multiplereg1108);  
                    stream_ID.add(directory);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:134:89: (filenameList+= FORWARDSLASH filenameList+= ID )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==FORWARDSLASH) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:134:90: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    filenameList=(Token)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_multiplereg1113);  
                    	    stream_FORWARDSLASH.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    filenameList=(Token)match(input,ID,FOLLOW_ID_in_multiplereg1117);  
                    	    stream_ID.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    LEFT_PAREN93=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_multiplereg1121);  
                    stream_LEFT_PAREN.add(LEFT_PAREN93);

                    total_rows=(Token)match(input,INT,FOLLOW_INT_in_multiplereg1125);  
                    stream_INT.add(total_rows);

                    RIGHT_PAREN94=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_multiplereg1128);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN94);



                    // AST REWRITE
                    // elements: col, filenameList, morecol, filenameList, total_rows, directory
                    // token labels: col, directory, total_rows
                    // rule labels: retval
                    // token list labels: filenameList, morecol
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_col=new RewriteRuleTokenStream(adaptor,"token col",col);
                    RewriteRuleTokenStream stream_directory=new RewriteRuleTokenStream(adaptor,"token directory",directory);
                    RewriteRuleTokenStream stream_total_rows=new RewriteRuleTokenStream(adaptor,"token total_rows",total_rows);
                    RewriteRuleTokenStream stream_filenameList=new RewriteRuleTokenStream(adaptor,"token filenameList", list_filenameList);
                    RewriteRuleTokenStream stream_morecol=new RewriteRuleTokenStream(adaptor,"token morecol", list_morecol);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 134:175: -> ^( TOK_MULTIPLEREG $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:134:177: ^( TOK_MULTIPLEREG $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_MULTIPLEREG, "TOK_MULTIPLEREG"), root_1);

                        adaptor.addChild(root_1, stream_col.nextNode());
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:134:200: ( $morecol)*
                        while ( stream_morecol.hasNext() ) {
                            adaptor.addChild(root_1, stream_morecol.nextNode());

                        }
                        stream_morecol.reset();
                        adaptor.addChild(root_1, stream_directory.nextNode());
                        if ( !(stream_filenameList.hasNext()||stream_filenameList.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_filenameList.hasNext()||stream_filenameList.hasNext() ) {
                            adaptor.addChild(root_1, stream_filenameList.nextNode());
                            adaptor.addChild(root_1, stream_filenameList.nextNode());

                        }
                        stream_filenameList.reset();
                        stream_filenameList.reset();
                        adaptor.addChild(root_1, stream_total_rows.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplereg"

    public static class forwardselection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forwardselection"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:137:1: forwardselection : ( FORWARDSELECTION LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT COMMA levelofsignificance= DOUBLE RIGHT_PAREN -> ^( TOK_FORWARDSELECTION $col ( $morecol)* $ip $total_rows $levelofsignificance) | FORWARDSELECTION LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT COMMA levelofsignificance= DOUBLE RIGHT_PAREN -> ^( TOK_FORWARDSELECTION $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows $levelofsignificance) );
    public final NectarParser.forwardselection_return forwardselection() throws RecognitionException {
        NectarParser.forwardselection_return retval = new NectarParser.forwardselection_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token col=null;
        Token ip=null;
        Token total_rows=null;
        Token levelofsignificance=null;
        Token directory=null;
        Token FORWARDSELECTION95=null;
        Token LEFT_PAREN96=null;
        Token COMMA97=null;
        Token RIGHT_PAREN98=null;
        Token STDIN_OP99=null;
        Token LEFT_PAREN100=null;
        Token COMMA101=null;
        Token RIGHT_PAREN102=null;
        Token FORWARDSELECTION103=null;
        Token LEFT_PAREN104=null;
        Token COMMA105=null;
        Token RIGHT_PAREN106=null;
        Token STDIN_OP107=null;
        Token LEFT_PAREN108=null;
        Token COMMA109=null;
        Token RIGHT_PAREN110=null;
        Token morecol=null;
        Token filenameList=null;
        List list_morecol=null;
        List list_filenameList=null;

        Object col_tree=null;
        Object ip_tree=null;
        Object total_rows_tree=null;
        Object levelofsignificance_tree=null;
        Object directory_tree=null;
        Object FORWARDSELECTION95_tree=null;
        Object LEFT_PAREN96_tree=null;
        Object COMMA97_tree=null;
        Object RIGHT_PAREN98_tree=null;
        Object STDIN_OP99_tree=null;
        Object LEFT_PAREN100_tree=null;
        Object COMMA101_tree=null;
        Object RIGHT_PAREN102_tree=null;
        Object FORWARDSELECTION103_tree=null;
        Object LEFT_PAREN104_tree=null;
        Object COMMA105_tree=null;
        Object RIGHT_PAREN106_tree=null;
        Object STDIN_OP107_tree=null;
        Object LEFT_PAREN108_tree=null;
        Object COMMA109_tree=null;
        Object RIGHT_PAREN110_tree=null;
        Object morecol_tree=null;
        Object filenameList_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_DOUBLE=new RewriteRuleTokenStream(adaptor,"token DOUBLE");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FORWARDSLASH=new RewriteRuleTokenStream(adaptor,"token FORWARDSLASH");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_FORWARDSELECTION=new RewriteRuleTokenStream(adaptor,"token FORWARDSELECTION");

         paraphrases.push("\n"+"USAGE :forwardselection(column_nos)<<input_file(total_no_of_rows,level_of_significance)"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:140:1: ( FORWARDSELECTION LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT COMMA levelofsignificance= DOUBLE RIGHT_PAREN -> ^( TOK_FORWARDSELECTION $col ( $morecol)* $ip $total_rows $levelofsignificance) | FORWARDSELECTION LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT COMMA levelofsignificance= DOUBLE RIGHT_PAREN -> ^( TOK_FORWARDSELECTION $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows $levelofsignificance) )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:140:3: FORWARDSELECTION LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT COMMA levelofsignificance= DOUBLE RIGHT_PAREN
                    {
                    FORWARDSELECTION95=(Token)match(input,FORWARDSELECTION,FOLLOW_FORWARDSELECTION_in_forwardselection1189);  
                    stream_FORWARDSELECTION.add(FORWARDSELECTION95);

                    LEFT_PAREN96=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_forwardselection1192);  
                    stream_LEFT_PAREN.add(LEFT_PAREN96);

                    col=(Token)match(input,INT,FOLLOW_INT_in_forwardselection1196);  
                    stream_INT.add(col);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:140:40: ( COMMA morecol+= INT )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==COMMA) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:140:41: COMMA morecol+= INT
                    	    {
                    	    COMMA97=(Token)match(input,COMMA,FOLLOW_COMMA_in_forwardselection1199);  
                    	    stream_COMMA.add(COMMA97);

                    	    morecol=(Token)match(input,INT,FOLLOW_INT_in_forwardselection1203);  
                    	    stream_INT.add(morecol);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    RIGHT_PAREN98=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_forwardselection1207);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN98);

                    STDIN_OP99=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_forwardselection1209);  
                    stream_STDIN_OP.add(STDIN_OP99);

                    ip=(Token)match(input,ID,FOLLOW_ID_in_forwardselection1213);  
                    stream_ID.add(ip);

                    LEFT_PAREN100=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_forwardselection1215);  
                    stream_LEFT_PAREN.add(LEFT_PAREN100);

                    total_rows=(Token)match(input,INT,FOLLOW_INT_in_forwardselection1219);  
                    stream_INT.add(total_rows);

                    COMMA101=(Token)match(input,COMMA,FOLLOW_COMMA_in_forwardselection1221);  
                    stream_COMMA.add(COMMA101);

                    levelofsignificance=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_forwardselection1225);  
                    stream_DOUBLE.add(levelofsignificance);

                    RIGHT_PAREN102=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_forwardselection1228);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN102);



                    // AST REWRITE
                    // elements: levelofsignificance, morecol, col, ip, total_rows
                    // token labels: col, total_rows, levelofsignificance, ip
                    // rule labels: retval
                    // token list labels: morecol
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_col=new RewriteRuleTokenStream(adaptor,"token col",col);
                    RewriteRuleTokenStream stream_total_rows=new RewriteRuleTokenStream(adaptor,"token total_rows",total_rows);
                    RewriteRuleTokenStream stream_levelofsignificance=new RewriteRuleTokenStream(adaptor,"token levelofsignificance",levelofsignificance);
                    RewriteRuleTokenStream stream_ip=new RewriteRuleTokenStream(adaptor,"token ip",ip);
                    RewriteRuleTokenStream stream_morecol=new RewriteRuleTokenStream(adaptor,"token morecol", list_morecol);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 140:161: -> ^( TOK_FORWARDSELECTION $col ( $morecol)* $ip $total_rows $levelofsignificance)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:140:163: ^( TOK_FORWARDSELECTION $col ( $morecol)* $ip $total_rows $levelofsignificance)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_FORWARDSELECTION, "TOK_FORWARDSELECTION"), root_1);

                        adaptor.addChild(root_1, stream_col.nextNode());
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:140:191: ( $morecol)*
                        while ( stream_morecol.hasNext() ) {
                            adaptor.addChild(root_1, stream_morecol.nextNode());

                        }
                        stream_morecol.reset();
                        adaptor.addChild(root_1, stream_ip.nextNode());
                        adaptor.addChild(root_1, stream_total_rows.nextNode());
                        adaptor.addChild(root_1, stream_levelofsignificance.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:142:1: FORWARDSELECTION LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT COMMA levelofsignificance= DOUBLE RIGHT_PAREN
                    {
                    FORWARDSELECTION103=(Token)match(input,FORWARDSELECTION,FOLLOW_FORWARDSELECTION_in_forwardselection1254);  
                    stream_FORWARDSELECTION.add(FORWARDSELECTION103);

                    LEFT_PAREN104=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_forwardselection1257);  
                    stream_LEFT_PAREN.add(LEFT_PAREN104);

                    col=(Token)match(input,INT,FOLLOW_INT_in_forwardselection1261);  
                    stream_INT.add(col);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:142:38: ( COMMA morecol+= INT )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==COMMA) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:142:39: COMMA morecol+= INT
                    	    {
                    	    COMMA105=(Token)match(input,COMMA,FOLLOW_COMMA_in_forwardselection1264);  
                    	    stream_COMMA.add(COMMA105);

                    	    morecol=(Token)match(input,INT,FOLLOW_INT_in_forwardselection1268);  
                    	    stream_INT.add(morecol);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    RIGHT_PAREN106=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_forwardselection1272);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN106);

                    STDIN_OP107=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_forwardselection1274);  
                    stream_STDIN_OP.add(STDIN_OP107);

                    directory=(Token)match(input,ID,FOLLOW_ID_in_forwardselection1278);  
                    stream_ID.add(directory);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:142:94: (filenameList+= FORWARDSLASH filenameList+= ID )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==FORWARDSLASH) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:142:95: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    filenameList=(Token)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_forwardselection1283);  
                    	    stream_FORWARDSLASH.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    filenameList=(Token)match(input,ID,FOLLOW_ID_in_forwardselection1287);  
                    	    stream_ID.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    LEFT_PAREN108=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_forwardselection1291);  
                    stream_LEFT_PAREN.add(LEFT_PAREN108);

                    total_rows=(Token)match(input,INT,FOLLOW_INT_in_forwardselection1295);  
                    stream_INT.add(total_rows);

                    COMMA109=(Token)match(input,COMMA,FOLLOW_COMMA_in_forwardselection1297);  
                    stream_COMMA.add(COMMA109);

                    levelofsignificance=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_forwardselection1301);  
                    stream_DOUBLE.add(levelofsignificance);

                    RIGHT_PAREN110=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_forwardselection1304);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN110);



                    // AST REWRITE
                    // elements: filenameList, total_rows, col, directory, levelofsignificance, morecol, filenameList
                    // token labels: col, directory, total_rows, levelofsignificance
                    // rule labels: retval
                    // token list labels: filenameList, morecol
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_col=new RewriteRuleTokenStream(adaptor,"token col",col);
                    RewriteRuleTokenStream stream_directory=new RewriteRuleTokenStream(adaptor,"token directory",directory);
                    RewriteRuleTokenStream stream_total_rows=new RewriteRuleTokenStream(adaptor,"token total_rows",total_rows);
                    RewriteRuleTokenStream stream_levelofsignificance=new RewriteRuleTokenStream(adaptor,"token levelofsignificance",levelofsignificance);
                    RewriteRuleTokenStream stream_filenameList=new RewriteRuleTokenStream(adaptor,"token filenameList", list_filenameList);
                    RewriteRuleTokenStream stream_morecol=new RewriteRuleTokenStream(adaptor,"token morecol", list_morecol);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 142:213: -> ^( TOK_FORWARDSELECTION $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows $levelofsignificance)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:142:215: ^( TOK_FORWARDSELECTION $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows $levelofsignificance)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_FORWARDSELECTION, "TOK_FORWARDSELECTION"), root_1);

                        adaptor.addChild(root_1, stream_col.nextNode());
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:142:243: ( $morecol)*
                        while ( stream_morecol.hasNext() ) {
                            adaptor.addChild(root_1, stream_morecol.nextNode());

                        }
                        stream_morecol.reset();
                        adaptor.addChild(root_1, stream_directory.nextNode());
                        if ( !(stream_filenameList.hasNext()||stream_filenameList.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_filenameList.hasNext()||stream_filenameList.hasNext() ) {
                            adaptor.addChild(root_1, stream_filenameList.nextNode());
                            adaptor.addChild(root_1, stream_filenameList.nextNode());

                        }
                        stream_filenameList.reset();
                        stream_filenameList.reset();
                        adaptor.addChild(root_1, stream_total_rows.nextNode());
                        adaptor.addChild(root_1, stream_levelofsignificance.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forwardselection"

    public static class sort_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sort"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:145:1: sort : ( SORT LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SORT $column_no $ip) | SORT LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ -> ^( TOK_SORT $column_no $directory ( $filenameList $filenameList)+ ) );
    public final NectarParser.sort_return sort() throws RecognitionException {
        NectarParser.sort_return retval = new NectarParser.sort_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_no=null;
        Token ip=null;
        Token directory=null;
        Token SORT111=null;
        Token LEFT_PAREN112=null;
        Token RIGHT_PAREN113=null;
        Token STDIN_OP114=null;
        Token SORT115=null;
        Token LEFT_PAREN116=null;
        Token RIGHT_PAREN117=null;
        Token STDIN_OP118=null;
        Token filenameList=null;
        List list_filenameList=null;

        Object column_no_tree=null;
        Object ip_tree=null;
        Object directory_tree=null;
        Object SORT111_tree=null;
        Object LEFT_PAREN112_tree=null;
        Object RIGHT_PAREN113_tree=null;
        Object STDIN_OP114_tree=null;
        Object SORT115_tree=null;
        Object LEFT_PAREN116_tree=null;
        Object RIGHT_PAREN117_tree=null;
        Object STDIN_OP118_tree=null;
        Object filenameList_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_SORT=new RewriteRuleTokenStream(adaptor,"token SORT");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FORWARDSLASH=new RewriteRuleTokenStream(adaptor,"token FORWARDSLASH");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

         paraphrases.push("\n"+"USAGE :sort(column_no)<<input_file"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:148:1: ( SORT LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SORT $column_no $ip) | SORT LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ -> ^( TOK_SORT $column_no $directory ( $filenameList $filenameList)+ ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==SORT) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==LEFT_PAREN) ) {
                    int LA25_2 = input.LA(3);

                    if ( (LA25_2==INT) ) {
                        int LA25_3 = input.LA(4);

                        if ( (LA25_3==RIGHT_PAREN) ) {
                            int LA25_4 = input.LA(5);

                            if ( (LA25_4==STDIN_OP) ) {
                                int LA25_5 = input.LA(6);

                                if ( (LA25_5==ID) ) {
                                    int LA25_6 = input.LA(7);

                                    if ( (LA25_6==EOF) ) {
                                        alt25=1;
                                    }
                                    else if ( (LA25_6==FORWARDSLASH) ) {
                                        alt25=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 25, 6, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 25, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 25, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:148:3: SORT LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP ip= ID
                    {
                    SORT111=(Token)match(input,SORT,FOLLOW_SORT_in_sort1369);  
                    stream_SORT.add(SORT111);

                    LEFT_PAREN112=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_sort1372);  
                    stream_LEFT_PAREN.add(LEFT_PAREN112);

                    column_no=(Token)match(input,INT,FOLLOW_INT_in_sort1376);  
                    stream_INT.add(column_no);

                    RIGHT_PAREN113=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_sort1378);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN113);

                    STDIN_OP114=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_sort1380);  
                    stream_STDIN_OP.add(STDIN_OP114);

                    ip=(Token)match(input,ID,FOLLOW_ID_in_sort1384);  
                    stream_ID.add(ip);



                    // AST REWRITE
                    // elements: column_no, ip
                    // token labels: column_no, ip
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_column_no=new RewriteRuleTokenStream(adaptor,"token column_no",column_no);
                    RewriteRuleTokenStream stream_ip=new RewriteRuleTokenStream(adaptor,"token ip",ip);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 148:61: -> ^( TOK_SORT $column_no $ip)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:148:63: ^( TOK_SORT $column_no $ip)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_SORT, "TOK_SORT"), root_1);

                        adaptor.addChild(root_1, stream_column_no.nextNode());
                        adaptor.addChild(root_1, stream_ip.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:150:1: SORT LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+
                    {
                    SORT115=(Token)match(input,SORT,FOLLOW_SORT_in_sort1401);  
                    stream_SORT.add(SORT115);

                    LEFT_PAREN116=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_sort1404);  
                    stream_LEFT_PAREN.add(LEFT_PAREN116);

                    column_no=(Token)match(input,INT,FOLLOW_INT_in_sort1408);  
                    stream_INT.add(column_no);

                    RIGHT_PAREN117=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_sort1410);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN117);

                    STDIN_OP118=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_sort1412);  
                    stream_STDIN_OP.add(STDIN_OP118);

                    directory=(Token)match(input,ID,FOLLOW_ID_in_sort1416);  
                    stream_ID.add(directory);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:150:66: (filenameList+= FORWARDSLASH filenameList+= ID )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==FORWARDSLASH) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:150:67: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    filenameList=(Token)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_sort1421);  
                    	    stream_FORWARDSLASH.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    filenameList=(Token)match(input,ID,FOLLOW_ID_in_sort1425);  
                    	    stream_ID.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);



                    // AST REWRITE
                    // elements: directory, filenameList, filenameList, column_no
                    // token labels: directory, column_no
                    // rule labels: retval
                    // token list labels: filenameList
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_directory=new RewriteRuleTokenStream(adaptor,"token directory",directory);
                    RewriteRuleTokenStream stream_column_no=new RewriteRuleTokenStream(adaptor,"token column_no",column_no);
                    RewriteRuleTokenStream stream_filenameList=new RewriteRuleTokenStream(adaptor,"token filenameList", list_filenameList);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 150:113: -> ^( TOK_SORT $column_no $directory ( $filenameList $filenameList)+ )
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:150:115: ^( TOK_SORT $column_no $directory ( $filenameList $filenameList)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_SORT, "TOK_SORT"), root_1);

                        adaptor.addChild(root_1, stream_column_no.nextNode());
                        adaptor.addChild(root_1, stream_directory.nextNode());
                        if ( !(stream_filenameList.hasNext()||stream_filenameList.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_filenameList.hasNext()||stream_filenameList.hasNext() ) {
                            adaptor.addChild(root_1, stream_filenameList.nextNode());
                            adaptor.addChild(root_1, stream_filenameList.nextNode());

                        }
                        stream_filenameList.reset();
                        stream_filenameList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sort"

    public static class cov_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cov"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:153:1: cov : ( COV LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COV $column_x $column_y $ip $total_rows) | COV LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COV $column_x $column_y $directory ( $filenameList $filenameList)+ $total_rows) );
    public final NectarParser.cov_return cov() throws RecognitionException {
        NectarParser.cov_return retval = new NectarParser.cov_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_x=null;
        Token column_y=null;
        Token ip=null;
        Token total_rows=null;
        Token directory=null;
        Token COV119=null;
        Token LEFT_PAREN120=null;
        Token COMMA121=null;
        Token RIGHT_PAREN122=null;
        Token STDIN_OP123=null;
        Token LEFT_PAREN124=null;
        Token RIGHT_PAREN125=null;
        Token COV126=null;
        Token LEFT_PAREN127=null;
        Token COMMA128=null;
        Token RIGHT_PAREN129=null;
        Token STDIN_OP130=null;
        Token LEFT_PAREN131=null;
        Token RIGHT_PAREN132=null;
        Token filenameList=null;
        List list_filenameList=null;

        Object column_x_tree=null;
        Object column_y_tree=null;
        Object ip_tree=null;
        Object total_rows_tree=null;
        Object directory_tree=null;
        Object COV119_tree=null;
        Object LEFT_PAREN120_tree=null;
        Object COMMA121_tree=null;
        Object RIGHT_PAREN122_tree=null;
        Object STDIN_OP123_tree=null;
        Object LEFT_PAREN124_tree=null;
        Object RIGHT_PAREN125_tree=null;
        Object COV126_tree=null;
        Object LEFT_PAREN127_tree=null;
        Object COMMA128_tree=null;
        Object RIGHT_PAREN129_tree=null;
        Object STDIN_OP130_tree=null;
        Object LEFT_PAREN131_tree=null;
        Object RIGHT_PAREN132_tree=null;
        Object filenameList_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FORWARDSLASH=new RewriteRuleTokenStream(adaptor,"token FORWARDSLASH");
        RewriteRuleTokenStream stream_COV=new RewriteRuleTokenStream(adaptor,"token COV");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

         paraphrases.push("\n"+"USAGE :cov(column_no1,column_no2)<<input_file(total_no_of_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:156:1: ( COV LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COV $column_x $column_y $ip $total_rows) | COV LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COV $column_x $column_y $directory ( $filenameList $filenameList)+ $total_rows) )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:156:3: COV LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN
                    {
                    COV119=(Token)match(input,COV,FOLLOW_COV_in_cov1474);  
                    stream_COV.add(COV119);

                    LEFT_PAREN120=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_cov1476);  
                    stream_LEFT_PAREN.add(LEFT_PAREN120);

                    column_x=(Token)match(input,INT,FOLLOW_INT_in_cov1480);  
                    stream_INT.add(column_x);

                    COMMA121=(Token)match(input,COMMA,FOLLOW_COMMA_in_cov1482);  
                    stream_COMMA.add(COMMA121);

                    column_y=(Token)match(input,INT,FOLLOW_INT_in_cov1487);  
                    stream_INT.add(column_y);

                    RIGHT_PAREN122=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_cov1489);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN122);

                    STDIN_OP123=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_cov1491);  
                    stream_STDIN_OP.add(STDIN_OP123);

                    ip=(Token)match(input,ID,FOLLOW_ID_in_cov1495);  
                    stream_ID.add(ip);

                    LEFT_PAREN124=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_cov1497);  
                    stream_LEFT_PAREN.add(LEFT_PAREN124);

                    total_rows=(Token)match(input,INT,FOLLOW_INT_in_cov1501);  
                    stream_INT.add(total_rows);

                    RIGHT_PAREN125=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_cov1504);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN125);



                    // AST REWRITE
                    // elements: total_rows, column_x, ip, column_y
                    // token labels: column_x, column_y, total_rows, ip
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_column_x=new RewriteRuleTokenStream(adaptor,"token column_x",column_x);
                    RewriteRuleTokenStream stream_column_y=new RewriteRuleTokenStream(adaptor,"token column_y",column_y);
                    RewriteRuleTokenStream stream_total_rows=new RewriteRuleTokenStream(adaptor,"token total_rows",total_rows);
                    RewriteRuleTokenStream stream_ip=new RewriteRuleTokenStream(adaptor,"token ip",ip);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:116: -> ^( TOK_COV $column_x $column_y $ip $total_rows)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:156:119: ^( TOK_COV $column_x $column_y $ip $total_rows)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_COV, "TOK_COV"), root_1);

                        adaptor.addChild(root_1, stream_column_x.nextNode());
                        adaptor.addChild(root_1, stream_column_y.nextNode());
                        adaptor.addChild(root_1, stream_ip.nextNode());
                        adaptor.addChild(root_1, stream_total_rows.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:158:2: COV LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN
                    {
                    COV126=(Token)match(input,COV,FOLLOW_COV_in_cov1527);  
                    stream_COV.add(COV126);

                    LEFT_PAREN127=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_cov1529);  
                    stream_LEFT_PAREN.add(LEFT_PAREN127);

                    column_x=(Token)match(input,INT,FOLLOW_INT_in_cov1533);  
                    stream_INT.add(column_x);

                    COMMA128=(Token)match(input,COMMA,FOLLOW_COMMA_in_cov1535);  
                    stream_COMMA.add(COMMA128);

                    column_y=(Token)match(input,INT,FOLLOW_INT_in_cov1540);  
                    stream_INT.add(column_y);

                    RIGHT_PAREN129=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_cov1542);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN129);

                    STDIN_OP130=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_cov1544);  
                    stream_STDIN_OP.add(STDIN_OP130);

                    directory=(Token)match(input,ID,FOLLOW_ID_in_cov1548);  
                    stream_ID.add(directory);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:158:84: (filenameList+= FORWARDSLASH filenameList+= ID )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==FORWARDSLASH) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:158:85: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    filenameList=(Token)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_cov1553);  
                    	    stream_FORWARDSLASH.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    filenameList=(Token)match(input,ID,FOLLOW_ID_in_cov1557);  
                    	    stream_ID.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);

                    LEFT_PAREN131=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_cov1561);  
                    stream_LEFT_PAREN.add(LEFT_PAREN131);

                    total_rows=(Token)match(input,INT,FOLLOW_INT_in_cov1565);  
                    stream_INT.add(total_rows);

                    RIGHT_PAREN132=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_cov1568);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN132);



                    // AST REWRITE
                    // elements: filenameList, directory, total_rows, column_x, filenameList, column_y
                    // token labels: directory, column_x, column_y, total_rows
                    // rule labels: retval
                    // token list labels: filenameList
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_directory=new RewriteRuleTokenStream(adaptor,"token directory",directory);
                    RewriteRuleTokenStream stream_column_x=new RewriteRuleTokenStream(adaptor,"token column_x",column_x);
                    RewriteRuleTokenStream stream_column_y=new RewriteRuleTokenStream(adaptor,"token column_y",column_y);
                    RewriteRuleTokenStream stream_total_rows=new RewriteRuleTokenStream(adaptor,"token total_rows",total_rows);
                    RewriteRuleTokenStream stream_filenameList=new RewriteRuleTokenStream(adaptor,"token filenameList", list_filenameList);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:169: -> ^( TOK_COV $column_x $column_y $directory ( $filenameList $filenameList)+ $total_rows)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:158:172: ^( TOK_COV $column_x $column_y $directory ( $filenameList $filenameList)+ $total_rows)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_COV, "TOK_COV"), root_1);

                        adaptor.addChild(root_1, stream_column_x.nextNode());
                        adaptor.addChild(root_1, stream_column_y.nextNode());
                        adaptor.addChild(root_1, stream_directory.nextNode());
                        if ( !(stream_filenameList.hasNext()||stream_filenameList.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_filenameList.hasNext()||stream_filenameList.hasNext() ) {
                            adaptor.addChild(root_1, stream_filenameList.nextNode());
                            adaptor.addChild(root_1, stream_filenameList.nextNode());

                        }
                        stream_filenameList.reset();
                        stream_filenameList.reset();
                        adaptor.addChild(root_1, stream_total_rows.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cov"

    public static class covmatrix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "covmatrix"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:161:1: covmatrix : ( COVMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COVMATRIX $col ( $morecol)* $ip $total_rows) | COVMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COVMATRIX $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows) );
    public final NectarParser.covmatrix_return covmatrix() throws RecognitionException {
        NectarParser.covmatrix_return retval = new NectarParser.covmatrix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token col=null;
        Token ip=null;
        Token total_rows=null;
        Token directory=null;
        Token COVMATRIX133=null;
        Token LEFT_PAREN134=null;
        Token COMMA135=null;
        Token RIGHT_PAREN136=null;
        Token STDIN_OP137=null;
        Token LEFT_PAREN138=null;
        Token RIGHT_PAREN139=null;
        Token COVMATRIX140=null;
        Token LEFT_PAREN141=null;
        Token COMMA142=null;
        Token RIGHT_PAREN143=null;
        Token STDIN_OP144=null;
        Token LEFT_PAREN145=null;
        Token RIGHT_PAREN146=null;
        Token morecol=null;
        Token filenameList=null;
        List list_morecol=null;
        List list_filenameList=null;

        Object col_tree=null;
        Object ip_tree=null;
        Object total_rows_tree=null;
        Object directory_tree=null;
        Object COVMATRIX133_tree=null;
        Object LEFT_PAREN134_tree=null;
        Object COMMA135_tree=null;
        Object RIGHT_PAREN136_tree=null;
        Object STDIN_OP137_tree=null;
        Object LEFT_PAREN138_tree=null;
        Object RIGHT_PAREN139_tree=null;
        Object COVMATRIX140_tree=null;
        Object LEFT_PAREN141_tree=null;
        Object COMMA142_tree=null;
        Object RIGHT_PAREN143_tree=null;
        Object STDIN_OP144_tree=null;
        Object LEFT_PAREN145_tree=null;
        Object RIGHT_PAREN146_tree=null;
        Object morecol_tree=null;
        Object filenameList_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_COVMATRIX=new RewriteRuleTokenStream(adaptor,"token COVMATRIX");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FORWARDSLASH=new RewriteRuleTokenStream(adaptor,"token FORWARDSLASH");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

         paraphrases.push("\n"+"USAGE :covmatrix(column_nos)<<input_file(total_no_of_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:164:1: ( COVMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COVMATRIX $col ( $morecol)* $ip $total_rows) | COVMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COVMATRIX $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows) )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:164:3: COVMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN
                    {
                    COVMATRIX133=(Token)match(input,COVMATRIX,FOLLOW_COVMATRIX_in_covmatrix1633);  
                    stream_COVMATRIX.add(COVMATRIX133);

                    LEFT_PAREN134=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_covmatrix1636);  
                    stream_LEFT_PAREN.add(LEFT_PAREN134);

                    col=(Token)match(input,INT,FOLLOW_INT_in_covmatrix1640);  
                    stream_INT.add(col);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:164:33: ( COMMA morecol+= INT )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==COMMA) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:164:34: COMMA morecol+= INT
                    	    {
                    	    COMMA135=(Token)match(input,COMMA,FOLLOW_COMMA_in_covmatrix1643);  
                    	    stream_COMMA.add(COMMA135);

                    	    morecol=(Token)match(input,INT,FOLLOW_INT_in_covmatrix1647);  
                    	    stream_INT.add(morecol);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    RIGHT_PAREN136=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_covmatrix1651);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN136);

                    STDIN_OP137=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_covmatrix1653);  
                    stream_STDIN_OP.add(STDIN_OP137);

                    ip=(Token)match(input,ID,FOLLOW_ID_in_covmatrix1657);  
                    stream_ID.add(ip);

                    LEFT_PAREN138=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_covmatrix1659);  
                    stream_LEFT_PAREN.add(LEFT_PAREN138);

                    total_rows=(Token)match(input,INT,FOLLOW_INT_in_covmatrix1663);  
                    stream_INT.add(total_rows);

                    RIGHT_PAREN139=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_covmatrix1666);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN139);



                    // AST REWRITE
                    // elements: col, morecol, ip, total_rows
                    // token labels: col, total_rows, ip
                    // rule labels: retval
                    // token list labels: morecol
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_col=new RewriteRuleTokenStream(adaptor,"token col",col);
                    RewriteRuleTokenStream stream_total_rows=new RewriteRuleTokenStream(adaptor,"token total_rows",total_rows);
                    RewriteRuleTokenStream stream_ip=new RewriteRuleTokenStream(adaptor,"token ip",ip);
                    RewriteRuleTokenStream stream_morecol=new RewriteRuleTokenStream(adaptor,"token morecol", list_morecol);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 164:120: -> ^( TOK_COVMATRIX $col ( $morecol)* $ip $total_rows)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:164:123: ^( TOK_COVMATRIX $col ( $morecol)* $ip $total_rows)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_COVMATRIX, "TOK_COVMATRIX"), root_1);

                        adaptor.addChild(root_1, stream_col.nextNode());
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:164:145: ( $morecol)*
                        while ( stream_morecol.hasNext() ) {
                            adaptor.addChild(root_1, stream_morecol.nextNode());

                        }
                        stream_morecol.reset();
                        adaptor.addChild(root_1, stream_ip.nextNode());
                        adaptor.addChild(root_1, stream_total_rows.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:166:2: COVMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN
                    {
                    COVMATRIX140=(Token)match(input,COVMATRIX,FOLLOW_COVMATRIX_in_covmatrix1691);  
                    stream_COVMATRIX.add(COVMATRIX140);

                    LEFT_PAREN141=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_covmatrix1694);  
                    stream_LEFT_PAREN.add(LEFT_PAREN141);

                    col=(Token)match(input,INT,FOLLOW_INT_in_covmatrix1698);  
                    stream_INT.add(col);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:166:32: ( COMMA morecol+= INT )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==COMMA) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:166:33: COMMA morecol+= INT
                    	    {
                    	    COMMA142=(Token)match(input,COMMA,FOLLOW_COMMA_in_covmatrix1701);  
                    	    stream_COMMA.add(COMMA142);

                    	    morecol=(Token)match(input,INT,FOLLOW_INT_in_covmatrix1705);  
                    	    stream_INT.add(morecol);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    RIGHT_PAREN143=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_covmatrix1709);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN143);

                    STDIN_OP144=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_covmatrix1711);  
                    stream_STDIN_OP.add(STDIN_OP144);

                    directory=(Token)match(input,ID,FOLLOW_ID_in_covmatrix1715);  
                    stream_ID.add(directory);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:166:88: (filenameList+= FORWARDSLASH filenameList+= ID )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==FORWARDSLASH) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:166:89: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    filenameList=(Token)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_covmatrix1720);  
                    	    stream_FORWARDSLASH.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    filenameList=(Token)match(input,ID,FOLLOW_ID_in_covmatrix1724);  
                    	    stream_ID.add(filenameList);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);

                    LEFT_PAREN145=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_covmatrix1728);  
                    stream_LEFT_PAREN.add(LEFT_PAREN145);

                    total_rows=(Token)match(input,INT,FOLLOW_INT_in_covmatrix1732);  
                    stream_INT.add(total_rows);

                    RIGHT_PAREN146=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_covmatrix1735);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN146);



                    // AST REWRITE
                    // elements: filenameList, filenameList, col, directory, morecol, total_rows
                    // token labels: col, directory, total_rows
                    // rule labels: retval
                    // token list labels: filenameList, morecol
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_col=new RewriteRuleTokenStream(adaptor,"token col",col);
                    RewriteRuleTokenStream stream_directory=new RewriteRuleTokenStream(adaptor,"token directory",directory);
                    RewriteRuleTokenStream stream_total_rows=new RewriteRuleTokenStream(adaptor,"token total_rows",total_rows);
                    RewriteRuleTokenStream stream_filenameList=new RewriteRuleTokenStream(adaptor,"token filenameList", list_filenameList);
                    RewriteRuleTokenStream stream_morecol=new RewriteRuleTokenStream(adaptor,"token morecol", list_morecol);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 166:173: -> ^( TOK_COVMATRIX $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows)
                    {
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:166:176: ^( TOK_COVMATRIX $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_COVMATRIX, "TOK_COVMATRIX"), root_1);

                        adaptor.addChild(root_1, stream_col.nextNode());
                        // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:166:198: ( $morecol)*
                        while ( stream_morecol.hasNext() ) {
                            adaptor.addChild(root_1, stream_morecol.nextNode());

                        }
                        stream_morecol.reset();
                        adaptor.addChild(root_1, stream_directory.nextNode());
                        if ( !(stream_filenameList.hasNext()||stream_filenameList.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_filenameList.hasNext()||stream_filenameList.hasNext() ) {
                            adaptor.addChild(root_1, stream_filenameList.nextNode());
                            adaptor.addChild(root_1, stream_filenameList.nextNode());

                        }
                        stream_filenameList.reset();
                        stream_filenameList.reset();
                        adaptor.addChild(root_1, stream_total_rows.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             paraphrases.pop(); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "covmatrix"

    public static class help_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "help"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:169:1: help : HELP terminator ;
    public final NectarParser.help_return help() throws RecognitionException {
        NectarParser.help_return retval = new NectarParser.help_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token HELP147=null;
        NectarParser.terminator_return terminator148 = null;


        Object HELP147_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:169:6: ( HELP terminator )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:169:8: HELP terminator
            {
            root_0 = (Object)adaptor.nil();

            HELP147=(Token)match(input,HELP,FOLLOW_HELP_in_help1788); 
            HELP147_tree = (Object)adaptor.create(HELP147);
            adaptor.addChild(root_0, HELP147_tree);

            pushFollow(FOLLOW_terminator_in_help1790);
            terminator148=terminator();

            state._fsp--;

            adaptor.addChild(root_0, terminator148.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "help"

    public static class terminator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "terminator"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:172:1: terminator : ( NEWLINE | EOF );
    public final NectarParser.terminator_return terminator() throws RecognitionException {
        NectarParser.terminator_return retval = new NectarParser.terminator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set149=null;

        Object set149_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:172:11: ( NEWLINE | EOF )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set149=(Token)input.LT(1);
            if ( input.LA(1)==EOF||input.LA(1)==NEWLINE ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set149));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "terminator"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA5_eotS =
        "\13\uffff";
    static final String DFA5_eofS =
        "\10\uffff\1\12\2\uffff";
    static final String DFA5_minS =
        "\1\11\1\4\1\31\1\25\1\31\1\5\1\23\1\30\1\6\2\uffff";
    static final String DFA5_maxS =
        "\1\11\1\4\1\31\1\25\1\31\1\5\1\23\1\30\1\6\2\uffff";
    static final String DFA5_acceptS =
        "\11\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\13\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "89:1: sigmaxy : ( SIGMAXY LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SIGMAXY $column_x $column_y $ip) | SIGMAXY LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ -> ^( TOK_SIGMAXY $column_x $column_y $directory ( $filenameList $filenameList)+ ) );";
        }
    }
    static final String DFA11_eotS =
        "\13\uffff";
    static final String DFA11_eofS =
        "\13\uffff";
    static final String DFA11_minS =
        "\1\14\1\4\1\31\1\25\1\31\1\5\1\23\1\30\1\4\2\uffff";
    static final String DFA11_maxS =
        "\1\14\1\4\1\31\1\25\1\31\1\5\1\23\1\30\1\6\2\uffff";
    static final String DFA11_acceptS =
        "\11\uffff\1\1\1\2";
    static final String DFA11_specialS =
        "\13\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11\1\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "113:1: correlation : ( CORR LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORR $column_x $column_y $ip $total_rows) | CORR LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORR $column_x $column_y $directory ( $filenameList $filenameList)+ $total_rows) );";
        }
    }
    static final String DFA15_eotS =
        "\13\uffff";
    static final String DFA15_eofS =
        "\13\uffff";
    static final String DFA15_minS =
        "\1\15\1\4\1\31\1\5\1\31\1\23\1\5\1\30\1\4\2\uffff";
    static final String DFA15_maxS =
        "\1\15\1\4\1\31\1\25\1\31\1\23\1\25\1\30\1\6\2\uffff";
    static final String DFA15_acceptS =
        "\11\uffff\1\1\1\2";
    static final String DFA15_specialS =
        "\13\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\17\uffff\1\4",
            "\1\6",
            "\1\7",
            "\1\5\17\uffff\1\4",
            "\1\10",
            "\1\11\1\uffff\1\12",
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
            return "121:1: correlationmatrix : ( CORRMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORRMATRIX $col ( $morecol)* $ip $total_rows) | CORRMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORRMATRIX $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows) );";
        }
    }
    static final String DFA19_eotS =
        "\13\uffff";
    static final String DFA19_eofS =
        "\13\uffff";
    static final String DFA19_minS =
        "\1\16\1\4\1\31\1\5\1\31\1\23\1\5\1\30\1\4\2\uffff";
    static final String DFA19_maxS =
        "\1\16\1\4\1\31\1\25\1\31\1\23\1\25\1\30\1\6\2\uffff";
    static final String DFA19_acceptS =
        "\11\uffff\1\1\1\2";
    static final String DFA19_specialS =
        "\13\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\17\uffff\1\4",
            "\1\6",
            "\1\7",
            "\1\5\17\uffff\1\4",
            "\1\10",
            "\1\11\1\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "129:1: multiplereg : ( MULTIPLEREG LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_MULTIPLEREG $col ( $morecol)* $ip $total_rows) | MULTIPLEREG LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_MULTIPLEREG $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows) );";
        }
    }
    static final String DFA23_eotS =
        "\13\uffff";
    static final String DFA23_eofS =
        "\13\uffff";
    static final String DFA23_minS =
        "\1\17\1\4\1\31\1\5\1\31\1\23\1\5\1\30\1\4\2\uffff";
    static final String DFA23_maxS =
        "\1\17\1\4\1\31\1\25\1\31\1\23\1\25\1\30\1\6\2\uffff";
    static final String DFA23_acceptS =
        "\11\uffff\1\1\1\2";
    static final String DFA23_specialS =
        "\13\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\17\uffff\1\4",
            "\1\6",
            "\1\7",
            "\1\5\17\uffff\1\4",
            "\1\10",
            "\1\11\1\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "137:1: forwardselection : ( FORWARDSELECTION LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT COMMA levelofsignificance= DOUBLE RIGHT_PAREN -> ^( TOK_FORWARDSELECTION $col ( $morecol)* $ip $total_rows $levelofsignificance) | FORWARDSELECTION LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT COMMA levelofsignificance= DOUBLE RIGHT_PAREN -> ^( TOK_FORWARDSELECTION $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows $levelofsignificance) );";
        }
    }
    static final String DFA27_eotS =
        "\13\uffff";
    static final String DFA27_eofS =
        "\13\uffff";
    static final String DFA27_minS =
        "\1\21\1\4\1\31\1\25\1\31\1\5\1\23\1\30\1\4\2\uffff";
    static final String DFA27_maxS =
        "\1\21\1\4\1\31\1\25\1\31\1\5\1\23\1\30\1\6\2\uffff";
    static final String DFA27_acceptS =
        "\11\uffff\1\1\1\2";
    static final String DFA27_specialS =
        "\13\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11\1\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "153:1: cov : ( COV LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COV $column_x $column_y $ip $total_rows) | COV LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COV $column_x $column_y $directory ( $filenameList $filenameList)+ $total_rows) );";
        }
    }
    static final String DFA31_eotS =
        "\13\uffff";
    static final String DFA31_eofS =
        "\13\uffff";
    static final String DFA31_minS =
        "\1\22\1\4\1\31\1\5\1\31\1\23\1\5\1\30\1\4\2\uffff";
    static final String DFA31_maxS =
        "\1\22\1\4\1\31\1\25\1\31\1\23\1\25\1\30\1\6\2\uffff";
    static final String DFA31_acceptS =
        "\11\uffff\1\1\1\2";
    static final String DFA31_specialS =
        "\13\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\17\uffff\1\4",
            "\1\6",
            "\1\7",
            "\1\5\17\uffff\1\4",
            "\1\10",
            "\1\11\1\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "161:1: covmatrix : ( COVMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COVMATRIX $col ( $morecol)* $ip $total_rows) | COVMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COVMATRIX $col ( $morecol)* $directory ( $filenameList $filenameList)+ $total_rows) );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_start105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sigmax_in_statement123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sigmaxy_in_statement127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sigmaxsquare_in_statement131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mean_in_statement135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_correlation_in_statement138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_correlationmatrix_in_statement142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplereg_in_statement146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forwardselection_in_statement150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sort_in_statement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cov_in_statement158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_covmatrix_in_statement162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_help_in_statement166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGMAX_in_sigmax207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_sigmax209 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_sigmax213 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_sigmax215 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_sigmax217 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmax221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGMAX_in_sigmax247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_sigmax249 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_sigmax253 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_sigmax255 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_sigmax257 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmax261 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_sigmax266 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmax270 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_SIGMAXY_in_sigmaxy314 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_sigmaxy316 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_sigmaxy320 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_sigmaxy322 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_sigmaxy327 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_sigmaxy329 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_sigmaxy331 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmaxy335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGMAXY_in_sigmaxy360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_sigmaxy362 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_sigmaxy366 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_sigmaxy368 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_sigmaxy373 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_sigmaxy375 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_sigmaxy377 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmaxy381 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_sigmaxy386 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmaxy390 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_SIGMAXSQUARE_in_sigmaxsquare451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_sigmaxsquare453 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_sigmaxsquare457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_sigmaxsquare459 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_sigmaxsquare461 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmaxsquare466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGMAXSQUARE_in_sigmaxsquare490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_sigmaxsquare492 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_sigmaxsquare496 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_sigmaxsquare498 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_sigmaxsquare500 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmaxsquare504 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_sigmaxsquare509 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmaxsquare513 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_MEAN_in_mean567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_mean570 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_mean574 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_mean578 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_mean581 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_mean586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_mean588 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_mean592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_mean595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEAN_in_mean618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_mean621 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_mean625 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_mean629 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_mean632 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_mean637 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_mean642 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_mean646 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_mean650 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_mean654 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_mean656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CORR_in_correlation712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_correlation714 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlation718 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_correlation720 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlation724 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_correlation726 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_correlation728 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_correlation732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_correlation734 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlation738 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_correlation741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CORR_in_correlation768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_correlation770 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlation774 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_correlation776 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlation780 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_correlation782 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_correlation784 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_correlation788 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_correlation793 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_correlation797 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_correlation801 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlation805 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_correlation808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CORRMATRIX_in_correlationmatrix868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_correlationmatrix870 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix874 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_COMMA_in_correlationmatrix877 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix881 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_correlationmatrix885 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_correlationmatrix887 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_correlationmatrix891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_correlationmatrix893 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix897 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_correlationmatrix900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CORRMATRIX_in_correlationmatrix927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_correlationmatrix929 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix933 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_COMMA_in_correlationmatrix936 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix940 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_correlationmatrix944 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_correlationmatrix946 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_correlationmatrix950 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_correlationmatrix955 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_correlationmatrix959 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_correlationmatrix963 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix967 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_correlationmatrix970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULTIPLEREG_in_multiplereg1030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_multiplereg1032 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_multiplereg1036 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_COMMA_in_multiplereg1039 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_multiplereg1043 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_multiplereg1047 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_multiplereg1049 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_multiplereg1053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_multiplereg1055 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_multiplereg1059 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_multiplereg1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULTIPLEREG_in_multiplereg1084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_multiplereg1086 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_multiplereg1090 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_COMMA_in_multiplereg1093 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_multiplereg1097 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_multiplereg1101 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_multiplereg1103 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_multiplereg1108 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_multiplereg1113 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_multiplereg1117 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_multiplereg1121 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_multiplereg1125 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_multiplereg1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORWARDSELECTION_in_forwardselection1189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_forwardselection1192 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_forwardselection1196 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_COMMA_in_forwardselection1199 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_forwardselection1203 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_forwardselection1207 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_forwardselection1209 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_forwardselection1213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_forwardselection1215 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_forwardselection1219 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_forwardselection1221 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DOUBLE_in_forwardselection1225 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_forwardselection1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORWARDSELECTION_in_forwardselection1254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_forwardselection1257 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_forwardselection1261 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_COMMA_in_forwardselection1264 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_forwardselection1268 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_forwardselection1272 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_forwardselection1274 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_forwardselection1278 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_forwardselection1283 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_forwardselection1287 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_forwardselection1291 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_forwardselection1295 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_forwardselection1297 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DOUBLE_in_forwardselection1301 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_forwardselection1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SORT_in_sort1369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_sort1372 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_sort1376 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_sort1378 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_sort1380 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sort1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SORT_in_sort1401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_sort1404 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_sort1408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_sort1410 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_sort1412 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sort1416 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_sort1421 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sort1425 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COV_in_cov1474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_cov1476 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_cov1480 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_cov1482 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_cov1487 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_cov1489 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_cov1491 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_cov1495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_cov1497 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_cov1501 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_cov1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COV_in_cov1527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_cov1529 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_cov1533 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_cov1535 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_cov1540 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_cov1542 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_cov1544 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_cov1548 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_cov1553 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_cov1557 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_cov1561 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_cov1565 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_cov1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COVMATRIX_in_covmatrix1633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_covmatrix1636 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_covmatrix1640 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_COMMA_in_covmatrix1643 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_covmatrix1647 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_covmatrix1651 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_covmatrix1653 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_covmatrix1657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_covmatrix1659 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_covmatrix1663 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_covmatrix1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COVMATRIX_in_covmatrix1691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_covmatrix1694 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_covmatrix1698 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_COMMA_in_covmatrix1701 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_covmatrix1705 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_covmatrix1709 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_STDIN_OP_in_covmatrix1711 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_covmatrix1715 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_covmatrix1720 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_covmatrix1724 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_covmatrix1728 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_covmatrix1732 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_covmatrix1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_help1788 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_terminator_in_help1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_terminator0 = new BitSet(new long[]{0x0000000000000002L});

}