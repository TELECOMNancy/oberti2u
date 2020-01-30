// $ANTLR 3.5.1 /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g 2019-11-19 12:53:58

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class AlgolParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESS", "AND", "ARRAYACCESS", 
		"ASSIGENMENT", "BEGIN", "BLOCK", "BORNE", "BORNESUPP", "CALL", "COMMENT2", 
		"DEC", "DIV", "ELSE", "EQUAL", "EQV", "ESC_SEQ", "EXPONENT", "FALSE", 
		"FLOAT", "FOR", "FORLISTELEMENT", "GOTO", "GREATER", "HEX_DIGIT", "ID", 
		"IF", "IMPL", "INT", "LABEL", "LESS", "LISTARG", "LISTFOR", "LISTPARA", 
		"LOCAL", "MULT", "NOT", "NOTEQUAL", "NOTGREATER", "NOTLESS", "OCTAL_ESC", 
		"OR", "PARENTHESEF", "PARENTHESEO", "PAS", "PLUS", "POWER", "PROCEDURE", 
		"PROG", "SPECIFICATION", "STRING", "SWITCH", "THEN", "TRUE", "TYPEBOOL", 
		"TYPEINT", "TYPEREAL", "UNICODE_ESC", "WHILE", "WS", "','", "'-'", "';'", 
		"'ARRAY'", "'DO'", "'END'", "'POW'", "'STRING'", "'VALUE'", "'['", "']'", 
		"'a'"
	};
	public static final int EOF=-1;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int ACCESS=4;
	public static final int AND=5;
	public static final int ARRAYACCESS=6;
	public static final int ASSIGENMENT=7;
	public static final int BEGIN=8;
	public static final int BLOCK=9;
	public static final int BORNE=10;
	public static final int BORNESUPP=11;
	public static final int CALL=12;
	public static final int COMMENT2=13;
	public static final int DEC=14;
	public static final int DIV=15;
	public static final int ELSE=16;
	public static final int EQUAL=17;
	public static final int EQV=18;
	public static final int ESC_SEQ=19;
	public static final int EXPONENT=20;
	public static final int FALSE=21;
	public static final int FLOAT=22;
	public static final int FOR=23;
	public static final int FORLISTELEMENT=24;
	public static final int GOTO=25;
	public static final int GREATER=26;
	public static final int HEX_DIGIT=27;
	public static final int ID=28;
	public static final int IF=29;
	public static final int IMPL=30;
	public static final int INT=31;
	public static final int LABEL=32;
	public static final int LESS=33;
	public static final int LISTARG=34;
	public static final int LISTFOR=35;
	public static final int LISTPARA=36;
	public static final int LOCAL=37;
	public static final int MULT=38;
	public static final int NOT=39;
	public static final int NOTEQUAL=40;
	public static final int NOTGREATER=41;
	public static final int NOTLESS=42;
	public static final int OCTAL_ESC=43;
	public static final int OR=44;
	public static final int PARENTHESEF=45;
	public static final int PARENTHESEO=46;
	public static final int PAS=47;
	public static final int PLUS=48;
	public static final int POWER=49;
	public static final int PROCEDURE=50;
	public static final int PROG=51;
	public static final int SPECIFICATION=52;
	public static final int STRING=53;
	public static final int SWITCH=54;
	public static final int THEN=55;
	public static final int TRUE=56;
	public static final int TYPEBOOL=57;
	public static final int TYPEINT=58;
	public static final int TYPEREAL=59;
	public static final int UNICODE_ESC=60;
	public static final int WHILE=61;
	public static final int WS=62;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "expression2", "begin", "prog1", "arraylist", "multExp33", 
		"label", "v", "gotostatement", "k", "switchlist", "h", "memoire", "forlistelement", 
		"j", "u", "declaration", "w", "formalparameterlist", "forlist", "switchdec", 
		"compoundT", "comment", "designExp", "identifier2", "actualpara", "multExp22", 
		"typeliste", "o", "valuepart", "c", "simpleAR", "formalparameterpart", 
		"boundplist", "simpleDesign", "prog", "specifier", "d", "ei", "identifierlist", 
		"actualparametrepart2", "beginwithID", "u1", "identifier", "powExp", "simpleARi2", 
		"r2", "multExp", "localorown", "label2", "simpleLOgi22", "simpleARi", 
		"boundp", "q", "formalpara", "typedeclaration", "y", "typedeclaration2", 
		"multExp2", "arrayseg", "procedurehead", "simpleAR2", "rs", "actualparametrepart", 
		"forstatement", "m", "procedure", "actualparalist", "statement", "simpleLOG", 
		"powExp2", "specificationpart", "type", "simpleLOgi2", "infixLog", "simpleLOgi", 
		"r", "expression"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public AlgolParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public AlgolParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public AlgolParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return AlgolParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g"; }


	 CommonTree Idmemoire;


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:74:1: prog : prog1 -> ^( PROG prog1 ) ;
	public final AlgolParser.prog_return prog() throws RecognitionException {
		AlgolParser.prog_return retval = new AlgolParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope prog11 =null;

		RewriteRuleSubtreeStream stream_prog1=new RewriteRuleSubtreeStream(adaptor,"rule prog1");

		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:74:6: ( prog1 -> ^( PROG prog1 ) )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:74:8: prog1
			{
			dbg.location(74,8);
			pushFollow(FOLLOW_prog1_in_prog288);
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
			// 74:14: -> ^( PROG prog1 )
			{
				dbg.location(74,16);
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:74:16: ^( PROG prog1 )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(74,18);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROG, "PROG"), root_1);
				dbg.location(74,23);
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
		dbg.location(75, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:78:1: expression : ( simpleAR -> simpleAR | 'IF' expression 'THEN' simpleDesign 'ELSE' expression -> ^( 'IF' expression ^( 'THEN' simpleDesign ^( 'ELSE' expression ) ) ) );
	public final AlgolParser.expression_return expression() throws RecognitionException {
		AlgolParser.expression_return retval = new AlgolParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal3=null;
		Token string_literal5=null;
		Token string_literal7=null;
		ParserRuleReturnScope simpleAR2 =null;
		ParserRuleReturnScope expression4 =null;
		ParserRuleReturnScope simpleDesign6 =null;
		ParserRuleReturnScope expression8 =null;

		CommonTree string_literal3_tree=null;
		CommonTree string_literal5_tree=null;
		CommonTree string_literal7_tree=null;
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_simpleAR=new RewriteRuleSubtreeStream(adaptor,"rule simpleAR");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_simpleDesign=new RewriteRuleSubtreeStream(adaptor,"rule simpleDesign");

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(78, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:79:2: ( simpleAR -> simpleAR | 'IF' expression 'THEN' simpleDesign 'ELSE' expression -> ^( 'IF' expression ^( 'THEN' simpleDesign ^( 'ELSE' expression ) ) ) )
			int alt1=2;
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==EOF||LA1_0==AND||LA1_0==ASSIGENMENT||(LA1_0 >= BORNE && LA1_0 <= BORNESUPP)||(LA1_0 >= DIV && LA1_0 <= EQV)||(LA1_0 >= FALSE && LA1_0 <= FLOAT)||LA1_0==GREATER||LA1_0==ID||(LA1_0 >= IMPL && LA1_0 <= INT)||LA1_0==LESS||(LA1_0 >= MULT && LA1_0 <= NOTLESS)||(LA1_0 >= OR && LA1_0 <= PLUS)||LA1_0==STRING||(LA1_0 >= THEN && LA1_0 <= TRUE)||LA1_0==WHILE||(LA1_0 >= 63 && LA1_0 <= 65)||(LA1_0 >= 67 && LA1_0 <= 69)||LA1_0==73) ) {
				alt1=1;
			}
			else if ( (LA1_0==IF) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:79:4: simpleAR
					{
					dbg.location(79,4);
					pushFollow(FOLLOW_simpleAR_in_expression309);
					simpleAR2=simpleAR();
					state._fsp--;

					stream_simpleAR.add(simpleAR2.getTree());
					// AST REWRITE
					// elements: simpleAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 79:13: -> simpleAR
					{
						dbg.location(79,15);
						adaptor.addChild(root_0, stream_simpleAR.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:80:5: 'IF' expression 'THEN' simpleDesign 'ELSE' expression
					{
					dbg.location(80,5);
					string_literal3=(Token)match(input,IF,FOLLOW_IF_in_expression318);  
					stream_IF.add(string_literal3);
					dbg.location(80,10);
					pushFollow(FOLLOW_expression_in_expression320);
					expression4=expression();
					state._fsp--;

					stream_expression.add(expression4.getTree());dbg.location(80,21);
					string_literal5=(Token)match(input,THEN,FOLLOW_THEN_in_expression322);  
					stream_THEN.add(string_literal5);
					dbg.location(80,28);
					pushFollow(FOLLOW_simpleDesign_in_expression324);
					simpleDesign6=simpleDesign();
					state._fsp--;

					stream_simpleDesign.add(simpleDesign6.getTree());dbg.location(80,41);
					string_literal7=(Token)match(input,ELSE,FOLLOW_ELSE_in_expression326);  
					stream_ELSE.add(string_literal7);
					dbg.location(80,48);
					pushFollow(FOLLOW_expression_in_expression328);
					expression8=expression();
					state._fsp--;

					stream_expression.add(expression8.getTree());
					// AST REWRITE
					// elements: expression, ELSE, IF, THEN, simpleDesign, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 80:58: -> ^( 'IF' expression ^( 'THEN' simpleDesign ^( 'ELSE' expression ) ) )
					{
						dbg.location(80,60);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:80:60: ^( 'IF' expression ^( 'THEN' simpleDesign ^( 'ELSE' expression ) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(80,62);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
						dbg.location(80,67);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(80,78);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:80:78: ^( 'THEN' simpleDesign ^( 'ELSE' expression ) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(80,80);
						root_2 = (CommonTree)adaptor.becomeRoot(stream_THEN.nextNode(), root_2);
						dbg.location(80,87);
						adaptor.addChild(root_2, stream_simpleDesign.nextTree());dbg.location(80,100);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:80:100: ^( 'ELSE' expression )
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						dbg.location(80,102);
						root_3 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_3);
						dbg.location(80,109);
						adaptor.addChild(root_3, stream_expression.nextTree());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

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
		dbg.location(81, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:83:1: ei : simpleDesign 'ELSE' ;
	public final AlgolParser.ei_return ei() throws RecognitionException {
		AlgolParser.ei_return retval = new AlgolParser.ei_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal10=null;
		ParserRuleReturnScope simpleDesign9 =null;

		CommonTree string_literal10_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "ei");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(83, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:83:4: ( simpleDesign 'ELSE' )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:83:6: simpleDesign 'ELSE'
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(83,6);
			pushFollow(FOLLOW_simpleDesign_in_ei357);
			simpleDesign9=simpleDesign();
			state._fsp--;

			adaptor.addChild(root_0, simpleDesign9.getTree());
			dbg.location(83,19);
			string_literal10=(Token)match(input,ELSE,FOLLOW_ELSE_in_ei359); 
			string_literal10_tree = (CommonTree)adaptor.create(string_literal10);
			adaptor.addChild(root_0, string_literal10_tree);

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
		dbg.location(85, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ei");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:88:1: simpleAR : simpleLOG ( ':=' ^ simpleLOgi2 )* ;
	public final AlgolParser.simpleAR_return simpleAR() throws RecognitionException {
		AlgolParser.simpleAR_return retval = new AlgolParser.simpleAR_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal12=null;
		ParserRuleReturnScope simpleLOG11 =null;
		ParserRuleReturnScope simpleLOgi213 =null;

		CommonTree string_literal12_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "simpleAR");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(88, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:88:9: ( simpleLOG ( ':=' ^ simpleLOgi2 )* )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:88:11: simpleLOG ( ':=' ^ simpleLOgi2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(88,11);
			pushFollow(FOLLOW_simpleLOG_in_simpleAR372);
			simpleLOG11=simpleLOG();
			state._fsp--;

			adaptor.addChild(root_0, simpleLOG11.getTree());
			dbg.location(88,20);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:88:20: ( ':=' ^ simpleLOgi2 )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==ASSIGENMENT) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:88:21: ':=' ^ simpleLOgi2
					{
					dbg.location(88,25);
					string_literal12=(Token)match(input,ASSIGENMENT,FOLLOW_ASSIGENMENT_in_simpleAR374); 
					string_literal12_tree = (CommonTree)adaptor.create(string_literal12);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal12_tree, root_0);
					dbg.location(88,27);
					pushFollow(FOLLOW_simpleLOgi2_in_simpleAR377);
					simpleLOgi213=simpleLOgi2();
					state._fsp--;

					adaptor.addChild(root_0, simpleLOgi213.getTree());

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}

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
		dbg.location(89, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "simpleAR");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "simpleAR"


	public static class simpleLOG_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleLOG"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:91:1: simpleLOG : simpleLOgi22 ( 'EQUIV' ^ simpleLOgi22 )* ;
	public final AlgolParser.simpleLOG_return simpleLOG() throws RecognitionException {
		AlgolParser.simpleLOG_return retval = new AlgolParser.simpleLOG_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal15=null;
		ParserRuleReturnScope simpleLOgi2214 =null;
		ParserRuleReturnScope simpleLOgi2216 =null;

		CommonTree string_literal15_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "simpleLOG");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(91, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:92:2: ( simpleLOgi22 ( 'EQUIV' ^ simpleLOgi22 )* )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:92:4: simpleLOgi22 ( 'EQUIV' ^ simpleLOgi22 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(92,4);
			pushFollow(FOLLOW_simpleLOgi22_in_simpleLOG391);
			simpleLOgi2214=simpleLOgi22();
			state._fsp--;

			adaptor.addChild(root_0, simpleLOgi2214.getTree());
			dbg.location(92,16);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:92:16: ( 'EQUIV' ^ simpleLOgi22 )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==EQV) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:92:17: 'EQUIV' ^ simpleLOgi22
					{
					dbg.location(92,24);
					string_literal15=(Token)match(input,EQV,FOLLOW_EQV_in_simpleLOG393); 
					string_literal15_tree = (CommonTree)adaptor.create(string_literal15);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal15_tree, root_0);
					dbg.location(92,26);
					pushFollow(FOLLOW_simpleLOgi22_in_simpleLOG396);
					simpleLOgi2216=simpleLOgi22();
					state._fsp--;

					adaptor.addChild(root_0, simpleLOgi2216.getTree());

					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}

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
		dbg.location(93, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "simpleLOG");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "simpleLOG"


	public static class simpleLOgi22_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleLOgi22"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:95:1: simpleLOgi22 : simpleLOgi2 ( 'IMPL' ^ simpleLOgi2 )* ;
	public final AlgolParser.simpleLOgi22_return simpleLOgi22() throws RecognitionException {
		AlgolParser.simpleLOgi22_return retval = new AlgolParser.simpleLOgi22_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal18=null;
		ParserRuleReturnScope simpleLOgi217 =null;
		ParserRuleReturnScope simpleLOgi219 =null;

		CommonTree string_literal18_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "simpleLOgi22");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(95, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:96:2: ( simpleLOgi2 ( 'IMPL' ^ simpleLOgi2 )* )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:96:4: simpleLOgi2 ( 'IMPL' ^ simpleLOgi2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(96,4);
			pushFollow(FOLLOW_simpleLOgi2_in_simpleLOgi22410);
			simpleLOgi217=simpleLOgi2();
			state._fsp--;

			adaptor.addChild(root_0, simpleLOgi217.getTree());
			dbg.location(96,15);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:96:15: ( 'IMPL' ^ simpleLOgi2 )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==IMPL) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:96:16: 'IMPL' ^ simpleLOgi2
					{
					dbg.location(96,22);
					string_literal18=(Token)match(input,IMPL,FOLLOW_IMPL_in_simpleLOgi22412); 
					string_literal18_tree = (CommonTree)adaptor.create(string_literal18);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal18_tree, root_0);
					dbg.location(96,24);
					pushFollow(FOLLOW_simpleLOgi2_in_simpleLOgi22415);
					simpleLOgi219=simpleLOgi2();
					state._fsp--;

					adaptor.addChild(root_0, simpleLOgi219.getTree());

					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}

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
		dbg.location(97, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "simpleLOgi22");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "simpleLOgi22"


	public static class simpleLOgi2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleLOgi2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:99:1: simpleLOgi2 : simpleLOgi ( ( 'AND' ^| 'OR' ^| 'NOT' ^) simpleLOgi )* ;
	public final AlgolParser.simpleLOgi2_return simpleLOgi2() throws RecognitionException {
		AlgolParser.simpleLOgi2_return retval = new AlgolParser.simpleLOgi2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal21=null;
		Token string_literal22=null;
		Token string_literal23=null;
		ParserRuleReturnScope simpleLOgi20 =null;
		ParserRuleReturnScope simpleLOgi24 =null;

		CommonTree string_literal21_tree=null;
		CommonTree string_literal22_tree=null;
		CommonTree string_literal23_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "simpleLOgi2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(99, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:100:2: ( simpleLOgi ( ( 'AND' ^| 'OR' ^| 'NOT' ^) simpleLOgi )* )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:100:4: simpleLOgi ( ( 'AND' ^| 'OR' ^| 'NOT' ^) simpleLOgi )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(100,4);
			pushFollow(FOLLOW_simpleLOgi_in_simpleLOgi2429);
			simpleLOgi20=simpleLOgi();
			state._fsp--;

			adaptor.addChild(root_0, simpleLOgi20.getTree());
			dbg.location(100,14);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:100:14: ( ( 'AND' ^| 'OR' ^| 'NOT' ^) simpleLOgi )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==AND||LA6_0==NOT||LA6_0==OR) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:100:15: ( 'AND' ^| 'OR' ^| 'NOT' ^) simpleLOgi
					{
					dbg.location(100,15);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:100:15: ( 'AND' ^| 'OR' ^| 'NOT' ^)
					int alt5=3;
					try { dbg.enterSubRule(5);
					try { dbg.enterDecision(5, decisionCanBacktrack[5]);

					switch ( input.LA(1) ) {
					case AND:
						{
						alt5=1;
						}
						break;
					case OR:
						{
						alt5=2;
						}
						break;
					case NOT:
						{
						alt5=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(5);}

					switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:100:16: 'AND' ^
							{
							dbg.location(100,21);
							string_literal21=(Token)match(input,AND,FOLLOW_AND_in_simpleLOgi2432); 
							string_literal21_tree = (CommonTree)adaptor.create(string_literal21);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal21_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:100:23: 'OR' ^
							{
							dbg.location(100,27);
							string_literal22=(Token)match(input,OR,FOLLOW_OR_in_simpleLOgi2435); 
							string_literal22_tree = (CommonTree)adaptor.create(string_literal22);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal22_tree, root_0);

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:100:29: 'NOT' ^
							{
							dbg.location(100,34);
							string_literal23=(Token)match(input,NOT,FOLLOW_NOT_in_simpleLOgi2438); 
							string_literal23_tree = (CommonTree)adaptor.create(string_literal23);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal23_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(5);}
					dbg.location(100,36);
					pushFollow(FOLLOW_simpleLOgi_in_simpleLOgi2441);
					simpleLOgi24=simpleLOgi();
					state._fsp--;

					adaptor.addChild(root_0, simpleLOgi24.getTree());

					}
					break;

				default :
					break loop6;
				}
			}
			} finally {dbg.exitSubRule(6);}

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
		dbg.location(101, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "simpleLOgi2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "simpleLOgi2"


	public static class simpleLOgi_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleLOgi"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:103:1: simpleLOgi : simpleARi ( ( 'GREATER' ^| 'LESS' ^| 'EQUAL' ^| 'NOTLESS' ^| 'NOTGREATER' ^| 'NOTEQUAL' ^) simpleARi )* ;
	public final AlgolParser.simpleLOgi_return simpleLOgi() throws RecognitionException {
		AlgolParser.simpleLOgi_return retval = new AlgolParser.simpleLOgi_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal26=null;
		Token string_literal27=null;
		Token string_literal28=null;
		Token string_literal29=null;
		Token string_literal30=null;
		Token string_literal31=null;
		ParserRuleReturnScope simpleARi25 =null;
		ParserRuleReturnScope simpleARi32 =null;

		CommonTree string_literal26_tree=null;
		CommonTree string_literal27_tree=null;
		CommonTree string_literal28_tree=null;
		CommonTree string_literal29_tree=null;
		CommonTree string_literal30_tree=null;
		CommonTree string_literal31_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "simpleLOgi");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(103, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:104:2: ( simpleARi ( ( 'GREATER' ^| 'LESS' ^| 'EQUAL' ^| 'NOTLESS' ^| 'NOTGREATER' ^| 'NOTEQUAL' ^) simpleARi )* )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:104:4: simpleARi ( ( 'GREATER' ^| 'LESS' ^| 'EQUAL' ^| 'NOTLESS' ^| 'NOTGREATER' ^| 'NOTEQUAL' ^) simpleARi )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(104,4);
			pushFollow(FOLLOW_simpleARi_in_simpleLOgi455);
			simpleARi25=simpleARi();
			state._fsp--;

			adaptor.addChild(root_0, simpleARi25.getTree());
			dbg.location(104,13);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:104:13: ( ( 'GREATER' ^| 'LESS' ^| 'EQUAL' ^| 'NOTLESS' ^| 'NOTGREATER' ^| 'NOTEQUAL' ^) simpleARi )*
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=2;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				int LA8_0 = input.LA(1);
				if ( (LA8_0==EQUAL||LA8_0==GREATER||LA8_0==LESS||(LA8_0 >= NOTEQUAL && LA8_0 <= NOTLESS)) ) {
					alt8=1;
				}

				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:104:14: ( 'GREATER' ^| 'LESS' ^| 'EQUAL' ^| 'NOTLESS' ^| 'NOTGREATER' ^| 'NOTEQUAL' ^) simpleARi
					{
					dbg.location(104,14);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:104:14: ( 'GREATER' ^| 'LESS' ^| 'EQUAL' ^| 'NOTLESS' ^| 'NOTGREATER' ^| 'NOTEQUAL' ^)
					int alt7=6;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					switch ( input.LA(1) ) {
					case GREATER:
						{
						alt7=1;
						}
						break;
					case LESS:
						{
						alt7=2;
						}
						break;
					case EQUAL:
						{
						alt7=3;
						}
						break;
					case NOTLESS:
						{
						alt7=4;
						}
						break;
					case NOTGREATER:
						{
						alt7=5;
						}
						break;
					case NOTEQUAL:
						{
						alt7=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(7);}

					switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:104:15: 'GREATER' ^
							{
							dbg.location(104,25);
							string_literal26=(Token)match(input,GREATER,FOLLOW_GREATER_in_simpleLOgi458); 
							string_literal26_tree = (CommonTree)adaptor.create(string_literal26);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal26_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:104:27: 'LESS' ^
							{
							dbg.location(104,33);
							string_literal27=(Token)match(input,LESS,FOLLOW_LESS_in_simpleLOgi461); 
							string_literal27_tree = (CommonTree)adaptor.create(string_literal27);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal27_tree, root_0);

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:104:35: 'EQUAL' ^
							{
							dbg.location(104,42);
							string_literal28=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_simpleLOgi464); 
							string_literal28_tree = (CommonTree)adaptor.create(string_literal28);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal28_tree, root_0);

							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:104:44: 'NOTLESS' ^
							{
							dbg.location(104,53);
							string_literal29=(Token)match(input,NOTLESS,FOLLOW_NOTLESS_in_simpleLOgi467); 
							string_literal29_tree = (CommonTree)adaptor.create(string_literal29);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal29_tree, root_0);

							}
							break;
						case 5 :
							dbg.enterAlt(5);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:104:55: 'NOTGREATER' ^
							{
							dbg.location(104,67);
							string_literal30=(Token)match(input,NOTGREATER,FOLLOW_NOTGREATER_in_simpleLOgi470); 
							string_literal30_tree = (CommonTree)adaptor.create(string_literal30);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal30_tree, root_0);

							}
							break;
						case 6 :
							dbg.enterAlt(6);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:104:69: 'NOTEQUAL' ^
							{
							dbg.location(104,79);
							string_literal31=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_simpleLOgi473); 
							string_literal31_tree = (CommonTree)adaptor.create(string_literal31);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal31_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(7);}
					dbg.location(104,81);
					pushFollow(FOLLOW_simpleARi_in_simpleLOgi476);
					simpleARi32=simpleARi();
					state._fsp--;

					adaptor.addChild(root_0, simpleARi32.getTree());

					}
					break;

				default :
					break loop8;
				}
			}
			} finally {dbg.exitSubRule(8);}

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
		dbg.location(105, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "simpleLOgi");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "simpleLOgi"


	public static class simpleARi_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleARi"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:107:1: simpleARi : multExp ( ( '+' ^| '-' ^) multExp )* ;
	public final AlgolParser.simpleARi_return simpleARi() throws RecognitionException {
		AlgolParser.simpleARi_return retval = new AlgolParser.simpleARi_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal34=null;
		Token char_literal35=null;
		ParserRuleReturnScope multExp33 =null;
		ParserRuleReturnScope multExp36 =null;

		CommonTree char_literal34_tree=null;
		CommonTree char_literal35_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "simpleARi");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(107, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:107:10: ( multExp ( ( '+' ^| '-' ^) multExp )* )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:107:12: multExp ( ( '+' ^| '-' ^) multExp )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(107,12);
			pushFollow(FOLLOW_multExp_in_simpleARi488);
			multExp33=multExp();
			state._fsp--;

			adaptor.addChild(root_0, multExp33.getTree());
			dbg.location(107,19);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:107:19: ( ( '+' ^| '-' ^) multExp )*
			try { dbg.enterSubRule(10);

			loop10:
			while (true) {
				int alt10=2;
				try { dbg.enterDecision(10, decisionCanBacktrack[10]);

				int LA10_0 = input.LA(1);
				if ( (LA10_0==PLUS||LA10_0==64) ) {
					alt10=1;
				}

				} finally {dbg.exitDecision(10);}

				switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:107:20: ( '+' ^| '-' ^) multExp
					{
					dbg.location(107,20);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:107:20: ( '+' ^| '-' ^)
					int alt9=2;
					try { dbg.enterSubRule(9);
					try { dbg.enterDecision(9, decisionCanBacktrack[9]);

					int LA9_0 = input.LA(1);
					if ( (LA9_0==PLUS) ) {
						alt9=1;
					}
					else if ( (LA9_0==64) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(9);}

					switch (alt9) {
						case 1 :
							dbg.enterAlt(1);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:107:21: '+' ^
							{
							dbg.location(107,24);
							char_literal34=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleARi491); 
							char_literal34_tree = (CommonTree)adaptor.create(char_literal34);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal34_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:107:26: '-' ^
							{
							dbg.location(107,29);
							char_literal35=(Token)match(input,64,FOLLOW_64_in_simpleARi494); 
							char_literal35_tree = (CommonTree)adaptor.create(char_literal35);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal35_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(9);}
					dbg.location(107,32);
					pushFollow(FOLLOW_multExp_in_simpleARi498);
					multExp36=multExp();
					state._fsp--;

					adaptor.addChild(root_0, multExp36.getTree());

					}
					break;

				default :
					break loop10;
				}
			}
			} finally {dbg.exitSubRule(10);}

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
		dbg.location(108, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "simpleARi");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:110:1: multExp : multExp22 ( ( '*' ^| '/' ^) multExp22 )* ;
	public final AlgolParser.multExp_return multExp() throws RecognitionException {
		AlgolParser.multExp_return retval = new AlgolParser.multExp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal38=null;
		Token char_literal39=null;
		ParserRuleReturnScope multExp2237 =null;
		ParserRuleReturnScope multExp2240 =null;

		CommonTree char_literal38_tree=null;
		CommonTree char_literal39_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "multExp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(110, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:110:8: ( multExp22 ( ( '*' ^| '/' ^) multExp22 )* )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:110:10: multExp22 ( ( '*' ^| '/' ^) multExp22 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(110,10);
			pushFollow(FOLLOW_multExp22_in_multExp509);
			multExp2237=multExp22();
			state._fsp--;

			adaptor.addChild(root_0, multExp2237.getTree());
			dbg.location(110,19);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:110:19: ( ( '*' ^| '/' ^) multExp22 )*
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=2;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==DIV||LA12_0==MULT) ) {
					alt12=1;
				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:110:20: ( '*' ^| '/' ^) multExp22
					{
					dbg.location(110,20);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:110:20: ( '*' ^| '/' ^)
					int alt11=2;
					try { dbg.enterSubRule(11);
					try { dbg.enterDecision(11, decisionCanBacktrack[11]);

					int LA11_0 = input.LA(1);
					if ( (LA11_0==MULT) ) {
						alt11=1;
					}
					else if ( (LA11_0==DIV) ) {
						alt11=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(11);}

					switch (alt11) {
						case 1 :
							dbg.enterAlt(1);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:110:21: '*' ^
							{
							dbg.location(110,24);
							char_literal38=(Token)match(input,MULT,FOLLOW_MULT_in_multExp512); 
							char_literal38_tree = (CommonTree)adaptor.create(char_literal38);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal38_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:110:26: '/' ^
							{
							dbg.location(110,29);
							char_literal39=(Token)match(input,DIV,FOLLOW_DIV_in_multExp515); 
							char_literal39_tree = (CommonTree)adaptor.create(char_literal39);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal39_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(11);}
					dbg.location(110,31);
					pushFollow(FOLLOW_multExp22_in_multExp518);
					multExp2240=multExp22();
					state._fsp--;

					adaptor.addChild(root_0, multExp2240.getTree());

					}
					break;

				default :
					break loop12;
				}
			}
			} finally {dbg.exitSubRule(12);}

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
		dbg.location(111, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multExp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "multExp"


	public static class multExp22_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multExp22"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:115:1: multExp22 : powExp ( 'POW' ^ powExp )* ;
	public final AlgolParser.multExp22_return multExp22() throws RecognitionException {
		AlgolParser.multExp22_return retval = new AlgolParser.multExp22_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal42=null;
		ParserRuleReturnScope powExp41 =null;
		ParserRuleReturnScope powExp43 =null;

		CommonTree string_literal42_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "multExp22");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(115, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:115:11: ( powExp ( 'POW' ^ powExp )* )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:115:13: powExp ( 'POW' ^ powExp )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(115,13);
			pushFollow(FOLLOW_powExp_in_multExp22534);
			powExp41=powExp();
			state._fsp--;

			adaptor.addChild(root_0, powExp41.getTree());
			dbg.location(115,19);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:115:19: ( 'POW' ^ powExp )*
			try { dbg.enterSubRule(13);

			loop13:
			while (true) {
				int alt13=2;
				try { dbg.enterDecision(13, decisionCanBacktrack[13]);

				int LA13_0 = input.LA(1);
				if ( (LA13_0==69) ) {
					alt13=1;
				}

				} finally {dbg.exitDecision(13);}

				switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:115:20: 'POW' ^ powExp
					{
					dbg.location(115,25);
					string_literal42=(Token)match(input,69,FOLLOW_69_in_multExp22536); 
					string_literal42_tree = (CommonTree)adaptor.create(string_literal42);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal42_tree, root_0);
					dbg.location(115,27);
					pushFollow(FOLLOW_powExp_in_multExp22539);
					powExp43=powExp();
					state._fsp--;

					adaptor.addChild(root_0, powExp43.getTree());

					}
					break;

				default :
					break loop13;
				}
			}
			} finally {dbg.exitSubRule(13);}

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
		dbg.location(116, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multExp22");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "multExp22"


	public static class powExp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "powExp"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:118:1: powExp : (| '(' expression ')' -> expression | INT | STRING | 'FALSE' | 'TRUE' | FLOAT | ID ( -> ID ) beginwithID -> beginwithID );
	public final AlgolParser.powExp_return powExp() throws RecognitionException {
		AlgolParser.powExp_return retval = new AlgolParser.powExp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal44=null;
		Token char_literal46=null;
		Token INT47=null;
		Token STRING48=null;
		Token string_literal49=null;
		Token string_literal50=null;
		Token FLOAT51=null;
		Token ID52=null;
		ParserRuleReturnScope expression45 =null;
		ParserRuleReturnScope beginwithID53 =null;

		CommonTree char_literal44_tree=null;
		CommonTree char_literal46_tree=null;
		CommonTree INT47_tree=null;
		CommonTree STRING48_tree=null;
		CommonTree string_literal49_tree=null;
		CommonTree string_literal50_tree=null;
		CommonTree FLOAT51_tree=null;
		CommonTree ID52_tree=null;
		RewriteRuleTokenStream stream_PARENTHESEF=new RewriteRuleTokenStream(adaptor,"token PARENTHESEF");
		RewriteRuleTokenStream stream_PARENTHESEO=new RewriteRuleTokenStream(adaptor,"token PARENTHESEO");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_beginwithID=new RewriteRuleSubtreeStream(adaptor,"rule beginwithID");

		try { dbg.enterRule(getGrammarFileName(), "powExp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(118, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:118:8: (| '(' expression ')' -> expression | INT | STRING | 'FALSE' | 'TRUE' | FLOAT | ID ( -> ID ) beginwithID -> beginwithID )
			int alt14=8;
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			switch ( input.LA(1) ) {
			case EOF:
			case AND:
			case ASSIGENMENT:
			case BORNE:
			case BORNESUPP:
			case DIV:
			case ELSE:
			case EQUAL:
			case EQV:
			case GREATER:
			case IMPL:
			case LESS:
			case MULT:
			case NOT:
			case NOTEQUAL:
			case NOTGREATER:
			case NOTLESS:
			case OR:
			case PARENTHESEF:
			case PAS:
			case PLUS:
			case THEN:
			case WHILE:
			case 63:
			case 64:
			case 65:
			case 67:
			case 68:
			case 69:
			case 73:
				{
				alt14=1;
				}
				break;
			case PARENTHESEO:
				{
				alt14=2;
				}
				break;
			case INT:
				{
				alt14=3;
				}
				break;
			case STRING:
				{
				alt14=4;
				}
				break;
			case FALSE:
				{
				alt14=5;
				}
				break;
			case TRUE:
				{
				alt14=6;
				}
				break;
			case FLOAT:
				{
				alt14=7;
				}
				break;
			case ID:
				{
				alt14=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:119:10: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:119:11: '(' expression ')'
					{
					dbg.location(119,11);
					char_literal44=(Token)match(input,PARENTHESEO,FOLLOW_PARENTHESEO_in_powExp563);  
					stream_PARENTHESEO.add(char_literal44);
					dbg.location(119,15);
					pushFollow(FOLLOW_expression_in_powExp565);
					expression45=expression();
					state._fsp--;

					stream_expression.add(expression45.getTree());dbg.location(119,26);
					char_literal46=(Token)match(input,PARENTHESEF,FOLLOW_PARENTHESEF_in_powExp567);  
					stream_PARENTHESEF.add(char_literal46);

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
					// 119:29: -> expression
					{
						dbg.location(119,31);
						adaptor.addChild(root_0, stream_expression.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:120:11: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(120,11);
					INT47=(Token)match(input,INT,FOLLOW_INT_in_powExp581); 
					INT47_tree = (CommonTree)adaptor.create(INT47);
					adaptor.addChild(root_0, INT47_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:121:11: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(121,11);
					STRING48=(Token)match(input,STRING,FOLLOW_STRING_in_powExp593); 
					STRING48_tree = (CommonTree)adaptor.create(STRING48);
					adaptor.addChild(root_0, STRING48_tree);

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:122:11: 'FALSE'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(122,11);
					string_literal49=(Token)match(input,FALSE,FOLLOW_FALSE_in_powExp605); 
					string_literal49_tree = (CommonTree)adaptor.create(string_literal49);
					adaptor.addChild(root_0, string_literal49_tree);

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:123:11: 'TRUE'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(123,11);
					string_literal50=(Token)match(input,TRUE,FOLLOW_TRUE_in_powExp617); 
					string_literal50_tree = (CommonTree)adaptor.create(string_literal50);
					adaptor.addChild(root_0, string_literal50_tree);

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:124:12: FLOAT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(124,12);
					FLOAT51=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_powExp630); 
					FLOAT51_tree = (CommonTree)adaptor.create(FLOAT51);
					adaptor.addChild(root_0, FLOAT51_tree);

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:125:11: ID ( -> ID ) beginwithID
					{
					dbg.location(125,11);
					ID52=(Token)match(input,ID,FOLLOW_ID_in_powExp642);  
					stream_ID.add(ID52);
					dbg.location(125,14);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:125:14: ( -> ID )
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:125:15: 
					{
					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 125:15: -> ID
					{
						dbg.location(125,17);
						adaptor.addChild(root_0, stream_ID.nextNode());
					}


					retval.tree = root_0;

					}
					dbg.location(125,21);
					Idmemoire=retval.tree;dbg.location(125,47);
					pushFollow(FOLLOW_beginwithID_in_powExp651);
					beginwithID53=beginwithID();
					state._fsp--;

					stream_beginwithID.add(beginwithID53.getTree());
					// AST REWRITE
					// elements: beginwithID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 125:58: -> beginwithID
					{
						dbg.location(125,60);
						adaptor.addChild(root_0, stream_beginwithID.nextTree());
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
		dbg.location(126, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "powExp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "powExp"


	public static class beginwithID_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "beginwithID"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:129:1: beginwithID : ( ( ->) actualparametrepart -> actualparametrepart | ( ->) | ( ->) '[' expression ( ',' expression ( ')' )? )* ']' -> ^( ARRAYACCESS $beginwithID ( expression )+ ) );
	public final AlgolParser.beginwithID_return beginwithID() throws RecognitionException {
		AlgolParser.beginwithID_return retval = new AlgolParser.beginwithID_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal55=null;
		Token char_literal57=null;
		Token char_literal59=null;
		Token char_literal60=null;
		ParserRuleReturnScope actualparametrepart54 =null;
		ParserRuleReturnScope expression56 =null;
		ParserRuleReturnScope expression58 =null;

		CommonTree char_literal55_tree=null;
		CommonTree char_literal57_tree=null;
		CommonTree char_literal59_tree=null;
		CommonTree char_literal60_tree=null;
		RewriteRuleTokenStream stream_PARENTHESEF=new RewriteRuleTokenStream(adaptor,"token PARENTHESEF");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_actualparametrepart=new RewriteRuleSubtreeStream(adaptor,"rule actualparametrepart");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try { dbg.enterRule(getGrammarFileName(), "beginwithID");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(129, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:130:2: ( ( ->) actualparametrepart -> actualparametrepart | ( ->) | ( ->) '[' expression ( ',' expression ( ')' )? )* ']' -> ^( ARRAYACCESS $beginwithID ( expression )+ ) )
			int alt17=3;
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			switch ( input.LA(1) ) {
			case PARENTHESEO:
				{
				alt17=1;
				}
				break;
			case EOF:
			case AND:
			case ASSIGENMENT:
			case BORNE:
			case BORNESUPP:
			case DIV:
			case ELSE:
			case EQUAL:
			case EQV:
			case GREATER:
			case IMPL:
			case LESS:
			case MULT:
			case NOT:
			case NOTEQUAL:
			case NOTGREATER:
			case NOTLESS:
			case OR:
			case PARENTHESEF:
			case PAS:
			case PLUS:
			case POWER:
			case THEN:
			case WHILE:
			case 63:
			case 64:
			case 65:
			case 67:
			case 68:
			case 69:
			case 73:
				{
				alt17=2;
				}
				break;
			case 72:
				{
				alt17=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:130:4: ( ->) actualparametrepart
					{
					dbg.location(130,4);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:130:4: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:130:5: 
					{
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
					// 130:5: ->
					{
						dbg.location(130,7);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(130,20);
					pushFollow(FOLLOW_actualparametrepart_in_beginwithID672);
					actualparametrepart54=actualparametrepart();
					state._fsp--;

					stream_actualparametrepart.add(actualparametrepart54.getTree());
					// AST REWRITE
					// elements: actualparametrepart
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 130:39: -> actualparametrepart
					{
						dbg.location(130,41);
						adaptor.addChild(root_0, stream_actualparametrepart.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:131:3: ( ->)
					{
					dbg.location(131,3);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:131:3: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:131:4: 
					{
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
					// 131:4: ->
					{
						dbg.location(131,6);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:132:3: ( ->) '[' expression ( ',' expression ( ')' )? )* ']'
					{
					dbg.location(132,3);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:132:3: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:132:4: 
					{
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
					// 132:4: ->
					{
						dbg.location(132,6);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(132,18);
					char_literal55=(Token)match(input,72,FOLLOW_72_in_beginwithID689);  
					stream_72.add(char_literal55);
					dbg.location(132,21);
					pushFollow(FOLLOW_expression_in_beginwithID690);
					expression56=expression();
					state._fsp--;

					stream_expression.add(expression56.getTree());dbg.location(132,32);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:132:32: ( ',' expression ( ')' )? )*
					try { dbg.enterSubRule(16);

					loop16:
					while (true) {
						int alt16=2;
						try { dbg.enterDecision(16, decisionCanBacktrack[16]);

						int LA16_0 = input.LA(1);
						if ( (LA16_0==63) ) {
							alt16=1;
						}

						} finally {dbg.exitDecision(16);}

						switch (alt16) {
						case 1 :
							dbg.enterAlt(1);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:132:33: ',' expression ( ')' )?
							{
							dbg.location(132,33);
							char_literal57=(Token)match(input,63,FOLLOW_63_in_beginwithID693);  
							stream_63.add(char_literal57);
							dbg.location(132,37);
							pushFollow(FOLLOW_expression_in_beginwithID695);
							expression58=expression();
							state._fsp--;

							stream_expression.add(expression58.getTree());dbg.location(132,48);
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:132:48: ( ')' )?
							int alt15=2;
							try { dbg.enterSubRule(15);
							try { dbg.enterDecision(15, decisionCanBacktrack[15]);

							int LA15_0 = input.LA(1);
							if ( (LA15_0==PARENTHESEF) ) {
								alt15=1;
							}
							} finally {dbg.exitDecision(15);}

							switch (alt15) {
								case 1 :
									dbg.enterAlt(1);

									// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:132:48: ')'
									{
									dbg.location(132,48);
									char_literal59=(Token)match(input,PARENTHESEF,FOLLOW_PARENTHESEF_in_beginwithID697);  
									stream_PARENTHESEF.add(char_literal59);

									}
									break;

							}
							} finally {dbg.exitSubRule(15);}

							}
							break;

						default :
							break loop16;
						}
					}
					} finally {dbg.exitSubRule(16);}
					dbg.location(132,54);
					char_literal60=(Token)match(input,73,FOLLOW_73_in_beginwithID701);  
					stream_73.add(char_literal60);

					// AST REWRITE
					// elements: beginwithID, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 132:57: -> ^( ARRAYACCESS $beginwithID ( expression )+ )
					{
						dbg.location(132,59);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:132:59: ^( ARRAYACCESS $beginwithID ( expression )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(132,61);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAYACCESS, "ARRAYACCESS"), root_1);
						dbg.location(132,75);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(132,87);
						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							dbg.location(132,87);
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

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
		dbg.location(134, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "beginwithID");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "beginwithID"


	public static class expression2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:138:1: expression2 : ( simpleAR2 | 'IF' expression 'THEN' ei );
	public final AlgolParser.expression2_return expression2() throws RecognitionException {
		AlgolParser.expression2_return retval = new AlgolParser.expression2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal62=null;
		Token string_literal64=null;
		ParserRuleReturnScope simpleAR261 =null;
		ParserRuleReturnScope expression63 =null;
		ParserRuleReturnScope ei65 =null;

		CommonTree string_literal62_tree=null;
		CommonTree string_literal64_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expression2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(138, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:139:2: ( simpleAR2 | 'IF' expression 'THEN' ei )
			int alt18=2;
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==AND||LA18_0==ASSIGENMENT||LA18_0==DIV||LA18_0==ID||LA18_0==INT||LA18_0==MULT||(LA18_0 >= OR && LA18_0 <= PARENTHESEO)||(LA18_0 >= PLUS && LA18_0 <= POWER)||LA18_0==STRING||(LA18_0 >= 63 && LA18_0 <= 64)) ) {
				alt18=1;
			}
			else if ( (LA18_0==IF) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:139:4: simpleAR2
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(139,4);
					pushFollow(FOLLOW_simpleAR2_in_expression2739);
					simpleAR261=simpleAR2();
					state._fsp--;

					adaptor.addChild(root_0, simpleAR261.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:139:16: 'IF' expression 'THEN' ei
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(139,16);
					string_literal62=(Token)match(input,IF,FOLLOW_IF_in_expression2743); 
					string_literal62_tree = (CommonTree)adaptor.create(string_literal62);
					adaptor.addChild(root_0, string_literal62_tree);
					dbg.location(139,21);
					pushFollow(FOLLOW_expression_in_expression2745);
					expression63=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression63.getTree());
					dbg.location(139,32);
					string_literal64=(Token)match(input,THEN,FOLLOW_THEN_in_expression2747); 
					string_literal64_tree = (CommonTree)adaptor.create(string_literal64);
					adaptor.addChild(root_0, string_literal64_tree);
					dbg.location(139,39);
					pushFollow(FOLLOW_ei_in_expression2749);
					ei65=ei();
					state._fsp--;

					adaptor.addChild(root_0, ei65.getTree());

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
		dbg.location(140, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expression2"


	public static class simpleAR2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleAR2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:145:1: simpleAR2 : infixLog ( ':=' ^ infixLog )* ;
	public final AlgolParser.simpleAR2_return simpleAR2() throws RecognitionException {
		AlgolParser.simpleAR2_return retval = new AlgolParser.simpleAR2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal67=null;
		ParserRuleReturnScope infixLog66 =null;
		ParserRuleReturnScope infixLog68 =null;

		CommonTree string_literal67_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "simpleAR2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(145, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:145:10: ( infixLog ( ':=' ^ infixLog )* )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:145:12: infixLog ( ':=' ^ infixLog )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(145,12);
			pushFollow(FOLLOW_infixLog_in_simpleAR2764);
			infixLog66=infixLog();
			state._fsp--;

			adaptor.addChild(root_0, infixLog66.getTree());
			dbg.location(145,20);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:145:20: ( ':=' ^ infixLog )*
			try { dbg.enterSubRule(19);

			loop19:
			while (true) {
				int alt19=2;
				try { dbg.enterDecision(19, decisionCanBacktrack[19]);

				int LA19_0 = input.LA(1);
				if ( (LA19_0==ASSIGENMENT) ) {
					alt19=1;
				}

				} finally {dbg.exitDecision(19);}

				switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:145:21: ':=' ^ infixLog
					{
					dbg.location(145,25);
					string_literal67=(Token)match(input,ASSIGENMENT,FOLLOW_ASSIGENMENT_in_simpleAR2766); 
					string_literal67_tree = (CommonTree)adaptor.create(string_literal67);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal67_tree, root_0);
					dbg.location(145,27);
					pushFollow(FOLLOW_infixLog_in_simpleAR2769);
					infixLog68=infixLog();
					state._fsp--;

					adaptor.addChild(root_0, infixLog68.getTree());

					}
					break;

				default :
					break loop19;
				}
			}
			} finally {dbg.exitSubRule(19);}

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
		dbg.location(146, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "simpleAR2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "simpleAR2"


	public static class infixLog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "infixLog"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:148:1: infixLog : simpleARi2 ( ( 'OR' ^| 'AND' ^) simpleARi2 )* ;
	public final AlgolParser.infixLog_return infixLog() throws RecognitionException {
		AlgolParser.infixLog_return retval = new AlgolParser.infixLog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal70=null;
		Token string_literal71=null;
		ParserRuleReturnScope simpleARi269 =null;
		ParserRuleReturnScope simpleARi272 =null;

		CommonTree string_literal70_tree=null;
		CommonTree string_literal71_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "infixLog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(148, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:149:2: ( simpleARi2 ( ( 'OR' ^| 'AND' ^) simpleARi2 )* )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:149:4: simpleARi2 ( ( 'OR' ^| 'AND' ^) simpleARi2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(149,4);
			pushFollow(FOLLOW_simpleARi2_in_infixLog782);
			simpleARi269=simpleARi2();
			state._fsp--;

			adaptor.addChild(root_0, simpleARi269.getTree());
			dbg.location(149,14);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:149:14: ( ( 'OR' ^| 'AND' ^) simpleARi2 )*
			try { dbg.enterSubRule(21);

			loop21:
			while (true) {
				int alt21=2;
				try { dbg.enterDecision(21, decisionCanBacktrack[21]);

				int LA21_0 = input.LA(1);
				if ( (LA21_0==AND||LA21_0==OR) ) {
					alt21=1;
				}

				} finally {dbg.exitDecision(21);}

				switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:149:15: ( 'OR' ^| 'AND' ^) simpleARi2
					{
					dbg.location(149,15);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:149:15: ( 'OR' ^| 'AND' ^)
					int alt20=2;
					try { dbg.enterSubRule(20);
					try { dbg.enterDecision(20, decisionCanBacktrack[20]);

					int LA20_0 = input.LA(1);
					if ( (LA20_0==OR) ) {
						alt20=1;
					}
					else if ( (LA20_0==AND) ) {
						alt20=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(20);}

					switch (alt20) {
						case 1 :
							dbg.enterAlt(1);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:149:16: 'OR' ^
							{
							dbg.location(149,20);
							string_literal70=(Token)match(input,OR,FOLLOW_OR_in_infixLog785); 
							string_literal70_tree = (CommonTree)adaptor.create(string_literal70);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal70_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:149:22: 'AND' ^
							{
							dbg.location(149,27);
							string_literal71=(Token)match(input,AND,FOLLOW_AND_in_infixLog788); 
							string_literal71_tree = (CommonTree)adaptor.create(string_literal71);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal71_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(20);}
					dbg.location(149,29);
					pushFollow(FOLLOW_simpleARi2_in_infixLog791);
					simpleARi272=simpleARi2();
					state._fsp--;

					adaptor.addChild(root_0, simpleARi272.getTree());

					}
					break;

				default :
					break loop21;
				}
			}
			} finally {dbg.exitSubRule(21);}

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
		dbg.location(150, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "infixLog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "infixLog"


	public static class simpleARi2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleARi2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:152:1: simpleARi2 : multExp33 ( ( '+' ^| '-' ^) multExp33 )* ;
	public final AlgolParser.simpleARi2_return simpleARi2() throws RecognitionException {
		AlgolParser.simpleARi2_return retval = new AlgolParser.simpleARi2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal74=null;
		Token char_literal75=null;
		ParserRuleReturnScope multExp3373 =null;
		ParserRuleReturnScope multExp3376 =null;

		CommonTree char_literal74_tree=null;
		CommonTree char_literal75_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "simpleARi2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(152, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:152:11: ( multExp33 ( ( '+' ^| '-' ^) multExp33 )* )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:152:13: multExp33 ( ( '+' ^| '-' ^) multExp33 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(152,13);
			pushFollow(FOLLOW_multExp33_in_simpleARi2803);
			multExp3373=multExp33();
			state._fsp--;

			adaptor.addChild(root_0, multExp3373.getTree());
			dbg.location(152,22);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:152:22: ( ( '+' ^| '-' ^) multExp33 )*
			try { dbg.enterSubRule(23);

			loop23:
			while (true) {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				int LA23_0 = input.LA(1);
				if ( (LA23_0==PLUS||LA23_0==64) ) {
					alt23=1;
				}

				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:152:23: ( '+' ^| '-' ^) multExp33
					{
					dbg.location(152,23);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:152:23: ( '+' ^| '-' ^)
					int alt22=2;
					try { dbg.enterSubRule(22);
					try { dbg.enterDecision(22, decisionCanBacktrack[22]);

					int LA22_0 = input.LA(1);
					if ( (LA22_0==PLUS) ) {
						alt22=1;
					}
					else if ( (LA22_0==64) ) {
						alt22=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(22);}

					switch (alt22) {
						case 1 :
							dbg.enterAlt(1);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:152:24: '+' ^
							{
							dbg.location(152,28);
							char_literal74=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleARi2806); 
							char_literal74_tree = (CommonTree)adaptor.create(char_literal74);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal74_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:152:31: '-' ^
							{
							dbg.location(152,34);
							char_literal75=(Token)match(input,64,FOLLOW_64_in_simpleARi2811); 
							char_literal75_tree = (CommonTree)adaptor.create(char_literal75);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal75_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(22);}
					dbg.location(152,37);
					pushFollow(FOLLOW_multExp33_in_simpleARi2815);
					multExp3376=multExp33();
					state._fsp--;

					adaptor.addChild(root_0, multExp3376.getTree());

					}
					break;

				default :
					break loop23;
				}
			}
			} finally {dbg.exitSubRule(23);}

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
		dbg.location(153, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "simpleARi2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "simpleARi2"


	public static class multExp33_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multExp33"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:155:1: multExp33 : multExp2 ( ( '*' ^| '/' ^) multExp2 )* ;
	public final AlgolParser.multExp33_return multExp33() throws RecognitionException {
		AlgolParser.multExp33_return retval = new AlgolParser.multExp33_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal78=null;
		Token char_literal79=null;
		ParserRuleReturnScope multExp277 =null;
		ParserRuleReturnScope multExp280 =null;

		CommonTree char_literal78_tree=null;
		CommonTree char_literal79_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "multExp33");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(155, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:156:2: ( multExp2 ( ( '*' ^| '/' ^) multExp2 )* )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:156:4: multExp2 ( ( '*' ^| '/' ^) multExp2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(156,4);
			pushFollow(FOLLOW_multExp2_in_multExp33829);
			multExp277=multExp2();
			state._fsp--;

			adaptor.addChild(root_0, multExp277.getTree());
			dbg.location(156,12);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:156:12: ( ( '*' ^| '/' ^) multExp2 )*
			try { dbg.enterSubRule(25);

			loop25:
			while (true) {
				int alt25=2;
				try { dbg.enterDecision(25, decisionCanBacktrack[25]);

				int LA25_0 = input.LA(1);
				if ( (LA25_0==DIV||LA25_0==MULT) ) {
					alt25=1;
				}

				} finally {dbg.exitDecision(25);}

				switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:156:13: ( '*' ^| '/' ^) multExp2
					{
					dbg.location(156,13);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:156:13: ( '*' ^| '/' ^)
					int alt24=2;
					try { dbg.enterSubRule(24);
					try { dbg.enterDecision(24, decisionCanBacktrack[24]);

					int LA24_0 = input.LA(1);
					if ( (LA24_0==MULT) ) {
						alt24=1;
					}
					else if ( (LA24_0==DIV) ) {
						alt24=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(24);}

					switch (alt24) {
						case 1 :
							dbg.enterAlt(1);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:156:14: '*' ^
							{
							dbg.location(156,18);
							char_literal78=(Token)match(input,MULT,FOLLOW_MULT_in_multExp33832); 
							char_literal78_tree = (CommonTree)adaptor.create(char_literal78);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal78_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:156:21: '/' ^
							{
							dbg.location(156,24);
							char_literal79=(Token)match(input,DIV,FOLLOW_DIV_in_multExp33837); 
							char_literal79_tree = (CommonTree)adaptor.create(char_literal79);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal79_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(24);}
					dbg.location(156,27);
					pushFollow(FOLLOW_multExp2_in_multExp33841);
					multExp280=multExp2();
					state._fsp--;

					adaptor.addChild(root_0, multExp280.getTree());

					}
					break;

				default :
					break loop25;
				}
			}
			} finally {dbg.exitSubRule(25);}

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
		dbg.location(157, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multExp33");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "multExp33"


	public static class multExp2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multExp2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:159:1: multExp2 : powExp2 ( 'POWER' ^ powExp2 )* ;
	public final AlgolParser.multExp2_return multExp2() throws RecognitionException {
		AlgolParser.multExp2_return retval = new AlgolParser.multExp2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal82=null;
		ParserRuleReturnScope powExp281 =null;
		ParserRuleReturnScope powExp283 =null;

		CommonTree string_literal82_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "multExp2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(159, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:159:10: ( powExp2 ( 'POWER' ^ powExp2 )* )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:159:12: powExp2 ( 'POWER' ^ powExp2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(159,12);
			pushFollow(FOLLOW_powExp2_in_multExp2855);
			powExp281=powExp2();
			state._fsp--;

			adaptor.addChild(root_0, powExp281.getTree());
			dbg.location(159,19);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:159:19: ( 'POWER' ^ powExp2 )*
			try { dbg.enterSubRule(26);

			loop26:
			while (true) {
				int alt26=2;
				try { dbg.enterDecision(26, decisionCanBacktrack[26]);

				int LA26_0 = input.LA(1);
				if ( (LA26_0==POWER) ) {
					alt26=1;
				}

				} finally {dbg.exitDecision(26);}

				switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:159:20: 'POWER' ^ powExp2
					{
					dbg.location(159,27);
					string_literal82=(Token)match(input,POWER,FOLLOW_POWER_in_multExp2857); 
					string_literal82_tree = (CommonTree)adaptor.create(string_literal82);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal82_tree, root_0);
					dbg.location(159,29);
					pushFollow(FOLLOW_powExp2_in_multExp2860);
					powExp283=powExp2();
					state._fsp--;

					adaptor.addChild(root_0, powExp283.getTree());

					}
					break;

				default :
					break loop26;
				}
			}
			} finally {dbg.exitSubRule(26);}

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
		dbg.location(160, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multExp2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:162:1: powExp2 : (| ID ( -> ID ) beginwithID -> beginwithID | INT -> INT | STRING | '(' expression2 ')' -> expression2 );
	public final AlgolParser.powExp2_return powExp2() throws RecognitionException {
		AlgolParser.powExp2_return retval = new AlgolParser.powExp2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID84=null;
		Token INT86=null;
		Token STRING87=null;
		Token char_literal88=null;
		Token char_literal90=null;
		ParserRuleReturnScope beginwithID85 =null;
		ParserRuleReturnScope expression289 =null;

		CommonTree ID84_tree=null;
		CommonTree INT86_tree=null;
		CommonTree STRING87_tree=null;
		CommonTree char_literal88_tree=null;
		CommonTree char_literal90_tree=null;
		RewriteRuleTokenStream stream_PARENTHESEF=new RewriteRuleTokenStream(adaptor,"token PARENTHESEF");
		RewriteRuleTokenStream stream_PARENTHESEO=new RewriteRuleTokenStream(adaptor,"token PARENTHESEO");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleSubtreeStream stream_beginwithID=new RewriteRuleSubtreeStream(adaptor,"rule beginwithID");
		RewriteRuleSubtreeStream stream_expression2=new RewriteRuleSubtreeStream(adaptor,"rule expression2");

		try { dbg.enterRule(getGrammarFileName(), "powExp2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(162, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:162:9: (| ID ( -> ID ) beginwithID -> beginwithID | INT -> INT | STRING | '(' expression2 ')' -> expression2 )
			int alt27=5;
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			switch ( input.LA(1) ) {
			case AND:
			case ASSIGENMENT:
			case DIV:
			case MULT:
			case OR:
			case PARENTHESEF:
			case PLUS:
			case POWER:
			case 63:
			case 64:
				{
				alt27=1;
				}
				break;
			case ID:
				{
				alt27=2;
				}
				break;
			case INT:
				{
				alt27=3;
				}
				break;
			case STRING:
				{
				alt27=4;
				}
				break;
			case PARENTHESEO:
				{
				alt27=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:163:10: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:163:12: ID ( -> ID ) beginwithID
					{
					dbg.location(163,12);
					ID84=(Token)match(input,ID,FOLLOW_ID_in_powExp2884);  
					stream_ID.add(ID84);
					dbg.location(163,15);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:163:15: ( -> ID )
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:163:16: 
					{
					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 163:16: -> ID
					{
						dbg.location(163,18);
						adaptor.addChild(root_0, stream_ID.nextNode());
					}


					retval.tree = root_0;

					}
					dbg.location(163,22);
					Idmemoire=retval.tree;dbg.location(163,49);
					pushFollow(FOLLOW_beginwithID_in_powExp2893);
					beginwithID85=beginwithID();
					state._fsp--;

					stream_beginwithID.add(beginwithID85.getTree());
					// AST REWRITE
					// elements: beginwithID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 163:61: -> beginwithID
					{
						dbg.location(163,64);
						adaptor.addChild(root_0, stream_beginwithID.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:164:11: INT
					{
					dbg.location(164,11);
					INT86=(Token)match(input,INT,FOLLOW_INT_in_powExp2909);  
					stream_INT.add(INT86);

					// AST REWRITE
					// elements: INT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 164:14: -> INT
					{
						dbg.location(164,16);
						adaptor.addChild(root_0, stream_INT.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:165:11: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(165,11);
					STRING87=(Token)match(input,STRING,FOLLOW_STRING_in_powExp2923); 
					STRING87_tree = (CommonTree)adaptor.create(STRING87);
					adaptor.addChild(root_0, STRING87_tree);

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:166:12: '(' expression2 ')'
					{
					dbg.location(166,12);
					char_literal88=(Token)match(input,PARENTHESEO,FOLLOW_PARENTHESEO_in_powExp2936);  
					stream_PARENTHESEO.add(char_literal88);
					dbg.location(166,16);
					pushFollow(FOLLOW_expression2_in_powExp2938);
					expression289=expression2();
					state._fsp--;

					stream_expression2.add(expression289.getTree());dbg.location(166,28);
					char_literal90=(Token)match(input,PARENTHESEF,FOLLOW_PARENTHESEF_in_powExp2940);  
					stream_PARENTHESEF.add(char_literal90);

					// AST REWRITE
					// elements: expression2
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 166:31: -> expression2
					{
						dbg.location(166,34);
						adaptor.addChild(root_0, stream_expression2.nextTree());
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
		dbg.location(167, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "powExp2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:169:1: identifier : ( ID ( -> ID ) o -> o | INT );
	public final AlgolParser.identifier_return identifier() throws RecognitionException {
		AlgolParser.identifier_return retval = new AlgolParser.identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID91=null;
		Token INT93=null;
		ParserRuleReturnScope o92 =null;

		CommonTree ID91_tree=null;
		CommonTree INT93_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o");

		try { dbg.enterRule(getGrammarFileName(), "identifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(169, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:170:2: ( ID ( -> ID ) o -> o | INT )
			int alt28=2;
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==ID) ) {
				alt28=1;
			}
			else if ( (LA28_0==INT) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:170:4: ID ( -> ID ) o
					{
					dbg.location(170,4);
					ID91=(Token)match(input,ID,FOLLOW_ID_in_identifier955);  
					stream_ID.add(ID91);
					dbg.location(170,7);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:170:7: ( -> ID )
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:170:8: 
					{
					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 170:8: -> ID
					{
						dbg.location(170,10);
						adaptor.addChild(root_0, stream_ID.nextNode());
					}


					retval.tree = root_0;

					}
					dbg.location(170,14);
					Idmemoire=retval.tree;dbg.location(170,44);
					pushFollow(FOLLOW_o_in_identifier964);
					o92=o();
					state._fsp--;

					stream_o.add(o92.getTree());
					// AST REWRITE
					// elements: o
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 170:45: -> o
					{
						dbg.location(170,47);
						adaptor.addChild(root_0, stream_o.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:171:3: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(171,3);
					INT93=(Token)match(input,INT,FOLLOW_INT_in_identifier970); 
					INT93_tree = (CommonTree)adaptor.create(INT93);
					adaptor.addChild(root_0, INT93_tree);

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
		dbg.location(172, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "identifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:174:1: o : ( ( ->) INT -> ^( INT ) | ( ->) '[' expression ( ',' expression )* ']' -> ^( ARRAYACCESS $o ( expression )+ ) | ( ->) );
	public final AlgolParser.o_return o() throws RecognitionException {
		AlgolParser.o_return retval = new AlgolParser.o_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT94=null;
		Token char_literal95=null;
		Token char_literal97=null;
		Token char_literal99=null;
		ParserRuleReturnScope expression96 =null;
		ParserRuleReturnScope expression98 =null;

		CommonTree INT94_tree=null;
		CommonTree char_literal95_tree=null;
		CommonTree char_literal97_tree=null;
		CommonTree char_literal99_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try { dbg.enterRule(getGrammarFileName(), "o");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(174, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:174:3: ( ( ->) INT -> ^( INT ) | ( ->) '[' expression ( ',' expression )* ']' -> ^( ARRAYACCESS $o ( expression )+ ) | ( ->) )
			int alt30=3;
			try { dbg.enterDecision(30, decisionCanBacktrack[30]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt30=1;
				}
				break;
			case 72:
				{
				alt30=2;
				}
				break;
			case EOF:
			case ASSIGENMENT:
			case ELSE:
			case PARENTHESEF:
			case PARENTHESEO:
			case 63:
			case 65:
			case 68:
				{
				alt30=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(30);}

			switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:174:5: ( ->) INT
					{
					dbg.location(174,5);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:174:5: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:174:6: 
					{
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
					// 174:6: ->
					{
						dbg.location(174,8);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(174,20);
					INT94=(Token)match(input,INT,FOLLOW_INT_in_o985);  
					stream_INT.add(INT94);

					// AST REWRITE
					// elements: INT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 174:23: -> ^( INT )
					{
						dbg.location(174,25);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:174:25: ^( INT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(174,27);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_INT.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:175:18: ( ->) '[' expression ( ',' expression )* ']'
					{
					dbg.location(175,18);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:175:18: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:175:19: 
					{
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
					// 175:19: ->
					{
						dbg.location(175,21);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(175,33);
					char_literal95=(Token)match(input,72,FOLLOW_72_in_o1012);  
					stream_72.add(char_literal95);
					dbg.location(175,36);
					pushFollow(FOLLOW_expression_in_o1013);
					expression96=expression();
					state._fsp--;

					stream_expression.add(expression96.getTree());dbg.location(175,47);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:175:47: ( ',' expression )*
					try { dbg.enterSubRule(29);

					loop29:
					while (true) {
						int alt29=2;
						try { dbg.enterDecision(29, decisionCanBacktrack[29]);

						int LA29_0 = input.LA(1);
						if ( (LA29_0==63) ) {
							alt29=1;
						}

						} finally {dbg.exitDecision(29);}

						switch (alt29) {
						case 1 :
							dbg.enterAlt(1);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:175:48: ',' expression
							{
							dbg.location(175,48);
							char_literal97=(Token)match(input,63,FOLLOW_63_in_o1016);  
							stream_63.add(char_literal97);
							dbg.location(175,52);
							pushFollow(FOLLOW_expression_in_o1018);
							expression98=expression();
							state._fsp--;

							stream_expression.add(expression98.getTree());
							}
							break;

						default :
							break loop29;
						}
					}
					} finally {dbg.exitSubRule(29);}
					dbg.location(175,64);
					char_literal99=(Token)match(input,73,FOLLOW_73_in_o1021);  
					stream_73.add(char_literal99);

					// AST REWRITE
					// elements: expression, o
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 175:67: -> ^( ARRAYACCESS $o ( expression )+ )
					{
						dbg.location(175,69);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:175:69: ^( ARRAYACCESS $o ( expression )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(175,71);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAYACCESS, "ARRAYACCESS"), root_1);
						dbg.location(175,85);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(175,87);
						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							dbg.location(175,87);
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:176:18: ( ->)
					{
					dbg.location(176,18);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:176:18: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:176:19: 
					{
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
					// 176:19: ->
					{
						dbg.location(176,21);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

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
		dbg.location(177, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "o");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:183:1: d : ( declaration ';' ( declaration ';' )* compoundT -> ( ^( DEC declaration ) )+ ^( BLOCK compoundT ) | compoundT -> ^( BLOCK compoundT ) );
	public final AlgolParser.d_return d() throws RecognitionException {
		AlgolParser.d_return retval = new AlgolParser.d_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal101=null;
		Token char_literal103=null;
		ParserRuleReturnScope declaration100 =null;
		ParserRuleReturnScope declaration102 =null;
		ParserRuleReturnScope compoundT104 =null;
		ParserRuleReturnScope compoundT105 =null;

		CommonTree char_literal101_tree=null;
		CommonTree char_literal103_tree=null;
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_compoundT=new RewriteRuleSubtreeStream(adaptor,"rule compoundT");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try { dbg.enterRule(getGrammarFileName(), "d");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(183, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:183:3: ( declaration ';' ( declaration ';' )* compoundT -> ( ^( DEC declaration ) )+ ^( BLOCK compoundT ) | compoundT -> ^( BLOCK compoundT ) )
			int alt32=2;
			try { dbg.enterDecision(32, decisionCanBacktrack[32]);

			int LA32_0 = input.LA(1);
			if ( (LA32_0==LOCAL||LA32_0==PROCEDURE||LA32_0==SWITCH||(LA32_0 >= TYPEBOOL && LA32_0 <= TYPEREAL)||LA32_0==66) ) {
				alt32=1;
			}
			else if ( (LA32_0==BEGIN||LA32_0==COMMENT2||LA32_0==FOR||LA32_0==GOTO||(LA32_0 >= ID && LA32_0 <= IF)||LA32_0==PARENTHESEO) ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(32);}

			switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:183:5: declaration ';' ( declaration ';' )* compoundT
					{
					dbg.location(183,5);
					pushFollow(FOLLOW_declaration_in_d1110);
					declaration100=declaration();
					state._fsp--;

					stream_declaration.add(declaration100.getTree());dbg.location(183,17);
					char_literal101=(Token)match(input,65,FOLLOW_65_in_d1112);  
					stream_65.add(char_literal101);
					dbg.location(183,21);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:183:21: ( declaration ';' )*
					try { dbg.enterSubRule(31);

					loop31:
					while (true) {
						int alt31=2;
						try { dbg.enterDecision(31, decisionCanBacktrack[31]);

						int LA31_0 = input.LA(1);
						if ( (LA31_0==LOCAL||LA31_0==PROCEDURE||LA31_0==SWITCH||(LA31_0 >= TYPEBOOL && LA31_0 <= TYPEREAL)||LA31_0==66) ) {
							alt31=1;
						}

						} finally {dbg.exitDecision(31);}

						switch (alt31) {
						case 1 :
							dbg.enterAlt(1);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:183:22: declaration ';'
							{
							dbg.location(183,22);
							pushFollow(FOLLOW_declaration_in_d1115);
							declaration102=declaration();
							state._fsp--;

							stream_declaration.add(declaration102.getTree());dbg.location(183,34);
							char_literal103=(Token)match(input,65,FOLLOW_65_in_d1117);  
							stream_65.add(char_literal103);

							}
							break;

						default :
							break loop31;
						}
					}
					} finally {dbg.exitSubRule(31);}
					dbg.location(183,40);
					pushFollow(FOLLOW_compoundT_in_d1121);
					compoundT104=compoundT();
					state._fsp--;

					stream_compoundT.add(compoundT104.getTree());
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
					// 183:49: -> ( ^( DEC declaration ) )+ ^( BLOCK compoundT )
					{
						dbg.location(183,51);
						if ( !(stream_declaration.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_declaration.hasNext() ) {
							dbg.location(183,51);
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:183:51: ^( DEC declaration )
							{
							CommonTree root_1 = (CommonTree)adaptor.nil();
							dbg.location(183,53);
							root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEC, "DEC"), root_1);
							dbg.location(183,57);
							adaptor.addChild(root_1, stream_declaration.nextTree());
							adaptor.addChild(root_0, root_1);
							}

						}
						stream_declaration.reset();
						dbg.location(183,71);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:183:71: ^( BLOCK compoundT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(183,73);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
						dbg.location(183,79);
						adaptor.addChild(root_1, stream_compoundT.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:184:4: compoundT
					{
					dbg.location(184,4);
					pushFollow(FOLLOW_compoundT_in_d1139);
					compoundT105=compoundT();
					state._fsp--;

					stream_compoundT.add(compoundT105.getTree());
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
					// 184:13: -> ^( BLOCK compoundT )
					{
						dbg.location(184,15);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:184:15: ^( BLOCK compoundT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(184,17);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
						dbg.location(184,23);
						adaptor.addChild(root_1, stream_compoundT.nextTree());
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
		dbg.location(185, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "d");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:187:1: prog1 : ( begin EOF -> begin | ( label ':' )+ begin -> ^( LABEL ( label )+ begin ) );
	public final AlgolParser.prog1_return prog1() throws RecognitionException {
		AlgolParser.prog1_return retval = new AlgolParser.prog1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF107=null;
		Token char_literal109=null;
		ParserRuleReturnScope begin106 =null;
		ParserRuleReturnScope label108 =null;
		ParserRuleReturnScope begin110 =null;

		CommonTree EOF107_tree=null;
		CommonTree char_literal109_tree=null;
		RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_label=new RewriteRuleSubtreeStream(adaptor,"rule label");
		RewriteRuleSubtreeStream stream_begin=new RewriteRuleSubtreeStream(adaptor,"rule begin");

		try { dbg.enterRule(getGrammarFileName(), "prog1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(187, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:187:7: ( begin EOF -> begin | ( label ':' )+ begin -> ^( LABEL ( label )+ begin ) )
			int alt34=2;
			try { dbg.enterDecision(34, decisionCanBacktrack[34]);

			int LA34_0 = input.LA(1);
			if ( (LA34_0==BEGIN) ) {
				alt34=1;
			}
			else if ( (LA34_0==ID||LA34_0==INT) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(34);}

			switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:187:11: begin EOF
					{
					dbg.location(187,11);
					pushFollow(FOLLOW_begin_in_prog11157);
					begin106=begin();
					state._fsp--;

					stream_begin.add(begin106.getTree());dbg.location(187,17);
					EOF107=(Token)match(input,EOF,FOLLOW_EOF_in_prog11159);  
					stream_EOF.add(EOF107);

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
					// 187:20: -> begin
					{
						dbg.location(187,22);
						adaptor.addChild(root_0, stream_begin.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:188:19: ( label ':' )+ begin
					{
					dbg.location(188,19);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:188:19: ( label ':' )+
					int cnt33=0;
					try { dbg.enterSubRule(33);

					loop33:
					while (true) {
						int alt33=2;
						try { dbg.enterDecision(33, decisionCanBacktrack[33]);

						int LA33_0 = input.LA(1);
						if ( (LA33_0==ID||LA33_0==INT) ) {
							alt33=1;
						}

						} finally {dbg.exitDecision(33);}

						switch (alt33) {
						case 1 :
							dbg.enterAlt(1);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:188:20: label ':'
							{
							dbg.location(188,20);
							pushFollow(FOLLOW_label_in_prog11182);
							label108=label();
							state._fsp--;

							stream_label.add(label108.getTree());dbg.location(188,26);
							char_literal109=(Token)match(input,BORNE,FOLLOW_BORNE_in_prog11184);  
							stream_BORNE.add(char_literal109);

							}
							break;

						default :
							if ( cnt33 >= 1 ) break loop33;
							EarlyExitException eee = new EarlyExitException(33, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt33++;
					}
					} finally {dbg.exitSubRule(33);}
					dbg.location(188,32);
					pushFollow(FOLLOW_begin_in_prog11188);
					begin110=begin();
					state._fsp--;

					stream_begin.add(begin110.getTree());
					// AST REWRITE
					// elements: label, begin
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 188:37: -> ^( LABEL ( label )+ begin )
					{
						dbg.location(188,39);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:188:39: ^( LABEL ( label )+ begin )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(188,41);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, "LABEL"), root_1);
						dbg.location(188,47);
						if ( !(stream_label.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_label.hasNext() ) {
							dbg.location(188,47);
							adaptor.addChild(root_1, stream_label.nextTree());
						}
						stream_label.reset();
						dbg.location(188,54);
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
		dbg.location(189, 17);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "prog1"


	public static class localorown_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "localorown"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:194:1: localorown : ( type | 'OWN' type );
	public final AlgolParser.localorown_return localorown() throws RecognitionException {
		AlgolParser.localorown_return retval = new AlgolParser.localorown_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal112=null;
		ParserRuleReturnScope type111 =null;
		ParserRuleReturnScope type113 =null;

		CommonTree string_literal112_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "localorown");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(194, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:195:2: ( type | 'OWN' type )
			int alt35=2;
			try { dbg.enterDecision(35, decisionCanBacktrack[35]);

			int LA35_0 = input.LA(1);
			if ( ((LA35_0 >= TYPEBOOL && LA35_0 <= TYPEREAL)) ) {
				alt35=1;
			}
			else if ( (LA35_0==LOCAL) ) {
				alt35=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(35);}

			switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:195:4: type
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(195,4);
					pushFollow(FOLLOW_type_in_localorown1261);
					type111=type();
					state._fsp--;

					adaptor.addChild(root_0, type111.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:195:9: 'OWN' type
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(195,9);
					string_literal112=(Token)match(input,LOCAL,FOLLOW_LOCAL_in_localorown1263); 
					string_literal112_tree = (CommonTree)adaptor.create(string_literal112);
					adaptor.addChild(root_0, string_literal112_tree);
					dbg.location(195,15);
					pushFollow(FOLLOW_type_in_localorown1265);
					type113=type();
					state._fsp--;

					adaptor.addChild(root_0, type113.getTree());

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
		dbg.location(196, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "localorown");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:198:1: type : ( 'REAL' | 'INTEGER' | 'BOOLEAN' );
	public final AlgolParser.type_return type() throws RecognitionException {
		AlgolParser.type_return retval = new AlgolParser.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set114=null;

		CommonTree set114_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(198, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:198:6: ( 'REAL' | 'INTEGER' | 'BOOLEAN' )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(198,6);
			set114=input.LT(1);
			if ( (input.LA(1) >= TYPEBOOL && input.LA(1) <= TYPEREAL) ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set114));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
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
		dbg.location(201, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:203:1: typeliste : identifier ( ',' identifier )* -> ( identifier )+ ;
	public final AlgolParser.typeliste_return typeliste() throws RecognitionException {
		AlgolParser.typeliste_return retval = new AlgolParser.typeliste_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal116=null;
		ParserRuleReturnScope identifier115 =null;
		ParserRuleReturnScope identifier117 =null;

		CommonTree char_literal116_tree=null;
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try { dbg.enterRule(getGrammarFileName(), "typeliste");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(203, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:204:2: ( identifier ( ',' identifier )* -> ( identifier )+ )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:204:4: identifier ( ',' identifier )*
			{
			dbg.location(204,4);
			pushFollow(FOLLOW_identifier_in_typeliste1325);
			identifier115=identifier();
			state._fsp--;

			stream_identifier.add(identifier115.getTree());dbg.location(204,15);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:204:15: ( ',' identifier )*
			try { dbg.enterSubRule(36);

			loop36:
			while (true) {
				int alt36=2;
				try { dbg.enterDecision(36, decisionCanBacktrack[36]);

				int LA36_0 = input.LA(1);
				if ( (LA36_0==63) ) {
					alt36=1;
				}

				} finally {dbg.exitDecision(36);}

				switch (alt36) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:204:16: ',' identifier
					{
					dbg.location(204,16);
					char_literal116=(Token)match(input,63,FOLLOW_63_in_typeliste1328);  
					stream_63.add(char_literal116);
					dbg.location(204,20);
					pushFollow(FOLLOW_identifier_in_typeliste1330);
					identifier117=identifier();
					state._fsp--;

					stream_identifier.add(identifier117.getTree());
					}
					break;

				default :
					break loop36;
				}
			}
			} finally {dbg.exitSubRule(36);}

			// AST REWRITE
			// elements: identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 204:32: -> ( identifier )+
			{
				dbg.location(204,34);
				if ( !(stream_identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_identifier.hasNext() ) {
					dbg.location(204,35);
					adaptor.addChild(root_0, stream_identifier.nextTree());
				}
				stream_identifier.reset();

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
		dbg.location(205, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "typeliste");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "typeliste"


	public static class arraylist_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arraylist"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:211:1: arraylist : arrayseg ( ',' arrayseg )* -> ( arrayseg )* ;
	public final AlgolParser.arraylist_return arraylist() throws RecognitionException {
		AlgolParser.arraylist_return retval = new AlgolParser.arraylist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal119=null;
		ParserRuleReturnScope arrayseg118 =null;
		ParserRuleReturnScope arrayseg120 =null;

		CommonTree char_literal119_tree=null;
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_arrayseg=new RewriteRuleSubtreeStream(adaptor,"rule arrayseg");

		try { dbg.enterRule(getGrammarFileName(), "arraylist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(211, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:212:2: ( arrayseg ( ',' arrayseg )* -> ( arrayseg )* )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:212:4: arrayseg ( ',' arrayseg )*
			{
			dbg.location(212,4);
			pushFollow(FOLLOW_arrayseg_in_arraylist1355);
			arrayseg118=arrayseg();
			state._fsp--;

			stream_arrayseg.add(arrayseg118.getTree());dbg.location(212,12);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:212:12: ( ',' arrayseg )*
			try { dbg.enterSubRule(37);

			loop37:
			while (true) {
				int alt37=2;
				try { dbg.enterDecision(37, decisionCanBacktrack[37]);

				int LA37_0 = input.LA(1);
				if ( (LA37_0==63) ) {
					alt37=1;
				}

				} finally {dbg.exitDecision(37);}

				switch (alt37) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:212:13: ',' arrayseg
					{
					dbg.location(212,13);
					char_literal119=(Token)match(input,63,FOLLOW_63_in_arraylist1357);  
					stream_63.add(char_literal119);
					dbg.location(212,16);
					pushFollow(FOLLOW_arrayseg_in_arraylist1358);
					arrayseg120=arrayseg();
					state._fsp--;

					stream_arrayseg.add(arrayseg120.getTree());
					}
					break;

				default :
					break loop37;
				}
			}
			} finally {dbg.exitSubRule(37);}

			// AST REWRITE
			// elements: arrayseg
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 212:27: -> ( arrayseg )*
			{
				dbg.location(212,29);
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:212:29: ( arrayseg )*
				while ( stream_arrayseg.hasNext() ) {
					dbg.location(212,30);
					adaptor.addChild(root_0, stream_arrayseg.nextTree());
				}
				stream_arrayseg.reset();

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
		dbg.location(213, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arraylist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "arraylist"


	public static class arrayseg_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arrayseg"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:219:1: arrayseg : ID ( -> ID ) r -> r ;
	public final AlgolParser.arrayseg_return arrayseg() throws RecognitionException {
		AlgolParser.arrayseg_return retval = new AlgolParser.arrayseg_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID121=null;
		ParserRuleReturnScope r122 =null;

		CommonTree ID121_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r");

		try { dbg.enterRule(getGrammarFileName(), "arrayseg");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(219, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:219:9: ( ID ( -> ID ) r -> r )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:219:11: ID ( -> ID ) r
			{
			dbg.location(219,11);
			ID121=(Token)match(input,ID,FOLLOW_ID_in_arrayseg1381);  
			stream_ID.add(ID121);
			dbg.location(219,14);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:219:14: ( -> ID )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:219:15: 
			{
			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 219:15: -> ID
			{
				dbg.location(219,17);
				adaptor.addChild(root_0, stream_ID.nextNode());
			}


			retval.tree = root_0;

			}
			dbg.location(219,21);
			Idmemoire=retval.tree;dbg.location(219,49);
			pushFollow(FOLLOW_r_in_arrayseg1390);
			r122=r();
			state._fsp--;

			stream_r.add(r122.getTree());
			// AST REWRITE
			// elements: r
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 219:50: -> r
			{
				dbg.location(219,53);
				adaptor.addChild(root_0, stream_r.nextTree());
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
		dbg.location(220, 21);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arrayseg");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:222:1: r : ( ( ->) '[' boundplist ']' -> $r boundplist | ( ->) ',' arrayseg -> arrayseg );
	public final AlgolParser.r_return r() throws RecognitionException {
		AlgolParser.r_return retval = new AlgolParser.r_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal123=null;
		Token char_literal125=null;
		Token char_literal126=null;
		ParserRuleReturnScope boundplist124 =null;
		ParserRuleReturnScope arrayseg127 =null;

		CommonTree char_literal123_tree=null;
		CommonTree char_literal125_tree=null;
		CommonTree char_literal126_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_boundplist=new RewriteRuleSubtreeStream(adaptor,"rule boundplist");
		RewriteRuleSubtreeStream stream_arrayseg=new RewriteRuleSubtreeStream(adaptor,"rule arrayseg");

		try { dbg.enterRule(getGrammarFileName(), "r");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(222, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:222:3: ( ( ->) '[' boundplist ']' -> $r boundplist | ( ->) ',' arrayseg -> arrayseg )
			int alt38=2;
			try { dbg.enterDecision(38, decisionCanBacktrack[38]);

			int LA38_0 = input.LA(1);
			if ( (LA38_0==72) ) {
				alt38=1;
			}
			else if ( (LA38_0==63) ) {
				alt38=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(38);}

			switch (alt38) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:222:5: ( ->) '[' boundplist ']'
					{
					dbg.location(222,5);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:222:5: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:222:6: 
					{
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
					// 222:6: ->
					{
						dbg.location(222,8);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(222,20);
					char_literal123=(Token)match(input,72,FOLLOW_72_in_r1427);  
					stream_72.add(char_literal123);
					dbg.location(222,24);
					pushFollow(FOLLOW_boundplist_in_r1429);
					boundplist124=boundplist();
					state._fsp--;

					stream_boundplist.add(boundplist124.getTree());dbg.location(222,34);
					char_literal125=(Token)match(input,73,FOLLOW_73_in_r1430);  
					stream_73.add(char_literal125);

					// AST REWRITE
					// elements: boundplist, r
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 222:37: -> $r boundplist
					{
						dbg.location(222,41);
						adaptor.addChild(root_0, stream_retval.nextTree());dbg.location(222,43);
						adaptor.addChild(root_0, stream_boundplist.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:223:4: ( ->) ',' arrayseg
					{
					dbg.location(223,4);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:223:4: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:223:5: 
					{
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
					// 223:5: ->
					{
						dbg.location(223,7);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(223,19);
					char_literal126=(Token)match(input,63,FOLLOW_63_in_r1445);  
					stream_63.add(char_literal126);
					dbg.location(223,23);
					pushFollow(FOLLOW_arrayseg_in_r1447);
					arrayseg127=arrayseg();
					state._fsp--;

					stream_arrayseg.add(arrayseg127.getTree());
					// AST REWRITE
					// elements: arrayseg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 223:31: -> arrayseg
					{
						dbg.location(223,33);
						adaptor.addChild(root_0, stream_arrayseg.nextTree());
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
		dbg.location(224, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "r");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:230:1: boundplist : boundp ( ',' boundp )* -> ( boundp )+ ;
	public final AlgolParser.boundplist_return boundplist() throws RecognitionException {
		AlgolParser.boundplist_return retval = new AlgolParser.boundplist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal129=null;
		ParserRuleReturnScope boundp128 =null;
		ParserRuleReturnScope boundp130 =null;

		CommonTree char_literal129_tree=null;
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_boundp=new RewriteRuleSubtreeStream(adaptor,"rule boundp");

		try { dbg.enterRule(getGrammarFileName(), "boundplist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(230, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:231:2: ( boundp ( ',' boundp )* -> ( boundp )+ )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:231:4: boundp ( ',' boundp )*
			{
			dbg.location(231,4);
			pushFollow(FOLLOW_boundp_in_boundplist1468);
			boundp128=boundp();
			state._fsp--;

			stream_boundp.add(boundp128.getTree());dbg.location(231,11);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:231:11: ( ',' boundp )*
			try { dbg.enterSubRule(39);

			loop39:
			while (true) {
				int alt39=2;
				try { dbg.enterDecision(39, decisionCanBacktrack[39]);

				int LA39_0 = input.LA(1);
				if ( (LA39_0==63) ) {
					alt39=1;
				}

				} finally {dbg.exitDecision(39);}

				switch (alt39) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:231:12: ',' boundp
					{
					dbg.location(231,12);
					char_literal129=(Token)match(input,63,FOLLOW_63_in_boundplist1471);  
					stream_63.add(char_literal129);
					dbg.location(231,16);
					pushFollow(FOLLOW_boundp_in_boundplist1473);
					boundp130=boundp();
					state._fsp--;

					stream_boundp.add(boundp130.getTree());
					}
					break;

				default :
					break loop39;
				}
			}
			} finally {dbg.exitSubRule(39);}

			// AST REWRITE
			// elements: boundp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 231:24: -> ( boundp )+
			{
				dbg.location(231,26);
				if ( !(stream_boundp.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_boundp.hasNext() ) {
					dbg.location(231,27);
					adaptor.addChild(root_0, stream_boundp.nextTree());
				}
				stream_boundp.reset();

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
		dbg.location(232, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "boundplist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "boundplist"


	public static class boundp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boundp"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:237:1: boundp : simpleARi ':' simpleARi -> ^( BORNE simpleARi simpleARi ) ;
	public final AlgolParser.boundp_return boundp() throws RecognitionException {
		AlgolParser.boundp_return retval = new AlgolParser.boundp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal132=null;
		ParserRuleReturnScope simpleARi131 =null;
		ParserRuleReturnScope simpleARi133 =null;

		CommonTree char_literal132_tree=null;
		RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
		RewriteRuleSubtreeStream stream_simpleARi=new RewriteRuleSubtreeStream(adaptor,"rule simpleARi");

		try { dbg.enterRule(getGrammarFileName(), "boundp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(237, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:237:8: ( simpleARi ':' simpleARi -> ^( BORNE simpleARi simpleARi ) )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:237:10: simpleARi ':' simpleARi
			{
			dbg.location(237,10);
			pushFollow(FOLLOW_simpleARi_in_boundp1496);
			simpleARi131=simpleARi();
			state._fsp--;

			stream_simpleARi.add(simpleARi131.getTree());dbg.location(237,20);
			char_literal132=(Token)match(input,BORNE,FOLLOW_BORNE_in_boundp1498);  
			stream_BORNE.add(char_literal132);
			dbg.location(237,24);
			pushFollow(FOLLOW_simpleARi_in_boundp1500);
			simpleARi133=simpleARi();
			state._fsp--;

			stream_simpleARi.add(simpleARi133.getTree());
			// AST REWRITE
			// elements: simpleARi, simpleARi
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 237:33: -> ^( BORNE simpleARi simpleARi )
			{
				dbg.location(237,35);
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:237:35: ^( BORNE simpleARi simpleARi )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(237,37);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BORNE, "BORNE"), root_1);
				dbg.location(237,43);
				adaptor.addChild(root_1, stream_simpleARi.nextTree());dbg.location(237,53);
				adaptor.addChild(root_1, stream_simpleARi.nextTree());
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
		dbg.location(238, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "boundp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:241:1: typedeclaration : ( typeliste | 'ARRAY' arraylist -> ^( 'ARRAY' arraylist ) | procedure -> procedure );
	public final AlgolParser.typedeclaration_return typedeclaration() throws RecognitionException {
		AlgolParser.typedeclaration_return retval = new AlgolParser.typedeclaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal135=null;
		ParserRuleReturnScope typeliste134 =null;
		ParserRuleReturnScope arraylist136 =null;
		ParserRuleReturnScope procedure137 =null;

		CommonTree string_literal135_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleSubtreeStream stream_arraylist=new RewriteRuleSubtreeStream(adaptor,"rule arraylist");
		RewriteRuleSubtreeStream stream_procedure=new RewriteRuleSubtreeStream(adaptor,"rule procedure");

		try { dbg.enterRule(getGrammarFileName(), "typedeclaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(241, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:241:16: ( typeliste | 'ARRAY' arraylist -> ^( 'ARRAY' arraylist ) | procedure -> procedure )
			int alt40=3;
			try { dbg.enterDecision(40, decisionCanBacktrack[40]);

			switch ( input.LA(1) ) {
			case ID:
			case INT:
				{
				alt40=1;
				}
				break;
			case 66:
				{
				alt40=2;
				}
				break;
			case PROCEDURE:
				{
				alt40=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(40);}

			switch (alt40) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:241:18: typeliste
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(241,18);
					pushFollow(FOLLOW_typeliste_in_typedeclaration1519);
					typeliste134=typeliste();
					state._fsp--;

					adaptor.addChild(root_0, typeliste134.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:242:2: 'ARRAY' arraylist
					{
					dbg.location(242,2);
					string_literal135=(Token)match(input,66,FOLLOW_66_in_typedeclaration1522);  
					stream_66.add(string_literal135);
					dbg.location(242,10);
					pushFollow(FOLLOW_arraylist_in_typedeclaration1524);
					arraylist136=arraylist();
					state._fsp--;

					stream_arraylist.add(arraylist136.getTree());
					// AST REWRITE
					// elements: 66, arraylist
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 242:19: -> ^( 'ARRAY' arraylist )
					{
						dbg.location(242,21);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:242:21: ^( 'ARRAY' arraylist )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(242,23);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_66.nextNode(), root_1);
						dbg.location(242,31);
						adaptor.addChild(root_1, stream_arraylist.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:243:2: procedure
					{
					dbg.location(243,2);
					pushFollow(FOLLOW_procedure_in_typedeclaration1533);
					procedure137=procedure();
					state._fsp--;

					stream_procedure.add(procedure137.getTree());
					// AST REWRITE
					// elements: procedure
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 243:11: -> procedure
					{
						dbg.location(243,13);
						adaptor.addChild(root_0, stream_procedure.nextTree());
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
		dbg.location(244, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "typedeclaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:247:1: typedeclaration2 : ( 'ARRAY' arraylist -> ^( 'ARRAY' arraylist ) | procedure -> procedure );
	public final AlgolParser.typedeclaration2_return typedeclaration2() throws RecognitionException {
		AlgolParser.typedeclaration2_return retval = new AlgolParser.typedeclaration2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal138=null;
		ParserRuleReturnScope arraylist139 =null;
		ParserRuleReturnScope procedure140 =null;

		CommonTree string_literal138_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleSubtreeStream stream_arraylist=new RewriteRuleSubtreeStream(adaptor,"rule arraylist");
		RewriteRuleSubtreeStream stream_procedure=new RewriteRuleSubtreeStream(adaptor,"rule procedure");

		try { dbg.enterRule(getGrammarFileName(), "typedeclaration2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(247, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:247:17: ( 'ARRAY' arraylist -> ^( 'ARRAY' arraylist ) | procedure -> procedure )
			int alt41=2;
			try { dbg.enterDecision(41, decisionCanBacktrack[41]);

			int LA41_0 = input.LA(1);
			if ( (LA41_0==66) ) {
				alt41=1;
			}
			else if ( (LA41_0==PROCEDURE) ) {
				alt41=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(41);}

			switch (alt41) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:247:18: 'ARRAY' arraylist
					{
					dbg.location(247,18);
					string_literal138=(Token)match(input,66,FOLLOW_66_in_typedeclaration21543);  
					stream_66.add(string_literal138);
					dbg.location(247,26);
					pushFollow(FOLLOW_arraylist_in_typedeclaration21545);
					arraylist139=arraylist();
					state._fsp--;

					stream_arraylist.add(arraylist139.getTree());
					// AST REWRITE
					// elements: 66, arraylist
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 247:35: -> ^( 'ARRAY' arraylist )
					{
						dbg.location(247,37);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:247:37: ^( 'ARRAY' arraylist )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(247,39);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_66.nextNode(), root_1);
						dbg.location(247,47);
						adaptor.addChild(root_1, stream_arraylist.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:248:2: procedure
					{
					dbg.location(248,2);
					pushFollow(FOLLOW_procedure_in_typedeclaration21554);
					procedure140=procedure();
					state._fsp--;

					stream_procedure.add(procedure140.getTree());
					// AST REWRITE
					// elements: procedure
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 248:11: -> procedure
					{
						dbg.location(248,13);
						adaptor.addChild(root_0, stream_procedure.nextTree());
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
		dbg.location(249, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "typedeclaration2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:251:1: switchdec : 'SWITCH' identifier ':=' switchlist -> ^( 'SWITCH' ^( ASSIGENMENT identifier switchlist ) ) ;
	public final AlgolParser.switchdec_return switchdec() throws RecognitionException {
		AlgolParser.switchdec_return retval = new AlgolParser.switchdec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal141=null;
		Token string_literal143=null;
		ParserRuleReturnScope identifier142 =null;
		ParserRuleReturnScope switchlist144 =null;

		CommonTree string_literal141_tree=null;
		CommonTree string_literal143_tree=null;
		RewriteRuleTokenStream stream_ASSIGENMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGENMENT");
		RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_switchlist=new RewriteRuleSubtreeStream(adaptor,"rule switchlist");

		try { dbg.enterRule(getGrammarFileName(), "switchdec");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(251, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:252:2: ( 'SWITCH' identifier ':=' switchlist -> ^( 'SWITCH' ^( ASSIGENMENT identifier switchlist ) ) )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:252:4: 'SWITCH' identifier ':=' switchlist
			{
			dbg.location(252,4);
			string_literal141=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchdec1566);  
			stream_SWITCH.add(string_literal141);
			dbg.location(252,13);
			pushFollow(FOLLOW_identifier_in_switchdec1568);
			identifier142=identifier();
			state._fsp--;

			stream_identifier.add(identifier142.getTree());dbg.location(252,24);
			string_literal143=(Token)match(input,ASSIGENMENT,FOLLOW_ASSIGENMENT_in_switchdec1570);  
			stream_ASSIGENMENT.add(string_literal143);
			dbg.location(252,29);
			pushFollow(FOLLOW_switchlist_in_switchdec1572);
			switchlist144=switchlist();
			state._fsp--;

			stream_switchlist.add(switchlist144.getTree());
			// AST REWRITE
			// elements: SWITCH, identifier, switchlist
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 252:39: -> ^( 'SWITCH' ^( ASSIGENMENT identifier switchlist ) )
			{
				dbg.location(252,41);
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:252:41: ^( 'SWITCH' ^( ASSIGENMENT identifier switchlist ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(252,43);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_SWITCH.nextNode(), root_1);
				dbg.location(252,52);
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:252:52: ^( ASSIGENMENT identifier switchlist )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				dbg.location(252,54);
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGENMENT, "ASSIGENMENT"), root_2);
				dbg.location(252,66);
				adaptor.addChild(root_2, stream_identifier.nextTree());dbg.location(252,77);
				adaptor.addChild(root_2, stream_switchlist.nextTree());
				adaptor.addChild(root_1, root_2);
				}

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
		dbg.location(253, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "switchdec");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:255:1: switchlist : designExp ( ',' designExp )* -> ( designExp )+ ;
	public final AlgolParser.switchlist_return switchlist() throws RecognitionException {
		AlgolParser.switchlist_return retval = new AlgolParser.switchlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal146=null;
		ParserRuleReturnScope designExp145 =null;
		ParserRuleReturnScope designExp147 =null;

		CommonTree char_literal146_tree=null;
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_designExp=new RewriteRuleSubtreeStream(adaptor,"rule designExp");

		try { dbg.enterRule(getGrammarFileName(), "switchlist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(255, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:256:2: ( designExp ( ',' designExp )* -> ( designExp )+ )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:256:5: designExp ( ',' designExp )*
			{
			dbg.location(256,5);
			pushFollow(FOLLOW_designExp_in_switchlist1598);
			designExp145=designExp();
			state._fsp--;

			stream_designExp.add(designExp145.getTree());dbg.location(256,15);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:256:15: ( ',' designExp )*
			try { dbg.enterSubRule(42);

			loop42:
			while (true) {
				int alt42=2;
				try { dbg.enterDecision(42, decisionCanBacktrack[42]);

				int LA42_0 = input.LA(1);
				if ( (LA42_0==63) ) {
					alt42=1;
				}

				} finally {dbg.exitDecision(42);}

				switch (alt42) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:256:16: ',' designExp
					{
					dbg.location(256,16);
					char_literal146=(Token)match(input,63,FOLLOW_63_in_switchlist1601);  
					stream_63.add(char_literal146);
					dbg.location(256,19);
					pushFollow(FOLLOW_designExp_in_switchlist1602);
					designExp147=designExp();
					state._fsp--;

					stream_designExp.add(designExp147.getTree());
					}
					break;

				default :
					break loop42;
				}
			}
			} finally {dbg.exitSubRule(42);}

			// AST REWRITE
			// elements: designExp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 256:30: -> ( designExp )+
			{
				dbg.location(256,32);
				if ( !(stream_designExp.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_designExp.hasNext() ) {
					dbg.location(256,32);
					adaptor.addChild(root_0, stream_designExp.nextTree());
				}
				stream_designExp.reset();

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
		dbg.location(256, 41);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "switchlist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "switchlist"


	public static class procedure_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "procedure"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:261:2: procedure : 'PROCEDURE' procedurehead statement -> ^( 'PROCEDURE' procedurehead statement ) ;
	public final AlgolParser.procedure_return procedure() throws RecognitionException {
		AlgolParser.procedure_return retval = new AlgolParser.procedure_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal148=null;
		ParserRuleReturnScope procedurehead149 =null;
		ParserRuleReturnScope statement150 =null;

		CommonTree string_literal148_tree=null;
		RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
		RewriteRuleSubtreeStream stream_procedurehead=new RewriteRuleSubtreeStream(adaptor,"rule procedurehead");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try { dbg.enterRule(getGrammarFileName(), "procedure");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(261, 1);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:261:11: ( 'PROCEDURE' procedurehead statement -> ^( 'PROCEDURE' procedurehead statement ) )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:261:13: 'PROCEDURE' procedurehead statement
			{
			dbg.location(261,13);
			string_literal148=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedure1620);  
			stream_PROCEDURE.add(string_literal148);
			dbg.location(261,25);
			pushFollow(FOLLOW_procedurehead_in_procedure1622);
			procedurehead149=procedurehead();
			state._fsp--;

			stream_procedurehead.add(procedurehead149.getTree());dbg.location(261,39);
			pushFollow(FOLLOW_statement_in_procedure1624);
			statement150=statement();
			state._fsp--;

			stream_statement.add(statement150.getTree());
			// AST REWRITE
			// elements: procedurehead, statement, PROCEDURE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 261:48: -> ^( 'PROCEDURE' procedurehead statement )
			{
				dbg.location(261,50);
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:261:50: ^( 'PROCEDURE' procedurehead statement )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(261,52);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);
				dbg.location(261,64);
				adaptor.addChild(root_1, stream_procedurehead.nextTree());dbg.location(261,78);
				adaptor.addChild(root_1, stream_statement.nextTree());
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
		dbg.location(262, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "procedure");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:264:2: procedurehead : identifier formalparameterpart ';' valuepart specificationpart -> identifier formalparameterpart valuepart specificationpart ;
	public final AlgolParser.procedurehead_return procedurehead() throws RecognitionException {
		AlgolParser.procedurehead_return retval = new AlgolParser.procedurehead_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal153=null;
		ParserRuleReturnScope identifier151 =null;
		ParserRuleReturnScope formalparameterpart152 =null;
		ParserRuleReturnScope valuepart154 =null;
		ParserRuleReturnScope specificationpart155 =null;

		CommonTree char_literal153_tree=null;
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_specificationpart=new RewriteRuleSubtreeStream(adaptor,"rule specificationpart");
		RewriteRuleSubtreeStream stream_formalparameterpart=new RewriteRuleSubtreeStream(adaptor,"rule formalparameterpart");
		RewriteRuleSubtreeStream stream_valuepart=new RewriteRuleSubtreeStream(adaptor,"rule valuepart");

		try { dbg.enterRule(getGrammarFileName(), "procedurehead");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(264, 1);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:265:3: ( identifier formalparameterpart ';' valuepart specificationpart -> identifier formalparameterpart valuepart specificationpart )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:265:5: identifier formalparameterpart ';' valuepart specificationpart
			{
			dbg.location(265,5);
			pushFollow(FOLLOW_identifier_in_procedurehead1648);
			identifier151=identifier();
			state._fsp--;

			stream_identifier.add(identifier151.getTree());dbg.location(265,16);
			pushFollow(FOLLOW_formalparameterpart_in_procedurehead1650);
			formalparameterpart152=formalparameterpart();
			state._fsp--;

			stream_formalparameterpart.add(formalparameterpart152.getTree());dbg.location(265,36);
			char_literal153=(Token)match(input,65,FOLLOW_65_in_procedurehead1652);  
			stream_65.add(char_literal153);
			dbg.location(265,40);
			pushFollow(FOLLOW_valuepart_in_procedurehead1654);
			valuepart154=valuepart();
			state._fsp--;

			stream_valuepart.add(valuepart154.getTree());dbg.location(265,50);
			pushFollow(FOLLOW_specificationpart_in_procedurehead1656);
			specificationpart155=specificationpart();
			state._fsp--;

			stream_specificationpart.add(specificationpart155.getTree());
			// AST REWRITE
			// elements: formalparameterpart, valuepart, identifier, specificationpart
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 265:67: -> identifier formalparameterpart valuepart specificationpart
			{
				dbg.location(265,69);
				adaptor.addChild(root_0, stream_identifier.nextTree());dbg.location(265,80);
				adaptor.addChild(root_0, stream_formalparameterpart.nextTree());dbg.location(265,100);
				adaptor.addChild(root_0, stream_valuepart.nextTree());dbg.location(265,110);
				adaptor.addChild(root_0, stream_specificationpart.nextTree());
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
		dbg.location(266, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "procedurehead");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:268:1: formalparameterpart : (| '(' formalparameterlist ')' ( ID ':' '(' formalparameterlist ')' )* -> ^( LISTPARA formalparameterlist ( ^( ID formalparameterlist ) )* ) );
	public final AlgolParser.formalparameterpart_return formalparameterpart() throws RecognitionException {
		AlgolParser.formalparameterpart_return retval = new AlgolParser.formalparameterpart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal156=null;
		Token char_literal158=null;
		Token ID159=null;
		Token char_literal160=null;
		Token char_literal161=null;
		Token char_literal163=null;
		ParserRuleReturnScope formalparameterlist157 =null;
		ParserRuleReturnScope formalparameterlist162 =null;

		CommonTree char_literal156_tree=null;
		CommonTree char_literal158_tree=null;
		CommonTree ID159_tree=null;
		CommonTree char_literal160_tree=null;
		CommonTree char_literal161_tree=null;
		CommonTree char_literal163_tree=null;
		RewriteRuleTokenStream stream_PARENTHESEF=new RewriteRuleTokenStream(adaptor,"token PARENTHESEF");
		RewriteRuleTokenStream stream_PARENTHESEO=new RewriteRuleTokenStream(adaptor,"token PARENTHESEO");
		RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_formalparameterlist=new RewriteRuleSubtreeStream(adaptor,"rule formalparameterlist");

		try { dbg.enterRule(getGrammarFileName(), "formalparameterpart");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(268, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:268:21: (| '(' formalparameterlist ')' ( ID ':' '(' formalparameterlist ')' )* -> ^( LISTPARA formalparameterlist ( ^( ID formalparameterlist ) )* ) )
			int alt44=2;
			try { dbg.enterDecision(44, decisionCanBacktrack[44]);

			int LA44_0 = input.LA(1);
			if ( (LA44_0==65) ) {
				alt44=1;
			}
			else if ( (LA44_0==PARENTHESEO) ) {
				alt44=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(44);}

			switch (alt44) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:269:9: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:269:11: '(' formalparameterlist ')' ( ID ':' '(' formalparameterlist ')' )*
					{
					dbg.location(269,11);
					char_literal156=(Token)match(input,PARENTHESEO,FOLLOW_PARENTHESEO_in_formalparameterpart1687);  
					stream_PARENTHESEO.add(char_literal156);
					dbg.location(269,15);
					pushFollow(FOLLOW_formalparameterlist_in_formalparameterpart1689);
					formalparameterlist157=formalparameterlist();
					state._fsp--;

					stream_formalparameterlist.add(formalparameterlist157.getTree());dbg.location(269,35);
					char_literal158=(Token)match(input,PARENTHESEF,FOLLOW_PARENTHESEF_in_formalparameterpart1691);  
					stream_PARENTHESEF.add(char_literal158);
					dbg.location(269,39);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:269:39: ( ID ':' '(' formalparameterlist ')' )*
					try { dbg.enterSubRule(43);

					loop43:
					while (true) {
						int alt43=2;
						try { dbg.enterDecision(43, decisionCanBacktrack[43]);

						int LA43_0 = input.LA(1);
						if ( (LA43_0==ID) ) {
							alt43=1;
						}

						} finally {dbg.exitDecision(43);}

						switch (alt43) {
						case 1 :
							dbg.enterAlt(1);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:269:40: ID ':' '(' formalparameterlist ')'
							{
							dbg.location(269,40);
							ID159=(Token)match(input,ID,FOLLOW_ID_in_formalparameterpart1694);  
							stream_ID.add(ID159);
							dbg.location(269,43);
							char_literal160=(Token)match(input,BORNE,FOLLOW_BORNE_in_formalparameterpart1696);  
							stream_BORNE.add(char_literal160);
							dbg.location(269,46);
							char_literal161=(Token)match(input,PARENTHESEO,FOLLOW_PARENTHESEO_in_formalparameterpart1697);  
							stream_PARENTHESEO.add(char_literal161);
							dbg.location(269,50);
							pushFollow(FOLLOW_formalparameterlist_in_formalparameterpart1699);
							formalparameterlist162=formalparameterlist();
							state._fsp--;

							stream_formalparameterlist.add(formalparameterlist162.getTree());dbg.location(269,70);
							char_literal163=(Token)match(input,PARENTHESEF,FOLLOW_PARENTHESEF_in_formalparameterpart1701);  
							stream_PARENTHESEF.add(char_literal163);

							}
							break;

						default :
							break loop43;
						}
					}
					} finally {dbg.exitSubRule(43);}

					// AST REWRITE
					// elements: ID, formalparameterlist, formalparameterlist
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 269:75: -> ^( LISTPARA formalparameterlist ( ^( ID formalparameterlist ) )* )
					{
						dbg.location(269,77);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:269:77: ^( LISTPARA formalparameterlist ( ^( ID formalparameterlist ) )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(269,79);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTPARA, "LISTPARA"), root_1);
						dbg.location(269,88);
						adaptor.addChild(root_1, stream_formalparameterlist.nextTree());dbg.location(269,108);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:269:108: ( ^( ID formalparameterlist ) )*
						while ( stream_ID.hasNext()||stream_formalparameterlist.hasNext() ) {
							dbg.location(269,108);
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:269:108: ^( ID formalparameterlist )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							dbg.location(269,110);
							root_2 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_2);
							dbg.location(269,113);
							adaptor.addChild(root_2, stream_formalparameterlist.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_ID.reset();
						stream_formalparameterlist.reset();

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
		dbg.location(270, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "formalparameterpart");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:277:1: specificationpart : specifier identifierlist ';' ( specifier identifierlist ';' )* -> ^( SPECIFICATION ( specifier identifierlist )+ ) ;
	public final AlgolParser.specificationpart_return specificationpart() throws RecognitionException {
		AlgolParser.specificationpart_return retval = new AlgolParser.specificationpart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal166=null;
		Token char_literal169=null;
		ParserRuleReturnScope specifier164 =null;
		ParserRuleReturnScope identifierlist165 =null;
		ParserRuleReturnScope specifier167 =null;
		ParserRuleReturnScope identifierlist168 =null;

		CommonTree char_literal166_tree=null;
		CommonTree char_literal169_tree=null;
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_specifier=new RewriteRuleSubtreeStream(adaptor,"rule specifier");
		RewriteRuleSubtreeStream stream_identifierlist=new RewriteRuleSubtreeStream(adaptor,"rule identifierlist");

		try { dbg.enterRule(getGrammarFileName(), "specificationpart");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(277, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:278:2: ( specifier identifierlist ';' ( specifier identifierlist ';' )* -> ^( SPECIFICATION ( specifier identifierlist )+ ) )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:278:3: specifier identifierlist ';' ( specifier identifierlist ';' )*
			{
			dbg.location(278,3);
			pushFollow(FOLLOW_specifier_in_specificationpart1734);
			specifier164=specifier();
			state._fsp--;

			stream_specifier.add(specifier164.getTree());dbg.location(278,13);
			pushFollow(FOLLOW_identifierlist_in_specificationpart1736);
			identifierlist165=identifierlist();
			state._fsp--;

			stream_identifierlist.add(identifierlist165.getTree());dbg.location(278,28);
			char_literal166=(Token)match(input,65,FOLLOW_65_in_specificationpart1738);  
			stream_65.add(char_literal166);
			dbg.location(278,32);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:278:32: ( specifier identifierlist ';' )*
			try { dbg.enterSubRule(45);

			loop45:
			while (true) {
				int alt45=2;
				try { dbg.enterDecision(45, decisionCanBacktrack[45]);

				int LA45_0 = input.LA(1);
				if ( (LA45_0==LABEL||LA45_0==PROCEDURE||LA45_0==SWITCH||(LA45_0 >= TYPEBOOL && LA45_0 <= TYPEREAL)||LA45_0==66||LA45_0==70) ) {
					alt45=1;
				}

				} finally {dbg.exitDecision(45);}

				switch (alt45) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:278:33: specifier identifierlist ';'
					{
					dbg.location(278,33);
					pushFollow(FOLLOW_specifier_in_specificationpart1741);
					specifier167=specifier();
					state._fsp--;

					stream_specifier.add(specifier167.getTree());dbg.location(278,43);
					pushFollow(FOLLOW_identifierlist_in_specificationpart1743);
					identifierlist168=identifierlist();
					state._fsp--;

					stream_identifierlist.add(identifierlist168.getTree());dbg.location(278,58);
					char_literal169=(Token)match(input,65,FOLLOW_65_in_specificationpart1745);  
					stream_65.add(char_literal169);

					}
					break;

				default :
					break loop45;
				}
			}
			} finally {dbg.exitSubRule(45);}

			// AST REWRITE
			// elements: specifier, identifierlist
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 278:63: -> ^( SPECIFICATION ( specifier identifierlist )+ )
			{
				dbg.location(278,65);
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:278:65: ^( SPECIFICATION ( specifier identifierlist )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(278,67);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPECIFICATION, "SPECIFICATION"), root_1);
				dbg.location(278,81);
				if ( !(stream_specifier.hasNext()||stream_identifierlist.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_specifier.hasNext()||stream_identifierlist.hasNext() ) {
					dbg.location(278,82);
					adaptor.addChild(root_1, stream_specifier.nextTree());dbg.location(278,92);
					adaptor.addChild(root_1, stream_identifierlist.nextTree());
				}
				stream_specifier.reset();
				stream_identifierlist.reset();

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
		dbg.location(280, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "specificationpart");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:282:1: identifierlist : identifier ( ',' identifier )* -> ( identifier )+ ;
	public final AlgolParser.identifierlist_return identifierlist() throws RecognitionException {
		AlgolParser.identifierlist_return retval = new AlgolParser.identifierlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal171=null;
		ParserRuleReturnScope identifier170 =null;
		ParserRuleReturnScope identifier172 =null;

		CommonTree char_literal171_tree=null;
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try { dbg.enterRule(getGrammarFileName(), "identifierlist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(282, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:283:2: ( identifier ( ',' identifier )* -> ( identifier )+ )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:283:4: identifier ( ',' identifier )*
			{
			dbg.location(283,4);
			pushFollow(FOLLOW_identifier_in_identifierlist1772);
			identifier170=identifier();
			state._fsp--;

			stream_identifier.add(identifier170.getTree());dbg.location(283,15);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:283:15: ( ',' identifier )*
			try { dbg.enterSubRule(46);

			loop46:
			while (true) {
				int alt46=2;
				try { dbg.enterDecision(46, decisionCanBacktrack[46]);

				int LA46_0 = input.LA(1);
				if ( (LA46_0==63) ) {
					alt46=1;
				}

				} finally {dbg.exitDecision(46);}

				switch (alt46) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:283:16: ',' identifier
					{
					dbg.location(283,16);
					char_literal171=(Token)match(input,63,FOLLOW_63_in_identifierlist1775);  
					stream_63.add(char_literal171);
					dbg.location(283,19);
					pushFollow(FOLLOW_identifier_in_identifierlist1776);
					identifier172=identifier();
					state._fsp--;

					stream_identifier.add(identifier172.getTree());
					}
					break;

				default :
					break loop46;
				}
			}
			} finally {dbg.exitSubRule(46);}

			// AST REWRITE
			// elements: identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 283:31: -> ( identifier )+
			{
				dbg.location(283,33);
				if ( !(stream_identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_identifier.hasNext() ) {
					dbg.location(283,33);
					adaptor.addChild(root_0, stream_identifier.nextTree());
				}
				stream_identifier.reset();

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
		dbg.location(284, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "identifierlist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:286:1: specifier : ( 'STRING' | type h -> type | 'ARRAY' | 'LABEL' | 'SWITCH' | 'PROCEDURE' );
	public final AlgolParser.specifier_return specifier() throws RecognitionException {
		AlgolParser.specifier_return retval = new AlgolParser.specifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal173=null;
		Token string_literal176=null;
		Token string_literal177=null;
		Token string_literal178=null;
		Token string_literal179=null;
		ParserRuleReturnScope type174 =null;
		ParserRuleReturnScope h175 =null;

		CommonTree string_literal173_tree=null;
		CommonTree string_literal176_tree=null;
		CommonTree string_literal177_tree=null;
		CommonTree string_literal178_tree=null;
		CommonTree string_literal179_tree=null;
		RewriteRuleSubtreeStream stream_h=new RewriteRuleSubtreeStream(adaptor,"rule h");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try { dbg.enterRule(getGrammarFileName(), "specifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(286, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:287:2: ( 'STRING' | type h -> type | 'ARRAY' | 'LABEL' | 'SWITCH' | 'PROCEDURE' )
			int alt47=6;
			try { dbg.enterDecision(47, decisionCanBacktrack[47]);

			switch ( input.LA(1) ) {
			case 70:
				{
				alt47=1;
				}
				break;
			case TYPEBOOL:
			case TYPEINT:
			case TYPEREAL:
				{
				alt47=2;
				}
				break;
			case 66:
				{
				alt47=3;
				}
				break;
			case LABEL:
				{
				alt47=4;
				}
				break;
			case SWITCH:
				{
				alt47=5;
				}
				break;
			case PROCEDURE:
				{
				alt47=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(47);}

			switch (alt47) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:287:3: 'STRING'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(287,3);
					string_literal173=(Token)match(input,70,FOLLOW_70_in_specifier1792); 
					string_literal173_tree = (CommonTree)adaptor.create(string_literal173);
					adaptor.addChild(root_0, string_literal173_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:288:4: type h
					{
					dbg.location(288,4);
					pushFollow(FOLLOW_type_in_specifier1798);
					type174=type();
					state._fsp--;

					stream_type.add(type174.getTree());dbg.location(288,10);
					pushFollow(FOLLOW_h_in_specifier1801);
					h175=h();
					state._fsp--;

					stream_h.add(h175.getTree());
					// AST REWRITE
					// elements: type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 288:11: -> type
					{
						dbg.location(288,13);
						adaptor.addChild(root_0, stream_type.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:289:4: 'ARRAY'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(289,4);
					string_literal176=(Token)match(input,66,FOLLOW_66_in_specifier1808); 
					string_literal176_tree = (CommonTree)adaptor.create(string_literal176);
					adaptor.addChild(root_0, string_literal176_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:290:4: 'LABEL'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(290,4);
					string_literal177=(Token)match(input,LABEL,FOLLOW_LABEL_in_specifier1814); 
					string_literal177_tree = (CommonTree)adaptor.create(string_literal177);
					adaptor.addChild(root_0, string_literal177_tree);

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:292:4: 'SWITCH'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(292,4);
					string_literal178=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_specifier1822); 
					string_literal178_tree = (CommonTree)adaptor.create(string_literal178);
					adaptor.addChild(root_0, string_literal178_tree);

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:292:15: 'PROCEDURE'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(292,15);
					string_literal179=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_specifier1826); 
					string_literal179_tree = (CommonTree)adaptor.create(string_literal179);
					adaptor.addChild(root_0, string_literal179_tree);

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
		dbg.location(293, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "specifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:295:1: h : (| 'ARRAY' | 'PROCEDURE' | 'INTEGER' );
	public final AlgolParser.h_return h() throws RecognitionException {
		AlgolParser.h_return retval = new AlgolParser.h_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal180=null;
		Token string_literal181=null;
		Token string_literal182=null;

		CommonTree string_literal180_tree=null;
		CommonTree string_literal181_tree=null;
		CommonTree string_literal182_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "h");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(295, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:295:3: (| 'ARRAY' | 'PROCEDURE' | 'INTEGER' )
			int alt48=4;
			try { dbg.enterDecision(48, decisionCanBacktrack[48]);

			switch ( input.LA(1) ) {
			case ID:
			case INT:
				{
				alt48=1;
				}
				break;
			case 66:
				{
				alt48=2;
				}
				break;
			case PROCEDURE:
				{
				alt48=3;
				}
				break;
			case TYPEINT:
				{
				alt48=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(48);}

			switch (alt48) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:295:5: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:295:7: 'ARRAY'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(295,7);
					string_literal180=(Token)match(input,66,FOLLOW_66_in_h1839); 
					string_literal180_tree = (CommonTree)adaptor.create(string_literal180);
					adaptor.addChild(root_0, string_literal180_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:295:16: 'PROCEDURE'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(295,16);
					string_literal181=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_h1842); 
					string_literal181_tree = (CommonTree)adaptor.create(string_literal181);
					adaptor.addChild(root_0, string_literal181_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:295:28: 'INTEGER'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(295,28);
					string_literal182=(Token)match(input,TYPEINT,FOLLOW_TYPEINT_in_h1844); 
					string_literal182_tree = (CommonTree)adaptor.create(string_literal182);
					adaptor.addChild(root_0, string_literal182_tree);

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
		dbg.location(296, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "h");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:298:1: formalparameterlist : formalpara ( ',' formalpara )* -> ( formalpara )+ ;
	public final AlgolParser.formalparameterlist_return formalparameterlist() throws RecognitionException {
		AlgolParser.formalparameterlist_return retval = new AlgolParser.formalparameterlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal184=null;
		ParserRuleReturnScope formalpara183 =null;
		ParserRuleReturnScope formalpara185 =null;

		CommonTree char_literal184_tree=null;
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_formalpara=new RewriteRuleSubtreeStream(adaptor,"rule formalpara");

		try { dbg.enterRule(getGrammarFileName(), "formalparameterlist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(298, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:299:2: ( formalpara ( ',' formalpara )* -> ( formalpara )+ )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:299:4: formalpara ( ',' formalpara )*
			{
			dbg.location(299,4);
			pushFollow(FOLLOW_formalpara_in_formalparameterlist1856);
			formalpara183=formalpara();
			state._fsp--;

			stream_formalpara.add(formalpara183.getTree());dbg.location(299,15);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:299:15: ( ',' formalpara )*
			try { dbg.enterSubRule(49);

			loop49:
			while (true) {
				int alt49=2;
				try { dbg.enterDecision(49, decisionCanBacktrack[49]);

				int LA49_0 = input.LA(1);
				if ( (LA49_0==63) ) {
					alt49=1;
				}

				} finally {dbg.exitDecision(49);}

				switch (alt49) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:299:16: ',' formalpara
					{
					dbg.location(299,16);
					char_literal184=(Token)match(input,63,FOLLOW_63_in_formalparameterlist1859);  
					stream_63.add(char_literal184);
					dbg.location(299,20);
					pushFollow(FOLLOW_formalpara_in_formalparameterlist1861);
					formalpara185=formalpara();
					state._fsp--;

					stream_formalpara.add(formalpara185.getTree());
					}
					break;

				default :
					break loop49;
				}
			}
			} finally {dbg.exitSubRule(49);}

			// AST REWRITE
			// elements: formalpara
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 299:32: -> ( formalpara )+
			{
				dbg.location(299,34);
				if ( !(stream_formalpara.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_formalpara.hasNext() ) {
					dbg.location(299,34);
					adaptor.addChild(root_0, stream_formalpara.nextTree());
				}
				stream_formalpara.reset();

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
		dbg.location(300, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "formalparameterlist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "formalparameterlist"


	public static class formalpara_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "formalpara"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:306:1: formalpara : expression2 -> expression2 ;
	public final AlgolParser.formalpara_return formalpara() throws RecognitionException {
		AlgolParser.formalpara_return retval = new AlgolParser.formalpara_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression2186 =null;

		RewriteRuleSubtreeStream stream_expression2=new RewriteRuleSubtreeStream(adaptor,"rule expression2");

		try { dbg.enterRule(getGrammarFileName(), "formalpara");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(306, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:307:2: ( expression2 -> expression2 )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:307:4: expression2
			{
			dbg.location(307,4);
			pushFollow(FOLLOW_expression2_in_formalpara1881);
			expression2186=expression2();
			state._fsp--;

			stream_expression2.add(expression2186.getTree());
			// AST REWRITE
			// elements: expression2
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 307:15: -> expression2
			{
				dbg.location(307,17);
				adaptor.addChild(root_0, stream_expression2.nextTree());
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
		dbg.location(308, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "formalpara");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "formalpara"


	public static class valuepart_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "valuepart"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:314:1: valuepart : ( 'VALUE' identifier2 -> ^( 'VALUE' identifier2 ) |);
	public final AlgolParser.valuepart_return valuepart() throws RecognitionException {
		AlgolParser.valuepart_return retval = new AlgolParser.valuepart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal187=null;
		ParserRuleReturnScope identifier2188 =null;

		CommonTree string_literal187_tree=null;
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleSubtreeStream stream_identifier2=new RewriteRuleSubtreeStream(adaptor,"rule identifier2");

		try { dbg.enterRule(getGrammarFileName(), "valuepart");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(314, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:314:11: ( 'VALUE' identifier2 -> ^( 'VALUE' identifier2 ) |)
			int alt50=2;
			try { dbg.enterDecision(50, decisionCanBacktrack[50]);

			int LA50_0 = input.LA(1);
			if ( (LA50_0==71) ) {
				alt50=1;
			}
			else if ( (LA50_0==LABEL||LA50_0==PROCEDURE||LA50_0==SWITCH||(LA50_0 >= TYPEBOOL && LA50_0 <= TYPEREAL)||LA50_0==66||LA50_0==70) ) {
				alt50=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(50);}

			switch (alt50) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:314:12: 'VALUE' identifier2
					{
					dbg.location(314,12);
					string_literal187=(Token)match(input,71,FOLLOW_71_in_valuepart1908);  
					stream_71.add(string_literal187);
					dbg.location(314,20);
					pushFollow(FOLLOW_identifier2_in_valuepart1910);
					identifier2188=identifier2();
					state._fsp--;

					stream_identifier2.add(identifier2188.getTree());
					// AST REWRITE
					// elements: 71, identifier2
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 314:32: -> ^( 'VALUE' identifier2 )
					{
						dbg.location(314,34);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:314:34: ^( 'VALUE' identifier2 )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(314,36);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_71.nextNode(), root_1);
						dbg.location(314,44);
						adaptor.addChild(root_1, stream_identifier2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:316:11: 
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
		dbg.location(316, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "valuepart");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "valuepart"


	public static class identifier2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "identifier2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:318:1: identifier2 : ID ( ',' ID )* -> ( ID )* ;
	public final AlgolParser.identifier2_return identifier2() throws RecognitionException {
		AlgolParser.identifier2_return retval = new AlgolParser.identifier2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID189=null;
		Token char_literal190=null;
		Token ID191=null;

		CommonTree ID189_tree=null;
		CommonTree char_literal190_tree=null;
		CommonTree ID191_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");

		try { dbg.enterRule(getGrammarFileName(), "identifier2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(318, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:319:2: ( ID ( ',' ID )* -> ( ID )* )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:319:4: ID ( ',' ID )*
			{
			dbg.location(319,4);
			ID189=(Token)match(input,ID,FOLLOW_ID_in_identifier21939);  
			stream_ID.add(ID189);
			dbg.location(319,6);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:319:6: ( ',' ID )*
			try { dbg.enterSubRule(51);

			loop51:
			while (true) {
				int alt51=2;
				try { dbg.enterDecision(51, decisionCanBacktrack[51]);

				int LA51_0 = input.LA(1);
				if ( (LA51_0==63) ) {
					alt51=1;
				}

				} finally {dbg.exitDecision(51);}

				switch (alt51) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:319:7: ',' ID
					{
					dbg.location(319,7);
					char_literal190=(Token)match(input,63,FOLLOW_63_in_identifier21941);  
					stream_63.add(char_literal190);
					dbg.location(319,10);
					ID191=(Token)match(input,ID,FOLLOW_ID_in_identifier21942);  
					stream_ID.add(ID191);

					}
					break;

				default :
					break loop51;
				}
			}
			} finally {dbg.exitSubRule(51);}

			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 319:14: -> ( ID )*
			{
				dbg.location(319,16);
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:319:16: ( ID )*
				while ( stream_ID.hasNext() ) {
					dbg.location(319,16);
					adaptor.addChild(root_0, stream_ID.nextNode());
				}
				stream_ID.reset();

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
		dbg.location(320, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "identifier2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "identifier2"


	public static class designExp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "designExp"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:323:1: designExp : ( simpleDesign | 'IF' expression 'THEN' simpleDesign 'ELSE' designExp );
	public final AlgolParser.designExp_return designExp() throws RecognitionException {
		AlgolParser.designExp_return retval = new AlgolParser.designExp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal193=null;
		Token string_literal195=null;
		Token string_literal197=null;
		ParserRuleReturnScope simpleDesign192 =null;
		ParserRuleReturnScope expression194 =null;
		ParserRuleReturnScope simpleDesign196 =null;
		ParserRuleReturnScope designExp198 =null;

		CommonTree string_literal193_tree=null;
		CommonTree string_literal195_tree=null;
		CommonTree string_literal197_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "designExp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(323, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:324:2: ( simpleDesign | 'IF' expression 'THEN' simpleDesign 'ELSE' designExp )
			int alt52=2;
			try { dbg.enterDecision(52, decisionCanBacktrack[52]);

			int LA52_0 = input.LA(1);
			if ( (LA52_0==EOF||LA52_0==ELSE||LA52_0==ID||LA52_0==INT||(LA52_0 >= PARENTHESEF && LA52_0 <= PARENTHESEO)||LA52_0==63||LA52_0==65||LA52_0==68) ) {
				alt52=1;
			}
			else if ( (LA52_0==IF) ) {
				alt52=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(52);}

			switch (alt52) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:324:4: simpleDesign
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(324,4);
					pushFollow(FOLLOW_simpleDesign_in_designExp1962);
					simpleDesign192=simpleDesign();
					state._fsp--;

					adaptor.addChild(root_0, simpleDesign192.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:325:3: 'IF' expression 'THEN' simpleDesign 'ELSE' designExp
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(325,3);
					string_literal193=(Token)match(input,IF,FOLLOW_IF_in_designExp1966); 
					string_literal193_tree = (CommonTree)adaptor.create(string_literal193);
					adaptor.addChild(root_0, string_literal193_tree);
					dbg.location(325,8);
					pushFollow(FOLLOW_expression_in_designExp1968);
					expression194=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression194.getTree());
					dbg.location(325,19);
					string_literal195=(Token)match(input,THEN,FOLLOW_THEN_in_designExp1970); 
					string_literal195_tree = (CommonTree)adaptor.create(string_literal195);
					adaptor.addChild(root_0, string_literal195_tree);
					dbg.location(325,26);
					pushFollow(FOLLOW_simpleDesign_in_designExp1972);
					simpleDesign196=simpleDesign();
					state._fsp--;

					adaptor.addChild(root_0, simpleDesign196.getTree());
					dbg.location(325,39);
					string_literal197=(Token)match(input,ELSE,FOLLOW_ELSE_in_designExp1974); 
					string_literal197_tree = (CommonTree)adaptor.create(string_literal197);
					adaptor.addChild(root_0, string_literal197_tree);
					dbg.location(325,46);
					pushFollow(FOLLOW_designExp_in_designExp1976);
					designExp198=designExp();
					state._fsp--;

					adaptor.addChild(root_0, designExp198.getTree());

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
		dbg.location(326, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "designExp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:328:1: simpleDesign : (| identifier | '(' designExp ')' );
	public final AlgolParser.simpleDesign_return simpleDesign() throws RecognitionException {
		AlgolParser.simpleDesign_return retval = new AlgolParser.simpleDesign_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal200=null;
		Token char_literal202=null;
		ParserRuleReturnScope identifier199 =null;
		ParserRuleReturnScope designExp201 =null;

		CommonTree char_literal200_tree=null;
		CommonTree char_literal202_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "simpleDesign");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(328, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:329:2: (| identifier | '(' designExp ')' )
			int alt53=3;
			try { dbg.enterDecision(53, decisionCanBacktrack[53]);

			switch ( input.LA(1) ) {
			case EOF:
			case ELSE:
			case PARENTHESEF:
			case 63:
			case 65:
			case 68:
				{
				alt53=1;
				}
				break;
			case ID:
			case INT:
				{
				alt53=2;
				}
				break;
			case PARENTHESEO:
				{
				alt53=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(53);}

			switch (alt53) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:330:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:330:3: identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(330,3);
					pushFollow(FOLLOW_identifier_in_simpleDesign1991);
					identifier199=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier199.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:331:3: '(' designExp ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(331,3);
					char_literal200=(Token)match(input,PARENTHESEO,FOLLOW_PARENTHESEO_in_simpleDesign1996); 
					char_literal200_tree = (CommonTree)adaptor.create(char_literal200);
					adaptor.addChild(root_0, char_literal200_tree);
					dbg.location(331,7);
					pushFollow(FOLLOW_designExp_in_simpleDesign1998);
					designExp201=designExp();
					state._fsp--;

					adaptor.addChild(root_0, designExp201.getTree());
					dbg.location(331,17);
					char_literal202=(Token)match(input,PARENTHESEF,FOLLOW_PARENTHESEF_in_simpleDesign2000); 
					char_literal202_tree = (CommonTree)adaptor.create(char_literal202);
					adaptor.addChild(root_0, char_literal202_tree);

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
		dbg.location(332, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "simpleDesign");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "simpleDesign"


	public static class declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:338:1: declaration : ( localorown typedeclaration | typedeclaration2 -> typedeclaration2 | switchdec -> switchdec );
	public final AlgolParser.declaration_return declaration() throws RecognitionException {
		AlgolParser.declaration_return retval = new AlgolParser.declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope localorown203 =null;
		ParserRuleReturnScope typedeclaration204 =null;
		ParserRuleReturnScope typedeclaration2205 =null;
		ParserRuleReturnScope switchdec206 =null;

		RewriteRuleSubtreeStream stream_switchdec=new RewriteRuleSubtreeStream(adaptor,"rule switchdec");
		RewriteRuleSubtreeStream stream_typedeclaration2=new RewriteRuleSubtreeStream(adaptor,"rule typedeclaration2");

		try { dbg.enterRule(getGrammarFileName(), "declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(338, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:339:2: ( localorown typedeclaration | typedeclaration2 -> typedeclaration2 | switchdec -> switchdec )
			int alt54=3;
			try { dbg.enterDecision(54, decisionCanBacktrack[54]);

			switch ( input.LA(1) ) {
			case LOCAL:
			case TYPEBOOL:
			case TYPEINT:
			case TYPEREAL:
				{
				alt54=1;
				}
				break;
			case PROCEDURE:
			case 66:
				{
				alt54=2;
				}
				break;
			case SWITCH:
				{
				alt54=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(54);}

			switch (alt54) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:339:4: localorown typedeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(339,4);
					pushFollow(FOLLOW_localorown_in_declaration2033);
					localorown203=localorown();
					state._fsp--;

					adaptor.addChild(root_0, localorown203.getTree());
					dbg.location(339,15);
					pushFollow(FOLLOW_typedeclaration_in_declaration2035);
					typedeclaration204=typedeclaration();
					state._fsp--;

					adaptor.addChild(root_0, typedeclaration204.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:340:16: typedeclaration2
					{
					dbg.location(340,16);
					pushFollow(FOLLOW_typedeclaration2_in_declaration2052);
					typedeclaration2205=typedeclaration2();
					state._fsp--;

					stream_typedeclaration2.add(typedeclaration2205.getTree());
					// AST REWRITE
					// elements: typedeclaration2
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 340:32: -> typedeclaration2
					{
						dbg.location(340,34);
						adaptor.addChild(root_0, stream_typedeclaration2.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:341:15: switchdec
					{
					dbg.location(341,15);
					pushFollow(FOLLOW_switchdec_in_declaration2070);
					switchdec206=switchdec();
					state._fsp--;

					stream_switchdec.add(switchdec206.getTree());
					// AST REWRITE
					// elements: switchdec
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 341:24: -> switchdec
					{
						dbg.location(341,26);
						adaptor.addChild(root_0, stream_switchdec.nextTree());
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
		dbg.location(342, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:343:1: begin : 'BEGIN' d -> ^( BEGIN d ) ;
	public final AlgolParser.begin_return begin() throws RecognitionException {
		AlgolParser.begin_return retval = new AlgolParser.begin_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal207=null;
		ParserRuleReturnScope d208 =null;

		CommonTree string_literal207_tree=null;
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleSubtreeStream stream_d=new RewriteRuleSubtreeStream(adaptor,"rule d");

		try { dbg.enterRule(getGrammarFileName(), "begin");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(343, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:343:7: ( 'BEGIN' d -> ^( BEGIN d ) )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:343:9: 'BEGIN' d
			{
			dbg.location(343,9);
			string_literal207=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin2081);  
			stream_BEGIN.add(string_literal207);
			dbg.location(343,17);
			pushFollow(FOLLOW_d_in_begin2083);
			d208=d();
			state._fsp--;

			stream_d.add(d208.getTree());
			// AST REWRITE
			// elements: d
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 343:18: -> ^( BEGIN d )
			{
				dbg.location(343,20);
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:343:20: ^( BEGIN d )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(343,22);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BEGIN, "BEGIN"), root_1);
				dbg.location(343,28);
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
		dbg.location(344, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "begin");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:347:1: compoundT : statement c -> statement c ;
	public final AlgolParser.compoundT_return compoundT() throws RecognitionException {
		AlgolParser.compoundT_return retval = new AlgolParser.compoundT_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope statement209 =null;
		ParserRuleReturnScope c210 =null;

		RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try { dbg.enterRule(getGrammarFileName(), "compoundT");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(347, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:348:2: ( statement c -> statement c )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:348:4: statement c
			{
			dbg.location(348,4);
			pushFollow(FOLLOW_statement_in_compoundT2109);
			statement209=statement();
			state._fsp--;

			stream_statement.add(statement209.getTree());dbg.location(348,14);
			pushFollow(FOLLOW_c_in_compoundT2111);
			c210=c();
			state._fsp--;

			stream_c.add(c210.getTree());
			// AST REWRITE
			// elements: statement, c
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 348:15: -> statement c
			{
				dbg.location(348,17);
				adaptor.addChild(root_0, stream_statement.nextTree());dbg.location(348,27);
				adaptor.addChild(root_0, stream_c.nextTree());
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
		dbg.location(349, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "compoundT");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:350:1: c : ( 'END' -> 'END' | ';' compoundT -> compoundT );
	public final AlgolParser.c_return c() throws RecognitionException {
		AlgolParser.c_return retval = new AlgolParser.c_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal211=null;
		Token char_literal212=null;
		ParserRuleReturnScope compoundT213 =null;

		CommonTree string_literal211_tree=null;
		CommonTree char_literal212_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_compoundT=new RewriteRuleSubtreeStream(adaptor,"rule compoundT");

		try { dbg.enterRule(getGrammarFileName(), "c");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(350, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:350:3: ( 'END' -> 'END' | ';' compoundT -> compoundT )
			int alt55=2;
			try { dbg.enterDecision(55, decisionCanBacktrack[55]);

			int LA55_0 = input.LA(1);
			if ( (LA55_0==68) ) {
				alt55=1;
			}
			else if ( (LA55_0==65) ) {
				alt55=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(55);}

			switch (alt55) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:350:6: 'END'
					{
					dbg.location(350,6);
					string_literal211=(Token)match(input,68,FOLLOW_68_in_c2125);  
					stream_68.add(string_literal211);

					// AST REWRITE
					// elements: 68
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 350:11: -> 'END'
					{
						dbg.location(350,13);
						adaptor.addChild(root_0, stream_68.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:350:19: ';' compoundT
					{
					dbg.location(350,19);
					char_literal212=(Token)match(input,65,FOLLOW_65_in_c2129);  
					stream_65.add(char_literal212);
					dbg.location(350,23);
					pushFollow(FOLLOW_compoundT_in_c2131);
					compoundT213=compoundT();
					state._fsp--;

					stream_compoundT.add(compoundT213.getTree());
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
					// 350:32: -> compoundT
					{
						dbg.location(350,34);
						adaptor.addChild(root_0, stream_compoundT.nextTree());
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
		dbg.location(351, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "c");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:353:1: statement : ( memoire -> memoire | gotostatement -> gotostatement | comment | 'IF' expression 'THEN' j -> ^( IF expression ^( THEN j ) ) | 'FOR' simpleARi ':=' forlist 'DO' statement -> ^( FOR ^( ASSIGENMENT simpleARi ^( LISTFOR forlist ) ) ^( 'DO' statement ) ) | begin -> begin | actualparametrepart );
	public final AlgolParser.statement_return statement() throws RecognitionException {
		AlgolParser.statement_return retval = new AlgolParser.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal217=null;
		Token string_literal219=null;
		Token string_literal221=null;
		Token string_literal223=null;
		Token string_literal225=null;
		ParserRuleReturnScope memoire214 =null;
		ParserRuleReturnScope gotostatement215 =null;
		ParserRuleReturnScope comment216 =null;
		ParserRuleReturnScope expression218 =null;
		ParserRuleReturnScope j220 =null;
		ParserRuleReturnScope simpleARi222 =null;
		ParserRuleReturnScope forlist224 =null;
		ParserRuleReturnScope statement226 =null;
		ParserRuleReturnScope begin227 =null;
		ParserRuleReturnScope actualparametrepart228 =null;

		CommonTree string_literal217_tree=null;
		CommonTree string_literal219_tree=null;
		CommonTree string_literal221_tree=null;
		CommonTree string_literal223_tree=null;
		CommonTree string_literal225_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_ASSIGENMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGENMENT");
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_gotostatement=new RewriteRuleSubtreeStream(adaptor,"rule gotostatement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_memoire=new RewriteRuleSubtreeStream(adaptor,"rule memoire");
		RewriteRuleSubtreeStream stream_simpleARi=new RewriteRuleSubtreeStream(adaptor,"rule simpleARi");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_forlist=new RewriteRuleSubtreeStream(adaptor,"rule forlist");
		RewriteRuleSubtreeStream stream_j=new RewriteRuleSubtreeStream(adaptor,"rule j");
		RewriteRuleSubtreeStream stream_begin=new RewriteRuleSubtreeStream(adaptor,"rule begin");

		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(353, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:354:2: ( memoire -> memoire | gotostatement -> gotostatement | comment | 'IF' expression 'THEN' j -> ^( IF expression ^( THEN j ) ) | 'FOR' simpleARi ':=' forlist 'DO' statement -> ^( FOR ^( ASSIGENMENT simpleARi ^( LISTFOR forlist ) ) ^( 'DO' statement ) ) | begin -> begin | actualparametrepart )
			int alt56=7;
			try { dbg.enterDecision(56, decisionCanBacktrack[56]);

			switch ( input.LA(1) ) {
			case ID:
				{
				alt56=1;
				}
				break;
			case GOTO:
				{
				alt56=2;
				}
				break;
			case COMMENT2:
				{
				alt56=3;
				}
				break;
			case IF:
				{
				alt56=4;
				}
				break;
			case FOR:
				{
				alt56=5;
				}
				break;
			case BEGIN:
				{
				alt56=6;
				}
				break;
			case PARENTHESEO:
				{
				alt56=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(56);}

			switch (alt56) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:356:3: memoire
					{
					dbg.location(356,3);
					pushFollow(FOLLOW_memoire_in_statement2151);
					memoire214=memoire();
					state._fsp--;

					stream_memoire.add(memoire214.getTree());
					// AST REWRITE
					// elements: memoire
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 356:10: -> memoire
					{
						dbg.location(356,12);
						adaptor.addChild(root_0, stream_memoire.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:357:3: gotostatement
					{
					dbg.location(357,3);
					pushFollow(FOLLOW_gotostatement_in_statement2157);
					gotostatement215=gotostatement();
					state._fsp--;

					stream_gotostatement.add(gotostatement215.getTree());
					// AST REWRITE
					// elements: gotostatement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 357:16: -> gotostatement
					{
						dbg.location(357,18);
						adaptor.addChild(root_0, stream_gotostatement.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:358:3: comment
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(358,3);
					pushFollow(FOLLOW_comment_in_statement2163);
					comment216=comment();
					state._fsp--;

					adaptor.addChild(root_0, comment216.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:359:3: 'IF' expression 'THEN' j
					{
					dbg.location(359,3);
					string_literal217=(Token)match(input,IF,FOLLOW_IF_in_statement2167);  
					stream_IF.add(string_literal217);
					dbg.location(359,8);
					pushFollow(FOLLOW_expression_in_statement2169);
					expression218=expression();
					state._fsp--;

					stream_expression.add(expression218.getTree());dbg.location(359,19);
					string_literal219=(Token)match(input,THEN,FOLLOW_THEN_in_statement2171);  
					stream_THEN.add(string_literal219);
					dbg.location(359,26);
					pushFollow(FOLLOW_j_in_statement2173);
					j220=j();
					state._fsp--;

					stream_j.add(j220.getTree());
					// AST REWRITE
					// elements: j, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 359:27: -> ^( IF expression ^( THEN j ) )
					{
						dbg.location(359,29);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:359:29: ^( IF expression ^( THEN j ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(359,31);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);
						dbg.location(359,34);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(359,45);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:359:45: ^( THEN j )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(359,47);
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THEN, "THEN"), root_2);
						dbg.location(359,52);
						adaptor.addChild(root_2, stream_j.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:360:3: 'FOR' simpleARi ':=' forlist 'DO' statement
					{
					dbg.location(360,3);
					string_literal221=(Token)match(input,FOR,FOLLOW_FOR_in_statement2189);  
					stream_FOR.add(string_literal221);
					dbg.location(360,9);
					pushFollow(FOLLOW_simpleARi_in_statement2191);
					simpleARi222=simpleARi();
					state._fsp--;

					stream_simpleARi.add(simpleARi222.getTree());dbg.location(360,19);
					string_literal223=(Token)match(input,ASSIGENMENT,FOLLOW_ASSIGENMENT_in_statement2193);  
					stream_ASSIGENMENT.add(string_literal223);
					dbg.location(360,24);
					pushFollow(FOLLOW_forlist_in_statement2195);
					forlist224=forlist();
					state._fsp--;

					stream_forlist.add(forlist224.getTree());dbg.location(360,32);
					string_literal225=(Token)match(input,67,FOLLOW_67_in_statement2197);  
					stream_67.add(string_literal225);
					dbg.location(360,37);
					pushFollow(FOLLOW_statement_in_statement2199);
					statement226=statement();
					state._fsp--;

					stream_statement.add(statement226.getTree());
					// AST REWRITE
					// elements: statement, 67, simpleARi, forlist
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 360:46: -> ^( FOR ^( ASSIGENMENT simpleARi ^( LISTFOR forlist ) ) ^( 'DO' statement ) )
					{
						dbg.location(360,48);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:360:48: ^( FOR ^( ASSIGENMENT simpleARi ^( LISTFOR forlist ) ) ^( 'DO' statement ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(360,50);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);
						dbg.location(360,54);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:360:54: ^( ASSIGENMENT simpleARi ^( LISTFOR forlist ) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(360,56);
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGENMENT, "ASSIGENMENT"), root_2);
						dbg.location(360,68);
						adaptor.addChild(root_2, stream_simpleARi.nextTree());dbg.location(360,78);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:360:78: ^( LISTFOR forlist )
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						dbg.location(360,80);
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTFOR, "LISTFOR"), root_3);
						dbg.location(360,88);
						adaptor.addChild(root_3, stream_forlist.nextTree());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(360,98);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:360:98: ^( 'DO' statement )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(360,100);
						root_2 = (CommonTree)adaptor.becomeRoot(stream_67.nextNode(), root_2);
						dbg.location(360,105);
						adaptor.addChild(root_2, stream_statement.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:361:3: begin
					{
					dbg.location(361,3);
					pushFollow(FOLLOW_begin_in_statement2225);
					begin227=begin();
					state._fsp--;

					stream_begin.add(begin227.getTree());
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
					// 361:8: -> begin
					{
						dbg.location(361,10);
						adaptor.addChild(root_0, stream_begin.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:362:3: actualparametrepart
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(362,3);
					pushFollow(FOLLOW_actualparametrepart_in_statement2231);
					actualparametrepart228=actualparametrepart();
					state._fsp--;

					adaptor.addChild(root_0, actualparametrepart228.getTree());

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
		dbg.location(363, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "statement"


	public static class memoire_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "memoire"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:365:1: memoire : ID ( -> ID ) rs -> rs ;
	public final AlgolParser.memoire_return memoire() throws RecognitionException {
		AlgolParser.memoire_return retval = new AlgolParser.memoire_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID229=null;
		ParserRuleReturnScope rs230 =null;

		CommonTree ID229_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_rs=new RewriteRuleSubtreeStream(adaptor,"rule rs");

		try { dbg.enterRule(getGrammarFileName(), "memoire");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(365, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:365:9: ( ID ( -> ID ) rs -> rs )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:365:10: ID ( -> ID ) rs
			{
			dbg.location(365,10);
			ID229=(Token)match(input,ID,FOLLOW_ID_in_memoire2241);  
			stream_ID.add(ID229);
			dbg.location(365,12);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:365:12: ( -> ID )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:365:13: 
			{
			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 365:13: -> ID
			{
				dbg.location(365,15);
				adaptor.addChild(root_0, stream_ID.nextNode());
			}


			retval.tree = root_0;

			}
			dbg.location(365,19);
			Idmemoire=retval.tree;dbg.location(365,46);
			pushFollow(FOLLOW_rs_in_memoire2249);
			rs230=rs();
			state._fsp--;

			stream_rs.add(rs230.getTree());
			// AST REWRITE
			// elements: rs
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 365:48: -> rs
			{
				dbg.location(365,51);
				adaptor.addChild(root_0, stream_rs.nextTree());
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
		dbg.location(366, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "memoire");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "memoire"


	public static class comment_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "comment"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:368:1: comment : COMMENT2 ;
	public final AlgolParser.comment_return comment() throws RecognitionException {
		AlgolParser.comment_return retval = new AlgolParser.comment_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMENT2231=null;

		CommonTree COMMENT2231_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(368, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:368:9: ( COMMENT2 )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:368:10: COMMENT2
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(368,10);
			COMMENT2231=(Token)match(input,COMMENT2,FOLLOW_COMMENT2_in_comment2262); 
			COMMENT2231_tree = (CommonTree)adaptor.create(COMMENT2231);
			adaptor.addChild(root_0, COMMENT2231_tree);

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
		dbg.location(369, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "comment"


	public static class rs_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rs"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:371:1: rs : ( ( ->) ':=' simpleAR -> ^( ASSIGENMENT $rs simpleAR ) | actualparametrepart2 | ( ->) '[' expression ( ',' expression )* ']' ':=' simpleAR -> ^( ASSIGENMENT ^( ARRAYACCESS $rs ( expression )+ ) simpleAR ) | ( ->) ':' m -> m );
	public final AlgolParser.rs_return rs() throws RecognitionException {
		AlgolParser.rs_return retval = new AlgolParser.rs_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal232=null;
		Token char_literal235=null;
		Token char_literal237=null;
		Token char_literal239=null;
		Token string_literal240=null;
		Token char_literal242=null;
		ParserRuleReturnScope simpleAR233 =null;
		ParserRuleReturnScope actualparametrepart2234 =null;
		ParserRuleReturnScope expression236 =null;
		ParserRuleReturnScope expression238 =null;
		ParserRuleReturnScope simpleAR241 =null;
		ParserRuleReturnScope m243 =null;

		CommonTree string_literal232_tree=null;
		CommonTree char_literal235_tree=null;
		CommonTree char_literal237_tree=null;
		CommonTree char_literal239_tree=null;
		CommonTree string_literal240_tree=null;
		CommonTree char_literal242_tree=null;
		RewriteRuleTokenStream stream_ASSIGENMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGENMENT");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_simpleAR=new RewriteRuleSubtreeStream(adaptor,"rule simpleAR");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m");

		try { dbg.enterRule(getGrammarFileName(), "rs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(371, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:371:4: ( ( ->) ':=' simpleAR -> ^( ASSIGENMENT $rs simpleAR ) | actualparametrepart2 | ( ->) '[' expression ( ',' expression )* ']' ':=' simpleAR -> ^( ASSIGENMENT ^( ARRAYACCESS $rs ( expression )+ ) simpleAR ) | ( ->) ':' m -> m )
			int alt58=4;
			try { dbg.enterDecision(58, decisionCanBacktrack[58]);

			switch ( input.LA(1) ) {
			case ASSIGENMENT:
				{
				alt58=1;
				}
				break;
			case EOF:
			case PARENTHESEO:
			case 65:
			case 68:
				{
				alt58=2;
				}
				break;
			case 72:
				{
				alt58=3;
				}
				break;
			case BORNE:
				{
				alt58=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(58);}

			switch (alt58) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:371:6: ( ->) ':=' simpleAR
					{
					dbg.location(371,6);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:371:6: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:371:7: 
					{
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
					// 371:7: ->
					{
						dbg.location(371,9);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(371,21);
					string_literal232=(Token)match(input,ASSIGENMENT,FOLLOW_ASSIGENMENT_in_rs2277);  
					stream_ASSIGENMENT.add(string_literal232);
					dbg.location(371,26);
					pushFollow(FOLLOW_simpleAR_in_rs2279);
					simpleAR233=simpleAR();
					state._fsp--;

					stream_simpleAR.add(simpleAR233.getTree());
					// AST REWRITE
					// elements: rs, simpleAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 371:34: -> ^( ASSIGENMENT $rs simpleAR )
					{
						dbg.location(371,36);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:371:36: ^( ASSIGENMENT $rs simpleAR )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(371,38);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGENMENT, "ASSIGENMENT"), root_1);
						dbg.location(371,51);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(371,54);
						adaptor.addChild(root_1, stream_simpleAR.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:372:4: actualparametrepart2
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(372,4);
					pushFollow(FOLLOW_actualparametrepart2_in_rs2293);
					actualparametrepart2234=actualparametrepart2();
					state._fsp--;

					adaptor.addChild(root_0, actualparametrepart2234.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:373:3: ( ->) '[' expression ( ',' expression )* ']' ':=' simpleAR
					{
					dbg.location(373,3);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:373:3: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:373:4: 
					{
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
					// 373:4: ->
					{
						dbg.location(373,6);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(373,18);
					char_literal235=(Token)match(input,72,FOLLOW_72_in_rs2301);  
					stream_72.add(char_literal235);
					dbg.location(373,21);
					pushFollow(FOLLOW_expression_in_rs2302);
					expression236=expression();
					state._fsp--;

					stream_expression.add(expression236.getTree());dbg.location(373,32);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:373:32: ( ',' expression )*
					try { dbg.enterSubRule(57);

					loop57:
					while (true) {
						int alt57=2;
						try { dbg.enterDecision(57, decisionCanBacktrack[57]);

						int LA57_0 = input.LA(1);
						if ( (LA57_0==63) ) {
							alt57=1;
						}

						} finally {dbg.exitDecision(57);}

						switch (alt57) {
						case 1 :
							dbg.enterAlt(1);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:373:33: ',' expression
							{
							dbg.location(373,33);
							char_literal237=(Token)match(input,63,FOLLOW_63_in_rs2305);  
							stream_63.add(char_literal237);
							dbg.location(373,37);
							pushFollow(FOLLOW_expression_in_rs2307);
							expression238=expression();
							state._fsp--;

							stream_expression.add(expression238.getTree());
							}
							break;

						default :
							break loop57;
						}
					}
					} finally {dbg.exitSubRule(57);}
					dbg.location(373,49);
					char_literal239=(Token)match(input,73,FOLLOW_73_in_rs2310);  
					stream_73.add(char_literal239);
					dbg.location(373,53);
					string_literal240=(Token)match(input,ASSIGENMENT,FOLLOW_ASSIGENMENT_in_rs2312);  
					stream_ASSIGENMENT.add(string_literal240);
					dbg.location(373,58);
					pushFollow(FOLLOW_simpleAR_in_rs2314);
					simpleAR241=simpleAR();
					state._fsp--;

					stream_simpleAR.add(simpleAR241.getTree());
					// AST REWRITE
					// elements: simpleAR, rs, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 373:66: -> ^( ASSIGENMENT ^( ARRAYACCESS $rs ( expression )+ ) simpleAR )
					{
						dbg.location(373,68);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:373:68: ^( ASSIGENMENT ^( ARRAYACCESS $rs ( expression )+ ) simpleAR )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(373,70);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGENMENT, "ASSIGENMENT"), root_1);
						dbg.location(373,82);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:373:82: ^( ARRAYACCESS $rs ( expression )+ )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(373,84);
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAYACCESS, "ARRAYACCESS"), root_2);
						dbg.location(373,98);
						adaptor.addChild(root_2, stream_retval.nextTree());dbg.location(373,101);
						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							dbg.location(373,101);
							adaptor.addChild(root_2, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(373,114);
						adaptor.addChild(root_1, stream_simpleAR.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:375:4: ( ->) ':' m
					{
					dbg.location(375,4);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:375:4: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:375:5: 
					{
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
					// 375:5: ->
					{
						dbg.location(375,7);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(375,19);
					char_literal242=(Token)match(input,BORNE,FOLLOW_BORNE_in_rs2352);  
					stream_BORNE.add(char_literal242);
					dbg.location(375,23);
					pushFollow(FOLLOW_m_in_rs2354);
					m243=m();
					state._fsp--;

					stream_m.add(m243.getTree());
					// AST REWRITE
					// elements: m
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 375:25: -> m
					{
						dbg.location(375,28);
						adaptor.addChild(root_0, stream_m.nextTree());
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
		dbg.location(376, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rs");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:378:1: m : ( ( ->) label2 -> ^( LABEL $m label2 ) | ( ->) gotostatement -> ^( LABEL $m gotostatement ) | comment | ( ->) 'IF' expression 'THEN' j -> ^( LABEL $m ^( IF expression ^( THEN j ) ) ) | ( ->) 'FOR' simpleARi ':=' forlist 'DO' statement -> ^( LABEL $m ^( FOR ^( ASSIGENMENT simpleARi forlist ) ^( 'DO' statement ) ) ) | ( ->) begin -> ^( LABEL $m begin ) | ( ->) actualparametrepart2 | ':' m -> m );
	public final AlgolParser.m_return m() throws RecognitionException {
		AlgolParser.m_return retval = new AlgolParser.m_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal247=null;
		Token string_literal249=null;
		Token string_literal251=null;
		Token string_literal253=null;
		Token string_literal255=null;
		Token char_literal259=null;
		ParserRuleReturnScope label2244 =null;
		ParserRuleReturnScope gotostatement245 =null;
		ParserRuleReturnScope comment246 =null;
		ParserRuleReturnScope expression248 =null;
		ParserRuleReturnScope j250 =null;
		ParserRuleReturnScope simpleARi252 =null;
		ParserRuleReturnScope forlist254 =null;
		ParserRuleReturnScope statement256 =null;
		ParserRuleReturnScope begin257 =null;
		ParserRuleReturnScope actualparametrepart2258 =null;
		ParserRuleReturnScope m260 =null;

		CommonTree string_literal247_tree=null;
		CommonTree string_literal249_tree=null;
		CommonTree string_literal251_tree=null;
		CommonTree string_literal253_tree=null;
		CommonTree string_literal255_tree=null;
		CommonTree char_literal259_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_ASSIGENMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGENMENT");
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_actualparametrepart2=new RewriteRuleSubtreeStream(adaptor,"rule actualparametrepart2");
		RewriteRuleSubtreeStream stream_gotostatement=new RewriteRuleSubtreeStream(adaptor,"rule gotostatement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_simpleARi=new RewriteRuleSubtreeStream(adaptor,"rule simpleARi");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_forlist=new RewriteRuleSubtreeStream(adaptor,"rule forlist");
		RewriteRuleSubtreeStream stream_j=new RewriteRuleSubtreeStream(adaptor,"rule j");
		RewriteRuleSubtreeStream stream_begin=new RewriteRuleSubtreeStream(adaptor,"rule begin");
		RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m");
		RewriteRuleSubtreeStream stream_label2=new RewriteRuleSubtreeStream(adaptor,"rule label2");

		try { dbg.enterRule(getGrammarFileName(), "m");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(378, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:378:3: ( ( ->) label2 -> ^( LABEL $m label2 ) | ( ->) gotostatement -> ^( LABEL $m gotostatement ) | comment | ( ->) 'IF' expression 'THEN' j -> ^( LABEL $m ^( IF expression ^( THEN j ) ) ) | ( ->) 'FOR' simpleARi ':=' forlist 'DO' statement -> ^( LABEL $m ^( FOR ^( ASSIGENMENT simpleARi forlist ) ^( 'DO' statement ) ) ) | ( ->) begin -> ^( LABEL $m begin ) | ( ->) actualparametrepart2 | ':' m -> m )
			int alt59=8;
			try { dbg.enterDecision(59, decisionCanBacktrack[59]);

			switch ( input.LA(1) ) {
			case ID:
			case INT:
				{
				alt59=1;
				}
				break;
			case GOTO:
				{
				alt59=2;
				}
				break;
			case COMMENT2:
				{
				alt59=3;
				}
				break;
			case IF:
				{
				alt59=4;
				}
				break;
			case FOR:
				{
				alt59=5;
				}
				break;
			case BEGIN:
				{
				alt59=6;
				}
				break;
			case EOF:
			case PARENTHESEO:
			case 65:
			case 68:
				{
				alt59=7;
				}
				break;
			case BORNE:
				{
				alt59=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(59);}

			switch (alt59) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:378:5: ( ->) label2
					{
					dbg.location(378,5);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:378:5: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:378:6: 
					{
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
					// 378:6: ->
					{
						dbg.location(378,8);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(378,21);
					pushFollow(FOLLOW_label2_in_m2374);
					label2244=label2();
					state._fsp--;

					stream_label2.add(label2244.getTree());
					// AST REWRITE
					// elements: m, label2
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 378:57: -> ^( LABEL $m label2 )
					{
						dbg.location(378,59);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:378:59: ^( LABEL $m label2 )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(378,61);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, "LABEL"), root_1);
						dbg.location(378,68);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(378,70);
						adaptor.addChild(root_1, stream_label2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:379:3: ( ->) gotostatement
					{
					dbg.location(379,3);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:379:3: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:379:4: 
					{
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
					// 379:4: ->
					{
						dbg.location(379,6);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(379,18);
					pushFollow(FOLLOW_gotostatement_in_m2393);
					gotostatement245=gotostatement();
					state._fsp--;

					stream_gotostatement.add(gotostatement245.getTree());
					// AST REWRITE
					// elements: m, gotostatement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 379:31: -> ^( LABEL $m gotostatement )
					{
						dbg.location(379,33);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:379:33: ^( LABEL $m gotostatement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(379,35);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, "LABEL"), root_1);
						dbg.location(379,42);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(379,44);
						adaptor.addChild(root_1, stream_gotostatement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:380:3: comment
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(380,3);
					pushFollow(FOLLOW_comment_in_m2406);
					comment246=comment();
					state._fsp--;

					adaptor.addChild(root_0, comment246.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:381:4: ( ->) 'IF' expression 'THEN' j
					{
					dbg.location(381,4);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:381:4: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:381:5: 
					{
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
					// 381:5: ->
					{
						dbg.location(381,7);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(381,19);
					string_literal247=(Token)match(input,IF,FOLLOW_IF_in_m2415);  
					stream_IF.add(string_literal247);
					dbg.location(381,24);
					pushFollow(FOLLOW_expression_in_m2417);
					expression248=expression();
					state._fsp--;

					stream_expression.add(expression248.getTree());dbg.location(381,35);
					string_literal249=(Token)match(input,THEN,FOLLOW_THEN_in_m2419);  
					stream_THEN.add(string_literal249);
					dbg.location(381,42);
					pushFollow(FOLLOW_j_in_m2421);
					j250=j();
					state._fsp--;

					stream_j.add(j250.getTree());
					// AST REWRITE
					// elements: j, m, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 381:43: -> ^( LABEL $m ^( IF expression ^( THEN j ) ) )
					{
						dbg.location(381,45);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:381:45: ^( LABEL $m ^( IF expression ^( THEN j ) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(381,47);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, "LABEL"), root_1);
						dbg.location(381,54);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(381,56);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:381:56: ^( IF expression ^( THEN j ) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(381,58);
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_2);
						dbg.location(381,61);
						adaptor.addChild(root_2, stream_expression.nextTree());dbg.location(381,72);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:381:72: ^( THEN j )
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						dbg.location(381,74);
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THEN, "THEN"), root_3);
						dbg.location(381,79);
						adaptor.addChild(root_3, stream_j.nextTree());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:382:3: ( ->) 'FOR' simpleARi ':=' forlist 'DO' statement
					{
					dbg.location(382,3);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:382:3: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:382:4: 
					{
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
					// 382:4: ->
					{
						dbg.location(382,6);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(382,18);
					string_literal251=(Token)match(input,FOR,FOLLOW_FOR_in_m2448);  
					stream_FOR.add(string_literal251);
					dbg.location(382,24);
					pushFollow(FOLLOW_simpleARi_in_m2450);
					simpleARi252=simpleARi();
					state._fsp--;

					stream_simpleARi.add(simpleARi252.getTree());dbg.location(382,34);
					string_literal253=(Token)match(input,ASSIGENMENT,FOLLOW_ASSIGENMENT_in_m2452);  
					stream_ASSIGENMENT.add(string_literal253);
					dbg.location(382,39);
					pushFollow(FOLLOW_forlist_in_m2454);
					forlist254=forlist();
					state._fsp--;

					stream_forlist.add(forlist254.getTree());dbg.location(382,47);
					string_literal255=(Token)match(input,67,FOLLOW_67_in_m2456);  
					stream_67.add(string_literal255);
					dbg.location(382,52);
					pushFollow(FOLLOW_statement_in_m2458);
					statement256=statement();
					state._fsp--;

					stream_statement.add(statement256.getTree());
					// AST REWRITE
					// elements: 67, forlist, statement, m, simpleARi
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 382:61: -> ^( LABEL $m ^( FOR ^( ASSIGENMENT simpleARi forlist ) ^( 'DO' statement ) ) )
					{
						dbg.location(382,63);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:382:63: ^( LABEL $m ^( FOR ^( ASSIGENMENT simpleARi forlist ) ^( 'DO' statement ) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(382,65);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, "LABEL"), root_1);
						dbg.location(382,72);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(382,74);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:382:74: ^( FOR ^( ASSIGENMENT simpleARi forlist ) ^( 'DO' statement ) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(382,76);
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_2);
						dbg.location(382,80);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:382:80: ^( ASSIGENMENT simpleARi forlist )
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						dbg.location(382,82);
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGENMENT, "ASSIGENMENT"), root_3);
						dbg.location(382,94);
						adaptor.addChild(root_3, stream_simpleARi.nextTree());dbg.location(382,104);
						adaptor.addChild(root_3, stream_forlist.nextTree());
						adaptor.addChild(root_2, root_3);
						}
						dbg.location(382,113);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:382:113: ^( 'DO' statement )
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						dbg.location(382,115);
						root_3 = (CommonTree)adaptor.becomeRoot(stream_67.nextNode(), root_3);
						dbg.location(382,120);
						adaptor.addChild(root_3, stream_statement.nextTree());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:383:3: ( ->) begin
					{
					dbg.location(383,3);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:383:3: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:383:4: 
					{
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
					// 383:4: ->
					{
						dbg.location(383,6);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(383,18);
					pushFollow(FOLLOW_begin_in_m2491);
					begin257=begin();
					state._fsp--;

					stream_begin.add(begin257.getTree());
					// AST REWRITE
					// elements: begin, m
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 383:23: -> ^( LABEL $m begin )
					{
						dbg.location(383,25);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:383:25: ^( LABEL $m begin )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(383,27);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, "LABEL"), root_1);
						dbg.location(383,34);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(383,36);
						adaptor.addChild(root_1, stream_begin.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:385:3: ( ->) actualparametrepart2
					{
					dbg.location(385,3);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:385:3: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:385:4: 
					{
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
					// 385:4: ->
					{
						dbg.location(385,6);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(385,18);
					pushFollow(FOLLOW_actualparametrepart2_in_m2510);
					actualparametrepart2258=actualparametrepart2();
					state._fsp--;

					stream_actualparametrepart2.add(actualparametrepart2258.getTree());
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:386:3: ':' m
					{
					dbg.location(386,3);
					char_literal259=(Token)match(input,BORNE,FOLLOW_BORNE_in_m2514);  
					stream_BORNE.add(char_literal259);
					dbg.location(386,6);
					pushFollow(FOLLOW_m_in_m2515);
					m260=m();
					state._fsp--;

					stream_m.add(m260.getTree());
					// AST REWRITE
					// elements: m
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 386:7: -> m
					{
						dbg.location(386,9);
						adaptor.addChild(root_0, stream_m.nextTree());
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
		dbg.location(388, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "m");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "m"


	public static class label_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "label"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:391:1: label : ( ID | INT );
	public final AlgolParser.label_return label() throws RecognitionException {
		AlgolParser.label_return retval = new AlgolParser.label_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set261=null;

		CommonTree set261_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "label");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(391, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:391:6: ( ID | INT )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(391,6);
			set261=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==INT ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set261));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
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
		dbg.location(393, 16);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "label");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "label"


	public static class label2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "label2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:395:1: label2 : ( ID ( -> ID ) v -> v | INT );
	public final AlgolParser.label2_return label2() throws RecognitionException {
		AlgolParser.label2_return retval = new AlgolParser.label2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID262=null;
		Token INT264=null;
		ParserRuleReturnScope v263 =null;

		CommonTree ID262_tree=null;
		CommonTree INT264_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v");

		try { dbg.enterRule(getGrammarFileName(), "label2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(395, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:395:8: ( ID ( -> ID ) v -> v | INT )
			int alt60=2;
			try { dbg.enterDecision(60, decisionCanBacktrack[60]);

			int LA60_0 = input.LA(1);
			if ( (LA60_0==ID) ) {
				alt60=1;
			}
			else if ( (LA60_0==INT) ) {
				alt60=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(60);}

			switch (alt60) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:395:10: ID ( -> ID ) v
					{
					dbg.location(395,10);
					ID262=(Token)match(input,ID,FOLLOW_ID_in_label22602);  
					stream_ID.add(ID262);
					dbg.location(395,12);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:395:12: ( -> ID )
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:395:13: 
					{
					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 395:13: -> ID
					{
						dbg.location(395,15);
						adaptor.addChild(root_0, stream_ID.nextNode());
					}


					retval.tree = root_0;

					}
					dbg.location(395,19);
					Idmemoire=retval.tree;dbg.location(395,45);
					pushFollow(FOLLOW_v_in_label22610);
					v263=v();
					state._fsp--;

					stream_v.add(v263.getTree());
					// AST REWRITE
					// elements: v
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 395:46: -> v
					{
						dbg.location(395,48);
						adaptor.addChild(root_0, stream_v.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:396:17: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(396,17);
					INT264=(Token)match(input,INT,FOLLOW_INT_in_label22630); 
					INT264_tree = (CommonTree)adaptor.create(INT264);
					adaptor.addChild(root_0, INT264_tree);

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
		dbg.location(397, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "label2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "label2"


	public static class v_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "v"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:401:1: v : ( ( ->) ':=' simpleAR -> ^( ':=' $v simpleAR ) | actualparametrepart2 | ':' m -> m );
	public final AlgolParser.v_return v() throws RecognitionException {
		AlgolParser.v_return retval = new AlgolParser.v_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal265=null;
		Token char_literal268=null;
		ParserRuleReturnScope simpleAR266 =null;
		ParserRuleReturnScope actualparametrepart2267 =null;
		ParserRuleReturnScope m269 =null;

		CommonTree string_literal265_tree=null;
		CommonTree char_literal268_tree=null;
		RewriteRuleTokenStream stream_ASSIGENMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGENMENT");
		RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
		RewriteRuleSubtreeStream stream_simpleAR=new RewriteRuleSubtreeStream(adaptor,"rule simpleAR");
		RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m");

		try { dbg.enterRule(getGrammarFileName(), "v");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(401, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:401:3: ( ( ->) ':=' simpleAR -> ^( ':=' $v simpleAR ) | actualparametrepart2 | ':' m -> m )
			int alt61=3;
			try { dbg.enterDecision(61, decisionCanBacktrack[61]);

			switch ( input.LA(1) ) {
			case ASSIGENMENT:
				{
				alt61=1;
				}
				break;
			case EOF:
			case PARENTHESEO:
			case 65:
			case 68:
				{
				alt61=2;
				}
				break;
			case BORNE:
				{
				alt61=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(61);}

			switch (alt61) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:401:5: ( ->) ':=' simpleAR
					{
					dbg.location(401,5);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:401:5: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:401:6: 
					{
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
					// 401:6: ->
					{
						dbg.location(401,8);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(401,20);
					string_literal265=(Token)match(input,ASSIGENMENT,FOLLOW_ASSIGENMENT_in_v2649);  
					stream_ASSIGENMENT.add(string_literal265);
					dbg.location(401,26);
					pushFollow(FOLLOW_simpleAR_in_v2652);
					simpleAR266=simpleAR();
					state._fsp--;

					stream_simpleAR.add(simpleAR266.getTree());
					// AST REWRITE
					// elements: ASSIGENMENT, v, simpleAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 401:34: -> ^( ':=' $v simpleAR )
					{
						dbg.location(401,36);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:401:36: ^( ':=' $v simpleAR )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(401,38);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGENMENT.nextNode(), root_1);
						dbg.location(401,44);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(401,46);
						adaptor.addChild(root_1, stream_simpleAR.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:402:8: actualparametrepart2
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(402,8);
					pushFollow(FOLLOW_actualparametrepart2_in_v2670);
					actualparametrepart2267=actualparametrepart2();
					state._fsp--;

					adaptor.addChild(root_0, actualparametrepart2267.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:403:7: ':' m
					{
					dbg.location(403,7);
					char_literal268=(Token)match(input,BORNE,FOLLOW_BORNE_in_v2678);  
					stream_BORNE.add(char_literal268);
					dbg.location(403,10);
					pushFollow(FOLLOW_m_in_v2679);
					m269=m();
					state._fsp--;

					stream_m.add(m269.getTree());
					// AST REWRITE
					// elements: m
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 403:11: -> m
					{
						dbg.location(403,13);
						adaptor.addChild(root_0, stream_m.nextTree());
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
		dbg.location(405, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "v");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "v"


	public static class forlist_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forlist"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:418:1: forlist : forlistelement ( ',' forlistelement )* -> ( ^( FORLISTELEMENT forlistelement ) )+ ;
	public final AlgolParser.forlist_return forlist() throws RecognitionException {
		AlgolParser.forlist_return retval = new AlgolParser.forlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal271=null;
		ParserRuleReturnScope forlistelement270 =null;
		ParserRuleReturnScope forlistelement272 =null;

		CommonTree char_literal271_tree=null;
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_forlistelement=new RewriteRuleSubtreeStream(adaptor,"rule forlistelement");

		try { dbg.enterRule(getGrammarFileName(), "forlist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(418, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:418:9: ( forlistelement ( ',' forlistelement )* -> ( ^( FORLISTELEMENT forlistelement ) )+ )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:419:16: forlistelement ( ',' forlistelement )*
			{
			dbg.location(419,16);
			pushFollow(FOLLOW_forlistelement_in_forlist2744);
			forlistelement270=forlistelement();
			state._fsp--;

			stream_forlistelement.add(forlistelement270.getTree());dbg.location(419,31);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:419:31: ( ',' forlistelement )*
			try { dbg.enterSubRule(62);

			loop62:
			while (true) {
				int alt62=2;
				try { dbg.enterDecision(62, decisionCanBacktrack[62]);

				int LA62_0 = input.LA(1);
				if ( (LA62_0==63) ) {
					alt62=1;
				}

				} finally {dbg.exitDecision(62);}

				switch (alt62) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:419:32: ',' forlistelement
					{
					dbg.location(419,32);
					char_literal271=(Token)match(input,63,FOLLOW_63_in_forlist2747);  
					stream_63.add(char_literal271);
					dbg.location(419,35);
					pushFollow(FOLLOW_forlistelement_in_forlist2748);
					forlistelement272=forlistelement();
					state._fsp--;

					stream_forlistelement.add(forlistelement272.getTree());
					}
					break;

				default :
					break loop62;
				}
			}
			} finally {dbg.exitSubRule(62);}

			// AST REWRITE
			// elements: forlistelement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 419:51: -> ( ^( FORLISTELEMENT forlistelement ) )+
			{
				dbg.location(419,53);
				if ( !(stream_forlistelement.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_forlistelement.hasNext() ) {
					dbg.location(419,53);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:419:53: ^( FORLISTELEMENT forlistelement )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					dbg.location(419,55);
					root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORLISTELEMENT, "FORLISTELEMENT"), root_1);
					dbg.location(419,70);
					adaptor.addChild(root_1, stream_forlistelement.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_forlistelement.reset();

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
		dbg.location(420, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "forlist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:423:1: forlistelement : expression q ;
	public final AlgolParser.forlistelement_return forlistelement() throws RecognitionException {
		AlgolParser.forlistelement_return retval = new AlgolParser.forlistelement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression273 =null;
		ParserRuleReturnScope q274 =null;


		try { dbg.enterRule(getGrammarFileName(), "forlistelement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(423, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:424:2: ( expression q )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:424:3: expression q
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(424,3);
			pushFollow(FOLLOW_expression_in_forlistelement2770);
			expression273=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression273.getTree());
			dbg.location(424,14);
			pushFollow(FOLLOW_q_in_forlistelement2772);
			q274=q();
			state._fsp--;

			adaptor.addChild(root_0, q274.getTree());

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
		dbg.location(425, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "forlistelement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:427:1: q : (| 'STEP' simpleARi 'UNTIL' expression -> ^( 'STEP' simpleARi ^( 'UNTIL' expression ) ) | 'WHILE' expression -> ^( 'WHILE' expression ) );
	public final AlgolParser.q_return q() throws RecognitionException {
		AlgolParser.q_return retval = new AlgolParser.q_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal275=null;
		Token string_literal277=null;
		Token string_literal279=null;
		ParserRuleReturnScope simpleARi276 =null;
		ParserRuleReturnScope expression278 =null;
		ParserRuleReturnScope expression280 =null;

		CommonTree string_literal275_tree=null;
		CommonTree string_literal277_tree=null;
		CommonTree string_literal279_tree=null;
		RewriteRuleTokenStream stream_PAS=new RewriteRuleTokenStream(adaptor,"token PAS");
		RewriteRuleTokenStream stream_BORNESUPP=new RewriteRuleTokenStream(adaptor,"token BORNESUPP");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_simpleARi=new RewriteRuleSubtreeStream(adaptor,"rule simpleARi");

		try { dbg.enterRule(getGrammarFileName(), "q");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(427, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:427:3: (| 'STEP' simpleARi 'UNTIL' expression -> ^( 'STEP' simpleARi ^( 'UNTIL' expression ) ) | 'WHILE' expression -> ^( 'WHILE' expression ) )
			int alt63=3;
			try { dbg.enterDecision(63, decisionCanBacktrack[63]);

			switch ( input.LA(1) ) {
			case 63:
			case 67:
				{
				alt63=1;
				}
				break;
			case PAS:
				{
				alt63=2;
				}
				break;
			case WHILE:
				{
				alt63=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(63);}

			switch (alt63) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:427:4: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:427:5: 'STEP' simpleARi 'UNTIL' expression
					{
					dbg.location(427,5);
					string_literal275=(Token)match(input,PAS,FOLLOW_PAS_in_q2792);  
					stream_PAS.add(string_literal275);
					dbg.location(427,11);
					pushFollow(FOLLOW_simpleARi_in_q2793);
					simpleARi276=simpleARi();
					state._fsp--;

					stream_simpleARi.add(simpleARi276.getTree());dbg.location(427,21);
					string_literal277=(Token)match(input,BORNESUPP,FOLLOW_BORNESUPP_in_q2795);  
					stream_BORNESUPP.add(string_literal277);
					dbg.location(427,28);
					pushFollow(FOLLOW_expression_in_q2796);
					expression278=expression();
					state._fsp--;

					stream_expression.add(expression278.getTree());
					// AST REWRITE
					// elements: BORNESUPP, simpleARi, expression, PAS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 427:38: -> ^( 'STEP' simpleARi ^( 'UNTIL' expression ) )
					{
						dbg.location(427,40);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:427:40: ^( 'STEP' simpleARi ^( 'UNTIL' expression ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(427,42);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_PAS.nextNode(), root_1);
						dbg.location(427,49);
						adaptor.addChild(root_1, stream_simpleARi.nextTree());dbg.location(427,59);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:427:59: ^( 'UNTIL' expression )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(427,61);
						root_2 = (CommonTree)adaptor.becomeRoot(stream_BORNESUPP.nextNode(), root_2);
						dbg.location(427,69);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:428:11: 'WHILE' expression
					{
					dbg.location(428,11);
					string_literal279=(Token)match(input,WHILE,FOLLOW_WHILE_in_q2820);  
					stream_WHILE.add(string_literal279);
					dbg.location(428,18);
					pushFollow(FOLLOW_expression_in_q2821);
					expression280=expression();
					state._fsp--;

					stream_expression.add(expression280.getTree());
					// AST REWRITE
					// elements: WHILE, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 428:29: -> ^( 'WHILE' expression )
					{
						dbg.location(428,31);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:428:31: ^( 'WHILE' expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(428,33);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);
						dbg.location(428,41);
						adaptor.addChild(root_1, stream_expression.nextTree());
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
		dbg.location(429, 11);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "q");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:431:1: k : ( 'ELSE' statement -> ^( 'ELSE' statement ) |);
	public final AlgolParser.k_return k() throws RecognitionException {
		AlgolParser.k_return retval = new AlgolParser.k_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal281=null;
		ParserRuleReturnScope statement282 =null;

		CommonTree string_literal281_tree=null;
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try { dbg.enterRule(getGrammarFileName(), "k");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(431, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:431:3: ( 'ELSE' statement -> ^( 'ELSE' statement ) |)
			int alt64=2;
			try { dbg.enterDecision(64, decisionCanBacktrack[64]);

			int LA64_0 = input.LA(1);
			if ( (LA64_0==ELSE) ) {
				alt64=1;
			}
			else if ( (LA64_0==EOF||LA64_0==65||LA64_0==68) ) {
				alt64=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(64);}

			switch (alt64) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:431:5: 'ELSE' statement
					{
					dbg.location(431,5);
					string_literal281=(Token)match(input,ELSE,FOLLOW_ELSE_in_k2858);  
					stream_ELSE.add(string_literal281);
					dbg.location(431,12);
					pushFollow(FOLLOW_statement_in_k2860);
					statement282=statement();
					state._fsp--;

					stream_statement.add(statement282.getTree());
					// AST REWRITE
					// elements: statement, ELSE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 431:21: -> ^( 'ELSE' statement )
					{
						dbg.location(431,23);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:431:23: ^( 'ELSE' statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(431,25);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_1);
						dbg.location(431,32);
						adaptor.addChild(root_1, stream_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:433:2: 
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
		dbg.location(433, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "k");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:436:1: y : ( identifier | gotostatement | begin |);
	public final AlgolParser.y_return y() throws RecognitionException {
		AlgolParser.y_return retval = new AlgolParser.y_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier283 =null;
		ParserRuleReturnScope gotostatement284 =null;
		ParserRuleReturnScope begin285 =null;


		try { dbg.enterRule(getGrammarFileName(), "y");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(436, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:436:3: ( identifier | gotostatement | begin |)
			int alt65=4;
			try { dbg.enterDecision(65, decisionCanBacktrack[65]);

			switch ( input.LA(1) ) {
			case ID:
			case INT:
				{
				alt65=1;
				}
				break;
			case GOTO:
				{
				alt65=2;
				}
				break;
			case BEGIN:
				{
				alt65=3;
				}
				break;
			case EOF:
			case ELSE:
			case 65:
			case 68:
				{
				alt65=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(65);}

			switch (alt65) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:436:5: identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(436,5);
					pushFollow(FOLLOW_identifier_in_y2896);
					identifier283=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier283.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:437:4: gotostatement
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(437,4);
					pushFollow(FOLLOW_gotostatement_in_y2902);
					gotostatement284=gotostatement();
					state._fsp--;

					adaptor.addChild(root_0, gotostatement284.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:438:3: begin
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(438,3);
					pushFollow(FOLLOW_begin_in_y2906);
					begin285=begin();
					state._fsp--;

					adaptor.addChild(root_0, begin285.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:440:2: 
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
		dbg.location(440, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "y");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:443:1: j : ( 'FOR' simpleARi ':=' forlist 'DO' statement -> ^( 'FOR' ^( ':=' simpleARi forlist ) ^( 'DO' statement ) ) | ID ( -> ID ) r2 -> r2 || gotostatement -> gotostatement | begin -> begin );
	public final AlgolParser.j_return j() throws RecognitionException {
		AlgolParser.j_return retval = new AlgolParser.j_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal286=null;
		Token string_literal288=null;
		Token string_literal290=null;
		Token ID292=null;
		ParserRuleReturnScope simpleARi287 =null;
		ParserRuleReturnScope forlist289 =null;
		ParserRuleReturnScope statement291 =null;
		ParserRuleReturnScope r2293 =null;
		ParserRuleReturnScope gotostatement294 =null;
		ParserRuleReturnScope begin295 =null;

		CommonTree string_literal286_tree=null;
		CommonTree string_literal288_tree=null;
		CommonTree string_literal290_tree=null;
		CommonTree ID292_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_ASSIGENMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGENMENT");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_r2=new RewriteRuleSubtreeStream(adaptor,"rule r2");
		RewriteRuleSubtreeStream stream_gotostatement=new RewriteRuleSubtreeStream(adaptor,"rule gotostatement");
		RewriteRuleSubtreeStream stream_simpleARi=new RewriteRuleSubtreeStream(adaptor,"rule simpleARi");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_forlist=new RewriteRuleSubtreeStream(adaptor,"rule forlist");
		RewriteRuleSubtreeStream stream_begin=new RewriteRuleSubtreeStream(adaptor,"rule begin");

		try { dbg.enterRule(getGrammarFileName(), "j");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(443, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:443:3: ( 'FOR' simpleARi ':=' forlist 'DO' statement -> ^( 'FOR' ^( ':=' simpleARi forlist ) ^( 'DO' statement ) ) | ID ( -> ID ) r2 -> r2 || gotostatement -> gotostatement | begin -> begin )
			int alt66=5;
			try { dbg.enterDecision(66, decisionCanBacktrack[66]);

			switch ( input.LA(1) ) {
			case FOR:
				{
				alt66=1;
				}
				break;
			case ID:
				{
				alt66=2;
				}
				break;
			case EOF:
			case 65:
			case 68:
				{
				alt66=3;
				}
				break;
			case GOTO:
				{
				alt66=4;
				}
				break;
			case BEGIN:
				{
				alt66=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(66);}

			switch (alt66) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:443:7: 'FOR' simpleARi ':=' forlist 'DO' statement
					{
					dbg.location(443,7);
					string_literal286=(Token)match(input,FOR,FOLLOW_FOR_in_j2923);  
					stream_FOR.add(string_literal286);
					dbg.location(443,13);
					pushFollow(FOLLOW_simpleARi_in_j2925);
					simpleARi287=simpleARi();
					state._fsp--;

					stream_simpleARi.add(simpleARi287.getTree());dbg.location(443,23);
					string_literal288=(Token)match(input,ASSIGENMENT,FOLLOW_ASSIGENMENT_in_j2927);  
					stream_ASSIGENMENT.add(string_literal288);
					dbg.location(443,28);
					pushFollow(FOLLOW_forlist_in_j2929);
					forlist289=forlist();
					state._fsp--;

					stream_forlist.add(forlist289.getTree());dbg.location(443,36);
					string_literal290=(Token)match(input,67,FOLLOW_67_in_j2931);  
					stream_67.add(string_literal290);
					dbg.location(443,41);
					pushFollow(FOLLOW_statement_in_j2933);
					statement291=statement();
					state._fsp--;

					stream_statement.add(statement291.getTree());
					// AST REWRITE
					// elements: statement, 67, ASSIGENMENT, FOR, simpleARi, forlist
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 443:50: -> ^( 'FOR' ^( ':=' simpleARi forlist ) ^( 'DO' statement ) )
					{
						dbg.location(443,53);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:443:53: ^( 'FOR' ^( ':=' simpleARi forlist ) ^( 'DO' statement ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(443,55);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);
						dbg.location(443,62);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:443:62: ^( ':=' simpleARi forlist )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(443,64);
						root_2 = (CommonTree)adaptor.becomeRoot(stream_ASSIGENMENT.nextNode(), root_2);
						dbg.location(443,69);
						adaptor.addChild(root_2, stream_simpleARi.nextTree());dbg.location(443,79);
						adaptor.addChild(root_2, stream_forlist.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(443,88);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:443:88: ^( 'DO' statement )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						dbg.location(443,90);
						root_2 = (CommonTree)adaptor.becomeRoot(stream_67.nextNode(), root_2);
						dbg.location(443,95);
						adaptor.addChild(root_2, stream_statement.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:444:21: ID ( -> ID ) r2
					{
					dbg.location(444,21);
					ID292=(Token)match(input,ID,FOLLOW_ID_in_j2975);  
					stream_ID.add(ID292);
					dbg.location(444,24);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:444:24: ( -> ID )
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:444:25: 
					{
					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 444:25: -> ID
					{
						dbg.location(444,27);
						adaptor.addChild(root_0, stream_ID.nextNode());
					}


					retval.tree = root_0;

					}
					dbg.location(444,31);
					Idmemoire=retval.tree;dbg.location(444,52);
					pushFollow(FOLLOW_r2_in_j2984);
					r2293=r2();
					state._fsp--;

					stream_r2.add(r2293.getTree());
					// AST REWRITE
					// elements: r2
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 444:55: -> r2
					{
						dbg.location(444,58);
						adaptor.addChild(root_0, stream_r2.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:446:19: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:446:22: gotostatement
					{
					dbg.location(446,22);
					pushFollow(FOLLOW_gotostatement_in_j3032);
					gotostatement294=gotostatement();
					state._fsp--;

					stream_gotostatement.add(gotostatement294.getTree());
					// AST REWRITE
					// elements: gotostatement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 446:35: -> gotostatement
					{
						dbg.location(446,37);
						adaptor.addChild(root_0, stream_gotostatement.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:447:20: begin
					{
					dbg.location(447,20);
					pushFollow(FOLLOW_begin_in_j3055);
					begin295=begin();
					state._fsp--;

					stream_begin.add(begin295.getTree());
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
					// 447:25: -> begin
					{
						dbg.location(447,27);
						adaptor.addChild(root_0, stream_begin.nextTree());
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
		dbg.location(448, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "j");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "j"


	public static class r2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "r2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:450:1: r2 : ( u1 k -> u1 k | ':' w );
	public final AlgolParser.r2_return r2() throws RecognitionException {
		AlgolParser.r2_return retval = new AlgolParser.r2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal298=null;
		ParserRuleReturnScope u1296 =null;
		ParserRuleReturnScope k297 =null;
		ParserRuleReturnScope w299 =null;

		CommonTree char_literal298_tree=null;
		RewriteRuleSubtreeStream stream_k=new RewriteRuleSubtreeStream(adaptor,"rule k");
		RewriteRuleSubtreeStream stream_u1=new RewriteRuleSubtreeStream(adaptor,"rule u1");

		try { dbg.enterRule(getGrammarFileName(), "r2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(450, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:450:4: ( u1 k -> u1 k | ':' w )
			int alt67=2;
			try { dbg.enterDecision(67, decisionCanBacktrack[67]);

			int LA67_0 = input.LA(1);
			if ( (LA67_0==ASSIGENMENT||LA67_0==PARENTHESEO) ) {
				alt67=1;
			}
			else if ( (LA67_0==BORNE) ) {
				alt67=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(67);}

			switch (alt67) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:450:6: u1 k
					{
					dbg.location(450,6);
					pushFollow(FOLLOW_u1_in_r23068);
					u1296=u1();
					state._fsp--;

					stream_u1.add(u1296.getTree());dbg.location(450,9);
					pushFollow(FOLLOW_k_in_r23070);
					k297=k();
					state._fsp--;

					stream_k.add(k297.getTree());
					// AST REWRITE
					// elements: u1, k
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 450:10: -> u1 k
					{
						dbg.location(450,12);
						adaptor.addChild(root_0, stream_u1.nextTree());dbg.location(450,15);
						adaptor.addChild(root_0, stream_k.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:451:18: ':' w
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(451,18);
					char_literal298=(Token)match(input,BORNE,FOLLOW_BORNE_in_r23093); 
					char_literal298_tree = (CommonTree)adaptor.create(char_literal298);
					adaptor.addChild(root_0, char_literal298_tree);
					dbg.location(451,22);
					pushFollow(FOLLOW_w_in_r23095);
					w299=w();
					state._fsp--;

					adaptor.addChild(root_0, w299.getTree());

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
		dbg.location(452, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "r2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "r2"


	public static class u1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "u1"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:454:1: u1 : ( ( ->) ':=' simpleAR -> ^( ASSIGENMENT $u1 simpleAR ) | ( ->) actualparametrepart );
	public final AlgolParser.u1_return u1() throws RecognitionException {
		AlgolParser.u1_return retval = new AlgolParser.u1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal300=null;
		ParserRuleReturnScope simpleAR301 =null;
		ParserRuleReturnScope actualparametrepart302 =null;

		CommonTree string_literal300_tree=null;
		RewriteRuleTokenStream stream_ASSIGENMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGENMENT");
		RewriteRuleSubtreeStream stream_simpleAR=new RewriteRuleSubtreeStream(adaptor,"rule simpleAR");
		RewriteRuleSubtreeStream stream_actualparametrepart=new RewriteRuleSubtreeStream(adaptor,"rule actualparametrepart");

		try { dbg.enterRule(getGrammarFileName(), "u1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(454, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:455:9: ( ( ->) ':=' simpleAR -> ^( ASSIGENMENT $u1 simpleAR ) | ( ->) actualparametrepart )
			int alt68=2;
			try { dbg.enterDecision(68, decisionCanBacktrack[68]);

			int LA68_0 = input.LA(1);
			if ( (LA68_0==ASSIGENMENT) ) {
				alt68=1;
			}
			else if ( (LA68_0==PARENTHESEO) ) {
				alt68=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(68);}

			switch (alt68) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:455:11: ( ->) ':=' simpleAR
					{
					dbg.location(455,11);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:455:11: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:455:12: 
					{
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
					// 455:12: ->
					{
						dbg.location(455,14);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(455,26);
					string_literal300=(Token)match(input,ASSIGENMENT,FOLLOW_ASSIGENMENT_in_u13118);  
					stream_ASSIGENMENT.add(string_literal300);
					dbg.location(455,32);
					pushFollow(FOLLOW_simpleAR_in_u13121);
					simpleAR301=simpleAR();
					state._fsp--;

					stream_simpleAR.add(simpleAR301.getTree());
					// AST REWRITE
					// elements: u1, simpleAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 455:41: -> ^( ASSIGENMENT $u1 simpleAR )
					{
						dbg.location(455,43);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:455:43: ^( ASSIGENMENT $u1 simpleAR )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(455,45);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGENMENT, "ASSIGENMENT"), root_1);
						dbg.location(455,58);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(455,61);
						adaptor.addChild(root_1, stream_simpleAR.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:456:4: ( ->) actualparametrepart
					{
					dbg.location(456,4);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:456:4: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:456:5: 
					{
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
					// 456:5: ->
					{
						dbg.location(456,7);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(456,20);
					pushFollow(FOLLOW_actualparametrepart_in_u13142);
					actualparametrepart302=actualparametrepart();
					state._fsp--;

					stream_actualparametrepart.add(actualparametrepart302.getTree());
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
		dbg.location(457, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "u1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "u1"


	public static class u_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "u"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:459:1: u : ( ( ->) ':=' simpleAR -> ^( ASSIGENMENT $u simpleAR ) | ( ->) actualparametrepart | ':' w );
	public final AlgolParser.u_return u() throws RecognitionException {
		AlgolParser.u_return retval = new AlgolParser.u_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal303=null;
		Token char_literal306=null;
		ParserRuleReturnScope simpleAR304 =null;
		ParserRuleReturnScope actualparametrepart305 =null;
		ParserRuleReturnScope w307 =null;

		CommonTree string_literal303_tree=null;
		CommonTree char_literal306_tree=null;
		RewriteRuleTokenStream stream_ASSIGENMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGENMENT");
		RewriteRuleSubtreeStream stream_simpleAR=new RewriteRuleSubtreeStream(adaptor,"rule simpleAR");
		RewriteRuleSubtreeStream stream_actualparametrepart=new RewriteRuleSubtreeStream(adaptor,"rule actualparametrepart");

		try { dbg.enterRule(getGrammarFileName(), "u");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(459, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:460:9: ( ( ->) ':=' simpleAR -> ^( ASSIGENMENT $u simpleAR ) | ( ->) actualparametrepart | ':' w )
			int alt69=3;
			try { dbg.enterDecision(69, decisionCanBacktrack[69]);

			switch ( input.LA(1) ) {
			case ASSIGENMENT:
				{
				alt69=1;
				}
				break;
			case PARENTHESEO:
				{
				alt69=2;
				}
				break;
			case BORNE:
				{
				alt69=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(69);}

			switch (alt69) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:460:11: ( ->) ':=' simpleAR
					{
					dbg.location(460,11);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:460:11: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:460:12: 
					{
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
					// 460:12: ->
					{
						dbg.location(460,14);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(460,26);
					string_literal303=(Token)match(input,ASSIGENMENT,FOLLOW_ASSIGENMENT_in_u3166);  
					stream_ASSIGENMENT.add(string_literal303);
					dbg.location(460,32);
					pushFollow(FOLLOW_simpleAR_in_u3169);
					simpleAR304=simpleAR();
					state._fsp--;

					stream_simpleAR.add(simpleAR304.getTree());
					// AST REWRITE
					// elements: u, simpleAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 460:41: -> ^( ASSIGENMENT $u simpleAR )
					{
						dbg.location(460,43);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:460:43: ^( ASSIGENMENT $u simpleAR )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(460,45);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGENMENT, "ASSIGENMENT"), root_1);
						dbg.location(460,58);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(460,60);
						adaptor.addChild(root_1, stream_simpleAR.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:461:4: ( ->) actualparametrepart
					{
					dbg.location(461,4);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:461:4: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:461:5: 
					{
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
					// 461:5: ->
					{
						dbg.location(461,7);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(461,20);
					pushFollow(FOLLOW_actualparametrepart_in_u3190);
					actualparametrepart305=actualparametrepart();
					state._fsp--;

					stream_actualparametrepart.add(actualparametrepart305.getTree());
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:462:4: ':' w
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(462,4);
					char_literal306=(Token)match(input,BORNE,FOLLOW_BORNE_in_u3196); 
					char_literal306_tree = (CommonTree)adaptor.create(char_literal306);
					adaptor.addChild(root_0, char_literal306_tree);
					dbg.location(462,8);
					pushFollow(FOLLOW_w_in_u3198);
					w307=w();
					state._fsp--;

					adaptor.addChild(root_0, w307.getTree());

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
		dbg.location(463, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "u");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:465:1: w : ( forstatement ( label ':' )* forstatement | y k );
	public final AlgolParser.w_return w() throws RecognitionException {
		AlgolParser.w_return retval = new AlgolParser.w_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal310=null;
		ParserRuleReturnScope forstatement308 =null;
		ParserRuleReturnScope label309 =null;
		ParserRuleReturnScope forstatement311 =null;
		ParserRuleReturnScope y312 =null;
		ParserRuleReturnScope k313 =null;

		CommonTree char_literal310_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "w");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(465, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:465:3: ( forstatement ( label ':' )* forstatement | y k )
			int alt71=2;
			try { dbg.enterDecision(71, decisionCanBacktrack[71]);

			int LA71_0 = input.LA(1);
			if ( (LA71_0==74) ) {
				alt71=1;
			}
			else if ( (LA71_0==EOF||LA71_0==BEGIN||LA71_0==ELSE||LA71_0==GOTO||LA71_0==ID||LA71_0==INT||LA71_0==65||LA71_0==68) ) {
				alt71=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(71);}

			switch (alt71) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:465:5: forstatement ( label ':' )* forstatement
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(465,5);
					pushFollow(FOLLOW_forstatement_in_w3208);
					forstatement308=forstatement();
					state._fsp--;

					adaptor.addChild(root_0, forstatement308.getTree());
					dbg.location(465,18);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:465:18: ( label ':' )*
					try { dbg.enterSubRule(70);

					loop70:
					while (true) {
						int alt70=2;
						try { dbg.enterDecision(70, decisionCanBacktrack[70]);

						int LA70_0 = input.LA(1);
						if ( (LA70_0==ID||LA70_0==INT) ) {
							alt70=1;
						}

						} finally {dbg.exitDecision(70);}

						switch (alt70) {
						case 1 :
							dbg.enterAlt(1);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:465:19: label ':'
							{
							dbg.location(465,19);
							pushFollow(FOLLOW_label_in_w3211);
							label309=label();
							state._fsp--;

							adaptor.addChild(root_0, label309.getTree());
							dbg.location(465,25);
							char_literal310=(Token)match(input,BORNE,FOLLOW_BORNE_in_w3213); 
							char_literal310_tree = (CommonTree)adaptor.create(char_literal310);
							adaptor.addChild(root_0, char_literal310_tree);

							}
							break;

						default :
							break loop70;
						}
					}
					} finally {dbg.exitSubRule(70);}
					dbg.location(465,31);
					pushFollow(FOLLOW_forstatement_in_w3217);
					forstatement311=forstatement();
					state._fsp--;

					adaptor.addChild(root_0, forstatement311.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:466:5: y k
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(466,5);
					pushFollow(FOLLOW_y_in_w3223);
					y312=y();
					state._fsp--;

					adaptor.addChild(root_0, y312.getTree());
					dbg.location(466,7);
					pushFollow(FOLLOW_k_in_w3225);
					k313=k();
					state._fsp--;

					adaptor.addChild(root_0, k313.getTree());

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
		dbg.location(467, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "w");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "w"


	public static class actualparametrepart_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "actualparametrepart"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:481:1: actualparametrepart : ( ->) '(' actualparalist ')' ( ID ':' '(' actualparalist ')' )* -> ^( CALL $actualparametrepart actualparalist ( ^( LISTPARA ID actualparalist ) )* ) ;
	public final AlgolParser.actualparametrepart_return actualparametrepart() throws RecognitionException {
		AlgolParser.actualparametrepart_return retval = new AlgolParser.actualparametrepart_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal314=null;
		Token char_literal316=null;
		Token ID317=null;
		Token char_literal318=null;
		Token char_literal319=null;
		Token char_literal321=null;
		ParserRuleReturnScope actualparalist315 =null;
		ParserRuleReturnScope actualparalist320 =null;

		CommonTree char_literal314_tree=null;
		CommonTree char_literal316_tree=null;
		CommonTree ID317_tree=null;
		CommonTree char_literal318_tree=null;
		CommonTree char_literal319_tree=null;
		CommonTree char_literal321_tree=null;
		RewriteRuleTokenStream stream_PARENTHESEF=new RewriteRuleTokenStream(adaptor,"token PARENTHESEF");
		RewriteRuleTokenStream stream_PARENTHESEO=new RewriteRuleTokenStream(adaptor,"token PARENTHESEO");
		RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_actualparalist=new RewriteRuleSubtreeStream(adaptor,"rule actualparalist");

		try { dbg.enterRule(getGrammarFileName(), "actualparametrepart");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(481, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:482:2: ( ( ->) '(' actualparalist ')' ( ID ':' '(' actualparalist ')' )* -> ^( CALL $actualparametrepart actualparalist ( ^( LISTPARA ID actualparalist ) )* ) )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:482:4: ( ->) '(' actualparalist ')' ( ID ':' '(' actualparalist ')' )*
			{
			dbg.location(482,4);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:482:4: ( ->)
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:482:5: 
			{
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
			// 482:5: ->
			{
				dbg.location(482,7);
				adaptor.addChild(root_0, Idmemoire);
			}


			retval.tree = root_0;

			}
			dbg.location(482,19);
			char_literal314=(Token)match(input,PARENTHESEO,FOLLOW_PARENTHESEO_in_actualparametrepart3256);  
			stream_PARENTHESEO.add(char_literal314);
			dbg.location(482,23);
			pushFollow(FOLLOW_actualparalist_in_actualparametrepart3258);
			actualparalist315=actualparalist();
			state._fsp--;

			stream_actualparalist.add(actualparalist315.getTree());dbg.location(482,37);
			char_literal316=(Token)match(input,PARENTHESEF,FOLLOW_PARENTHESEF_in_actualparametrepart3259);  
			stream_PARENTHESEF.add(char_literal316);
			dbg.location(482,41);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:482:41: ( ID ':' '(' actualparalist ')' )*
			try { dbg.enterSubRule(72);

			loop72:
			while (true) {
				int alt72=2;
				try { dbg.enterDecision(72, decisionCanBacktrack[72]);

				int LA72_0 = input.LA(1);
				if ( (LA72_0==ID) ) {
					alt72=1;
				}

				} finally {dbg.exitDecision(72);}

				switch (alt72) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:482:42: ID ':' '(' actualparalist ')'
					{
					dbg.location(482,42);
					ID317=(Token)match(input,ID,FOLLOW_ID_in_actualparametrepart3262);  
					stream_ID.add(ID317);
					dbg.location(482,45);
					char_literal318=(Token)match(input,BORNE,FOLLOW_BORNE_in_actualparametrepart3264);  
					stream_BORNE.add(char_literal318);
					dbg.location(482,48);
					char_literal319=(Token)match(input,PARENTHESEO,FOLLOW_PARENTHESEO_in_actualparametrepart3265);  
					stream_PARENTHESEO.add(char_literal319);
					dbg.location(482,52);
					pushFollow(FOLLOW_actualparalist_in_actualparametrepart3267);
					actualparalist320=actualparalist();
					state._fsp--;

					stream_actualparalist.add(actualparalist320.getTree());dbg.location(482,67);
					char_literal321=(Token)match(input,PARENTHESEF,FOLLOW_PARENTHESEF_in_actualparametrepart3269);  
					stream_PARENTHESEF.add(char_literal321);

					}
					break;

				default :
					break loop72;
				}
			}
			} finally {dbg.exitSubRule(72);}

			// AST REWRITE
			// elements: actualparametrepart, actualparalist, ID, actualparalist
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 482:73: -> ^( CALL $actualparametrepart actualparalist ( ^( LISTPARA ID actualparalist ) )* )
			{
				dbg.location(482,75);
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:482:75: ^( CALL $actualparametrepart actualparalist ( ^( LISTPARA ID actualparalist ) )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(482,77);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);
				dbg.location(482,83);
				adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(482,103);
				adaptor.addChild(root_1, stream_actualparalist.nextTree());dbg.location(482,118);
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:482:118: ( ^( LISTPARA ID actualparalist ) )*
				while ( stream_ID.hasNext()||stream_actualparalist.hasNext() ) {
					dbg.location(482,118);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:482:118: ^( LISTPARA ID actualparalist )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					dbg.location(482,120);
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTPARA, "LISTPARA"), root_2);
					dbg.location(482,129);
					adaptor.addChild(root_2, stream_ID.nextNode());dbg.location(482,132);
					adaptor.addChild(root_2, stream_actualparalist.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_ID.reset();
				stream_actualparalist.reset();

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
		dbg.location(484, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "actualparametrepart");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "actualparametrepart"


	public static class actualparametrepart2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "actualparametrepart2"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:486:1: actualparametrepart2 : ( ( ->) '(' actualparalist ')' ( ID ':' '(' actualparalist ')' )* -> ^( CALL $actualparametrepart2 actualparalist ( ^( LISTPARA ID actualparalist ) )* ) |);
	public final AlgolParser.actualparametrepart2_return actualparametrepart2() throws RecognitionException {
		AlgolParser.actualparametrepart2_return retval = new AlgolParser.actualparametrepart2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal322=null;
		Token char_literal324=null;
		Token ID325=null;
		Token char_literal326=null;
		Token char_literal327=null;
		Token char_literal329=null;
		ParserRuleReturnScope actualparalist323 =null;
		ParserRuleReturnScope actualparalist328 =null;

		CommonTree char_literal322_tree=null;
		CommonTree char_literal324_tree=null;
		CommonTree ID325_tree=null;
		CommonTree char_literal326_tree=null;
		CommonTree char_literal327_tree=null;
		CommonTree char_literal329_tree=null;
		RewriteRuleTokenStream stream_PARENTHESEF=new RewriteRuleTokenStream(adaptor,"token PARENTHESEF");
		RewriteRuleTokenStream stream_PARENTHESEO=new RewriteRuleTokenStream(adaptor,"token PARENTHESEO");
		RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_actualparalist=new RewriteRuleSubtreeStream(adaptor,"rule actualparalist");

		try { dbg.enterRule(getGrammarFileName(), "actualparametrepart2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(486, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:487:2: ( ( ->) '(' actualparalist ')' ( ID ':' '(' actualparalist ')' )* -> ^( CALL $actualparametrepart2 actualparalist ( ^( LISTPARA ID actualparalist ) )* ) |)
			int alt74=2;
			try { dbg.enterDecision(74, decisionCanBacktrack[74]);

			int LA74_0 = input.LA(1);
			if ( (LA74_0==PARENTHESEO) ) {
				alt74=1;
			}
			else if ( (LA74_0==EOF||LA74_0==65||LA74_0==68) ) {
				alt74=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(74);}

			switch (alt74) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:487:4: ( ->) '(' actualparalist ')' ( ID ':' '(' actualparalist ')' )*
					{
					dbg.location(487,4);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:487:4: ( ->)
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:487:5: 
					{
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
					// 487:5: ->
					{
						dbg.location(487,7);
						adaptor.addChild(root_0, Idmemoire);
					}


					retval.tree = root_0;

					}
					dbg.location(487,19);
					char_literal322=(Token)match(input,PARENTHESEO,FOLLOW_PARENTHESEO_in_actualparametrepart23308);  
					stream_PARENTHESEO.add(char_literal322);
					dbg.location(487,23);
					pushFollow(FOLLOW_actualparalist_in_actualparametrepart23310);
					actualparalist323=actualparalist();
					state._fsp--;

					stream_actualparalist.add(actualparalist323.getTree());dbg.location(487,37);
					char_literal324=(Token)match(input,PARENTHESEF,FOLLOW_PARENTHESEF_in_actualparametrepart23311);  
					stream_PARENTHESEF.add(char_literal324);
					dbg.location(487,41);
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:487:41: ( ID ':' '(' actualparalist ')' )*
					try { dbg.enterSubRule(73);

					loop73:
					while (true) {
						int alt73=2;
						try { dbg.enterDecision(73, decisionCanBacktrack[73]);

						int LA73_0 = input.LA(1);
						if ( (LA73_0==ID) ) {
							alt73=1;
						}

						} finally {dbg.exitDecision(73);}

						switch (alt73) {
						case 1 :
							dbg.enterAlt(1);

							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:487:42: ID ':' '(' actualparalist ')'
							{
							dbg.location(487,42);
							ID325=(Token)match(input,ID,FOLLOW_ID_in_actualparametrepart23314);  
							stream_ID.add(ID325);
							dbg.location(487,45);
							char_literal326=(Token)match(input,BORNE,FOLLOW_BORNE_in_actualparametrepart23316);  
							stream_BORNE.add(char_literal326);
							dbg.location(487,48);
							char_literal327=(Token)match(input,PARENTHESEO,FOLLOW_PARENTHESEO_in_actualparametrepart23317);  
							stream_PARENTHESEO.add(char_literal327);
							dbg.location(487,52);
							pushFollow(FOLLOW_actualparalist_in_actualparametrepart23319);
							actualparalist328=actualparalist();
							state._fsp--;

							stream_actualparalist.add(actualparalist328.getTree());dbg.location(487,67);
							char_literal329=(Token)match(input,PARENTHESEF,FOLLOW_PARENTHESEF_in_actualparametrepart23321);  
							stream_PARENTHESEF.add(char_literal329);

							}
							break;

						default :
							break loop73;
						}
					}
					} finally {dbg.exitSubRule(73);}

					// AST REWRITE
					// elements: actualparalist, actualparametrepart2, ID, actualparalist
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 487:73: -> ^( CALL $actualparametrepart2 actualparalist ( ^( LISTPARA ID actualparalist ) )* )
					{
						dbg.location(487,75);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:487:75: ^( CALL $actualparametrepart2 actualparalist ( ^( LISTPARA ID actualparalist ) )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(487,77);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);
						dbg.location(487,83);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(487,104);
						adaptor.addChild(root_1, stream_actualparalist.nextTree());dbg.location(487,119);
						// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:487:119: ( ^( LISTPARA ID actualparalist ) )*
						while ( stream_ID.hasNext()||stream_actualparalist.hasNext() ) {
							dbg.location(487,119);
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:487:119: ^( LISTPARA ID actualparalist )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							dbg.location(487,121);
							root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTPARA, "LISTPARA"), root_2);
							dbg.location(487,130);
							adaptor.addChild(root_2, stream_ID.nextNode());dbg.location(487,133);
							adaptor.addChild(root_2, stream_actualparalist.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_ID.reset();
						stream_actualparalist.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:489:2: 
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
		dbg.location(489, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "actualparametrepart2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "actualparametrepart2"


	public static class actualparalist_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "actualparalist"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:491:1: actualparalist : actualpara ( ',' actualpara )* -> ^( LISTARG ( actualpara )* ) ;
	public final AlgolParser.actualparalist_return actualparalist() throws RecognitionException {
		AlgolParser.actualparalist_return retval = new AlgolParser.actualparalist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal331=null;
		ParserRuleReturnScope actualpara330 =null;
		ParserRuleReturnScope actualpara332 =null;

		CommonTree char_literal331_tree=null;
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_actualpara=new RewriteRuleSubtreeStream(adaptor,"rule actualpara");

		try { dbg.enterRule(getGrammarFileName(), "actualparalist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(491, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:492:2: ( actualpara ( ',' actualpara )* -> ^( LISTARG ( actualpara )* ) )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:492:4: actualpara ( ',' actualpara )*
			{
			dbg.location(492,4);
			pushFollow(FOLLOW_actualpara_in_actualparalist3357);
			actualpara330=actualpara();
			state._fsp--;

			stream_actualpara.add(actualpara330.getTree());dbg.location(492,15);
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:492:15: ( ',' actualpara )*
			try { dbg.enterSubRule(75);

			loop75:
			while (true) {
				int alt75=2;
				try { dbg.enterDecision(75, decisionCanBacktrack[75]);

				int LA75_0 = input.LA(1);
				if ( (LA75_0==63) ) {
					alt75=1;
				}

				} finally {dbg.exitDecision(75);}

				switch (alt75) {
				case 1 :
					dbg.enterAlt(1);

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:492:16: ',' actualpara
					{
					dbg.location(492,16);
					char_literal331=(Token)match(input,63,FOLLOW_63_in_actualparalist3360);  
					stream_63.add(char_literal331);
					dbg.location(492,20);
					pushFollow(FOLLOW_actualpara_in_actualparalist3362);
					actualpara332=actualpara();
					state._fsp--;

					stream_actualpara.add(actualpara332.getTree());
					}
					break;

				default :
					break loop75;
				}
			}
			} finally {dbg.exitSubRule(75);}

			// AST REWRITE
			// elements: actualpara
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 492:32: -> ^( LISTARG ( actualpara )* )
			{
				dbg.location(492,34);
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:492:34: ^( LISTARG ( actualpara )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(492,36);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTARG, "LISTARG"), root_1);
				dbg.location(492,44);
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:492:44: ( actualpara )*
				while ( stream_actualpara.hasNext() ) {
					dbg.location(492,44);
					adaptor.addChild(root_1, stream_actualpara.nextTree());
				}
				stream_actualpara.reset();

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
		dbg.location(493, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "actualparalist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:500:1: actualpara : expression2 -> expression2 ;
	public final AlgolParser.actualpara_return actualpara() throws RecognitionException {
		AlgolParser.actualpara_return retval = new AlgolParser.actualpara_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression2333 =null;

		RewriteRuleSubtreeStream stream_expression2=new RewriteRuleSubtreeStream(adaptor,"rule expression2");

		try { dbg.enterRule(getGrammarFileName(), "actualpara");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(500, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:501:2: ( expression2 -> expression2 )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:501:4: expression2
			{
			dbg.location(501,4);
			pushFollow(FOLLOW_expression2_in_actualpara3386);
			expression2333=expression2();
			state._fsp--;

			stream_expression2.add(expression2333.getTree());
			// AST REWRITE
			// elements: expression2
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 501:15: -> expression2
			{
				dbg.location(501,17);
				adaptor.addChild(root_0, stream_expression2.nextTree());
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
		dbg.location(502, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "actualpara");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "actualpara"


	public static class gotostatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "gotostatement"
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:511:1: gotostatement : 'GOTO' designExp -> ^( 'GOTO' designExp ) ;
	public final AlgolParser.gotostatement_return gotostatement() throws RecognitionException {
		AlgolParser.gotostatement_return retval = new AlgolParser.gotostatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal334=null;
		ParserRuleReturnScope designExp335 =null;

		CommonTree string_literal334_tree=null;
		RewriteRuleTokenStream stream_GOTO=new RewriteRuleTokenStream(adaptor,"token GOTO");
		RewriteRuleSubtreeStream stream_designExp=new RewriteRuleSubtreeStream(adaptor,"rule designExp");

		try { dbg.enterRule(getGrammarFileName(), "gotostatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(511, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:512:2: ( 'GOTO' designExp -> ^( 'GOTO' designExp ) )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:512:4: 'GOTO' designExp
			{
			dbg.location(512,4);
			string_literal334=(Token)match(input,GOTO,FOLLOW_GOTO_in_gotostatement3411);  
			stream_GOTO.add(string_literal334);
			dbg.location(512,11);
			pushFollow(FOLLOW_designExp_in_gotostatement3413);
			designExp335=designExp();
			state._fsp--;

			stream_designExp.add(designExp335.getTree());
			// AST REWRITE
			// elements: designExp, GOTO
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 512:20: -> ^( 'GOTO' designExp )
			{
				dbg.location(512,23);
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:512:23: ^( 'GOTO' designExp )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(512,25);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_GOTO.nextNode(), root_1);
				dbg.location(512,32);
				adaptor.addChild(root_1, stream_designExp.nextTree());
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
		dbg.location(513, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "gotostatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:517:1: forstatement : 'a' ;
	public final AlgolParser.forstatement_return forstatement() throws RecognitionException {
		AlgolParser.forstatement_return retval = new AlgolParser.forstatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal336=null;

		CommonTree char_literal336_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "forstatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(517, 0);

		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:518:2: ( 'a' )
			dbg.enterAlt(1);

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol.g:518:4: 'a'
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(518,4);
			char_literal336=(Token)match(input,74,FOLLOW_74_in_forstatement3435); 
			char_literal336_tree = (CommonTree)adaptor.create(char_literal336);
			adaptor.addChild(root_0, char_literal336_tree);

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
		dbg.location(519, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "forstatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "forstatement"

	// Delegated rules



	public static final BitSet FOLLOW_prog1_in_prog288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleAR_in_expression309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expression318 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_expression320 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_THEN_in_expression322 = new BitSet(new long[]{0x0000400090010000L});
	public static final BitSet FOLLOW_simpleDesign_in_expression324 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ELSE_in_expression326 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_expression328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDesign_in_ei357 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ELSE_in_ei359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleLOG_in_simpleAR372 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASSIGENMENT_in_simpleAR374 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_simpleLOgi2_in_simpleAR377 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_simpleLOgi22_in_simpleLOG391 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_EQV_in_simpleLOG393 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_simpleLOgi22_in_simpleLOG396 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_simpleLOgi2_in_simpleLOgi22410 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_IMPL_in_simpleLOgi22412 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_simpleLOgi2_in_simpleLOgi22415 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_simpleLOgi_in_simpleLOgi2429 = new BitSet(new long[]{0x0000108000000022L});
	public static final BitSet FOLLOW_AND_in_simpleLOgi2432 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_OR_in_simpleLOgi2435 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_NOT_in_simpleLOgi2438 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_simpleLOgi_in_simpleLOgi2441 = new BitSet(new long[]{0x0000108000000022L});
	public static final BitSet FOLLOW_simpleARi_in_simpleLOgi455 = new BitSet(new long[]{0x0000070204020002L});
	public static final BitSet FOLLOW_GREATER_in_simpleLOgi458 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LESS_in_simpleLOgi461 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_EQUAL_in_simpleLOgi464 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_NOTLESS_in_simpleLOgi467 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_NOTGREATER_in_simpleLOgi470 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_NOTEQUAL_in_simpleLOgi473 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_simpleARi_in_simpleLOgi476 = new BitSet(new long[]{0x0000070204020002L});
	public static final BitSet FOLLOW_multExp_in_simpleARi488 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_PLUS_in_simpleARi491 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_64_in_simpleARi494 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_multExp_in_simpleARi498 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_multExp22_in_multExp509 = new BitSet(new long[]{0x0000004000008002L});
	public static final BitSet FOLLOW_MULT_in_multExp512 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_DIV_in_multExp515 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_multExp22_in_multExp518 = new BitSet(new long[]{0x0000004000008002L});
	public static final BitSet FOLLOW_powExp_in_multExp22534 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_multExp22536 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_powExp_in_multExp22539 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_PARENTHESEO_in_powExp563 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_powExp565 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_PARENTHESEF_in_powExp567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_powExp581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_powExp593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_powExp605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_powExp617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_powExp630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_powExp642 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_beginwithID_in_powExp651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualparametrepart_in_beginwithID672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_beginwithID689 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_beginwithID690 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_63_in_beginwithID693 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_beginwithID695 = new BitSet(new long[]{0x8000200000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PARENTHESEF_in_beginwithID697 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_beginwithID701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleAR2_in_expression2739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expression2743 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_expression2745 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_THEN_in_expression2747 = new BitSet(new long[]{0x0000400090010000L});
	public static final BitSet FOLLOW_ei_in_expression2749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_infixLog_in_simpleAR2764 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASSIGENMENT_in_simpleAR2766 = new BitSet(new long[]{0x0022400090000000L});
	public static final BitSet FOLLOW_infixLog_in_simpleAR2769 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_simpleARi2_in_infixLog782 = new BitSet(new long[]{0x0000100000000022L});
	public static final BitSet FOLLOW_OR_in_infixLog785 = new BitSet(new long[]{0x0022400090000000L});
	public static final BitSet FOLLOW_AND_in_infixLog788 = new BitSet(new long[]{0x0022400090000000L});
	public static final BitSet FOLLOW_simpleARi2_in_infixLog791 = new BitSet(new long[]{0x0000100000000022L});
	public static final BitSet FOLLOW_multExp33_in_simpleARi2803 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_PLUS_in_simpleARi2806 = new BitSet(new long[]{0x0022400090000000L});
	public static final BitSet FOLLOW_64_in_simpleARi2811 = new BitSet(new long[]{0x0022400090000000L});
	public static final BitSet FOLLOW_multExp33_in_simpleARi2815 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_multExp2_in_multExp33829 = new BitSet(new long[]{0x0000004000008002L});
	public static final BitSet FOLLOW_MULT_in_multExp33832 = new BitSet(new long[]{0x0022400090000000L});
	public static final BitSet FOLLOW_DIV_in_multExp33837 = new BitSet(new long[]{0x0022400090000000L});
	public static final BitSet FOLLOW_multExp2_in_multExp33841 = new BitSet(new long[]{0x0000004000008002L});
	public static final BitSet FOLLOW_powExp2_in_multExp2855 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_POWER_in_multExp2857 = new BitSet(new long[]{0x0022400090000000L});
	public static final BitSet FOLLOW_powExp2_in_multExp2860 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_ID_in_powExp2884 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_beginwithID_in_powExp2893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_powExp2909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_powExp2923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHESEO_in_powExp2936 = new BitSet(new long[]{0x00224000B0000000L});
	public static final BitSet FOLLOW_expression2_in_powExp2938 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_PARENTHESEF_in_powExp2940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier955 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_o_in_identifier964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_identifier970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_o985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_o1012 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_o1013 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_63_in_o1016 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_o1018 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_o1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_d1110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_d1112 = new BitSet(new long[]{0x0E44402032802100L,0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_d1115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_d1117 = new BitSet(new long[]{0x0E44402032802100L,0x0000000000000004L});
	public static final BitSet FOLLOW_compoundT_in_d1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundT_in_d1139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_prog11157 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog11159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_prog11182 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BORNE_in_prog11184 = new BitSet(new long[]{0x0000000090000100L});
	public static final BitSet FOLLOW_begin_in_prog11188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_localorown1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCAL_in_localorown1263 = new BitSet(new long[]{0x0E00000000000000L});
	public static final BitSet FOLLOW_type_in_localorown1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_typeliste1325 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_typeliste1328 = new BitSet(new long[]{0x0000000090000000L});
	public static final BitSet FOLLOW_identifier_in_typeliste1330 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_arrayseg_in_arraylist1355 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_arraylist1357 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_arrayseg_in_arraylist1358 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_ID_in_arrayseg1381 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_r_in_arrayseg1390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_r1427 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_boundplist_in_r1429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_r1430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_r1445 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_arrayseg_in_r1447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boundp_in_boundplist1468 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_boundplist1471 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_boundp_in_boundplist1473 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_simpleARi_in_boundp1496 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BORNE_in_boundp1498 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_simpleARi_in_boundp1500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeliste_in_typedeclaration1519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_typedeclaration1522 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_arraylist_in_typedeclaration1524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_in_typedeclaration1533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_typedeclaration21543 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_arraylist_in_typedeclaration21545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_in_typedeclaration21554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_switchdec1566 = new BitSet(new long[]{0x0000000090000000L});
	public static final BitSet FOLLOW_identifier_in_switchdec1568 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGENMENT_in_switchdec1570 = new BitSet(new long[]{0x00004000B0000000L});
	public static final BitSet FOLLOW_switchlist_in_switchdec1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designExp_in_switchlist1598 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_switchlist1601 = new BitSet(new long[]{0x00004000B0000000L});
	public static final BitSet FOLLOW_designExp_in_switchlist1602 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_PROCEDURE_in_procedure1620 = new BitSet(new long[]{0x0000000090000000L});
	public static final BitSet FOLLOW_procedurehead_in_procedure1622 = new BitSet(new long[]{0x0000400032802100L});
	public static final BitSet FOLLOW_statement_in_procedure1624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_procedurehead1648 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_formalparameterpart_in_procedurehead1650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_procedurehead1652 = new BitSet(new long[]{0x0E44000100000000L,0x00000000000000C4L});
	public static final BitSet FOLLOW_valuepart_in_procedurehead1654 = new BitSet(new long[]{0x0E44000100000000L,0x0000000000000044L});
	public static final BitSet FOLLOW_specificationpart_in_procedurehead1656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHESEO_in_formalparameterpart1687 = new BitSet(new long[]{0x00224000B0000000L});
	public static final BitSet FOLLOW_formalparameterlist_in_formalparameterpart1689 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_PARENTHESEF_in_formalparameterpart1691 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_ID_in_formalparameterpart1694 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BORNE_in_formalparameterpart1696 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_PARENTHESEO_in_formalparameterpart1697 = new BitSet(new long[]{0x00224000B0000000L});
	public static final BitSet FOLLOW_formalparameterlist_in_formalparameterpart1699 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_PARENTHESEF_in_formalparameterpart1701 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_specifier_in_specificationpart1734 = new BitSet(new long[]{0x0000000090000000L});
	public static final BitSet FOLLOW_identifierlist_in_specificationpart1736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_specificationpart1738 = new BitSet(new long[]{0x0E44000100000002L,0x0000000000000044L});
	public static final BitSet FOLLOW_specifier_in_specificationpart1741 = new BitSet(new long[]{0x0000000090000000L});
	public static final BitSet FOLLOW_identifierlist_in_specificationpart1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_specificationpart1745 = new BitSet(new long[]{0x0E44000100000002L,0x0000000000000044L});
	public static final BitSet FOLLOW_identifier_in_identifierlist1772 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_identifierlist1775 = new BitSet(new long[]{0x0000000090000000L});
	public static final BitSet FOLLOW_identifier_in_identifierlist1776 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_70_in_specifier1792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_specifier1798 = new BitSet(new long[]{0x0404000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_h_in_specifier1801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_specifier1808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LABEL_in_specifier1814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_specifier1822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROCEDURE_in_specifier1826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_h1839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROCEDURE_in_h1842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEINT_in_h1844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalpara_in_formalparameterlist1856 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_formalparameterlist1859 = new BitSet(new long[]{0x00224000B0000000L});
	public static final BitSet FOLLOW_formalpara_in_formalparameterlist1861 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_expression2_in_formalpara1881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_valuepart1908 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_identifier2_in_valuepart1910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier21939 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_identifier21941 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_identifier21942 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_simpleDesign_in_designExp1962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_designExp1966 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_designExp1968 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_THEN_in_designExp1970 = new BitSet(new long[]{0x0000400090010000L});
	public static final BitSet FOLLOW_simpleDesign_in_designExp1972 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ELSE_in_designExp1974 = new BitSet(new long[]{0x00004000B0000000L});
	public static final BitSet FOLLOW_designExp_in_designExp1976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_simpleDesign1991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHESEO_in_simpleDesign1996 = new BitSet(new long[]{0x00004000B0000000L});
	public static final BitSet FOLLOW_designExp_in_simpleDesign1998 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_PARENTHESEF_in_simpleDesign2000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localorown_in_declaration2033 = new BitSet(new long[]{0x0004000090000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_typedeclaration_in_declaration2035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typedeclaration2_in_declaration2052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchdec_in_declaration2070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_begin2081 = new BitSet(new long[]{0x0E44402032802100L,0x0000000000000004L});
	public static final BitSet FOLLOW_d_in_begin2083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_compoundT2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000012L});
	public static final BitSet FOLLOW_c_in_compoundT2111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_c2125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_c2129 = new BitSet(new long[]{0x0000400032802100L});
	public static final BitSet FOLLOW_compoundT_in_c2131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memoire_in_statement2151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gotostatement_in_statement2157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_statement2163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement2167 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_statement2169 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_THEN_in_statement2171 = new BitSet(new long[]{0x0000000012800100L});
	public static final BitSet FOLLOW_j_in_statement2173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_statement2189 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_simpleARi_in_statement2191 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGENMENT_in_statement2193 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_forlist_in_statement2195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_statement2197 = new BitSet(new long[]{0x0000400032802100L});
	public static final BitSet FOLLOW_statement_in_statement2199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_statement2225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualparametrepart_in_statement2231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_memoire2241 = new BitSet(new long[]{0x0000400000000480L,0x0000000000000100L});
	public static final BitSet FOLLOW_rs_in_memoire2249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT2_in_comment2262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGENMENT_in_rs2277 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_simpleAR_in_rs2279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualparametrepart2_in_rs2293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_rs2301 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_rs2302 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_63_in_rs2305 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_rs2307 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_rs2310 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGENMENT_in_rs2312 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_simpleAR_in_rs2314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BORNE_in_rs2352 = new BitSet(new long[]{0x00004000B2802500L});
	public static final BitSet FOLLOW_m_in_rs2354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label2_in_m2374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gotostatement_in_m2393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_m2406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_m2415 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_m2417 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_THEN_in_m2419 = new BitSet(new long[]{0x0000000012800100L});
	public static final BitSet FOLLOW_j_in_m2421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_m2448 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_simpleARi_in_m2450 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGENMENT_in_m2452 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_forlist_in_m2454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_m2456 = new BitSet(new long[]{0x0000400032802100L});
	public static final BitSet FOLLOW_statement_in_m2458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_m2491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualparametrepart2_in_m2510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BORNE_in_m2514 = new BitSet(new long[]{0x00004000B2802500L});
	public static final BitSet FOLLOW_m_in_m2515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_label22602 = new BitSet(new long[]{0x0000400000000480L});
	public static final BitSet FOLLOW_v_in_label22610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_label22630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGENMENT_in_v2649 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_simpleAR_in_v2652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualparametrepart2_in_v2670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BORNE_in_v2678 = new BitSet(new long[]{0x00004000B2802500L});
	public static final BitSet FOLLOW_m_in_v2679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forlistelement_in_forlist2744 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_forlist2747 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_forlistelement_in_forlist2748 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_expression_in_forlistelement2770 = new BitSet(new long[]{0x2000800000000000L});
	public static final BitSet FOLLOW_q_in_forlistelement2772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PAS_in_q2792 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_simpleARi_in_q2793 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BORNESUPP_in_q2795 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_q2796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_q2820 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_q2821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_k2858 = new BitSet(new long[]{0x0000400032802100L});
	public static final BitSet FOLLOW_statement_in_k2860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_y2896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gotostatement_in_y2902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_y2906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_j2923 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_simpleARi_in_j2925 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGENMENT_in_j2927 = new BitSet(new long[]{0x01204000B0600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_forlist_in_j2929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_j2931 = new BitSet(new long[]{0x0000400032802100L});
	public static final BitSet FOLLOW_statement_in_j2933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_j2975 = new BitSet(new long[]{0x0000400000000480L});
	public static final BitSet FOLLOW_r2_in_j2984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gotostatement_in_j3032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_begin_in_j3055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_u1_in_r23068 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_k_in_r23070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BORNE_in_r23093 = new BitSet(new long[]{0x0000000092010100L,0x0000000000000400L});
	public static final BitSet FOLLOW_w_in_r23095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGENMENT_in_u13118 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_simpleAR_in_u13121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualparametrepart_in_u13142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGENMENT_in_u3166 = new BitSet(new long[]{0x0120400090600000L,0x0000000000000020L});
	public static final BitSet FOLLOW_simpleAR_in_u3169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualparametrepart_in_u3190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BORNE_in_u3196 = new BitSet(new long[]{0x0000000092010100L,0x0000000000000400L});
	public static final BitSet FOLLOW_w_in_u3198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstatement_in_w3208 = new BitSet(new long[]{0x0000000090000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_label_in_w3211 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BORNE_in_w3213 = new BitSet(new long[]{0x0000000090000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_forstatement_in_w3217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_y_in_w3223 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_k_in_w3225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHESEO_in_actualparametrepart3256 = new BitSet(new long[]{0x00224000B0000000L});
	public static final BitSet FOLLOW_actualparalist_in_actualparametrepart3258 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_PARENTHESEF_in_actualparametrepart3259 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_ID_in_actualparametrepart3262 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BORNE_in_actualparametrepart3264 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_PARENTHESEO_in_actualparametrepart3265 = new BitSet(new long[]{0x00224000B0000000L});
	public static final BitSet FOLLOW_actualparalist_in_actualparametrepart3267 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_PARENTHESEF_in_actualparametrepart3269 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_PARENTHESEO_in_actualparametrepart23308 = new BitSet(new long[]{0x00224000B0000000L});
	public static final BitSet FOLLOW_actualparalist_in_actualparametrepart23310 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_PARENTHESEF_in_actualparametrepart23311 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_ID_in_actualparametrepart23314 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BORNE_in_actualparametrepart23316 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_PARENTHESEO_in_actualparametrepart23317 = new BitSet(new long[]{0x00224000B0000000L});
	public static final BitSet FOLLOW_actualparalist_in_actualparametrepart23319 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_PARENTHESEF_in_actualparametrepart23321 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_actualpara_in_actualparalist3357 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_actualparalist3360 = new BitSet(new long[]{0x00224000B0000000L});
	public static final BitSet FOLLOW_actualpara_in_actualparalist3362 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_expression2_in_actualpara3386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GOTO_in_gotostatement3411 = new BitSet(new long[]{0x00004000B0000000L});
	public static final BitSet FOLLOW_designExp_in_gotostatement3413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_forstatement3435 = new BitSet(new long[]{0x0000000000000002L});
}
