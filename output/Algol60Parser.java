// $ANTLR 3.5.1 /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g 2019-11-05 18:01:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class Algol60Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BEGIN", "COMMENT", "DEC", "DIV", 
		"ELSE", "EQ", "EQV", "ESC_SEQ", "EXPONENT", "FALSE", "FLOAT", "FOR", "GOTO", 
		"GREATER", "HEX_DIGIT", "ID", "IF", "INT", "LESS", "LOCAL", "MULT", "NOT", 
		"OCTAL_ESC", "PLUS", "PROG", "STRING", "SWITCH", "THEN", "TRUE", "TYPE", 
		"UNICODE_ESC", "'('", "')'", "'+'", "','", "'-'", "':'", "':='", "';'", 
		"'ARRAY'", "'BEGIN'", "'BOOLEAN'", "'DO'", "'ELSE'", "'END'", "'FOR'", 
		"'GOTO'", "'IF'", "'INTEGER'", "'LABEL'", "'OWN'", "'POW'", "'PROCEDURE'", 
		"'REAL'", "'STEP'", "'STRING'", "'SWITCH'", "'THEN'", "'UNTIL'", "'VALUE'", 
		"'WHILE'", "'Y'", "'['", "']'"
	};
	public static final int EOF=-1;
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
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int BEGIN=4;
	public static final int COMMENT=5;
	public static final int DEC=6;
	public static final int DIV=7;
	public static final int ELSE=8;
	public static final int EQ=9;
	public static final int EQV=10;
	public static final int ESC_SEQ=11;
	public static final int EXPONENT=12;
	public static final int FALSE=13;
	public static final int FLOAT=14;
	public static final int FOR=15;
	public static final int GOTO=16;
	public static final int GREATER=17;
	public static final int HEX_DIGIT=18;
	public static final int ID=19;
	public static final int IF=20;
	public static final int INT=21;
	public static final int LESS=22;
	public static final int LOCAL=23;
	public static final int MULT=24;
	public static final int NOT=25;
	public static final int OCTAL_ESC=26;
	public static final int PLUS=27;
	public static final int PROG=28;
	public static final int STRING=29;
	public static final int SWITCH=30;
	public static final int THEN=31;
	public static final int TRUE=32;
	public static final int TYPE=33;
	public static final int UNICODE_ESC=34;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public Algol60Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public Algol60Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return Algol60Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:42:1: prog : prog1 -> ^( PROG prog1 ) ;
	public final Algol60Parser.prog_return prog() throws RecognitionException {
		Algol60Parser.prog_return retval = new Algol60Parser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope prog11 =null;

		RewriteRuleSubtreeStream stream_prog1=new RewriteRuleSubtreeStream(adaptor,"rule prog1");

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:42:6: ( prog1 -> ^( PROG prog1 ) )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:42:8: prog1
			{
			pushFollow(FOLLOW_prog1_in_prog128);
			prog11=prog1();
			state._fsp--;

			stream_prog1.add(prog11.getTree());
			// AST REWRITE
			// elements: prog1
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 42:14: -> ^( PROG prog1 )
			{
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:42:16: ^( PROG prog1 )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROG, "PROG"), root_1);
				adaptor.addChild(root_1, stream_prog1.nextTree());
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
	// $ANTLR end "prog"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:45:1: expression : ( simpleAR | ifclause ei );
	public final Algol60Parser.expression_return expression() throws RecognitionException {
		Algol60Parser.expression_return retval = new Algol60Parser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope simpleAR2 =null;
		ParserRuleReturnScope ifclause3 =null;
		ParserRuleReturnScope ei4 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:46:2: ( simpleAR | ifclause ei )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==EOF||LA1_0==ID||LA1_0==INT||(LA1_0 >= 35 && LA1_0 <= 42)||(LA1_0 >= 46 && LA1_0 <= 48)||LA1_0==55||LA1_0==58||(LA1_0 >= 61 && LA1_0 <= 62)||LA1_0==64||LA1_0==67) ) {
				alt1=1;
			}
			else if ( (LA1_0==51) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:46:4: simpleAR
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simpleAR_in_expression147);
					simpleAR2=simpleAR();
					state._fsp--;

					adaptor.addChild(root_0, simpleAR2.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:46:15: ifclause ei
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifclause_in_expression151);
					ifclause3=ifclause();
					state._fsp--;

					adaptor.addChild(root_0, ifclause3.getTree());

					pushFollow(FOLLOW_ei_in_expression153);
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:49:1: ei : simpleDesign 'ELSE' ;
	public final Algol60Parser.ei_return ei() throws RecognitionException {
		Algol60Parser.ei_return retval = new Algol60Parser.ei_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal6=null;
		ParserRuleReturnScope simpleDesign5 =null;

		CommonTree string_literal6_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:49:4: ( simpleDesign 'ELSE' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:49:6: simpleDesign 'ELSE'
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_simpleDesign_in_ei164);
			simpleDesign5=simpleDesign();
			state._fsp--;

			adaptor.addChild(root_0, simpleDesign5.getTree());

			string_literal6=(Token)match(input,47,FOLLOW_47_in_ei166); 
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:52:1: simpleAR : simpleARi ( ':=' ^ simpleARi )* ;
	public final Algol60Parser.simpleAR_return simpleAR() throws RecognitionException {
		Algol60Parser.simpleAR_return retval = new Algol60Parser.simpleAR_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal8=null;
		ParserRuleReturnScope simpleARi7 =null;
		ParserRuleReturnScope simpleARi9 =null;

		CommonTree string_literal8_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:52:9: ( simpleARi ( ':=' ^ simpleARi )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:52:11: simpleARi ( ':=' ^ simpleARi )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_simpleARi_in_simpleAR176);
			simpleARi7=simpleARi();
			state._fsp--;

			adaptor.addChild(root_0, simpleARi7.getTree());

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:52:20: ( ':=' ^ simpleARi )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==41) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:52:21: ':=' ^ simpleARi
					{
					string_literal8=(Token)match(input,41,FOLLOW_41_in_simpleAR178); 
					string_literal8_tree = (CommonTree)adaptor.create(string_literal8);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal8_tree, root_0);

					pushFollow(FOLLOW_simpleARi_in_simpleAR181);
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:55:1: simpleARi : multExp ( ( '+' ^| '-' ^) multExp )* ;
	public final Algol60Parser.simpleARi_return simpleARi() throws RecognitionException {
		Algol60Parser.simpleARi_return retval = new Algol60Parser.simpleARi_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal11=null;
		Token char_literal12=null;
		ParserRuleReturnScope multExp10 =null;
		ParserRuleReturnScope multExp13 =null;

		CommonTree char_literal11_tree=null;
		CommonTree char_literal12_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:55:10: ( multExp ( ( '+' ^| '-' ^) multExp )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:55:12: multExp ( ( '+' ^| '-' ^) multExp )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multExp_in_simpleARi193);
			multExp10=multExp();
			state._fsp--;

			adaptor.addChild(root_0, multExp10.getTree());

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:55:19: ( ( '+' ^| '-' ^) multExp )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==37||LA4_0==39) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:55:20: ( '+' ^| '-' ^) multExp
					{
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:55:20: ( '+' ^| '-' ^)
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==37) ) {
						alt3=1;
					}
					else if ( (LA3_0==39) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:55:21: '+' ^
							{
							char_literal11=(Token)match(input,37,FOLLOW_37_in_simpleARi196); 
							char_literal11_tree = (CommonTree)adaptor.create(char_literal11);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal11_tree, root_0);

							}
							break;
						case 2 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:55:28: '-' ^
							{
							char_literal12=(Token)match(input,39,FOLLOW_39_in_simpleARi201); 
							char_literal12_tree = (CommonTree)adaptor.create(char_literal12);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal12_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multExp_in_simpleARi205);
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:60:1: multExp : powExp ( 'POW' ^ powExp )* ;
	public final Algol60Parser.multExp_return multExp() throws RecognitionException {
		Algol60Parser.multExp_return retval = new Algol60Parser.multExp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal15=null;
		ParserRuleReturnScope powExp14 =null;
		ParserRuleReturnScope powExp16 =null;

		CommonTree string_literal15_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:60:9: ( powExp ( 'POW' ^ powExp )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:60:11: powExp ( 'POW' ^ powExp )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_powExp_in_multExp221);
			powExp14=powExp();
			state._fsp--;

			adaptor.addChild(root_0, powExp14.getTree());

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:60:17: ( 'POW' ^ powExp )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==55) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:60:18: 'POW' ^ powExp
					{
					string_literal15=(Token)match(input,55,FOLLOW_55_in_multExp223); 
					string_literal15_tree = (CommonTree)adaptor.create(string_literal15);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal15_tree, root_0);

					pushFollow(FOLLOW_powExp_in_multExp226);
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:63:1: powExp : ( identifier actualparametrepart | '(' expression ')' | INT |);
	public final Algol60Parser.powExp_return powExp() throws RecognitionException {
		Algol60Parser.powExp_return retval = new Algol60Parser.powExp_return();
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:63:8: ( identifier actualparametrepart | '(' expression ')' | INT |)
			int alt6=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt6=1;
				}
				break;
			case 35:
				{
				alt6=2;
				}
				break;
			case INT:
				{
				alt6=3;
				}
				break;
			case EOF:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 46:
			case 47:
			case 48:
			case 55:
			case 58:
			case 61:
			case 62:
			case 64:
			case 67:
				{
				alt6=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:63:10: identifier actualparametrepart
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_powExp239);
					identifier17=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier17.getTree());

					pushFollow(FOLLOW_actualparametrepart_in_powExp241);
					actualparametrepart18=actualparametrepart();
					state._fsp--;

					adaptor.addChild(root_0, actualparametrepart18.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:64:11: '(' expression ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal19=(Token)match(input,35,FOLLOW_35_in_powExp253); 
					char_literal19_tree = (CommonTree)adaptor.create(char_literal19);
					adaptor.addChild(root_0, char_literal19_tree);

					pushFollow(FOLLOW_expression_in_powExp255);
					expression20=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression20.getTree());

					char_literal21=(Token)match(input,36,FOLLOW_36_in_powExp257); 
					char_literal21_tree = (CommonTree)adaptor.create(char_literal21);
					adaptor.addChild(root_0, char_literal21_tree);

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:65:11: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT22=(Token)match(input,INT,FOLLOW_INT_in_powExp269); 
					INT22_tree = (CommonTree)adaptor.create(INT22);
					adaptor.addChild(root_0, INT22_tree);

					}
					break;
				case 4 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:67:2: 
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
	// $ANTLR end "powExp"


	public static class expression2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:71:1: expression2 : ( simpleAR2 | ifclause ei );
	public final Algol60Parser.expression2_return expression2() throws RecognitionException {
		Algol60Parser.expression2_return retval = new Algol60Parser.expression2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope simpleAR223 =null;
		ParserRuleReturnScope ifclause24 =null;
		ParserRuleReturnScope ei25 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:72:2: ( simpleAR2 | ifclause ei )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==EOF||LA7_0==ID||LA7_0==INT||LA7_0==37||LA7_0==39||LA7_0==41||LA7_0==55) ) {
				alt7=1;
			}
			else if ( (LA7_0==51) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:72:4: simpleAR2
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simpleAR2_in_expression2295);
					simpleAR223=simpleAR2();
					state._fsp--;

					adaptor.addChild(root_0, simpleAR223.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:72:16: ifclause ei
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifclause_in_expression2299);
					ifclause24=ifclause();
					state._fsp--;

					adaptor.addChild(root_0, ifclause24.getTree());

					pushFollow(FOLLOW_ei_in_expression2301);
					ei25=ei();
					state._fsp--;

					adaptor.addChild(root_0, ei25.getTree());

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
	// $ANTLR end "expression2"


	public static class ei2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ei2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:75:1: ei2 : simpleDesign 'ELSE' ;
	public final Algol60Parser.ei2_return ei2() throws RecognitionException {
		Algol60Parser.ei2_return retval = new Algol60Parser.ei2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal27=null;
		ParserRuleReturnScope simpleDesign26 =null;

		CommonTree string_literal27_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:75:5: ( simpleDesign 'ELSE' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:75:7: simpleDesign 'ELSE'
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_simpleDesign_in_ei2312);
			simpleDesign26=simpleDesign();
			state._fsp--;

			adaptor.addChild(root_0, simpleDesign26.getTree());

			string_literal27=(Token)match(input,47,FOLLOW_47_in_ei2314); 
			string_literal27_tree = (CommonTree)adaptor.create(string_literal27);
			adaptor.addChild(root_0, string_literal27_tree);

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
	// $ANTLR end "ei2"


	public static class simpleAR2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleAR2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:78:1: simpleAR2 : simpleARi2 ( ':=' simpleARi2 )* ;
	public final Algol60Parser.simpleAR2_return simpleAR2() throws RecognitionException {
		Algol60Parser.simpleAR2_return retval = new Algol60Parser.simpleAR2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal29=null;
		ParserRuleReturnScope simpleARi228 =null;
		ParserRuleReturnScope simpleARi230 =null;

		CommonTree string_literal29_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:78:10: ( simpleARi2 ( ':=' simpleARi2 )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:78:12: simpleARi2 ( ':=' simpleARi2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_simpleARi2_in_simpleAR2324);
			simpleARi228=simpleARi2();
			state._fsp--;

			adaptor.addChild(root_0, simpleARi228.getTree());

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:78:22: ( ':=' simpleARi2 )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==41) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:78:23: ':=' simpleARi2
					{
					string_literal29=(Token)match(input,41,FOLLOW_41_in_simpleAR2326); 
					string_literal29_tree = (CommonTree)adaptor.create(string_literal29);
					adaptor.addChild(root_0, string_literal29_tree);

					pushFollow(FOLLOW_simpleARi2_in_simpleAR2328);
					simpleARi230=simpleARi2();
					state._fsp--;

					adaptor.addChild(root_0, simpleARi230.getTree());

					}
					break;

				default :
					break loop8;
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
	// $ANTLR end "simpleAR2"


	public static class simpleARi2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleARi2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:81:1: simpleARi2 : multExp2 ( ( '+' ^| '-' ^) multExp2 )* ;
	public final Algol60Parser.simpleARi2_return simpleARi2() throws RecognitionException {
		Algol60Parser.simpleARi2_return retval = new Algol60Parser.simpleARi2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal32=null;
		Token char_literal33=null;
		ParserRuleReturnScope multExp231 =null;
		ParserRuleReturnScope multExp234 =null;

		CommonTree char_literal32_tree=null;
		CommonTree char_literal33_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:81:11: ( multExp2 ( ( '+' ^| '-' ^) multExp2 )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:81:13: multExp2 ( ( '+' ^| '-' ^) multExp2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multExp2_in_simpleARi2340);
			multExp231=multExp2();
			state._fsp--;

			adaptor.addChild(root_0, multExp231.getTree());

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:81:21: ( ( '+' ^| '-' ^) multExp2 )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==37||LA10_0==39) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:81:22: ( '+' ^| '-' ^) multExp2
					{
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:81:22: ( '+' ^| '-' ^)
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==37) ) {
						alt9=1;
					}
					else if ( (LA9_0==39) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:81:23: '+' ^
							{
							char_literal32=(Token)match(input,37,FOLLOW_37_in_simpleARi2343); 
							char_literal32_tree = (CommonTree)adaptor.create(char_literal32);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal32_tree, root_0);

							}
							break;
						case 2 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:81:30: '-' ^
							{
							char_literal33=(Token)match(input,39,FOLLOW_39_in_simpleARi2348); 
							char_literal33_tree = (CommonTree)adaptor.create(char_literal33);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal33_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multExp2_in_simpleARi2352);
					multExp234=multExp2();
					state._fsp--;

					adaptor.addChild(root_0, multExp234.getTree());

					}
					break;

				default :
					break loop10;
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
	// $ANTLR end "simpleARi2"


	public static class multExp2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multExp2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:86:1: multExp2 : powExp2 ( 'POW' ^ powExp2 )* ;
	public final Algol60Parser.multExp2_return multExp2() throws RecognitionException {
		Algol60Parser.multExp2_return retval = new Algol60Parser.multExp2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal36=null;
		ParserRuleReturnScope powExp235 =null;
		ParserRuleReturnScope powExp237 =null;

		CommonTree string_literal36_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:86:10: ( powExp2 ( 'POW' ^ powExp2 )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:86:12: powExp2 ( 'POW' ^ powExp2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_powExp2_in_multExp2368);
			powExp235=powExp2();
			state._fsp--;

			adaptor.addChild(root_0, powExp235.getTree());

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:86:19: ( 'POW' ^ powExp2 )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==55) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:86:20: 'POW' ^ powExp2
					{
					string_literal36=(Token)match(input,55,FOLLOW_55_in_multExp2370); 
					string_literal36_tree = (CommonTree)adaptor.create(string_literal36);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal36_tree, root_0);

					pushFollow(FOLLOW_powExp2_in_multExp2373);
					powExp237=powExp2();
					state._fsp--;

					adaptor.addChild(root_0, powExp237.getTree());

					}
					break;

				default :
					break loop11;
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
	// $ANTLR end "multExp2"


	public static class powExp2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "powExp2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:89:1: powExp2 : (| identifier | INT );
	public final Algol60Parser.powExp2_return powExp2() throws RecognitionException {
		Algol60Parser.powExp2_return retval = new Algol60Parser.powExp2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT39=null;
		ParserRuleReturnScope identifier38 =null;

		CommonTree INT39_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:89:9: (| identifier | INT )
			int alt12=3;
			switch ( input.LA(1) ) {
			case EOF:
			case 37:
			case 39:
			case 41:
			case 55:
				{
				alt12=1;
				}
				break;
			case ID:
				{
				alt12=2;
				}
				break;
			case INT:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:90:10: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:90:12: identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_powExp2397);
					identifier38=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier38.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:91:11: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT39=(Token)match(input,INT,FOLLOW_INT_in_powExp2409); 
					INT39_tree = (CommonTree)adaptor.create(INT39);
					adaptor.addChild(root_0, INT39_tree);

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
	// $ANTLR end "powExp2"


	public static class identifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "identifier"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:94:1: identifier : ID o ;
	public final Algol60Parser.identifier_return identifier() throws RecognitionException {
		Algol60Parser.identifier_return retval = new Algol60Parser.identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID40=null;
		ParserRuleReturnScope o41 =null;

		CommonTree ID40_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:95:2: ( ID o )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:95:4: ID o
			{
			root_0 = (CommonTree)adaptor.nil();


			ID40=(Token)match(input,ID,FOLLOW_ID_in_identifier421); 
			ID40_tree = (CommonTree)adaptor.create(ID40);
			adaptor.addChild(root_0, ID40_tree);

			pushFollow(FOLLOW_o_in_identifier423);
			o41=o();
			state._fsp--;

			adaptor.addChild(root_0, o41.getTree());

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


	public static class o_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "o"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:98:1: o : ( INT | '[' expression ( ',' expression )* ']' |);
	public final Algol60Parser.o_return o() throws RecognitionException {
		Algol60Parser.o_return retval = new Algol60Parser.o_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT42=null;
		Token char_literal43=null;
		Token char_literal45=null;
		Token char_literal47=null;
		ParserRuleReturnScope expression44 =null;
		ParserRuleReturnScope expression46 =null;

		CommonTree INT42_tree=null;
		CommonTree char_literal43_tree=null;
		CommonTree char_literal45_tree=null;
		CommonTree char_literal47_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:98:3: ( INT | '[' expression ( ',' expression )* ']' |)
			int alt14=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt14=1;
				}
				break;
			case 66:
				{
				alt14=2;
				}
				break;
			case EOF:
			case ID:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 43:
			case 44:
			case 45:
			case 46:
			case 47:
			case 48:
			case 49:
			case 50:
			case 51:
			case 52:
			case 53:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
			case 60:
			case 61:
			case 62:
			case 64:
			case 67:
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:98:5: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT42=(Token)match(input,INT,FOLLOW_INT_in_o434); 
					INT42_tree = (CommonTree)adaptor.create(INT42);
					adaptor.addChild(root_0, INT42_tree);

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:99:18: '[' expression ( ',' expression )* ']'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal43=(Token)match(input,66,FOLLOW_66_in_o453); 
					char_literal43_tree = (CommonTree)adaptor.create(char_literal43);
					adaptor.addChild(root_0, char_literal43_tree);

					pushFollow(FOLLOW_expression_in_o455);
					expression44=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression44.getTree());

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:99:33: ( ',' expression )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==38) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:99:34: ',' expression
							{
							char_literal45=(Token)match(input,38,FOLLOW_38_in_o458); 
							char_literal45_tree = (CommonTree)adaptor.create(char_literal45);
							adaptor.addChild(root_0, char_literal45_tree);

							pushFollow(FOLLOW_expression_in_o460);
							expression46=expression();
							state._fsp--;

							adaptor.addChild(root_0, expression46.getTree());

							}
							break;

						default :
							break loop13;
						}
					}

					char_literal47=(Token)match(input,67,FOLLOW_67_in_o463); 
					char_literal47_tree = (CommonTree)adaptor.create(char_literal47);
					adaptor.addChild(root_0, char_literal47_tree);

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:101:2: 
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
	// $ANTLR end "o"


	public static class d_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "d"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:106:1: d : ( declaration ';' ( declaration ';' )* compoundT -> ( ^( DEC declaration compoundT ) )+ | compoundT -> ^( compoundT ) );
	public final Algol60Parser.d_return d() throws RecognitionException {
		Algol60Parser.d_return retval = new Algol60Parser.d_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal49=null;
		Token char_literal51=null;
		ParserRuleReturnScope declaration48 =null;
		ParserRuleReturnScope declaration50 =null;
		ParserRuleReturnScope compoundT52 =null;
		ParserRuleReturnScope compoundT53 =null;

		CommonTree char_literal49_tree=null;
		CommonTree char_literal51_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_compoundT=new RewriteRuleSubtreeStream(adaptor,"rule compoundT");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:106:3: ( declaration ';' ( declaration ';' )* compoundT -> ( ^( DEC declaration compoundT ) )+ | compoundT -> ^( compoundT ) )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==43||LA16_0==45||LA16_0==52||LA16_0==54||(LA16_0 >= 56 && LA16_0 <= 57)||LA16_0==60) ) {
				alt16=1;
			}
			else if ( (LA16_0==EOF||LA16_0==ID||(LA16_0 >= 35 && LA16_0 <= 42)||LA16_0==44||(LA16_0 >= 46 && LA16_0 <= 51)||LA16_0==55||LA16_0==58||(LA16_0 >= 61 && LA16_0 <= 62)||LA16_0==64||LA16_0==67) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:106:5: declaration ';' ( declaration ';' )* compoundT
					{
					pushFollow(FOLLOW_declaration_in_d526);
					declaration48=declaration();
					state._fsp--;

					stream_declaration.add(declaration48.getTree());
					char_literal49=(Token)match(input,42,FOLLOW_42_in_d528);  
					stream_42.add(char_literal49);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:106:21: ( declaration ';' )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==43||LA15_0==45||LA15_0==52||LA15_0==54||(LA15_0 >= 56 && LA15_0 <= 57)||LA15_0==60) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:106:22: declaration ';'
							{
							pushFollow(FOLLOW_declaration_in_d531);
							declaration50=declaration();
							state._fsp--;

							stream_declaration.add(declaration50.getTree());
							char_literal51=(Token)match(input,42,FOLLOW_42_in_d533);  
							stream_42.add(char_literal51);

							}
							break;

						default :
							break loop15;
						}
					}

					pushFollow(FOLLOW_compoundT_in_d537);
					compoundT52=compoundT();
					state._fsp--;

					stream_compoundT.add(compoundT52.getTree());
					// AST REWRITE
					// elements: compoundT, declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 106:49: -> ( ^( DEC declaration compoundT ) )+
					{
						if ( !(stream_compoundT.hasNext()||stream_declaration.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_compoundT.hasNext()||stream_declaration.hasNext() ) {
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:106:51: ^( DEC declaration compoundT )
							{
							CommonTree root_1 = (CommonTree)adaptor.nil();
							root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEC, "DEC"), root_1);
							adaptor.addChild(root_1, stream_declaration.nextTree());
							adaptor.addChild(root_1, stream_compoundT.nextTree());
							adaptor.addChild(root_0, root_1);
							}

						}
						stream_compoundT.reset();
						stream_declaration.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:107:4: compoundT
					{
					pushFollow(FOLLOW_compoundT_in_d551);
					compoundT53=compoundT();
					state._fsp--;

					stream_compoundT.add(compoundT53.getTree());
					// AST REWRITE
					// elements: compoundT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 107:13: -> ^( compoundT )
					{
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:107:15: ^( compoundT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_compoundT.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

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


	public static class prog1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog1"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:110:1: prog1 : ( begin EOF -> ^( BEGIN begin ) | ( label ':' )+ begin -> ^( BEGIN begin ) );
	public final Algol60Parser.prog1_return prog1() throws RecognitionException {
		Algol60Parser.prog1_return retval = new Algol60Parser.prog1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF55=null;
		Token char_literal57=null;
		ParserRuleReturnScope begin54 =null;
		ParserRuleReturnScope label56 =null;
		ParserRuleReturnScope begin58 =null;

		CommonTree EOF55_tree=null;
		CommonTree char_literal57_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_label=new RewriteRuleSubtreeStream(adaptor,"rule label");
		RewriteRuleSubtreeStream stream_begin=new RewriteRuleSubtreeStream(adaptor,"rule begin");

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:110:7: ( begin EOF -> ^( BEGIN begin ) | ( label ':' )+ begin -> ^( BEGIN begin ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==44) ) {
				alt18=1;
			}
			else if ( (LA18_0==ID) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:110:11: begin EOF
					{
					pushFollow(FOLLOW_begin_in_prog1567);
					begin54=begin();
					state._fsp--;

					stream_begin.add(begin54.getTree());
					EOF55=(Token)match(input,EOF,FOLLOW_EOF_in_prog1569);  
					stream_EOF.add(EOF55);

					// AST REWRITE
					// elements: begin
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 110:20: -> ^( BEGIN begin )
					{
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:110:22: ^( BEGIN begin )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BEGIN, "BEGIN"), root_1);
						adaptor.addChild(root_1, stream_begin.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:111:19: ( label ':' )+ begin
					{
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:111:19: ( label ':' )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==ID) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:111:20: label ':'
							{
							pushFollow(FOLLOW_label_in_prog1596);
							label56=label();
							state._fsp--;

							stream_label.add(label56.getTree());
							char_literal57=(Token)match(input,40,FOLLOW_40_in_prog1598);  
							stream_40.add(char_literal57);

							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					pushFollow(FOLLOW_begin_in_prog1602);
					begin58=begin();
					state._fsp--;

					stream_begin.add(begin58.getTree());
					// AST REWRITE
					// elements: begin
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 111:37: -> ^( BEGIN begin )
					{
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:111:39: ^( BEGIN begin )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BEGIN, "BEGIN"), root_1);
						adaptor.addChild(root_1, stream_begin.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:113:1: label : identifier ;
	public final Algol60Parser.label_return label() throws RecognitionException {
		Algol60Parser.label_return retval = new Algol60Parser.label_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier59 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:113:7: ( identifier )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:113:10: identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_label634);
			identifier59=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier59.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:116:1: localorown : ( type | 'OWN' type );
	public final Algol60Parser.localorown_return localorown() throws RecognitionException {
		Algol60Parser.localorown_return retval = new Algol60Parser.localorown_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal61=null;
		ParserRuleReturnScope type60 =null;
		ParserRuleReturnScope type62 =null;

		CommonTree string_literal61_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:117:2: ( type | 'OWN' type )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==45||LA19_0==52||LA19_0==57) ) {
				alt19=1;
			}
			else if ( (LA19_0==54) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:117:4: type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_type_in_localorown660);
					type60=type();
					state._fsp--;

					adaptor.addChild(root_0, type60.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:117:9: 'OWN' type
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal61=(Token)match(input,54,FOLLOW_54_in_localorown662); 
					string_literal61_tree = (CommonTree)adaptor.create(string_literal61);
					adaptor.addChild(root_0, string_literal61_tree);

					pushFollow(FOLLOW_type_in_localorown664);
					type62=type();
					state._fsp--;

					adaptor.addChild(root_0, type62.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:120:1: type : ( 'REAL' | 'INTEGER' | 'BOOLEAN' );
	public final Algol60Parser.type_return type() throws RecognitionException {
		Algol60Parser.type_return retval = new Algol60Parser.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set63=null;

		CommonTree set63_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:120:6: ( 'REAL' | 'INTEGER' | 'BOOLEAN' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set63=input.LT(1);
			if ( input.LA(1)==45||input.LA(1)==52||input.LA(1)==57 ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set63));
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:123:1: typeliste : identifier t ;
	public final Algol60Parser.typeliste_return typeliste() throws RecognitionException {
		Algol60Parser.typeliste_return retval = new Algol60Parser.typeliste_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier64 =null;
		ParserRuleReturnScope t65 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:124:2: ( identifier t )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:124:4: identifier t
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_typeliste690);
			identifier64=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier64.getTree());

			pushFollow(FOLLOW_t_in_typeliste692);
			t65=t();
			state._fsp--;

			adaptor.addChild(root_0, t65.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:126:1: t : ( ',' typeliste |);
	public final Algol60Parser.t_return t() throws RecognitionException {
		Algol60Parser.t_return retval = new Algol60Parser.t_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal66=null;
		ParserRuleReturnScope typeliste67 =null;

		CommonTree char_literal66_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:126:3: ( ',' typeliste |)
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==38) ) {
				alt20=1;
			}
			else if ( (LA20_0==42) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:126:5: ',' typeliste
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal66=(Token)match(input,38,FOLLOW_38_in_t701); 
					char_literal66_tree = (CommonTree)adaptor.create(char_literal66);
					adaptor.addChild(root_0, char_literal66_tree);

					pushFollow(FOLLOW_typeliste_in_t702);
					typeliste67=typeliste();
					state._fsp--;

					adaptor.addChild(root_0, typeliste67.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:128:2: 
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:130:1: arraylist : arrayseg2 a ;
	public final Algol60Parser.arraylist_return arraylist() throws RecognitionException {
		Algol60Parser.arraylist_return retval = new Algol60Parser.arraylist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope arrayseg268 =null;
		ParserRuleReturnScope a69 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:131:2: ( arrayseg2 a )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:131:4: arrayseg2 a
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_arrayseg2_in_arraylist717);
			arrayseg268=arrayseg2();
			state._fsp--;

			adaptor.addChild(root_0, arrayseg268.getTree());

			pushFollow(FOLLOW_a_in_arraylist719);
			a69=a();
			state._fsp--;

			adaptor.addChild(root_0, a69.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:134:1: a : ( ',' identifier a |);
	public final Algol60Parser.a_return a() throws RecognitionException {
		Algol60Parser.a_return retval = new Algol60Parser.a_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal70=null;
		ParserRuleReturnScope identifier71 =null;
		ParserRuleReturnScope a72 =null;

		CommonTree char_literal70_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:134:3: ( ',' identifier a |)
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==38) ) {
				alt21=1;
			}
			else if ( (LA21_0==42) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:134:5: ',' identifier a
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal70=(Token)match(input,38,FOLLOW_38_in_a729); 
					char_literal70_tree = (CommonTree)adaptor.create(char_literal70);
					adaptor.addChild(root_0, char_literal70_tree);

					pushFollow(FOLLOW_identifier_in_a731);
					identifier71=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier71.getTree());

					pushFollow(FOLLOW_a_in_a733);
					a72=a();
					state._fsp--;

					adaptor.addChild(root_0, a72.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:136:2: 
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


	public static class arrayseg2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arrayseg2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:144:1: arrayseg2 : ( identifier ',' ) ID '[' boundplist ']' ;
	public final Algol60Parser.arrayseg2_return arrayseg2() throws RecognitionException {
		Algol60Parser.arrayseg2_return retval = new Algol60Parser.arrayseg2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal74=null;
		Token ID75=null;
		Token char_literal76=null;
		Token char_literal78=null;
		ParserRuleReturnScope identifier73 =null;
		ParserRuleReturnScope boundplist77 =null;

		CommonTree char_literal74_tree=null;
		CommonTree ID75_tree=null;
		CommonTree char_literal76_tree=null;
		CommonTree char_literal78_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:145:2: ( ( identifier ',' ) ID '[' boundplist ']' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:145:4: ( identifier ',' ) ID '[' boundplist ']'
			{
			root_0 = (CommonTree)adaptor.nil();


			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:145:4: ( identifier ',' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:145:5: identifier ','
			{
			pushFollow(FOLLOW_identifier_in_arrayseg2758);
			identifier73=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier73.getTree());

			char_literal74=(Token)match(input,38,FOLLOW_38_in_arrayseg2760); 
			char_literal74_tree = (CommonTree)adaptor.create(char_literal74);
			adaptor.addChild(root_0, char_literal74_tree);

			}

			ID75=(Token)match(input,ID,FOLLOW_ID_in_arrayseg2763); 
			ID75_tree = (CommonTree)adaptor.create(ID75);
			adaptor.addChild(root_0, ID75_tree);

			char_literal76=(Token)match(input,66,FOLLOW_66_in_arrayseg2765); 
			char_literal76_tree = (CommonTree)adaptor.create(char_literal76);
			adaptor.addChild(root_0, char_literal76_tree);

			pushFollow(FOLLOW_boundplist_in_arrayseg2767);
			boundplist77=boundplist();
			state._fsp--;

			adaptor.addChild(root_0, boundplist77.getTree());

			char_literal78=(Token)match(input,67,FOLLOW_67_in_arrayseg2769); 
			char_literal78_tree = (CommonTree)adaptor.create(char_literal78);
			adaptor.addChild(root_0, char_literal78_tree);

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
	// $ANTLR end "arrayseg2"


	public static class boundplist_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boundplist"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:148:1: boundplist : boundp z ;
	public final Algol60Parser.boundplist_return boundplist() throws RecognitionException {
		Algol60Parser.boundplist_return retval = new Algol60Parser.boundplist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope boundp79 =null;
		ParserRuleReturnScope z80 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:149:2: ( boundp z )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:149:4: boundp z
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boundp_in_boundplist781);
			boundp79=boundp();
			state._fsp--;

			adaptor.addChild(root_0, boundp79.getTree());

			pushFollow(FOLLOW_z_in_boundplist783);
			z80=z();
			state._fsp--;

			adaptor.addChild(root_0, z80.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:152:1: z : ( ',' boundp z |);
	public final Algol60Parser.z_return z() throws RecognitionException {
		Algol60Parser.z_return retval = new Algol60Parser.z_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal81=null;
		ParserRuleReturnScope boundp82 =null;
		ParserRuleReturnScope z83 =null;

		CommonTree char_literal81_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:152:3: ( ',' boundp z |)
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==38) ) {
				alt22=1;
			}
			else if ( (LA22_0==67) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:152:5: ',' boundp z
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal81=(Token)match(input,38,FOLLOW_38_in_z794); 
					char_literal81_tree = (CommonTree)adaptor.create(char_literal81);
					adaptor.addChild(root_0, char_literal81_tree);

					pushFollow(FOLLOW_boundp_in_z796);
					boundp82=boundp();
					state._fsp--;

					adaptor.addChild(root_0, boundp82.getTree());

					pushFollow(FOLLOW_z_in_z798);
					z83=z();
					state._fsp--;

					adaptor.addChild(root_0, z83.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:154:2: 
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:155:1: boundp : simpleARi ':' simpleARi ;
	public final Algol60Parser.boundp_return boundp() throws RecognitionException {
		Algol60Parser.boundp_return retval = new Algol60Parser.boundp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal85=null;
		ParserRuleReturnScope simpleARi84 =null;
		ParserRuleReturnScope simpleARi86 =null;

		CommonTree char_literal85_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:155:8: ( simpleARi ':' simpleARi )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:155:10: simpleARi ':' simpleARi
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_simpleARi_in_boundp811);
			simpleARi84=simpleARi();
			state._fsp--;

			adaptor.addChild(root_0, simpleARi84.getTree());

			char_literal85=(Token)match(input,40,FOLLOW_40_in_boundp813); 
			char_literal85_tree = (CommonTree)adaptor.create(char_literal85);
			adaptor.addChild(root_0, char_literal85_tree);

			pushFollow(FOLLOW_simpleARi_in_boundp815);
			simpleARi86=simpleARi();
			state._fsp--;

			adaptor.addChild(root_0, simpleARi86.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:159:1: typedeclaration : ( typeliste | 'ARRAY' arraylist | procedure );
	public final Algol60Parser.typedeclaration_return typedeclaration() throws RecognitionException {
		Algol60Parser.typedeclaration_return retval = new Algol60Parser.typedeclaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal88=null;
		ParserRuleReturnScope typeliste87 =null;
		ParserRuleReturnScope arraylist89 =null;
		ParserRuleReturnScope procedure90 =null;

		CommonTree string_literal88_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:159:16: ( typeliste | 'ARRAY' arraylist | procedure )
			int alt23=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt23=1;
				}
				break;
			case 43:
				{
				alt23=2;
				}
				break;
			case 56:
				{
				alt23=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:159:18: typeliste
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_typeliste_in_typedeclaration826);
					typeliste87=typeliste();
					state._fsp--;

					adaptor.addChild(root_0, typeliste87.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:160:2: 'ARRAY' arraylist
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal88=(Token)match(input,43,FOLLOW_43_in_typedeclaration829); 
					string_literal88_tree = (CommonTree)adaptor.create(string_literal88);
					adaptor.addChild(root_0, string_literal88_tree);

					pushFollow(FOLLOW_arraylist_in_typedeclaration831);
					arraylist89=arraylist();
					state._fsp--;

					adaptor.addChild(root_0, arraylist89.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:161:2: procedure
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_procedure_in_typedeclaration834);
					procedure90=procedure();
					state._fsp--;

					adaptor.addChild(root_0, procedure90.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:165:1: typedeclaration2 : ( 'ARRAY' arraylist | procedure );
	public final Algol60Parser.typedeclaration2_return typedeclaration2() throws RecognitionException {
		Algol60Parser.typedeclaration2_return retval = new Algol60Parser.typedeclaration2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal91=null;
		ParserRuleReturnScope arraylist92 =null;
		ParserRuleReturnScope procedure93 =null;

		CommonTree string_literal91_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:165:17: ( 'ARRAY' arraylist | procedure )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==43) ) {
				alt24=1;
			}
			else if ( (LA24_0==56) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:165:18: 'ARRAY' arraylist
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal91=(Token)match(input,43,FOLLOW_43_in_typedeclaration2842); 
					string_literal91_tree = (CommonTree)adaptor.create(string_literal91);
					adaptor.addChild(root_0, string_literal91_tree);

					pushFollow(FOLLOW_arraylist_in_typedeclaration2844);
					arraylist92=arraylist();
					state._fsp--;

					adaptor.addChild(root_0, arraylist92.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:166:2: procedure
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_procedure_in_typedeclaration2847);
					procedure93=procedure();
					state._fsp--;

					adaptor.addChild(root_0, procedure93.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:169:1: switchdec : 'SWITCH' identifier ':=' switchlist ;
	public final Algol60Parser.switchdec_return switchdec() throws RecognitionException {
		Algol60Parser.switchdec_return retval = new Algol60Parser.switchdec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal94=null;
		Token string_literal96=null;
		ParserRuleReturnScope identifier95 =null;
		ParserRuleReturnScope switchlist97 =null;

		CommonTree string_literal94_tree=null;
		CommonTree string_literal96_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:170:2: ( 'SWITCH' identifier ':=' switchlist )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:170:4: 'SWITCH' identifier ':=' switchlist
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal94=(Token)match(input,60,FOLLOW_60_in_switchdec857); 
			string_literal94_tree = (CommonTree)adaptor.create(string_literal94);
			adaptor.addChild(root_0, string_literal94_tree);

			pushFollow(FOLLOW_identifier_in_switchdec859);
			identifier95=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier95.getTree());

			string_literal96=(Token)match(input,41,FOLLOW_41_in_switchdec861); 
			string_literal96_tree = (CommonTree)adaptor.create(string_literal96);
			adaptor.addChild(root_0, string_literal96_tree);

			pushFollow(FOLLOW_switchlist_in_switchdec863);
			switchlist97=switchlist();
			state._fsp--;

			adaptor.addChild(root_0, switchlist97.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:173:1: switchlist : designExp s ;
	public final Algol60Parser.switchlist_return switchlist() throws RecognitionException {
		Algol60Parser.switchlist_return retval = new Algol60Parser.switchlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope designExp98 =null;
		ParserRuleReturnScope s99 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:174:2: ( designExp s )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:174:5: designExp s
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_designExp_in_switchlist876);
			designExp98=designExp();
			state._fsp--;

			adaptor.addChild(root_0, designExp98.getTree());

			pushFollow(FOLLOW_s_in_switchlist878);
			s99=s();
			state._fsp--;

			adaptor.addChild(root_0, s99.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:176:1: s : ( ',' designExp s |);
	public final Algol60Parser.s_return s() throws RecognitionException {
		Algol60Parser.s_return retval = new Algol60Parser.s_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal100=null;
		ParserRuleReturnScope designExp101 =null;
		ParserRuleReturnScope s102 =null;

		CommonTree char_literal100_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:176:3: ( ',' designExp s |)
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==38) ) {
				alt25=1;
			}
			else if ( (LA25_0==42) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:176:6: ',' designExp s
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal100=(Token)match(input,38,FOLLOW_38_in_s887); 
					char_literal100_tree = (CommonTree)adaptor.create(char_literal100);
					adaptor.addChild(root_0, char_literal100_tree);

					pushFollow(FOLLOW_designExp_in_s889);
					designExp101=designExp();
					state._fsp--;

					adaptor.addChild(root_0, designExp101.getTree());

					pushFollow(FOLLOW_s_in_s891);
					s102=s();
					state._fsp--;

					adaptor.addChild(root_0, s102.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:178:2: 
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:179:2: procedure : 'PROCEDURE' procedurehead statement ;
	public final Algol60Parser.procedure_return procedure() throws RecognitionException {
		Algol60Parser.procedure_return retval = new Algol60Parser.procedure_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal103=null;
		ParserRuleReturnScope procedurehead104 =null;
		ParserRuleReturnScope statement105 =null;

		CommonTree string_literal103_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:179:11: ( 'PROCEDURE' procedurehead statement )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:179:13: 'PROCEDURE' procedurehead statement
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal103=(Token)match(input,56,FOLLOW_56_in_procedure904); 
			string_literal103_tree = (CommonTree)adaptor.create(string_literal103);
			adaptor.addChild(root_0, string_literal103_tree);

			pushFollow(FOLLOW_procedurehead_in_procedure906);
			procedurehead104=procedurehead();
			state._fsp--;

			adaptor.addChild(root_0, procedurehead104.getTree());

			pushFollow(FOLLOW_statement_in_procedure908);
			statement105=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement105.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:182:2: procedurehead : identifier formalparameterpart ';' valuepart specificationpart ;
	public final Algol60Parser.procedurehead_return procedurehead() throws RecognitionException {
		Algol60Parser.procedurehead_return retval = new Algol60Parser.procedurehead_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal108=null;
		ParserRuleReturnScope identifier106 =null;
		ParserRuleReturnScope formalparameterpart107 =null;
		ParserRuleReturnScope valuepart109 =null;
		ParserRuleReturnScope specificationpart110 =null;

		CommonTree char_literal108_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:183:3: ( identifier formalparameterpart ';' valuepart specificationpart )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:183:5: identifier formalparameterpart ';' valuepart specificationpart
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_procedurehead924);
			identifier106=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier106.getTree());

			pushFollow(FOLLOW_formalparameterpart_in_procedurehead926);
			formalparameterpart107=formalparameterpart();
			state._fsp--;

			adaptor.addChild(root_0, formalparameterpart107.getTree());

			char_literal108=(Token)match(input,42,FOLLOW_42_in_procedurehead928); 
			char_literal108_tree = (CommonTree)adaptor.create(char_literal108);
			adaptor.addChild(root_0, char_literal108_tree);

			pushFollow(FOLLOW_valuepart_in_procedurehead930);
			valuepart109=valuepart();
			state._fsp--;

			adaptor.addChild(root_0, valuepart109.getTree());

			pushFollow(FOLLOW_specificationpart_in_procedurehead932);
			specificationpart110=specificationpart();
			state._fsp--;

			adaptor.addChild(root_0, specificationpart110.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:186:1: formalparameterpart : (| '(' formalparameterlist ')' ( STRING ':' '(' formalparameterlist ')' )* );
	public final Algol60Parser.formalparameterpart_return formalparameterpart() throws RecognitionException {
		Algol60Parser.formalparameterpart_return retval = new Algol60Parser.formalparameterpart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal111=null;
		Token char_literal113=null;
		Token STRING114=null;
		Token char_literal115=null;
		Token char_literal116=null;
		Token char_literal118=null;
		ParserRuleReturnScope formalparameterlist112 =null;
		ParserRuleReturnScope formalparameterlist117 =null;

		CommonTree char_literal111_tree=null;
		CommonTree char_literal113_tree=null;
		CommonTree STRING114_tree=null;
		CommonTree char_literal115_tree=null;
		CommonTree char_literal116_tree=null;
		CommonTree char_literal118_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:186:21: (| '(' formalparameterlist ')' ( STRING ':' '(' formalparameterlist ')' )* )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==42) ) {
				alt27=1;
			}
			else if ( (LA27_0==35) ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:186:23: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:186:25: '(' formalparameterlist ')' ( STRING ':' '(' formalparameterlist ')' )*
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal111=(Token)match(input,35,FOLLOW_35_in_formalparameterpart946); 
					char_literal111_tree = (CommonTree)adaptor.create(char_literal111);
					adaptor.addChild(root_0, char_literal111_tree);

					pushFollow(FOLLOW_formalparameterlist_in_formalparameterpart948);
					formalparameterlist112=formalparameterlist();
					state._fsp--;

					adaptor.addChild(root_0, formalparameterlist112.getTree());

					char_literal113=(Token)match(input,36,FOLLOW_36_in_formalparameterpart950); 
					char_literal113_tree = (CommonTree)adaptor.create(char_literal113);
					adaptor.addChild(root_0, char_literal113_tree);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:186:53: ( STRING ':' '(' formalparameterlist ')' )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==STRING) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:186:54: STRING ':' '(' formalparameterlist ')'
							{
							STRING114=(Token)match(input,STRING,FOLLOW_STRING_in_formalparameterpart953); 
							STRING114_tree = (CommonTree)adaptor.create(STRING114);
							adaptor.addChild(root_0, STRING114_tree);

							char_literal115=(Token)match(input,40,FOLLOW_40_in_formalparameterpart954); 
							char_literal115_tree = (CommonTree)adaptor.create(char_literal115);
							adaptor.addChild(root_0, char_literal115_tree);

							char_literal116=(Token)match(input,35,FOLLOW_35_in_formalparameterpart955); 
							char_literal116_tree = (CommonTree)adaptor.create(char_literal116);
							adaptor.addChild(root_0, char_literal116_tree);

							pushFollow(FOLLOW_formalparameterlist_in_formalparameterpart956);
							formalparameterlist117=formalparameterlist();
							state._fsp--;

							adaptor.addChild(root_0, formalparameterlist117.getTree());

							char_literal118=(Token)match(input,36,FOLLOW_36_in_formalparameterpart957); 
							char_literal118_tree = (CommonTree)adaptor.create(char_literal118);
							adaptor.addChild(root_0, char_literal118_tree);

							}
							break;

						default :
							break loop26;
						}
					}

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:194:1: specificationpart : ( specifier identifierlist ';' specificationpart |);
	public final Algol60Parser.specificationpart_return specificationpart() throws RecognitionException {
		Algol60Parser.specificationpart_return retval = new Algol60Parser.specificationpart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal121=null;
		ParserRuleReturnScope specifier119 =null;
		ParserRuleReturnScope identifierlist120 =null;
		ParserRuleReturnScope specificationpart122 =null;

		CommonTree char_literal121_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:195:2: ( specifier identifierlist ';' specificationpart |)
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==43||LA28_0==45||(LA28_0 >= 52 && LA28_0 <= 53)||(LA28_0 >= 56 && LA28_0 <= 57)||(LA28_0 >= 59 && LA28_0 <= 60)) ) {
				alt28=1;
			}
			else if ( (LA28_0==EOF||LA28_0==ID||(LA28_0 >= 35 && LA28_0 <= 42)||LA28_0==44||(LA28_0 >= 46 && LA28_0 <= 51)||LA28_0==55||LA28_0==58||(LA28_0 >= 61 && LA28_0 <= 62)||LA28_0==64||LA28_0==67) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:195:3: specifier identifierlist ';' specificationpart
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_specifier_in_specificationpart977);
					specifier119=specifier();
					state._fsp--;

					adaptor.addChild(root_0, specifier119.getTree());

					pushFollow(FOLLOW_identifierlist_in_specificationpart979);
					identifierlist120=identifierlist();
					state._fsp--;

					adaptor.addChild(root_0, identifierlist120.getTree());

					char_literal121=(Token)match(input,42,FOLLOW_42_in_specificationpart981); 
					char_literal121_tree = (CommonTree)adaptor.create(char_literal121);
					adaptor.addChild(root_0, char_literal121_tree);

					pushFollow(FOLLOW_specificationpart_in_specificationpart983);
					specificationpart122=specificationpart();
					state._fsp--;

					adaptor.addChild(root_0, specificationpart122.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:197:2: 
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


	public static class identifierlist_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "identifierlist"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:199:1: identifierlist : identifier ( ',' identifier )* ;
	public final Algol60Parser.identifierlist_return identifierlist() throws RecognitionException {
		Algol60Parser.identifierlist_return retval = new Algol60Parser.identifierlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal124=null;
		ParserRuleReturnScope identifier123 =null;
		ParserRuleReturnScope identifier125 =null;

		CommonTree char_literal124_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:200:2: ( identifier ( ',' identifier )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:200:4: identifier ( ',' identifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_identifierlist998);
			identifier123=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier123.getTree());

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:200:15: ( ',' identifier )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==38) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:200:16: ',' identifier
					{
					char_literal124=(Token)match(input,38,FOLLOW_38_in_identifierlist1001); 
					char_literal124_tree = (CommonTree)adaptor.create(char_literal124);
					adaptor.addChild(root_0, char_literal124_tree);

					pushFollow(FOLLOW_identifier_in_identifierlist1002);
					identifier125=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier125.getTree());

					}
					break;

				default :
					break loop29;
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
	// $ANTLR end "identifierlist"


	public static class specifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "specifier"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:203:1: specifier : ( 'STRING' | type h | 'ARRAY' | 'LABEL' | 'SWITCH' | 'PROCEDURE' );
	public final Algol60Parser.specifier_return specifier() throws RecognitionException {
		Algol60Parser.specifier_return retval = new Algol60Parser.specifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal126=null;
		Token string_literal129=null;
		Token string_literal130=null;
		Token string_literal131=null;
		Token string_literal132=null;
		ParserRuleReturnScope type127 =null;
		ParserRuleReturnScope h128 =null;

		CommonTree string_literal126_tree=null;
		CommonTree string_literal129_tree=null;
		CommonTree string_literal130_tree=null;
		CommonTree string_literal131_tree=null;
		CommonTree string_literal132_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:204:2: ( 'STRING' | type h | 'ARRAY' | 'LABEL' | 'SWITCH' | 'PROCEDURE' )
			int alt30=6;
			switch ( input.LA(1) ) {
			case 59:
				{
				alt30=1;
				}
				break;
			case 45:
			case 52:
			case 57:
				{
				alt30=2;
				}
				break;
			case 43:
				{
				alt30=3;
				}
				break;
			case 53:
				{
				alt30=4;
				}
				break;
			case 60:
				{
				alt30=5;
				}
				break;
			case 56:
				{
				alt30=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:204:3: 'STRING'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal126=(Token)match(input,59,FOLLOW_59_in_specifier1015); 
					string_literal126_tree = (CommonTree)adaptor.create(string_literal126);
					adaptor.addChild(root_0, string_literal126_tree);

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:204:14: type h
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_type_in_specifier1019);
					type127=type();
					state._fsp--;

					adaptor.addChild(root_0, type127.getTree());

					pushFollow(FOLLOW_h_in_specifier1022);
					h128=h();
					state._fsp--;

					adaptor.addChild(root_0, h128.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:204:23: 'ARRAY'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal129=(Token)match(input,43,FOLLOW_43_in_specifier1025); 
					string_literal129_tree = (CommonTree)adaptor.create(string_literal129);
					adaptor.addChild(root_0, string_literal129_tree);

					}
					break;
				case 4 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:204:33: 'LABEL'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal130=(Token)match(input,53,FOLLOW_53_in_specifier1029); 
					string_literal130_tree = (CommonTree)adaptor.create(string_literal130);
					adaptor.addChild(root_0, string_literal130_tree);

					}
					break;
				case 5 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:204:43: 'SWITCH'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal131=(Token)match(input,60,FOLLOW_60_in_specifier1033); 
					string_literal131_tree = (CommonTree)adaptor.create(string_literal131);
					adaptor.addChild(root_0, string_literal131_tree);

					}
					break;
				case 6 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:204:54: 'PROCEDURE'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal132=(Token)match(input,56,FOLLOW_56_in_specifier1037); 
					string_literal132_tree = (CommonTree)adaptor.create(string_literal132);
					adaptor.addChild(root_0, string_literal132_tree);

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:207:1: h : (| 'ARRAY' | 'PROCEDURE' );
	public final Algol60Parser.h_return h() throws RecognitionException {
		Algol60Parser.h_return retval = new Algol60Parser.h_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal133=null;
		Token string_literal134=null;

		CommonTree string_literal133_tree=null;
		CommonTree string_literal134_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:207:3: (| 'ARRAY' | 'PROCEDURE' )
			int alt31=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt31=1;
				}
				break;
			case 43:
				{
				alt31=2;
				}
				break;
			case 56:
				{
				alt31=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:207:5: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:207:7: 'ARRAY'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal133=(Token)match(input,43,FOLLOW_43_in_h1050); 
					string_literal133_tree = (CommonTree)adaptor.create(string_literal133);
					adaptor.addChild(root_0, string_literal133_tree);

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:207:16: 'PROCEDURE'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal134=(Token)match(input,56,FOLLOW_56_in_h1053); 
					string_literal134_tree = (CommonTree)adaptor.create(string_literal134);
					adaptor.addChild(root_0, string_literal134_tree);

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:210:1: formalparameterlist : ( formalpara paralim )* ;
	public final Algol60Parser.formalparameterlist_return formalparameterlist() throws RecognitionException {
		Algol60Parser.formalparameterlist_return retval = new Algol60Parser.formalparameterlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope formalpara135 =null;
		ParserRuleReturnScope paralim136 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:211:2: ( ( formalpara paralim )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:211:3: ( formalpara paralim )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:211:3: ( formalpara paralim )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==ID) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:211:4: formalpara paralim
					{
					pushFollow(FOLLOW_formalpara_in_formalparameterlist1065);
					formalpara135=formalpara();
					state._fsp--;

					adaptor.addChild(root_0, formalpara135.getTree());

					pushFollow(FOLLOW_paralim_in_formalparameterlist1067);
					paralim136=paralim();
					state._fsp--;

					adaptor.addChild(root_0, paralim136.getTree());

					}
					break;

				default :
					break loop32;
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
	// $ANTLR end "formalparameterlist"


	public static class g_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "g"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:216:1: g : ( paralim formalpara g |);
	public final Algol60Parser.g_return g() throws RecognitionException {
		Algol60Parser.g_return retval = new Algol60Parser.g_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope paralim137 =null;
		ParserRuleReturnScope formalpara138 =null;
		ParserRuleReturnScope g139 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:216:3: ( paralim formalpara g |)
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==38) ) {
				alt33=1;
			}
			else if ( () ) {
				alt33=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:216:5: paralim formalpara g
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paralim_in_g1084);
					paralim137=paralim();
					state._fsp--;

					adaptor.addChild(root_0, paralim137.getTree());

					pushFollow(FOLLOW_formalpara_in_g1086);
					formalpara138=formalpara();
					state._fsp--;

					adaptor.addChild(root_0, formalpara138.getTree());

					pushFollow(FOLLOW_g_in_g1088);
					g139=g();
					state._fsp--;

					adaptor.addChild(root_0, g139.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:218:2: 
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:220:1: formalpara : ID ;
	public final Algol60Parser.formalpara_return formalpara() throws RecognitionException {
		Algol60Parser.formalpara_return retval = new Algol60Parser.formalpara_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID140=null;

		CommonTree ID140_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:221:2: ( ID )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:221:4: ID
			{
			root_0 = (CommonTree)adaptor.nil();


			ID140=(Token)match(input,ID,FOLLOW_ID_in_formalpara1116); 
			ID140_tree = (CommonTree)adaptor.create(ID140);
			adaptor.addChild(root_0, ID140_tree);

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:224:1: paralim : ',' ;
	public final Algol60Parser.paralim_return paralim() throws RecognitionException {
		Algol60Parser.paralim_return retval = new Algol60Parser.paralim_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal141=null;

		CommonTree char_literal141_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:224:9: ( ',' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:224:11: ','
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal141=(Token)match(input,38,FOLLOW_38_in_paralim1126); 
			char_literal141_tree = (CommonTree)adaptor.create(char_literal141);
			adaptor.addChild(root_0, char_literal141_tree);

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:228:1: valuepart : 'VALUE' identifier ;
	public final Algol60Parser.valuepart_return valuepart() throws RecognitionException {
		Algol60Parser.valuepart_return retval = new Algol60Parser.valuepart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal142=null;
		ParserRuleReturnScope identifier143 =null;

		CommonTree string_literal142_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:228:11: ( 'VALUE' identifier )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:228:12: 'VALUE' identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal142=(Token)match(input,63,FOLLOW_63_in_valuepart1153); 
			string_literal142_tree = (CommonTree)adaptor.create(string_literal142);
			adaptor.addChild(root_0, string_literal142_tree);

			pushFollow(FOLLOW_identifier_in_valuepart1155);
			identifier143=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier143.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:232:1: designExp : ( simpleDesign | ifclause simpleDesign 'ELSE' designExp );
	public final Algol60Parser.designExp_return designExp() throws RecognitionException {
		Algol60Parser.designExp_return retval = new Algol60Parser.designExp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal147=null;
		ParserRuleReturnScope simpleDesign144 =null;
		ParserRuleReturnScope ifclause145 =null;
		ParserRuleReturnScope simpleDesign146 =null;
		ParserRuleReturnScope designExp148 =null;

		CommonTree string_literal147_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:233:2: ( simpleDesign | ifclause simpleDesign 'ELSE' designExp )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==ID||LA34_0==35) ) {
				alt34=1;
			}
			else if ( (LA34_0==51) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:233:4: simpleDesign
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simpleDesign_in_designExp1170);
					simpleDesign144=simpleDesign();
					state._fsp--;

					adaptor.addChild(root_0, simpleDesign144.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:234:3: ifclause simpleDesign 'ELSE' designExp
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifclause_in_designExp1174);
					ifclause145=ifclause();
					state._fsp--;

					adaptor.addChild(root_0, ifclause145.getTree());

					pushFollow(FOLLOW_simpleDesign_in_designExp1176);
					simpleDesign146=simpleDesign();
					state._fsp--;

					adaptor.addChild(root_0, simpleDesign146.getTree());

					string_literal147=(Token)match(input,47,FOLLOW_47_in_designExp1178); 
					string_literal147_tree = (CommonTree)adaptor.create(string_literal147);
					adaptor.addChild(root_0, string_literal147_tree);

					pushFollow(FOLLOW_designExp_in_designExp1180);
					designExp148=designExp();
					state._fsp--;

					adaptor.addChild(root_0, designExp148.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:237:1: simpleDesign : ( identifier | '(' designExp ')' );
	public final Algol60Parser.simpleDesign_return simpleDesign() throws RecognitionException {
		Algol60Parser.simpleDesign_return retval = new Algol60Parser.simpleDesign_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal150=null;
		Token char_literal152=null;
		ParserRuleReturnScope identifier149 =null;
		ParserRuleReturnScope designExp151 =null;

		CommonTree char_literal150_tree=null;
		CommonTree char_literal152_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:238:2: ( identifier | '(' designExp ')' )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==ID) ) {
				alt35=1;
			}
			else if ( (LA35_0==35) ) {
				alt35=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:238:5: identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_simpleDesign1193);
					identifier149=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier149.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:239:3: '(' designExp ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal150=(Token)match(input,35,FOLLOW_35_in_simpleDesign1197); 
					char_literal150_tree = (CommonTree)adaptor.create(char_literal150);
					adaptor.addChild(root_0, char_literal150_tree);

					pushFollow(FOLLOW_designExp_in_simpleDesign1199);
					designExp151=designExp();
					state._fsp--;

					adaptor.addChild(root_0, designExp151.getTree());

					char_literal152=(Token)match(input,36,FOLLOW_36_in_simpleDesign1201); 
					char_literal152_tree = (CommonTree)adaptor.create(char_literal152);
					adaptor.addChild(root_0, char_literal152_tree);

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:246:1: ifclause : 'IF' expression 'THEN' -> ^( IF expression THEN ) ;
	public final Algol60Parser.ifclause_return ifclause() throws RecognitionException {
		Algol60Parser.ifclause_return retval = new Algol60Parser.ifclause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal153=null;
		Token string_literal155=null;
		ParserRuleReturnScope expression154 =null;

		CommonTree string_literal153_tree=null;
		CommonTree string_literal155_tree=null;
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:246:9: ( 'IF' expression 'THEN' -> ^( IF expression THEN ) )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:246:12: 'IF' expression 'THEN'
			{
			string_literal153=(Token)match(input,51,FOLLOW_51_in_ifclause1219);  
			stream_51.add(string_literal153);

			pushFollow(FOLLOW_expression_in_ifclause1221);
			expression154=expression();
			state._fsp--;

			stream_expression.add(expression154.getTree());
			string_literal155=(Token)match(input,61,FOLLOW_61_in_ifclause1223);  
			stream_61.add(string_literal155);

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
			// 246:34: -> ^( IF expression THEN )
			{
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:246:36: ^( IF expression THEN )
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:249:1: declaration : ( localorown typedeclaration -> ^( LOCAL ) | typedeclaration2 -> ^( TYPE ) | switchdec -> ^( SWITCH ) );
	public final Algol60Parser.declaration_return declaration() throws RecognitionException {
		Algol60Parser.declaration_return retval = new Algol60Parser.declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope localorown156 =null;
		ParserRuleReturnScope typedeclaration157 =null;
		ParserRuleReturnScope typedeclaration2158 =null;
		ParserRuleReturnScope switchdec159 =null;

		RewriteRuleSubtreeStream stream_typedeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typedeclaration");
		RewriteRuleSubtreeStream stream_switchdec=new RewriteRuleSubtreeStream(adaptor,"rule switchdec");
		RewriteRuleSubtreeStream stream_typedeclaration2=new RewriteRuleSubtreeStream(adaptor,"rule typedeclaration2");
		RewriteRuleSubtreeStream stream_localorown=new RewriteRuleSubtreeStream(adaptor,"rule localorown");

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:250:2: ( localorown typedeclaration -> ^( LOCAL ) | typedeclaration2 -> ^( TYPE ) | switchdec -> ^( SWITCH ) )
			int alt36=3;
			switch ( input.LA(1) ) {
			case 45:
			case 52:
			case 54:
			case 57:
				{
				alt36=1;
				}
				break;
			case 43:
			case 56:
				{
				alt36=2;
				}
				break;
			case 60:
				{
				alt36=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:250:4: localorown typedeclaration
					{
					pushFollow(FOLLOW_localorown_in_declaration1266);
					localorown156=localorown();
					state._fsp--;

					stream_localorown.add(localorown156.getTree());
					pushFollow(FOLLOW_typedeclaration_in_declaration1268);
					typedeclaration157=typedeclaration();
					state._fsp--;

					stream_typedeclaration.add(typedeclaration157.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 250:30: -> ^( LOCAL )
					{
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:250:32: ^( LOCAL )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOCAL, "LOCAL"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:251:16: typedeclaration2
					{
					pushFollow(FOLLOW_typedeclaration2_in_declaration1289);
					typedeclaration2158=typedeclaration2();
					state._fsp--;

					stream_typedeclaration2.add(typedeclaration2158.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 251:32: -> ^( TYPE )
					{
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:251:34: ^( TYPE )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:252:15: switchdec
					{
					pushFollow(FOLLOW_switchdec_in_declaration1309);
					switchdec159=switchdec();
					state._fsp--;

					stream_switchdec.add(switchdec159.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 252:24: -> ^( SWITCH )
					{
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:252:26: ^( SWITCH )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SWITCH, "SWITCH"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:254:1: begin : 'BEGIN' d -> ^( 'BEGIN' d ) ;
	public final Algol60Parser.begin_return begin() throws RecognitionException {
		Algol60Parser.begin_return retval = new Algol60Parser.begin_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal160=null;
		ParserRuleReturnScope d161 =null;

		CommonTree string_literal160_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleSubtreeStream stream_d=new RewriteRuleSubtreeStream(adaptor,"rule d");

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:254:7: ( 'BEGIN' d -> ^( 'BEGIN' d ) )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:254:9: 'BEGIN' d
			{
			string_literal160=(Token)match(input,44,FOLLOW_44_in_begin1323);  
			stream_44.add(string_literal160);

			pushFollow(FOLLOW_d_in_begin1325);
			d161=d();
			state._fsp--;

			stream_d.add(d161.getTree());
			// AST REWRITE
			// elements: d, 44
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 254:18: -> ^( 'BEGIN' d )
			{
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:254:20: ^( 'BEGIN' d )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_44.nextNode(), root_1);
				adaptor.addChild(root_1, stream_d.nextTree());
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
	// $ANTLR end "begin"


	public static class compoundT_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "compoundT"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:323:1: compoundT : statement c ;
	public final Algol60Parser.compoundT_return compoundT() throws RecognitionException {
		Algol60Parser.compoundT_return retval = new Algol60Parser.compoundT_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope statement162 =null;
		ParserRuleReturnScope c163 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:324:2: ( statement c )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:324:4: statement c
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_statement_in_compoundT1457);
			statement162=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement162.getTree());

			pushFollow(FOLLOW_c_in_compoundT1459);
			c163=c();
			state._fsp--;

			adaptor.addChild(root_0, c163.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:326:1: c : ( 'END' | ';' compoundT );
	public final Algol60Parser.c_return c() throws RecognitionException {
		Algol60Parser.c_return retval = new Algol60Parser.c_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal164=null;
		Token char_literal165=null;
		ParserRuleReturnScope compoundT166 =null;

		CommonTree string_literal164_tree=null;
		CommonTree char_literal165_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:326:3: ( 'END' | ';' compoundT )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==48) ) {
				alt37=1;
			}
			else if ( (LA37_0==42) ) {
				alt37=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:326:6: 'END'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal164=(Token)match(input,48,FOLLOW_48_in_c1469); 
					string_literal164_tree = (CommonTree)adaptor.create(string_literal164);
					adaptor.addChild(root_0, string_literal164_tree);

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:326:12: ';' compoundT
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal165=(Token)match(input,42,FOLLOW_42_in_c1471); 
					char_literal165_tree = (CommonTree)adaptor.create(char_literal165);
					adaptor.addChild(root_0, char_literal165_tree);

					pushFollow(FOLLOW_compoundT_in_c1473);
					compoundT166=compoundT();
					state._fsp--;

					adaptor.addChild(root_0, compoundT166.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:334:1: statement : ( identifier rs | gotostatement | ifclause j | forclause statement | begin | actualparametrepart );
	public final Algol60Parser.statement_return statement() throws RecognitionException {
		Algol60Parser.statement_return retval = new Algol60Parser.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier167 =null;
		ParserRuleReturnScope rs168 =null;
		ParserRuleReturnScope gotostatement169 =null;
		ParserRuleReturnScope ifclause170 =null;
		ParserRuleReturnScope j171 =null;
		ParserRuleReturnScope forclause172 =null;
		ParserRuleReturnScope statement173 =null;
		ParserRuleReturnScope begin174 =null;
		ParserRuleReturnScope actualparametrepart175 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:335:2: ( identifier rs | gotostatement | ifclause j | forclause statement | begin | actualparametrepart )
			int alt38=6;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt38=1;
				}
				break;
			case 50:
				{
				alt38=2;
				}
				break;
			case 51:
				{
				alt38=3;
				}
				break;
			case 49:
				{
				alt38=4;
				}
				break;
			case 44:
				{
				alt38=5;
				}
				break;
			case EOF:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 46:
			case 47:
			case 48:
			case 55:
			case 58:
			case 61:
			case 62:
			case 64:
			case 67:
				{
				alt38=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:335:4: identifier rs
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_statement1494);
					identifier167=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier167.getTree());

					pushFollow(FOLLOW_rs_in_statement1496);
					rs168=rs();
					state._fsp--;

					adaptor.addChild(root_0, rs168.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:336:3: gotostatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_gotostatement_in_statement1500);
					gotostatement169=gotostatement();
					state._fsp--;

					adaptor.addChild(root_0, gotostatement169.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:337:3: ifclause j
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifclause_in_statement1504);
					ifclause170=ifclause();
					state._fsp--;

					adaptor.addChild(root_0, ifclause170.getTree());

					pushFollow(FOLLOW_j_in_statement1506);
					j171=j();
					state._fsp--;

					adaptor.addChild(root_0, j171.getTree());

					}
					break;
				case 4 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:338:3: forclause statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forclause_in_statement1510);
					forclause172=forclause();
					state._fsp--;

					adaptor.addChild(root_0, forclause172.getTree());

					pushFollow(FOLLOW_statement_in_statement1512);
					statement173=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement173.getTree());

					}
					break;
				case 5 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:339:3: begin
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_begin_in_statement1516);
					begin174=begin();
					state._fsp--;

					adaptor.addChild(root_0, begin174.getTree());

					}
					break;
				case 6 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:340:3: actualparametrepart
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_actualparametrepart_in_statement1520);
					actualparametrepart175=actualparametrepart();
					state._fsp--;

					adaptor.addChild(root_0, actualparametrepart175.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:343:1: rs : ( cc | ':' m );
	public final Algol60Parser.rs_return rs() throws RecognitionException {
		Algol60Parser.rs_return retval = new Algol60Parser.rs_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal177=null;
		ParserRuleReturnScope cc176 =null;
		ParserRuleReturnScope m178 =null;

		CommonTree char_literal177_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:343:4: ( cc | ':' m )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==EOF||LA39_0==35||(LA39_0 >= 41 && LA39_0 <= 42)||LA39_0==48) ) {
				alt39=1;
			}
			else if ( (LA39_0==40) ) {
				alt39=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:343:6: cc
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cc_in_rs1531);
					cc176=cc();
					state._fsp--;

					adaptor.addChild(root_0, cc176.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:344:4: ':' m
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal177=(Token)match(input,40,FOLLOW_40_in_rs1536); 
					char_literal177_tree = (CommonTree)adaptor.create(char_literal177);
					adaptor.addChild(root_0, char_literal177_tree);

					pushFollow(FOLLOW_m_in_rs1538);
					m178=m();
					state._fsp--;

					adaptor.addChild(root_0, m178.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:347:1: m : ( label ':' m | gotostatement | ifclause j | forclause statement | begin | cc );
	public final Algol60Parser.m_return m() throws RecognitionException {
		Algol60Parser.m_return retval = new Algol60Parser.m_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal180=null;
		ParserRuleReturnScope label179 =null;
		ParserRuleReturnScope m181 =null;
		ParserRuleReturnScope gotostatement182 =null;
		ParserRuleReturnScope ifclause183 =null;
		ParserRuleReturnScope j184 =null;
		ParserRuleReturnScope forclause185 =null;
		ParserRuleReturnScope statement186 =null;
		ParserRuleReturnScope begin187 =null;
		ParserRuleReturnScope cc188 =null;

		CommonTree char_literal180_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:347:3: ( label ':' m | gotostatement | ifclause j | forclause statement | begin | cc )
			int alt40=6;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt40=1;
				}
				break;
			case 50:
				{
				alt40=2;
				}
				break;
			case 51:
				{
				alt40=3;
				}
				break;
			case 49:
				{
				alt40=4;
				}
				break;
			case 44:
				{
				alt40=5;
				}
				break;
			case EOF:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 46:
			case 47:
			case 48:
			case 55:
			case 58:
			case 61:
			case 62:
			case 64:
			case 67:
				{
				alt40=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:347:5: label ':' m
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_label_in_m1550);
					label179=label();
					state._fsp--;

					adaptor.addChild(root_0, label179.getTree());

					char_literal180=(Token)match(input,40,FOLLOW_40_in_m1552); 
					char_literal180_tree = (CommonTree)adaptor.create(char_literal180);
					adaptor.addChild(root_0, char_literal180_tree);

					pushFollow(FOLLOW_m_in_m1554);
					m181=m();
					state._fsp--;

					adaptor.addChild(root_0, m181.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:348:4: gotostatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_gotostatement_in_m1559);
					gotostatement182=gotostatement();
					state._fsp--;

					adaptor.addChild(root_0, gotostatement182.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:349:3: ifclause j
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifclause_in_m1563);
					ifclause183=ifclause();
					state._fsp--;

					adaptor.addChild(root_0, ifclause183.getTree());

					pushFollow(FOLLOW_j_in_m1565);
					j184=j();
					state._fsp--;

					adaptor.addChild(root_0, j184.getTree());

					}
					break;
				case 4 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:350:3: forclause statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forclause_in_m1569);
					forclause185=forclause();
					state._fsp--;

					adaptor.addChild(root_0, forclause185.getTree());

					pushFollow(FOLLOW_statement_in_m1571);
					statement186=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement186.getTree());

					}
					break;
				case 5 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:351:3: begin
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_begin_in_m1575);
					begin187=begin();
					state._fsp--;

					adaptor.addChild(root_0, begin187.getTree());

					}
					break;
				case 6 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:352:3: cc
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cc_in_m1580);
					cc188=cc();
					state._fsp--;

					adaptor.addChild(root_0, cc188.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:355:1: st : ( identifier cc | gotostatement | ifclause j | forclause statement );
	public final Algol60Parser.st_return st() throws RecognitionException {
		Algol60Parser.st_return retval = new Algol60Parser.st_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier189 =null;
		ParserRuleReturnScope cc190 =null;
		ParserRuleReturnScope gotostatement191 =null;
		ParserRuleReturnScope ifclause192 =null;
		ParserRuleReturnScope j193 =null;
		ParserRuleReturnScope forclause194 =null;
		ParserRuleReturnScope statement195 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:355:4: ( identifier cc | gotostatement | ifclause j | forclause statement )
			int alt41=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt41=1;
				}
				break;
			case 50:
				{
				alt41=2;
				}
				break;
			case 51:
				{
				alt41=3;
				}
				break;
			case 49:
				{
				alt41=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:355:5: identifier cc
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_st1589);
					identifier189=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier189.getTree());

					pushFollow(FOLLOW_cc_in_st1591);
					cc190=cc();
					state._fsp--;

					adaptor.addChild(root_0, cc190.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:356:13: gotostatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_gotostatement_in_st1605);
					gotostatement191=gotostatement();
					state._fsp--;

					adaptor.addChild(root_0, gotostatement191.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:357:12: ifclause j
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifclause_in_st1618);
					ifclause192=ifclause();
					state._fsp--;

					adaptor.addChild(root_0, ifclause192.getTree());

					pushFollow(FOLLOW_j_in_st1620);
					j193=j();
					state._fsp--;

					adaptor.addChild(root_0, j193.getTree());

					}
					break;
				case 4 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:358:13: forclause statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forclause_in_st1634);
					forclause194=forclause();
					state._fsp--;

					adaptor.addChild(root_0, forclause194.getTree());

					pushFollow(FOLLOW_statement_in_st1636);
					statement195=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement195.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:363:1: forclause : 'FOR' simpleARi ':=' forlist 'DO' ;
	public final Algol60Parser.forclause_return forclause() throws RecognitionException {
		Algol60Parser.forclause_return retval = new Algol60Parser.forclause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal196=null;
		Token string_literal198=null;
		Token string_literal200=null;
		ParserRuleReturnScope simpleARi197 =null;
		ParserRuleReturnScope forlist199 =null;

		CommonTree string_literal196_tree=null;
		CommonTree string_literal198_tree=null;
		CommonTree string_literal200_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:364:2: ( 'FOR' simpleARi ':=' forlist 'DO' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:364:4: 'FOR' simpleARi ':=' forlist 'DO'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal196=(Token)match(input,49,FOLLOW_49_in_forclause1651); 
			string_literal196_tree = (CommonTree)adaptor.create(string_literal196);
			adaptor.addChild(root_0, string_literal196_tree);

			pushFollow(FOLLOW_simpleARi_in_forclause1653);
			simpleARi197=simpleARi();
			state._fsp--;

			adaptor.addChild(root_0, simpleARi197.getTree());

			string_literal198=(Token)match(input,41,FOLLOW_41_in_forclause1655); 
			string_literal198_tree = (CommonTree)adaptor.create(string_literal198);
			adaptor.addChild(root_0, string_literal198_tree);

			pushFollow(FOLLOW_forlist_in_forclause1657);
			forlist199=forlist();
			state._fsp--;

			adaptor.addChild(root_0, forlist199.getTree());

			string_literal200=(Token)match(input,46,FOLLOW_46_in_forclause1659); 
			string_literal200_tree = (CommonTree)adaptor.create(string_literal200);
			adaptor.addChild(root_0, string_literal200_tree);

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:367:1: forlist : forlistelement ( ',' forlistelement )* ;
	public final Algol60Parser.forlist_return forlist() throws RecognitionException {
		Algol60Parser.forlist_return retval = new Algol60Parser.forlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal202=null;
		ParserRuleReturnScope forlistelement201 =null;
		ParserRuleReturnScope forlistelement203 =null;

		CommonTree char_literal202_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:367:9: ( forlistelement ( ',' forlistelement )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:368:16: forlistelement ( ',' forlistelement )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_forlistelement_in_forlist1685);
			forlistelement201=forlistelement();
			state._fsp--;

			adaptor.addChild(root_0, forlistelement201.getTree());

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:368:31: ( ',' forlistelement )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==38) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:368:32: ',' forlistelement
					{
					char_literal202=(Token)match(input,38,FOLLOW_38_in_forlist1688); 
					char_literal202_tree = (CommonTree)adaptor.create(char_literal202);
					adaptor.addChild(root_0, char_literal202_tree);

					pushFollow(FOLLOW_forlistelement_in_forlist1690);
					forlistelement203=forlistelement();
					state._fsp--;

					adaptor.addChild(root_0, forlistelement203.getTree());

					}
					break;

				default :
					break loop42;
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
	// $ANTLR end "forlist"


	public static class forlistelement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forlistelement"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:374:1: forlistelement : simpleARi q ;
	public final Algol60Parser.forlistelement_return forlistelement() throws RecognitionException {
		Algol60Parser.forlistelement_return retval = new Algol60Parser.forlistelement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope simpleARi204 =null;
		ParserRuleReturnScope q205 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:375:2: ( simpleARi q )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:375:3: simpleARi q
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_simpleARi_in_forlistelement1708);
			simpleARi204=simpleARi();
			state._fsp--;

			adaptor.addChild(root_0, simpleARi204.getTree());

			pushFollow(FOLLOW_q_in_forlistelement1710);
			q205=q();
			state._fsp--;

			adaptor.addChild(root_0, q205.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:378:1: q : (| 'STEP' simpleARi 'UNTIL' expression | 'WHILE' expression );
	public final Algol60Parser.q_return q() throws RecognitionException {
		Algol60Parser.q_return retval = new Algol60Parser.q_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal206=null;
		Token string_literal208=null;
		Token string_literal210=null;
		ParserRuleReturnScope simpleARi207 =null;
		ParserRuleReturnScope expression209 =null;
		ParserRuleReturnScope expression211 =null;

		CommonTree string_literal206_tree=null;
		CommonTree string_literal208_tree=null;
		CommonTree string_literal210_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:378:3: (| 'STEP' simpleARi 'UNTIL' expression | 'WHILE' expression )
			int alt43=3;
			switch ( input.LA(1) ) {
			case 38:
			case 46:
				{
				alt43=1;
				}
				break;
			case 58:
				{
				alt43=2;
				}
				break;
			case 64:
				{
				alt43=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:378:4: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:378:5: 'STEP' simpleARi 'UNTIL' expression
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal206=(Token)match(input,58,FOLLOW_58_in_q1720); 
					string_literal206_tree = (CommonTree)adaptor.create(string_literal206);
					adaptor.addChild(root_0, string_literal206_tree);

					pushFollow(FOLLOW_simpleARi_in_q1721);
					simpleARi207=simpleARi();
					state._fsp--;

					adaptor.addChild(root_0, simpleARi207.getTree());

					string_literal208=(Token)match(input,62,FOLLOW_62_in_q1723); 
					string_literal208_tree = (CommonTree)adaptor.create(string_literal208);
					adaptor.addChild(root_0, string_literal208_tree);

					pushFollow(FOLLOW_expression_in_q1724);
					expression209=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression209.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:379:11: 'WHILE' expression
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal210=(Token)match(input,64,FOLLOW_64_in_q1736); 
					string_literal210_tree = (CommonTree)adaptor.create(string_literal210);
					adaptor.addChild(root_0, string_literal210_tree);

					pushFollow(FOLLOW_expression_in_q1737);
					expression211=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression211.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:388:1: k : ( 'ELSE' statement |);
	public final Algol60Parser.k_return k() throws RecognitionException {
		Algol60Parser.k_return retval = new Algol60Parser.k_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal212=null;
		ParserRuleReturnScope statement213 =null;

		CommonTree string_literal212_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:388:3: ( 'ELSE' statement |)
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==47) ) {
				alt44=1;
			}
			else if ( (LA44_0==EOF||LA44_0==42||LA44_0==48) ) {
				alt44=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:388:5: 'ELSE' statement
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal212=(Token)match(input,47,FOLLOW_47_in_k1778); 
					string_literal212_tree = (CommonTree)adaptor.create(string_literal212);
					adaptor.addChild(root_0, string_literal212_tree);

					pushFollow(FOLLOW_statement_in_k1780);
					statement213=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement213.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:389:2: 
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:397:1: y : ( identifier cc | gotostatement | begin |);
	public final Algol60Parser.y_return y() throws RecognitionException {
		Algol60Parser.y_return retval = new Algol60Parser.y_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier214 =null;
		ParserRuleReturnScope cc215 =null;
		ParserRuleReturnScope gotostatement216 =null;
		ParserRuleReturnScope begin217 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:397:3: ( identifier cc | gotostatement | begin |)
			int alt45=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt45=1;
				}
				break;
			case 50:
				{
				alt45=2;
				}
				break;
			case 44:
				{
				alt45=3;
				}
				break;
			case EOF:
			case 42:
			case 47:
			case 48:
				{
				alt45=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:397:5: identifier cc
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_y1801);
					identifier214=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier214.getTree());

					pushFollow(FOLLOW_cc_in_y1803);
					cc215=cc();
					state._fsp--;

					adaptor.addChild(root_0, cc215.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:398:4: gotostatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_gotostatement_in_y1808);
					gotostatement216=gotostatement();
					state._fsp--;

					adaptor.addChild(root_0, gotostatement216.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:399:3: begin
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_begin_in_y1812);
					begin217=begin();
					state._fsp--;

					adaptor.addChild(root_0, begin217.getTree());

					}
					break;
				case 4 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:401:2: 
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:407:1: j : ( forclause statement | identifier u || gotostatement | begin );
	public final Algol60Parser.j_return j() throws RecognitionException {
		Algol60Parser.j_return retval = new Algol60Parser.j_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope forclause218 =null;
		ParserRuleReturnScope statement219 =null;
		ParserRuleReturnScope identifier220 =null;
		ParserRuleReturnScope u221 =null;
		ParserRuleReturnScope gotostatement222 =null;
		ParserRuleReturnScope begin223 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:407:3: ( forclause statement | identifier u || gotostatement | begin )
			int alt46=5;
			switch ( input.LA(1) ) {
			case 49:
				{
				alt46=1;
				}
				break;
			case ID:
				{
				alt46=2;
				}
				break;
			case EOF:
			case 42:
			case 48:
				{
				alt46=3;
				}
				break;
			case 50:
				{
				alt46=4;
				}
				break;
			case 44:
				{
				alt46=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:407:5: forclause statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forclause_in_j1833);
					forclause218=forclause();
					state._fsp--;

					adaptor.addChild(root_0, forclause218.getTree());

					pushFollow(FOLLOW_statement_in_j1835);
					statement219=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement219.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:407:27: identifier u
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_j1839);
					identifier220=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier220.getTree());

					pushFollow(FOLLOW_u_in_j1841);
					u221=u();
					state._fsp--;

					adaptor.addChild(root_0, u221.getTree());

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:407:42: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 4 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:407:45: gotostatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_gotostatement_in_j1848);
					gotostatement222=gotostatement();
					state._fsp--;

					adaptor.addChild(root_0, gotostatement222.getTree());

					}
					break;
				case 5 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:407:59: begin
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_begin_in_j1850);
					begin223=begin();
					state._fsp--;

					adaptor.addChild(root_0, begin223.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:414:1: u : ( cc k | ':' w );
	public final Algol60Parser.u_return u() throws RecognitionException {
		Algol60Parser.u_return retval = new Algol60Parser.u_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal226=null;
		ParserRuleReturnScope cc224 =null;
		ParserRuleReturnScope k225 =null;
		ParserRuleReturnScope w227 =null;

		CommonTree char_literal226_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:414:3: ( cc k | ':' w )
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==EOF||LA47_0==35||(LA47_0 >= 41 && LA47_0 <= 42)||(LA47_0 >= 47 && LA47_0 <= 48)) ) {
				alt47=1;
			}
			else if ( (LA47_0==40) ) {
				alt47=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:414:5: cc k
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cc_in_u1867);
					cc224=cc();
					state._fsp--;

					adaptor.addChild(root_0, cc224.getTree());

					pushFollow(FOLLOW_k_in_u1869);
					k225=k();
					state._fsp--;

					adaptor.addChild(root_0, k225.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:415:4: ':' w
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal226=(Token)match(input,40,FOLLOW_40_in_u1874); 
					char_literal226_tree = (CommonTree)adaptor.create(char_literal226);
					adaptor.addChild(root_0, char_literal226_tree);

					pushFollow(FOLLOW_w_in_u1876);
					w227=w();
					state._fsp--;

					adaptor.addChild(root_0, w227.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:418:1: w : ( forstatement ( label ':' )* forstatement | y k );
	public final Algol60Parser.w_return w() throws RecognitionException {
		Algol60Parser.w_return retval = new Algol60Parser.w_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal230=null;
		ParserRuleReturnScope forstatement228 =null;
		ParserRuleReturnScope label229 =null;
		ParserRuleReturnScope forstatement231 =null;
		ParserRuleReturnScope y232 =null;
		ParserRuleReturnScope k233 =null;

		CommonTree char_literal230_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:418:3: ( forstatement ( label ':' )* forstatement | y k )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==65) ) {
				alt49=1;
			}
			else if ( (LA49_0==EOF||LA49_0==ID||LA49_0==42||LA49_0==44||(LA49_0 >= 47 && LA49_0 <= 48)||LA49_0==50) ) {
				alt49=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:418:5: forstatement ( label ':' )* forstatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forstatement_in_w1886);
					forstatement228=forstatement();
					state._fsp--;

					adaptor.addChild(root_0, forstatement228.getTree());

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:418:18: ( label ':' )*
					loop48:
					while (true) {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==ID) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:418:19: label ':'
							{
							pushFollow(FOLLOW_label_in_w1889);
							label229=label();
							state._fsp--;

							adaptor.addChild(root_0, label229.getTree());

							char_literal230=(Token)match(input,40,FOLLOW_40_in_w1891); 
							char_literal230_tree = (CommonTree)adaptor.create(char_literal230);
							adaptor.addChild(root_0, char_literal230_tree);

							}
							break;

						default :
							break loop48;
						}
					}

					pushFollow(FOLLOW_forstatement_in_w1895);
					forstatement231=forstatement();
					state._fsp--;

					adaptor.addChild(root_0, forstatement231.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:419:5: y k
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_y_in_w1901);
					y232=y();
					state._fsp--;

					adaptor.addChild(root_0, y232.getTree());

					pushFollow(FOLLOW_k_in_w1903);
					k233=k();
					state._fsp--;

					adaptor.addChild(root_0, k233.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:439:1: cc : ( ':=' simpleAR | actualparametrepart );
	public final Algol60Parser.cc_return cc() throws RecognitionException {
		Algol60Parser.cc_return retval = new Algol60Parser.cc_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal234=null;
		ParserRuleReturnScope simpleAR235 =null;
		ParserRuleReturnScope actualparametrepart236 =null;

		CommonTree string_literal234_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:439:4: ( ':=' simpleAR | actualparametrepart )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==41) ) {
				alt50=1;
			}
			else if ( (LA50_0==EOF||LA50_0==35||LA50_0==42||(LA50_0 >= 47 && LA50_0 <= 48)) ) {
				alt50=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:439:6: ':=' simpleAR
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal234=(Token)match(input,41,FOLLOW_41_in_cc1936); 
					string_literal234_tree = (CommonTree)adaptor.create(string_literal234);
					adaptor.addChild(root_0, string_literal234_tree);

					pushFollow(FOLLOW_simpleAR_in_cc1939);
					simpleAR235=simpleAR();
					state._fsp--;

					adaptor.addChild(root_0, simpleAR235.getTree());

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:440:4: actualparametrepart
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_actualparametrepart_in_cc1944);
					actualparametrepart236=actualparametrepart();
					state._fsp--;

					adaptor.addChild(root_0, actualparametrepart236.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:444:1: actualparametrepart : ( '(' actualparalist ')' ( STRING ':' '(' actualparalist ')' )* |);
	public final Algol60Parser.actualparametrepart_return actualparametrepart() throws RecognitionException {
		Algol60Parser.actualparametrepart_return retval = new Algol60Parser.actualparametrepart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal237=null;
		Token char_literal239=null;
		Token STRING240=null;
		Token char_literal241=null;
		Token char_literal242=null;
		Token char_literal244=null;
		ParserRuleReturnScope actualparalist238 =null;
		ParserRuleReturnScope actualparalist243 =null;

		CommonTree char_literal237_tree=null;
		CommonTree char_literal239_tree=null;
		CommonTree STRING240_tree=null;
		CommonTree char_literal241_tree=null;
		CommonTree char_literal242_tree=null;
		CommonTree char_literal244_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:445:2: ( '(' actualparalist ')' ( STRING ':' '(' actualparalist ')' )* |)
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==35) ) {
				alt52=1;
			}
			else if ( (LA52_0==EOF||(LA52_0 >= 36 && LA52_0 <= 42)||(LA52_0 >= 46 && LA52_0 <= 48)||LA52_0==55||LA52_0==58||(LA52_0 >= 61 && LA52_0 <= 62)||LA52_0==64||LA52_0==67) ) {
				alt52=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:445:4: '(' actualparalist ')' ( STRING ':' '(' actualparalist ')' )*
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal237=(Token)match(input,35,FOLLOW_35_in_actualparametrepart1957); 
					char_literal237_tree = (CommonTree)adaptor.create(char_literal237);
					adaptor.addChild(root_0, char_literal237_tree);

					pushFollow(FOLLOW_actualparalist_in_actualparametrepart1959);
					actualparalist238=actualparalist();
					state._fsp--;

					adaptor.addChild(root_0, actualparalist238.getTree());

					char_literal239=(Token)match(input,36,FOLLOW_36_in_actualparametrepart1960); 
					char_literal239_tree = (CommonTree)adaptor.create(char_literal239);
					adaptor.addChild(root_0, char_literal239_tree);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:445:25: ( STRING ':' '(' actualparalist ')' )*
					loop51:
					while (true) {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==STRING) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:445:26: STRING ':' '(' actualparalist ')'
							{
							STRING240=(Token)match(input,STRING,FOLLOW_STRING_in_actualparametrepart1962); 
							STRING240_tree = (CommonTree)adaptor.create(STRING240);
							adaptor.addChild(root_0, STRING240_tree);

							char_literal241=(Token)match(input,40,FOLLOW_40_in_actualparametrepart1964); 
							char_literal241_tree = (CommonTree)adaptor.create(char_literal241);
							adaptor.addChild(root_0, char_literal241_tree);

							char_literal242=(Token)match(input,35,FOLLOW_35_in_actualparametrepart1966); 
							char_literal242_tree = (CommonTree)adaptor.create(char_literal242);
							adaptor.addChild(root_0, char_literal242_tree);

							pushFollow(FOLLOW_actualparalist_in_actualparametrepart1967);
							actualparalist243=actualparalist();
							state._fsp--;

							adaptor.addChild(root_0, actualparalist243.getTree());

							char_literal244=(Token)match(input,36,FOLLOW_36_in_actualparametrepart1968); 
							char_literal244_tree = (CommonTree)adaptor.create(char_literal244);
							adaptor.addChild(root_0, char_literal244_tree);

							}
							break;

						default :
							break loop51;
						}
					}

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:447:2: 
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:449:1: actualparalist : ( actualpara paralim )* ;
	public final Algol60Parser.actualparalist_return actualparalist() throws RecognitionException {
		Algol60Parser.actualparalist_return retval = new Algol60Parser.actualparalist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope actualpara245 =null;
		ParserRuleReturnScope paralim246 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:450:2: ( ( actualpara paralim )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:450:4: ( actualpara paralim )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:450:4: ( actualpara paralim )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==ID) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:450:5: actualpara paralim
					{
					pushFollow(FOLLOW_actualpara_in_actualparalist1986);
					actualpara245=actualpara();
					state._fsp--;

					adaptor.addChild(root_0, actualpara245.getTree());

					pushFollow(FOLLOW_paralim_in_actualparalist1988);
					paralim246=paralim();
					state._fsp--;

					adaptor.addChild(root_0, paralim246.getTree());

					}
					break;

				default :
					break loop53;
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
	// $ANTLR end "actualparalist"


	public static class actualpara_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "actualpara"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:458:1: actualpara : identifier ;
	public final Algol60Parser.actualpara_return actualpara() throws RecognitionException {
		Algol60Parser.actualpara_return retval = new Algol60Parser.actualpara_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier247 =null;


		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:459:2: ( identifier )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:459:4: identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_actualpara2010);
			identifier247=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier247.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:465:1: leftpart : identifier ':=' ;
	public final Algol60Parser.leftpart_return leftpart() throws RecognitionException {
		Algol60Parser.leftpart_return retval = new Algol60Parser.leftpart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal249=null;
		ParserRuleReturnScope identifier248 =null;

		CommonTree string_literal249_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:465:9: ( identifier ':=' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:465:11: identifier ':='
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_leftpart2025);
			identifier248=identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier248.getTree());

			string_literal249=(Token)match(input,41,FOLLOW_41_in_leftpart2027); 
			string_literal249_tree = (CommonTree)adaptor.create(string_literal249);
			adaptor.addChild(root_0, string_literal249_tree);

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:469:1: gotostatement : 'GOTO' designExp ;
	public final Algol60Parser.gotostatement_return gotostatement() throws RecognitionException {
		Algol60Parser.gotostatement_return retval = new Algol60Parser.gotostatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal250=null;
		ParserRuleReturnScope designExp251 =null;

		CommonTree string_literal250_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:470:2: ( 'GOTO' designExp )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:470:4: 'GOTO' designExp
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal250=(Token)match(input,50,FOLLOW_50_in_gotostatement2041); 
			string_literal250_tree = (CommonTree)adaptor.create(string_literal250);
			adaptor.addChild(root_0, string_literal250_tree);

			pushFollow(FOLLOW_designExp_in_gotostatement2043);
			designExp251=designExp();
			state._fsp--;

			adaptor.addChild(root_0, designExp251.getTree());

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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:475:1: forstatement : 'Y' ;
	public final Algol60Parser.forstatement_return forstatement() throws RecognitionException {
		Algol60Parser.forstatement_return retval = new Algol60Parser.forstatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal252=null;

		CommonTree char_literal252_tree=null;

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:476:2: ( 'Y' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:476:4: 'Y'
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal252=(Token)match(input,65,FOLLOW_65_in_forstatement2058); 
			char_literal252_tree = (CommonTree)adaptor.create(char_literal252);
			adaptor.addChild(root_0, char_literal252_tree);

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



	public static final BitSet FOLLOW_prog1_in_prog128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleAR_in_expression147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifclause_in_expression151 = new BitSet(new long[]{0x0000000800080000L});
	public static final BitSet FOLLOW_ei_in_expression153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDesign_in_ei164 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_ei166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleARi_in_simpleAR176 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_41_in_simpleAR178 = new BitSet(new long[]{0x0080000800280000L});
	public static final BitSet FOLLOW_simpleARi_in_simpleAR181 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_multExp_in_simpleARi193 = new BitSet(new long[]{0x000000A000000002L});
	public static final BitSet FOLLOW_37_in_simpleARi196 = new BitSet(new long[]{0x0080000800280000L});
	public static final BitSet FOLLOW_39_in_simpleARi201 = new BitSet(new long[]{0x0080000800280000L});
	public static final BitSet FOLLOW_multExp_in_simpleARi205 = new BitSet(new long[]{0x000000A000000002L});
	public static final BitSet FOLLOW_powExp_in_multExp221 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_multExp223 = new BitSet(new long[]{0x0080000800280000L});
	public static final BitSet FOLLOW_powExp_in_multExp226 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_identifier_in_powExp239 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_actualparametrepart_in_powExp241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_powExp253 = new BitSet(new long[]{0x0088000800280000L});
	public static final BitSet FOLLOW_expression_in_powExp255 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_powExp257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_powExp269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleAR2_in_expression2295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifclause_in_expression2299 = new BitSet(new long[]{0x0000000800080000L});
	public static final BitSet FOLLOW_ei_in_expression2301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDesign_in_ei2312 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_ei2314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleARi2_in_simpleAR2324 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_41_in_simpleAR2326 = new BitSet(new long[]{0x0080000000280000L});
	public static final BitSet FOLLOW_simpleARi2_in_simpleAR2328 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_multExp2_in_simpleARi2340 = new BitSet(new long[]{0x000000A000000002L});
	public static final BitSet FOLLOW_37_in_simpleARi2343 = new BitSet(new long[]{0x0080000000280000L});
	public static final BitSet FOLLOW_39_in_simpleARi2348 = new BitSet(new long[]{0x0080000000280000L});
	public static final BitSet FOLLOW_multExp2_in_simpleARi2352 = new BitSet(new long[]{0x000000A000000002L});
	public static final BitSet FOLLOW_powExp2_in_multExp2368 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_multExp2370 = new BitSet(new long[]{0x0080000000280000L});
	public static final BitSet FOLLOW_powExp2_in_multExp2373 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_identifier_in_powExp2397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_powExp2409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier421 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000004L});
	public static final BitSet FOLLOW_o_in_identifier423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_o434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_o453 = new BitSet(new long[]{0x0088000800280000L});
	public static final BitSet FOLLOW_expression_in_o455 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_38_in_o458 = new BitSet(new long[]{0x0088000800280000L});
	public static final BitSet FOLLOW_expression_in_o460 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_o463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_d526 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_d528 = new BitSet(new long[]{0x135E380800080000L});
	public static final BitSet FOLLOW_declaration_in_d531 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_d533 = new BitSet(new long[]{0x135E380800080000L});
	public static final BitSet FOLLOW_compoundT_in_d537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundT_in_d551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_prog1567 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog1569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_prog1596 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_prog1598 = new BitSet(new long[]{0x0000100000080000L});
	public static final BitSet FOLLOW_begin_in_prog1602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_label634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_localorown660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_localorown662 = new BitSet(new long[]{0x0210200000000000L});
	public static final BitSet FOLLOW_type_in_localorown664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_typeliste690 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_t_in_typeliste692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_t701 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_typeliste_in_t702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayseg2_in_arraylist717 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_a_in_arraylist719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_a729 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_identifier_in_a731 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_a_in_a733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_arrayseg2758 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_arrayseg2760 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_arrayseg2763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_arrayseg2765 = new BitSet(new long[]{0x0080000800280000L});
	public static final BitSet FOLLOW_boundplist_in_arrayseg2767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_arrayseg2769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boundp_in_boundplist781 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_z_in_boundplist783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_z794 = new BitSet(new long[]{0x0080000800280000L});
	public static final BitSet FOLLOW_boundp_in_z796 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_z_in_z798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleARi_in_boundp811 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_boundp813 = new BitSet(new long[]{0x0080000800280000L});
	public static final BitSet FOLLOW_simpleARi_in_boundp815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeliste_in_typedeclaration826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_typedeclaration829 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_arraylist_in_typedeclaration831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_in_typedeclaration834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_typedeclaration2842 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_arraylist_in_typedeclaration2844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_in_typedeclaration2847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_switchdec857 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_identifier_in_switchdec859 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_switchdec861 = new BitSet(new long[]{0x0008000800080000L});
	public static final BitSet FOLLOW_switchlist_in_switchdec863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designExp_in_switchlist876 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_s_in_switchlist878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_s887 = new BitSet(new long[]{0x0008000800080000L});
	public static final BitSet FOLLOW_designExp_in_s889 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_s_in_s891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_procedure904 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_procedurehead_in_procedure906 = new BitSet(new long[]{0x000E100800080000L});
	public static final BitSet FOLLOW_statement_in_procedure908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_procedurehead924 = new BitSet(new long[]{0x0000040800000000L});
	public static final BitSet FOLLOW_formalparameterpart_in_procedurehead926 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_procedurehead928 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_valuepart_in_procedurehead930 = new BitSet(new long[]{0x1B30280000000000L});
	public static final BitSet FOLLOW_specificationpart_in_procedurehead932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_formalparameterpart946 = new BitSet(new long[]{0x0000001000080000L});
	public static final BitSet FOLLOW_formalparameterlist_in_formalparameterpart948 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_formalparameterpart950 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_STRING_in_formalparameterpart953 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_formalparameterpart954 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_formalparameterpart955 = new BitSet(new long[]{0x0000001000080000L});
	public static final BitSet FOLLOW_formalparameterlist_in_formalparameterpart956 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_formalparameterpart957 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_specifier_in_specificationpart977 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_identifierlist_in_specificationpart979 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_specificationpart981 = new BitSet(new long[]{0x1B30280000000000L});
	public static final BitSet FOLLOW_specificationpart_in_specificationpart983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_identifierlist998 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_identifierlist1001 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_identifier_in_identifierlist1002 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_59_in_specifier1015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_specifier1019 = new BitSet(new long[]{0x0100080000000000L});
	public static final BitSet FOLLOW_h_in_specifier1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_specifier1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_specifier1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_specifier1033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_specifier1037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_h1050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_h1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalpara_in_formalparameterlist1065 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_paralim_in_formalparameterlist1067 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_paralim_in_g1084 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_formalpara_in_g1086 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_g_in_g1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_formalpara1116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_paralim1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_valuepart1153 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_identifier_in_valuepart1155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDesign_in_designExp1170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifclause_in_designExp1174 = new BitSet(new long[]{0x0000000800080000L});
	public static final BitSet FOLLOW_simpleDesign_in_designExp1176 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_designExp1178 = new BitSet(new long[]{0x0008000800080000L});
	public static final BitSet FOLLOW_designExp_in_designExp1180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_simpleDesign1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_simpleDesign1197 = new BitSet(new long[]{0x0008000800080000L});
	public static final BitSet FOLLOW_designExp_in_simpleDesign1199 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_simpleDesign1201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_ifclause1219 = new BitSet(new long[]{0x0088000800280000L});
	public static final BitSet FOLLOW_expression_in_ifclause1221 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_ifclause1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localorown_in_declaration1266 = new BitSet(new long[]{0x0100080000080000L});
	public static final BitSet FOLLOW_typedeclaration_in_declaration1268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typedeclaration2_in_declaration1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchdec_in_declaration1309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_begin1323 = new BitSet(new long[]{0x135E380800080000L});
	public static final BitSet FOLLOW_d_in_begin1325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_compoundT1457 = new BitSet(new long[]{0x0001040000000000L});
	public static final BitSet FOLLOW_c_in_compoundT1459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_c1469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_c1471 = new BitSet(new long[]{0x000E100800080000L});
	public static final BitSet FOLLOW_compoundT_in_c1473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_statement1494 = new BitSet(new long[]{0x0000030800000000L});
	public static final BitSet FOLLOW_rs_in_statement1496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gotostatement_in_statement1500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifclause_in_statement1504 = new BitSet(new long[]{0x0006100000080000L});
	public static final BitSet FOLLOW_j_in_statement1506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forclause_in_statement1510 = new BitSet(new long[]{0x000E100800080000L});
	public static final BitSet FOLLOW_statement_in_statement1512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_statement1516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualparametrepart_in_statement1520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cc_in_rs1531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_rs1536 = new BitSet(new long[]{0x000E120800080000L});
	public static final BitSet FOLLOW_m_in_rs1538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_m1550 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_m1552 = new BitSet(new long[]{0x000E120800080000L});
	public static final BitSet FOLLOW_m_in_m1554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gotostatement_in_m1559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifclause_in_m1563 = new BitSet(new long[]{0x0006100000080000L});
	public static final BitSet FOLLOW_j_in_m1565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forclause_in_m1569 = new BitSet(new long[]{0x000E100800080000L});
	public static final BitSet FOLLOW_statement_in_m1571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_m1575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cc_in_m1580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_st1589 = new BitSet(new long[]{0x0000020800000000L});
	public static final BitSet FOLLOW_cc_in_st1591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gotostatement_in_st1605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifclause_in_st1618 = new BitSet(new long[]{0x0006100000080000L});
	public static final BitSet FOLLOW_j_in_st1620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forclause_in_st1634 = new BitSet(new long[]{0x000E100800080000L});
	public static final BitSet FOLLOW_statement_in_st1636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_forclause1651 = new BitSet(new long[]{0x0080000800280000L});
	public static final BitSet FOLLOW_simpleARi_in_forclause1653 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_forclause1655 = new BitSet(new long[]{0x0080000800280000L});
	public static final BitSet FOLLOW_forlist_in_forclause1657 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_forclause1659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forlistelement_in_forlist1685 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_forlist1688 = new BitSet(new long[]{0x0080000800280000L});
	public static final BitSet FOLLOW_forlistelement_in_forlist1690 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_simpleARi_in_forlistelement1708 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_q_in_forlistelement1710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_q1720 = new BitSet(new long[]{0x0080000800280000L});
	public static final BitSet FOLLOW_simpleARi_in_q1721 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_q1723 = new BitSet(new long[]{0x0088000800280000L});
	public static final BitSet FOLLOW_expression_in_q1724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_q1736 = new BitSet(new long[]{0x0088000800280000L});
	public static final BitSet FOLLOW_expression_in_q1737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_k1778 = new BitSet(new long[]{0x000E100800080000L});
	public static final BitSet FOLLOW_statement_in_k1780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_y1801 = new BitSet(new long[]{0x0000020800000000L});
	public static final BitSet FOLLOW_cc_in_y1803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gotostatement_in_y1808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_y1812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forclause_in_j1833 = new BitSet(new long[]{0x000E100800080000L});
	public static final BitSet FOLLOW_statement_in_j1835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_j1839 = new BitSet(new long[]{0x0000030800000000L});
	public static final BitSet FOLLOW_u_in_j1841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gotostatement_in_j1848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_j1850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cc_in_u1867 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_k_in_u1869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_u1874 = new BitSet(new long[]{0x0004900000080000L,0x0000000000000002L});
	public static final BitSet FOLLOW_w_in_u1876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstatement_in_w1886 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_w1889 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_w1891 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000002L});
	public static final BitSet FOLLOW_forstatement_in_w1895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_y_in_w1901 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_k_in_w1903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_cc1936 = new BitSet(new long[]{0x0080000800280000L});
	public static final BitSet FOLLOW_simpleAR_in_cc1939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualparametrepart_in_cc1944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_actualparametrepart1957 = new BitSet(new long[]{0x0000001000080000L});
	public static final BitSet FOLLOW_actualparalist_in_actualparametrepart1959 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_actualparametrepart1960 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_STRING_in_actualparametrepart1962 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_actualparametrepart1964 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_actualparametrepart1966 = new BitSet(new long[]{0x0000001000080000L});
	public static final BitSet FOLLOW_actualparalist_in_actualparametrepart1967 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_actualparametrepart1968 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_actualpara_in_actualparalist1986 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_paralim_in_actualparalist1988 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_identifier_in_actualpara2010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_leftpart2025 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_leftpart2027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_gotostatement2041 = new BitSet(new long[]{0x0008000800080000L});
	public static final BitSet FOLLOW_designExp_in_gotostatement2043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_forstatement2058 = new BitSet(new long[]{0x0000000000000002L});
}
