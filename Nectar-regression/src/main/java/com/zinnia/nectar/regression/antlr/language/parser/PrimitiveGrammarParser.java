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

// $ANTLR 3.3 Nov 30, 2010 12:45:30 PrimitiveGrammar.g 2011-05-30 17:34:26



package com.zinnia.nectar.regression.antlr.language.parser;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.zinnia.nectar.regression.language.complex.impl.ComplexTypeImpl;
import com.zinnia.nectar.regression.language.primitive.IPrimitiveType;
import com.zinnia.nectar.regression.language.primitive.PrimitiveTypeImplFactory;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PrimitiveGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "DOUBLE", "ID", "WS", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'sigmax'", "'('", "')'", "'<<'", "'sigmaxsquare'", "'sigmaxy'", "'mean'", "'corr'", "'corrmatrix'", "','", "'multiplereg'", "'forwardselection'", "'>>'", "'.'"
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



	// $ANTLR start "start"
	// PrimitiveGrammar.g:37:1: start : ( ( 'sigmax' ) '(' INT ')' '<<' input | ( 'sigmaxsquare' ) '(' INT ')' '<<' input | ( 'sigmaxy' ) '(' INT xypart | ( 'mean' ) '(' INT ')' idpart | ( 'corr' ) '(' INT xypart '(' npart ')' | ( 'corrmatrix' ) '(' INT ',' ofpart | ( 'multiplereg' ) '(' INT ',' mulregpart | ( 'forwardselection' ) '(' INT ',' forwardpart );
	public final void start() throws RecognitionException {
		Token INT1=null;
		Token INT2=null;
		Token INT3=null;
		Token INT4=null;
		Token INT5=null;
		Token INT6=null;
		Token INT7=null;
		Token INT8=null;

		try {
			// PrimitiveGrammar.g:37:8: ( ( 'sigmax' ) '(' INT ')' '<<' input | ( 'sigmaxsquare' ) '(' INT ')' '<<' input | ( 'sigmaxy' ) '(' INT xypart | ( 'mean' ) '(' INT ')' idpart | ( 'corr' ) '(' INT xypart '(' npart ')' | ( 'corrmatrix' ) '(' INT ',' ofpart | ( 'multiplereg' ) '(' INT ',' mulregpart | ( 'forwardselection' ) '(' INT ',' forwardpart )
			int alt1=8;
			switch ( input.LA(1) ) {
			case 13:
			{
				alt1=1;
			}
			break;
			case 17:
			{
				alt1=2;
			}
			break;
			case 18:
			{
				alt1=3;
			}
			break;
			case 19:
			{
				alt1=4;
			}
			break;
			case 20:
			{
				alt1=5;
			}
			break;
			case 21:
			{
				alt1=6;
			}
			break;
			case 23:
			{
				alt1=7;
			}
			break;
			case 24:
			{
				alt1=8;
			}
			break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);

				throw nvae;
			}

			switch (alt1) {
			case 1 :
				// PrimitiveGrammar.g:37:10: ( 'sigmax' ) '(' INT ')' '<<' input
			{
				// PrimitiveGrammar.g:37:10: ( 'sigmax' )
				// PrimitiveGrammar.g:37:11: 'sigmax'
				{
					match(input,13,FOLLOW_13_in_start38); 

				}

				match(input,14,FOLLOW_14_in_start41); 
				INT1=(Token)match(input,INT,FOLLOW_INT_in_start43); 
				match(input,15,FOLLOW_15_in_start45); 
				match(input,16,FOLLOW_16_in_start47); 
				pushFollow(FOLLOW_input_in_start49);
				input();

				state._fsp--;

				n=Integer.parseInt((INT1!=null?INT1.getText():null));



				primitiveImpl=PrimitiveTypeImplFactory.getInstance(ip);
				Future<Double> value=primitiveImpl.sigmax(ip,n);

				try
				{
					System.out.println("Sigmax is "+value.get());
				}
				catch(Exception e)
				{
				}


			}
			break;
			case 2 :
				// PrimitiveGrammar.g:53:5: ( 'sigmaxsquare' ) '(' INT ')' '<<' input
			{
				// PrimitiveGrammar.g:53:5: ( 'sigmaxsquare' )
				// PrimitiveGrammar.g:53:6: 'sigmaxsquare'
				{
					match(input,17,FOLLOW_17_in_start68); 

				}

				match(input,14,FOLLOW_14_in_start71); 
				INT2=(Token)match(input,INT,FOLLOW_INT_in_start73); 
				match(input,15,FOLLOW_15_in_start75); 
				match(input,16,FOLLOW_16_in_start77); 
				pushFollow(FOLLOW_input_in_start79);
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
			case 3 :
				// PrimitiveGrammar.g:67:5: ( 'sigmaxy' ) '(' INT xypart
			{
				// PrimitiveGrammar.g:67:5: ( 'sigmaxy' )
				// PrimitiveGrammar.g:67:6: 'sigmaxy'
				{
					match(input,18,FOLLOW_18_in_start98); 

				}

				match(input,14,FOLLOW_14_in_start101); 
				INT3=(Token)match(input,INT,FOLLOW_INT_in_start103); 
				x=Integer.parseInt((INT3!=null?INT3.getText():null));
				pushFollow(FOLLOW_xypart_in_start114);
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
			case 4 :
				// PrimitiveGrammar.g:80:5: ( 'mean' ) '(' INT ')' idpart
			{
				// PrimitiveGrammar.g:80:5: ( 'mean' )
				// PrimitiveGrammar.g:80:6: 'mean'
				{
					match(input,19,FOLLOW_19_in_start136); 

				}

				match(input,14,FOLLOW_14_in_start139); 
				INT4=(Token)match(input,INT,FOLLOW_INT_in_start141); 
				cn=Integer.parseInt((INT4!=null?INT4.getText():null));
				match(input,15,FOLLOW_15_in_start155); 
				pushFollow(FOLLOW_idpart_in_start164);
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
			case 5 :
				// PrimitiveGrammar.g:94:6: ( 'corr' ) '(' INT xypart '(' npart ')'
			{
				// PrimitiveGrammar.g:94:6: ( 'corr' )
				// PrimitiveGrammar.g:94:8: 'corr'
				{
					match(input,20,FOLLOW_20_in_start199); 

				}

				match(input,14,FOLLOW_14_in_start202); 
				INT5=(Token)match(input,INT,FOLLOW_INT_in_start204); 
				x=Integer.parseInt((INT5!=null?INT5.getText():null));
				pushFollow(FOLLOW_xypart_in_start215);
				xypart();

				state._fsp--;

				match(input,14,FOLLOW_14_in_start225); 
				pushFollow(FOLLOW_npart_in_start227);
				npart();

				state._fsp--;

				match(input,15,FOLLOW_15_in_start229); 



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
			case 6 :
				// PrimitiveGrammar.g:111:10: ( 'corrmatrix' ) '(' INT ',' ofpart
			{
				// PrimitiveGrammar.g:111:10: ( 'corrmatrix' )
				// PrimitiveGrammar.g:111:12: 'corrmatrix'
				{
					match(input,21,FOLLOW_21_in_start305); 

				}

				match(input,14,FOLLOW_14_in_start330); 
				INT6=(Token)match(input,INT,FOLLOW_INT_in_start334); 
				list.add(Integer.parseInt((INT6!=null?INT6.getText():null)));   
				match(input,22,FOLLOW_22_in_start363); 
				pushFollow(FOLLOW_ofpart_in_start380);
				ofpart();

				state._fsp--;


			}
			break;
			case 7 :
				// PrimitiveGrammar.g:120:11: ( 'multiplereg' ) '(' INT ',' mulregpart
			{
				// PrimitiveGrammar.g:120:11: ( 'multiplereg' )
				// PrimitiveGrammar.g:120:13: 'multiplereg'
				{
					match(input,23,FOLLOW_23_in_start412); 

				}

				match(input,14,FOLLOW_14_in_start439); 
				INT7=(Token)match(input,INT,FOLLOW_INT_in_start442); 
				list.add(Integer.parseInt((INT7!=null?INT7.getText():null)));   
				match(input,22,FOLLOW_22_in_start471); 
				pushFollow(FOLLOW_mulregpart_in_start492);
				try {
					mulregpart();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				state._fsp--;


			}
			break;
			case 8 :
				// PrimitiveGrammar.g:128:12: ( 'forwardselection' ) '(' INT ',' forwardpart
			{
				// PrimitiveGrammar.g:128:12: ( 'forwardselection' )
				// PrimitiveGrammar.g:128:14: 'forwardselection'
				{
					match(input,24,FOLLOW_24_in_start517); 

				}

				match(input,14,FOLLOW_14_in_start530); 
				INT8=(Token)match(input,INT,FOLLOW_INT_in_start532); 
				list.add(Integer.parseInt((INT8!=null?INT8.getText():null)));   
				match(input,22,FOLLOW_22_in_start553); 
				pushFollow(FOLLOW_forwardpart_in_start564);
				forwardpart();

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


	// $ANTLR start "ofpart"
	// PrimitiveGrammar.g:136:4: ofpart : INT morecol idpart ;
	public final void ofpart() throws RecognitionException {
		Token INT9=null;

		try {
			// PrimitiveGrammar.g:136:11: ( INT morecol idpart )
			// PrimitiveGrammar.g:136:18: INT morecol idpart
			{
				INT9=(Token)match(input,INT,FOLLOW_INT_in_ofpart616); 
				list.add(Integer.parseInt((INT9!=null?INT9.getText():null)));
				pushFollow(FOLLOW_morecol_in_ofpart641);
				morecol();

				state._fsp--;

				pushFollow(FOLLOW_idpart_in_ofpart663);
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
	// PrimitiveGrammar.g:168:1: mulregpart : INT morecol idpart ;
	public final void mulregpart() throws RecognitionException, InterruptedException, ExecutionException {
		Token INT10=null;

		try {
			// PrimitiveGrammar.g:168:12: ( INT morecol idpart )
			// PrimitiveGrammar.g:168:17: INT morecol idpart
			{
				INT10=(Token)match(input,INT,FOLLOW_INT_in_mulregpart720); 
				list.add(Integer.parseInt((INT10!=null?INT10.getText():null)));
				pushFollow(FOLLOW_morecol_in_mulregpart745);
				morecol();

				state._fsp--;

				pushFollow(FOLLOW_idpart_in_mulregpart767);
				idpart();

				state._fsp--;





				Future<Map<Integer,Double>> value=complexTypeImpl.multipleregression(ip,list,n);
				Map<Integer,Double> values = value.get();
				try{
					System.out.println("Regression Equation is ");
					System.out.println("Constant = "+values.get(0));
					for( int i=0;i<list.size()-1;i++)
					{
						int column = list.get(i);
						System.out.println(column+" variable value = "+values.get(column));

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
	// $ANTLR end "mulregpart"


	// $ANTLR start "forwardpart"
	// PrimitiveGrammar.g:189:1: forwardpart : INT morecol levelofsignificance ;
	public final void forwardpart() throws RecognitionException {
		Token INT11=null;

		try {
			// PrimitiveGrammar.g:189:13: ( INT morecol levelofsignificance )
			// PrimitiveGrammar.g:189:18: INT morecol levelofsignificance
			{
				INT11=(Token)match(input,INT,FOLLOW_INT_in_forwardpart822); 
				list.add(Integer.parseInt((INT11!=null?INT11.getText():null)));
				pushFollow(FOLLOW_morecol_in_forwardpart857);
				morecol();

				state._fsp--;

				pushFollow(FOLLOW_levelofsignificance_in_forwardpart889);
				levelofsignificance();

				state._fsp--;






				Map<Integer,Double> values = complexTypeImpl.forwardSelection(ip,list,n,level);

				System.out.println(" After forward selection ...Regression Equation is ");
				System.out.println("Constant = "+values.get(0));
				for( int i=0;i<list.size()-1;i++)
				{
					int column = list.get(i);
					System.out.println(column+" variable value = "+values.get(column));

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
	// $ANTLR end "forwardpart"


	// $ANTLR start "morecol"
	// PrimitiveGrammar.g:203:1: morecol : ( ')' | ',' INT morecol );
	public final void morecol() throws RecognitionException {
		Token INT12=null;

		try {
			// PrimitiveGrammar.g:203:10: ( ')' | ',' INT morecol )
			int alt2=2;
			int LA2_0 = input.LA(1);

			if ( (LA2_0==15) ) {
				alt2=1;
			}
			else if ( (LA2_0==22) ) {
				alt2=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);

				throw nvae;
			}
			switch (alt2) {
			case 1 :
				// PrimitiveGrammar.g:203:12: ')'
			{
				match(input,15,FOLLOW_15_in_morecol947); 

			}
			break;
			case 2 :
				// PrimitiveGrammar.g:207:5: ',' INT morecol
			{
				match(input,22,FOLLOW_22_in_morecol969); 
				INT12=(Token)match(input,INT,FOLLOW_INT_in_morecol980); 
				list.add(Integer.parseInt((INT12!=null?INT12.getText():null))); 
				pushFollow(FOLLOW_morecol_in_morecol995);
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
	// PrimitiveGrammar.g:215:1: xypart : ',' INT ')' '<<' input ;
	public final void xypart() throws RecognitionException {
		Token INT13=null;

		try {
			// PrimitiveGrammar.g:215:9: ( ',' INT ')' '<<' input )
			// PrimitiveGrammar.g:215:12: ',' INT ')' '<<' input
			{
				match(input,22,FOLLOW_22_in_xypart1023); 
				INT13=(Token)match(input,INT,FOLLOW_INT_in_xypart1025); 
				match(input,15,FOLLOW_15_in_xypart1028); 
				match(input,16,FOLLOW_16_in_xypart1030); 
				pushFollow(FOLLOW_input_in_xypart1032);
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
	// PrimitiveGrammar.g:221:1: npart : INT ;
	public final void npart() throws RecognitionException {
		Token INT14=null;

		try {
			// PrimitiveGrammar.g:221:7: ( INT )
			// PrimitiveGrammar.g:221:9: INT
			{
				INT14=(Token)match(input,INT,FOLLOW_INT_in_npart1049); 
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
	// PrimitiveGrammar.g:225:1: idpart : '<<' input '(' INT ')' ;
	public final void idpart() throws RecognitionException {
		Token INT15=null;

		try {
			// PrimitiveGrammar.g:225:8: ( '<<' input '(' INT ')' )
			// PrimitiveGrammar.g:225:11: '<<' input '(' INT ')'
			{
				match(input,16,FOLLOW_16_in_idpart1087); 
				pushFollow(FOLLOW_input_in_idpart1089);
				input();

				state._fsp--;

				match(input,14,FOLLOW_14_in_idpart1092); 
				INT15=(Token)match(input,INT,FOLLOW_INT_in_idpart1094); 
				match(input,15,FOLLOW_15_in_idpart1096); 
				n=Integer.parseInt((INT15!=null?INT15.getText():null));
				//  



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
	// PrimitiveGrammar.g:231:1: levelofsignificance : '<<' input '(' INT ',' DOUBLE ')' ;
	public final void levelofsignificance() throws RecognitionException {
		Token INT16=null;
		Token DOUBLE17=null;

		try {
			// PrimitiveGrammar.g:231:21: ( '<<' input '(' INT ',' DOUBLE ')' )
			// PrimitiveGrammar.g:231:23: '<<' input '(' INT ',' DOUBLE ')'
			{
				match(input,16,FOLLOW_16_in_levelofsignificance1117); 
				pushFollow(FOLLOW_input_in_levelofsignificance1119);
				input();

				state._fsp--;

				match(input,14,FOLLOW_14_in_levelofsignificance1122); 
				INT16=(Token)match(input,INT,FOLLOW_INT_in_levelofsignificance1124); 
				match(input,22,FOLLOW_22_in_levelofsignificance1127); 
				n=Integer.parseInt((INT16!=null?INT16.getText():null)); 
				DOUBLE17=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_levelofsignificance1141); 
				match(input,15,FOLLOW_15_in_levelofsignificance1144); 
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
	// PrimitiveGrammar.g:235:1: out : '>>' ID ;
	public final void out() throws RecognitionException {
		Token ID18=null;

		try {
			// PrimitiveGrammar.g:235:6: ( '>>' ID )
			// PrimitiveGrammar.g:235:8: '>>' ID
			{
				match(input,25,FOLLOW_25_in_out1164); 
				ID18=(Token)match(input,ID,FOLLOW_ID_in_out1167); 
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
	// PrimitiveGrammar.g:241:1: ext : ID ;
	public final void ext() throws RecognitionException {
		Token ID19=null;

		try {
			// PrimitiveGrammar.g:241:6: ( ID )
			// PrimitiveGrammar.g:241:10: ID
			{
				ID19=(Token)match(input,ID,FOLLOW_ID_in_ext1191); 
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
	// PrimitiveGrammar.g:245:1: input : ( ID | ID '.' ext );
	public final void input() throws RecognitionException {
		Token ID20=null;
		Token ID21=null;

		try {
			// PrimitiveGrammar.g:245:9: ( ID | ID '.' ext )
			int alt3=2;
			int LA3_0 = input.LA(1);

			if ( (LA3_0==ID) ) {
				int LA3_1 = input.LA(2);

				if ( (LA3_1==26) ) {
					alt3=2;
				}
				else if ( (LA3_1==EOF||LA3_1==14) ) {
					alt3=1;
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
				// PrimitiveGrammar.g:245:11: ID
			{
				ID20=(Token)match(input,ID,FOLLOW_ID_in_input1214); 
				ip=(ID20!=null?ID20.getText():null);

			}
			break;
			case 2 :
				// PrimitiveGrammar.g:247:4: ID '.' ext
			{
				ID21=(Token)match(input,ID,FOLLOW_ID_in_input1230); 
				match(input,26,FOLLOW_26_in_input1234); 
				ip=(ID21!=null?ID21.getText():null);
				pushFollow(FOLLOW_ext_in_input1246);
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




	public static final BitSet FOLLOW_13_in_start38 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_start41 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_INT_in_start43 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_start45 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_start47 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_input_in_start49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_start68 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_start71 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_INT_in_start73 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_start75 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_start77 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_input_in_start79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_start98 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_start101 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_INT_in_start103 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_xypart_in_start114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_start136 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_start139 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_INT_in_start141 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_start155 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_idpart_in_start164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_start199 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_start202 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_INT_in_start204 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_xypart_in_start215 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_start225 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_npart_in_start227 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_start229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_start305 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_start330 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_INT_in_start334 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_start363 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ofpart_in_start380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_start412 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_start439 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_INT_in_start442 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_start471 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_mulregpart_in_start492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_start517 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_start530 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_INT_in_start532 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_start553 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_forwardpart_in_start564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_ofpart616 = new BitSet(new long[]{0x0000000000408000L});
	public static final BitSet FOLLOW_morecol_in_ofpart641 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_idpart_in_ofpart663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_mulregpart720 = new BitSet(new long[]{0x0000000000408000L});
	public static final BitSet FOLLOW_morecol_in_mulregpart745 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_idpart_in_mulregpart767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_forwardpart822 = new BitSet(new long[]{0x0000000000408000L});
	public static final BitSet FOLLOW_morecol_in_forwardpart857 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_levelofsignificance_in_forwardpart889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_morecol947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_morecol969 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_INT_in_morecol980 = new BitSet(new long[]{0x0000000000408000L});
	public static final BitSet FOLLOW_morecol_in_morecol995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_xypart1023 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_INT_in_xypart1025 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_xypart1028 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_xypart1030 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_input_in_xypart1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_npart1049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_idpart1087 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_input_in_idpart1089 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_idpart1092 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_INT_in_idpart1094 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_idpart1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_levelofsignificance1117 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_input_in_levelofsignificance1119 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_levelofsignificance1122 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_INT_in_levelofsignificance1124 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_levelofsignificance1127 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DOUBLE_in_levelofsignificance1141 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_levelofsignificance1144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_out1164 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_out1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ext1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_input1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_input1230 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_input1234 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ext_in_input1246 = new BitSet(new long[]{0x0000000000000002L});

}
