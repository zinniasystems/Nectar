// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g 2011-09-28 13:48:06

//package com.zinnia.nectar.ast.test;
package com.zinnia.nectar.regression.antlr.language.parser;

import com.zinnia.nectar.regression.language.primitive.PrimitiveTypeImplFactory;
import com.zinnia.nectar.regression.language.primitive.IPrimitiveType;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.zinnia.nectar.regression.language.complex.impl.ComplexTypeImpl ;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
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
public class NectarTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LEFT_PAREN", "RIGHT_PAREN", "HELP", "SIGMAX", "SIGMAXY", "SIGMAXSQUARE", "MEAN", "CORR", "CORRMATRIX", "MULTIPLEREG", "FORWARDSELECTION", "SORT", "COV", "COVMATRIX", "STDIN_OP", "DOT", "COMMA", "EXTN", "NEWLINE", "ID", "INT", "FLOAT", "SPACE", "WHITESPACE", "SINGLE_COMMENT", "MULTI_COMMENT", "DOUBLE", "TOK_SIGMAX", "TOK_SIGMAXY", "TOK_SIGMAXSQUARE", "TOK_MEAN", "TOK_CORR", "TOK_CORRMATRIX", "TOK_MULTIPLEREG", "TOK_FORWARDSELECTION", "TOK_SORT", "TOK_COV", "TOK_COVMATRIX", "TOK_HELP"
    };
    public static final int HELP=6;
    public static final int EXTN=21;
    public static final int COVMATRIX=17;
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
    public static final int INT=24;
    public static final int TOK_SORT=39;
    public static final int FLOAT=25;
    public static final int ID=23;
    public static final int SPACE=26;
    public static final int EOF=-1;
    public static final int TOK_MEAN=34;
    public static final int SIGMAXY=8;
    public static final int TOK_MULTIPLEREG=37;
    public static final int RIGHT_PAREN=5;
    public static final int TOK_CORRMATRIX=36;
    public static final int STDIN_OP=18;
    public static final int NEWLINE=22;
    public static final int COV=16;
    public static final int COMMA=20;
    public static final int TOK_CORR=35;
    public static final int FORWARDSELECTION=14;
    public static final int DOUBLE=30;
    public static final int LEFT_PAREN=4;
    public static final int SINGLE_COMMENT=28;
    public static final int TOK_SIGMAX=31;
    public static final int SIGMAXSQUARE=9;
    public static final int DOT=19;
    public static final int TOK_HELP=42;
    public static final int TOK_SIGMAXY=32;
    public static final int CORR=11;

    // delegates
    // delegators


        public NectarTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public NectarTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return NectarTree.tokenNames; }
    public String getGrammarFileName() { return "com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g"; }

     

    List<Integer> list = new ArrayList<Integer>();
    IPrimitiveType primitiveImpl; 
    ComplexTypeImpl complexTypeImpl = new ComplexTypeImpl();  

      private static void outln(Object obj) {
        System.out.println(obj);
      }
     


    public static class start_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:1: start : statement ;
    public final NectarTree.start_return start() throws RecognitionException {
        NectarTree.start_return retval = new NectarTree.start_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        NectarTree.statement_return statement1 = null;



        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:7: ( statement )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:9: statement
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_statement_in_start109);
            statement1=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement1.getTree());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start"

    public static class statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:70:1: statement : ( sigmax | sigmaxy | sigmaxsquare | mean | correlation | correlationmatrix | multiplereg | forwardselection | sort | cov | covmatrix | help );
    public final NectarTree.statement_return statement() throws RecognitionException {
        NectarTree.statement_return retval = new NectarTree.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        NectarTree.sigmax_return sigmax2 = null;

        NectarTree.sigmaxy_return sigmaxy3 = null;

        NectarTree.sigmaxsquare_return sigmaxsquare4 = null;

        NectarTree.mean_return mean5 = null;

        NectarTree.correlation_return correlation6 = null;

        NectarTree.correlationmatrix_return correlationmatrix7 = null;

        NectarTree.multiplereg_return multiplereg8 = null;

        NectarTree.forwardselection_return forwardselection9 = null;

        NectarTree.sort_return sort10 = null;

        NectarTree.cov_return cov11 = null;

        NectarTree.covmatrix_return covmatrix12 = null;

        NectarTree.help_return help13 = null;



        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:70:11: ( sigmax | sigmaxy | sigmaxsquare | mean | correlation | correlationmatrix | multiplereg | forwardselection | sort | cov | covmatrix | help )
            int alt1=12;
            switch ( input.LA(1) ) {
            case TOK_SIGMAX:
                {
                alt1=1;
                }
                break;
            case TOK_SIGMAXY:
                {
                alt1=2;
                }
                break;
            case TOK_SIGMAXSQUARE:
                {
                alt1=3;
                }
                break;
            case TOK_MEAN:
                {
                alt1=4;
                }
                break;
            case TOK_CORR:
                {
                alt1=5;
                }
                break;
            case TOK_CORRMATRIX:
                {
                alt1=6;
                }
                break;
            case TOK_MULTIPLEREG:
                {
                alt1=7;
                }
                break;
            case TOK_FORWARDSELECTION:
                {
                alt1=8;
                }
                break;
            case TOK_SORT:
                {
                alt1=9;
                }
                break;
            case TOK_COV:
                {
                alt1=10;
                }
                break;
            case TOK_COVMATRIX:
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:70:13: sigmax
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_sigmax_in_statement126);
                    sigmax2=sigmax();

                    state._fsp--;

                    adaptor.addChild(root_0, sigmax2.getTree());

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:70:22: sigmaxy
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_sigmaxy_in_statement130);
                    sigmaxy3=sigmaxy();

                    state._fsp--;

                    adaptor.addChild(root_0, sigmaxy3.getTree());

                    }
                    break;
                case 3 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:70:32: sigmaxsquare
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_sigmaxsquare_in_statement134);
                    sigmaxsquare4=sigmaxsquare();

                    state._fsp--;

                    adaptor.addChild(root_0, sigmaxsquare4.getTree());

                    }
                    break;
                case 4 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:70:46: mean
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_mean_in_statement137);
                    mean5=mean();

                    state._fsp--;

                    adaptor.addChild(root_0, mean5.getTree());

                    }
                    break;
                case 5 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:70:53: correlation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_correlation_in_statement141);
                    correlation6=correlation();

                    state._fsp--;

                    adaptor.addChild(root_0, correlation6.getTree());

                    }
                    break;
                case 6 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:70:67: correlationmatrix
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_correlationmatrix_in_statement145);
                    correlationmatrix7=correlationmatrix();

                    state._fsp--;

                    adaptor.addChild(root_0, correlationmatrix7.getTree());

                    }
                    break;
                case 7 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:70:87: multiplereg
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_multiplereg_in_statement149);
                    multiplereg8=multiplereg();

                    state._fsp--;

                    adaptor.addChild(root_0, multiplereg8.getTree());

                    }
                    break;
                case 8 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:70:101: forwardselection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_forwardselection_in_statement153);
                    forwardselection9=forwardselection();

                    state._fsp--;

                    adaptor.addChild(root_0, forwardselection9.getTree());

                    }
                    break;
                case 9 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:70:119: sort
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_sort_in_statement156);
                    sort10=sort();

                    state._fsp--;

                    adaptor.addChild(root_0, sort10.getTree());

                    }
                    break;
                case 10 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:70:126: cov
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_cov_in_statement160);
                    cov11=cov();

                    state._fsp--;

                    adaptor.addChild(root_0, cov11.getTree());

                    }
                    break;
                case 11 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:70:132: covmatrix
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_covmatrix_in_statement164);
                    covmatrix12=covmatrix();

                    state._fsp--;

                    adaptor.addChild(root_0, covmatrix12.getTree());

                    }
                    break;
                case 12 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:70:143: help
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_help_in_statement167);
                    help13=help();

                    state._fsp--;

                    adaptor.addChild(root_0, help13.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class sigmax_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sigmax"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:73:1: sigmax : ^( TOK_SIGMAX column_no= INT ip= ID ) ;
    public final NectarTree.sigmax_return sigmax() throws RecognitionException {
        NectarTree.sigmax_return retval = new NectarTree.sigmax_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree column_no=null;
        CommonTree ip=null;
        CommonTree TOK_SIGMAX14=null;

        CommonTree column_no_tree=null;
        CommonTree ip_tree=null;
        CommonTree TOK_SIGMAX14_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:74:1: ( ^( TOK_SIGMAX column_no= INT ip= ID ) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:74:4: ^( TOK_SIGMAX column_no= INT ip= ID )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TOK_SIGMAX14=(CommonTree)match(input,TOK_SIGMAX,FOLLOW_TOK_SIGMAX_in_sigmax199); 
            TOK_SIGMAX14_tree = (CommonTree)adaptor.dupNode(TOK_SIGMAX14);

            root_1 = (CommonTree)adaptor.becomeRoot(TOK_SIGMAX14_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            column_no=(CommonTree)match(input,INT,FOLLOW_INT_in_sigmax203); 
            column_no_tree = (CommonTree)adaptor.dupNode(column_no);

            adaptor.addChild(root_1, column_no_tree);

            _last = (CommonTree)input.LT(1);
            ip=(CommonTree)match(input,ID,FOLLOW_ID_in_sigmax207); 
            ip_tree = (CommonTree)adaptor.dupNode(ip);

            adaptor.addChild(root_1, ip_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

             
                                   primitiveImpl=PrimitiveTypeImplFactory.getInstance((ip!=null?ip.getText():null));
                                    Future<Double> value=primitiveImpl.sigmax((ip!=null?ip.getText():null),Integer.parseInt((column_no!=null?column_no.getText():null)));
                                       try
                                          {
                                               outln("Sigmax:"+value.get());
                                               }
                                               catch(Exception e)
                                               {
                                                System.out.println("Sigma Job terminated due to exception. Check nectar logs for more information");
                                               }
                                         
                                   

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sigmax"

    public static class sigmaxy_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sigmaxy"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:88:1: sigmaxy : ^( TOK_SIGMAXY column_x= INT column_y= INT ip= ID ) ;
    public final NectarTree.sigmaxy_return sigmaxy() throws RecognitionException {
        NectarTree.sigmaxy_return retval = new NectarTree.sigmaxy_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree column_x=null;
        CommonTree column_y=null;
        CommonTree ip=null;
        CommonTree TOK_SIGMAXY15=null;

        CommonTree column_x_tree=null;
        CommonTree column_y_tree=null;
        CommonTree ip_tree=null;
        CommonTree TOK_SIGMAXY15_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:88:9: ( ^( TOK_SIGMAXY column_x= INT column_y= INT ip= ID ) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:88:11: ^( TOK_SIGMAXY column_x= INT column_y= INT ip= ID )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TOK_SIGMAXY15=(CommonTree)match(input,TOK_SIGMAXY,FOLLOW_TOK_SIGMAXY_in_sigmaxy232); 
            TOK_SIGMAXY15_tree = (CommonTree)adaptor.dupNode(TOK_SIGMAXY15);

            root_1 = (CommonTree)adaptor.becomeRoot(TOK_SIGMAXY15_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            column_x=(CommonTree)match(input,INT,FOLLOW_INT_in_sigmaxy236); 
            column_x_tree = (CommonTree)adaptor.dupNode(column_x);

            adaptor.addChild(root_1, column_x_tree);

            _last = (CommonTree)input.LT(1);
            column_y=(CommonTree)match(input,INT,FOLLOW_INT_in_sigmaxy240); 
            column_y_tree = (CommonTree)adaptor.dupNode(column_y);

            adaptor.addChild(root_1, column_y_tree);

            _last = (CommonTree)input.LT(1);
            ip=(CommonTree)match(input,ID,FOLLOW_ID_in_sigmaxy244); 
            ip_tree = (CommonTree)adaptor.dupNode(ip);

            adaptor.addChild(root_1, ip_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

             
                                     primitiveImpl=PrimitiveTypeImplFactory.getInstance((ip!=null?ip.getText():null));
                                     Future<Double> value=primitiveImpl.sigmaxy((ip!=null?ip.getText():null),Integer.parseInt((column_x!=null?column_x.getText():null)),Integer.parseInt((column_y!=null?column_y.getText():null))); 
                                   try
                                          {
                                                System.out.println("Sigmaxy:"+value.get());  
                                               }
                                               catch(Exception e)
                                               {
                                                  System.out.println("SigmaXY Job terminated due to exception. Check nectar logs for more information");
                                               }
                                     

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sigmaxy"

    public static class sigmaxsquare_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sigmaxsquare"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:101:1: sigmaxsquare : ^( TOK_SIGMAXSQUARE column_x= INT ip= ID ) ;
    public final NectarTree.sigmaxsquare_return sigmaxsquare() throws RecognitionException {
        NectarTree.sigmaxsquare_return retval = new NectarTree.sigmaxsquare_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree column_x=null;
        CommonTree ip=null;
        CommonTree TOK_SIGMAXSQUARE16=null;

        CommonTree column_x_tree=null;
        CommonTree ip_tree=null;
        CommonTree TOK_SIGMAXSQUARE16_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:101:14: ( ^( TOK_SIGMAXSQUARE column_x= INT ip= ID ) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:101:16: ^( TOK_SIGMAXSQUARE column_x= INT ip= ID )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TOK_SIGMAXSQUARE16=(CommonTree)match(input,TOK_SIGMAXSQUARE,FOLLOW_TOK_SIGMAXSQUARE_in_sigmaxsquare265); 
            TOK_SIGMAXSQUARE16_tree = (CommonTree)adaptor.dupNode(TOK_SIGMAXSQUARE16);

            root_1 = (CommonTree)adaptor.becomeRoot(TOK_SIGMAXSQUARE16_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            column_x=(CommonTree)match(input,INT,FOLLOW_INT_in_sigmaxsquare269); 
            column_x_tree = (CommonTree)adaptor.dupNode(column_x);

            adaptor.addChild(root_1, column_x_tree);

            _last = (CommonTree)input.LT(1);
            ip=(CommonTree)match(input,ID,FOLLOW_ID_in_sigmaxsquare273); 
            ip_tree = (CommonTree)adaptor.dupNode(ip);

            adaptor.addChild(root_1, ip_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                                       primitiveImpl=PrimitiveTypeImplFactory.getInstance((ip!=null?ip.getText():null));
                                       Future<Double> value=primitiveImpl.sigmaxSquare((ip!=null?ip.getText():null),Integer.parseInt((column_x!=null?column_x.getText():null))); 
                                       try
                                          {
                                                System.out.println("Sigmaxsquare:"+value.get());  
                                               }
                                               catch(Exception e)
                                               {
                                                  System.out.println("Sigmaxsquare Job terminated due to exception. Check nectar logs for more information");
                                               }


                                      

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sigmaxsquare"

    public static class mean_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mean"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:117:1: mean : ^( TOK_MEAN column_x= INT ip= ID total_rows= INT ) ;
    public final NectarTree.mean_return mean() throws RecognitionException {
        NectarTree.mean_return retval = new NectarTree.mean_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree column_x=null;
        CommonTree ip=null;
        CommonTree total_rows=null;
        CommonTree TOK_MEAN17=null;

        CommonTree column_x_tree=null;
        CommonTree ip_tree=null;
        CommonTree total_rows_tree=null;
        CommonTree TOK_MEAN17_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:117:6: ( ^( TOK_MEAN column_x= INT ip= ID total_rows= INT ) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:117:9: ^( TOK_MEAN column_x= INT ip= ID total_rows= INT )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TOK_MEAN17=(CommonTree)match(input,TOK_MEAN,FOLLOW_TOK_MEAN_in_mean302); 
            TOK_MEAN17_tree = (CommonTree)adaptor.dupNode(TOK_MEAN17);

            root_1 = (CommonTree)adaptor.becomeRoot(TOK_MEAN17_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            column_x=(CommonTree)match(input,INT,FOLLOW_INT_in_mean306); 
            column_x_tree = (CommonTree)adaptor.dupNode(column_x);

            adaptor.addChild(root_1, column_x_tree);

            _last = (CommonTree)input.LT(1);
            ip=(CommonTree)match(input,ID,FOLLOW_ID_in_mean310); 
            ip_tree = (CommonTree)adaptor.dupNode(ip);

            adaptor.addChild(root_1, ip_tree);

            _last = (CommonTree)input.LT(1);
            total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_mean314); 
            total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

            adaptor.addChild(root_1, total_rows_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                                         primitiveImpl=PrimitiveTypeImplFactory.getInstance((ip!=null?ip.getText():null));
                                         Future<Double> value=primitiveImpl.mean((ip!=null?ip.getText():null),Integer.parseInt((column_x!=null?column_x.getText():null)),Integer.parseInt((total_rows!=null?total_rows.getText():null)));
                                           try
                                          {
                                                System.out.println("Mean:"+value.get());  
                                               }
                                               catch(Exception e)
                                               {
                                                  System.out.println("Mean Job terminated due to exception. Check nectar logs for more information");
                                               }

                        

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mean"

    public static class correlation_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "correlation"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:132:1: correlation : ^( TOK_CORR column_x= INT column_y= INT ip= ID total_rows= INT ) ;
    public final NectarTree.correlation_return correlation() throws RecognitionException {
        NectarTree.correlation_return retval = new NectarTree.correlation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree column_x=null;
        CommonTree column_y=null;
        CommonTree ip=null;
        CommonTree total_rows=null;
        CommonTree TOK_CORR18=null;

        CommonTree column_x_tree=null;
        CommonTree column_y_tree=null;
        CommonTree ip_tree=null;
        CommonTree total_rows_tree=null;
        CommonTree TOK_CORR18_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:132:13: ( ^( TOK_CORR column_x= INT column_y= INT ip= ID total_rows= INT ) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:132:15: ^( TOK_CORR column_x= INT column_y= INT ip= ID total_rows= INT )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TOK_CORR18=(CommonTree)match(input,TOK_CORR,FOLLOW_TOK_CORR_in_correlation334); 
            TOK_CORR18_tree = (CommonTree)adaptor.dupNode(TOK_CORR18);

            root_1 = (CommonTree)adaptor.becomeRoot(TOK_CORR18_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            column_x=(CommonTree)match(input,INT,FOLLOW_INT_in_correlation338); 
            column_x_tree = (CommonTree)adaptor.dupNode(column_x);

            adaptor.addChild(root_1, column_x_tree);

            _last = (CommonTree)input.LT(1);
            column_y=(CommonTree)match(input,INT,FOLLOW_INT_in_correlation342); 
            column_y_tree = (CommonTree)adaptor.dupNode(column_y);

            adaptor.addChild(root_1, column_y_tree);

            _last = (CommonTree)input.LT(1);
            ip=(CommonTree)match(input,ID,FOLLOW_ID_in_correlation346); 
            ip_tree = (CommonTree)adaptor.dupNode(ip);

            adaptor.addChild(root_1, ip_tree);

            _last = (CommonTree)input.LT(1);
            total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_correlation350); 
            total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

            adaptor.addChild(root_1, total_rows_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                               Future<Double> value=complexTypeImpl.correlation((ip!=null?ip.getText():null),Integer.parseInt((column_x!=null?column_x.getText():null)),Integer.parseInt((column_y!=null?column_y.getText():null)),Integer.parseInt((total_rows!=null?total_rows.getText():null))); 
                                try  {
                                               System.out.println("correlation:"+value.get());  
                                       }
                                catch(Exception e)
                                               {
                                               }
                                

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "correlation"

    public static class correlationmatrix_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "correlationmatrix"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:143:1: correlationmatrix : ^( TOK_CORRMATRIX col= INT (morecol+= INT )* ip= ID total_rows= INT ) ;
    public final NectarTree.correlationmatrix_return correlationmatrix() throws RecognitionException {
        NectarTree.correlationmatrix_return retval = new NectarTree.correlationmatrix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree col=null;
        CommonTree ip=null;
        CommonTree total_rows=null;
        CommonTree TOK_CORRMATRIX19=null;
        CommonTree morecol=null;
        List list_morecol=null;

        CommonTree col_tree=null;
        CommonTree ip_tree=null;
        CommonTree total_rows_tree=null;
        CommonTree TOK_CORRMATRIX19_tree=null;
        CommonTree morecol_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:143:18: ( ^( TOK_CORRMATRIX col= INT (morecol+= INT )* ip= ID total_rows= INT ) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:143:20: ^( TOK_CORRMATRIX col= INT (morecol+= INT )* ip= ID total_rows= INT )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TOK_CORRMATRIX19=(CommonTree)match(input,TOK_CORRMATRIX,FOLLOW_TOK_CORRMATRIX_in_correlationmatrix368); 
            TOK_CORRMATRIX19_tree = (CommonTree)adaptor.dupNode(TOK_CORRMATRIX19);

            root_1 = (CommonTree)adaptor.becomeRoot(TOK_CORRMATRIX19_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            col=(CommonTree)match(input,INT,FOLLOW_INT_in_correlationmatrix372); 
            col_tree = (CommonTree)adaptor.dupNode(col);

            adaptor.addChild(root_1, col_tree);

            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:143:52: (morecol+= INT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==INT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:143:52: morecol+= INT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    morecol=(CommonTree)match(input,INT,FOLLOW_INT_in_correlationmatrix376); 
            	    morecol_tree = (CommonTree)adaptor.dupNode(morecol);

            	    adaptor.addChild(root_1, morecol_tree);

            	    if (list_morecol==null) list_morecol=new ArrayList();
            	    list_morecol.add(morecol);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            ip=(CommonTree)match(input,ID,FOLLOW_ID_in_correlationmatrix381); 
            ip_tree = (CommonTree)adaptor.dupNode(ip);

            adaptor.addChild(root_1, ip_tree);

            _last = (CommonTree)input.LT(1);
            total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_correlationmatrix385); 
            total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

            adaptor.addChild(root_1, total_rows_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                                list.add(Integer.parseInt((col!=null?col.getText():null)));
                                  for(Object object : list_morecol)
                                  {
                                   
                                    CommonTree commonTree = (CommonTree) object;
                                      String colValue = commonTree.token.getText();
                                      list.add(Integer.parseInt(colValue));
                               
                                  }
                                  
                                    Future<Double[][]> value=complexTypeImpl.correlationmatrix((ip!=null?ip.getText():null),list,Integer.parseInt((total_rows!=null?total_rows.getText():null))); 
                                   try 
                                          {
                                              Double[][] matrix=value.get(); 
                                              System.out.println("Correlation matrix:"); 
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
                                               e.printStackTrace();
                                               }
             
             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "correlationmatrix"

    public static class multiplereg_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplereg"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:176:1: multiplereg : ^( TOK_MULTIPLEREG col= INT (morecol+= INT )* ip= ID total_rows= INT ) ;
    public final NectarTree.multiplereg_return multiplereg() throws RecognitionException {
        NectarTree.multiplereg_return retval = new NectarTree.multiplereg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree col=null;
        CommonTree ip=null;
        CommonTree total_rows=null;
        CommonTree TOK_MULTIPLEREG20=null;
        CommonTree morecol=null;
        List list_morecol=null;

        CommonTree col_tree=null;
        CommonTree ip_tree=null;
        CommonTree total_rows_tree=null;
        CommonTree TOK_MULTIPLEREG20_tree=null;
        CommonTree morecol_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:176:13: ( ^( TOK_MULTIPLEREG col= INT (morecol+= INT )* ip= ID total_rows= INT ) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:176:15: ^( TOK_MULTIPLEREG col= INT (morecol+= INT )* ip= ID total_rows= INT )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TOK_MULTIPLEREG20=(CommonTree)match(input,TOK_MULTIPLEREG,FOLLOW_TOK_MULTIPLEREG_in_multiplereg410); 
            TOK_MULTIPLEREG20_tree = (CommonTree)adaptor.dupNode(TOK_MULTIPLEREG20);

            root_1 = (CommonTree)adaptor.becomeRoot(TOK_MULTIPLEREG20_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            col=(CommonTree)match(input,INT,FOLLOW_INT_in_multiplereg414); 
            col_tree = (CommonTree)adaptor.dupNode(col);

            adaptor.addChild(root_1, col_tree);

            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:176:48: (morecol+= INT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==INT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:176:48: morecol+= INT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    morecol=(CommonTree)match(input,INT,FOLLOW_INT_in_multiplereg418); 
            	    morecol_tree = (CommonTree)adaptor.dupNode(morecol);

            	    adaptor.addChild(root_1, morecol_tree);

            	    if (list_morecol==null) list_morecol=new ArrayList();
            	    list_morecol.add(morecol);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            ip=(CommonTree)match(input,ID,FOLLOW_ID_in_multiplereg423); 
            ip_tree = (CommonTree)adaptor.dupNode(ip);

            adaptor.addChild(root_1, ip_tree);

            _last = (CommonTree)input.LT(1);
            total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_multiplereg427); 
            total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

            adaptor.addChild(root_1, total_rows_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                              list.add(Integer.parseInt((col!=null?col.getText():null)));
                                  for(Object object : list_morecol)
                                  {
                                   
                                    CommonTree commonTree = (CommonTree) object;
                                      String colValue = commonTree.token.getText();
                                      list.add(Integer.parseInt(colValue));
                               
                                  }
                                    Future<Map<Integer,Double>> value=complexTypeImpl.multipleregression((ip!=null?ip.getText():null),list,Integer.parseInt((total_rows!=null?total_rows.getText():null)));
                                      try{
                                      System.out.print(value.get().values());
                                      }
                                      catch(Exception e)
                                      {
                                       e.printStackTrace();
                                      }
              

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplereg"

    public static class forwardselection_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forwardselection"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:197:2: forwardselection : ^( TOK_FORWARDSELECTION col= INT (morecol+= INT )* ip= ID total_rows= INT levelofsignificance= DOUBLE ) ;
    public final NectarTree.forwardselection_return forwardselection() throws RecognitionException {
        NectarTree.forwardselection_return retval = new NectarTree.forwardselection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree col=null;
        CommonTree ip=null;
        CommonTree total_rows=null;
        CommonTree levelofsignificance=null;
        CommonTree TOK_FORWARDSELECTION21=null;
        CommonTree morecol=null;
        List list_morecol=null;

        CommonTree col_tree=null;
        CommonTree ip_tree=null;
        CommonTree total_rows_tree=null;
        CommonTree levelofsignificance_tree=null;
        CommonTree TOK_FORWARDSELECTION21_tree=null;
        CommonTree morecol_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:197:19: ( ^( TOK_FORWARDSELECTION col= INT (morecol+= INT )* ip= ID total_rows= INT levelofsignificance= DOUBLE ) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:197:21: ^( TOK_FORWARDSELECTION col= INT (morecol+= INT )* ip= ID total_rows= INT levelofsignificance= DOUBLE )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TOK_FORWARDSELECTION21=(CommonTree)match(input,TOK_FORWARDSELECTION,FOLLOW_TOK_FORWARDSELECTION_in_forwardselection455); 
            TOK_FORWARDSELECTION21_tree = (CommonTree)adaptor.dupNode(TOK_FORWARDSELECTION21);

            root_1 = (CommonTree)adaptor.becomeRoot(TOK_FORWARDSELECTION21_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            col=(CommonTree)match(input,INT,FOLLOW_INT_in_forwardselection459); 
            col_tree = (CommonTree)adaptor.dupNode(col);

            adaptor.addChild(root_1, col_tree);

            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:197:59: (morecol+= INT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:197:59: morecol+= INT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    morecol=(CommonTree)match(input,INT,FOLLOW_INT_in_forwardselection463); 
            	    morecol_tree = (CommonTree)adaptor.dupNode(morecol);

            	    adaptor.addChild(root_1, morecol_tree);

            	    if (list_morecol==null) list_morecol=new ArrayList();
            	    list_morecol.add(morecol);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            ip=(CommonTree)match(input,ID,FOLLOW_ID_in_forwardselection468); 
            ip_tree = (CommonTree)adaptor.dupNode(ip);

            adaptor.addChild(root_1, ip_tree);

            _last = (CommonTree)input.LT(1);
            total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_forwardselection472); 
            total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

            adaptor.addChild(root_1, total_rows_tree);

            _last = (CommonTree)input.LT(1);
            levelofsignificance=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_forwardselection476); 
            levelofsignificance_tree = (CommonTree)adaptor.dupNode(levelofsignificance);

            adaptor.addChild(root_1, levelofsignificance_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                                          list.add(Integer.parseInt((col!=null?col.getText():null)));
                                  for(Object object : list_morecol)
                                  {
                                   
                                    CommonTree commonTree = (CommonTree) object;
                                      String colValue = commonTree.token.getText();
                                      list.add(Integer.parseInt(colValue));
                               
                                  }
                                  
                                   complexTypeImpl.forwardSelection((ip!=null?ip.getText():null),list,Integer.parseInt((total_rows!=null?total_rows.getText():null)),Double.parseDouble((levelofsignificance!=null?levelofsignificance.getText():null)));
                                   
                    
                    
                    

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forwardselection"

    public static class sort_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sort"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:215:1: sort : ^( TOK_SORT column_no= INT ip= ID ) ;
    public final NectarTree.sort_return sort() throws RecognitionException {
        NectarTree.sort_return retval = new NectarTree.sort_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree column_no=null;
        CommonTree ip=null;
        CommonTree TOK_SORT22=null;

        CommonTree column_no_tree=null;
        CommonTree ip_tree=null;
        CommonTree TOK_SORT22_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:215:6: ( ^( TOK_SORT column_no= INT ip= ID ) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:215:7: ^( TOK_SORT column_no= INT ip= ID )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TOK_SORT22=(CommonTree)match(input,TOK_SORT,FOLLOW_TOK_SORT_in_sort492); 
            TOK_SORT22_tree = (CommonTree)adaptor.dupNode(TOK_SORT22);

            root_1 = (CommonTree)adaptor.becomeRoot(TOK_SORT22_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            column_no=(CommonTree)match(input,INT,FOLLOW_INT_in_sort496); 
            column_no_tree = (CommonTree)adaptor.dupNode(column_no);

            adaptor.addChild(root_1, column_no_tree);

            _last = (CommonTree)input.LT(1);
            ip=(CommonTree)match(input,ID,FOLLOW_ID_in_sort500); 
            ip_tree = (CommonTree)adaptor.dupNode(ip);

            adaptor.addChild(root_1, ip_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }



                                     primitiveImpl=PrimitiveTypeImplFactory.getInstance((ip!=null?ip.getText():null));
                                    Future<Double[]> value=primitiveImpl.sort((ip!=null?ip.getText():null),Integer.parseInt((column_no!=null?column_no.getText():null)));
                                               try {Double[] sortArray=value.get(); 
                                              System.out.println("Sort:"); 
                                              for(int i=0;i<sortArray.length;i++) {
                                              outln(sortArray[i]);
                                              }
                                              }
                                               catch(Exception e)
                                               { 
                                               outln("Sort Job terminated due to exception. Check nectar logs for more information");
                                              }
                                    
                                   

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sort"

    public static class cov_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cov"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:233:2: cov : ^( TOK_COV column_x= INT column_y= INT ip= ID total_rows= INT ) ;
    public final NectarTree.cov_return cov() throws RecognitionException {
        NectarTree.cov_return retval = new NectarTree.cov_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree column_x=null;
        CommonTree column_y=null;
        CommonTree ip=null;
        CommonTree total_rows=null;
        CommonTree TOK_COV23=null;

        CommonTree column_x_tree=null;
        CommonTree column_y_tree=null;
        CommonTree ip_tree=null;
        CommonTree total_rows_tree=null;
        CommonTree TOK_COV23_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:233:6: ( ^( TOK_COV column_x= INT column_y= INT ip= ID total_rows= INT ) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:233:8: ^( TOK_COV column_x= INT column_y= INT ip= ID total_rows= INT )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TOK_COV23=(CommonTree)match(input,TOK_COV,FOLLOW_TOK_COV_in_cov528); 
            TOK_COV23_tree = (CommonTree)adaptor.dupNode(TOK_COV23);

            root_1 = (CommonTree)adaptor.becomeRoot(TOK_COV23_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            column_x=(CommonTree)match(input,INT,FOLLOW_INT_in_cov532); 
            column_x_tree = (CommonTree)adaptor.dupNode(column_x);

            adaptor.addChild(root_1, column_x_tree);

            _last = (CommonTree)input.LT(1);
            column_y=(CommonTree)match(input,INT,FOLLOW_INT_in_cov536); 
            column_y_tree = (CommonTree)adaptor.dupNode(column_y);

            adaptor.addChild(root_1, column_y_tree);

            _last = (CommonTree)input.LT(1);
            ip=(CommonTree)match(input,ID,FOLLOW_ID_in_cov540); 
            ip_tree = (CommonTree)adaptor.dupNode(ip);

            adaptor.addChild(root_1, ip_tree);

            _last = (CommonTree)input.LT(1);
            total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_cov544); 
            total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

            adaptor.addChild(root_1, total_rows_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                        Future<Double> value=complexTypeImpl.covariance((ip!=null?ip.getText():null),Integer.parseInt((column_x!=null?column_x.getText():null)),Integer.parseInt((column_y!=null?column_y.getText():null)),Integer.parseInt((total_rows!=null?total_rows.getText():null))); 
                                try  {
                                               System.out.println("Covariance:"+value.get());  
                                       }
                                catch(Exception e)
                                               {
                                               }
             
                  
                  
                  

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cov"

    public static class covmatrix_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "covmatrix"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:247:1: covmatrix : ^( TOK_COVMATRIX col= INT (morecol+= INT )* ip= ID total_rows= INT ) ;
    public final NectarTree.covmatrix_return covmatrix() throws RecognitionException {
        NectarTree.covmatrix_return retval = new NectarTree.covmatrix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree col=null;
        CommonTree ip=null;
        CommonTree total_rows=null;
        CommonTree TOK_COVMATRIX24=null;
        CommonTree morecol=null;
        List list_morecol=null;

        CommonTree col_tree=null;
        CommonTree ip_tree=null;
        CommonTree total_rows_tree=null;
        CommonTree TOK_COVMATRIX24_tree=null;
        CommonTree morecol_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:247:11: ( ^( TOK_COVMATRIX col= INT (morecol+= INT )* ip= ID total_rows= INT ) )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:247:13: ^( TOK_COVMATRIX col= INT (morecol+= INT )* ip= ID total_rows= INT )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TOK_COVMATRIX24=(CommonTree)match(input,TOK_COVMATRIX,FOLLOW_TOK_COVMATRIX_in_covmatrix576); 
            TOK_COVMATRIX24_tree = (CommonTree)adaptor.dupNode(TOK_COVMATRIX24);

            root_1 = (CommonTree)adaptor.becomeRoot(TOK_COVMATRIX24_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            col=(CommonTree)match(input,INT,FOLLOW_INT_in_covmatrix581); 
            col_tree = (CommonTree)adaptor.dupNode(col);

            adaptor.addChild(root_1, col_tree);

            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:247:45: (morecol+= INT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:247:45: morecol+= INT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    morecol=(CommonTree)match(input,INT,FOLLOW_INT_in_covmatrix585); 
            	    morecol_tree = (CommonTree)adaptor.dupNode(morecol);

            	    adaptor.addChild(root_1, morecol_tree);

            	    if (list_morecol==null) list_morecol=new ArrayList();
            	    list_morecol.add(morecol);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            ip=(CommonTree)match(input,ID,FOLLOW_ID_in_covmatrix590); 
            ip_tree = (CommonTree)adaptor.dupNode(ip);

            adaptor.addChild(root_1, ip_tree);

            _last = (CommonTree)input.LT(1);
            total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_covmatrix594); 
            total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

            adaptor.addChild(root_1, total_rows_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                                     list.add(Integer.parseInt((col!=null?col.getText():null)));
                                  for(Object object : list_morecol)
                                  {
                                   
                                    CommonTree commonTree = (CommonTree) object;
                                      String colValue = commonTree.token.getText();
                                      list.add(Integer.parseInt(colValue));
                               
                                  }
                                  
                                    Future<Double[][]> value=complexTypeImpl.covariancematrix((ip!=null?ip.getText():null),list,Integer.parseInt((total_rows!=null?total_rows.getText():null))); 
                                   try 
                                          {
                                              Double[][] matrix=value.get(); 
                                              System.out.println("Covariance matrix:"); 
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
                                               e.printStackTrace();
                                               }
                     

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "covmatrix"

    public static class help_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "help"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:280:1: help : HELP terminator ;
    public final NectarTree.help_return help() throws RecognitionException {
        NectarTree.help_return retval = new NectarTree.help_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree HELP25=null;
        NectarTree.terminator_return terminator26 = null;


        CommonTree HELP25_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:280:6: ( HELP terminator )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:280:8: HELP terminator
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            HELP25=(CommonTree)match(input,HELP,FOLLOW_HELP_in_help621); 
            HELP25_tree = (CommonTree)adaptor.dupNode(HELP25);

            adaptor.addChild(root_0, HELP25_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_terminator_in_help623);
            terminator26=terminator();

            state._fsp--;

            adaptor.addChild(root_0, terminator26.getTree());

                  outln("Usage of the commands are as follows:");
                  outln("1.sigmax"+"\n"+"sigmax(column_no)<<input_file"+"\n"+"2.sigmaxsquare"+"\n"+"sigmaxsquare(column_no)<<input_file");
                  outln("3.sigmaxy"+"\n"+"sigmaxy(column_no1,column_no2)<<input_file"+"\n"+"4.mean"+"\n"+"mean(column_no)<<input_file(total_no_of_rows)"); 
                  outln("5.correlation"+"\n"+"corr(column_no1,column_no2)<<input_file(total_no_of_rows)"+"\n"+"6.correlation matrix");
                  outln("corrmatrix(column_nos)<<input_file(total_no_of_rows)"+"\n"+"7.multiple regression"+"\n"+"multiplereg(column_nos)<<input_file(total_no_of_rows)");
                  outln("8.forward selection"+"\n"+"forwardselection(column_nos)<<input_file(total_no_of_rows,level_of_significance)"+"\n"+"9.sort"+"\n"+"sort(column_no)<<input_file"+"\n"+"10.covariance"+"\n"+"cov(column_no1,column_no2)<<input_file(total_no_of_rows)");
                  outln("11.covariance matrix"+"\n"+"covmatrix(column_nos)<<input_file(total_no_of_rows)");
                  outln("NOTE: The tab separated input_file must be in hdfs"); 
                  

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "help"

    public static class terminator_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "terminator"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:291:1: terminator : ( NEWLINE | EOF );
    public final NectarTree.terminator_return terminator() throws RecognitionException {
        NectarTree.terminator_return retval = new NectarTree.terminator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set27=null;

        CommonTree set27_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:291:11: ( NEWLINE | EOF )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set27=(CommonTree)input.LT(1);
            if ( input.LA(1)==EOF||input.LA(1)==NEWLINE ) {
                input.consume();

                set27_tree = (CommonTree)adaptor.dupNode(set27);

                adaptor.addChild(root_0, set27_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "terminator"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_start109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sigmax_in_statement126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sigmaxy_in_statement130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sigmaxsquare_in_statement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mean_in_statement137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_correlation_in_statement141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_correlationmatrix_in_statement145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplereg_in_statement149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forwardselection_in_statement153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sort_in_statement156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cov_in_statement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_covmatrix_in_statement164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_help_in_statement167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOK_SIGMAX_in_sigmax199 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_sigmax203 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_sigmax207 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_SIGMAXY_in_sigmaxy232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_sigmaxy236 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_sigmaxy240 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_sigmaxy244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_SIGMAXSQUARE_in_sigmaxsquare265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_sigmaxsquare269 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_sigmaxsquare273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_MEAN_in_mean302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_mean306 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_mean310 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_mean314 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_CORR_in_correlation334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_correlation338 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_correlation342 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_correlation346 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_correlation350 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_CORRMATRIX_in_correlationmatrix368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix372 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix376 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ID_in_correlationmatrix381 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix385 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_MULTIPLEREG_in_multiplereg410 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_multiplereg414 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_INT_in_multiplereg418 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ID_in_multiplereg423 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_multiplereg427 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_FORWARDSELECTION_in_forwardselection455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_forwardselection459 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_INT_in_forwardselection463 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ID_in_forwardselection468 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_forwardselection472 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_DOUBLE_in_forwardselection476 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_SORT_in_sort492 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_sort496 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_sort500 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_COV_in_cov528 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_cov532 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_cov536 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_cov540 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_cov544 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_COVMATRIX_in_covmatrix576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_covmatrix581 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_INT_in_covmatrix585 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ID_in_covmatrix590 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_covmatrix594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HELP_in_help621 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_terminator_in_help623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_terminator0 = new BitSet(new long[]{0x0000000000000002L});

}