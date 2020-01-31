// $ANTLR null /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g 2019-04-10 14:54:38
package grammar;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class tigerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFFECTATION", "AND", "APPELFONCTION", 
		"ARG", "ARRAY", "ARREC", "ASSIG", "ATTRIBUT", "BLOCK", "BLOCKF", "BODY", 
		"COND", "DIV", "DO", "DOT", "EQ", "FIELD", "FIELDCREATE", "FOR", "FUNCTION", 
		"GE", "GT", "ID", "IF", "IN", "INTLIT", "LE", "LET", "LISTEARG", "LT", 
		"MOINS", "MULT", "NE", "NEGATION", "NIMP", "OR", "PLUS", "PRINT", "ROOT", 
		"SEQEXP", "STRINGLIT", "SUB", "SUBFIELD", "TO", "TYID", "TYPE", "TYPEDERETOUR", 
		"VAR", "VOID", "WHILE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", 
		"'Break'", "'['", "']'", "'array of'", "'do'", "'else'", "'end'", "'for'", 
		"'function'", "'if'", "'in'", "'let'", "'nil'", "'of'", "'then'", "'to'", 
		"'type'", "'var'", "'while'", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int AFFECTATION=4;
	public static final int AND=5;
	public static final int APPELFONCTION=6;
	public static final int ARG=7;
	public static final int ARRAY=8;
	public static final int ARREC=9;
	public static final int ASSIG=10;
	public static final int ATTRIBUT=11;
	public static final int BLOCK=12;
	public static final int BLOCKF=13;
	public static final int BODY=14;
	public static final int COND=15;
	public static final int DIV=16;
	public static final int DO=17;
	public static final int DOT=18;
	public static final int EQ=19;
	public static final int FIELD=20;
	public static final int FIELDCREATE=21;
	public static final int FOR=22;
	public static final int FUNCTION=23;
	public static final int GE=24;
	public static final int GT=25;
	public static final int ID=26;
	public static final int IF=27;
	public static final int IN=28;
	public static final int INTLIT=29;
	public static final int LE=30;
	public static final int LET=31;
	public static final int LISTEARG=32;
	public static final int LT=33;
	public static final int MOINS=34;
	public static final int MULT=35;
	public static final int NE=36;
	public static final int NEGATION=37;
	public static final int NIMP=38;
	public static final int OR=39;
	public static final int PLUS=40;
	public static final int PRINT=41;
	public static final int ROOT=42;
	public static final int SEQEXP=43;
	public static final int STRINGLIT=44;
	public static final int SUB=45;
	public static final int SUBFIELD=46;
	public static final int TO=47;
	public static final int TYID=48;
	public static final int TYPE=49;
	public static final int TYPEDERETOUR=50;
	public static final int VAR=51;
	public static final int VOID=52;
	public static final int WHILE=53;
	public static final int WS=54;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tigerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tigerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return tigerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g"; }


	public static class fichier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fichier"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:66:1: fichier : expression -> ^( ROOT expression ) ;
	public final fichier_return fichier() throws RecognitionException {
		fichier_return retval = new fichier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression1 =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:67:5: ( expression -> ^( ROOT expression ) )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:67:9: expression
			{
			pushFollow(FOLLOW_expression_in_fichier408);
			expression1=expression();
			state._fsp--;

			stream_expression.add(expression1.getTree());
			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 67:37: -> ^( ROOT expression )
			{
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:67:40: ^( ROOT expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fichier"


	public static class decl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:70:1: decl : ( tyDec | varDec | funDec );
	public final decl_return decl() throws RecognitionException {
		decl_return retval = new decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope tyDec2 =null;
		ParserRuleReturnScope varDec3 =null;
		ParserRuleReturnScope funDec4 =null;


		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:71:5: ( tyDec | varDec | funDec )
			int alt1=3;
			switch ( input.LA(1) ) {
			case 77:
				{
				alt1=1;
				}
				break;
			case 78:
				{
				alt1=2;
				}
				break;
			case 69:
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
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:71:9: tyDec
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tyDec_in_decl499);
					tyDec2=tyDec();
					state._fsp--;

					adaptor.addChild(root_0, tyDec2.getTree());

					}
					break;
				case 2 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:72:9: varDec
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_varDec_in_decl509);
					varDec3=varDec();
					state._fsp--;

					adaptor.addChild(root_0, varDec3.getTree());

					}
					break;
				case 3 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:73:9: funDec
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_funDec_in_decl519);
					funDec4=funDec();
					state._fsp--;

					adaptor.addChild(root_0, funDec4.getTree());

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl"


	public static class tyDec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tyDec"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:76:1: tyDec : 'type' ID '=' ty -> ^( TYPE ID ty ) ;
	public final tyDec_return tyDec() throws RecognitionException {
		tyDec_return retval = new tyDec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal5=null;
		Token ID6=null;
		Token char_literal7=null;
		ParserRuleReturnScope ty8 =null;

		Object string_literal5_tree=null;
		Object ID6_tree=null;
		Object char_literal7_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
		RewriteRuleSubtreeStream stream_ty=new RewriteRuleSubtreeStream(adaptor,"rule ty");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:77:5: ( 'type' ID '=' ty -> ^( TYPE ID ty ) )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:77:9: 'type' ID '=' ty
			{
			string_literal5=(Token)match(input,77,FOLLOW_77_in_tyDec538);  
			stream_77.add(string_literal5);

			ID6=(Token)match(input,ID,FOLLOW_ID_in_tyDec539);  
			stream_ID.add(ID6);

			char_literal7=(Token)match(input,EQ,FOLLOW_EQ_in_tyDec540);  
			stream_EQ.add(char_literal7);

			pushFollow(FOLLOW_ty_in_tyDec541);
			ty8=ty();
			state._fsp--;

			stream_ty.add(ty8.getTree());
			// AST REWRITE
			// elements: ID, ty
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 77:24: -> ^( TYPE ID ty )
			{
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:77:26: ^( TYPE ID ty )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_ty.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tyDec"


	public static class ty_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ty"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:80:1: ty : ( ID | arrTy | recTy );
	public final ty_return ty() throws RecognitionException {
		ty_return retval = new ty_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID9=null;
		ParserRuleReturnScope arrTy10 =null;
		ParserRuleReturnScope recTy11 =null;

		Object ID9_tree=null;

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:81:5: ( ID | arrTy | recTy )
			int alt2=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt2=1;
				}
				break;
			case 64:
				{
				alt2=2;
				}
				break;
			case 80:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:81:9: ID
					{
					root_0 = (Object)adaptor.nil();


					ID9=(Token)match(input,ID,FOLLOW_ID_in_ty578); 
					ID9_tree = (Object)adaptor.create(ID9);
					adaptor.addChild(root_0, ID9_tree);

					}
					break;
				case 2 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:82:9: arrTy
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arrTy_in_ty588);
					arrTy10=arrTy();
					state._fsp--;

					adaptor.addChild(root_0, arrTy10.getTree());

					}
					break;
				case 3 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:83:9: recTy
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_recTy_in_ty598);
					recTy11=recTy();
					state._fsp--;

					adaptor.addChild(root_0, recTy11.getTree());

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ty"


	public static class arrTy_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrTy"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:86:1: arrTy : 'array of' ID -> ^( ARRAY ( ID )+ ) ;
	public final arrTy_return arrTy() throws RecognitionException {
		arrTy_return retval = new arrTy_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal12=null;
		Token ID13=null;

		Object string_literal12_tree=null;
		Object ID13_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:87:5: ( 'array of' ID -> ^( ARRAY ( ID )+ ) )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:87:9: 'array of' ID
			{
			string_literal12=(Token)match(input,64,FOLLOW_64_in_arrTy618);  
			stream_64.add(string_literal12);

			ID13=(Token)match(input,ID,FOLLOW_ID_in_arrTy619);  
			stream_ID.add(ID13);

			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 87:30: -> ^( ARRAY ( ID )+ )
			{
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:87:34: ^( ARRAY ( ID )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);
				if ( !(stream_ID.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_ID.hasNext() ) {
					adaptor.addChild(root_1, stream_ID.nextNode());
				}
				stream_ID.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrTy"


	public static class recTy_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "recTy"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:90:1: recTy : '{' ( fieldDec ( ',' fieldDec )* )? '}' -> ( fieldDec )* ;
	public final recTy_return recTy() throws RecognitionException {
		recTy_return retval = new recTy_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal14=null;
		Token char_literal16=null;
		Token char_literal18=null;
		ParserRuleReturnScope fieldDec15 =null;
		ParserRuleReturnScope fieldDec17 =null;

		Object char_literal14_tree=null;
		Object char_literal16_tree=null;
		Object char_literal18_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleSubtreeStream stream_fieldDec=new RewriteRuleSubtreeStream(adaptor,"rule fieldDec");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:91:5: ( '{' ( fieldDec ( ',' fieldDec )* )? '}' -> ( fieldDec )* )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:91:9: '{' ( fieldDec ( ',' fieldDec )* )? '}'
			{
			char_literal14=(Token)match(input,80,FOLLOW_80_in_recTy658);  
			stream_80.add(char_literal14);

			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:91:12: ( fieldDec ( ',' fieldDec )* )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==ID) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:91:13: fieldDec ( ',' fieldDec )*
					{
					pushFollow(FOLLOW_fieldDec_in_recTy660);
					fieldDec15=fieldDec();
					state._fsp--;

					stream_fieldDec.add(fieldDec15.getTree());
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:91:21: ( ',' fieldDec )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==57) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:91:22: ',' fieldDec
							{
							char_literal16=(Token)match(input,57,FOLLOW_57_in_recTy662);  
							stream_57.add(char_literal16);

							pushFollow(FOLLOW_fieldDec_in_recTy663);
							fieldDec17=fieldDec();
							state._fsp--;

							stream_fieldDec.add(fieldDec17.getTree());
							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;

			}

			char_literal18=(Token)match(input,81,FOLLOW_81_in_recTy668);  
			stream_81.add(char_literal18);

			// AST REWRITE
			// elements: fieldDec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 91:44: -> ( fieldDec )*
			{
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:91:50: ( fieldDec )*
				while ( stream_fieldDec.hasNext() ) {
					adaptor.addChild(root_0, stream_fieldDec.nextTree());
				}
				stream_fieldDec.reset();

			}


			retval.tree = root_0;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recTy"


	public static class fieldDec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fieldDec"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:94:1: fieldDec : ID ':' ID -> ^( FIELD ID ID ) ;
	public final fieldDec_return fieldDec() throws RecognitionException {
		fieldDec_return retval = new fieldDec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID19=null;
		Token char_literal20=null;
		Token ID21=null;

		Object ID19_tree=null;
		Object char_literal20_tree=null;
		Object ID21_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:95:5: ( ID ':' ID -> ^( FIELD ID ID ) )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:95:9: ID ':' ID
			{
			ID19=(Token)match(input,ID,FOLLOW_ID_in_fieldDec703);  
			stream_ID.add(ID19);

			char_literal20=(Token)match(input,59,FOLLOW_59_in_fieldDec704);  
			stream_59.add(char_literal20);

			ID21=(Token)match(input,ID,FOLLOW_ID_in_fieldDec705);  
			stream_ID.add(ID21);

			// AST REWRITE
			// elements: ID, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 95:31: -> ^( FIELD ID ID )
			{
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:95:34: ^( FIELD ID ID )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELD, "FIELD"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldDec"


	public static class funDec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funDec"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:98:1: funDec : 'function' ID '(' ( fieldDec ( ',' fieldDec )* )? ')' funDec1 '=' expression -> ^( FUNCTION ID ^( LISTEARG ( fieldDec )+ ) funDec1 ^( BLOCKF ( expression )+ ) ) ;
	public final funDec_return funDec() throws RecognitionException {
		funDec_return retval = new funDec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal22=null;
		Token ID23=null;
		Token char_literal24=null;
		Token char_literal26=null;
		Token char_literal28=null;
		Token char_literal30=null;
		ParserRuleReturnScope fieldDec25 =null;
		ParserRuleReturnScope fieldDec27 =null;
		ParserRuleReturnScope funDec129 =null;
		ParserRuleReturnScope expression31 =null;

		Object string_literal22_tree=null;
		Object ID23_tree=null;
		Object char_literal24_tree=null;
		Object char_literal26_tree=null;
		Object char_literal28_tree=null;
		Object char_literal30_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_fieldDec=new RewriteRuleSubtreeStream(adaptor,"rule fieldDec");
		RewriteRuleSubtreeStream stream_funDec1=new RewriteRuleSubtreeStream(adaptor,"rule funDec1");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:99:5: ( 'function' ID '(' ( fieldDec ( ',' fieldDec )* )? ')' funDec1 '=' expression -> ^( FUNCTION ID ^( LISTEARG ( fieldDec )+ ) funDec1 ^( BLOCKF ( expression )+ ) ) )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:99:9: 'function' ID '(' ( fieldDec ( ',' fieldDec )* )? ')' funDec1 '=' expression
			{
			string_literal22=(Token)match(input,69,FOLLOW_69_in_funDec768);  
			stream_69.add(string_literal22);

			ID23=(Token)match(input,ID,FOLLOW_ID_in_funDec770);  
			stream_ID.add(ID23);

			char_literal24=(Token)match(input,55,FOLLOW_55_in_funDec772);  
			stream_55.add(char_literal24);

			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:99:27: ( fieldDec ( ',' fieldDec )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:99:28: fieldDec ( ',' fieldDec )*
					{
					pushFollow(FOLLOW_fieldDec_in_funDec775);
					fieldDec25=fieldDec();
					state._fsp--;

					stream_fieldDec.add(fieldDec25.getTree());
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:99:36: ( ',' fieldDec )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==57) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:99:37: ',' fieldDec
							{
							char_literal26=(Token)match(input,57,FOLLOW_57_in_funDec777);  
							stream_57.add(char_literal26);

							pushFollow(FOLLOW_fieldDec_in_funDec778);
							fieldDec27=fieldDec();
							state._fsp--;

							stream_fieldDec.add(fieldDec27.getTree());
							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

			}

			char_literal28=(Token)match(input,56,FOLLOW_56_in_funDec783);  
			stream_56.add(char_literal28);

			pushFollow(FOLLOW_funDec1_in_funDec786);
			funDec129=funDec1();
			state._fsp--;

			stream_funDec1.add(funDec129.getTree());
			char_literal30=(Token)match(input,EQ,FOLLOW_EQ_in_funDec789);  
			stream_EQ.add(char_literal30);

			pushFollow(FOLLOW_expression_in_funDec791);
			expression31=expression();
			state._fsp--;

			stream_expression.add(expression31.getTree());
			// AST REWRITE
			// elements: funDec1, expression, fieldDec, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 99:89: -> ^( FUNCTION ID ^( LISTEARG ( fieldDec )+ ) funDec1 ^( BLOCKF ( expression )+ ) )
			{
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:99:92: ^( FUNCTION ID ^( LISTEARG ( fieldDec )+ ) funDec1 ^( BLOCKF ( expression )+ ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:99:108: ^( LISTEARG ( fieldDec )+ )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTEARG, "LISTEARG"), root_2);
				if ( !(stream_fieldDec.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_fieldDec.hasNext() ) {
					adaptor.addChild(root_2, stream_fieldDec.nextTree());
				}
				stream_fieldDec.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_funDec1.nextTree());
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:99:138: ^( BLOCKF ( expression )+ )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCKF, "BLOCKF"), root_2);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_2, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "funDec"


	public static class funDec1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funDec1"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:102:1: funDec1 : ( -> ^( TYPEDERETOUR VOID ) | ':' ID -> ^( TYPEDERETOUR ID ) );
	public final funDec1_return funDec1() throws RecognitionException {
		funDec1_return retval = new funDec1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal32=null;
		Token ID33=null;

		Object char_literal32_tree=null;
		Object ID33_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:103:5: ( -> ^( TYPEDERETOUR VOID ) | ':' ID -> ^( TYPEDERETOUR ID ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==EQ) ) {
				alt7=1;
			}
			else if ( (LA7_0==59) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:103:12: 
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

					root_0 = (Object)adaptor.nil();
					// 103:12: -> ^( TYPEDERETOUR VOID )
					{
						// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:103:15: ^( TYPEDERETOUR VOID )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPEDERETOUR, "TYPEDERETOUR"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(VOID, "VOID"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:104:9: ':' ID
					{
					char_literal32=(Token)match(input,59,FOLLOW_59_in_funDec1867);  
					stream_59.add(char_literal32);

					ID33=(Token)match(input,ID,FOLLOW_ID_in_funDec1869);  
					stream_ID.add(ID33);

					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 104:18: -> ^( TYPEDERETOUR ID )
					{
						// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:104:21: ^( TYPEDERETOUR ID )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPEDERETOUR, "TYPEDERETOUR"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "funDec1"


	public static class varDec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "varDec"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:117:1: varDec : 'var' ID ( ':' ID ':=' expression -> ^( VAR ^( AFFECTATION ID expression ) ID ) | ':=' expression -> ^( VAR ^( AFFECTATION ID expression ) ) ) ;
	public final varDec_return varDec() throws RecognitionException {
		varDec_return retval = new varDec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal34=null;
		Token ID35=null;
		Token char_literal36=null;
		Token ID37=null;
		Token string_literal38=null;
		Token string_literal40=null;
		ParserRuleReturnScope expression39 =null;
		ParserRuleReturnScope expression41 =null;

		Object string_literal34_tree=null;
		Object ID35_tree=null;
		Object char_literal36_tree=null;
		Object ID37_tree=null;
		Object string_literal38_tree=null;
		Object string_literal40_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_ASSIG=new RewriteRuleTokenStream(adaptor,"token ASSIG");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:118:5: ( 'var' ID ( ':' ID ':=' expression -> ^( VAR ^( AFFECTATION ID expression ) ID ) | ':=' expression -> ^( VAR ^( AFFECTATION ID expression ) ) ) )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:118:9: 'var' ID ( ':' ID ':=' expression -> ^( VAR ^( AFFECTATION ID expression ) ID ) | ':=' expression -> ^( VAR ^( AFFECTATION ID expression ) ) )
			{
			string_literal34=(Token)match(input,78,FOLLOW_78_in_varDec901);  
			stream_78.add(string_literal34);

			ID35=(Token)match(input,ID,FOLLOW_ID_in_varDec903);  
			stream_ID.add(ID35);

			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:118:18: ( ':' ID ':=' expression -> ^( VAR ^( AFFECTATION ID expression ) ID ) | ':=' expression -> ^( VAR ^( AFFECTATION ID expression ) ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==59) ) {
				alt8=1;
			}
			else if ( (LA8_0==ASSIG) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:118:19: ':' ID ':=' expression
					{
					char_literal36=(Token)match(input,59,FOLLOW_59_in_varDec906);  
					stream_59.add(char_literal36);

					ID37=(Token)match(input,ID,FOLLOW_ID_in_varDec908);  
					stream_ID.add(ID37);

					string_literal38=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_varDec911);  
					stream_ASSIG.add(string_literal38);

					pushFollow(FOLLOW_expression_in_varDec913);
					expression39=expression();
					state._fsp--;

					stream_expression.add(expression39.getTree());
					// AST REWRITE
					// elements: ID, expression, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 118:43: -> ^( VAR ^( AFFECTATION ID expression ) ID )
					{
						// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:118:46: ^( VAR ^( AFFECTATION ID expression ) ID )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:118:53: ^( AFFECTATION ID expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECTATION, "AFFECTATION"), root_2);
						adaptor.addChild(root_2, stream_ID.nextNode());
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:118:88: ':=' expression
					{
					string_literal40=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_varDec934);  
					stream_ASSIG.add(string_literal40);

					pushFollow(FOLLOW_expression_in_varDec936);
					expression41=expression();
					state._fsp--;

					stream_expression.add(expression41.getTree());
					// AST REWRITE
					// elements: ID, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 118:104: -> ^( VAR ^( AFFECTATION ID expression ) )
					{
						// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:118:107: ^( VAR ^( AFFECTATION ID expression ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:118:114: ^( AFFECTATION ID expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECTATION, "AFFECTATION"), root_2);
						adaptor.addChild(root_2, stream_ID.nextNode());
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "varDec"


	public static class id_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "id"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:121:2: id : ID ( callExp -> ^( APPELFONCTION ID callExp ) | arrRec -> ^( ARREC ID arrRec ) | subField -> ^( SUBFIELD ID subField ) | lValue2 -> ^( DOT ID lValue2 ) | -> ^( ID ) ) ;
	public final id_return id() throws RecognitionException {
		id_return retval = new id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID42=null;
		ParserRuleReturnScope callExp43 =null;
		ParserRuleReturnScope arrRec44 =null;
		ParserRuleReturnScope subField45 =null;
		ParserRuleReturnScope lValue246 =null;

		Object ID42_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_lValue2=new RewriteRuleSubtreeStream(adaptor,"rule lValue2");
		RewriteRuleSubtreeStream stream_callExp=new RewriteRuleSubtreeStream(adaptor,"rule callExp");
		RewriteRuleSubtreeStream stream_subField=new RewriteRuleSubtreeStream(adaptor,"rule subField");
		RewriteRuleSubtreeStream stream_arrRec=new RewriteRuleSubtreeStream(adaptor,"rule arrRec");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:122:5: ( ID ( callExp -> ^( APPELFONCTION ID callExp ) | arrRec -> ^( ARREC ID arrRec ) | subField -> ^( SUBFIELD ID subField ) | lValue2 -> ^( DOT ID lValue2 ) | -> ^( ID ) ) )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:122:7: ID ( callExp -> ^( APPELFONCTION ID callExp ) | arrRec -> ^( ARREC ID arrRec ) | subField -> ^( SUBFIELD ID subField ) | lValue2 -> ^( DOT ID lValue2 ) | -> ^( ID ) )
			{
			ID42=(Token)match(input,ID,FOLLOW_ID_in_id976);  
			stream_ID.add(ID42);

			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:122:10: ( callExp -> ^( APPELFONCTION ID callExp ) | arrRec -> ^( ARREC ID arrRec ) | subField -> ^( SUBFIELD ID subField ) | lValue2 -> ^( DOT ID lValue2 ) | -> ^( ID ) )
			int alt9=5;
			switch ( input.LA(1) ) {
			case 55:
				{
				alt9=1;
				}
				break;
			case 80:
				{
				alt9=2;
				}
				break;
			case 62:
				{
				alt9=3;
				}
				break;
			case 58:
				{
				alt9=4;
				}
				break;
			case EOF:
			case AND:
			case ASSIG:
			case DIV:
			case EQ:
			case GE:
			case GT:
			case LE:
			case LT:
			case MOINS:
			case MULT:
			case NE:
			case OR:
			case PLUS:
			case 56:
			case 57:
			case 60:
			case 63:
			case 65:
			case 66:
			case 67:
			case 69:
			case 71:
			case 75:
			case 76:
			case 77:
			case 78:
			case 81:
				{
				alt9=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:122:11: callExp
					{
					pushFollow(FOLLOW_callExp_in_id979);
					callExp43=callExp();
					state._fsp--;

					stream_callExp.add(callExp43.getTree());
					// AST REWRITE
					// elements: callExp, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 122:19: -> ^( APPELFONCTION ID callExp )
					{
						// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:122:22: ^( APPELFONCTION ID callExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(APPELFONCTION, "APPELFONCTION"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_callExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:122:51: arrRec
					{
					pushFollow(FOLLOW_arrRec_in_id992);
					arrRec44=arrRec();
					state._fsp--;

					stream_arrRec.add(arrRec44.getTree());
					// AST REWRITE
					// elements: arrRec, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 122:58: -> ^( ARREC ID arrRec )
					{
						// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:122:61: ^( ARREC ID arrRec )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARREC, "ARREC"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_arrRec.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:122:81: subField
					{
					pushFollow(FOLLOW_subField_in_id1005);
					subField45=subField();
					state._fsp--;

					stream_subField.add(subField45.getTree());
					// AST REWRITE
					// elements: subField, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 122:89: -> ^( SUBFIELD ID subField )
					{
						// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:122:92: ^( SUBFIELD ID subField )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUBFIELD, "SUBFIELD"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_subField.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:122:117: lValue2
					{
					pushFollow(FOLLOW_lValue2_in_id1017);
					lValue246=lValue2();
					state._fsp--;

					stream_lValue2.add(lValue246.getTree());
					// AST REWRITE
					// elements: lValue2, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 122:125: -> ^( DOT ID lValue2 )
					{
						// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:122:128: ^( DOT ID lValue2 )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOT, "DOT"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_lValue2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:122:147: 
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

					root_0 = (Object)adaptor.nil();
					// 122:147: -> ^( ID )
					{
						// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:122:149: ^( ID )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "id"


	public static class lValue2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lValue2"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:127:1: lValue2 : '.' ID lValue1 ;
	public final lValue2_return lValue2() throws RecognitionException {
		lValue2_return retval = new lValue2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal47=null;
		Token ID48=null;
		ParserRuleReturnScope lValue149 =null;

		Object char_literal47_tree=null;
		Object ID48_tree=null;

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:127:9: ( '.' ID lValue1 )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:127:11: '.' ID lValue1
			{
			root_0 = (Object)adaptor.nil();


			char_literal47=(Token)match(input,58,FOLLOW_58_in_lValue21058); 
			char_literal47_tree = (Object)adaptor.create(char_literal47);
			adaptor.addChild(root_0, char_literal47_tree);

			ID48=(Token)match(input,ID,FOLLOW_ID_in_lValue21060); 
			ID48_tree = (Object)adaptor.create(ID48);
			adaptor.addChild(root_0, ID48_tree);

			pushFollow(FOLLOW_lValue1_in_lValue21062);
			lValue149=lValue1();
			state._fsp--;

			adaptor.addChild(root_0, lValue149.getTree());

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lValue2"


	public static class subField_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subField"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:131:1: subField : sub subFin ;
	public final subField_return subField() throws RecognitionException {
		subField_return retval = new subField_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope sub50 =null;
		ParserRuleReturnScope subFin51 =null;


		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:132:2: ( sub subFin )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:132:4: sub subFin
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_sub_in_subField1095);
			sub50=sub();
			state._fsp--;

			adaptor.addChild(root_0, sub50.getTree());

			pushFollow(FOLLOW_subFin_in_subField1097);
			subFin51=subFin();
			state._fsp--;

			adaptor.addChild(root_0, subFin51.getTree());

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subField"


	public static class callExp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callExp"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:135:1: callExp : '(' ( expression ( ',' expression )* )? ')' -> ( expression )+ ;
	public final callExp_return callExp() throws RecognitionException {
		callExp_return retval = new callExp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal52=null;
		Token char_literal54=null;
		Token char_literal56=null;
		ParserRuleReturnScope expression53 =null;
		ParserRuleReturnScope expression55 =null;

		Object char_literal52_tree=null;
		Object char_literal54_tree=null;
		Object char_literal56_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:136:2: ( '(' ( expression ( ',' expression )* )? ')' -> ( expression )+ )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:136:3: '(' ( expression ( ',' expression )* )? ')'
			{
			char_literal52=(Token)match(input,55,FOLLOW_55_in_callExp1138);  
			stream_55.add(char_literal52);

			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:136:6: ( expression ( ',' expression )* )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ID||LA11_0==INTLIT||LA11_0==MOINS||LA11_0==STRINGLIT||LA11_0==55||LA11_0==61||LA11_0==68||LA11_0==70||(LA11_0 >= 72 && LA11_0 <= 73)||LA11_0==79) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:136:7: expression ( ',' expression )*
					{
					pushFollow(FOLLOW_expression_in_callExp1140);
					expression53=expression();
					state._fsp--;

					stream_expression.add(expression53.getTree());
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:136:17: ( ',' expression )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==57) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:136:18: ',' expression
							{
							char_literal54=(Token)match(input,57,FOLLOW_57_in_callExp1142);  
							stream_57.add(char_literal54);

							pushFollow(FOLLOW_expression_in_callExp1143);
							expression55=expression();
							state._fsp--;

							stream_expression.add(expression55.getTree());
							}
							break;

						default :
							break loop10;
						}
					}

					}
					break;

			}

			char_literal56=(Token)match(input,56,FOLLOW_56_in_callExp1148);  
			stream_56.add(char_literal56);

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 136:40: -> ( expression )+
			{
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_0, stream_expression.nextTree());
				}
				stream_expression.reset();

			}


			retval.tree = root_0;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "callExp"


	public static class sub1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sub1"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:139:1: sub1 : ( '.' ID -> ^( DOT ID ) | sub );
	public final sub1_return sub1() throws RecognitionException {
		sub1_return retval = new sub1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal57=null;
		Token ID58=null;
		ParserRuleReturnScope sub59 =null;

		Object char_literal57_tree=null;
		Object ID58_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:140:2: ( '.' ID -> ^( DOT ID ) | sub )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==58) ) {
				alt12=1;
			}
			else if ( (LA12_0==62) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:140:4: '.' ID
					{
					char_literal57=(Token)match(input,58,FOLLOW_58_in_sub11165);  
					stream_58.add(char_literal57);

					ID58=(Token)match(input,ID,FOLLOW_ID_in_sub11168);  
					stream_ID.add(ID58);

					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 140:13: -> ^( DOT ID )
					{
						// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:140:15: ^( DOT ID )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOT, "DOT"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:141:4: sub
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sub_in_sub11182);
					sub59=sub();
					state._fsp--;

					adaptor.addChild(root_0, sub59.getTree());

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sub1"


	public static class lValue1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lValue1"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:144:1: lValue1 : ( sub1 lValue1 |);
	public final lValue1_return lValue1() throws RecognitionException {
		lValue1_return retval = new lValue1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope sub160 =null;
		ParserRuleReturnScope lValue161 =null;


		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:145:5: ( sub1 lValue1 |)
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==58||LA13_0==62) ) {
				alt13=1;
			}
			else if ( (LA13_0==EOF||LA13_0==AND||LA13_0==ASSIG||LA13_0==DIV||LA13_0==EQ||(LA13_0 >= GE && LA13_0 <= GT)||LA13_0==LE||(LA13_0 >= LT && LA13_0 <= NE)||(LA13_0 >= OR && LA13_0 <= PLUS)||(LA13_0 >= 56 && LA13_0 <= 57)||LA13_0==60||LA13_0==63||(LA13_0 >= 65 && LA13_0 <= 67)||LA13_0==69||LA13_0==71||(LA13_0 >= 75 && LA13_0 <= 78)||LA13_0==81) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:145:9: sub1 lValue1
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sub1_in_lValue11198);
					sub160=sub1();
					state._fsp--;

					adaptor.addChild(root_0, sub160.getTree());

					pushFollow(FOLLOW_lValue1_in_lValue11200);
					lValue161=lValue1();
					state._fsp--;

					adaptor.addChild(root_0, lValue161.getTree());

					}
					break;
				case 2 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:147:5: 
					{
					root_0 = (Object)adaptor.nil();


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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lValue1"


	public static class sub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sub"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:149:1: sub : '[' expression ']' -> expression ;
	public final sub_return sub() throws RecognitionException {
		sub_return retval = new sub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal62=null;
		Token char_literal64=null;
		ParserRuleReturnScope expression63 =null;

		Object char_literal62_tree=null;
		Object char_literal64_tree=null;
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:150:2: ( '[' expression ']' -> expression )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:150:5: '[' expression ']'
			{
			char_literal62=(Token)match(input,62,FOLLOW_62_in_sub1221);  
			stream_62.add(char_literal62);

			pushFollow(FOLLOW_expression_in_sub1223);
			expression63=expression();
			state._fsp--;

			stream_expression.add(expression63.getTree());
			char_literal64=(Token)match(input,63,FOLLOW_63_in_sub1225);  
			stream_63.add(char_literal64);

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 150:24: -> expression
			{
				adaptor.addChild(root_0, stream_expression.nextTree());
			}


			retval.tree = root_0;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sub"


	public static class subFin_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subFin"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:153:1: subFin : ( 'of' expression -> expression | lValue1 );
	public final subFin_return subFin() throws RecognitionException {
		subFin_return retval = new subFin_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal65=null;
		ParserRuleReturnScope expression66 =null;
		ParserRuleReturnScope lValue167 =null;

		Object string_literal65_tree=null;
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:154:2: ( 'of' expression -> expression | lValue1 )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==74) ) {
				alt14=1;
			}
			else if ( (LA14_0==EOF||LA14_0==AND||LA14_0==ASSIG||LA14_0==DIV||LA14_0==EQ||(LA14_0 >= GE && LA14_0 <= GT)||LA14_0==LE||(LA14_0 >= LT && LA14_0 <= NE)||(LA14_0 >= OR && LA14_0 <= PLUS)||(LA14_0 >= 56 && LA14_0 <= 58)||LA14_0==60||(LA14_0 >= 62 && LA14_0 <= 63)||(LA14_0 >= 65 && LA14_0 <= 67)||LA14_0==69||LA14_0==71||(LA14_0 >= 75 && LA14_0 <= 78)||LA14_0==81) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:154:4: 'of' expression
					{
					string_literal65=(Token)match(input,74,FOLLOW_74_in_subFin1240);  
					stream_74.add(string_literal65);

					pushFollow(FOLLOW_expression_in_subFin1242);
					expression66=expression();
					state._fsp--;

					stream_expression.add(expression66.getTree());
					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 154:20: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:155:5: lValue1
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lValue1_in_subFin1252);
					lValue167=lValue1();
					state._fsp--;

					adaptor.addChild(root_0, lValue167.getTree());

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subFin"


	public static class arrRec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrRec"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:158:2: arrRec : '{' ( fieldCreate ( ',' fieldCreate )* )? '}' -> ( fieldCreate )+ ;
	public final arrRec_return arrRec() throws RecognitionException {
		arrRec_return retval = new arrRec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal68=null;
		Token char_literal70=null;
		Token char_literal72=null;
		ParserRuleReturnScope fieldCreate69 =null;
		ParserRuleReturnScope fieldCreate71 =null;

		Object char_literal68_tree=null;
		Object char_literal70_tree=null;
		Object char_literal72_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleSubtreeStream stream_fieldCreate=new RewriteRuleSubtreeStream(adaptor,"rule fieldCreate");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:159:5: ( '{' ( fieldCreate ( ',' fieldCreate )* )? '}' -> ( fieldCreate )+ )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:159:8: '{' ( fieldCreate ( ',' fieldCreate )* )? '}'
			{
			char_literal68=(Token)match(input,80,FOLLOW_80_in_arrRec1269);  
			stream_80.add(char_literal68);

			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:159:12: ( fieldCreate ( ',' fieldCreate )* )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ID) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:159:13: fieldCreate ( ',' fieldCreate )*
					{
					pushFollow(FOLLOW_fieldCreate_in_arrRec1272);
					fieldCreate69=fieldCreate();
					state._fsp--;

					stream_fieldCreate.add(fieldCreate69.getTree());
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:159:24: ( ',' fieldCreate )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==57) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:159:25: ',' fieldCreate
							{
							char_literal70=(Token)match(input,57,FOLLOW_57_in_arrRec1274);  
							stream_57.add(char_literal70);

							pushFollow(FOLLOW_fieldCreate_in_arrRec1275);
							fieldCreate71=fieldCreate();
							state._fsp--;

							stream_fieldCreate.add(fieldCreate71.getTree());
							}
							break;

						default :
							break loop15;
						}
					}

					}
					break;

			}

			char_literal72=(Token)match(input,81,FOLLOW_81_in_arrRec1281);  
			stream_81.add(char_literal72);

			// AST REWRITE
			// elements: fieldCreate
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 159:50: -> ( fieldCreate )+
			{
				if ( !(stream_fieldCreate.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_fieldCreate.hasNext() ) {
					adaptor.addChild(root_0, stream_fieldCreate.nextTree());
				}
				stream_fieldCreate.reset();

			}


			retval.tree = root_0;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrRec"


	public static class seqExp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "seqExp"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:162:1: seqExp : '(' ( expression ( ';' expression )* )? ')' -> ^( SEQEXP ( expression )* ) ;
	public final seqExp_return seqExp() throws RecognitionException {
		seqExp_return retval = new seqExp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal73=null;
		Token char_literal75=null;
		Token char_literal77=null;
		ParserRuleReturnScope expression74 =null;
		ParserRuleReturnScope expression76 =null;

		Object char_literal73_tree=null;
		Object char_literal75_tree=null;
		Object char_literal77_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:163:2: ( '(' ( expression ( ';' expression )* )? ')' -> ^( SEQEXP ( expression )* ) )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:163:3: '(' ( expression ( ';' expression )* )? ')'
			{
			char_literal73=(Token)match(input,55,FOLLOW_55_in_seqExp1301);  
			stream_55.add(char_literal73);

			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:163:7: ( expression ( ';' expression )* )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==ID||LA18_0==INTLIT||LA18_0==MOINS||LA18_0==STRINGLIT||LA18_0==55||LA18_0==61||LA18_0==68||LA18_0==70||(LA18_0 >= 72 && LA18_0 <= 73)||LA18_0==79) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:163:8: expression ( ';' expression )*
					{
					pushFollow(FOLLOW_expression_in_seqExp1304);
					expression74=expression();
					state._fsp--;

					stream_expression.add(expression74.getTree());
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:163:18: ( ';' expression )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==60) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:163:19: ';' expression
							{
							char_literal75=(Token)match(input,60,FOLLOW_60_in_seqExp1306);  
							stream_60.add(char_literal75);

							pushFollow(FOLLOW_expression_in_seqExp1307);
							expression76=expression();
							state._fsp--;

							stream_expression.add(expression76.getTree());
							}
							break;

						default :
							break loop17;
						}
					}

					}
					break;

			}

			char_literal77=(Token)match(input,56,FOLLOW_56_in_seqExp1312);  
			stream_56.add(char_literal77);

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 163:41: -> ^( SEQEXP ( expression )* )
			{
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:163:45: ^( SEQEXP ( expression )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEQEXP, "SEQEXP"), root_1);
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:163:55: ( expression )*
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "seqExp"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:166:1: expression : ( ifThen | whileExp | forExp | letExp | 'Break' | exp );
	public final expression_return expression() throws RecognitionException {
		expression_return retval = new expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal82=null;
		ParserRuleReturnScope ifThen78 =null;
		ParserRuleReturnScope whileExp79 =null;
		ParserRuleReturnScope forExp80 =null;
		ParserRuleReturnScope letExp81 =null;
		ParserRuleReturnScope exp83 =null;

		Object string_literal82_tree=null;

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:167:2: ( ifThen | whileExp | forExp | letExp | 'Break' | exp )
			int alt19=6;
			switch ( input.LA(1) ) {
			case 70:
				{
				alt19=1;
				}
				break;
			case 79:
				{
				alt19=2;
				}
				break;
			case 68:
				{
				alt19=3;
				}
				break;
			case 72:
				{
				alt19=4;
				}
				break;
			case 61:
				{
				alt19=5;
				}
				break;
			case ID:
			case INTLIT:
			case MOINS:
			case STRINGLIT:
			case 55:
			case 73:
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
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:167:3: ifThen
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifThen_in_expression1334);
					ifThen78=ifThen();
					state._fsp--;

					adaptor.addChild(root_0, ifThen78.getTree());

					}
					break;
				case 2 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:168:3: whileExp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileExp_in_expression1338);
					whileExp79=whileExp();
					state._fsp--;

					adaptor.addChild(root_0, whileExp79.getTree());

					}
					break;
				case 3 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:169:3: forExp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forExp_in_expression1342);
					forExp80=forExp();
					state._fsp--;

					adaptor.addChild(root_0, forExp80.getTree());

					}
					break;
				case 4 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:170:3: letExp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_letExp_in_expression1346);
					letExp81=letExp();
					state._fsp--;

					adaptor.addChild(root_0, letExp81.getTree());

					}
					break;
				case 5 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:172:3: 'Break'
					{
					root_0 = (Object)adaptor.nil();


					string_literal82=(Token)match(input,61,FOLLOW_61_in_expression1351); 
					string_literal82_tree = (Object)adaptor.create(string_literal82);
					adaptor.addChild(root_0, string_literal82_tree);

					}
					break;
				case 6 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:173:3: exp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exp_in_expression1355);
					exp83=exp();
					state._fsp--;

					adaptor.addChild(root_0, exp83.getTree());

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exp"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:176:1: exp : exp1 ( options {greedy=true; } : ASSIG ^ exp1 )? ;
	public final exp_return exp() throws RecognitionException {
		exp_return retval = new exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIG85=null;
		ParserRuleReturnScope exp184 =null;
		ParserRuleReturnScope exp186 =null;

		Object ASSIG85_tree=null;

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:177:2: ( exp1 ( options {greedy=true; } : ASSIG ^ exp1 )? )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:177:3: exp1 ( options {greedy=true; } : ASSIG ^ exp1 )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exp1_in_exp1368);
			exp184=exp1();
			state._fsp--;

			adaptor.addChild(root_0, exp184.getTree());

			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:177:9: ( options {greedy=true; } : ASSIG ^ exp1 )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==ASSIG) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:177:33: ASSIG ^ exp1
					{
					ASSIG85=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_exp1380); 
					ASSIG85_tree = (Object)adaptor.create(ASSIG85);
					root_0 = (Object)adaptor.becomeRoot(ASSIG85_tree, root_0);

					pushFollow(FOLLOW_exp1_in_exp1382);
					exp186=exp1();
					state._fsp--;

					adaptor.addChild(root_0, exp186.getTree());

					}
					break;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exp"


	public static class exp1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exp1"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:179:1: exp1 : infixopetou ( options {greedy=true; } : ( AND ^| OR ^) infixopetou )* ;
	public final exp1_return exp1() throws RecognitionException {
		exp1_return retval = new exp1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND88=null;
		Token OR89=null;
		ParserRuleReturnScope infixopetou87 =null;
		ParserRuleReturnScope infixopetou90 =null;

		Object AND88_tree=null;
		Object OR89_tree=null;

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:180:2: ( infixopetou ( options {greedy=true; } : ( AND ^| OR ^) infixopetou )* )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:180:3: infixopetou ( options {greedy=true; } : ( AND ^| OR ^) infixopetou )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_infixopetou_in_exp11423);
			infixopetou87=infixopetou();
			state._fsp--;

			adaptor.addChild(root_0, infixopetou87.getTree());

			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:180:15: ( options {greedy=true; } : ( AND ^| OR ^) infixopetou )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==AND) ) {
					alt22=1;
				}
				else if ( (LA22_0==OR) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:180:39: ( AND ^| OR ^) infixopetou
					{
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:180:39: ( AND ^| OR ^)
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==AND) ) {
						alt21=1;
					}
					else if ( (LA21_0==OR) ) {
						alt21=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}

					switch (alt21) {
						case 1 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:180:40: AND ^
							{
							AND88=(Token)match(input,AND,FOLLOW_AND_in_exp11435); 
							AND88_tree = (Object)adaptor.create(AND88);
							root_0 = (Object)adaptor.becomeRoot(AND88_tree, root_0);

							}
							break;
						case 2 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:180:45: OR ^
							{
							OR89=(Token)match(input,OR,FOLLOW_OR_in_exp11438); 
							OR89_tree = (Object)adaptor.create(OR89);
							root_0 = (Object)adaptor.becomeRoot(OR89_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_infixopetou_in_exp11442);
					infixopetou90=infixopetou();
					state._fsp--;

					adaptor.addChild(root_0, infixopetou90.getTree());

					}
					break;

				default :
					break loop22;
				}
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exp1"


	public static class infixopetou_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "infixopetou"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:184:1: infixopetou : infixopcomp ( options {greedy=true; } : ( GE ^| EQ ^| LE ^| NE ^| GT ^| LT ^) infixopcomp )? ;
	public final infixopetou_return infixopetou() throws RecognitionException {
		infixopetou_return retval = new infixopetou_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GE92=null;
		Token EQ93=null;
		Token LE94=null;
		Token NE95=null;
		Token GT96=null;
		Token LT97=null;
		ParserRuleReturnScope infixopcomp91 =null;
		ParserRuleReturnScope infixopcomp98 =null;

		Object GE92_tree=null;
		Object EQ93_tree=null;
		Object LE94_tree=null;
		Object NE95_tree=null;
		Object GT96_tree=null;
		Object LT97_tree=null;

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:185:3: ( infixopcomp ( options {greedy=true; } : ( GE ^| EQ ^| LE ^| NE ^| GT ^| LT ^) infixopcomp )? )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:185:4: infixopcomp ( options {greedy=true; } : ( GE ^| EQ ^| LE ^| NE ^| GT ^| LT ^) infixopcomp )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_infixopcomp_in_infixopetou1457);
			infixopcomp91=infixopcomp();
			state._fsp--;

			adaptor.addChild(root_0, infixopcomp91.getTree());

			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:185:15: ( options {greedy=true; } : ( GE ^| EQ ^| LE ^| NE ^| GT ^| LT ^) infixopcomp )?
			int alt24=2;
			switch ( input.LA(1) ) {
				case GE:
					{
					alt24=1;
					}
					break;
				case EQ:
					{
					alt24=1;
					}
					break;
				case LE:
					{
					alt24=1;
					}
					break;
				case NE:
					{
					alt24=1;
					}
					break;
				case GT:
					{
					alt24=1;
					}
					break;
				case LT:
					{
					alt24=1;
					}
					break;
			}
			switch (alt24) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:185:39: ( GE ^| EQ ^| LE ^| NE ^| GT ^| LT ^) infixopcomp
					{
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:185:39: ( GE ^| EQ ^| LE ^| NE ^| GT ^| LT ^)
					int alt23=6;
					switch ( input.LA(1) ) {
					case GE:
						{
						alt23=1;
						}
						break;
					case EQ:
						{
						alt23=2;
						}
						break;
					case LE:
						{
						alt23=3;
						}
						break;
					case NE:
						{
						alt23=4;
						}
						break;
					case GT:
						{
						alt23=5;
						}
						break;
					case LT:
						{
						alt23=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}
					switch (alt23) {
						case 1 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:185:40: GE ^
							{
							GE92=(Token)match(input,GE,FOLLOW_GE_in_infixopetou1468); 
							GE92_tree = (Object)adaptor.create(GE92);
							root_0 = (Object)adaptor.becomeRoot(GE92_tree, root_0);

							}
							break;
						case 2 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:185:46: EQ ^
							{
							EQ93=(Token)match(input,EQ,FOLLOW_EQ_in_infixopetou1473); 
							EQ93_tree = (Object)adaptor.create(EQ93);
							root_0 = (Object)adaptor.becomeRoot(EQ93_tree, root_0);

							}
							break;
						case 3 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:185:52: LE ^
							{
							LE94=(Token)match(input,LE,FOLLOW_LE_in_infixopetou1478); 
							LE94_tree = (Object)adaptor.create(LE94);
							root_0 = (Object)adaptor.becomeRoot(LE94_tree, root_0);

							}
							break;
						case 4 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:185:57: NE ^
							{
							NE95=(Token)match(input,NE,FOLLOW_NE_in_infixopetou1482); 
							NE95_tree = (Object)adaptor.create(NE95);
							root_0 = (Object)adaptor.becomeRoot(NE95_tree, root_0);

							}
							break;
						case 5 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:185:63: GT ^
							{
							GT96=(Token)match(input,GT,FOLLOW_GT_in_infixopetou1487); 
							GT96_tree = (Object)adaptor.create(GT96);
							root_0 = (Object)adaptor.becomeRoot(GT96_tree, root_0);

							}
							break;
						case 6 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:185:69: LT ^
							{
							LT97=(Token)match(input,LT,FOLLOW_LT_in_infixopetou1492); 
							LT97_tree = (Object)adaptor.create(LT97);
							root_0 = (Object)adaptor.becomeRoot(LT97_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_infixopcomp_in_infixopetou1496);
					infixopcomp98=infixopcomp();
					state._fsp--;

					adaptor.addChild(root_0, infixopcomp98.getTree());

					}
					break;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "infixopetou"


	public static class infixopcomp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "infixopcomp"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:188:1: infixopcomp : infixopplus ( options {greedy=true; } : ( PLUS ^| MOINS ^) infixopplus )* ;
	public final infixopcomp_return infixopcomp() throws RecognitionException {
		infixopcomp_return retval = new infixopcomp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS100=null;
		Token MOINS101=null;
		ParserRuleReturnScope infixopplus99 =null;
		ParserRuleReturnScope infixopplus102 =null;

		Object PLUS100_tree=null;
		Object MOINS101_tree=null;

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:189:2: ( infixopplus ( options {greedy=true; } : ( PLUS ^| MOINS ^) infixopplus )* )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:189:3: infixopplus ( options {greedy=true; } : ( PLUS ^| MOINS ^) infixopplus )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_infixopplus_in_infixopcomp1513);
			infixopplus99=infixopplus();
			state._fsp--;

			adaptor.addChild(root_0, infixopplus99.getTree());

			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:189:14: ( options {greedy=true; } : ( PLUS ^| MOINS ^) infixopplus )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==PLUS) ) {
					alt26=1;
				}
				else if ( (LA26_0==MOINS) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:189:38: ( PLUS ^| MOINS ^) infixopplus
					{
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:189:38: ( PLUS ^| MOINS ^)
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==PLUS) ) {
						alt25=1;
					}
					else if ( (LA25_0==MOINS) ) {
						alt25=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						throw nvae;
					}

					switch (alt25) {
						case 1 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:189:39: PLUS ^
							{
							PLUS100=(Token)match(input,PLUS,FOLLOW_PLUS_in_infixopcomp1524); 
							PLUS100_tree = (Object)adaptor.create(PLUS100);
							root_0 = (Object)adaptor.becomeRoot(PLUS100_tree, root_0);

							}
							break;
						case 2 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:189:47: MOINS ^
							{
							MOINS101=(Token)match(input,MOINS,FOLLOW_MOINS_in_infixopcomp1529); 
							MOINS101_tree = (Object)adaptor.create(MOINS101);
							root_0 = (Object)adaptor.becomeRoot(MOINS101_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_infixopplus_in_infixopcomp1534);
					infixopplus102=infixopplus();
					state._fsp--;

					adaptor.addChild(root_0, infixopplus102.getTree());

					}
					break;

				default :
					break loop26;
				}
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "infixopcomp"


	public static class infixopplus_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "infixopplus"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:192:1: infixopplus : infixopmult ( options {greedy=true; } : ( MULT ^| DIV ^) infixopmult )* ;
	public final infixopplus_return infixopplus() throws RecognitionException {
		infixopplus_return retval = new infixopplus_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT104=null;
		Token DIV105=null;
		ParserRuleReturnScope infixopmult103 =null;
		ParserRuleReturnScope infixopmult106 =null;

		Object MULT104_tree=null;
		Object DIV105_tree=null;

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:193:2: ( infixopmult ( options {greedy=true; } : ( MULT ^| DIV ^) infixopmult )* )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:193:3: infixopmult ( options {greedy=true; } : ( MULT ^| DIV ^) infixopmult )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_infixopmult_in_infixopplus1550);
			infixopmult103=infixopmult();
			state._fsp--;

			adaptor.addChild(root_0, infixopmult103.getTree());

			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:193:14: ( options {greedy=true; } : ( MULT ^| DIV ^) infixopmult )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==MULT) ) {
					alt28=1;
				}
				else if ( (LA28_0==DIV) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:193:38: ( MULT ^| DIV ^) infixopmult
					{
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:193:38: ( MULT ^| DIV ^)
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==MULT) ) {
						alt27=1;
					}
					else if ( (LA27_0==DIV) ) {
						alt27=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}

					switch (alt27) {
						case 1 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:193:39: MULT ^
							{
							MULT104=(Token)match(input,MULT,FOLLOW_MULT_in_infixopplus1561); 
							MULT104_tree = (Object)adaptor.create(MULT104);
							root_0 = (Object)adaptor.becomeRoot(MULT104_tree, root_0);

							}
							break;
						case 2 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:193:47: DIV ^
							{
							DIV105=(Token)match(input,DIV,FOLLOW_DIV_in_infixopplus1566); 
							DIV105_tree = (Object)adaptor.create(DIV105);
							root_0 = (Object)adaptor.becomeRoot(DIV105_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_infixopmult_in_infixopplus1571);
					infixopmult106=infixopmult();
					state._fsp--;

					adaptor.addChild(root_0, infixopmult106.getTree());

					}
					break;

				default :
					break loop28;
				}
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "infixopplus"


	public static class infixopmult_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "infixopmult"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:196:1: infixopmult : ( '-' infixopmult -> ^( NEGATION infixopmult ) | seqExp | 'nil' | STRINGLIT | INTLIT | id );
	public final infixopmult_return infixopmult() throws RecognitionException {
		infixopmult_return retval = new infixopmult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal107=null;
		Token string_literal110=null;
		Token STRINGLIT111=null;
		Token INTLIT112=null;
		ParserRuleReturnScope infixopmult108 =null;
		ParserRuleReturnScope seqExp109 =null;
		ParserRuleReturnScope id113 =null;

		Object char_literal107_tree=null;
		Object string_literal110_tree=null;
		Object STRINGLIT111_tree=null;
		Object INTLIT112_tree=null;
		RewriteRuleTokenStream stream_MOINS=new RewriteRuleTokenStream(adaptor,"token MOINS");
		RewriteRuleSubtreeStream stream_infixopmult=new RewriteRuleSubtreeStream(adaptor,"rule infixopmult");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:197:2: ( '-' infixopmult -> ^( NEGATION infixopmult ) | seqExp | 'nil' | STRINGLIT | INTLIT | id )
			int alt29=6;
			switch ( input.LA(1) ) {
			case MOINS:
				{
				alt29=1;
				}
				break;
			case 55:
				{
				alt29=2;
				}
				break;
			case 73:
				{
				alt29=3;
				}
				break;
			case STRINGLIT:
				{
				alt29=4;
				}
				break;
			case INTLIT:
				{
				alt29=5;
				}
				break;
			case ID:
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
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:197:3: '-' infixopmult
					{
					char_literal107=(Token)match(input,MOINS,FOLLOW_MOINS_in_infixopmult1583);  
					stream_MOINS.add(char_literal107);

					pushFollow(FOLLOW_infixopmult_in_infixopmult1584);
					infixopmult108=infixopmult();
					state._fsp--;

					stream_infixopmult.add(infixopmult108.getTree());
					// AST REWRITE
					// elements: infixopmult
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 197:19: -> ^( NEGATION infixopmult )
					{
						// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:197:22: ^( NEGATION infixopmult )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEGATION, "NEGATION"), root_1);
						adaptor.addChild(root_1, stream_infixopmult.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:198:3: seqExp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_seqExp_in_infixopmult1597);
					seqExp109=seqExp();
					state._fsp--;

					adaptor.addChild(root_0, seqExp109.getTree());

					}
					break;
				case 3 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:199:3: 'nil'
					{
					root_0 = (Object)adaptor.nil();


					string_literal110=(Token)match(input,73,FOLLOW_73_in_infixopmult1601); 
					string_literal110_tree = (Object)adaptor.create(string_literal110);
					adaptor.addChild(root_0, string_literal110_tree);

					}
					break;
				case 4 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:200:3: STRINGLIT
					{
					root_0 = (Object)adaptor.nil();


					STRINGLIT111=(Token)match(input,STRINGLIT,FOLLOW_STRINGLIT_in_infixopmult1605); 
					STRINGLIT111_tree = (Object)adaptor.create(STRINGLIT111);
					adaptor.addChild(root_0, STRINGLIT111_tree);

					}
					break;
				case 5 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:201:3: INTLIT
					{
					root_0 = (Object)adaptor.nil();


					INTLIT112=(Token)match(input,INTLIT,FOLLOW_INTLIT_in_infixopmult1609); 
					INTLIT112_tree = (Object)adaptor.create(INTLIT112);
					adaptor.addChild(root_0, INTLIT112_tree);

					}
					break;
				case 6 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:202:3: id
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_id_in_infixopmult1613);
					id113=id();
					state._fsp--;

					adaptor.addChild(root_0, id113.getTree());

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "infixopmult"


	public static class fieldCreate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fieldCreate"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:207:1: fieldCreate : ID '=' exp -> ^( FIELDCREATE ID exp ) ;
	public final fieldCreate_return fieldCreate() throws RecognitionException {
		fieldCreate_return retval = new fieldCreate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID114=null;
		Token char_literal115=null;
		ParserRuleReturnScope exp116 =null;

		Object ID114_tree=null;
		Object char_literal115_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:208:5: ( ID '=' exp -> ^( FIELDCREATE ID exp ) )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:208:9: ID '=' exp
			{
			ID114=(Token)match(input,ID,FOLLOW_ID_in_fieldCreate1633);  
			stream_ID.add(ID114);

			char_literal115=(Token)match(input,EQ,FOLLOW_EQ_in_fieldCreate1635);  
			stream_EQ.add(char_literal115);

			pushFollow(FOLLOW_exp_in_fieldCreate1637);
			exp116=exp();
			state._fsp--;

			stream_exp.add(exp116.getTree());
			// AST REWRITE
			// elements: ID, exp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 208:32: -> ^( FIELDCREATE ID exp )
			{
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:208:34: ^( FIELDCREATE ID exp )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELDCREATE, "FIELDCREATE"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_exp.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldCreate"


	public static class ifThen_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifThen"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:211:1: ifThen : 'if' exp 'then' expression ( options {greedy=true; } : 'else' expression )? -> ^( IF ^( COND exp ) ^( BLOCK expression ) ( ^( BLOCK expression ) )? ) ;
	public final ifThen_return ifThen() throws RecognitionException {
		ifThen_return retval = new ifThen_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal117=null;
		Token string_literal119=null;
		Token string_literal121=null;
		ParserRuleReturnScope exp118 =null;
		ParserRuleReturnScope expression120 =null;
		ParserRuleReturnScope expression122 =null;

		Object string_literal117_tree=null;
		Object string_literal119_tree=null;
		Object string_literal121_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:212:5: ( 'if' exp 'then' expression ( options {greedy=true; } : 'else' expression )? -> ^( IF ^( COND exp ) ^( BLOCK expression ) ( ^( BLOCK expression ) )? ) )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:212:8: 'if' exp 'then' expression ( options {greedy=true; } : 'else' expression )?
			{
			string_literal117=(Token)match(input,70,FOLLOW_70_in_ifThen1676);  
			stream_70.add(string_literal117);

			pushFollow(FOLLOW_exp_in_ifThen1678);
			exp118=exp();
			state._fsp--;

			stream_exp.add(exp118.getTree());
			string_literal119=(Token)match(input,75,FOLLOW_75_in_ifThen1681);  
			stream_75.add(string_literal119);

			pushFollow(FOLLOW_expression_in_ifThen1683);
			expression120=expression();
			state._fsp--;

			stream_expression.add(expression120.getTree());
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:212:36: ( options {greedy=true; } : 'else' expression )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==66) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:212:60: 'else' expression
					{
					string_literal121=(Token)match(input,66,FOLLOW_66_in_ifThen1694);  
					stream_66.add(string_literal121);

					pushFollow(FOLLOW_expression_in_ifThen1696);
					expression122=expression();
					state._fsp--;

					stream_expression.add(expression122.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: expression, expression, exp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 212:84: -> ^( IF ^( COND exp ) ^( BLOCK expression ) ( ^( BLOCK expression ) )? )
			{
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:212:87: ^( IF ^( COND exp ) ^( BLOCK expression ) ( ^( BLOCK expression ) )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:212:92: ^( COND exp )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
				adaptor.addChild(root_2, stream_exp.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:212:105: ^( BLOCK expression )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				adaptor.addChild(root_2, stream_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:212:125: ( ^( BLOCK expression ) )?
				if ( stream_expression.hasNext() ) {
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:212:125: ^( BLOCK expression )
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
					adaptor.addChild(root_2, stream_expression.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifThen"


	public static class whileExp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileExp"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:215:1: whileExp : 'while' exp 'do' expression -> ^( WHILE ^( COND exp ) ^( BLOCK expression ) ) ;
	public final whileExp_return whileExp() throws RecognitionException {
		whileExp_return retval = new whileExp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal123=null;
		Token string_literal125=null;
		ParserRuleReturnScope exp124 =null;
		ParserRuleReturnScope expression126 =null;

		Object string_literal123_tree=null;
		Object string_literal125_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:216:5: ( 'while' exp 'do' expression -> ^( WHILE ^( COND exp ) ^( BLOCK expression ) ) )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:216:9: 'while' exp 'do' expression
			{
			string_literal123=(Token)match(input,79,FOLLOW_79_in_whileExp1748);  
			stream_79.add(string_literal123);

			pushFollow(FOLLOW_exp_in_whileExp1750);
			exp124=exp();
			state._fsp--;

			stream_exp.add(exp124.getTree());
			string_literal125=(Token)match(input,65,FOLLOW_65_in_whileExp1752);  
			stream_65.add(string_literal125);

			pushFollow(FOLLOW_expression_in_whileExp1754);
			expression126=expression();
			state._fsp--;

			stream_expression.add(expression126.getTree());
			// AST REWRITE
			// elements: expression, exp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 216:44: -> ^( WHILE ^( COND exp ) ^( BLOCK expression ) )
			{
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:216:47: ^( WHILE ^( COND exp ) ^( BLOCK expression ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:216:55: ^( COND exp )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
				adaptor.addChild(root_2, stream_exp.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:216:68: ^( BLOCK expression )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				adaptor.addChild(root_2, stream_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileExp"


	public static class forExp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forExp"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:219:1: forExp : 'for' ID ':=' exp 'to' exp 'do' expression -> ^( FOR ^( ':=' ID exp ) ^( TO exp ) ^( DO expression ) ) ;
	public final forExp_return forExp() throws RecognitionException {
		forExp_return retval = new forExp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal127=null;
		Token ID128=null;
		Token string_literal129=null;
		Token string_literal131=null;
		Token string_literal133=null;
		ParserRuleReturnScope exp130 =null;
		ParserRuleReturnScope exp132 =null;
		ParserRuleReturnScope expression134 =null;

		Object string_literal127_tree=null;
		Object ID128_tree=null;
		Object string_literal129_tree=null;
		Object string_literal131_tree=null;
		Object string_literal133_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_ASSIG=new RewriteRuleTokenStream(adaptor,"token ASSIG");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:220:5: ( 'for' ID ':=' exp 'to' exp 'do' expression -> ^( FOR ^( ':=' ID exp ) ^( TO exp ) ^( DO expression ) ) )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:220:9: 'for' ID ':=' exp 'to' exp 'do' expression
			{
			string_literal127=(Token)match(input,68,FOLLOW_68_in_forExp1800);  
			stream_68.add(string_literal127);

			ID128=(Token)match(input,ID,FOLLOW_ID_in_forExp1802);  
			stream_ID.add(ID128);

			string_literal129=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_forExp1804);  
			stream_ASSIG.add(string_literal129);

			pushFollow(FOLLOW_exp_in_forExp1806);
			exp130=exp();
			state._fsp--;

			stream_exp.add(exp130.getTree());
			string_literal131=(Token)match(input,76,FOLLOW_76_in_forExp1808);  
			stream_76.add(string_literal131);

			pushFollow(FOLLOW_exp_in_forExp1810);
			exp132=exp();
			state._fsp--;

			stream_exp.add(exp132.getTree());
			string_literal133=(Token)match(input,65,FOLLOW_65_in_forExp1812);  
			stream_65.add(string_literal133);

			pushFollow(FOLLOW_expression_in_forExp1814);
			expression134=expression();
			state._fsp--;

			stream_expression.add(expression134.getTree());
			// AST REWRITE
			// elements: expression, ASSIG, exp, exp, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 220:58: -> ^( FOR ^( ':=' ID exp ) ^( TO exp ) ^( DO expression ) )
			{
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:220:61: ^( FOR ^( ':=' ID exp ) ^( TO exp ) ^( DO expression ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:220:67: ^( ':=' ID exp )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_ASSIG.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ID.nextNode());
				adaptor.addChild(root_2, stream_exp.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:220:82: ^( TO exp )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TO, "TO"), root_2);
				adaptor.addChild(root_2, stream_exp.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:220:92: ^( DO expression )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_2);
				adaptor.addChild(root_2, stream_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forExp"


	public static class letExp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "letExp"
	// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:223:1: letExp : 'let' ( decl )+ 'in' ( expression ( ';' expression )* )? 'end' -> ^( BODY ^( LET ( decl )+ ) ^( IN ( expression )* ) ) ;
	public final letExp_return letExp() throws RecognitionException {
		letExp_return retval = new letExp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal135=null;
		Token string_literal137=null;
		Token char_literal139=null;
		Token string_literal141=null;
		ParserRuleReturnScope decl136 =null;
		ParserRuleReturnScope expression138 =null;
		ParserRuleReturnScope expression140 =null;

		Object string_literal135_tree=null;
		Object string_literal137_tree=null;
		Object char_literal139_tree=null;
		Object string_literal141_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");

		try {
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:224:5: ( 'let' ( decl )+ 'in' ( expression ( ';' expression )* )? 'end' -> ^( BODY ^( LET ( decl )+ ) ^( IN ( expression )* ) ) )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:224:9: 'let' ( decl )+ 'in' ( expression ( ';' expression )* )? 'end'
			{
			string_literal135=(Token)match(input,72,FOLLOW_72_in_letExp1867);  
			stream_72.add(string_literal135);

			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:224:15: ( decl )+
			int cnt31=0;
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==69||(LA31_0 >= 77 && LA31_0 <= 78)) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:224:15: decl
					{
					pushFollow(FOLLOW_decl_in_letExp1869);
					decl136=decl();
					state._fsp--;

					stream_decl.add(decl136.getTree());
					}
					break;

				default :
					if ( cnt31 >= 1 ) break loop31;
					EarlyExitException eee = new EarlyExitException(31, input);
					throw eee;
				}
				cnt31++;
			}

			string_literal137=(Token)match(input,71,FOLLOW_71_in_letExp1872);  
			stream_71.add(string_literal137);

			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:224:26: ( expression ( ';' expression )* )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==ID||LA33_0==INTLIT||LA33_0==MOINS||LA33_0==STRINGLIT||LA33_0==55||LA33_0==61||LA33_0==68||LA33_0==70||(LA33_0 >= 72 && LA33_0 <= 73)||LA33_0==79) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:224:27: expression ( ';' expression )*
					{
					pushFollow(FOLLOW_expression_in_letExp1875);
					expression138=expression();
					state._fsp--;

					stream_expression.add(expression138.getTree());
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:224:38: ( ';' expression )*
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==60) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:224:39: ';' expression
							{
							char_literal139=(Token)match(input,60,FOLLOW_60_in_letExp1878);  
							stream_60.add(char_literal139);

							pushFollow(FOLLOW_expression_in_letExp1879);
							expression140=expression();
							state._fsp--;

							stream_expression.add(expression140.getTree());
							}
							break;

						default :
							break loop32;
						}
					}

					}
					break;

			}

			string_literal141=(Token)match(input,67,FOLLOW_67_in_letExp1885);  
			stream_67.add(string_literal141);

			// AST REWRITE
			// elements: expression, decl
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 224:67: -> ^( BODY ^( LET ( decl )+ ) ^( IN ( expression )* ) )
			{
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:224:69: ^( BODY ^( LET ( decl )+ ) ^( IN ( expression )* ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:224:76: ^( LET ( decl )+ )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LET, "LET"), root_2);
				if ( !(stream_decl.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_decl.hasNext() ) {
					adaptor.addChild(root_2, stream_decl.nextTree());
				}
				stream_decl.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:224:89: ^( IN ( expression )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:224:94: ( expression )*
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_2, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "letExp"

	// Delegated rules



	public static final BitSet FOLLOW_expression_in_fichier408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tyDec_in_decl499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDec_in_decl509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funDec_in_decl519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_tyDec538 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_tyDec539 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQ_in_tyDec540 = new BitSet(new long[]{0x0000000004000000L,0x0000000000010001L});
	public static final BitSet FOLLOW_ty_in_tyDec541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ty578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrTy_in_ty588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recTy_in_ty598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_arrTy618 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_arrTy619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_recTy658 = new BitSet(new long[]{0x0000000004000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_fieldDec_in_recTy660 = new BitSet(new long[]{0x0200000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_57_in_recTy662 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_fieldDec_in_recTy663 = new BitSet(new long[]{0x0200000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_recTy668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fieldDec703 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_fieldDec704 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_fieldDec705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_funDec768 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_funDec770 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_funDec772 = new BitSet(new long[]{0x0100000004000000L});
	public static final BitSet FOLLOW_fieldDec_in_funDec775 = new BitSet(new long[]{0x0300000000000000L});
	public static final BitSet FOLLOW_57_in_funDec777 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_fieldDec_in_funDec778 = new BitSet(new long[]{0x0300000000000000L});
	public static final BitSet FOLLOW_56_in_funDec783 = new BitSet(new long[]{0x0800000000080000L});
	public static final BitSet FOLLOW_funDec1_in_funDec786 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQ_in_funDec789 = new BitSet(new long[]{0x2080100424000000L,0x0000000000008350L});
	public static final BitSet FOLLOW_expression_in_funDec791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_funDec1867 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_funDec1869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_varDec901 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_varDec903 = new BitSet(new long[]{0x0800000000000400L});
	public static final BitSet FOLLOW_59_in_varDec906 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_varDec908 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ASSIG_in_varDec911 = new BitSet(new long[]{0x2080100424000000L,0x0000000000008350L});
	public static final BitSet FOLLOW_expression_in_varDec913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIG_in_varDec934 = new BitSet(new long[]{0x2080100424000000L,0x0000000000008350L});
	public static final BitSet FOLLOW_expression_in_varDec936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id976 = new BitSet(new long[]{0x4480000000000002L,0x0000000000010000L});
	public static final BitSet FOLLOW_callExp_in_id979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrRec_in_id992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subField_in_id1005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lValue2_in_id1017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_lValue21058 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_lValue21060 = new BitSet(new long[]{0x4400000000000000L});
	public static final BitSet FOLLOW_lValue1_in_lValue21062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sub_in_subField1095 = new BitSet(new long[]{0x4400000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_subFin_in_subField1097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_callExp1138 = new BitSet(new long[]{0x2180100424000000L,0x0000000000008350L});
	public static final BitSet FOLLOW_expression_in_callExp1140 = new BitSet(new long[]{0x0300000000000000L});
	public static final BitSet FOLLOW_57_in_callExp1142 = new BitSet(new long[]{0x2080100424000000L,0x0000000000008350L});
	public static final BitSet FOLLOW_expression_in_callExp1143 = new BitSet(new long[]{0x0300000000000000L});
	public static final BitSet FOLLOW_56_in_callExp1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_sub11165 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_sub11168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sub_in_sub11182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sub1_in_lValue11198 = new BitSet(new long[]{0x4400000000000000L});
	public static final BitSet FOLLOW_lValue1_in_lValue11200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_sub1221 = new BitSet(new long[]{0x2080100424000000L,0x0000000000008350L});
	public static final BitSet FOLLOW_expression_in_sub1223 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_sub1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_subFin1240 = new BitSet(new long[]{0x2080100424000000L,0x0000000000008350L});
	public static final BitSet FOLLOW_expression_in_subFin1242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lValue1_in_subFin1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_arrRec1269 = new BitSet(new long[]{0x0000000004000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_fieldCreate_in_arrRec1272 = new BitSet(new long[]{0x0200000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_57_in_arrRec1274 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_fieldCreate_in_arrRec1275 = new BitSet(new long[]{0x0200000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_arrRec1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_seqExp1301 = new BitSet(new long[]{0x2180100424000000L,0x0000000000008350L});
	public static final BitSet FOLLOW_expression_in_seqExp1304 = new BitSet(new long[]{0x1100000000000000L});
	public static final BitSet FOLLOW_60_in_seqExp1306 = new BitSet(new long[]{0x2080100424000000L,0x0000000000008350L});
	public static final BitSet FOLLOW_expression_in_seqExp1307 = new BitSet(new long[]{0x1100000000000000L});
	public static final BitSet FOLLOW_56_in_seqExp1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifThen_in_expression1334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileExp_in_expression1338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forExp_in_expression1342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_letExp_in_expression1346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_expression1351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_expression1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp1_in_exp1368 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_ASSIG_in_exp1380 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_exp1_in_exp1382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_infixopetou_in_exp11423 = new BitSet(new long[]{0x0000008000000022L});
	public static final BitSet FOLLOW_AND_in_exp11435 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_OR_in_exp11438 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_infixopetou_in_exp11442 = new BitSet(new long[]{0x0000008000000022L});
	public static final BitSet FOLLOW_infixopcomp_in_infixopetou1457 = new BitSet(new long[]{0x0000001243080002L});
	public static final BitSet FOLLOW_GE_in_infixopetou1468 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_EQ_in_infixopetou1473 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LE_in_infixopetou1478 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_NE_in_infixopetou1482 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_GT_in_infixopetou1487 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LT_in_infixopetou1492 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_infixopcomp_in_infixopetou1496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_infixopplus_in_infixopcomp1513 = new BitSet(new long[]{0x0000010400000002L});
	public static final BitSet FOLLOW_PLUS_in_infixopcomp1524 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_MOINS_in_infixopcomp1529 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_infixopplus_in_infixopcomp1534 = new BitSet(new long[]{0x0000010400000002L});
	public static final BitSet FOLLOW_infixopmult_in_infixopplus1550 = new BitSet(new long[]{0x0000000800010002L});
	public static final BitSet FOLLOW_MULT_in_infixopplus1561 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_DIV_in_infixopplus1566 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_infixopmult_in_infixopplus1571 = new BitSet(new long[]{0x0000000800010002L});
	public static final BitSet FOLLOW_MOINS_in_infixopmult1583 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_infixopmult_in_infixopmult1584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_seqExp_in_infixopmult1597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_infixopmult1601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGLIT_in_infixopmult1605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTLIT_in_infixopmult1609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_infixopmult1613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fieldCreate1633 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQ_in_fieldCreate1635 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_exp_in_fieldCreate1637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_ifThen1676 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_exp_in_ifThen1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_ifThen1681 = new BitSet(new long[]{0x2080100424000000L,0x0000000000008350L});
	public static final BitSet FOLLOW_expression_in_ifThen1683 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_ifThen1694 = new BitSet(new long[]{0x2080100424000000L,0x0000000000008350L});
	public static final BitSet FOLLOW_expression_in_ifThen1696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_whileExp1748 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_exp_in_whileExp1750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_whileExp1752 = new BitSet(new long[]{0x2080100424000000L,0x0000000000008350L});
	public static final BitSet FOLLOW_expression_in_whileExp1754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_forExp1800 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_forExp1802 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ASSIG_in_forExp1804 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_exp_in_forExp1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_forExp1808 = new BitSet(new long[]{0x0080100424000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_exp_in_forExp1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_forExp1812 = new BitSet(new long[]{0x2080100424000000L,0x0000000000008350L});
	public static final BitSet FOLLOW_expression_in_forExp1814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_letExp1867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006020L});
	public static final BitSet FOLLOW_decl_in_letExp1869 = new BitSet(new long[]{0x0000000000000000L,0x00000000000060A0L});
	public static final BitSet FOLLOW_71_in_letExp1872 = new BitSet(new long[]{0x2080100424000000L,0x0000000000008358L});
	public static final BitSet FOLLOW_expression_in_letExp1875 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_60_in_letExp1878 = new BitSet(new long[]{0x2080100424000000L,0x0000000000008350L});
	public static final BitSet FOLLOW_expression_in_letExp1879 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_letExp1885 = new BitSet(new long[]{0x0000000000000002L});
}
