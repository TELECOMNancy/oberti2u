// $ANTLR 3.5.1 /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g 2019-11-26 13:35:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class FINALLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int ACCCESS=4;
	public static final int ACCESS=5;
	public static final int AND=6;
	public static final int ARRAY=7;
	public static final int ARRAYACCESS=8;
	public static final int ASSIGNEMENT=9;
	public static final int BEGIN=10;
	public static final int BLOCK=11;
	public static final int BORNE=12;
	public static final int CALL=13;
	public static final int COMMENT2=14;
	public static final int DEC=15;
	public static final int DIV=16;
	public static final int DO=17;
	public static final int ELSE=18;
	public static final int END=19;
	public static final int EQUAL=20;
	public static final int EQUIV=21;
	public static final int ESC_SEQ=22;
	public static final int EXPONENT=23;
	public static final int FALSE=24;
	public static final int FLOAT=25;
	public static final int FOR=26;
	public static final int FORLISTELEMENT=27;
	public static final int GOTO=28;
	public static final int GREATER=29;
	public static final int HEX_DIGIT=30;
	public static final int ID=31;
	public static final int IF=32;
	public static final int IMPL=33;
	public static final int INT=34;
	public static final int LABEL=35;
	public static final int LESS=36;
	public static final int LISTARG=37;
	public static final int LISTFOR=38;
	public static final int LISTPARA=39;
	public static final int MINUS=40;
	public static final int MULT=41;
	public static final int NOT=42;
	public static final int NOTEQUAL=43;
	public static final int NOTGREATER=44;
	public static final int NOTLESS=45;
	public static final int OCTAL_ESC=46;
	public static final int OR=47;
	public static final int OWN=48;
	public static final int PAS=49;
	public static final int PLUS=50;
	public static final int POWER=51;
	public static final int PROCEDURE=52;
	public static final int PROG=53;
	public static final int SPECIFICATION=54;
	public static final int STRING=55;
	public static final int SWITCH=56;
	public static final int THEN=57;
	public static final int TRUE=58;
	public static final int TYPEBOOL=59;
	public static final int TYPEINT=60;
	public static final int TYPEREAL=61;
	public static final int UNICODE_ESC=62;
	public static final int UNTIL=63;
	public static final int VALUE=64;
	public static final int WHILE=65;
	public static final int WS=66;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public FINALLexer() {} 
	public FINALLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public FINALLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:7:5: ( 'AND' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:7:7: 'AND'
			{
			match("AND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "ARRAY"
	public final void mARRAY() throws RecognitionException {
		try {
			int _type = ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:8:7: ( 'ARRAY' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:8:9: 'ARRAY'
			{
			match("ARRAY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARRAY"

	// $ANTLR start "ASSIGNEMENT"
	public final void mASSIGNEMENT() throws RecognitionException {
		try {
			int _type = ASSIGNEMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:9:13: ( ':=' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:9:15: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGNEMENT"

	// $ANTLR start "BEGIN"
	public final void mBEGIN() throws RecognitionException {
		try {
			int _type = BEGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:10:7: ( 'BEGIN' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:10:9: 'BEGIN'
			{
			match("BEGIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BEGIN"

	// $ANTLR start "BORNE"
	public final void mBORNE() throws RecognitionException {
		try {
			int _type = BORNE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:11:7: ( ':' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:11:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BORNE"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:12:5: ( '/' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:12:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:13:4: ( 'DO' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:13:6: 'DO'
			{
			match("DO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:14:6: ( 'ELSE' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:14:8: 'ELSE'
			{
			match("ELSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:15:5: ( 'END' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:15:7: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:16:7: ( 'EQUAL' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:16:9: 'EQUAL'
			{
			match("EQUAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "EQUIV"
	public final void mEQUIV() throws RecognitionException {
		try {
			int _type = EQUIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:17:7: ( 'EQUIV' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:17:9: 'EQUIV'
			{
			match("EQUIV"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUIV"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:18:5: ( 'FOR' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:18:7: 'FOR'
			{
			match("FOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "GOTO"
	public final void mGOTO() throws RecognitionException {
		try {
			int _type = GOTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:19:6: ( 'GOTO' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:19:8: 'GOTO'
			{
			match("GOTO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GOTO"

	// $ANTLR start "GREATER"
	public final void mGREATER() throws RecognitionException {
		try {
			int _type = GREATER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:20:9: ( 'GREATER' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:20:11: 'GREATER'
			{
			match("GREATER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:21:4: ( 'IF' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:21:6: 'IF'
			{
			match("IF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "IMPL"
	public final void mIMPL() throws RecognitionException {
		try {
			int _type = IMPL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:22:6: ( 'IMPL' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:22:8: 'IMPL'
			{
			match("IMPL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPL"

	// $ANTLR start "LESS"
	public final void mLESS() throws RecognitionException {
		try {
			int _type = LESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:23:6: ( 'LESS' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:23:8: 'LESS'
			{
			match("LESS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:24:7: ( '-' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:24:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:25:6: ( '*' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:25:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:26:5: ( 'NOT' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:26:7: 'NOT'
			{
			match("NOT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:27:4: ( 'OR' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:27:6: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "OWN"
	public final void mOWN() throws RecognitionException {
		try {
			int _type = OWN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:28:5: ( 'OWN' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:28:7: 'OWN'
			{
			match("OWN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OWN"

	// $ANTLR start "PAS"
	public final void mPAS() throws RecognitionException {
		try {
			int _type = PAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:29:5: ( 'STEP' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:29:7: 'STEP'
			{
			match("STEP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PAS"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:30:6: ( '+' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:30:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "POWER"
	public final void mPOWER() throws RecognitionException {
		try {
			int _type = POWER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:31:7: ( 'POWER' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:31:9: 'POWER'
			{
			match("POWER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POWER"

	// $ANTLR start "PROCEDURE"
	public final void mPROCEDURE() throws RecognitionException {
		try {
			int _type = PROCEDURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:32:11: ( 'PROCEDURE' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:32:13: 'PROCEDURE'
			{
			match("PROCEDURE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROCEDURE"

	// $ANTLR start "PROG"
	public final void mPROG() throws RecognitionException {
		try {
			int _type = PROG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:33:6: ( 'PROG' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:33:8: 'PROG'
			{
			match("PROG"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROG"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:34:8: ( 'SWITCH' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:34:10: 'SWITCH'
			{
			match("SWITCH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:35:6: ( 'THEN' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:35:8: 'THEN'
			{
			match("THEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "TYPEBOOL"
	public final void mTYPEBOOL() throws RecognitionException {
		try {
			int _type = TYPEBOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:36:10: ( 'BOOLEAN' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:36:12: 'BOOLEAN'
			{
			match("BOOLEAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPEBOOL"

	// $ANTLR start "TYPEINT"
	public final void mTYPEINT() throws RecognitionException {
		try {
			int _type = TYPEINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:37:9: ( 'INTEGER' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:37:11: 'INTEGER'
			{
			match("INTEGER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPEINT"

	// $ANTLR start "TYPEREAL"
	public final void mTYPEREAL() throws RecognitionException {
		try {
			int _type = TYPEREAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:38:10: ( 'REAL' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:38:12: 'REAL'
			{
			match("REAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPEREAL"

	// $ANTLR start "UNTIL"
	public final void mUNTIL() throws RecognitionException {
		try {
			int _type = UNTIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:39:7: ( 'UNTIL' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:39:9: 'UNTIL'
			{
			match("UNTIL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNTIL"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:40:7: ( 'WHILE' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:40:9: 'WHILE'
			{
			match("WHILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:41:7: ( '(' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:41:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:42:7: ( ')' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:42:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:43:7: ( ',' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:43:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:44:7: ( ';' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:44:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:45:7: ( 'VALUE' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:45:9: 'VALUE'
			{
			match("VALUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:46:7: ( '[' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:46:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:47:7: ( ']' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:47:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:392:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:392:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:392:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:395:5: ( ( '0' .. '9' )+ )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:395:7: ( '0' .. '9' )+
			{
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:395:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:399:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:399:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:399:9: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:399:25: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:399:37: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:399:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:400:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:400:13: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:400:25: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:400:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:401:9: ( '0' .. '9' )+ EXPONENT
					{
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:401:9: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:405:5: ( 'COMMENT' ( options {greedy=false; } : . )* ';' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:405:7: 'COMMENT' ( options {greedy=false; } : . )* ';'
			{
			match("COMMENT"); 

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:405:17: ( options {greedy=false; } : . )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==';') ) {
					alt10=2;
				}
				else if ( ((LA10_0 >= '\u0000' && LA10_0 <= ':')||(LA10_0 >= '<' && LA10_0 <= '\uFFFF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:405:45: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop10;
				}
			}

			match(';'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:408:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:408:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:416:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:416:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:416:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='\\') ) {
					alt11=1;
				}
				else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '[')||(LA11_0 >= ']' && LA11_0 <= '\uFFFF')) ) {
					alt11=2;
				}

				switch (alt11) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:416:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:416:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop11;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:421:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:421:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:421:22: ( '+' | '-' )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='+'||LA12_0=='-') ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:421:33: ( '0' .. '9' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:424:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:428:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt14=3;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='\\') ) {
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
					alt14=1;
					}
					break;
				case 'u':
					{
					alt14=2;
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
					alt14=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:428:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:429:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:430:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:435:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt15=3;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\\') ) {
				int LA15_1 = input.LA(2);
				if ( ((LA15_1 >= '0' && LA15_1 <= '3')) ) {
					int LA15_2 = input.LA(3);
					if ( ((LA15_2 >= '0' && LA15_2 <= '7')) ) {
						int LA15_4 = input.LA(4);
						if ( ((LA15_4 >= '0' && LA15_4 <= '7')) ) {
							alt15=1;
						}

						else {
							alt15=2;
						}

					}

					else {
						alt15=3;
					}

				}
				else if ( ((LA15_1 >= '4' && LA15_1 <= '7')) ) {
					int LA15_3 = input.LA(3);
					if ( ((LA15_3 >= '0' && LA15_3 <= '7')) ) {
						alt15=2;
					}

					else {
						alt15=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:435:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:436:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:437:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:442:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:442:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:8: ( AND | ARRAY | ASSIGNEMENT | BEGIN | BORNE | DIV | DO | ELSE | END | EQUAL | EQUIV | FOR | GOTO | GREATER | IF | IMPL | LESS | MINUS | MULT | NOT | OR | OWN | PAS | PLUS | POWER | PROCEDURE | PROG | SWITCH | THEN | TYPEBOOL | TYPEINT | TYPEREAL | UNTIL | WHILE | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | ID | INT | FLOAT | COMMENT2 | WS | STRING )
		int alt16=47;
		alt16 = dfa16.predict(input);
		switch (alt16) {
			case 1 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:14: ARRAY
				{
				mARRAY(); 

				}
				break;
			case 3 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:20: ASSIGNEMENT
				{
				mASSIGNEMENT(); 

				}
				break;
			case 4 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:32: BEGIN
				{
				mBEGIN(); 

				}
				break;
			case 5 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:38: BORNE
				{
				mBORNE(); 

				}
				break;
			case 6 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:44: DIV
				{
				mDIV(); 

				}
				break;
			case 7 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:48: DO
				{
				mDO(); 

				}
				break;
			case 8 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:51: ELSE
				{
				mELSE(); 

				}
				break;
			case 9 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:56: END
				{
				mEND(); 

				}
				break;
			case 10 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:60: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 11 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:66: EQUIV
				{
				mEQUIV(); 

				}
				break;
			case 12 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:72: FOR
				{
				mFOR(); 

				}
				break;
			case 13 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:76: GOTO
				{
				mGOTO(); 

				}
				break;
			case 14 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:81: GREATER
				{
				mGREATER(); 

				}
				break;
			case 15 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:89: IF
				{
				mIF(); 

				}
				break;
			case 16 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:92: IMPL
				{
				mIMPL(); 

				}
				break;
			case 17 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:97: LESS
				{
				mLESS(); 

				}
				break;
			case 18 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:102: MINUS
				{
				mMINUS(); 

				}
				break;
			case 19 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:108: MULT
				{
				mMULT(); 

				}
				break;
			case 20 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:113: NOT
				{
				mNOT(); 

				}
				break;
			case 21 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:117: OR
				{
				mOR(); 

				}
				break;
			case 22 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:120: OWN
				{
				mOWN(); 

				}
				break;
			case 23 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:124: PAS
				{
				mPAS(); 

				}
				break;
			case 24 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:128: PLUS
				{
				mPLUS(); 

				}
				break;
			case 25 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:133: POWER
				{
				mPOWER(); 

				}
				break;
			case 26 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:139: PROCEDURE
				{
				mPROCEDURE(); 

				}
				break;
			case 27 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:149: PROG
				{
				mPROG(); 

				}
				break;
			case 28 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:154: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 29 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:161: THEN
				{
				mTHEN(); 

				}
				break;
			case 30 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:166: TYPEBOOL
				{
				mTYPEBOOL(); 

				}
				break;
			case 31 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:175: TYPEINT
				{
				mTYPEINT(); 

				}
				break;
			case 32 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:183: TYPEREAL
				{
				mTYPEREAL(); 

				}
				break;
			case 33 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:192: UNTIL
				{
				mUNTIL(); 

				}
				break;
			case 34 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:198: WHILE
				{
				mWHILE(); 

				}
				break;
			case 35 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:204: T__67
				{
				mT__67(); 

				}
				break;
			case 36 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:210: T__68
				{
				mT__68(); 

				}
				break;
			case 37 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:216: T__69
				{
				mT__69(); 

				}
				break;
			case 38 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:222: T__70
				{
				mT__70(); 

				}
				break;
			case 39 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:228: T__71
				{
				mT__71(); 

				}
				break;
			case 40 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:234: T__72
				{
				mT__72(); 

				}
				break;
			case 41 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:240: T__73
				{
				mT__73(); 

				}
				break;
			case 42 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:246: ID
				{
				mID(); 

				}
				break;
			case 43 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:249: INT
				{
				mINT(); 

				}
				break;
			case 44 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:253: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 45 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:259: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 46 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:268: WS
				{
				mWS(); 

				}
				break;
			case 47 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/FINAL.g:1:271: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA16 dfa16 = new DFA16(this);
	static final String DFA9_eotS =
		"\5\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "398:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA16_eotS =
		"\1\uffff\1\40\1\46\1\40\1\uffff\6\40\2\uffff\3\40\1\uffff\5\40\4\uffff"+
		"\1\40\2\uffff\1\40\1\101\4\uffff\2\40\2\uffff\2\40\1\106\6\40\1\115\4"+
		"\40\1\122\13\40\1\uffff\1\136\3\40\1\uffff\1\40\1\143\1\40\1\146\2\40"+
		"\1\uffff\3\40\1\154\1\uffff\1\155\12\40\1\uffff\3\40\1\174\1\uffff\2\40"+
		"\1\uffff\1\177\1\40\1\u0081\1\40\1\u0083\2\uffff\1\u0084\3\40\1\u0088"+
		"\1\u0089\1\u008a\4\40\1\u008f\1\u0090\1\40\1\uffff\1\u0092\1\u0093\1\uffff"+
		"\1\40\1\uffff\1\40\2\uffff\1\40\1\u0097\1\40\3\uffff\1\u0099\1\u009a\1"+
		"\u009b\1\40\2\uffff\1\40\2\uffff\2\40\1\u00a0\1\uffff\1\40\3\uffff\1\40"+
		"\1\u00a3\1\u00a4\1\u00a5\1\uffff\2\40\3\uffff\1\40\1\uffff\1\40\1\u00aa"+
		"\1\uffff";
	static final String DFA16_eofS =
		"\u00ab\uffff";
	static final String DFA16_minS =
		"\1\11\1\116\1\75\1\105\1\uffff\1\117\1\114\2\117\1\106\1\105\2\uffff\1"+
		"\117\1\122\1\124\1\uffff\1\117\1\110\1\105\1\116\1\110\4\uffff\1\101\2"+
		"\uffff\1\117\1\56\4\uffff\1\104\1\122\2\uffff\1\107\1\117\1\60\1\123\1"+
		"\104\1\125\1\122\1\124\1\105\1\60\1\120\1\124\1\123\1\124\1\60\1\116\1"+
		"\105\1\111\1\127\1\117\1\105\1\101\1\124\1\111\1\114\1\115\1\uffff\1\60"+
		"\1\101\1\111\1\114\1\uffff\1\105\1\60\1\101\1\60\1\117\1\101\1\uffff\1"+
		"\114\1\105\1\123\1\60\1\uffff\1\60\1\120\1\124\1\105\1\103\1\116\1\114"+
		"\1\111\1\114\1\125\1\115\1\uffff\1\131\1\116\1\105\1\60\1\uffff\1\114"+
		"\1\126\1\uffff\1\60\1\124\1\60\1\107\1\60\2\uffff\1\60\1\103\1\122\1\105"+
		"\3\60\1\114\3\105\2\60\1\101\1\uffff\2\60\1\uffff\1\105\1\uffff\1\105"+
		"\2\uffff\1\110\1\60\1\104\3\uffff\3\60\1\116\2\uffff\1\116\2\uffff\2\122"+
		"\1\60\1\uffff\1\125\3\uffff\1\124\3\60\1\uffff\1\122\1\0\3\uffff\1\105"+
		"\1\uffff\1\0\1\60\1\uffff";
	static final String DFA16_maxS =
		"\1\172\1\122\1\75\1\117\1\uffff\1\117\1\121\1\117\1\122\1\116\1\105\2"+
		"\uffff\1\117\2\127\1\uffff\1\122\1\110\1\105\1\116\1\110\4\uffff\1\101"+
		"\2\uffff\1\117\1\145\4\uffff\1\104\1\122\2\uffff\1\107\1\117\1\172\1\123"+
		"\1\104\1\125\1\122\1\124\1\105\1\172\1\120\1\124\1\123\1\124\1\172\1\116"+
		"\1\105\1\111\1\127\1\117\1\105\1\101\1\124\1\111\1\114\1\115\1\uffff\1"+
		"\172\1\101\1\111\1\114\1\uffff\1\105\1\172\1\111\1\172\1\117\1\101\1\uffff"+
		"\1\114\1\105\1\123\1\172\1\uffff\1\172\1\120\1\124\1\105\1\107\1\116\1"+
		"\114\1\111\1\114\1\125\1\115\1\uffff\1\131\1\116\1\105\1\172\1\uffff\1"+
		"\114\1\126\1\uffff\1\172\1\124\1\172\1\107\1\172\2\uffff\1\172\1\103\1"+
		"\122\1\105\3\172\1\114\3\105\2\172\1\101\1\uffff\2\172\1\uffff\1\105\1"+
		"\uffff\1\105\2\uffff\1\110\1\172\1\104\3\uffff\3\172\1\116\2\uffff\1\116"+
		"\2\uffff\2\122\1\172\1\uffff\1\125\3\uffff\1\124\3\172\1\uffff\1\122\1"+
		"\uffff\3\uffff\1\105\1\uffff\1\uffff\1\172\1\uffff";
	static final String DFA16_acceptS =
		"\4\uffff\1\6\6\uffff\1\22\1\23\3\uffff\1\30\5\uffff\1\43\1\44\1\45\1\46"+
		"\1\uffff\1\50\1\51\2\uffff\1\54\1\52\1\56\1\57\2\uffff\1\3\1\5\32\uffff"+
		"\1\53\4\uffff\1\7\6\uffff\1\17\4\uffff\1\25\13\uffff\1\1\4\uffff\1\11"+
		"\2\uffff\1\14\5\uffff\1\24\1\26\16\uffff\1\10\2\uffff\1\15\1\uffff\1\20"+
		"\1\uffff\1\21\1\27\3\uffff\1\33\1\35\1\40\4\uffff\1\2\1\4\1\uffff\1\12"+
		"\1\13\3\uffff\1\31\1\uffff\1\41\1\42\1\47\4\uffff\1\34\2\uffff\1\36\1"+
		"\16\1\37\1\uffff\1\55\2\uffff\1\32";
	static final String DFA16_specialS =
		"\u00a2\uffff\1\0\5\uffff\1\1\2\uffff}>";
	static final String[] DFA16_transitionS = {
			"\2\41\2\uffff\1\41\22\uffff\1\41\1\uffff\1\42\5\uffff\1\26\1\27\1\14"+
			"\1\20\1\30\1\13\1\37\1\4\12\36\1\2\1\31\5\uffff\1\1\1\3\1\35\1\5\1\6"+
			"\1\7\1\10\1\40\1\11\2\40\1\12\1\40\1\15\1\16\1\21\1\40\1\23\1\17\1\22"+
			"\1\24\1\32\1\25\3\40\1\33\1\uffff\1\34\1\uffff\1\40\1\uffff\32\40",
			"\1\43\3\uffff\1\44",
			"\1\45",
			"\1\47\11\uffff\1\50",
			"",
			"\1\51",
			"\1\52\1\uffff\1\53\2\uffff\1\54",
			"\1\55",
			"\1\56\2\uffff\1\57",
			"\1\60\6\uffff\1\61\1\62",
			"\1\63",
			"",
			"",
			"\1\64",
			"\1\65\4\uffff\1\66",
			"\1\67\2\uffff\1\70",
			"",
			"\1\71\2\uffff\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"",
			"",
			"",
			"",
			"\1\77",
			"",
			"",
			"\1\100",
			"\1\37\1\uffff\12\36\13\uffff\1\37\37\uffff\1\37",
			"",
			"",
			"",
			"",
			"\1\102",
			"\1\103",
			"",
			"",
			"\1\104",
			"\1\105",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\137",
			"\1\140",
			"\1\141",
			"",
			"\1\142",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\144\7\uffff\1\145",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\147",
			"\1\150",
			"",
			"\1\151",
			"\1\152",
			"\1\153",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161\3\uffff\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"",
			"\1\171",
			"\1\172",
			"\1\173",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\175",
			"\1\176",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0080",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0082",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0091",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\u0094",
			"",
			"\1\u0095",
			"",
			"",
			"\1\u0096",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0098",
			"",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u009c",
			"",
			"",
			"\1\u009d",
			"",
			"",
			"\1\u009e",
			"\1\u009f",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\u00a1",
			"",
			"",
			"",
			"\1\u00a2",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\u00a6",
			"\60\u00a7\12\u00a8\7\u00a7\32\u00a8\4\u00a7\1\u00a8\1\u00a7\32\u00a8"+
			"\uff85\u00a7",
			"",
			"",
			"",
			"\1\u00a9",
			"",
			"\60\u00a7\12\u00a8\7\u00a7\32\u00a8\4\u00a7\1\u00a8\1\u00a7\32\u00a8"+
			"\uff85\u00a7",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | ARRAY | ASSIGNEMENT | BEGIN | BORNE | DIV | DO | ELSE | END | EQUAL | EQUIV | FOR | GOTO | GREATER | IF | IMPL | LESS | MINUS | MULT | NOT | OR | OWN | PAS | PLUS | POWER | PROCEDURE | PROG | SWITCH | THEN | TYPEBOOL | TYPEINT | TYPEREAL | UNTIL | WHILE | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | ID | INT | FLOAT | COMMENT2 | WS | STRING );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA16_162 = input.LA(1);
						s = -1;
						if ( ((LA16_162 >= '\u0000' && LA16_162 <= '/')||(LA16_162 >= ':' && LA16_162 <= '@')||(LA16_162 >= '[' && LA16_162 <= '^')||LA16_162=='`'||(LA16_162 >= '{' && LA16_162 <= '\uFFFF')) ) {s = 167;}
						else if ( ((LA16_162 >= '0' && LA16_162 <= '9')||(LA16_162 >= 'A' && LA16_162 <= 'Z')||LA16_162=='_'||(LA16_162 >= 'a' && LA16_162 <= 'z')) ) {s = 168;}
						else s = 32;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA16_168 = input.LA(1);
						s = -1;
						if ( ((LA16_168 >= '\u0000' && LA16_168 <= '/')||(LA16_168 >= ':' && LA16_168 <= '@')||(LA16_168 >= '[' && LA16_168 <= '^')||LA16_168=='`'||(LA16_168 >= '{' && LA16_168 <= '\uFFFF')) ) {s = 167;}
						else if ( ((LA16_168 >= '0' && LA16_168 <= '9')||(LA16_168 >= 'A' && LA16_168 <= 'Z')||LA16_168=='_'||(LA16_168 >= 'a' && LA16_168 <= 'z')) ) {s = 168;}
						else s = 32;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 16, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
