// $ANTLR 3.5.1 /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g 2019-11-05 14:14:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class algolFParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ESC_SEQ", "EXPONENT", 
		"FLOAT", "HEX_DIGIT", "ID", "IF", "INT", "OCTAL_ESC", "STRING", "THEN", 
		"UNICODE_ESC", "'('", "')'", "'+'", "','", "'-'", "':'", "':='", "';'", 
		"'ARRAY'", "'BEGIN'", "'BOOLEAN'", "'DO'", "'ELSE'", "'END'", "'FOR'", 
		"'GOTO'", "'IF'", "'INTEGER'", "'LABEL'", "'OWN'", "'POW'", "'PROCEDURE'", 
		"'REAL'", "'STEP'", "'STRING'", "'SWITCH'", "'THEN'", "'UNTIL'", "'VALUE'", 
		"'WHILE'", "'Y'", "'['", "']'"
	};
	public static final int EOF=-1;
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
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int COMMENT=4;
	public static final int ESC_SEQ=5;
	public static final int EXPONENT=6;
	public static final int FLOAT=7;
	public static final int HEX_DIGIT=8;
	public static final int ID=9;
	public static final int IF=10;
	public static final int INT=11;
	public static final int OCTAL_ESC=12;
	public static final int STRING=13;
	public static final int THEN=14;
	public static final int UNICODE_ESC=15;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public algolFParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public algolFParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return algolFParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:21:1: prog : prog1 ;
	public final algolFParser.prog_return prog() throws RecognitionException {
		algolFParser.prog_return retval = new algolFParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope prog11 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:21:6: ( prog1 )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:21:8: prog1
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_prog1_in_prog61);
			prog11=prog1();
			state._fsp--;

			adaptor.addChild(root_0, prog11.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:24:1: expression : ( simpleAR | ifclause ei );
	public final algolFParser.expression_return expression() throws RecognitionException {
		algolFParser.expression_return retval = new algolFParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope simpleAR2 =null;
		ParserRuleReturnScope ifclause3 =null;
		ParserRuleReturnScope ei4 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:25:2: ( simpleAR | ifclause ei )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==ID||LA1_0==INT||LA1_0==16) ) {
				alt1=1;
			}
			else if ( (LA1_0==32) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:25:4: simpleAR
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simpleAR_in_expression74);
					simpleAR2=simpleAR();
					state._fsp--;

					adaptor.addChild(root_0, simpleAR2.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:25:15: ifclause ei
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifclause_in_expression78);
					ifclause3=ifclause();
					state._fsp--;

					adaptor.addChild(root_0, ifclause3.getTree());

					pushFollow(FOLLOW_ei_in_expression80);
					ei4=ei();
					state._fsp--;

					adaptor.addChild(root_0, ei4.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class ei_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ei"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:28:1: ei : simpleDesign 'ELSE' ;
	public final algolFParser.ei_return ei() throws RecognitionException {
		algolFParser.ei_return retval = new algolFParser.ei_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal6=null;
		ParserRuleReturnScope simpleDesign5 =null;

		CommonTree string_literal6_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:28:4: ( simpleDesign 'ELSE' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:28:6: simpleDesign 'ELSE'
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_simpleDesign_in_ei91);
			simpleDesign5=simpleDesign();
			state._fsp--;

			adaptor.addChild(root_0, simpleDesign5.getTree());

			string_literal6=(Token)match(input,28,FOLLOW_28_in_ei93); 
			string_literal6_tree = (CommonTree)adaptor.create(string_literal6);
			adaptor.addChild(root_0, string_literal6_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ei"


	public static class simpleAR_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleAR"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:31:1: simpleAR : simpleARi ( ':=' simpleARi )* ;
	public final algolFParser.simpleAR_return simpleAR() throws RecognitionException {
		algolFParser.simpleAR_return retval = new algolFParser.simpleAR_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal8=null;
		ParserRuleReturnScope simpleARi7 =null;
		ParserRuleReturnScope simpleARi9 =null;

		CommonTree string_literal8_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:31:9: ( simpleARi ( ':=' simpleARi )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:31:11: simpleARi ( ':=' simpleARi )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_simpleARi_in_simpleAR103);
			simpleARi7=simpleARi();
			state._fsp--;

			adaptor.addChild(root_0, simpleARi7.getTree());

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:31:20: ( ':=' simpleARi )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==22) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:31:21: ':=' simpleARi
					{
					string_literal8=(Token)match(input,22,FOLLOW_22_in_simpleAR105); 
					string_literal8_tree = (CommonTree)adaptor.create(string_literal8);
					adaptor.addChild(root_0, string_literal8_tree);

					pushFollow(FOLLOW_simpleARi_in_simpleAR107);
					simpleARi9=simpleARi();
					state._fsp--;

					adaptor.addChild(root_0, simpleARi9.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleAR"


	public static class simpleARi_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleARi"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:34:1: simpleARi : multExp ( ( '+' ^| '-' ^) multExp )* ;
	public final algolFParser.simpleARi_return simpleARi() throws RecognitionException {
		algolFParser.simpleARi_return retval = new algolFParser.simpleARi_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal11=null;
		Token char_literal12=null;
		ParserRuleReturnScope multExp10 =null;
		ParserRuleReturnScope multExp13 =null;

		CommonTree char_literal11_tree=null;
		CommonTree char_literal12_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:34:10: ( multExp ( ( '+' ^| '-' ^) multExp )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:34:12: multExp ( ( '+' ^| '-' ^) multExp )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multExp_in_simpleARi119);
			multExp10=multExp();
			state._fsp--;

			adaptor.addChild(root_0, multExp10.getTree());

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:34:19: ( ( '+' ^| '-' ^) multExp )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==18||LA4_0==20) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:34:20: ( '+' ^| '-' ^) multExp
					{
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:34:20: ( '+' ^| '-' ^)
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==18) ) {
						alt3=1;
					}
					else if ( (LA3_0==20) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:34:21: '+' ^
							{
							char_literal11=(Token)match(input,18,FOLLOW_18_in_simpleARi122); 
							char_literal11_tree = (CommonTree)adaptor.create(char_literal11);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal11_tree, root_0);

							}
							break;
						case 2 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:34:28: '-' ^
							{
							char_literal12=(Token)match(input,20,FOLLOW_20_in_simpleARi127); 
							char_literal12_tree = (CommonTree)adaptor.create(char_literal12);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal12_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multExp_in_simpleARi131);
					multExp13=multExp();
					state._fsp--;

					adaptor.addChild(root_0, multExp13.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleARi"


	public static class multExp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multExp"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:39:1: multExp : powExp ( 'POW' ^ powExp )* ;
	public final algolFParser.multExp_return multExp() throws RecognitionException {
		algolFParser.multExp_return retval = new algolFParser.multExp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal15=null;
		ParserRuleReturnScope powExp14 =null;
		ParserRuleReturnScope powExp16 =null;

		CommonTree string_literal15_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:39:9: ( powExp ( 'POW' ^ powExp )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:39:11: powExp ( 'POW' ^ powExp )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_powExp_in_multExp147);
			powExp14=powExp();
			state._fsp--;

			adaptor.addChild(root_0, powExp14.getTree());

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:39:17: ( 'POW' ^ powExp )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==36) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:39:18: 'POW' ^ powExp
					{
					string_literal15=(Token)match(input,36,FOLLOW_36_in_multExp149); 
					string_literal15_tree = (CommonTree)adaptor.create(string_literal15);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal15_tree, root_0);

					pushFollow(FOLLOW_powExp_in_multExp152);
					powExp16=powExp();
					state._fsp--;

					adaptor.addChild(root_0, powExp16.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multExp"


	public static class powExp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "powExp"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:42:1: powExp : ( identifier actualparametrepart | '(' expression ')' | INT );
	public final algolFParser.powExp_return powExp() throws RecognitionException {
		algolFParser.powExp_return retval = new algolFParser.powExp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal19=null;
		Token char_literal21=null;
		Token INT22=null;
		ParserRuleReturnScope identifier17 =null;
		ParserRuleReturnScope actualparametrepart18 =null;
		ParserRuleReturnScope expression20 =null;

		CommonTree char_literal19_tree=null;
		CommonTree char_literal21_tree=null;
		CommonTree INT22_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:42:8: ( identifier actualparametrepart | '(' expression ')' | INT )
			int alt6=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt6=1;
				}
				break;
			case 16:
				{
				alt6=2;
				}
				break;
			case INT:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:42:10: identifier actualparametrepart
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_powExp165);
					identifier17=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier17.getTree());

					pushFollow(FOLLOW_actualparametrepart_in_powExp167);
					actualparametrepart18=actualparametrepart();
					state._fsp--;

					adaptor.addChild(root_0, actualparametrepart18.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:43:11: '(' expression ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal19=(Token)match(input,16,FOLLOW_16_in_powExp179); 
					char_literal19_tree = (CommonTree)adaptor.create(char_literal19);
					adaptor.addChild(root_0, char_literal19_tree);

					pushFollow(FOLLOW_expression_in_powExp181);
					expression20=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression20.getTree());

					char_literal21=(Token)match(input,17,FOLLOW_17_in_powExp183); 
					char_literal21_tree = (CommonTree)adaptor.create(char_literal21);
					adaptor.addChild(root_0, char_literal21_tree);

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:44:11: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT22=(Token)match(input,INT,FOLLOW_INT_in_powExp195); 
					INT22_tree = (CommonTree)adaptor.create(INT22);
					adaptor.addChild(root_0, INT22_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "powExp"


	public static class identifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "identifier"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:47:1: identifier : ID ;
	public final algolFParser.identifier_return identifier() throws RecognitionException {
		algolFParser.identifier_return retval = new algolFParser.identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID23=null;

		CommonTree ID23_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:48:2: ( ID )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:48:4: ID
			{
			root_0 = (CommonTree)adaptor.nil();


			ID23=(Token)match(input,ID,FOLLOW_ID_in_identifier207); 
			ID23_tree = (CommonTree)adaptor.create(ID23);
			adaptor.addChild(root_0, ID23_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier"


	public static class prog1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog1"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:52:1: prog1 : ( begin EOF | ( label ':' )+ begin );
	public final algolFParser.prog1_return prog1() throws RecognitionException {
		algolFParser.prog1_return retval = new algolFParser.prog1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF25=null;
		Token char_literal27=null;
		ParserRuleReturnScope begin24 =null;
		ParserRuleReturnScope label26 =null;
		ParserRuleReturnScope begin28 =null;

		CommonTree EOF25_tree=null;
		CommonTree char_literal27_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:52:7: ( begin EOF | ( label ':' )+ begin )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==25) ) {
				alt8=1;
			}
			else if ( (LA8_0==ID) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:52:10: begin EOF
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_begin_in_prog1221);
					begin24=begin();
					state._fsp--;

					adaptor.addChild(root_0, begin24.getTree());

					EOF25=(Token)match(input,EOF,FOLLOW_EOF_in_prog1223); 
					EOF25_tree = (CommonTree)adaptor.create(EOF25);
					adaptor.addChild(root_0, EOF25_tree);

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:53:19: ( label ':' )+ begin
					{
					root_0 = (CommonTree)adaptor.nil();


					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:53:19: ( label ':' )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==ID) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:53:20: label ':'
							{
							pushFollow(FOLLOW_label_in_prog1244);
							label26=label();
							state._fsp--;

							adaptor.addChild(root_0, label26.getTree());

							char_literal27=(Token)match(input,21,FOLLOW_21_in_prog1246); 
							char_literal27_tree = (CommonTree)adaptor.create(char_literal27);
							adaptor.addChild(root_0, char_literal27_tree);

							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					pushFollow(FOLLOW_begin_in_prog1250);
					begin28=begin();
					state._fsp--;

					adaptor.addChild(root_0, begin28.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog1"


	public static class label_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "label"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:55:1: label : identifier ;
	public final algolFParser.label_return label() throws RecognitionException {
		algolFParser.label_return retval = new algolFParser.label_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier29 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:55:7: ( identifier )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:55:10: identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_label276);
			identifier29=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier29.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "label"


	public static class localorown_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "localorown"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:58:1: localorown : ( type | 'OWN' type );
	public final algolFParser.localorown_return localorown() throws RecognitionException {
		algolFParser.localorown_return retval = new algolFParser.localorown_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal31=null;
		ParserRuleReturnScope type30 =null;
		ParserRuleReturnScope type32 =null;

		CommonTree string_literal31_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:59:2: ( type | 'OWN' type )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==26||LA9_0==33||LA9_0==38) ) {
				alt9=1;
			}
			else if ( (LA9_0==35) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:59:4: type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_type_in_localorown302);
					type30=type();
					state._fsp--;

					adaptor.addChild(root_0, type30.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:59:9: 'OWN' type
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal31=(Token)match(input,35,FOLLOW_35_in_localorown304); 
					string_literal31_tree = (CommonTree)adaptor.create(string_literal31);
					adaptor.addChild(root_0, string_literal31_tree);

					pushFollow(FOLLOW_type_in_localorown306);
					type32=type();
					state._fsp--;

					adaptor.addChild(root_0, type32.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "localorown"


	public static class type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:62:1: type : ( 'REAL' | 'INTEGER' | 'BOOLEAN' );
	public final algolFParser.type_return type() throws RecognitionException {
		algolFParser.type_return retval = new algolFParser.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set33=null;

		CommonTree set33_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:62:6: ( 'REAL' | 'INTEGER' | 'BOOLEAN' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set33=input.LT(1);
			if ( input.LA(1)==26||input.LA(1)==33||input.LA(1)==38 ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set33));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class typeliste_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typeliste"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:65:1: typeliste : identifier t ;
	public final algolFParser.typeliste_return typeliste() throws RecognitionException {
		algolFParser.typeliste_return retval = new algolFParser.typeliste_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier34 =null;
		ParserRuleReturnScope t35 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:66:2: ( identifier t )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:66:4: identifier t
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_typeliste332);
			identifier34=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier34.getTree());

			pushFollow(FOLLOW_t_in_typeliste334);
			t35=t();
			state._fsp--;

			adaptor.addChild(root_0, t35.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeliste"


	public static class t_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "t"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:68:1: t : ( ',' typeliste |);
	public final algolFParser.t_return t() throws RecognitionException {
		algolFParser.t_return retval = new algolFParser.t_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal36=null;
		ParserRuleReturnScope typeliste37 =null;

		CommonTree char_literal36_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:68:3: ( ',' typeliste |)
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==19) ) {
				alt10=1;
			}
			else if ( (LA10_0==23) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:68:5: ',' typeliste
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal36=(Token)match(input,19,FOLLOW_19_in_t343); 
					char_literal36_tree = (CommonTree)adaptor.create(char_literal36);
					adaptor.addChild(root_0, char_literal36_tree);

					pushFollow(FOLLOW_typeliste_in_t344);
					typeliste37=typeliste();
					state._fsp--;

					adaptor.addChild(root_0, typeliste37.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:70:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "t"


	public static class arraylist_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arraylist"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:72:1: arraylist : arrayseg a ;
	public final algolFParser.arraylist_return arraylist() throws RecognitionException {
		algolFParser.arraylist_return retval = new algolFParser.arraylist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope arrayseg38 =null;
		ParserRuleReturnScope a39 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:73:2: ( arrayseg a )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:73:4: arrayseg a
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_arrayseg_in_arraylist359);
			arrayseg38=arrayseg();
			state._fsp--;

			adaptor.addChild(root_0, arrayseg38.getTree());

			pushFollow(FOLLOW_a_in_arraylist361);
			a39=a();
			state._fsp--;

			adaptor.addChild(root_0, a39.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arraylist"


	public static class a_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "a"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:76:1: a : ( ',' arrayseg a |);
	public final algolFParser.a_return a() throws RecognitionException {
		algolFParser.a_return retval = new algolFParser.a_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal40=null;
		ParserRuleReturnScope arrayseg41 =null;
		ParserRuleReturnScope a42 =null;

		CommonTree char_literal40_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:76:3: ( ',' arrayseg a |)
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==19) ) {
				alt11=1;
			}
			else if ( (LA11_0==23) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:76:5: ',' arrayseg a
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal40=(Token)match(input,19,FOLLOW_19_in_a371); 
					char_literal40_tree = (CommonTree)adaptor.create(char_literal40);
					adaptor.addChild(root_0, char_literal40_tree);

					pushFollow(FOLLOW_arrayseg_in_a373);
					arrayseg41=arrayseg();
					state._fsp--;

					adaptor.addChild(root_0, arrayseg41.getTree());

					pushFollow(FOLLOW_a_in_a375);
					a42=a();
					state._fsp--;

					adaptor.addChild(root_0, a42.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:78:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "a"


	public static class arrayseg_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arrayseg"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:80:1: arrayseg : identifier r ;
	public final algolFParser.arrayseg_return arrayseg() throws RecognitionException {
		algolFParser.arrayseg_return retval = new algolFParser.arrayseg_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier43 =null;
		ParserRuleReturnScope r44 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:80:9: ( identifier r )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:80:11: identifier r
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_arrayseg388);
			identifier43=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier43.getTree());

			pushFollow(FOLLOW_r_in_arrayseg390);
			r44=r();
			state._fsp--;

			adaptor.addChild(root_0, r44.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayseg"


	public static class r_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "r"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:82:1: r : ( '[' boundplist ']' | ',' arrayseg );
	public final algolFParser.r_return r() throws RecognitionException {
		algolFParser.r_return retval = new algolFParser.r_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal45=null;
		Token char_literal47=null;
		Token char_literal48=null;
		ParserRuleReturnScope boundplist46 =null;
		ParserRuleReturnScope arrayseg49 =null;

		CommonTree char_literal45_tree=null;
		CommonTree char_literal47_tree=null;
		CommonTree char_literal48_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:82:3: ( '[' boundplist ']' | ',' arrayseg )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==47) ) {
				alt12=1;
			}
			else if ( (LA12_0==19) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:82:5: '[' boundplist ']'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal45=(Token)match(input,47,FOLLOW_47_in_r398); 
					char_literal45_tree = (CommonTree)adaptor.create(char_literal45);
					adaptor.addChild(root_0, char_literal45_tree);

					pushFollow(FOLLOW_boundplist_in_r400);
					boundplist46=boundplist();
					state._fsp--;

					adaptor.addChild(root_0, boundplist46.getTree());

					char_literal47=(Token)match(input,48,FOLLOW_48_in_r401); 
					char_literal47_tree = (CommonTree)adaptor.create(char_literal47);
					adaptor.addChild(root_0, char_literal47_tree);

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:83:4: ',' arrayseg
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal48=(Token)match(input,19,FOLLOW_19_in_r406); 
					char_literal48_tree = (CommonTree)adaptor.create(char_literal48);
					adaptor.addChild(root_0, char_literal48_tree);

					pushFollow(FOLLOW_arrayseg_in_r408);
					arrayseg49=arrayseg();
					state._fsp--;

					adaptor.addChild(root_0, arrayseg49.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "r"


	public static class boundplist_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boundplist"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:86:1: boundplist : boundp z ;
	public final algolFParser.boundplist_return boundplist() throws RecognitionException {
		algolFParser.boundplist_return retval = new algolFParser.boundplist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope boundp50 =null;
		ParserRuleReturnScope z51 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:87:2: ( boundp z )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:87:4: boundp z
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boundp_in_boundplist420);
			boundp50=boundp();
			state._fsp--;

			adaptor.addChild(root_0, boundp50.getTree());

			pushFollow(FOLLOW_z_in_boundplist422);
			z51=z();
			state._fsp--;

			adaptor.addChild(root_0, z51.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boundplist"


	public static class z_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "z"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:90:1: z : ( ',' boundp z |);
	public final algolFParser.z_return z() throws RecognitionException {
		algolFParser.z_return retval = new algolFParser.z_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal52=null;
		ParserRuleReturnScope boundp53 =null;
		ParserRuleReturnScope z54 =null;

		CommonTree char_literal52_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:90:3: ( ',' boundp z |)
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==19) ) {
				alt13=1;
			}
			else if ( (LA13_0==48) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:90:5: ',' boundp z
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal52=(Token)match(input,19,FOLLOW_19_in_z433); 
					char_literal52_tree = (CommonTree)adaptor.create(char_literal52);
					adaptor.addChild(root_0, char_literal52_tree);

					pushFollow(FOLLOW_boundp_in_z435);
					boundp53=boundp();
					state._fsp--;

					adaptor.addChild(root_0, boundp53.getTree());

					pushFollow(FOLLOW_z_in_z437);
					z54=z();
					state._fsp--;

					adaptor.addChild(root_0, z54.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:92:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "z"


	public static class boundp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boundp"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:93:1: boundp : simpleARi ':' simpleARi ;
	public final algolFParser.boundp_return boundp() throws RecognitionException {
		algolFParser.boundp_return retval = new algolFParser.boundp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal56=null;
		ParserRuleReturnScope simpleARi55 =null;
		ParserRuleReturnScope simpleARi57 =null;

		CommonTree char_literal56_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:93:8: ( simpleARi ':' simpleARi )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:93:10: simpleARi ':' simpleARi
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_simpleARi_in_boundp450);
			simpleARi55=simpleARi();
			state._fsp--;

			adaptor.addChild(root_0, simpleARi55.getTree());

			char_literal56=(Token)match(input,21,FOLLOW_21_in_boundp452); 
			char_literal56_tree = (CommonTree)adaptor.create(char_literal56);
			adaptor.addChild(root_0, char_literal56_tree);

			pushFollow(FOLLOW_simpleARi_in_boundp454);
			simpleARi57=simpleARi();
			state._fsp--;

			adaptor.addChild(root_0, simpleARi57.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boundp"


	public static class typedeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typedeclaration"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:97:1: typedeclaration : ( typeliste | 'ARRAY' arraylist | procedure );
	public final algolFParser.typedeclaration_return typedeclaration() throws RecognitionException {
		algolFParser.typedeclaration_return retval = new algolFParser.typedeclaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal59=null;
		ParserRuleReturnScope typeliste58 =null;
		ParserRuleReturnScope arraylist60 =null;
		ParserRuleReturnScope procedure61 =null;

		CommonTree string_literal59_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:97:16: ( typeliste | 'ARRAY' arraylist | procedure )
			int alt14=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt14=1;
				}
				break;
			case 24:
				{
				alt14=2;
				}
				break;
			case 37:
				{
				alt14=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:97:18: typeliste
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_typeliste_in_typedeclaration465);
					typeliste58=typeliste();
					state._fsp--;

					adaptor.addChild(root_0, typeliste58.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:98:2: 'ARRAY' arraylist
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal59=(Token)match(input,24,FOLLOW_24_in_typedeclaration468); 
					string_literal59_tree = (CommonTree)adaptor.create(string_literal59);
					adaptor.addChild(root_0, string_literal59_tree);

					pushFollow(FOLLOW_arraylist_in_typedeclaration470);
					arraylist60=arraylist();
					state._fsp--;

					adaptor.addChild(root_0, arraylist60.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:99:2: procedure
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_procedure_in_typedeclaration473);
					procedure61=procedure();
					state._fsp--;

					adaptor.addChild(root_0, procedure61.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typedeclaration"


	public static class typedeclaration2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typedeclaration2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:103:1: typedeclaration2 : ( 'ARRAY' arraylist | procedure );
	public final algolFParser.typedeclaration2_return typedeclaration2() throws RecognitionException {
		algolFParser.typedeclaration2_return retval = new algolFParser.typedeclaration2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal62=null;
		ParserRuleReturnScope arraylist63 =null;
		ParserRuleReturnScope procedure64 =null;

		CommonTree string_literal62_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:103:17: ( 'ARRAY' arraylist | procedure )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==24) ) {
				alt15=1;
			}
			else if ( (LA15_0==37) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:103:18: 'ARRAY' arraylist
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal62=(Token)match(input,24,FOLLOW_24_in_typedeclaration2481); 
					string_literal62_tree = (CommonTree)adaptor.create(string_literal62);
					adaptor.addChild(root_0, string_literal62_tree);

					pushFollow(FOLLOW_arraylist_in_typedeclaration2483);
					arraylist63=arraylist();
					state._fsp--;

					adaptor.addChild(root_0, arraylist63.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:104:2: procedure
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_procedure_in_typedeclaration2486);
					procedure64=procedure();
					state._fsp--;

					adaptor.addChild(root_0, procedure64.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typedeclaration2"


	public static class switchdec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "switchdec"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:107:1: switchdec : 'SWITCH' identifier ':=' switchlist ;
	public final algolFParser.switchdec_return switchdec() throws RecognitionException {
		algolFParser.switchdec_return retval = new algolFParser.switchdec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal65=null;
		Token string_literal67=null;
		ParserRuleReturnScope identifier66 =null;
		ParserRuleReturnScope switchlist68 =null;

		CommonTree string_literal65_tree=null;
		CommonTree string_literal67_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:108:2: ( 'SWITCH' identifier ':=' switchlist )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:108:4: 'SWITCH' identifier ':=' switchlist
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal65=(Token)match(input,41,FOLLOW_41_in_switchdec496); 
			string_literal65_tree = (CommonTree)adaptor.create(string_literal65);
			adaptor.addChild(root_0, string_literal65_tree);

			pushFollow(FOLLOW_identifier_in_switchdec498);
			identifier66=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier66.getTree());

			string_literal67=(Token)match(input,22,FOLLOW_22_in_switchdec500); 
			string_literal67_tree = (CommonTree)adaptor.create(string_literal67);
			adaptor.addChild(root_0, string_literal67_tree);

			pushFollow(FOLLOW_switchlist_in_switchdec502);
			switchlist68=switchlist();
			state._fsp--;

			adaptor.addChild(root_0, switchlist68.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "switchdec"


	public static class switchlist_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "switchlist"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:111:1: switchlist : designExp s ;
	public final algolFParser.switchlist_return switchlist() throws RecognitionException {
		algolFParser.switchlist_return retval = new algolFParser.switchlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope designExp69 =null;
		ParserRuleReturnScope s70 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:112:2: ( designExp s )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:112:5: designExp s
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_designExp_in_switchlist515);
			designExp69=designExp();
			state._fsp--;

			adaptor.addChild(root_0, designExp69.getTree());

			pushFollow(FOLLOW_s_in_switchlist517);
			s70=s();
			state._fsp--;

			adaptor.addChild(root_0, s70.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "switchlist"


	public static class s_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "s"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:114:1: s : ( ',' designExp s |);
	public final algolFParser.s_return s() throws RecognitionException {
		algolFParser.s_return retval = new algolFParser.s_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal71=null;
		ParserRuleReturnScope designExp72 =null;
		ParserRuleReturnScope s73 =null;

		CommonTree char_literal71_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:114:3: ( ',' designExp s |)
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==19) ) {
				alt16=1;
			}
			else if ( (LA16_0==23) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:114:6: ',' designExp s
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal71=(Token)match(input,19,FOLLOW_19_in_s526); 
					char_literal71_tree = (CommonTree)adaptor.create(char_literal71);
					adaptor.addChild(root_0, char_literal71_tree);

					pushFollow(FOLLOW_designExp_in_s528);
					designExp72=designExp();
					state._fsp--;

					adaptor.addChild(root_0, designExp72.getTree());

					pushFollow(FOLLOW_s_in_s530);
					s73=s();
					state._fsp--;

					adaptor.addChild(root_0, s73.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:116:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "s"


	public static class procedure_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "procedure"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:117:2: procedure : 'PROCEDURE' procedurehead statement ;
	public final algolFParser.procedure_return procedure() throws RecognitionException {
		algolFParser.procedure_return retval = new algolFParser.procedure_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal74=null;
		ParserRuleReturnScope procedurehead75 =null;
		ParserRuleReturnScope statement76 =null;

		CommonTree string_literal74_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:117:11: ( 'PROCEDURE' procedurehead statement )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:117:13: 'PROCEDURE' procedurehead statement
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal74=(Token)match(input,37,FOLLOW_37_in_procedure543); 
			string_literal74_tree = (CommonTree)adaptor.create(string_literal74);
			adaptor.addChild(root_0, string_literal74_tree);

			pushFollow(FOLLOW_procedurehead_in_procedure545);
			procedurehead75=procedurehead();
			state._fsp--;

			adaptor.addChild(root_0, procedurehead75.getTree());

			pushFollow(FOLLOW_statement_in_procedure547);
			statement76=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement76.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedure"


	public static class procedurehead_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "procedurehead"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:120:2: procedurehead : identifier formalparameterpart ';' valuepart specificationpart ;
	public final algolFParser.procedurehead_return procedurehead() throws RecognitionException {
		algolFParser.procedurehead_return retval = new algolFParser.procedurehead_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal79=null;
		ParserRuleReturnScope identifier77 =null;
		ParserRuleReturnScope formalparameterpart78 =null;
		ParserRuleReturnScope valuepart80 =null;
		ParserRuleReturnScope specificationpart81 =null;

		CommonTree char_literal79_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:121:3: ( identifier formalparameterpart ';' valuepart specificationpart )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:121:5: identifier formalparameterpart ';' valuepart specificationpart
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_procedurehead563);
			identifier77=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier77.getTree());

			pushFollow(FOLLOW_formalparameterpart_in_procedurehead565);
			formalparameterpart78=formalparameterpart();
			state._fsp--;

			adaptor.addChild(root_0, formalparameterpart78.getTree());

			char_literal79=(Token)match(input,23,FOLLOW_23_in_procedurehead567); 
			char_literal79_tree = (CommonTree)adaptor.create(char_literal79);
			adaptor.addChild(root_0, char_literal79_tree);

			pushFollow(FOLLOW_valuepart_in_procedurehead569);
			valuepart80=valuepart();
			state._fsp--;

			adaptor.addChild(root_0, valuepart80.getTree());

			pushFollow(FOLLOW_specificationpart_in_procedurehead571);
			specificationpart81=specificationpart();
			state._fsp--;

			adaptor.addChild(root_0, specificationpart81.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedurehead"


	public static class formalparameterpart_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "formalparameterpart"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:124:1: formalparameterpart : (| '(' formalparameterlist ')' );
	public final algolFParser.formalparameterpart_return formalparameterpart() throws RecognitionException {
		algolFParser.formalparameterpart_return retval = new algolFParser.formalparameterpart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal82=null;
		Token char_literal84=null;
		ParserRuleReturnScope formalparameterlist83 =null;

		CommonTree char_literal82_tree=null;
		CommonTree char_literal84_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:124:21: (| '(' formalparameterlist ')' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==23) ) {
				alt17=1;
			}
			else if ( (LA17_0==16) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:124:23: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:124:25: '(' formalparameterlist ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal82=(Token)match(input,16,FOLLOW_16_in_formalparameterpart585); 
					char_literal82_tree = (CommonTree)adaptor.create(char_literal82);
					adaptor.addChild(root_0, char_literal82_tree);

					pushFollow(FOLLOW_formalparameterlist_in_formalparameterpart587);
					formalparameterlist83=formalparameterlist();
					state._fsp--;

					adaptor.addChild(root_0, formalparameterlist83.getTree());

					char_literal84=(Token)match(input,17,FOLLOW_17_in_formalparameterpart589); 
					char_literal84_tree = (CommonTree)adaptor.create(char_literal84);
					adaptor.addChild(root_0, char_literal84_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalparameterpart"


	public static class specificationpart_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "specificationpart"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:132:1: specificationpart : ( specifier identifier ';' specificationpart |);
	public final algolFParser.specificationpart_return specificationpart() throws RecognitionException {
		algolFParser.specificationpart_return retval = new algolFParser.specificationpart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal87=null;
		ParserRuleReturnScope specifier85 =null;
		ParserRuleReturnScope identifier86 =null;
		ParserRuleReturnScope specificationpart88 =null;

		CommonTree char_literal87_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:133:2: ( specifier identifier ';' specificationpart |)
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==24||LA18_0==26||(LA18_0 >= 33 && LA18_0 <= 34)||(LA18_0 >= 37 && LA18_0 <= 38)||(LA18_0 >= 40 && LA18_0 <= 41)) ) {
				alt18=1;
			}
			else if ( (LA18_0==EOF||LA18_0==ID||(LA18_0 >= 16 && LA18_0 <= 23)||LA18_0==25||(LA18_0 >= 27 && LA18_0 <= 32)||LA18_0==36||LA18_0==39||(LA18_0 >= 42 && LA18_0 <= 43)||LA18_0==45||LA18_0==48) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:133:3: specifier identifier ';' specificationpart
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_specifier_in_specificationpart607);
					specifier85=specifier();
					state._fsp--;

					adaptor.addChild(root_0, specifier85.getTree());

					pushFollow(FOLLOW_identifier_in_specificationpart609);
					identifier86=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier86.getTree());

					char_literal87=(Token)match(input,23,FOLLOW_23_in_specificationpart611); 
					char_literal87_tree = (CommonTree)adaptor.create(char_literal87);
					adaptor.addChild(root_0, char_literal87_tree);

					pushFollow(FOLLOW_specificationpart_in_specificationpart613);
					specificationpart88=specificationpart();
					state._fsp--;

					adaptor.addChild(root_0, specificationpart88.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:135:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "specificationpart"


	public static class specifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "specifier"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:137:1: specifier : ( 'STRING' | type h | 'ARRAY' | 'LABEL' | 'SWITCH' | 'PROCEDURE' );
	public final algolFParser.specifier_return specifier() throws RecognitionException {
		algolFParser.specifier_return retval = new algolFParser.specifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal89=null;
		Token string_literal92=null;
		Token string_literal93=null;
		Token string_literal94=null;
		Token string_literal95=null;
		ParserRuleReturnScope type90 =null;
		ParserRuleReturnScope h91 =null;

		CommonTree string_literal89_tree=null;
		CommonTree string_literal92_tree=null;
		CommonTree string_literal93_tree=null;
		CommonTree string_literal94_tree=null;
		CommonTree string_literal95_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:138:2: ( 'STRING' | type h | 'ARRAY' | 'LABEL' | 'SWITCH' | 'PROCEDURE' )
			int alt19=6;
			switch ( input.LA(1) ) {
			case 40:
				{
				alt19=1;
				}
				break;
			case 26:
			case 33:
			case 38:
				{
				alt19=2;
				}
				break;
			case 24:
				{
				alt19=3;
				}
				break;
			case 34:
				{
				alt19=4;
				}
				break;
			case 41:
				{
				alt19=5;
				}
				break;
			case 37:
				{
				alt19=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:138:3: 'STRING'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal89=(Token)match(input,40,FOLLOW_40_in_specifier627); 
					string_literal89_tree = (CommonTree)adaptor.create(string_literal89);
					adaptor.addChild(root_0, string_literal89_tree);

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:138:14: type h
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_type_in_specifier631);
					type90=type();
					state._fsp--;

					adaptor.addChild(root_0, type90.getTree());

					pushFollow(FOLLOW_h_in_specifier634);
					h91=h();
					state._fsp--;

					adaptor.addChild(root_0, h91.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:138:23: 'ARRAY'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal92=(Token)match(input,24,FOLLOW_24_in_specifier637); 
					string_literal92_tree = (CommonTree)adaptor.create(string_literal92);
					adaptor.addChild(root_0, string_literal92_tree);

					}
					break;
				case 4 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:138:33: 'LABEL'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal93=(Token)match(input,34,FOLLOW_34_in_specifier641); 
					string_literal93_tree = (CommonTree)adaptor.create(string_literal93);
					adaptor.addChild(root_0, string_literal93_tree);

					}
					break;
				case 5 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:138:43: 'SWITCH'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal94=(Token)match(input,41,FOLLOW_41_in_specifier645); 
					string_literal94_tree = (CommonTree)adaptor.create(string_literal94);
					adaptor.addChild(root_0, string_literal94_tree);

					}
					break;
				case 6 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:138:54: 'PROCEDURE'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal95=(Token)match(input,37,FOLLOW_37_in_specifier649); 
					string_literal95_tree = (CommonTree)adaptor.create(string_literal95);
					adaptor.addChild(root_0, string_literal95_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "specifier"


	public static class h_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "h"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:141:1: h : (| 'ARRAY' | 'PROCEDURE' );
	public final algolFParser.h_return h() throws RecognitionException {
		algolFParser.h_return retval = new algolFParser.h_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal96=null;
		Token string_literal97=null;

		CommonTree string_literal96_tree=null;
		CommonTree string_literal97_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:141:3: (| 'ARRAY' | 'PROCEDURE' )
			int alt20=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt20=1;
				}
				break;
			case 24:
				{
				alt20=2;
				}
				break;
			case 37:
				{
				alt20=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:141:5: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:141:7: 'ARRAY'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal96=(Token)match(input,24,FOLLOW_24_in_h662); 
					string_literal96_tree = (CommonTree)adaptor.create(string_literal96);
					adaptor.addChild(root_0, string_literal96_tree);

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:141:16: 'PROCEDURE'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal97=(Token)match(input,37,FOLLOW_37_in_h665); 
					string_literal97_tree = (CommonTree)adaptor.create(string_literal97);
					adaptor.addChild(root_0, string_literal97_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "h"


	public static class formalparameterlist_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "formalparameterlist"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:144:1: formalparameterlist : formalpara g ;
	public final algolFParser.formalparameterlist_return formalparameterlist() throws RecognitionException {
		algolFParser.formalparameterlist_return retval = new algolFParser.formalparameterlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope formalpara98 =null;
		ParserRuleReturnScope g99 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:145:2: ( formalpara g )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:145:4: formalpara g
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_formalpara_in_formalparameterlist677);
			formalpara98=formalpara();
			state._fsp--;

			adaptor.addChild(root_0, formalpara98.getTree());

			pushFollow(FOLLOW_g_in_formalparameterlist679);
			g99=g();
			state._fsp--;

			adaptor.addChild(root_0, g99.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalparameterlist"


	public static class g_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "g"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:148:1: g : ( paralim formalpara g |);
	public final algolFParser.g_return g() throws RecognitionException {
		algolFParser.g_return retval = new algolFParser.g_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope paralim100 =null;
		ParserRuleReturnScope formalpara101 =null;
		ParserRuleReturnScope g102 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:148:3: ( paralim formalpara g |)
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==16||LA21_0==19) ) {
				alt21=1;
			}
			else if ( (LA21_0==17) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:148:5: paralim formalpara g
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paralim_in_g690);
					paralim100=paralim();
					state._fsp--;

					adaptor.addChild(root_0, paralim100.getTree());

					pushFollow(FOLLOW_formalpara_in_g692);
					formalpara101=formalpara();
					state._fsp--;

					adaptor.addChild(root_0, formalpara101.getTree());

					pushFollow(FOLLOW_g_in_g694);
					g102=g();
					state._fsp--;

					adaptor.addChild(root_0, g102.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:150:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "g"


	public static class formalpara_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "formalpara"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:152:1: formalpara : identifier ;
	public final algolFParser.formalpara_return formalpara() throws RecognitionException {
		algolFParser.formalpara_return retval = new algolFParser.formalpara_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier103 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:153:2: ( identifier )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:153:4: identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_formalpara709);
			identifier103=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier103.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalpara"


	public static class paralim_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "paralim"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:156:1: paralim : ( ',' | '(' ':' '(' );
	public final algolFParser.paralim_return paralim() throws RecognitionException {
		algolFParser.paralim_return retval = new algolFParser.paralim_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal104=null;
		Token char_literal105=null;
		Token char_literal106=null;
		Token char_literal107=null;

		CommonTree char_literal104_tree=null;
		CommonTree char_literal105_tree=null;
		CommonTree char_literal106_tree=null;
		CommonTree char_literal107_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:156:9: ( ',' | '(' ':' '(' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==19) ) {
				alt22=1;
			}
			else if ( (LA22_0==16) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:156:11: ','
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal104=(Token)match(input,19,FOLLOW_19_in_paralim719); 
					char_literal104_tree = (CommonTree)adaptor.create(char_literal104);
					adaptor.addChild(root_0, char_literal104_tree);

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:156:16: '(' ':' '('
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal105=(Token)match(input,16,FOLLOW_16_in_paralim722); 
					char_literal105_tree = (CommonTree)adaptor.create(char_literal105);
					adaptor.addChild(root_0, char_literal105_tree);

					char_literal106=(Token)match(input,21,FOLLOW_21_in_paralim725); 
					char_literal106_tree = (CommonTree)adaptor.create(char_literal106);
					adaptor.addChild(root_0, char_literal106_tree);

					char_literal107=(Token)match(input,16,FOLLOW_16_in_paralim727); 
					char_literal107_tree = (CommonTree)adaptor.create(char_literal107);
					adaptor.addChild(root_0, char_literal107_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paralim"


	public static class valuepart_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "valuepart"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:159:1: valuepart : 'VALUE' identifier ;
	public final algolFParser.valuepart_return valuepart() throws RecognitionException {
		algolFParser.valuepart_return retval = new algolFParser.valuepart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal108=null;
		ParserRuleReturnScope identifier109 =null;

		CommonTree string_literal108_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:159:11: ( 'VALUE' identifier )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:159:12: 'VALUE' identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal108=(Token)match(input,44,FOLLOW_44_in_valuepart737); 
			string_literal108_tree = (CommonTree)adaptor.create(string_literal108);
			adaptor.addChild(root_0, string_literal108_tree);

			pushFollow(FOLLOW_identifier_in_valuepart739);
			identifier109=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier109.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valuepart"


	public static class designExp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "designExp"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:163:1: designExp : ( simpleDesign | ifclause simpleDesign 'ELSE' designExp );
	public final algolFParser.designExp_return designExp() throws RecognitionException {
		algolFParser.designExp_return retval = new algolFParser.designExp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal113=null;
		ParserRuleReturnScope simpleDesign110 =null;
		ParserRuleReturnScope ifclause111 =null;
		ParserRuleReturnScope simpleDesign112 =null;
		ParserRuleReturnScope designExp114 =null;

		CommonTree string_literal113_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:164:2: ( simpleDesign | ifclause simpleDesign 'ELSE' designExp )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==ID||LA23_0==16) ) {
				alt23=1;
			}
			else if ( (LA23_0==32) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:164:4: simpleDesign
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simpleDesign_in_designExp754);
					simpleDesign110=simpleDesign();
					state._fsp--;

					adaptor.addChild(root_0, simpleDesign110.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:165:3: ifclause simpleDesign 'ELSE' designExp
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifclause_in_designExp758);
					ifclause111=ifclause();
					state._fsp--;

					adaptor.addChild(root_0, ifclause111.getTree());

					pushFollow(FOLLOW_simpleDesign_in_designExp760);
					simpleDesign112=simpleDesign();
					state._fsp--;

					adaptor.addChild(root_0, simpleDesign112.getTree());

					string_literal113=(Token)match(input,28,FOLLOW_28_in_designExp762); 
					string_literal113_tree = (CommonTree)adaptor.create(string_literal113);
					adaptor.addChild(root_0, string_literal113_tree);

					pushFollow(FOLLOW_designExp_in_designExp764);
					designExp114=designExp();
					state._fsp--;

					adaptor.addChild(root_0, designExp114.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "designExp"


	public static class simpleDesign_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleDesign"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:168:1: simpleDesign : ( label | '(' designExp ')' );
	public final algolFParser.simpleDesign_return simpleDesign() throws RecognitionException {
		algolFParser.simpleDesign_return retval = new algolFParser.simpleDesign_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal116=null;
		Token char_literal118=null;
		ParserRuleReturnScope label115 =null;
		ParserRuleReturnScope designExp117 =null;

		CommonTree char_literal116_tree=null;
		CommonTree char_literal118_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:169:2: ( label | '(' designExp ')' )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==ID) ) {
				alt24=1;
			}
			else if ( (LA24_0==16) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:169:5: label
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_label_in_simpleDesign777);
					label115=label();
					state._fsp--;

					adaptor.addChild(root_0, label115.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:170:3: '(' designExp ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal116=(Token)match(input,16,FOLLOW_16_in_simpleDesign781); 
					char_literal116_tree = (CommonTree)adaptor.create(char_literal116);
					adaptor.addChild(root_0, char_literal116_tree);

					pushFollow(FOLLOW_designExp_in_simpleDesign783);
					designExp117=designExp();
					state._fsp--;

					adaptor.addChild(root_0, designExp117.getTree());

					char_literal118=(Token)match(input,17,FOLLOW_17_in_simpleDesign785); 
					char_literal118_tree = (CommonTree)adaptor.create(char_literal118);
					adaptor.addChild(root_0, char_literal118_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleDesign"


	public static class ifclause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifclause"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:174:1: ifclause : 'IF' expression 'THEN' -> ^( IF expression THEN ) ;
	public final algolFParser.ifclause_return ifclause() throws RecognitionException {
		algolFParser.ifclause_return retval = new algolFParser.ifclause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal119=null;
		Token string_literal121=null;
		ParserRuleReturnScope expression120 =null;

		CommonTree string_literal119_tree=null;
		CommonTree string_literal121_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:174:9: ( 'IF' expression 'THEN' -> ^( IF expression THEN ) )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:174:12: 'IF' expression 'THEN'
			{
			string_literal119=(Token)match(input,32,FOLLOW_32_in_ifclause798);  
			stream_32.add(string_literal119);

			pushFollow(FOLLOW_expression_in_ifclause800);
			expression120=expression();
			state._fsp--;

			stream_expression.add(expression120.getTree());
			string_literal121=(Token)match(input,42,FOLLOW_42_in_ifclause802);  
			stream_42.add(string_literal121);

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 174:34: -> ^( IF expression THEN )
			{
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:174:36: ^( IF expression THEN )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, (CommonTree)adaptor.create(THEN, "THEN"));
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifclause"


	public static class declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:177:1: declaration : ( localorown typedeclaration | typedeclaration2 | switchdec );
	public final algolFParser.declaration_return declaration() throws RecognitionException {
		algolFParser.declaration_return retval = new algolFParser.declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope localorown122 =null;
		ParserRuleReturnScope typedeclaration123 =null;
		ParserRuleReturnScope typedeclaration2124 =null;
		ParserRuleReturnScope switchdec125 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:178:2: ( localorown typedeclaration | typedeclaration2 | switchdec )
			int alt25=3;
			switch ( input.LA(1) ) {
			case 26:
			case 33:
			case 35:
			case 38:
				{
				alt25=1;
				}
				break;
			case 24:
			case 37:
				{
				alt25=2;
				}
				break;
			case 41:
				{
				alt25=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:178:4: localorown typedeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_localorown_in_declaration845);
					localorown122=localorown();
					state._fsp--;

					adaptor.addChild(root_0, localorown122.getTree());

					pushFollow(FOLLOW_typedeclaration_in_declaration847);
					typedeclaration123=typedeclaration();
					state._fsp--;

					adaptor.addChild(root_0, typedeclaration123.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:178:32: typedeclaration2
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_typedeclaration2_in_declaration850);
					typedeclaration2124=typedeclaration2();
					state._fsp--;

					adaptor.addChild(root_0, typedeclaration2124.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:178:49: switchdec
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_switchdec_in_declaration852);
					switchdec125=switchdec();
					state._fsp--;

					adaptor.addChild(root_0, switchdec125.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class begin_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "begin"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:180:1: begin : 'BEGIN' d ;
	public final algolFParser.begin_return begin() throws RecognitionException {
		algolFParser.begin_return retval = new algolFParser.begin_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal126=null;
		ParserRuleReturnScope d127 =null;

		CommonTree string_literal126_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:180:7: ( 'BEGIN' d )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:180:9: 'BEGIN' d
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal126=(Token)match(input,25,FOLLOW_25_in_begin861); 
			string_literal126_tree = (CommonTree)adaptor.create(string_literal126);
			adaptor.addChild(root_0, string_literal126_tree);

			pushFollow(FOLLOW_d_in_begin863);
			d127=d();
			state._fsp--;

			adaptor.addChild(root_0, d127.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "begin"


	public static class d_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "d"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:183:1: d : ( declaration ';' ( declaration ';' )* compoundT | compoundT );
	public final algolFParser.d_return d() throws RecognitionException {
		algolFParser.d_return retval = new algolFParser.d_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal129=null;
		Token char_literal131=null;
		ParserRuleReturnScope declaration128 =null;
		ParserRuleReturnScope declaration130 =null;
		ParserRuleReturnScope compoundT132 =null;
		ParserRuleReturnScope compoundT133 =null;

		CommonTree char_literal129_tree=null;
		CommonTree char_literal131_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:183:3: ( declaration ';' ( declaration ';' )* compoundT | compoundT )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==24||LA27_0==26||LA27_0==33||LA27_0==35||(LA27_0 >= 37 && LA27_0 <= 38)||LA27_0==41) ) {
				alt27=1;
			}
			else if ( (LA27_0==EOF||LA27_0==ID||(LA27_0 >= 16 && LA27_0 <= 23)||LA27_0==25||(LA27_0 >= 27 && LA27_0 <= 32)||LA27_0==36||LA27_0==39||(LA27_0 >= 42 && LA27_0 <= 43)||LA27_0==45||LA27_0==48) ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:183:5: declaration ';' ( declaration ';' )* compoundT
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_declaration_in_d880);
					declaration128=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration128.getTree());

					char_literal129=(Token)match(input,23,FOLLOW_23_in_d882); 
					char_literal129_tree = (CommonTree)adaptor.create(char_literal129);
					adaptor.addChild(root_0, char_literal129_tree);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:183:21: ( declaration ';' )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==24||LA26_0==26||LA26_0==33||LA26_0==35||(LA26_0 >= 37 && LA26_0 <= 38)||LA26_0==41) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:183:22: declaration ';'
							{
							pushFollow(FOLLOW_declaration_in_d885);
							declaration130=declaration();
							state._fsp--;

							adaptor.addChild(root_0, declaration130.getTree());

							char_literal131=(Token)match(input,23,FOLLOW_23_in_d887); 
							char_literal131_tree = (CommonTree)adaptor.create(char_literal131);
							adaptor.addChild(root_0, char_literal131_tree);

							}
							break;

						default :
							break loop26;
						}
					}

					pushFollow(FOLLOW_compoundT_in_d891);
					compoundT132=compoundT();
					state._fsp--;

					adaptor.addChild(root_0, compoundT132.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:184:4: compoundT
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_compoundT_in_d896);
					compoundT133=compoundT();
					state._fsp--;

					adaptor.addChild(root_0, compoundT133.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "d"


	public static class compoundT_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "compoundT"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:249:1: compoundT : statement c ;
	public final algolFParser.compoundT_return compoundT() throws RecognitionException {
		algolFParser.compoundT_return retval = new algolFParser.compoundT_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope statement134 =null;
		ParserRuleReturnScope c135 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:250:2: ( statement c )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:250:4: statement c
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_statement_in_compoundT1009);
			statement134=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement134.getTree());

			pushFollow(FOLLOW_c_in_compoundT1011);
			c135=c();
			state._fsp--;

			adaptor.addChild(root_0, c135.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compoundT"


	public static class c_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "c"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:252:1: c : ( 'END' | ';' compoundT );
	public final algolFParser.c_return c() throws RecognitionException {
		algolFParser.c_return retval = new algolFParser.c_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal136=null;
		Token char_literal137=null;
		ParserRuleReturnScope compoundT138 =null;

		CommonTree string_literal136_tree=null;
		CommonTree char_literal137_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:252:3: ( 'END' | ';' compoundT )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==29) ) {
				alt28=1;
			}
			else if ( (LA28_0==23) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:252:6: 'END'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal136=(Token)match(input,29,FOLLOW_29_in_c1021); 
					string_literal136_tree = (CommonTree)adaptor.create(string_literal136);
					adaptor.addChild(root_0, string_literal136_tree);

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:252:12: ';' compoundT
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal137=(Token)match(input,23,FOLLOW_23_in_c1023); 
					char_literal137_tree = (CommonTree)adaptor.create(char_literal137);
					adaptor.addChild(root_0, char_literal137_tree);

					pushFollow(FOLLOW_compoundT_in_c1025);
					compoundT138=compoundT();
					state._fsp--;

					adaptor.addChild(root_0, compoundT138.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "c"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:260:1: statement : ( identifier rs | gotostatement | ifclause j | forclause statement | begin | actualparametrepart );
	public final algolFParser.statement_return statement() throws RecognitionException {
		algolFParser.statement_return retval = new algolFParser.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier139 =null;
		ParserRuleReturnScope rs140 =null;
		ParserRuleReturnScope gotostatement141 =null;
		ParserRuleReturnScope ifclause142 =null;
		ParserRuleReturnScope j143 =null;
		ParserRuleReturnScope forclause144 =null;
		ParserRuleReturnScope statement145 =null;
		ParserRuleReturnScope begin146 =null;
		ParserRuleReturnScope actualparametrepart147 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:261:2: ( identifier rs | gotostatement | ifclause j | forclause statement | begin | actualparametrepart )
			int alt29=6;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt29=1;
				}
				break;
			case 31:
				{
				alt29=2;
				}
				break;
			case 32:
				{
				alt29=3;
				}
				break;
			case 30:
				{
				alt29=4;
				}
				break;
			case 25:
				{
				alt29=5;
				}
				break;
			case EOF:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 27:
			case 28:
			case 29:
			case 36:
			case 39:
			case 42:
			case 43:
			case 45:
			case 48:
				{
				alt29=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:261:4: identifier rs
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_statement1046);
					identifier139=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier139.getTree());

					pushFollow(FOLLOW_rs_in_statement1048);
					rs140=rs();
					state._fsp--;

					adaptor.addChild(root_0, rs140.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:262:3: gotostatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_gotostatement_in_statement1052);
					gotostatement141=gotostatement();
					state._fsp--;

					adaptor.addChild(root_0, gotostatement141.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:263:3: ifclause j
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifclause_in_statement1056);
					ifclause142=ifclause();
					state._fsp--;

					adaptor.addChild(root_0, ifclause142.getTree());

					pushFollow(FOLLOW_j_in_statement1058);
					j143=j();
					state._fsp--;

					adaptor.addChild(root_0, j143.getTree());

					}
					break;
				case 4 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:264:3: forclause statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forclause_in_statement1062);
					forclause144=forclause();
					state._fsp--;

					adaptor.addChild(root_0, forclause144.getTree());

					pushFollow(FOLLOW_statement_in_statement1064);
					statement145=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement145.getTree());

					}
					break;
				case 5 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:265:3: begin
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_begin_in_statement1068);
					begin146=begin();
					state._fsp--;

					adaptor.addChild(root_0, begin146.getTree());

					}
					break;
				case 6 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:266:3: actualparametrepart
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_actualparametrepart_in_statement1072);
					actualparametrepart147=actualparametrepart();
					state._fsp--;

					adaptor.addChild(root_0, actualparametrepart147.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class rs_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rs"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:269:1: rs : ( cc | ':' m );
	public final algolFParser.rs_return rs() throws RecognitionException {
		algolFParser.rs_return retval = new algolFParser.rs_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal149=null;
		ParserRuleReturnScope cc148 =null;
		ParserRuleReturnScope m150 =null;

		CommonTree char_literal149_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:269:4: ( cc | ':' m )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==EOF||LA30_0==16||(LA30_0 >= 22 && LA30_0 <= 23)||LA30_0==29) ) {
				alt30=1;
			}
			else if ( (LA30_0==21) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:269:6: cc
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cc_in_rs1083);
					cc148=cc();
					state._fsp--;

					adaptor.addChild(root_0, cc148.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:270:4: ':' m
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal149=(Token)match(input,21,FOLLOW_21_in_rs1088); 
					char_literal149_tree = (CommonTree)adaptor.create(char_literal149);
					adaptor.addChild(root_0, char_literal149_tree);

					pushFollow(FOLLOW_m_in_rs1090);
					m150=m();
					state._fsp--;

					adaptor.addChild(root_0, m150.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rs"


	public static class m_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "m"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:273:1: m : ( label ':' m | gotostatement | ifclause j | forclause statement | begin | cc );
	public final algolFParser.m_return m() throws RecognitionException {
		algolFParser.m_return retval = new algolFParser.m_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal152=null;
		ParserRuleReturnScope label151 =null;
		ParserRuleReturnScope m153 =null;
		ParserRuleReturnScope gotostatement154 =null;
		ParserRuleReturnScope ifclause155 =null;
		ParserRuleReturnScope j156 =null;
		ParserRuleReturnScope forclause157 =null;
		ParserRuleReturnScope statement158 =null;
		ParserRuleReturnScope begin159 =null;
		ParserRuleReturnScope cc160 =null;

		CommonTree char_literal152_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:273:3: ( label ':' m | gotostatement | ifclause j | forclause statement | begin | cc )
			int alt31=6;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt31=1;
				}
				break;
			case 31:
				{
				alt31=2;
				}
				break;
			case 32:
				{
				alt31=3;
				}
				break;
			case 30:
				{
				alt31=4;
				}
				break;
			case 25:
				{
				alt31=5;
				}
				break;
			case EOF:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 27:
			case 28:
			case 29:
			case 36:
			case 39:
			case 42:
			case 43:
			case 45:
			case 48:
				{
				alt31=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:273:5: label ':' m
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_label_in_m1102);
					label151=label();
					state._fsp--;

					adaptor.addChild(root_0, label151.getTree());

					char_literal152=(Token)match(input,21,FOLLOW_21_in_m1104); 
					char_literal152_tree = (CommonTree)adaptor.create(char_literal152);
					adaptor.addChild(root_0, char_literal152_tree);

					pushFollow(FOLLOW_m_in_m1106);
					m153=m();
					state._fsp--;

					adaptor.addChild(root_0, m153.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:274:4: gotostatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_gotostatement_in_m1111);
					gotostatement154=gotostatement();
					state._fsp--;

					adaptor.addChild(root_0, gotostatement154.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:275:3: ifclause j
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifclause_in_m1115);
					ifclause155=ifclause();
					state._fsp--;

					adaptor.addChild(root_0, ifclause155.getTree());

					pushFollow(FOLLOW_j_in_m1117);
					j156=j();
					state._fsp--;

					adaptor.addChild(root_0, j156.getTree());

					}
					break;
				case 4 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:276:3: forclause statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forclause_in_m1121);
					forclause157=forclause();
					state._fsp--;

					adaptor.addChild(root_0, forclause157.getTree());

					pushFollow(FOLLOW_statement_in_m1123);
					statement158=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement158.getTree());

					}
					break;
				case 5 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:277:3: begin
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_begin_in_m1127);
					begin159=begin();
					state._fsp--;

					adaptor.addChild(root_0, begin159.getTree());

					}
					break;
				case 6 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:278:3: cc
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cc_in_m1132);
					cc160=cc();
					state._fsp--;

					adaptor.addChild(root_0, cc160.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "m"


	public static class st_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "st"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:281:1: st : ( identifier cc | gotostatement | ifclause j | forclause statement );
	public final algolFParser.st_return st() throws RecognitionException {
		algolFParser.st_return retval = new algolFParser.st_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier161 =null;
		ParserRuleReturnScope cc162 =null;
		ParserRuleReturnScope gotostatement163 =null;
		ParserRuleReturnScope ifclause164 =null;
		ParserRuleReturnScope j165 =null;
		ParserRuleReturnScope forclause166 =null;
		ParserRuleReturnScope statement167 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:281:4: ( identifier cc | gotostatement | ifclause j | forclause statement )
			int alt32=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt32=1;
				}
				break;
			case 31:
				{
				alt32=2;
				}
				break;
			case 32:
				{
				alt32=3;
				}
				break;
			case 30:
				{
				alt32=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:281:5: identifier cc
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_st1141);
					identifier161=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier161.getTree());

					pushFollow(FOLLOW_cc_in_st1143);
					cc162=cc();
					state._fsp--;

					adaptor.addChild(root_0, cc162.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:282:13: gotostatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_gotostatement_in_st1157);
					gotostatement163=gotostatement();
					state._fsp--;

					adaptor.addChild(root_0, gotostatement163.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:283:12: ifclause j
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifclause_in_st1170);
					ifclause164=ifclause();
					state._fsp--;

					adaptor.addChild(root_0, ifclause164.getTree());

					pushFollow(FOLLOW_j_in_st1172);
					j165=j();
					state._fsp--;

					adaptor.addChild(root_0, j165.getTree());

					}
					break;
				case 4 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:284:13: forclause statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forclause_in_st1186);
					forclause166=forclause();
					state._fsp--;

					adaptor.addChild(root_0, forclause166.getTree());

					pushFollow(FOLLOW_statement_in_st1188);
					statement167=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement167.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "st"


	public static class forclause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forclause"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:289:1: forclause : 'FOR' simpleARi ':=' forlist 'DO' ;
	public final algolFParser.forclause_return forclause() throws RecognitionException {
		algolFParser.forclause_return retval = new algolFParser.forclause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal168=null;
		Token string_literal170=null;
		Token string_literal172=null;
		ParserRuleReturnScope simpleARi169 =null;
		ParserRuleReturnScope forlist171 =null;

		CommonTree string_literal168_tree=null;
		CommonTree string_literal170_tree=null;
		CommonTree string_literal172_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:290:2: ( 'FOR' simpleARi ':=' forlist 'DO' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:290:4: 'FOR' simpleARi ':=' forlist 'DO'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal168=(Token)match(input,30,FOLLOW_30_in_forclause1203); 
			string_literal168_tree = (CommonTree)adaptor.create(string_literal168);
			adaptor.addChild(root_0, string_literal168_tree);

			pushFollow(FOLLOW_simpleARi_in_forclause1205);
			simpleARi169=simpleARi();
			state._fsp--;

			adaptor.addChild(root_0, simpleARi169.getTree());

			string_literal170=(Token)match(input,22,FOLLOW_22_in_forclause1207); 
			string_literal170_tree = (CommonTree)adaptor.create(string_literal170);
			adaptor.addChild(root_0, string_literal170_tree);

			pushFollow(FOLLOW_forlist_in_forclause1209);
			forlist171=forlist();
			state._fsp--;

			adaptor.addChild(root_0, forlist171.getTree());

			string_literal172=(Token)match(input,27,FOLLOW_27_in_forclause1211); 
			string_literal172_tree = (CommonTree)adaptor.create(string_literal172);
			adaptor.addChild(root_0, string_literal172_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forclause"


	public static class forlist_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forlist"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:293:1: forlist : forlistelement n ;
	public final algolFParser.forlist_return forlist() throws RecognitionException {
		algolFParser.forlist_return retval = new algolFParser.forlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope forlistelement173 =null;
		ParserRuleReturnScope n174 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:293:9: ( forlistelement n )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:293:11: forlistelement n
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_forlistelement_in_forlist1222);
			forlistelement173=forlistelement();
			state._fsp--;

			adaptor.addChild(root_0, forlistelement173.getTree());

			pushFollow(FOLLOW_n_in_forlist1224);
			n174=n();
			state._fsp--;

			adaptor.addChild(root_0, n174.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forlist"


	public static class n_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "n"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:296:1: n : ( ',' forlistelement n |);
	public final algolFParser.n_return n() throws RecognitionException {
		algolFParser.n_return retval = new algolFParser.n_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal175=null;
		ParserRuleReturnScope forlistelement176 =null;
		ParserRuleReturnScope n177 =null;

		CommonTree char_literal175_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:296:3: ( ',' forlistelement n |)
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==19) ) {
				alt33=1;
			}
			else if ( (LA33_0==27) ) {
				alt33=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:296:5: ',' forlistelement n
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal175=(Token)match(input,19,FOLLOW_19_in_n1235); 
					char_literal175_tree = (CommonTree)adaptor.create(char_literal175);
					adaptor.addChild(root_0, char_literal175_tree);

					pushFollow(FOLLOW_forlistelement_in_n1237);
					forlistelement176=forlistelement();
					state._fsp--;

					adaptor.addChild(root_0, forlistelement176.getTree());

					pushFollow(FOLLOW_n_in_n1239);
					n177=n();
					state._fsp--;

					adaptor.addChild(root_0, n177.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:298:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "n"


	public static class forlistelement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forlistelement"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:300:1: forlistelement : simpleARi q ;
	public final algolFParser.forlistelement_return forlistelement() throws RecognitionException {
		algolFParser.forlistelement_return retval = new algolFParser.forlistelement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope simpleARi178 =null;
		ParserRuleReturnScope q179 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:301:2: ( simpleARi q )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:301:3: simpleARi q
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_simpleARi_in_forlistelement1254);
			simpleARi178=simpleARi();
			state._fsp--;

			adaptor.addChild(root_0, simpleARi178.getTree());

			pushFollow(FOLLOW_q_in_forlistelement1256);
			q179=q();
			state._fsp--;

			adaptor.addChild(root_0, q179.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forlistelement"


	public static class q_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "q"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:304:1: q : (| 'STEP' simpleARi 'UNTIL' expression | 'WHILE' expression );
	public final algolFParser.q_return q() throws RecognitionException {
		algolFParser.q_return retval = new algolFParser.q_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal180=null;
		Token string_literal182=null;
		Token string_literal184=null;
		ParserRuleReturnScope simpleARi181 =null;
		ParserRuleReturnScope expression183 =null;
		ParserRuleReturnScope expression185 =null;

		CommonTree string_literal180_tree=null;
		CommonTree string_literal182_tree=null;
		CommonTree string_literal184_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:304:3: (| 'STEP' simpleARi 'UNTIL' expression | 'WHILE' expression )
			int alt34=3;
			switch ( input.LA(1) ) {
			case 19:
			case 27:
				{
				alt34=1;
				}
				break;
			case 39:
				{
				alt34=2;
				}
				break;
			case 45:
				{
				alt34=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:304:4: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:304:5: 'STEP' simpleARi 'UNTIL' expression
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal180=(Token)match(input,39,FOLLOW_39_in_q1266); 
					string_literal180_tree = (CommonTree)adaptor.create(string_literal180);
					adaptor.addChild(root_0, string_literal180_tree);

					pushFollow(FOLLOW_simpleARi_in_q1267);
					simpleARi181=simpleARi();
					state._fsp--;

					adaptor.addChild(root_0, simpleARi181.getTree());

					string_literal182=(Token)match(input,43,FOLLOW_43_in_q1269); 
					string_literal182_tree = (CommonTree)adaptor.create(string_literal182);
					adaptor.addChild(root_0, string_literal182_tree);

					pushFollow(FOLLOW_expression_in_q1270);
					expression183=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression183.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:305:11: 'WHILE' expression
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal184=(Token)match(input,45,FOLLOW_45_in_q1282); 
					string_literal184_tree = (CommonTree)adaptor.create(string_literal184);
					adaptor.addChild(root_0, string_literal184_tree);

					pushFollow(FOLLOW_expression_in_q1283);
					expression185=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression185.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "q"


	public static class k_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "k"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:314:1: k : ( 'ELSE' statement |);
	public final algolFParser.k_return k() throws RecognitionException {
		algolFParser.k_return retval = new algolFParser.k_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal186=null;
		ParserRuleReturnScope statement187 =null;

		CommonTree string_literal186_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:314:3: ( 'ELSE' statement |)
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==28) ) {
				alt35=1;
			}
			else if ( (LA35_0==EOF||LA35_0==23||LA35_0==29) ) {
				alt35=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:314:5: 'ELSE' statement
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal186=(Token)match(input,28,FOLLOW_28_in_k1324); 
					string_literal186_tree = (CommonTree)adaptor.create(string_literal186);
					adaptor.addChild(root_0, string_literal186_tree);

					pushFollow(FOLLOW_statement_in_k1326);
					statement187=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement187.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:315:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "k"


	public static class y_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "y"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:323:1: y : ( identifier cc | gotostatement | begin |);
	public final algolFParser.y_return y() throws RecognitionException {
		algolFParser.y_return retval = new algolFParser.y_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier188 =null;
		ParserRuleReturnScope cc189 =null;
		ParserRuleReturnScope gotostatement190 =null;
		ParserRuleReturnScope begin191 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:323:3: ( identifier cc | gotostatement | begin |)
			int alt36=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt36=1;
				}
				break;
			case 31:
				{
				alt36=2;
				}
				break;
			case 25:
				{
				alt36=3;
				}
				break;
			case EOF:
			case 23:
			case 28:
			case 29:
				{
				alt36=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:323:5: identifier cc
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_y1347);
					identifier188=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier188.getTree());

					pushFollow(FOLLOW_cc_in_y1349);
					cc189=cc();
					state._fsp--;

					adaptor.addChild(root_0, cc189.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:324:4: gotostatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_gotostatement_in_y1354);
					gotostatement190=gotostatement();
					state._fsp--;

					adaptor.addChild(root_0, gotostatement190.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:325:3: begin
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_begin_in_y1358);
					begin191=begin();
					state._fsp--;

					adaptor.addChild(root_0, begin191.getTree());

					}
					break;
				case 4 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:327:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "y"


	public static class j_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "j"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:333:1: j : ( forclause statement | identifier u || gotostatement | begin );
	public final algolFParser.j_return j() throws RecognitionException {
		algolFParser.j_return retval = new algolFParser.j_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope forclause192 =null;
		ParserRuleReturnScope statement193 =null;
		ParserRuleReturnScope identifier194 =null;
		ParserRuleReturnScope u195 =null;
		ParserRuleReturnScope gotostatement196 =null;
		ParserRuleReturnScope begin197 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:333:3: ( forclause statement | identifier u || gotostatement | begin )
			int alt37=5;
			switch ( input.LA(1) ) {
			case 30:
				{
				alt37=1;
				}
				break;
			case ID:
				{
				alt37=2;
				}
				break;
			case EOF:
			case 23:
			case 29:
				{
				alt37=3;
				}
				break;
			case 31:
				{
				alt37=4;
				}
				break;
			case 25:
				{
				alt37=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:333:5: forclause statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forclause_in_j1379);
					forclause192=forclause();
					state._fsp--;

					adaptor.addChild(root_0, forclause192.getTree());

					pushFollow(FOLLOW_statement_in_j1381);
					statement193=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement193.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:333:27: identifier u
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_j1385);
					identifier194=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier194.getTree());

					pushFollow(FOLLOW_u_in_j1387);
					u195=u();
					state._fsp--;

					adaptor.addChild(root_0, u195.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:333:42: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 4 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:333:45: gotostatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_gotostatement_in_j1394);
					gotostatement196=gotostatement();
					state._fsp--;

					adaptor.addChild(root_0, gotostatement196.getTree());

					}
					break;
				case 5 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:333:59: begin
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_begin_in_j1396);
					begin197=begin();
					state._fsp--;

					adaptor.addChild(root_0, begin197.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "j"


	public static class u_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "u"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:340:1: u : ( cc k | ':' w );
	public final algolFParser.u_return u() throws RecognitionException {
		algolFParser.u_return retval = new algolFParser.u_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal200=null;
		ParserRuleReturnScope cc198 =null;
		ParserRuleReturnScope k199 =null;
		ParserRuleReturnScope w201 =null;

		CommonTree char_literal200_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:340:3: ( cc k | ':' w )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==EOF||LA38_0==16||(LA38_0 >= 22 && LA38_0 <= 23)||(LA38_0 >= 28 && LA38_0 <= 29)) ) {
				alt38=1;
			}
			else if ( (LA38_0==21) ) {
				alt38=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:340:5: cc k
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cc_in_u1413);
					cc198=cc();
					state._fsp--;

					adaptor.addChild(root_0, cc198.getTree());

					pushFollow(FOLLOW_k_in_u1415);
					k199=k();
					state._fsp--;

					adaptor.addChild(root_0, k199.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:341:4: ':' w
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal200=(Token)match(input,21,FOLLOW_21_in_u1420); 
					char_literal200_tree = (CommonTree)adaptor.create(char_literal200);
					adaptor.addChild(root_0, char_literal200_tree);

					pushFollow(FOLLOW_w_in_u1422);
					w201=w();
					state._fsp--;

					adaptor.addChild(root_0, w201.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "u"


	public static class w_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "w"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:344:1: w : ( forstatement ( label ':' )* forstatement | y k );
	public final algolFParser.w_return w() throws RecognitionException {
		algolFParser.w_return retval = new algolFParser.w_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal204=null;
		ParserRuleReturnScope forstatement202 =null;
		ParserRuleReturnScope label203 =null;
		ParserRuleReturnScope forstatement205 =null;
		ParserRuleReturnScope y206 =null;
		ParserRuleReturnScope k207 =null;

		CommonTree char_literal204_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:344:3: ( forstatement ( label ':' )* forstatement | y k )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==46) ) {
				alt40=1;
			}
			else if ( (LA40_0==EOF||LA40_0==ID||LA40_0==23||LA40_0==25||(LA40_0 >= 28 && LA40_0 <= 29)||LA40_0==31) ) {
				alt40=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:344:5: forstatement ( label ':' )* forstatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forstatement_in_w1432);
					forstatement202=forstatement();
					state._fsp--;

					adaptor.addChild(root_0, forstatement202.getTree());

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:344:18: ( label ':' )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==ID) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:344:19: label ':'
							{
							pushFollow(FOLLOW_label_in_w1435);
							label203=label();
							state._fsp--;

							adaptor.addChild(root_0, label203.getTree());

							char_literal204=(Token)match(input,21,FOLLOW_21_in_w1437); 
							char_literal204_tree = (CommonTree)adaptor.create(char_literal204);
							adaptor.addChild(root_0, char_literal204_tree);

							}
							break;

						default :
							break loop39;
						}
					}

					pushFollow(FOLLOW_forstatement_in_w1441);
					forstatement205=forstatement();
					state._fsp--;

					adaptor.addChild(root_0, forstatement205.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:345:5: y k
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_y_in_w1447);
					y206=y();
					state._fsp--;

					adaptor.addChild(root_0, y206.getTree());

					pushFollow(FOLLOW_k_in_w1449);
					k207=k();
					state._fsp--;

					adaptor.addChild(root_0, k207.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "w"


	public static class cc_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cc"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:365:1: cc : ( ':=' simpleAR | actualparametrepart );
	public final algolFParser.cc_return cc() throws RecognitionException {
		algolFParser.cc_return retval = new algolFParser.cc_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal208=null;
		ParserRuleReturnScope simpleAR209 =null;
		ParserRuleReturnScope actualparametrepart210 =null;

		CommonTree string_literal208_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:365:4: ( ':=' simpleAR | actualparametrepart )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==22) ) {
				alt41=1;
			}
			else if ( (LA41_0==EOF||LA41_0==16||LA41_0==23||(LA41_0 >= 28 && LA41_0 <= 29)) ) {
				alt41=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:365:6: ':=' simpleAR
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal208=(Token)match(input,22,FOLLOW_22_in_cc1482); 
					string_literal208_tree = (CommonTree)adaptor.create(string_literal208);
					adaptor.addChild(root_0, string_literal208_tree);

					pushFollow(FOLLOW_simpleAR_in_cc1485);
					simpleAR209=simpleAR();
					state._fsp--;

					adaptor.addChild(root_0, simpleAR209.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:366:4: actualparametrepart
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_actualparametrepart_in_cc1490);
					actualparametrepart210=actualparametrepart();
					state._fsp--;

					adaptor.addChild(root_0, actualparametrepart210.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cc"


	public static class actualparametrepart_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "actualparametrepart"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:370:1: actualparametrepart : ( '(' actualparalist ')' |);
	public final algolFParser.actualparametrepart_return actualparametrepart() throws RecognitionException {
		algolFParser.actualparametrepart_return retval = new algolFParser.actualparametrepart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal211=null;
		Token char_literal213=null;
		ParserRuleReturnScope actualparalist212 =null;

		CommonTree char_literal211_tree=null;
		CommonTree char_literal213_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:371:2: ( '(' actualparalist ')' |)
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==16) ) {
				alt42=1;
			}
			else if ( (LA42_0==EOF||(LA42_0 >= 17 && LA42_0 <= 23)||(LA42_0 >= 27 && LA42_0 <= 29)||LA42_0==36||LA42_0==39||(LA42_0 >= 42 && LA42_0 <= 43)||LA42_0==45||LA42_0==48) ) {
				alt42=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:371:4: '(' actualparalist ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal211=(Token)match(input,16,FOLLOW_16_in_actualparametrepart1503); 
					char_literal211_tree = (CommonTree)adaptor.create(char_literal211);
					adaptor.addChild(root_0, char_literal211_tree);

					pushFollow(FOLLOW_actualparalist_in_actualparametrepart1505);
					actualparalist212=actualparalist();
					state._fsp--;

					adaptor.addChild(root_0, actualparalist212.getTree());

					char_literal213=(Token)match(input,17,FOLLOW_17_in_actualparametrepart1506); 
					char_literal213_tree = (CommonTree)adaptor.create(char_literal213);
					adaptor.addChild(root_0, char_literal213_tree);

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:373:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actualparametrepart"


	public static class actualparalist_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "actualparalist"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:375:1: actualparalist : actualpara p ;
	public final algolFParser.actualparalist_return actualparalist() throws RecognitionException {
		algolFParser.actualparalist_return retval = new algolFParser.actualparalist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope actualpara214 =null;
		ParserRuleReturnScope p215 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:376:2: ( actualpara p )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:376:4: actualpara p
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_actualpara_in_actualparalist1521);
			actualpara214=actualpara();
			state._fsp--;

			adaptor.addChild(root_0, actualpara214.getTree());

			pushFollow(FOLLOW_p_in_actualparalist1523);
			p215=p();
			state._fsp--;

			adaptor.addChild(root_0, p215.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actualparalist"


	public static class p_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "p"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:379:1: p : ( paralim actualpara p |);
	public final algolFParser.p_return p() throws RecognitionException {
		algolFParser.p_return retval = new algolFParser.p_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope paralim216 =null;
		ParserRuleReturnScope actualpara217 =null;
		ParserRuleReturnScope p218 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:380:2: ( paralim actualpara p |)
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==16||LA43_0==19) ) {
				alt43=1;
			}
			else if ( (LA43_0==17) ) {
				alt43=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:380:4: paralim actualpara p
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paralim_in_p1535);
					paralim216=paralim();
					state._fsp--;

					adaptor.addChild(root_0, paralim216.getTree());

					pushFollow(FOLLOW_actualpara_in_p1537);
					actualpara217=actualpara();
					state._fsp--;

					adaptor.addChild(root_0, actualpara217.getTree());

					pushFollow(FOLLOW_p_in_p1539);
					p218=p();
					state._fsp--;

					adaptor.addChild(root_0, p218.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:382:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "p"


	public static class actualpara_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "actualpara"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:384:1: actualpara : identifier ;
	public final algolFParser.actualpara_return actualpara() throws RecognitionException {
		algolFParser.actualpara_return retval = new algolFParser.actualpara_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier219 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:385:2: ( identifier )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:385:4: identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_actualpara1553);
			identifier219=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier219.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actualpara"


	public static class leftpart_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "leftpart"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:391:1: leftpart : identifier ':=' ;
	public final algolFParser.leftpart_return leftpart() throws RecognitionException {
		algolFParser.leftpart_return retval = new algolFParser.leftpart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal221=null;
		ParserRuleReturnScope identifier220 =null;

		CommonTree string_literal221_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:391:9: ( identifier ':=' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:391:11: identifier ':='
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_leftpart1568);
			identifier220=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier220.getTree());

			string_literal221=(Token)match(input,22,FOLLOW_22_in_leftpart1570); 
			string_literal221_tree = (CommonTree)adaptor.create(string_literal221);
			adaptor.addChild(root_0, string_literal221_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "leftpart"


	public static class gotostatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "gotostatement"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:395:1: gotostatement : 'GOTO' designExp ;
	public final algolFParser.gotostatement_return gotostatement() throws RecognitionException {
		algolFParser.gotostatement_return retval = new algolFParser.gotostatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal222=null;
		ParserRuleReturnScope designExp223 =null;

		CommonTree string_literal222_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:396:2: ( 'GOTO' designExp )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:396:4: 'GOTO' designExp
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal222=(Token)match(input,31,FOLLOW_31_in_gotostatement1584); 
			string_literal222_tree = (CommonTree)adaptor.create(string_literal222);
			adaptor.addChild(root_0, string_literal222_tree);

			pushFollow(FOLLOW_designExp_in_gotostatement1586);
			designExp223=designExp();
			state._fsp--;

			adaptor.addChild(root_0, designExp223.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "gotostatement"


	public static class forstatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forstatement"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:401:1: forstatement : 'Y' ;
	public final algolFParser.forstatement_return forstatement() throws RecognitionException {
		algolFParser.forstatement_return retval = new algolFParser.forstatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal224=null;

		CommonTree char_literal224_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:402:2: ( 'Y' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:402:4: 'Y'
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal224=(Token)match(input,46,FOLLOW_46_in_forstatement1601); 
			char_literal224_tree = (CommonTree)adaptor.create(char_literal224);
			adaptor.addChild(root_0, char_literal224_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forstatement"

	// Delegated rules



	public static final BitSet FOLLOW_prog1_in_prog61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleAR_in_expression74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifclause_in_expression78 = new BitSet(new long[]{0x0000000000010200L});
	public static final BitSet FOLLOW_ei_in_expression80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDesign_in_ei91 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_ei93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleARi_in_simpleAR103 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_simpleAR105 = new BitSet(new long[]{0x0000000000010A00L});
	public static final BitSet FOLLOW_simpleARi_in_simpleAR107 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_multExp_in_simpleARi119 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_18_in_simpleARi122 = new BitSet(new long[]{0x0000000000010A00L});
	public static final BitSet FOLLOW_20_in_simpleARi127 = new BitSet(new long[]{0x0000000000010A00L});
	public static final BitSet FOLLOW_multExp_in_simpleARi131 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_powExp_in_multExp147 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_multExp149 = new BitSet(new long[]{0x0000000000010A00L});
	public static final BitSet FOLLOW_powExp_in_multExp152 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_identifier_in_powExp165 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_actualparametrepart_in_powExp167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_powExp179 = new BitSet(new long[]{0x0000000100010A00L});
	public static final BitSet FOLLOW_expression_in_powExp181 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_powExp183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_powExp195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_prog1221 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_prog1244 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_prog1246 = new BitSet(new long[]{0x0000000002000200L});
	public static final BitSet FOLLOW_begin_in_prog1250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_label276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_localorown302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_localorown304 = new BitSet(new long[]{0x0000004204000000L});
	public static final BitSet FOLLOW_type_in_localorown306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_typeliste332 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_t_in_typeliste334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_t343 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_typeliste_in_t344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayseg_in_arraylist359 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_a_in_arraylist361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_a371 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_arrayseg_in_a373 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_a_in_a375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_arrayseg388 = new BitSet(new long[]{0x0000800000080000L});
	public static final BitSet FOLLOW_r_in_arrayseg390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_r398 = new BitSet(new long[]{0x0000000000010A00L});
	public static final BitSet FOLLOW_boundplist_in_r400 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_r401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_r406 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_arrayseg_in_r408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boundp_in_boundplist420 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_z_in_boundplist422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_z433 = new BitSet(new long[]{0x0000000000010A00L});
	public static final BitSet FOLLOW_boundp_in_z435 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_z_in_z437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleARi_in_boundp450 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_boundp452 = new BitSet(new long[]{0x0000000000010A00L});
	public static final BitSet FOLLOW_simpleARi_in_boundp454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeliste_in_typedeclaration465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_typedeclaration468 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_arraylist_in_typedeclaration470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_in_typedeclaration473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_typedeclaration2481 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_arraylist_in_typedeclaration2483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_in_typedeclaration2486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_switchdec496 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_switchdec498 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_switchdec500 = new BitSet(new long[]{0x0000000100010200L});
	public static final BitSet FOLLOW_switchlist_in_switchdec502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designExp_in_switchlist515 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_s_in_switchlist517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_s526 = new BitSet(new long[]{0x0000000100010200L});
	public static final BitSet FOLLOW_designExp_in_s528 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_s_in_s530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_procedure543 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_procedurehead_in_procedure545 = new BitSet(new long[]{0x00000001C2010200L});
	public static final BitSet FOLLOW_statement_in_procedure547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_procedurehead563 = new BitSet(new long[]{0x0000000000810000L});
	public static final BitSet FOLLOW_formalparameterpart_in_procedurehead565 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_procedurehead567 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_valuepart_in_procedurehead569 = new BitSet(new long[]{0x0000036605000000L});
	public static final BitSet FOLLOW_specificationpart_in_procedurehead571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_formalparameterpart585 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_formalparameterlist_in_formalparameterpart587 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_formalparameterpart589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specifier_in_specificationpart607 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_specificationpart609 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_specificationpart611 = new BitSet(new long[]{0x0000036605000000L});
	public static final BitSet FOLLOW_specificationpart_in_specificationpart613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_specifier627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_specifier631 = new BitSet(new long[]{0x0000002001000000L});
	public static final BitSet FOLLOW_h_in_specifier634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_specifier637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_specifier641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_specifier645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_specifier649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_h662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_h665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalpara_in_formalparameterlist677 = new BitSet(new long[]{0x0000000000090000L});
	public static final BitSet FOLLOW_g_in_formalparameterlist679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paralim_in_g690 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_formalpara_in_g692 = new BitSet(new long[]{0x0000000000090000L});
	public static final BitSet FOLLOW_g_in_g694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_formalpara709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_paralim719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_paralim722 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_paralim725 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_paralim727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_valuepart737 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_valuepart739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDesign_in_designExp754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifclause_in_designExp758 = new BitSet(new long[]{0x0000000000010200L});
	public static final BitSet FOLLOW_simpleDesign_in_designExp760 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_designExp762 = new BitSet(new long[]{0x0000000100010200L});
	public static final BitSet FOLLOW_designExp_in_designExp764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_simpleDesign777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_simpleDesign781 = new BitSet(new long[]{0x0000000100010200L});
	public static final BitSet FOLLOW_designExp_in_simpleDesign783 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_simpleDesign785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_ifclause798 = new BitSet(new long[]{0x0000000100010A00L});
	public static final BitSet FOLLOW_expression_in_ifclause800 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ifclause802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localorown_in_declaration845 = new BitSet(new long[]{0x0000002001000200L});
	public static final BitSet FOLLOW_typedeclaration_in_declaration847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typedeclaration2_in_declaration850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchdec_in_declaration852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_begin861 = new BitSet(new long[]{0x0000026BC7010200L});
	public static final BitSet FOLLOW_d_in_begin863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_d880 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_d882 = new BitSet(new long[]{0x0000026BC7010200L});
	public static final BitSet FOLLOW_declaration_in_d885 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_d887 = new BitSet(new long[]{0x0000026BC7010200L});
	public static final BitSet FOLLOW_compoundT_in_d891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundT_in_d896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_compoundT1009 = new BitSet(new long[]{0x0000000020800000L});
	public static final BitSet FOLLOW_c_in_compoundT1011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_c1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_c1023 = new BitSet(new long[]{0x00000001C2010200L});
	public static final BitSet FOLLOW_compoundT_in_c1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_statement1046 = new BitSet(new long[]{0x0000000000610000L});
	public static final BitSet FOLLOW_rs_in_statement1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gotostatement_in_statement1052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifclause_in_statement1056 = new BitSet(new long[]{0x00000000C2000200L});
	public static final BitSet FOLLOW_j_in_statement1058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forclause_in_statement1062 = new BitSet(new long[]{0x00000001C2010200L});
	public static final BitSet FOLLOW_statement_in_statement1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_statement1068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualparametrepart_in_statement1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cc_in_rs1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rs1088 = new BitSet(new long[]{0x00000001C2410200L});
	public static final BitSet FOLLOW_m_in_rs1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_m1102 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_m1104 = new BitSet(new long[]{0x00000001C2410200L});
	public static final BitSet FOLLOW_m_in_m1106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gotostatement_in_m1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifclause_in_m1115 = new BitSet(new long[]{0x00000000C2000200L});
	public static final BitSet FOLLOW_j_in_m1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forclause_in_m1121 = new BitSet(new long[]{0x00000001C2010200L});
	public static final BitSet FOLLOW_statement_in_m1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_m1127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cc_in_m1132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_st1141 = new BitSet(new long[]{0x0000000000410000L});
	public static final BitSet FOLLOW_cc_in_st1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gotostatement_in_st1157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifclause_in_st1170 = new BitSet(new long[]{0x00000000C2000200L});
	public static final BitSet FOLLOW_j_in_st1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forclause_in_st1186 = new BitSet(new long[]{0x00000001C2010200L});
	public static final BitSet FOLLOW_statement_in_st1188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_forclause1203 = new BitSet(new long[]{0x0000000000010A00L});
	public static final BitSet FOLLOW_simpleARi_in_forclause1205 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_forclause1207 = new BitSet(new long[]{0x0000000000010A00L});
	public static final BitSet FOLLOW_forlist_in_forclause1209 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_forclause1211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forlistelement_in_forlist1222 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_n_in_forlist1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_n1235 = new BitSet(new long[]{0x0000000000010A00L});
	public static final BitSet FOLLOW_forlistelement_in_n1237 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_n_in_n1239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleARi_in_forlistelement1254 = new BitSet(new long[]{0x0000208000000000L});
	public static final BitSet FOLLOW_q_in_forlistelement1256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_q1266 = new BitSet(new long[]{0x0000000000010A00L});
	public static final BitSet FOLLOW_simpleARi_in_q1267 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_q1269 = new BitSet(new long[]{0x0000000100010A00L});
	public static final BitSet FOLLOW_expression_in_q1270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_q1282 = new BitSet(new long[]{0x0000000100010A00L});
	public static final BitSet FOLLOW_expression_in_q1283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_k1324 = new BitSet(new long[]{0x00000001C2010200L});
	public static final BitSet FOLLOW_statement_in_k1326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_y1347 = new BitSet(new long[]{0x0000000000410000L});
	public static final BitSet FOLLOW_cc_in_y1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gotostatement_in_y1354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_y1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forclause_in_j1379 = new BitSet(new long[]{0x00000001C2010200L});
	public static final BitSet FOLLOW_statement_in_j1381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_j1385 = new BitSet(new long[]{0x0000000000610000L});
	public static final BitSet FOLLOW_u_in_j1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gotostatement_in_j1394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_j1396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cc_in_u1413 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_k_in_u1415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_u1420 = new BitSet(new long[]{0x0000400092000200L});
	public static final BitSet FOLLOW_w_in_u1422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstatement_in_w1432 = new BitSet(new long[]{0x0000400000000200L});
	public static final BitSet FOLLOW_label_in_w1435 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_w1437 = new BitSet(new long[]{0x0000400000000200L});
	public static final BitSet FOLLOW_forstatement_in_w1441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_y_in_w1447 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_k_in_w1449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_cc1482 = new BitSet(new long[]{0x0000000000010A00L});
	public static final BitSet FOLLOW_simpleAR_in_cc1485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualparametrepart_in_cc1490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_actualparametrepart1503 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_actualparalist_in_actualparametrepart1505 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_actualparametrepart1506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualpara_in_actualparalist1521 = new BitSet(new long[]{0x0000000000090000L});
	public static final BitSet FOLLOW_p_in_actualparalist1523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paralim_in_p1535 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_actualpara_in_p1537 = new BitSet(new long[]{0x0000000000090000L});
	public static final BitSet FOLLOW_p_in_p1539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_actualpara1553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_leftpart1568 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_leftpart1570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_gotostatement1584 = new BitSet(new long[]{0x0000000100010200L});
	public static final BitSet FOLLOW_designExp_in_gotostatement1586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_forstatement1601 = new BitSet(new long[]{0x0000000000000002L});
}
