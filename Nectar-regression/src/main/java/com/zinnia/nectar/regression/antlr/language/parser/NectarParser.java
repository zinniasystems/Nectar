// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g 2011-09-28 13:48:05

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LEFT_PAREN", "RIGHT_PAREN", "HELP", "SIGMAX", "SIGMAXY", "SIGMAXSQUARE", "MEAN", "CORR", "CORRMATRIX", "MULTIPLEREG", "FORWARDSELECTION", "SORT", "COV", "COVMATRIX", "STDIN_OP", "DOT", "COMMA", "EXTN", "NEWLINE", "ID", "INT", "FLOAT", "SPACE", "WHITESPACE", "SINGLE_COMMENT", "MULTI_COMMENT", "DOUBLE", "TOK_SIGMAX", "TOK_SIGMAXY", "TOK_SIGMAXSQUARE", "TOK_MEAN", "TOK_CORR", "TOK_CORRMATRIX", "TOK_MULTIPLEREG", "TOK_FORWARDSELECTION", "TOK_SORT", "TOK_COV", "TOK_COVMATRIX", "TOK_HELP"
    };
    public static final int HELP=6;
    public static final int COVMATRIX=17;
    public static final int EXTN=21;
    public static final int TOK_FORWARDSELECTION=38;
    public static final int CORRMATRIX=12;
    public static final int SIGMAX=7;
    public static final int MEAN=10;
    public static final int MULTI_COMMENT=29;
    public static final int TOK_COV=40;
    public static final int TOK_SIGMAXSQUARE=33;
    public static final int TOK_COVMATRIX=41;
    public static final int MULTIPLEREG=13;
    public static final int WHITESPACE=27;
    public static final int SORT=15;
    public static final int TOK_SORT=39;
    public static final int FLOAT=25;
    public static final int INT=24;
    public static final int ID=23;
    public static final int EOF=-1;
    public static final int SPACE=26;
    public static final int TOK_MEAN=34;
    public static final int SIGMAXY=8;
    public static final int TOK_MULTIPLEREG=37;
    public static final int TOK_CORRMATRIX=36;
    public static final int RIGHT_PAREN=5;
    public static final int STDIN_OP=18;
    public static final int NEWLINE=22;
    public static final int COV=16;
    public static final int COMMA=20;
    public static final int TOK_CORR=35;
    public static final int FORWARDSELECTION=14;
    public static final int LEFT_PAREN=4;
    public static final int DOUBLE=30;
    public static final int TOK_SIGMAX=31;
    public static final int SINGLE_COMMENT=28;
    public static final int SIGMAXSQUARE=9;
    public static final int TOK_HELP=42;
    public static final int DOT=19;
    public static final int TOK_SIGMAXY=32;
    public static final int CORR=11;

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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:73:1: start : statement EOF ;
    public final NectarParser.start_return start() throws RecognitionException {
        NectarParser.start_return retval = new NectarParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        NectarParser.statement_return statement1 = null;


        Object EOF2_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:73:7: ( statement EOF )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:73:9: statement EOF
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:1: statement : ( sigmax | sigmaxy | sigmaxsquare | mean | correlation | correlationmatrix | multiplereg | forwardselection | sort | cov | covmatrix | help );
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
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:11: ( sigmax | sigmaxy | sigmaxsquare | mean | correlation | correlationmatrix | multiplereg | forwardselection | sort | cov | covmatrix | help )
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:13: sigmax
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sigmax_in_statement123);
                    sigmax3=sigmax();

                    state._fsp--;

                    adaptor.addChild(root_0, sigmax3.getTree());

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:22: sigmaxy
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sigmaxy_in_statement127);
                    sigmaxy4=sigmaxy();

                    state._fsp--;

                    adaptor.addChild(root_0, sigmaxy4.getTree());

                    }
                    break;
                case 3 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:32: sigmaxsquare
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sigmaxsquare_in_statement131);
                    sigmaxsquare5=sigmaxsquare();

                    state._fsp--;

                    adaptor.addChild(root_0, sigmaxsquare5.getTree());

                    }
                    break;
                case 4 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:47: mean
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_mean_in_statement135);
                    mean6=mean();

                    state._fsp--;

                    adaptor.addChild(root_0, mean6.getTree());

                    }
                    break;
                case 5 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:53: correlation
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_correlation_in_statement138);
                    correlation7=correlation();

                    state._fsp--;

                    adaptor.addChild(root_0, correlation7.getTree());

                    }
                    break;
                case 6 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:67: correlationmatrix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_correlationmatrix_in_statement142);
                    correlationmatrix8=correlationmatrix();

                    state._fsp--;

                    adaptor.addChild(root_0, correlationmatrix8.getTree());

                    }
                    break;
                case 7 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:87: multiplereg
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_multiplereg_in_statement146);
                    multiplereg9=multiplereg();

                    state._fsp--;

                    adaptor.addChild(root_0, multiplereg9.getTree());

                    }
                    break;
                case 8 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:101: forwardselection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forwardselection_in_statement150);
                    forwardselection10=forwardselection();

                    state._fsp--;

                    adaptor.addChild(root_0, forwardselection10.getTree());

                    }
                    break;
                case 9 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:120: sort
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_sort_in_statement154);
                    sort11=sort();

                    state._fsp--;

                    adaptor.addChild(root_0, sort11.getTree());

                    }
                    break;
                case 10 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:127: cov
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cov_in_statement158);
                    cov12=cov();

                    state._fsp--;

                    adaptor.addChild(root_0, cov12.getTree());

                    }
                    break;
                case 11 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:133: covmatrix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_covmatrix_in_statement162);
                    covmatrix13=covmatrix();

                    state._fsp--;

                    adaptor.addChild(root_0, covmatrix13.getTree());

                    }
                    break;
                case 12 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:75:145: help
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:78:1: sigmax : SIGMAX LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SIGMAX $column_no $ip) ;
    public final NectarParser.sigmax_return sigmax() throws RecognitionException {
        NectarParser.sigmax_return retval = new NectarParser.sigmax_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_no=null;
        Token ip=null;
        Token SIGMAX15=null;
        Token LEFT_PAREN16=null;
        Token RIGHT_PAREN17=null;
        Token STDIN_OP18=null;

        Object column_no_tree=null;
        Object ip_tree=null;
        Object SIGMAX15_tree=null;
        Object LEFT_PAREN16_tree=null;
        Object RIGHT_PAREN17_tree=null;
        Object STDIN_OP18_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SIGMAX=new RewriteRuleTokenStream(adaptor,"token SIGMAX");

         paraphrases.push("\n"+"USAGE :sigmax(column_no)<<input_file"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:82:1: ( SIGMAX LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SIGMAX $column_no $ip) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:82:4: SIGMAX LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP ip= ID
            {
            SIGMAX15=(Token)match(input,SIGMAX,FOLLOW_SIGMAX_in_sigmax209);  
            stream_SIGMAX.add(SIGMAX15);

            LEFT_PAREN16=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_sigmax211);  
            stream_LEFT_PAREN.add(LEFT_PAREN16);

            column_no=(Token)match(input,INT,FOLLOW_INT_in_sigmax215);  
            stream_INT.add(column_no);

            RIGHT_PAREN17=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_sigmax217);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN17);

            STDIN_OP18=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_sigmax219);  
            stream_STDIN_OP.add(STDIN_OP18);

            ip=(Token)match(input,ID,FOLLOW_ID_in_sigmax223);  
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
            // 82:63: -> ^( TOK_SIGMAX $column_no $ip)
            {
                // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:82:66: ^( TOK_SIGMAX $column_no $ip)
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:85:1: sigmaxy : SIGMAXY LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SIGMAXY $column_x $column_y $ip) ;
    public final NectarParser.sigmaxy_return sigmaxy() throws RecognitionException {
        NectarParser.sigmaxy_return retval = new NectarParser.sigmaxy_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_x=null;
        Token column_y=null;
        Token ip=null;
        Token SIGMAXY19=null;
        Token LEFT_PAREN20=null;
        Token COMMA21=null;
        Token RIGHT_PAREN22=null;
        Token STDIN_OP23=null;

        Object column_x_tree=null;
        Object column_y_tree=null;
        Object ip_tree=null;
        Object SIGMAXY19_tree=null;
        Object LEFT_PAREN20_tree=null;
        Object COMMA21_tree=null;
        Object RIGHT_PAREN22_tree=null;
        Object STDIN_OP23_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SIGMAXY=new RewriteRuleTokenStream(adaptor,"token SIGMAXY");

         paraphrases.push("\n"+"USAGE :sigmaxy(column_no1,column_no2)<<input_file"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:88:1: ( SIGMAXY LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SIGMAXY $column_x $column_y $ip) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:88:3: SIGMAXY LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID
            {
            SIGMAXY19=(Token)match(input,SIGMAXY,FOLLOW_SIGMAXY_in_sigmaxy266);  
            stream_SIGMAXY.add(SIGMAXY19);

            LEFT_PAREN20=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_sigmaxy268);  
            stream_LEFT_PAREN.add(LEFT_PAREN20);

            column_x=(Token)match(input,INT,FOLLOW_INT_in_sigmaxy272);  
            stream_INT.add(column_x);

            COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_sigmaxy274);  
            stream_COMMA.add(COMMA21);

            column_y=(Token)match(input,INT,FOLLOW_INT_in_sigmaxy279);  
            stream_INT.add(column_y);

            RIGHT_PAREN22=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_sigmaxy281);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN22);

            STDIN_OP23=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_sigmaxy283);  
            stream_STDIN_OP.add(STDIN_OP23);

            ip=(Token)match(input,ID,FOLLOW_ID_in_sigmaxy287);  
            stream_ID.add(ip);



            // AST REWRITE
            // elements: column_y, ip, column_x
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
            // 88:82: -> ^( TOK_SIGMAXY $column_x $column_y $ip)
            {
                // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:88:85: ^( TOK_SIGMAXY $column_x $column_y $ip)
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:91:1: sigmaxsquare : SIGMAXSQUARE LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SIGMAXSQUARE $column_x $ip) ;
    public final NectarParser.sigmaxsquare_return sigmaxsquare() throws RecognitionException {
        NectarParser.sigmaxsquare_return retval = new NectarParser.sigmaxsquare_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_x=null;
        Token ip=null;
        Token SIGMAXSQUARE24=null;
        Token LEFT_PAREN25=null;
        Token RIGHT_PAREN26=null;
        Token STDIN_OP27=null;

        Object column_x_tree=null;
        Object ip_tree=null;
        Object SIGMAXSQUARE24_tree=null;
        Object LEFT_PAREN25_tree=null;
        Object RIGHT_PAREN26_tree=null;
        Object STDIN_OP27_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_SIGMAXSQUARE=new RewriteRuleTokenStream(adaptor,"token SIGMAXSQUARE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

         paraphrases.push("\n"+"USAGE :sigmaxsquare(column_no)<<input_file"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:94:1: ( SIGMAXSQUARE LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SIGMAXSQUARE $column_x $ip) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:94:3: SIGMAXSQUARE LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP ip= ID
            {
            SIGMAXSQUARE24=(Token)match(input,SIGMAXSQUARE,FOLLOW_SIGMAXSQUARE_in_sigmaxsquare339);  
            stream_SIGMAXSQUARE.add(SIGMAXSQUARE24);

            LEFT_PAREN25=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_sigmaxsquare341);  
            stream_LEFT_PAREN.add(LEFT_PAREN25);

            column_x=(Token)match(input,INT,FOLLOW_INT_in_sigmaxsquare345);  
            stream_INT.add(column_x);

            RIGHT_PAREN26=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_sigmaxsquare347);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN26);

            STDIN_OP27=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_sigmaxsquare349);  
            stream_STDIN_OP.add(STDIN_OP27);

            ip=(Token)match(input,ID,FOLLOW_ID_in_sigmaxsquare354);  
            stream_ID.add(ip);



            // AST REWRITE
            // elements: ip, column_x
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
            // 94:68: -> ^( TOK_SIGMAXSQUARE $column_x $ip)
            {
                // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:94:71: ^( TOK_SIGMAXSQUARE $column_x $ip)
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:97:1: mean : MEAN LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_MEAN $column_x $ip $total_rows) ;
    public final NectarParser.mean_return mean() throws RecognitionException {
        NectarParser.mean_return retval = new NectarParser.mean_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_x=null;
        Token ip=null;
        Token total_rows=null;
        Token MEAN28=null;
        Token LEFT_PAREN29=null;
        Token RIGHT_PAREN30=null;
        Token STDIN_OP31=null;
        Token LEFT_PAREN32=null;
        Token RIGHT_PAREN33=null;

        Object column_x_tree=null;
        Object ip_tree=null;
        Object total_rows_tree=null;
        Object MEAN28_tree=null;
        Object LEFT_PAREN29_tree=null;
        Object RIGHT_PAREN30_tree=null;
        Object STDIN_OP31_tree=null;
        Object LEFT_PAREN32_tree=null;
        Object RIGHT_PAREN33_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MEAN=new RewriteRuleTokenStream(adaptor,"token MEAN");

         paraphrases.push("\n"+"USAGE :mean(column_no)<<input_file(total_no_of_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:100:1: ( MEAN LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_MEAN $column_x $ip $total_rows) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:100:3: MEAN LEFT_PAREN column_x= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN
            {
            MEAN28=(Token)match(input,MEAN,FOLLOW_MEAN_in_mean398);  
            stream_MEAN.add(MEAN28);

            LEFT_PAREN29=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_mean401);  
            stream_LEFT_PAREN.add(LEFT_PAREN29);

            column_x=(Token)match(input,INT,FOLLOW_INT_in_mean405);  
            stream_INT.add(column_x);

            RIGHT_PAREN30=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_mean409);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN30);

            STDIN_OP31=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_mean412);  
            stream_STDIN_OP.add(STDIN_OP31);

            ip=(Token)match(input,ID,FOLLOW_ID_in_mean417);  
            stream_ID.add(ip);

            LEFT_PAREN32=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_mean419);  
            stream_LEFT_PAREN.add(LEFT_PAREN32);

            total_rows=(Token)match(input,INT,FOLLOW_INT_in_mean423);  
            stream_INT.add(total_rows);

            RIGHT_PAREN33=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_mean426);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN33);



            // AST REWRITE
            // elements: total_rows, column_x, ip
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
            // 100:103: -> ^( TOK_MEAN $column_x $ip $total_rows)
            {
                // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:100:106: ^( TOK_MEAN $column_x $ip $total_rows)
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:103:1: correlation : CORR LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORR $column_x $column_y $ip $total_rows) ;
    public final NectarParser.correlation_return correlation() throws RecognitionException {
        NectarParser.correlation_return retval = new NectarParser.correlation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_x=null;
        Token column_y=null;
        Token ip=null;
        Token total_rows=null;
        Token CORR34=null;
        Token LEFT_PAREN35=null;
        Token COMMA36=null;
        Token RIGHT_PAREN37=null;
        Token STDIN_OP38=null;
        Token LEFT_PAREN39=null;
        Token RIGHT_PAREN40=null;

        Object column_x_tree=null;
        Object column_y_tree=null;
        Object ip_tree=null;
        Object total_rows_tree=null;
        Object CORR34_tree=null;
        Object LEFT_PAREN35_tree=null;
        Object COMMA36_tree=null;
        Object RIGHT_PAREN37_tree=null;
        Object STDIN_OP38_tree=null;
        Object LEFT_PAREN39_tree=null;
        Object RIGHT_PAREN40_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_CORR=new RewriteRuleTokenStream(adaptor,"token CORR");

         paraphrases.push("\n"+"USAGE :corr(column_no1,column_no2)<<input_file(total_no_of_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:106:1: ( CORR LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORR $column_x $column_y $ip $total_rows) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:106:3: CORR LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN
            {
            CORR34=(Token)match(input,CORR,FOLLOW_CORR_in_correlation473);  
            stream_CORR.add(CORR34);

            LEFT_PAREN35=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_correlation475);  
            stream_LEFT_PAREN.add(LEFT_PAREN35);

            column_x=(Token)match(input,INT,FOLLOW_INT_in_correlation479);  
            stream_INT.add(column_x);

            COMMA36=(Token)match(input,COMMA,FOLLOW_COMMA_in_correlation481);  
            stream_COMMA.add(COMMA36);

            column_y=(Token)match(input,INT,FOLLOW_INT_in_correlation485);  
            stream_INT.add(column_y);

            RIGHT_PAREN37=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_correlation487);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN37);

            STDIN_OP38=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_correlation489);  
            stream_STDIN_OP.add(STDIN_OP38);

            ip=(Token)match(input,ID,FOLLOW_ID_in_correlation493);  
            stream_ID.add(ip);

            LEFT_PAREN39=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_correlation495);  
            stream_LEFT_PAREN.add(LEFT_PAREN39);

            total_rows=(Token)match(input,INT,FOLLOW_INT_in_correlation499);  
            stream_INT.add(total_rows);

            RIGHT_PAREN40=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_correlation502);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN40);



            // AST REWRITE
            // elements: total_rows, column_y, ip, column_x
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
            // 106:117: -> ^( TOK_CORR $column_x $column_y $ip $total_rows)
            {
                // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:106:120: ^( TOK_CORR $column_x $column_y $ip $total_rows)
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:109:1: correlationmatrix : CORRMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORRMATRIX $col ( $morecol)* $ip $total_rows) ;
    public final NectarParser.correlationmatrix_return correlationmatrix() throws RecognitionException {
        NectarParser.correlationmatrix_return retval = new NectarParser.correlationmatrix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token col=null;
        Token ip=null;
        Token total_rows=null;
        Token CORRMATRIX41=null;
        Token LEFT_PAREN42=null;
        Token COMMA43=null;
        Token RIGHT_PAREN44=null;
        Token STDIN_OP45=null;
        Token LEFT_PAREN46=null;
        Token RIGHT_PAREN47=null;
        Token morecol=null;
        List list_morecol=null;

        Object col_tree=null;
        Object ip_tree=null;
        Object total_rows_tree=null;
        Object CORRMATRIX41_tree=null;
        Object LEFT_PAREN42_tree=null;
        Object COMMA43_tree=null;
        Object RIGHT_PAREN44_tree=null;
        Object STDIN_OP45_tree=null;
        Object LEFT_PAREN46_tree=null;
        Object RIGHT_PAREN47_tree=null;
        Object morecol_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_CORRMATRIX=new RewriteRuleTokenStream(adaptor,"token CORRMATRIX");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

         paraphrases.push("\n"+"USAGE :corrmatrix(column_nos)<<input_file(total_no_of_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:112:1: ( CORRMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_CORRMATRIX $col ( $morecol)* $ip $total_rows) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:112:3: CORRMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN
            {
            CORRMATRIX41=(Token)match(input,CORRMATRIX,FOLLOW_CORRMATRIX_in_correlationmatrix552);  
            stream_CORRMATRIX.add(CORRMATRIX41);

            LEFT_PAREN42=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_correlationmatrix554);  
            stream_LEFT_PAREN.add(LEFT_PAREN42);

            col=(Token)match(input,INT,FOLLOW_INT_in_correlationmatrix558);  
            stream_INT.add(col);

            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:112:33: ( COMMA morecol+= INT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:112:34: COMMA morecol+= INT
            	    {
            	    COMMA43=(Token)match(input,COMMA,FOLLOW_COMMA_in_correlationmatrix561);  
            	    stream_COMMA.add(COMMA43);

            	    morecol=(Token)match(input,INT,FOLLOW_INT_in_correlationmatrix565);  
            	    stream_INT.add(morecol);

            	    if (list_morecol==null) list_morecol=new ArrayList();
            	    list_morecol.add(morecol);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            RIGHT_PAREN44=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_correlationmatrix569);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN44);

            STDIN_OP45=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_correlationmatrix571);  
            stream_STDIN_OP.add(STDIN_OP45);

            ip=(Token)match(input,ID,FOLLOW_ID_in_correlationmatrix575);  
            stream_ID.add(ip);

            LEFT_PAREN46=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_correlationmatrix577);  
            stream_LEFT_PAREN.add(LEFT_PAREN46);

            total_rows=(Token)match(input,INT,FOLLOW_INT_in_correlationmatrix581);  
            stream_INT.add(total_rows);

            RIGHT_PAREN47=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_correlationmatrix584);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN47);



            // AST REWRITE
            // elements: total_rows, ip, morecol, col
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
            // 112:120: -> ^( TOK_CORRMATRIX $col ( $morecol)* $ip $total_rows)
            {
                // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:112:123: ^( TOK_CORRMATRIX $col ( $morecol)* $ip $total_rows)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_CORRMATRIX, "TOK_CORRMATRIX"), root_1);

                adaptor.addChild(root_1, stream_col.nextNode());
                // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:112:146: ( $morecol)*
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:115:1: multiplereg : MULTIPLEREG LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_MULTIPLEREG $col ( $morecol)* $ip $total_rows) ;
    public final NectarParser.multiplereg_return multiplereg() throws RecognitionException {
        NectarParser.multiplereg_return retval = new NectarParser.multiplereg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token col=null;
        Token ip=null;
        Token total_rows=null;
        Token MULTIPLEREG48=null;
        Token LEFT_PAREN49=null;
        Token COMMA50=null;
        Token RIGHT_PAREN51=null;
        Token STDIN_OP52=null;
        Token LEFT_PAREN53=null;
        Token RIGHT_PAREN54=null;
        Token morecol=null;
        List list_morecol=null;

        Object col_tree=null;
        Object ip_tree=null;
        Object total_rows_tree=null;
        Object MULTIPLEREG48_tree=null;
        Object LEFT_PAREN49_tree=null;
        Object COMMA50_tree=null;
        Object RIGHT_PAREN51_tree=null;
        Object STDIN_OP52_tree=null;
        Object LEFT_PAREN53_tree=null;
        Object RIGHT_PAREN54_tree=null;
        Object morecol_tree=null;
        RewriteRuleTokenStream stream_MULTIPLEREG=new RewriteRuleTokenStream(adaptor,"token MULTIPLEREG");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

         paraphrases.push("\n"+"USAGE :multiplereg(column_nos)<<input_file(total_no_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:118:1: ( MULTIPLEREG LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_MULTIPLEREG $col ( $morecol)* $ip $total_rows) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:118:3: MULTIPLEREG LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN
            {
            MULTIPLEREG48=(Token)match(input,MULTIPLEREG,FOLLOW_MULTIPLEREG_in_multiplereg635);  
            stream_MULTIPLEREG.add(MULTIPLEREG48);

            LEFT_PAREN49=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_multiplereg637);  
            stream_LEFT_PAREN.add(LEFT_PAREN49);

            col=(Token)match(input,INT,FOLLOW_INT_in_multiplereg641);  
            stream_INT.add(col);

            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:118:34: ( COMMA morecol+= INT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:118:35: COMMA morecol+= INT
            	    {
            	    COMMA50=(Token)match(input,COMMA,FOLLOW_COMMA_in_multiplereg644);  
            	    stream_COMMA.add(COMMA50);

            	    morecol=(Token)match(input,INT,FOLLOW_INT_in_multiplereg648);  
            	    stream_INT.add(morecol);

            	    if (list_morecol==null) list_morecol=new ArrayList();
            	    list_morecol.add(morecol);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            RIGHT_PAREN51=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_multiplereg652);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN51);

            STDIN_OP52=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_multiplereg654);  
            stream_STDIN_OP.add(STDIN_OP52);

            ip=(Token)match(input,ID,FOLLOW_ID_in_multiplereg658);  
            stream_ID.add(ip);

            LEFT_PAREN53=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_multiplereg660);  
            stream_LEFT_PAREN.add(LEFT_PAREN53);

            total_rows=(Token)match(input,INT,FOLLOW_INT_in_multiplereg664);  
            stream_INT.add(total_rows);

            RIGHT_PAREN54=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_multiplereg667);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN54);



            // AST REWRITE
            // elements: ip, total_rows, morecol, col
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
            // 118:122: -> ^( TOK_MULTIPLEREG $col ( $morecol)* $ip $total_rows)
            {
                // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:118:124: ^( TOK_MULTIPLEREG $col ( $morecol)* $ip $total_rows)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_MULTIPLEREG, "TOK_MULTIPLEREG"), root_1);

                adaptor.addChild(root_1, stream_col.nextNode());
                // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:118:147: ( $morecol)*
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:121:1: forwardselection : FORWARDSELECTION LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT COMMA levelofsignificance= DOUBLE RIGHT_PAREN -> ^( TOK_FORWARDSELECTION $col ( $morecol)* $ip $total_rows $levelofsignificance) ;
    public final NectarParser.forwardselection_return forwardselection() throws RecognitionException {
        NectarParser.forwardselection_return retval = new NectarParser.forwardselection_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token col=null;
        Token ip=null;
        Token total_rows=null;
        Token levelofsignificance=null;
        Token FORWARDSELECTION55=null;
        Token LEFT_PAREN56=null;
        Token COMMA57=null;
        Token RIGHT_PAREN58=null;
        Token STDIN_OP59=null;
        Token LEFT_PAREN60=null;
        Token COMMA61=null;
        Token RIGHT_PAREN62=null;
        Token morecol=null;
        List list_morecol=null;

        Object col_tree=null;
        Object ip_tree=null;
        Object total_rows_tree=null;
        Object levelofsignificance_tree=null;
        Object FORWARDSELECTION55_tree=null;
        Object LEFT_PAREN56_tree=null;
        Object COMMA57_tree=null;
        Object RIGHT_PAREN58_tree=null;
        Object STDIN_OP59_tree=null;
        Object LEFT_PAREN60_tree=null;
        Object COMMA61_tree=null;
        Object RIGHT_PAREN62_tree=null;
        Object morecol_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_DOUBLE=new RewriteRuleTokenStream(adaptor,"token DOUBLE");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_FORWARDSELECTION=new RewriteRuleTokenStream(adaptor,"token FORWARDSELECTION");

         paraphrases.push("\n"+"USAGE :forwardselection(column_nos)<<input_file(total_no_of_rows,level_of_significance)"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:124:1: ( FORWARDSELECTION LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT COMMA levelofsignificance= DOUBLE RIGHT_PAREN -> ^( TOK_FORWARDSELECTION $col ( $morecol)* $ip $total_rows $levelofsignificance) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:124:3: FORWARDSELECTION LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT COMMA levelofsignificance= DOUBLE RIGHT_PAREN
            {
            FORWARDSELECTION55=(Token)match(input,FORWARDSELECTION,FOLLOW_FORWARDSELECTION_in_forwardselection721);  
            stream_FORWARDSELECTION.add(FORWARDSELECTION55);

            LEFT_PAREN56=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_forwardselection724);  
            stream_LEFT_PAREN.add(LEFT_PAREN56);

            col=(Token)match(input,INT,FOLLOW_INT_in_forwardselection728);  
            stream_INT.add(col);

            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:124:40: ( COMMA morecol+= INT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:124:41: COMMA morecol+= INT
            	    {
            	    COMMA57=(Token)match(input,COMMA,FOLLOW_COMMA_in_forwardselection731);  
            	    stream_COMMA.add(COMMA57);

            	    morecol=(Token)match(input,INT,FOLLOW_INT_in_forwardselection735);  
            	    stream_INT.add(morecol);

            	    if (list_morecol==null) list_morecol=new ArrayList();
            	    list_morecol.add(morecol);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            RIGHT_PAREN58=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_forwardselection739);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN58);

            STDIN_OP59=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_forwardselection741);  
            stream_STDIN_OP.add(STDIN_OP59);

            ip=(Token)match(input,ID,FOLLOW_ID_in_forwardselection745);  
            stream_ID.add(ip);

            LEFT_PAREN60=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_forwardselection747);  
            stream_LEFT_PAREN.add(LEFT_PAREN60);

            total_rows=(Token)match(input,INT,FOLLOW_INT_in_forwardselection751);  
            stream_INT.add(total_rows);

            COMMA61=(Token)match(input,COMMA,FOLLOW_COMMA_in_forwardselection753);  
            stream_COMMA.add(COMMA61);

            levelofsignificance=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_forwardselection757);  
            stream_DOUBLE.add(levelofsignificance);

            RIGHT_PAREN62=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_forwardselection760);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN62);



            // AST REWRITE
            // elements: col, morecol, total_rows, levelofsignificance, ip
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
            // 124:161: -> ^( TOK_FORWARDSELECTION $col ( $morecol)* $ip $total_rows $levelofsignificance)
            {
                // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:124:163: ^( TOK_FORWARDSELECTION $col ( $morecol)* $ip $total_rows $levelofsignificance)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_FORWARDSELECTION, "TOK_FORWARDSELECTION"), root_1);

                adaptor.addChild(root_1, stream_col.nextNode());
                // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:124:191: ( $morecol)*
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:127:1: sort : SORT LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SORT $column_no $ip) ;
    public final NectarParser.sort_return sort() throws RecognitionException {
        NectarParser.sort_return retval = new NectarParser.sort_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_no=null;
        Token ip=null;
        Token SORT63=null;
        Token LEFT_PAREN64=null;
        Token RIGHT_PAREN65=null;
        Token STDIN_OP66=null;

        Object column_no_tree=null;
        Object ip_tree=null;
        Object SORT63_tree=null;
        Object LEFT_PAREN64_tree=null;
        Object RIGHT_PAREN65_tree=null;
        Object STDIN_OP66_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_SORT=new RewriteRuleTokenStream(adaptor,"token SORT");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

         paraphrases.push("\n"+"USAGE :sort(column_no)<<input_file"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:130:1: ( SORT LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP ip= ID -> ^( TOK_SORT $column_no $ip) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:130:3: SORT LEFT_PAREN column_no= INT RIGHT_PAREN STDIN_OP ip= ID
            {
            SORT63=(Token)match(input,SORT,FOLLOW_SORT_in_sort818);  
            stream_SORT.add(SORT63);

            LEFT_PAREN64=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_sort821);  
            stream_LEFT_PAREN.add(LEFT_PAREN64);

            column_no=(Token)match(input,INT,FOLLOW_INT_in_sort825);  
            stream_INT.add(column_no);

            RIGHT_PAREN65=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_sort827);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN65);

            STDIN_OP66=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_sort829);  
            stream_STDIN_OP.add(STDIN_OP66);

            ip=(Token)match(input,ID,FOLLOW_ID_in_sort833);  
            stream_ID.add(ip);



            // AST REWRITE
            // elements: ip, column_no
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
            // 130:61: -> ^( TOK_SORT $column_no $ip)
            {
                // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:130:63: ^( TOK_SORT $column_no $ip)
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:133:1: cov : COV LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COV $column_x $column_y $ip $total_rows) ;
    public final NectarParser.cov_return cov() throws RecognitionException {
        NectarParser.cov_return retval = new NectarParser.cov_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_x=null;
        Token column_y=null;
        Token ip=null;
        Token total_rows=null;
        Token COV67=null;
        Token LEFT_PAREN68=null;
        Token COMMA69=null;
        Token RIGHT_PAREN70=null;
        Token STDIN_OP71=null;
        Token LEFT_PAREN72=null;
        Token RIGHT_PAREN73=null;

        Object column_x_tree=null;
        Object column_y_tree=null;
        Object ip_tree=null;
        Object total_rows_tree=null;
        Object COV67_tree=null;
        Object LEFT_PAREN68_tree=null;
        Object COMMA69_tree=null;
        Object RIGHT_PAREN70_tree=null;
        Object STDIN_OP71_tree=null;
        Object LEFT_PAREN72_tree=null;
        Object RIGHT_PAREN73_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_COV=new RewriteRuleTokenStream(adaptor,"token COV");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

         paraphrases.push("\n"+"USAGE :cov(column_no1,column_no2)<<input_file(total_no_of_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:136:1: ( COV LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COV $column_x $column_y $ip $total_rows) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:136:3: COV LEFT_PAREN column_x= INT COMMA column_y= INT RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN
            {
            COV67=(Token)match(input,COV,FOLLOW_COV_in_cov875);  
            stream_COV.add(COV67);

            LEFT_PAREN68=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_cov877);  
            stream_LEFT_PAREN.add(LEFT_PAREN68);

            column_x=(Token)match(input,INT,FOLLOW_INT_in_cov881);  
            stream_INT.add(column_x);

            COMMA69=(Token)match(input,COMMA,FOLLOW_COMMA_in_cov883);  
            stream_COMMA.add(COMMA69);

            column_y=(Token)match(input,INT,FOLLOW_INT_in_cov888);  
            stream_INT.add(column_y);

            RIGHT_PAREN70=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_cov890);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN70);

            STDIN_OP71=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_cov892);  
            stream_STDIN_OP.add(STDIN_OP71);

            ip=(Token)match(input,ID,FOLLOW_ID_in_cov896);  
            stream_ID.add(ip);

            LEFT_PAREN72=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_cov898);  
            stream_LEFT_PAREN.add(LEFT_PAREN72);

            total_rows=(Token)match(input,INT,FOLLOW_INT_in_cov902);  
            stream_INT.add(total_rows);

            RIGHT_PAREN73=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_cov905);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN73);



            // AST REWRITE
            // elements: total_rows, column_y, ip, column_x
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
            // 136:116: -> ^( TOK_COV $column_x $column_y $ip $total_rows)
            {
                // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:136:119: ^( TOK_COV $column_x $column_y $ip $total_rows)
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:139:1: covmatrix : COVMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COVMATRIX $col ( $morecol)* $ip $total_rows) ;
    public final NectarParser.covmatrix_return covmatrix() throws RecognitionException {
        NectarParser.covmatrix_return retval = new NectarParser.covmatrix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token col=null;
        Token ip=null;
        Token total_rows=null;
        Token COVMATRIX74=null;
        Token LEFT_PAREN75=null;
        Token COMMA76=null;
        Token RIGHT_PAREN77=null;
        Token STDIN_OP78=null;
        Token LEFT_PAREN79=null;
        Token RIGHT_PAREN80=null;
        Token morecol=null;
        List list_morecol=null;

        Object col_tree=null;
        Object ip_tree=null;
        Object total_rows_tree=null;
        Object COVMATRIX74_tree=null;
        Object LEFT_PAREN75_tree=null;
        Object COMMA76_tree=null;
        Object RIGHT_PAREN77_tree=null;
        Object STDIN_OP78_tree=null;
        Object LEFT_PAREN79_tree=null;
        Object RIGHT_PAREN80_tree=null;
        Object morecol_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_COVMATRIX=new RewriteRuleTokenStream(adaptor,"token COVMATRIX");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_STDIN_OP=new RewriteRuleTokenStream(adaptor,"token STDIN_OP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

         paraphrases.push("\n"+"USAGE :covmatrix(column_nos)<<input_file(total_no_of_rows)"+"\n"+"Type [HELP|help|?] for usage of all commands"); 
        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:142:1: ( COVMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN -> ^( TOK_COVMATRIX $col ( $morecol)* $ip $total_rows) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:142:3: COVMATRIX LEFT_PAREN col= INT ( COMMA morecol+= INT )* RIGHT_PAREN STDIN_OP ip= ID LEFT_PAREN total_rows= INT RIGHT_PAREN
            {
            COVMATRIX74=(Token)match(input,COVMATRIX,FOLLOW_COVMATRIX_in_covmatrix961);  
            stream_COVMATRIX.add(COVMATRIX74);

            LEFT_PAREN75=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_covmatrix964);  
            stream_LEFT_PAREN.add(LEFT_PAREN75);

            col=(Token)match(input,INT,FOLLOW_INT_in_covmatrix968);  
            stream_INT.add(col);

            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:142:33: ( COMMA morecol+= INT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:142:34: COMMA morecol+= INT
            	    {
            	    COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_covmatrix971);  
            	    stream_COMMA.add(COMMA76);

            	    morecol=(Token)match(input,INT,FOLLOW_INT_in_covmatrix975);  
            	    stream_INT.add(morecol);

            	    if (list_morecol==null) list_morecol=new ArrayList();
            	    list_morecol.add(morecol);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            RIGHT_PAREN77=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_covmatrix979);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN77);

            STDIN_OP78=(Token)match(input,STDIN_OP,FOLLOW_STDIN_OP_in_covmatrix981);  
            stream_STDIN_OP.add(STDIN_OP78);

            ip=(Token)match(input,ID,FOLLOW_ID_in_covmatrix985);  
            stream_ID.add(ip);

            LEFT_PAREN79=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_covmatrix987);  
            stream_LEFT_PAREN.add(LEFT_PAREN79);

            total_rows=(Token)match(input,INT,FOLLOW_INT_in_covmatrix991);  
            stream_INT.add(total_rows);

            RIGHT_PAREN80=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_covmatrix994);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN80);



            // AST REWRITE
            // elements: ip, morecol, total_rows, col
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
            // 142:120: -> ^( TOK_COVMATRIX $col ( $morecol)* $ip $total_rows)
            {
                // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:142:123: ^( TOK_COVMATRIX $col ( $morecol)* $ip $total_rows)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TOK_COVMATRIX, "TOK_COVMATRIX"), root_1);

                adaptor.addChild(root_1, stream_col.nextNode());
                // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:142:145: ( $morecol)*
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:145:1: help : HELP terminator ;
    public final NectarParser.help_return help() throws RecognitionException {
        NectarParser.help_return retval = new NectarParser.help_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token HELP81=null;
        NectarParser.terminator_return terminator82 = null;


        Object HELP81_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:145:6: ( HELP terminator )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:145:8: HELP terminator
            {
            root_0 = (Object)adaptor.nil();

            HELP81=(Token)match(input,HELP,FOLLOW_HELP_in_help1038); 
            HELP81_tree = (Object)adaptor.create(HELP81);
            adaptor.addChild(root_0, HELP81_tree);

            pushFollow(FOLLOW_terminator_in_help1040);
            terminator82=terminator();

            state._fsp--;

            adaptor.addChild(root_0, terminator82.getTree());

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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:148:1: terminator : ( NEWLINE | EOF );
    public final NectarParser.terminator_return terminator() throws RecognitionException {
        NectarParser.terminator_return retval = new NectarParser.terminator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set83=null;

        Object set83_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:148:11: ( NEWLINE | EOF )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set83=(Token)input.LT(1);
            if ( input.LA(1)==EOF||input.LA(1)==NEWLINE ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set83));
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
    public static final BitSet FOLLOW_SIGMAX_in_sigmax209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_sigmax211 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_sigmax215 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_sigmax217 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_STDIN_OP_in_sigmax219 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_sigmax223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGMAXY_in_sigmaxy266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_sigmaxy268 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_sigmaxy272 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_sigmaxy274 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_sigmaxy279 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_sigmaxy281 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_STDIN_OP_in_sigmaxy283 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_sigmaxy287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGMAXSQUARE_in_sigmaxsquare339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_sigmaxsquare341 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_sigmaxsquare345 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_sigmaxsquare347 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_STDIN_OP_in_sigmaxsquare349 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_sigmaxsquare354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEAN_in_mean398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_mean401 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_mean405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_mean409 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_STDIN_OP_in_mean412 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_mean417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_mean419 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_mean423 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_mean426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CORR_in_correlation473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_correlation475 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_correlation479 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_correlation481 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_correlation485 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_correlation487 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_STDIN_OP_in_correlation489 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_correlation493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_correlation495 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_correlation499 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_correlation502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CORRMATRIX_in_correlationmatrix552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_correlationmatrix554 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix558 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_COMMA_in_correlationmatrix561 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix565 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_correlationmatrix569 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_STDIN_OP_in_correlationmatrix571 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_correlationmatrix575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_correlationmatrix577 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix581 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_correlationmatrix584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULTIPLEREG_in_multiplereg635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_multiplereg637 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_multiplereg641 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_COMMA_in_multiplereg644 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_multiplereg648 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_multiplereg652 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_STDIN_OP_in_multiplereg654 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_multiplereg658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_multiplereg660 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_multiplereg664 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_multiplereg667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORWARDSELECTION_in_forwardselection721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_forwardselection724 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_forwardselection728 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_COMMA_in_forwardselection731 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_forwardselection735 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_forwardselection739 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_STDIN_OP_in_forwardselection741 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_forwardselection745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_forwardselection747 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_forwardselection751 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_forwardselection753 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_DOUBLE_in_forwardselection757 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_forwardselection760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SORT_in_sort818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_sort821 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_sort825 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_sort827 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_STDIN_OP_in_sort829 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_sort833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COV_in_cov875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_cov877 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_cov881 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_cov883 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_cov888 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_cov890 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_STDIN_OP_in_cov892 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_cov896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_cov898 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_cov902 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_cov905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COVMATRIX_in_covmatrix961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_covmatrix964 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_covmatrix968 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_COMMA_in_covmatrix971 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_covmatrix975 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_covmatrix979 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_STDIN_OP_in_covmatrix981 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_covmatrix985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_covmatrix987 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_covmatrix991 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_covmatrix994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_help1038 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_terminator_in_help1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_terminator0 = new BitSet(new long[]{0x0000000000000002L});

}