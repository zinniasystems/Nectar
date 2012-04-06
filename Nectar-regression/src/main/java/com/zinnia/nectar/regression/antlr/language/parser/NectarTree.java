// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g 2012-04-03 15:10:46

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
    public static final int TOK_COVMATRIX=42;
    public static final int MULTIPLEREG=14;
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
    String completePath="";
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:66:1: start : statement ;
    public final NectarTree.start_return start() throws RecognitionException {
        NectarTree.start_return retval = new NectarTree.start_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        NectarTree.statement_return statement1 = null;



        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:66:7: ( statement )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:66:9: statement
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:1: statement : ( sigmax | sigmaxy | sigmaxsquare | mean | correlation | correlationmatrix | multiplereg | forwardselection | sort | cov | covmatrix | help );
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
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:11: ( sigmax | sigmaxy | sigmaxsquare | mean | correlation | correlationmatrix | multiplereg | forwardselection | sort | cov | covmatrix | help )
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:13: sigmax
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:22: sigmaxy
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:32: sigmaxsquare
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:46: mean
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:53: correlation
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:67: correlationmatrix
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:87: multiplereg
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:101: forwardselection
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:119: sort
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:126: cov
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:132: covmatrix
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:68:143: help
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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:71:1: sigmax : ( ^( TOK_SIGMAX column_no= INT ip= ID ) | ^( TOK_SIGMAX column_no= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ ) );
    public final NectarTree.sigmax_return sigmax() throws RecognitionException {
        NectarTree.sigmax_return retval = new NectarTree.sigmax_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree column_no=null;
        CommonTree ip=null;
        CommonTree directory=null;
        CommonTree TOK_SIGMAX14=null;
        CommonTree TOK_SIGMAX15=null;
        CommonTree filenameList=null;
        List list_filenameList=null;

        CommonTree column_no_tree=null;
        CommonTree ip_tree=null;
        CommonTree directory_tree=null;
        CommonTree TOK_SIGMAX14_tree=null;
        CommonTree TOK_SIGMAX15_tree=null;
        CommonTree filenameList_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:72:1: ( ^( TOK_SIGMAX column_no= INT ip= ID ) | ^( TOK_SIGMAX column_no= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TOK_SIGMAX) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==INT) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==ID) ) {
                            int LA3_4 = input.LA(5);

                            if ( (LA3_4==UP) ) {
                                alt3=1;
                            }
                            else if ( (LA3_4==FORWARDSLASH) ) {
                                alt3=2;
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:72:4: ^( TOK_SIGMAX column_no= INT ip= ID )
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
                                                        outln("Sigma Job terminated due to exception. Check nectar logs for more information");
                                                       }
                                                 

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:86:4: ^( TOK_SIGMAX column_no= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_SIGMAX15=(CommonTree)match(input,TOK_SIGMAX,FOLLOW_TOK_SIGMAX_in_sigmax223); 
                    TOK_SIGMAX15_tree = (CommonTree)adaptor.dupNode(TOK_SIGMAX15);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_SIGMAX15_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    column_no=(CommonTree)match(input,INT,FOLLOW_INT_in_sigmax227); 
                    column_no_tree = (CommonTree)adaptor.dupNode(column_no);

                    adaptor.addChild(root_1, column_no_tree);

                    _last = (CommonTree)input.LT(1);
                    directory=(CommonTree)match(input,ID,FOLLOW_ID_in_sigmax231); 
                    directory_tree = (CommonTree)adaptor.dupNode(directory);

                    adaptor.addChild(root_1, directory_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:86:44: (filenameList+= FORWARDSLASH filenameList+= ID )+
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
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:86:45: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_sigmax236); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,ID,FOLLOW_ID_in_sigmax240); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

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


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                          
                                         
                                          for(Object object : list_filenameList)
                                          {   CommonTree commonTree = (CommonTree) object;
                                              String filePathName = commonTree.token.getText();
                                              completePath+=filePathName.toString();
                                       
                                          }
                                            primitiveImpl=PrimitiveTypeImplFactory.getInstance((directory!=null?directory.getText():null)+completePath);
                                            Future<Double> value=primitiveImpl.sigmax((directory!=null?directory.getText():null)+completePath,Integer.parseInt((column_no!=null?column_no.getText():null)));
                                               try
                                                  {
                                                       outln("Sigmax:"+value.get());
                                                       }
                                                       catch(Exception e)
                                                       {
                                                        outln("Sigma Job terminated due to exception. Check nectar logs for more information");
                                                        }
                                                        

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
    // $ANTLR end "sigmax"

    public static class sigmaxy_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sigmaxy"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:107:1: sigmaxy : ( ^( TOK_SIGMAXY column_x= INT column_y= INT ip= ID ) | ^( TOK_SIGMAXY column_x= INT column_y= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ ) );
    public final NectarTree.sigmaxy_return sigmaxy() throws RecognitionException {
        NectarTree.sigmaxy_return retval = new NectarTree.sigmaxy_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree column_x=null;
        CommonTree column_y=null;
        CommonTree ip=null;
        CommonTree directory=null;
        CommonTree TOK_SIGMAXY16=null;
        CommonTree TOK_SIGMAXY17=null;
        CommonTree filenameList=null;
        List list_filenameList=null;

        CommonTree column_x_tree=null;
        CommonTree column_y_tree=null;
        CommonTree ip_tree=null;
        CommonTree directory_tree=null;
        CommonTree TOK_SIGMAXY16_tree=null;
        CommonTree TOK_SIGMAXY17_tree=null;
        CommonTree filenameList_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:107:9: ( ^( TOK_SIGMAXY column_x= INT column_y= INT ip= ID ) | ^( TOK_SIGMAXY column_x= INT column_y= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==TOK_SIGMAXY) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==DOWN) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==INT) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==INT) ) {
                            int LA5_4 = input.LA(5);

                            if ( (LA5_4==ID) ) {
                                int LA5_5 = input.LA(6);

                                if ( (LA5_5==UP) ) {
                                    alt5=1;
                                }
                                else if ( (LA5_5==FORWARDSLASH) ) {
                                    alt5=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:107:11: ^( TOK_SIGMAXY column_x= INT column_y= INT ip= ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_SIGMAXY16=(CommonTree)match(input,TOK_SIGMAXY,FOLLOW_TOK_SIGMAXY_in_sigmaxy264); 
                    TOK_SIGMAXY16_tree = (CommonTree)adaptor.dupNode(TOK_SIGMAXY16);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_SIGMAXY16_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    column_x=(CommonTree)match(input,INT,FOLLOW_INT_in_sigmaxy268); 
                    column_x_tree = (CommonTree)adaptor.dupNode(column_x);

                    adaptor.addChild(root_1, column_x_tree);

                    _last = (CommonTree)input.LT(1);
                    column_y=(CommonTree)match(input,INT,FOLLOW_INT_in_sigmaxy272); 
                    column_y_tree = (CommonTree)adaptor.dupNode(column_y);

                    adaptor.addChild(root_1, column_y_tree);

                    _last = (CommonTree)input.LT(1);
                    ip=(CommonTree)match(input,ID,FOLLOW_ID_in_sigmaxy276); 
                    ip_tree = (CommonTree)adaptor.dupNode(ip);

                    adaptor.addChild(root_1, ip_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                     
                                             primitiveImpl=PrimitiveTypeImplFactory.getInstance((ip!=null?ip.getText():null));
                                             Future<Double> value=primitiveImpl.sigmaxy((ip!=null?ip.getText():null),Integer.parseInt((column_x!=null?column_x.getText():null)),Integer.parseInt((column_y!=null?column_y.getText():null))); 
                                           try
                                                  {
                                                        outln("Sigmaxy:"+value.get());  
                                                       }
                                                       catch(Exception e)
                                                       {
                                                          outln("SigmaXY Job terminated due to exception. Check nectar logs for more information");
                                                       }
                                             

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:120:7: ^( TOK_SIGMAXY column_x= INT column_y= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_SIGMAXY17=(CommonTree)match(input,TOK_SIGMAXY,FOLLOW_TOK_SIGMAXY_in_sigmaxy296); 
                    TOK_SIGMAXY17_tree = (CommonTree)adaptor.dupNode(TOK_SIGMAXY17);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_SIGMAXY17_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    column_x=(CommonTree)match(input,INT,FOLLOW_INT_in_sigmaxy300); 
                    column_x_tree = (CommonTree)adaptor.dupNode(column_x);

                    adaptor.addChild(root_1, column_x_tree);

                    _last = (CommonTree)input.LT(1);
                    column_y=(CommonTree)match(input,INT,FOLLOW_INT_in_sigmaxy304); 
                    column_y_tree = (CommonTree)adaptor.dupNode(column_y);

                    adaptor.addChild(root_1, column_y_tree);

                    _last = (CommonTree)input.LT(1);
                    directory=(CommonTree)match(input,ID,FOLLOW_ID_in_sigmaxy308); 
                    directory_tree = (CommonTree)adaptor.dupNode(directory);

                    adaptor.addChild(root_1, directory_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:120:60: (filenameList+= FORWARDSLASH filenameList+= ID )+
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
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:120:61: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_sigmaxy313); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,ID,FOLLOW_ID_in_sigmaxy317); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

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


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                               for(Object object : list_filenameList)
                                          {   CommonTree commonTree = (CommonTree) object;
                                              String filePathName = commonTree.token.getText();
                                              completePath+=filePathName.toString();
                                       
                                          }                         
                                             primitiveImpl=PrimitiveTypeImplFactory.getInstance((directory!=null?directory.getText():null)+completePath);
                                             Future<Double> value=primitiveImpl.sigmaxy((directory!=null?directory.getText():null)+completePath,Integer.parseInt((column_x!=null?column_x.getText():null)),Integer.parseInt((column_y!=null?column_y.getText():null))); 
                                           try
                                                  {
                                                        outln("Sigmaxy:"+value.get());  
                                                       }
                                                       catch(Exception e)
                                                       {
                                                         outln("SigmaXY Job terminated due to exception. Check nectar logs for more information");
                                                       }
                                             

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
    // $ANTLR end "sigmaxy"

    public static class sigmaxsquare_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sigmaxsquare"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:140:1: sigmaxsquare : ( ^( TOK_SIGMAXSQUARE column_x= INT ip= ID ) | ^( TOK_SIGMAXSQUARE column_x= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ ) );
    public final NectarTree.sigmaxsquare_return sigmaxsquare() throws RecognitionException {
        NectarTree.sigmaxsquare_return retval = new NectarTree.sigmaxsquare_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree column_x=null;
        CommonTree ip=null;
        CommonTree directory=null;
        CommonTree TOK_SIGMAXSQUARE18=null;
        CommonTree TOK_SIGMAXSQUARE19=null;
        CommonTree filenameList=null;
        List list_filenameList=null;

        CommonTree column_x_tree=null;
        CommonTree ip_tree=null;
        CommonTree directory_tree=null;
        CommonTree TOK_SIGMAXSQUARE18_tree=null;
        CommonTree TOK_SIGMAXSQUARE19_tree=null;
        CommonTree filenameList_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:140:14: ( ^( TOK_SIGMAXSQUARE column_x= INT ip= ID ) | ^( TOK_SIGMAXSQUARE column_x= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==TOK_SIGMAXSQUARE) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==DOWN) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==INT) ) {
                        int LA7_3 = input.LA(4);

                        if ( (LA7_3==ID) ) {
                            int LA7_4 = input.LA(5);

                            if ( (LA7_4==UP) ) {
                                alt7=1;
                            }
                            else if ( (LA7_4==FORWARDSLASH) ) {
                                alt7=2;
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:140:16: ^( TOK_SIGMAXSQUARE column_x= INT ip= ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_SIGMAXSQUARE18=(CommonTree)match(input,TOK_SIGMAXSQUARE,FOLLOW_TOK_SIGMAXSQUARE_in_sigmaxsquare356); 
                    TOK_SIGMAXSQUARE18_tree = (CommonTree)adaptor.dupNode(TOK_SIGMAXSQUARE18);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_SIGMAXSQUARE18_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    column_x=(CommonTree)match(input,INT,FOLLOW_INT_in_sigmaxsquare360); 
                    column_x_tree = (CommonTree)adaptor.dupNode(column_x);

                    adaptor.addChild(root_1, column_x_tree);

                    _last = (CommonTree)input.LT(1);
                    ip=(CommonTree)match(input,ID,FOLLOW_ID_in_sigmaxsquare364); 
                    ip_tree = (CommonTree)adaptor.dupNode(ip);

                    adaptor.addChild(root_1, ip_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                               primitiveImpl=PrimitiveTypeImplFactory.getInstance((ip!=null?ip.getText():null));
                                               Future<Double> value=primitiveImpl.sigmaxSquare((ip!=null?ip.getText():null),Integer.parseInt((column_x!=null?column_x.getText():null))); 
                                               try
                                                  {
                                                        outln("Sigmaxsquare:"+value.get());  
                                                       }
                                                       catch(Exception e)
                                                       {
                                                          outln("Sigmaxsquare Job terminated due to exception. Check nectar logs for more information");
                                                       }
                                              

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:153:5: ^( TOK_SIGMAXSQUARE column_x= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_SIGMAXSQUARE19=(CommonTree)match(input,TOK_SIGMAXSQUARE,FOLLOW_TOK_SIGMAXSQUARE_in_sigmaxsquare382); 
                    TOK_SIGMAXSQUARE19_tree = (CommonTree)adaptor.dupNode(TOK_SIGMAXSQUARE19);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_SIGMAXSQUARE19_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    column_x=(CommonTree)match(input,INT,FOLLOW_INT_in_sigmaxsquare386); 
                    column_x_tree = (CommonTree)adaptor.dupNode(column_x);

                    adaptor.addChild(root_1, column_x_tree);

                    _last = (CommonTree)input.LT(1);
                    directory=(CommonTree)match(input,ID,FOLLOW_ID_in_sigmaxsquare390); 
                    directory_tree = (CommonTree)adaptor.dupNode(directory);

                    adaptor.addChild(root_1, directory_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:153:50: (filenameList+= FORWARDSLASH filenameList+= ID )+
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
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:153:51: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_sigmaxsquare395); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,ID,FOLLOW_ID_in_sigmaxsquare399); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

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


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                               for(Object object : list_filenameList)
                                          {   CommonTree commonTree = (CommonTree) object;
                                              String filePathName = commonTree.token.getText();
                                              completePath+=filePathName.toString();
                                       
                                          }
                                               primitiveImpl=PrimitiveTypeImplFactory.getInstance((directory!=null?directory.getText():null)+completePath);
                                               Future<Double> value=primitiveImpl.sigmaxSquare((directory!=null?directory.getText():null)+completePath,Integer.parseInt((column_x!=null?column_x.getText():null))); 
                                               try
                                                  {
                                                        outln("Sigmaxsquare:"+value.get());  
                                                       }
                                                       catch(Exception e)
                                                       {
                                                          outln("Sigmaxsquare Job terminated due to exception. Check nectar logs for more information");
                                                       }
                                              

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
    // $ANTLR end "sigmaxsquare"

    public static class mean_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mean"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:174:1: mean : ( ^( TOK_MEAN column_x= INT ip= ID total_rows= INT ) | ^( TOK_MEAN column_x= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT ) );
    public final NectarTree.mean_return mean() throws RecognitionException {
        NectarTree.mean_return retval = new NectarTree.mean_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree column_x=null;
        CommonTree ip=null;
        CommonTree total_rows=null;
        CommonTree directory=null;
        CommonTree TOK_MEAN20=null;
        CommonTree TOK_MEAN21=null;
        CommonTree filenameList=null;
        List list_filenameList=null;

        CommonTree column_x_tree=null;
        CommonTree ip_tree=null;
        CommonTree total_rows_tree=null;
        CommonTree directory_tree=null;
        CommonTree TOK_MEAN20_tree=null;
        CommonTree TOK_MEAN21_tree=null;
        CommonTree filenameList_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:174:6: ( ^( TOK_MEAN column_x= INT ip= ID total_rows= INT ) | ^( TOK_MEAN column_x= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==TOK_MEAN) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==DOWN) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==INT) ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3==ID) ) {
                            int LA9_4 = input.LA(5);

                            if ( (LA9_4==INT) ) {
                                alt9=1;
                            }
                            else if ( (LA9_4==FORWARDSLASH) ) {
                                alt9=2;
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:174:9: ^( TOK_MEAN column_x= INT ip= ID total_rows= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_MEAN20=(CommonTree)match(input,TOK_MEAN,FOLLOW_TOK_MEAN_in_mean439); 
                    TOK_MEAN20_tree = (CommonTree)adaptor.dupNode(TOK_MEAN20);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_MEAN20_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    column_x=(CommonTree)match(input,INT,FOLLOW_INT_in_mean443); 
                    column_x_tree = (CommonTree)adaptor.dupNode(column_x);

                    adaptor.addChild(root_1, column_x_tree);

                    _last = (CommonTree)input.LT(1);
                    ip=(CommonTree)match(input,ID,FOLLOW_ID_in_mean447); 
                    ip_tree = (CommonTree)adaptor.dupNode(ip);

                    adaptor.addChild(root_1, ip_tree);

                    _last = (CommonTree)input.LT(1);
                    total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_mean451); 
                    total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

                    adaptor.addChild(root_1, total_rows_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                                 primitiveImpl=PrimitiveTypeImplFactory.getInstance((ip!=null?ip.getText():null));
                                                 Future<Double> value=primitiveImpl.mean((ip!=null?ip.getText():null),Integer.parseInt((column_x!=null?column_x.getText():null)),Integer.parseInt((total_rows!=null?total_rows.getText():null)));
                                                   try
                                                  {
                                                        outln("Mean:"+value.get());  
                                                       }
                                                       catch(Exception e)
                                                       {
                                                          outln("Mean Job terminated due to exception. Check nectar logs for more information");
                                                       }

                                

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:188:2: ^( TOK_MEAN column_x= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_MEAN21=(CommonTree)match(input,TOK_MEAN,FOLLOW_TOK_MEAN_in_mean461); 
                    TOK_MEAN21_tree = (CommonTree)adaptor.dupNode(TOK_MEAN21);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_MEAN21_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    column_x=(CommonTree)match(input,INT,FOLLOW_INT_in_mean465); 
                    column_x_tree = (CommonTree)adaptor.dupNode(column_x);

                    adaptor.addChild(root_1, column_x_tree);

                    _last = (CommonTree)input.LT(1);
                    directory=(CommonTree)match(input,ID,FOLLOW_ID_in_mean469); 
                    directory_tree = (CommonTree)adaptor.dupNode(directory);

                    adaptor.addChild(root_1, directory_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:188:39: (filenameList+= FORWARDSLASH filenameList+= ID )+
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
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:188:40: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_mean474); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,ID,FOLLOW_ID_in_mean478); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

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

                    _last = (CommonTree)input.LT(1);
                    total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_mean484); 
                    total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

                    adaptor.addChild(root_1, total_rows_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                                 for(Object object : list_filenameList)
                                          {   CommonTree commonTree = (CommonTree) object;
                                              String filePathName = commonTree.token.getText();
                                              completePath+=filePathName.toString();
                                       
                                          }
                                          primitiveImpl=PrimitiveTypeImplFactory.getInstance((directory!=null?directory.getText():null)+completePath);
                                                 Future<Double> value=primitiveImpl.mean((directory!=null?directory.getText():null)+completePath,Integer.parseInt((column_x!=null?column_x.getText():null)),Integer.parseInt((total_rows!=null?total_rows.getText():null)));
                                                   try
                                                  {
                                                        outln("Mean:"+value.get());  
                                                       }
                                                       catch(Exception e)
                                                       {
                                                          outln("Mean Job terminated due to exception. Check nectar logs for more information");
                                                       }
                     
                     

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
    // $ANTLR end "mean"

    public static class correlation_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "correlation"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:209:1: correlation : ( ^( TOK_CORR column_x= INT column_y= INT ip= ID total_rows= INT ) | ^( TOK_CORR column_x= INT column_y= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT ) );
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
        CommonTree directory=null;
        CommonTree TOK_CORR22=null;
        CommonTree TOK_CORR23=null;
        CommonTree filenameList=null;
        List list_filenameList=null;

        CommonTree column_x_tree=null;
        CommonTree column_y_tree=null;
        CommonTree ip_tree=null;
        CommonTree total_rows_tree=null;
        CommonTree directory_tree=null;
        CommonTree TOK_CORR22_tree=null;
        CommonTree TOK_CORR23_tree=null;
        CommonTree filenameList_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:209:13: ( ^( TOK_CORR column_x= INT column_y= INT ip= ID total_rows= INT ) | ^( TOK_CORR column_x= INT column_y= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==TOK_CORR) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==DOWN) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==INT) ) {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3==INT) ) {
                            int LA11_4 = input.LA(5);

                            if ( (LA11_4==ID) ) {
                                int LA11_5 = input.LA(6);

                                if ( (LA11_5==INT) ) {
                                    alt11=1;
                                }
                                else if ( (LA11_5==FORWARDSLASH) ) {
                                    alt11=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 11, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:209:15: ^( TOK_CORR column_x= INT column_y= INT ip= ID total_rows= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_CORR22=(CommonTree)match(input,TOK_CORR,FOLLOW_TOK_CORR_in_correlation514); 
                    TOK_CORR22_tree = (CommonTree)adaptor.dupNode(TOK_CORR22);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_CORR22_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    column_x=(CommonTree)match(input,INT,FOLLOW_INT_in_correlation518); 
                    column_x_tree = (CommonTree)adaptor.dupNode(column_x);

                    adaptor.addChild(root_1, column_x_tree);

                    _last = (CommonTree)input.LT(1);
                    column_y=(CommonTree)match(input,INT,FOLLOW_INT_in_correlation522); 
                    column_y_tree = (CommonTree)adaptor.dupNode(column_y);

                    adaptor.addChild(root_1, column_y_tree);

                    _last = (CommonTree)input.LT(1);
                    ip=(CommonTree)match(input,ID,FOLLOW_ID_in_correlation526); 
                    ip_tree = (CommonTree)adaptor.dupNode(ip);

                    adaptor.addChild(root_1, ip_tree);

                    _last = (CommonTree)input.LT(1);
                    total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_correlation530); 
                    total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

                    adaptor.addChild(root_1, total_rows_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                       Future<Double> value=complexTypeImpl.correlation((ip!=null?ip.getText():null),Integer.parseInt((column_x!=null?column_x.getText():null)),Integer.parseInt((column_y!=null?column_y.getText():null)),Integer.parseInt((total_rows!=null?total_rows.getText():null))); 
                                        try  {
                                                       outln("correlation:"+value.get());  
                                               }
                                        catch(Exception e)
                                                       {
                                                       }
                                        

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:219:2: ^( TOK_CORR column_x= INT column_y= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_CORR23=(CommonTree)match(input,TOK_CORR,FOLLOW_TOK_CORR_in_correlation539); 
                    TOK_CORR23_tree = (CommonTree)adaptor.dupNode(TOK_CORR23);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_CORR23_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    column_x=(CommonTree)match(input,INT,FOLLOW_INT_in_correlation543); 
                    column_x_tree = (CommonTree)adaptor.dupNode(column_x);

                    adaptor.addChild(root_1, column_x_tree);

                    _last = (CommonTree)input.LT(1);
                    column_y=(CommonTree)match(input,INT,FOLLOW_INT_in_correlation547); 
                    column_y_tree = (CommonTree)adaptor.dupNode(column_y);

                    adaptor.addChild(root_1, column_y_tree);

                    _last = (CommonTree)input.LT(1);
                    directory=(CommonTree)match(input,ID,FOLLOW_ID_in_correlation551); 
                    directory_tree = (CommonTree)adaptor.dupNode(directory);

                    adaptor.addChild(root_1, directory_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:219:52: (filenameList+= FORWARDSLASH filenameList+= ID )+
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
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:219:53: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_correlation556); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,ID,FOLLOW_ID_in_correlation560); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

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

                    _last = (CommonTree)input.LT(1);
                    total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_correlation566); 
                    total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

                    adaptor.addChild(root_1, total_rows_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                         for(Object object : list_filenameList)
                                          {   CommonTree commonTree = (CommonTree) object;
                                              String filePathName = commonTree.token.getText();
                                              completePath+=filePathName.toString();
                                       
                                          }
                                          Future<Double> value=complexTypeImpl.correlation((directory!=null?directory.getText():null)+completePath,Integer.parseInt((column_x!=null?column_x.getText():null)),Integer.parseInt((column_y!=null?column_y.getText():null)),Integer.parseInt((total_rows!=null?total_rows.getText():null))); 
                                        try  {
                                                       outln("correlation:"+value.get());  
                                               }
                                        catch(Exception e)
                                                       {
                                                       }
                                        

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
    // $ANTLR end "correlation"

    public static class correlationmatrix_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "correlationmatrix"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:236:1: correlationmatrix : ( ^( TOK_CORRMATRIX col= INT (morecol+= INT )* ip= ID total_rows= INT ) | ^( TOK_CORRMATRIX col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT ) );
    public final NectarTree.correlationmatrix_return correlationmatrix() throws RecognitionException {
        NectarTree.correlationmatrix_return retval = new NectarTree.correlationmatrix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree col=null;
        CommonTree ip=null;
        CommonTree total_rows=null;
        CommonTree directory=null;
        CommonTree TOK_CORRMATRIX24=null;
        CommonTree TOK_CORRMATRIX25=null;
        CommonTree morecol=null;
        CommonTree filenameList=null;
        List list_morecol=null;
        List list_filenameList=null;

        CommonTree col_tree=null;
        CommonTree ip_tree=null;
        CommonTree total_rows_tree=null;
        CommonTree directory_tree=null;
        CommonTree TOK_CORRMATRIX24_tree=null;
        CommonTree TOK_CORRMATRIX25_tree=null;
        CommonTree morecol_tree=null;
        CommonTree filenameList_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:236:18: ( ^( TOK_CORRMATRIX col= INT (morecol+= INT )* ip= ID total_rows= INT ) | ^( TOK_CORRMATRIX col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT ) )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:236:20: ^( TOK_CORRMATRIX col= INT (morecol+= INT )* ip= ID total_rows= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_CORRMATRIX24=(CommonTree)match(input,TOK_CORRMATRIX,FOLLOW_TOK_CORRMATRIX_in_correlationmatrix582); 
                    TOK_CORRMATRIX24_tree = (CommonTree)adaptor.dupNode(TOK_CORRMATRIX24);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_CORRMATRIX24_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    col=(CommonTree)match(input,INT,FOLLOW_INT_in_correlationmatrix586); 
                    col_tree = (CommonTree)adaptor.dupNode(col);

                    adaptor.addChild(root_1, col_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:236:52: (morecol+= INT )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==INT) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:236:52: morecol+= INT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    morecol=(CommonTree)match(input,INT,FOLLOW_INT_in_correlationmatrix590); 
                    	    morecol_tree = (CommonTree)adaptor.dupNode(morecol);

                    	    adaptor.addChild(root_1, morecol_tree);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    ip=(CommonTree)match(input,ID,FOLLOW_ID_in_correlationmatrix595); 
                    ip_tree = (CommonTree)adaptor.dupNode(ip);

                    adaptor.addChild(root_1, ip_tree);

                    _last = (CommonTree)input.LT(1);
                    total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_correlationmatrix599); 
                    total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

                    adaptor.addChild(root_1, total_rows_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                        list.add(Integer.parseInt((col!=null?col.getText():null)));
                                          for(Object object : list_morecol)
                                          {   CommonTree commonTree = (CommonTree) object;
                                              String colValue = commonTree.token.getText();
                                              list.add(Integer.parseInt(colValue));
                                       
                                          }
                                          
                                            Future<Double[][]> value=complexTypeImpl.correlationmatrix((ip!=null?ip.getText():null),list,Integer.parseInt((total_rows!=null?total_rows.getText():null))); 
                                           try 
                                                  {
                                                      Double[][] matrix=value.get(); 
                                                      outln("Correlation matrix:"); 
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
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:265:2: ^( TOK_CORRMATRIX col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_CORRMATRIX25=(CommonTree)match(input,TOK_CORRMATRIX,FOLLOW_TOK_CORRMATRIX_in_correlationmatrix609); 
                    TOK_CORRMATRIX25_tree = (CommonTree)adaptor.dupNode(TOK_CORRMATRIX25);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_CORRMATRIX25_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    col=(CommonTree)match(input,INT,FOLLOW_INT_in_correlationmatrix613); 
                    col_tree = (CommonTree)adaptor.dupNode(col);

                    adaptor.addChild(root_1, col_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:265:34: (morecol+= INT )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==INT) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:265:34: morecol+= INT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    morecol=(CommonTree)match(input,INT,FOLLOW_INT_in_correlationmatrix617); 
                    	    morecol_tree = (CommonTree)adaptor.dupNode(morecol);

                    	    adaptor.addChild(root_1, morecol_tree);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    directory=(CommonTree)match(input,ID,FOLLOW_ID_in_correlationmatrix622); 
                    directory_tree = (CommonTree)adaptor.dupNode(directory);

                    adaptor.addChild(root_1, directory_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:265:54: (filenameList+= FORWARDSLASH filenameList+= ID )+
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
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:265:55: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_correlationmatrix627); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,ID,FOLLOW_ID_in_correlationmatrix631); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

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

                    _last = (CommonTree)input.LT(1);
                    total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_correlationmatrix637); 
                    total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

                    adaptor.addChild(root_1, total_rows_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                        for(Object object : list_filenameList)
                                          {   CommonTree commonTree = (CommonTree) object;
                                              String filePathName = commonTree.token.getText();
                                              completePath+=filePathName.toString();
                                       
                                          }
                                          
                                        list.add(Integer.parseInt((col!=null?col.getText():null)));
                                          for(Object object : list_morecol)
                                          {   CommonTree commonTree = (CommonTree) object;
                                              String colValue = commonTree.token.getText();
                                              list.add(Integer.parseInt(colValue));
                                       
                                          }
                                            Future<Double[][]> value=complexTypeImpl.correlationmatrix((directory!=null?directory.getText():null)+completePath,list,Integer.parseInt((total_rows!=null?total_rows.getText():null))); 
                                           try 
                                                  {
                                                      Double[][] matrix=value.get(); 
                                                      outln("Correlation matrix:"); 
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
    // $ANTLR end "correlationmatrix"

    public static class multiplereg_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplereg"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:301:1: multiplereg : ( ^( TOK_MULTIPLEREG col= INT (morecol+= INT )* ip= ID total_rows= INT ) | ^( TOK_MULTIPLEREG col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT ) );
    public final NectarTree.multiplereg_return multiplereg() throws RecognitionException {
        NectarTree.multiplereg_return retval = new NectarTree.multiplereg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree col=null;
        CommonTree ip=null;
        CommonTree total_rows=null;
        CommonTree directory=null;
        CommonTree TOK_MULTIPLEREG26=null;
        CommonTree TOK_MULTIPLEREG27=null;
        CommonTree morecol=null;
        CommonTree filenameList=null;
        List list_morecol=null;
        List list_filenameList=null;

        CommonTree col_tree=null;
        CommonTree ip_tree=null;
        CommonTree total_rows_tree=null;
        CommonTree directory_tree=null;
        CommonTree TOK_MULTIPLEREG26_tree=null;
        CommonTree TOK_MULTIPLEREG27_tree=null;
        CommonTree morecol_tree=null;
        CommonTree filenameList_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:301:13: ( ^( TOK_MULTIPLEREG col= INT (morecol+= INT )* ip= ID total_rows= INT ) | ^( TOK_MULTIPLEREG col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT ) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:301:15: ^( TOK_MULTIPLEREG col= INT (morecol+= INT )* ip= ID total_rows= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_MULTIPLEREG26=(CommonTree)match(input,TOK_MULTIPLEREG,FOLLOW_TOK_MULTIPLEREG_in_multiplereg656); 
                    TOK_MULTIPLEREG26_tree = (CommonTree)adaptor.dupNode(TOK_MULTIPLEREG26);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_MULTIPLEREG26_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    col=(CommonTree)match(input,INT,FOLLOW_INT_in_multiplereg660); 
                    col_tree = (CommonTree)adaptor.dupNode(col);

                    adaptor.addChild(root_1, col_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:301:48: (morecol+= INT )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==INT) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:301:48: morecol+= INT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    morecol=(CommonTree)match(input,INT,FOLLOW_INT_in_multiplereg664); 
                    	    morecol_tree = (CommonTree)adaptor.dupNode(morecol);

                    	    adaptor.addChild(root_1, morecol_tree);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    ip=(CommonTree)match(input,ID,FOLLOW_ID_in_multiplereg669); 
                    ip_tree = (CommonTree)adaptor.dupNode(ip);

                    adaptor.addChild(root_1, ip_tree);

                    _last = (CommonTree)input.LT(1);
                    total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_multiplereg673); 
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
                                              outln(value.get().values());
                                              }
                                              catch(Exception e)
                                              {
                                               e.printStackTrace();
                                              }
                      

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:322:2: ^( TOK_MULTIPLEREG col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_MULTIPLEREG27=(CommonTree)match(input,TOK_MULTIPLEREG,FOLLOW_TOK_MULTIPLEREG_in_multiplereg692); 
                    TOK_MULTIPLEREG27_tree = (CommonTree)adaptor.dupNode(TOK_MULTIPLEREG27);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_MULTIPLEREG27_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    col=(CommonTree)match(input,INT,FOLLOW_INT_in_multiplereg696); 
                    col_tree = (CommonTree)adaptor.dupNode(col);

                    adaptor.addChild(root_1, col_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:322:35: (morecol+= INT )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==INT) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:322:35: morecol+= INT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    morecol=(CommonTree)match(input,INT,FOLLOW_INT_in_multiplereg700); 
                    	    morecol_tree = (CommonTree)adaptor.dupNode(morecol);

                    	    adaptor.addChild(root_1, morecol_tree);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    directory=(CommonTree)match(input,ID,FOLLOW_ID_in_multiplereg705); 
                    directory_tree = (CommonTree)adaptor.dupNode(directory);

                    adaptor.addChild(root_1, directory_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:322:55: (filenameList+= FORWARDSLASH filenameList+= ID )+
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
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:322:56: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_multiplereg710); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,ID,FOLLOW_ID_in_multiplereg714); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

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

                    _last = (CommonTree)input.LT(1);
                    total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_multiplereg720); 
                    total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

                    adaptor.addChild(root_1, total_rows_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                       for(Object object : list_filenameList)
                                          {   CommonTree commonTree = (CommonTree) object;
                                              String filePathName = commonTree.token.getText();
                                              completePath+=filePathName.toString();
                                       
                                          }
                                          list.add(Integer.parseInt((col!=null?col.getText():null)));
                                          for(Object object : list_morecol)
                                          {
                                           
                                            CommonTree commonTree = (CommonTree) object;
                                              String colValue = commonTree.token.getText();
                                              list.add(Integer.parseInt(colValue));
                                       
                                          }
                                            Future<Map<Integer,Double>> value=complexTypeImpl.multipleregression((directory!=null?directory.getText():null)+completePath,list,Integer.parseInt((total_rows!=null?total_rows.getText():null)));
                                              try{
                                              outln(value.get().values());
                                              }
                                              catch(Exception e)
                                              {
                                               e.printStackTrace();
                                              }
                      

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
    // $ANTLR end "multiplereg"

    public static class forwardselection_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forwardselection"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:349:2: forwardselection : ( ^( TOK_FORWARDSELECTION col= INT (morecol+= INT )* ip= ID total_rows= INT levelofsignificance= DOUBLE ) | ^( TOK_FORWARDSELECTION col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT levelofsignificance= DOUBLE ) );
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
        CommonTree directory=null;
        CommonTree TOK_FORWARDSELECTION28=null;
        CommonTree TOK_FORWARDSELECTION29=null;
        CommonTree morecol=null;
        CommonTree filenameList=null;
        List list_morecol=null;
        List list_filenameList=null;

        CommonTree col_tree=null;
        CommonTree ip_tree=null;
        CommonTree total_rows_tree=null;
        CommonTree levelofsignificance_tree=null;
        CommonTree directory_tree=null;
        CommonTree TOK_FORWARDSELECTION28_tree=null;
        CommonTree TOK_FORWARDSELECTION29_tree=null;
        CommonTree morecol_tree=null;
        CommonTree filenameList_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:349:19: ( ^( TOK_FORWARDSELECTION col= INT (morecol+= INT )* ip= ID total_rows= INT levelofsignificance= DOUBLE ) | ^( TOK_FORWARDSELECTION col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT levelofsignificance= DOUBLE ) )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:349:21: ^( TOK_FORWARDSELECTION col= INT (morecol+= INT )* ip= ID total_rows= INT levelofsignificance= DOUBLE )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_FORWARDSELECTION28=(CommonTree)match(input,TOK_FORWARDSELECTION,FOLLOW_TOK_FORWARDSELECTION_in_forwardselection748); 
                    TOK_FORWARDSELECTION28_tree = (CommonTree)adaptor.dupNode(TOK_FORWARDSELECTION28);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_FORWARDSELECTION28_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    col=(CommonTree)match(input,INT,FOLLOW_INT_in_forwardselection752); 
                    col_tree = (CommonTree)adaptor.dupNode(col);

                    adaptor.addChild(root_1, col_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:349:59: (morecol+= INT )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==INT) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:349:59: morecol+= INT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    morecol=(CommonTree)match(input,INT,FOLLOW_INT_in_forwardselection756); 
                    	    morecol_tree = (CommonTree)adaptor.dupNode(morecol);

                    	    adaptor.addChild(root_1, morecol_tree);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    ip=(CommonTree)match(input,ID,FOLLOW_ID_in_forwardselection761); 
                    ip_tree = (CommonTree)adaptor.dupNode(ip);

                    adaptor.addChild(root_1, ip_tree);

                    _last = (CommonTree)input.LT(1);
                    total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_forwardselection765); 
                    total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

                    adaptor.addChild(root_1, total_rows_tree);

                    _last = (CommonTree)input.LT(1);
                    levelofsignificance=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_forwardselection769); 
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
                                   Map<Integer,Double> value = complexTypeImpl.forwardSelection((ip!=null?ip.getText():null),list,Integer.parseInt((total_rows!=null?total_rows.getText():null)),Double.parseDouble((levelofsignificance!=null?levelofsignificance.getText():null)));
                    try{
                                             outln(value.values());
                                             }
                                             catch(Exception e)
                                             {
                                              e.printStackTrace();
                                             }


                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:369:1: ^( TOK_FORWARDSELECTION col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT levelofsignificance= DOUBLE )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_FORWARDSELECTION29=(CommonTree)match(input,TOK_FORWARDSELECTION,FOLLOW_TOK_FORWARDSELECTION_in_forwardselection778); 
                    TOK_FORWARDSELECTION29_tree = (CommonTree)adaptor.dupNode(TOK_FORWARDSELECTION29);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_FORWARDSELECTION29_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    col=(CommonTree)match(input,INT,FOLLOW_INT_in_forwardselection782); 
                    col_tree = (CommonTree)adaptor.dupNode(col);

                    adaptor.addChild(root_1, col_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:369:39: (morecol+= INT )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==INT) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:369:39: morecol+= INT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    morecol=(CommonTree)match(input,INT,FOLLOW_INT_in_forwardselection786); 
                    	    morecol_tree = (CommonTree)adaptor.dupNode(morecol);

                    	    adaptor.addChild(root_1, morecol_tree);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    directory=(CommonTree)match(input,ID,FOLLOW_ID_in_forwardselection791); 
                    directory_tree = (CommonTree)adaptor.dupNode(directory);

                    adaptor.addChild(root_1, directory_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:369:59: (filenameList+= FORWARDSLASH filenameList+= ID )+
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
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:369:60: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_forwardselection796); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,ID,FOLLOW_ID_in_forwardselection800); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

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

                    _last = (CommonTree)input.LT(1);
                    total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_forwardselection807); 
                    total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

                    adaptor.addChild(root_1, total_rows_tree);

                    _last = (CommonTree)input.LT(1);
                    levelofsignificance=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_forwardselection811); 
                    levelofsignificance_tree = (CommonTree)adaptor.dupNode(levelofsignificance);

                    adaptor.addChild(root_1, levelofsignificance_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                             for(Object object : list_filenameList)
                                          {   CommonTree commonTree = (CommonTree) object;
                                              String filePathName = commonTree.token.getText();
                                              completePath+=filePathName.toString();
                                       
                                          }
                                               list.add(Integer.parseInt((col!=null?col.getText():null)));
                                          for(Object object : list_morecol)
                                          {
                                           
                                            CommonTree commonTree = (CommonTree) object;
                                              String colValue = commonTree.token.getText();
                                              list.add(Integer.parseInt(colValue));
                                       
                                          }
                                   Map<Integer,Double> value = complexTypeImpl.forwardSelection((directory!=null?directory.getText():null)+completePath,list,Integer.parseInt((total_rows!=null?total_rows.getText():null)),Double.parseDouble((levelofsignificance!=null?levelofsignificance.getText():null)));
                    try{
                                             outln(value.values());
                                             }
                                             catch(Exception e)
                                             {
                                              e.printStackTrace();
                                             }


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
    // $ANTLR end "forwardselection"

    public static class sort_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sort"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:396:1: sort : ( ^( TOK_SORT column_no= INT ip= ID ) | ^( TOK_SORT column_no= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ ) );
    public final NectarTree.sort_return sort() throws RecognitionException {
        NectarTree.sort_return retval = new NectarTree.sort_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree column_no=null;
        CommonTree ip=null;
        CommonTree directory=null;
        CommonTree TOK_SORT30=null;
        CommonTree TOK_SORT31=null;
        CommonTree filenameList=null;
        List list_filenameList=null;

        CommonTree column_no_tree=null;
        CommonTree ip_tree=null;
        CommonTree directory_tree=null;
        CommonTree TOK_SORT30_tree=null;
        CommonTree TOK_SORT31_tree=null;
        CommonTree filenameList_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:396:6: ( ^( TOK_SORT column_no= INT ip= ID ) | ^( TOK_SORT column_no= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==TOK_SORT) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==DOWN) ) {
                    int LA25_2 = input.LA(3);

                    if ( (LA25_2==INT) ) {
                        int LA25_3 = input.LA(4);

                        if ( (LA25_3==ID) ) {
                            int LA25_4 = input.LA(5);

                            if ( (LA25_4==UP) ) {
                                alt25=1;
                            }
                            else if ( (LA25_4==FORWARDSLASH) ) {
                                alt25=2;
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
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:396:7: ^( TOK_SORT column_no= INT ip= ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_SORT30=(CommonTree)match(input,TOK_SORT,FOLLOW_TOK_SORT_in_sort827); 
                    TOK_SORT30_tree = (CommonTree)adaptor.dupNode(TOK_SORT30);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_SORT30_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    column_no=(CommonTree)match(input,INT,FOLLOW_INT_in_sort831); 
                    column_no_tree = (CommonTree)adaptor.dupNode(column_no);

                    adaptor.addChild(root_1, column_no_tree);

                    _last = (CommonTree)input.LT(1);
                    ip=(CommonTree)match(input,ID,FOLLOW_ID_in_sort835); 
                    ip_tree = (CommonTree)adaptor.dupNode(ip);

                    adaptor.addChild(root_1, ip_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                                             primitiveImpl=PrimitiveTypeImplFactory.getInstance((ip!=null?ip.getText():null));
                                            Future<Double[]> value=primitiveImpl.sort((ip!=null?ip.getText():null),Integer.parseInt((column_no!=null?column_no.getText():null)));
                                                       try {Double[] sortArray=value.get(); 
                                                      outln("Sort:"); 
                                                      for(int i=0;i<sortArray.length;i++) {
                                                      outln(sortArray[i]);
                                                      }
                                                      }
                                                       catch(Exception e)
                                                       { 
                                                       outln("Sort Job terminated due to exception. Check nectar logs for more information");
                                                      }
                                            
                                           

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:413:1: ^( TOK_SORT column_no= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_SORT31=(CommonTree)match(input,TOK_SORT,FOLLOW_TOK_SORT_in_sort850); 
                    TOK_SORT31_tree = (CommonTree)adaptor.dupNode(TOK_SORT31);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_SORT31_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    column_no=(CommonTree)match(input,INT,FOLLOW_INT_in_sort854); 
                    column_no_tree = (CommonTree)adaptor.dupNode(column_no);

                    adaptor.addChild(root_1, column_no_tree);

                    _last = (CommonTree)input.LT(1);
                    directory=(CommonTree)match(input,ID,FOLLOW_ID_in_sort858); 
                    directory_tree = (CommonTree)adaptor.dupNode(directory);

                    adaptor.addChild(root_1, directory_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:413:39: (filenameList+= FORWARDSLASH filenameList+= ID )+
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
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:413:40: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_sort863); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,ID,FOLLOW_ID_in_sort867); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

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


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                          
                                         
                                          for(Object object : list_filenameList)
                                          {   CommonTree commonTree = (CommonTree) object;
                                              String filePathName = commonTree.token.getText();
                                              completePath+=filePathName.toString();
                                       
                                          }
                                            primitiveImpl=PrimitiveTypeImplFactory.getInstance((directory!=null?directory.getText():null)+completePath);
                                            Future<Double[]> value=primitiveImpl.sort((directory!=null?directory.getText():null)+completePath,Integer.parseInt((column_no!=null?column_no.getText():null)));
                                                       try {Double[] sortArray=value.get(); 
                                                      outln("Sort:"); 
                                                      for(int i=0;i<sortArray.length;i++) {
                                                      outln(sortArray[i]);
                                                      }
                                                      }
                                                       catch(Exception e)
                                                       { 
                                                       outln("Sort Job terminated due to exception. Check nectar logs for more information");
                                                      }
                                            
                                           

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
    // $ANTLR end "sort"

    public static class cov_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cov"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:438:2: cov : ( ^( TOK_COV column_x= INT column_y= INT ip= ID total_rows= INT ) | ^( TOK_COV column_x= INT column_y= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT ) );
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
        CommonTree directory=null;
        CommonTree TOK_COV32=null;
        CommonTree TOK_COV33=null;
        CommonTree filenameList=null;
        List list_filenameList=null;

        CommonTree column_x_tree=null;
        CommonTree column_y_tree=null;
        CommonTree ip_tree=null;
        CommonTree total_rows_tree=null;
        CommonTree directory_tree=null;
        CommonTree TOK_COV32_tree=null;
        CommonTree TOK_COV33_tree=null;
        CommonTree filenameList_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:438:6: ( ^( TOK_COV column_x= INT column_y= INT ip= ID total_rows= INT ) | ^( TOK_COV column_x= INT column_y= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==TOK_COV) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==DOWN) ) {
                    int LA27_2 = input.LA(3);

                    if ( (LA27_2==INT) ) {
                        int LA27_3 = input.LA(4);

                        if ( (LA27_3==INT) ) {
                            int LA27_4 = input.LA(5);

                            if ( (LA27_4==ID) ) {
                                int LA27_5 = input.LA(6);

                                if ( (LA27_5==INT) ) {
                                    alt27=1;
                                }
                                else if ( (LA27_5==FORWARDSLASH) ) {
                                    alt27=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 27, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 27, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:438:8: ^( TOK_COV column_x= INT column_y= INT ip= ID total_rows= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_COV32=(CommonTree)match(input,TOK_COV,FOLLOW_TOK_COV_in_cov913); 
                    TOK_COV32_tree = (CommonTree)adaptor.dupNode(TOK_COV32);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_COV32_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    column_x=(CommonTree)match(input,INT,FOLLOW_INT_in_cov917); 
                    column_x_tree = (CommonTree)adaptor.dupNode(column_x);

                    adaptor.addChild(root_1, column_x_tree);

                    _last = (CommonTree)input.LT(1);
                    column_y=(CommonTree)match(input,INT,FOLLOW_INT_in_cov921); 
                    column_y_tree = (CommonTree)adaptor.dupNode(column_y);

                    adaptor.addChild(root_1, column_y_tree);

                    _last = (CommonTree)input.LT(1);
                    ip=(CommonTree)match(input,ID,FOLLOW_ID_in_cov925); 
                    ip_tree = (CommonTree)adaptor.dupNode(ip);

                    adaptor.addChild(root_1, ip_tree);

                    _last = (CommonTree)input.LT(1);
                    total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_cov929); 
                    total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

                    adaptor.addChild(root_1, total_rows_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                Future<Double> value=complexTypeImpl.covariance((ip!=null?ip.getText():null),Integer.parseInt((column_x!=null?column_x.getText():null)),Integer.parseInt((column_y!=null?column_y.getText():null)),Integer.parseInt((total_rows!=null?total_rows.getText():null))); 
                                        try  {
                                                       outln("Covariance:"+value.get());  
                                               }
                                        catch(Exception e)
                                                       {
                                                       }
                             

                    }
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:448:2: ^( TOK_COV column_x= INT column_y= INT directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_COV33=(CommonTree)match(input,TOK_COV,FOLLOW_TOK_COV_in_cov938); 
                    TOK_COV33_tree = (CommonTree)adaptor.dupNode(TOK_COV33);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_COV33_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    column_x=(CommonTree)match(input,INT,FOLLOW_INT_in_cov942); 
                    column_x_tree = (CommonTree)adaptor.dupNode(column_x);

                    adaptor.addChild(root_1, column_x_tree);

                    _last = (CommonTree)input.LT(1);
                    column_y=(CommonTree)match(input,INT,FOLLOW_INT_in_cov946); 
                    column_y_tree = (CommonTree)adaptor.dupNode(column_y);

                    adaptor.addChild(root_1, column_y_tree);

                    _last = (CommonTree)input.LT(1);
                    directory=(CommonTree)match(input,ID,FOLLOW_ID_in_cov950); 
                    directory_tree = (CommonTree)adaptor.dupNode(directory);

                    adaptor.addChild(root_1, directory_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:448:51: (filenameList+= FORWARDSLASH filenameList+= ID )+
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
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:448:52: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_cov955); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,ID,FOLLOW_ID_in_cov959); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

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

                    _last = (CommonTree)input.LT(1);
                    total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_cov965); 
                    total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

                    adaptor.addChild(root_1, total_rows_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                 for(Object object : list_filenameList)
                                          {   CommonTree commonTree = (CommonTree) object;
                                              String filePathName = commonTree.token.getText();
                                              completePath+=filePathName.toString();
                                       
                                          }
                                Future<Double> value=complexTypeImpl.covariance((directory!=null?directory.getText():null)+completePath,Integer.parseInt((column_x!=null?column_x.getText():null)),Integer.parseInt((column_y!=null?column_y.getText():null)),Integer.parseInt((total_rows!=null?total_rows.getText():null))); 
                                        try  {
                                                       outln("Covariance:"+value.get());  
                                               }
                                        catch(Exception e)
                                                       {
                                                       }
                             

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
    // $ANTLR end "cov"

    public static class covmatrix_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "covmatrix"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:465:1: covmatrix : ( ^( TOK_COVMATRIX col= INT (morecol+= INT )* ip= ID total_rows= INT ) | ^( TOK_COVMATRIX col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT ) );
    public final NectarTree.covmatrix_return covmatrix() throws RecognitionException {
        NectarTree.covmatrix_return retval = new NectarTree.covmatrix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree col=null;
        CommonTree ip=null;
        CommonTree total_rows=null;
        CommonTree directory=null;
        CommonTree TOK_COVMATRIX34=null;
        CommonTree TOK_COVMATRIX35=null;
        CommonTree morecol=null;
        CommonTree filenameList=null;
        List list_morecol=null;
        List list_filenameList=null;

        CommonTree col_tree=null;
        CommonTree ip_tree=null;
        CommonTree total_rows_tree=null;
        CommonTree directory_tree=null;
        CommonTree TOK_COVMATRIX34_tree=null;
        CommonTree TOK_COVMATRIX35_tree=null;
        CommonTree morecol_tree=null;
        CommonTree filenameList_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:465:11: ( ^( TOK_COVMATRIX col= INT (morecol+= INT )* ip= ID total_rows= INT ) | ^( TOK_COVMATRIX col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT ) )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:465:13: ^( TOK_COVMATRIX col= INT (morecol+= INT )* ip= ID total_rows= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_COVMATRIX34=(CommonTree)match(input,TOK_COVMATRIX,FOLLOW_TOK_COVMATRIX_in_covmatrix1004); 
                    TOK_COVMATRIX34_tree = (CommonTree)adaptor.dupNode(TOK_COVMATRIX34);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_COVMATRIX34_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    col=(CommonTree)match(input,INT,FOLLOW_INT_in_covmatrix1009); 
                    col_tree = (CommonTree)adaptor.dupNode(col);

                    adaptor.addChild(root_1, col_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:465:45: (morecol+= INT )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==INT) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:465:45: morecol+= INT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    morecol=(CommonTree)match(input,INT,FOLLOW_INT_in_covmatrix1013); 
                    	    morecol_tree = (CommonTree)adaptor.dupNode(morecol);

                    	    adaptor.addChild(root_1, morecol_tree);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    ip=(CommonTree)match(input,ID,FOLLOW_ID_in_covmatrix1018); 
                    ip_tree = (CommonTree)adaptor.dupNode(ip);

                    adaptor.addChild(root_1, ip_tree);

                    _last = (CommonTree)input.LT(1);
                    total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_covmatrix1022); 
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
                                                      outln("Covariance matrix:"); 
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
                    break;
                case 2 :
                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:496:2: ^( TOK_COVMATRIX col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TOK_COVMATRIX35=(CommonTree)match(input,TOK_COVMATRIX,FOLLOW_TOK_COVMATRIX_in_covmatrix1032); 
                    TOK_COVMATRIX35_tree = (CommonTree)adaptor.dupNode(TOK_COVMATRIX35);

                    root_1 = (CommonTree)adaptor.becomeRoot(TOK_COVMATRIX35_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    col=(CommonTree)match(input,INT,FOLLOW_INT_in_covmatrix1037); 
                    col_tree = (CommonTree)adaptor.dupNode(col);

                    adaptor.addChild(root_1, col_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:496:34: (morecol+= INT )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==INT) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:496:34: morecol+= INT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    morecol=(CommonTree)match(input,INT,FOLLOW_INT_in_covmatrix1041); 
                    	    morecol_tree = (CommonTree)adaptor.dupNode(morecol);

                    	    adaptor.addChild(root_1, morecol_tree);

                    	    if (list_morecol==null) list_morecol=new ArrayList();
                    	    list_morecol.add(morecol);


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    directory=(CommonTree)match(input,ID,FOLLOW_ID_in_covmatrix1046); 
                    directory_tree = (CommonTree)adaptor.dupNode(directory);

                    adaptor.addChild(root_1, directory_tree);

                    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:496:54: (filenameList+= FORWARDSLASH filenameList+= ID )+
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
                    	    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:496:55: filenameList+= FORWARDSLASH filenameList+= ID
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,FORWARDSLASH,FOLLOW_FORWARDSLASH_in_covmatrix1051); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

                    	    if (list_filenameList==null) list_filenameList=new ArrayList();
                    	    list_filenameList.add(filenameList);

                    	    _last = (CommonTree)input.LT(1);
                    	    filenameList=(CommonTree)match(input,ID,FOLLOW_ID_in_covmatrix1055); 
                    	    filenameList_tree = (CommonTree)adaptor.dupNode(filenameList);

                    	    adaptor.addChild(root_1, filenameList_tree);

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

                    _last = (CommonTree)input.LT(1);
                    total_rows=(CommonTree)match(input,INT,FOLLOW_INT_in_covmatrix1061); 
                    total_rows_tree = (CommonTree)adaptor.dupNode(total_rows);

                    adaptor.addChild(root_1, total_rows_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                                             for(Object object : list_filenameList)
                                          {   CommonTree commonTree = (CommonTree) object;
                                              String filePathName = commonTree.token.getText();
                                              completePath+=filePathName.toString();
                                       
                                          }
                                             list.add(Integer.parseInt((col!=null?col.getText():null)));
                                          for(Object object : list_morecol)
                                          {
                                           
                                            CommonTree commonTree = (CommonTree) object;
                                              String colValue = commonTree.token.getText();
                                              list.add(Integer.parseInt(colValue));
                                       
                                          }
                                          
                                            Future<Double[][]> value=complexTypeImpl.covariancematrix((directory!=null?directory.getText():null)+completePath,list,Integer.parseInt((total_rows!=null?total_rows.getText():null))); 
                                           try 
                                                  {
                                                      Double[][] matrix=value.get(); 
                                                      outln("Covariance matrix:"); 
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
    // $ANTLR end "covmatrix"

    public static class help_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "help"
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:536:1: help : HELP terminator ;
    public final NectarTree.help_return help() throws RecognitionException {
        NectarTree.help_return retval = new NectarTree.help_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree HELP36=null;
        NectarTree.terminator_return terminator37 = null;


        CommonTree HELP36_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:536:6: ( HELP terminator )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:536:8: HELP terminator
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            HELP36=(CommonTree)match(input,HELP,FOLLOW_HELP_in_help1089); 
            HELP36_tree = (CommonTree)adaptor.dupNode(HELP36);

            adaptor.addChild(root_0, HELP36_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_terminator_in_help1091);
            terminator37=terminator();

            state._fsp--;

            adaptor.addChild(root_0, terminator37.getTree());

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
    // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:547:1: terminator : ( NEWLINE | EOF );
    public final NectarTree.terminator_return terminator() throws RecognitionException {
        NectarTree.terminator_return retval = new NectarTree.terminator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set38=null;

        CommonTree set38_tree=null;

        try {
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:547:11: ( NEWLINE | EOF )
            // com/zinnia/nectar/regression/antlr/language/parser/NectarTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set38=(CommonTree)input.LT(1);
            if ( input.LA(1)==EOF||input.LA(1)==NEWLINE ) {
                input.consume();

                set38_tree = (CommonTree)adaptor.dupNode(set38);

                adaptor.addChild(root_0, set38_tree);

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


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA15_eotS =
        "\10\uffff";
    static final String DFA15_eofS =
        "\10\uffff";
    static final String DFA15_minS =
        "\1\45\1\2\1\31\2\30\1\6\2\uffff";
    static final String DFA15_maxS =
        "\1\45\1\2\4\31\2\uffff";
    static final String DFA15_acceptS =
        "\6\uffff\1\1\1\2";
    static final String DFA15_specialS =
        "\10\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\1\4",
            "\1\5\1\4",
            "\1\7\22\uffff\1\6",
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
            return "236:1: correlationmatrix : ( ^( TOK_CORRMATRIX col= INT (morecol+= INT )* ip= ID total_rows= INT ) | ^( TOK_CORRMATRIX col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT ) );";
        }
    }
    static final String DFA19_eotS =
        "\10\uffff";
    static final String DFA19_eofS =
        "\10\uffff";
    static final String DFA19_minS =
        "\1\46\1\2\1\31\2\30\1\6\2\uffff";
    static final String DFA19_maxS =
        "\1\46\1\2\4\31\2\uffff";
    static final String DFA19_acceptS =
        "\6\uffff\1\1\1\2";
    static final String DFA19_specialS =
        "\10\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\1\4",
            "\1\5\1\4",
            "\1\7\22\uffff\1\6",
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
            return "301:1: multiplereg : ( ^( TOK_MULTIPLEREG col= INT (morecol+= INT )* ip= ID total_rows= INT ) | ^( TOK_MULTIPLEREG col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT ) );";
        }
    }
    static final String DFA23_eotS =
        "\10\uffff";
    static final String DFA23_eofS =
        "\10\uffff";
    static final String DFA23_minS =
        "\1\47\1\2\1\31\2\30\1\6\2\uffff";
    static final String DFA23_maxS =
        "\1\47\1\2\4\31\2\uffff";
    static final String DFA23_acceptS =
        "\6\uffff\1\1\1\2";
    static final String DFA23_specialS =
        "\10\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\1\4",
            "\1\5\1\4",
            "\1\7\22\uffff\1\6",
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
            return "349:2: forwardselection : ( ^( TOK_FORWARDSELECTION col= INT (morecol+= INT )* ip= ID total_rows= INT levelofsignificance= DOUBLE ) | ^( TOK_FORWARDSELECTION col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT levelofsignificance= DOUBLE ) );";
        }
    }
    static final String DFA31_eotS =
        "\10\uffff";
    static final String DFA31_eofS =
        "\10\uffff";
    static final String DFA31_minS =
        "\1\52\1\2\1\31\2\30\1\6\2\uffff";
    static final String DFA31_maxS =
        "\1\52\1\2\4\31\2\uffff";
    static final String DFA31_acceptS =
        "\6\uffff\1\1\1\2";
    static final String DFA31_specialS =
        "\10\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\1\4",
            "\1\5\1\4",
            "\1\7\22\uffff\1\6",
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
            return "465:1: covmatrix : ( ^( TOK_COVMATRIX col= INT (morecol+= INT )* ip= ID total_rows= INT ) | ^( TOK_COVMATRIX col= INT (morecol+= INT )* directory= ID (filenameList+= FORWARDSLASH filenameList+= ID )+ total_rows= INT ) );";
        }
    }
 

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
    public static final BitSet FOLLOW_INT_in_sigmax203 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmax207 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_SIGMAX_in_sigmax223 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_sigmax227 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmax231 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_sigmax236 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmax240 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_TOK_SIGMAXY_in_sigmaxy264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_sigmaxy268 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_sigmaxy272 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmaxy276 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_SIGMAXY_in_sigmaxy296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_sigmaxy300 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_sigmaxy304 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmaxy308 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_sigmaxy313 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmaxy317 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_TOK_SIGMAXSQUARE_in_sigmaxsquare356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_sigmaxsquare360 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmaxsquare364 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_SIGMAXSQUARE_in_sigmaxsquare382 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_sigmaxsquare386 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmaxsquare390 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_sigmaxsquare395 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sigmaxsquare399 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_TOK_MEAN_in_mean439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_mean443 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_mean447 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_mean451 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_MEAN_in_mean461 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_mean465 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_mean469 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_mean474 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_mean478 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_INT_in_mean484 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_CORR_in_correlation514 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_correlation518 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlation522 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_correlation526 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlation530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_CORR_in_correlation539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_correlation543 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlation547 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_correlation551 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_correlation556 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_correlation560 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_INT_in_correlation566 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_CORRMATRIX_in_correlationmatrix582 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix586 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix590 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ID_in_correlationmatrix595 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_CORRMATRIX_in_correlationmatrix609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix613 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix617 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ID_in_correlationmatrix622 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_correlationmatrix627 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_correlationmatrix631 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_INT_in_correlationmatrix637 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_MULTIPLEREG_in_multiplereg656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_multiplereg660 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_INT_in_multiplereg664 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ID_in_multiplereg669 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_multiplereg673 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_MULTIPLEREG_in_multiplereg692 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_multiplereg696 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_INT_in_multiplereg700 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ID_in_multiplereg705 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_multiplereg710 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_multiplereg714 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_INT_in_multiplereg720 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_FORWARDSELECTION_in_forwardselection748 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_forwardselection752 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_INT_in_forwardselection756 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ID_in_forwardselection761 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_forwardselection765 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DOUBLE_in_forwardselection769 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_FORWARDSELECTION_in_forwardselection778 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_forwardselection782 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_INT_in_forwardselection786 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ID_in_forwardselection791 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_forwardselection796 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_forwardselection800 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_INT_in_forwardselection807 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DOUBLE_in_forwardselection811 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_SORT_in_sort827 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_sort831 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sort835 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_SORT_in_sort850 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_sort854 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sort858 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_sort863 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_sort867 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_TOK_COV_in_cov913 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_cov917 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_cov921 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_cov925 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_cov929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_COV_in_cov938 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_cov942 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_cov946 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_cov950 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_cov955 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_cov959 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_INT_in_cov965 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_COVMATRIX_in_covmatrix1004 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_covmatrix1009 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_INT_in_covmatrix1013 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ID_in_covmatrix1018 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_covmatrix1022 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOK_COVMATRIX_in_covmatrix1032 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_covmatrix1037 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_INT_in_covmatrix1041 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ID_in_covmatrix1046 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FORWARDSLASH_in_covmatrix1051 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_covmatrix1055 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_INT_in_covmatrix1061 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HELP_in_help1089 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_terminator_in_help1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_terminator0 = new BitSet(new long[]{0x0000000000000002L});

}