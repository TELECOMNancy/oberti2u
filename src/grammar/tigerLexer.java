// $ANTLR null /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g 2019-04-10 14:54:39
package grammar;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tigerLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tigerLexer() {} 
	public tigerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tigerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:7:5: ( '&' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:7:7: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "ASSIG"
	public final void mASSIG() throws RecognitionException {
		try {
			int _type = ASSIG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:8:7: ( ':=' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:8:9: ':='
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
	// $ANTLR end "ASSIG"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:9:5: ( '/' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:9:7: '/'
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

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:10:4: ( '=' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:10:6: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:11:4: ( '>=' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:11:6: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:12:4: ( '>' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:12:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:13:4: ( '<=' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:13:6: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:14:4: ( '<' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:14:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "MOINS"
	public final void mMOINS() throws RecognitionException {
		try {
			int _type = MOINS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:15:7: ( '-' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:15:9: '-'
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
	// $ANTLR end "MOINS"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:16:6: ( '*' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:16:8: '*'
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

	// $ANTLR start "NE"
	public final void mNE() throws RecognitionException {
		try {
			int _type = NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:17:4: ( '<>' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:17:6: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:18:4: ( '|' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:18:6: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:19:6: ( '+' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:19:8: '+'
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

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:20:7: ( '(' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:20:9: '('
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
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:21:7: ( ')' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:21:9: ')'
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
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:22:7: ( ',' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:22:9: ','
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
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:23:7: ( '.' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:23:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:24:7: ( ':' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:24:9: ':'
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
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:25:7: ( ';' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:25:9: ';'
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
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:26:7: ( 'Break' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:26:9: 'Break'
			{
			match("Break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:27:7: ( '[' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:27:9: '['
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
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:28:7: ( ']' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:28:9: ']'
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
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:29:7: ( 'array of' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:29:9: 'array of'
			{
			match("array of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:30:7: ( 'do' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:30:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:31:7: ( 'else' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:31:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:32:7: ( 'end' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:32:9: 'end'
			{
			match("end"); 

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
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:33:7: ( 'for' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:33:9: 'for'
			{
			match("for"); 

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
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:34:7: ( 'function' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:34:9: 'function'
			{
			match("function"); 

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
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:35:7: ( 'if' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:35:9: 'if'
			{
			match("if"); 

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
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:36:7: ( 'in' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:36:9: 'in'
			{
			match("in"); 

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
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:37:7: ( 'let' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:37:9: 'let'
			{
			match("let"); 

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
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:38:7: ( 'nil' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:38:9: 'nil'
			{
			match("nil"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:39:7: ( 'of' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:39:9: 'of'
			{
			match("of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:40:7: ( 'then' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:40:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:41:7: ( 'to' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:41:9: 'to'
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:42:7: ( 'type' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:42:9: 'type'
			{
			match("type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:43:7: ( 'var' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:43:9: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:44:7: ( 'while' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:44:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:45:7: ( '{' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:45:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:46:7: ( '}' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:46:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "INTLIT"
	public final void mINTLIT() throws RecognitionException {
		try {
			int _type = INTLIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:227:8: ( ( '0' .. '9' )+ )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:227:9: ( '0' .. '9' )+
			{
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:227:9: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTLIT"

	// $ANTLR start "STRINGLIT"
	public final void mSTRINGLIT() throws RecognitionException {
		try {
			int _type = STRINGLIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:230:2: ( ( '\"' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\n' | '\\t' | '\\^c' | '\\ddd' | '\\\\' | '\\s...s\\ ' )* ( '\"' ) )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:231:2: ( '\"' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\n' | '\\t' | '\\^c' | '\\ddd' | '\\\\' | '\\s...s\\ ' )* ( '\"' )
			{
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:231:2: ( '\"' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:231:3: '\"'
			{
			match('\"'); 
			}

			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:231:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\n' | '\\t' | '\\^c' | '\\ddd' | '\\\\' | '\\s...s\\ ' )*
			loop2:
			while (true) {
				int alt2=10;
				switch ( input.LA(1) ) {
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt2=1;
					}
					break;
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					{
					alt2=2;
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
				case '8':
				case '9':
					{
					alt2=3;
					}
					break;
				case '\n':
					{
					alt2=4;
					}
					break;
				case '\t':
					{
					alt2=5;
					}
					break;
				case '\u0000':
					{
					switch ( input.LA(2) ) {
					case 'c':
						{
						alt2=6;
						}
						break;
					case 'd':
						{
						alt2=7;
						}
						break;
					case '.':
						{
						alt2=9;
						}
						break;
					}
					}
					break;
				case '\\':
					{
					alt2=8;
					}
					break;
				}
				switch (alt2) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:231:36: 'a' .. 'z'
					{
					matchRange('a','z'); 
					}
					break;
				case 2 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:231:45: 'A' .. 'Z'
					{
					matchRange('A','Z'); 
					}
					break;
				case 3 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:231:54: '0' .. '9'
					{
					matchRange('0','9'); 
					}
					break;
				case 4 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:231:63: '\\n'
					{
					match('\n'); 
					}
					break;
				case 5 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:231:68: '\\t'
					{
					match('\t'); 
					}
					break;
				case 6 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:231:73: '\\^c'
					{
					match("^c"); 

					}
					break;
				case 7 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:231:79: '\\ddd'
					{
					match("ddd"); 

					}
					break;
				case 8 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:231:86: '\\\\'
					{
					match('\\'); 
					}
					break;
				case 9 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:231:91: '\\s...s\\ '
					{
					match("s...s "); 

					}
					break;

				default :
					break loop2;
				}
			}

			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:231:103: ( '\"' )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:231:104: '\"'
			{
			match('\"'); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGLIT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:233:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:233:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:233:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop3;
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:235:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:235:8: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:235:8: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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

	@Override
	public void mTokens() throws RecognitionException {
		// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:8: ( AND | ASSIG | DIV | EQ | GE | GT | LE | LT | MOINS | MULT | NE | OR | PLUS | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | INTLIT | STRINGLIT | ID | WS )
		int alt5=44;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:14: ASSIG
				{
				mASSIG(); 

				}
				break;
			case 3 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:20: DIV
				{
				mDIV(); 

				}
				break;
			case 4 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:24: EQ
				{
				mEQ(); 

				}
				break;
			case 5 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:27: GE
				{
				mGE(); 

				}
				break;
			case 6 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:30: GT
				{
				mGT(); 

				}
				break;
			case 7 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:33: LE
				{
				mLE(); 

				}
				break;
			case 8 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:36: LT
				{
				mLT(); 

				}
				break;
			case 9 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:39: MOINS
				{
				mMOINS(); 

				}
				break;
			case 10 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:45: MULT
				{
				mMULT(); 

				}
				break;
			case 11 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:50: NE
				{
				mNE(); 

				}
				break;
			case 12 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:53: OR
				{
				mOR(); 

				}
				break;
			case 13 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:56: PLUS
				{
				mPLUS(); 

				}
				break;
			case 14 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:61: T__55
				{
				mT__55(); 

				}
				break;
			case 15 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:67: T__56
				{
				mT__56(); 

				}
				break;
			case 16 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:73: T__57
				{
				mT__57(); 

				}
				break;
			case 17 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:79: T__58
				{
				mT__58(); 

				}
				break;
			case 18 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:85: T__59
				{
				mT__59(); 

				}
				break;
			case 19 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:91: T__60
				{
				mT__60(); 

				}
				break;
			case 20 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:97: T__61
				{
				mT__61(); 

				}
				break;
			case 21 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:103: T__62
				{
				mT__62(); 

				}
				break;
			case 22 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:109: T__63
				{
				mT__63(); 

				}
				break;
			case 23 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:115: T__64
				{
				mT__64(); 

				}
				break;
			case 24 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:121: T__65
				{
				mT__65(); 

				}
				break;
			case 25 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:127: T__66
				{
				mT__66(); 

				}
				break;
			case 26 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:133: T__67
				{
				mT__67(); 

				}
				break;
			case 27 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:139: T__68
				{
				mT__68(); 

				}
				break;
			case 28 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:145: T__69
				{
				mT__69(); 

				}
				break;
			case 29 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:151: T__70
				{
				mT__70(); 

				}
				break;
			case 30 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:157: T__71
				{
				mT__71(); 

				}
				break;
			case 31 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:163: T__72
				{
				mT__72(); 

				}
				break;
			case 32 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:169: T__73
				{
				mT__73(); 

				}
				break;
			case 33 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:175: T__74
				{
				mT__74(); 

				}
				break;
			case 34 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:181: T__75
				{
				mT__75(); 

				}
				break;
			case 35 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:187: T__76
				{
				mT__76(); 

				}
				break;
			case 36 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:193: T__77
				{
				mT__77(); 

				}
				break;
			case 37 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:199: T__78
				{
				mT__78(); 

				}
				break;
			case 38 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:205: T__79
				{
				mT__79(); 

				}
				break;
			case 39 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:211: T__80
				{
				mT__80(); 

				}
				break;
			case 40 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:217: T__81
				{
				mT__81(); 

				}
				break;
			case 41 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:223: INTLIT
				{
				mINTLIT(); 

				}
				break;
			case 42 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:230: STRINGLIT
				{
				mSTRINGLIT(); 

				}
				break;
			case 43 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:240: ID
				{
				mID(); 

				}
				break;
			case 44 :
				// /home/etudiants/jeyasoth1u/NAS_UL_ETUDIANTS/2018-2019/PCL/compilFinal/tiger.g:1:243: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\2\uffff\1\45\2\uffff\1\47\1\52\11\uffff\1\42\2\uffff\13\42\2\uffff\1"+
		"\74\12\uffff\2\42\1\100\4\42\1\105\1\106\2\42\1\111\1\42\1\113\3\42\1"+
		"\uffff\1\74\2\42\1\uffff\1\42\1\122\1\123\1\42\2\uffff\1\125\1\126\1\uffff"+
		"\1\42\1\uffff\1\42\1\131\3\42\1\135\2\uffff\1\42\2\uffff\1\137\1\140\1"+
		"\uffff\1\42\1\142\1\42\1\uffff\1\42\2\uffff\1\145\2\uffff\1\42\1\uffff"+
		"\1\42\1\150\1\uffff";
	static final String DFA5_eofS =
		"\151\uffff";
	static final String DFA5_minS =
		"\1\11\1\uffff\1\75\2\uffff\2\75\11\uffff\1\162\2\uffff\1\162\1\157\1\154"+
		"\1\157\1\146\1\145\1\151\1\146\1\150\1\141\1\150\2\uffff\1\60\12\uffff"+
		"\1\145\1\162\1\60\1\163\1\144\1\162\1\156\2\60\1\164\1\154\1\60\1\145"+
		"\1\60\1\160\1\162\1\151\1\uffff\1\60\2\141\1\uffff\1\145\2\60\1\143\2"+
		"\uffff\2\60\1\uffff\1\156\1\uffff\1\145\1\60\1\154\1\153\1\171\1\60\2"+
		"\uffff\1\164\2\uffff\2\60\1\uffff\1\145\1\60\1\40\1\uffff\1\151\2\uffff"+
		"\1\60\2\uffff\1\157\1\uffff\1\156\1\60\1\uffff";
	static final String DFA5_maxS =
		"\1\175\1\uffff\1\75\2\uffff\1\75\1\76\11\uffff\1\162\2\uffff\1\162\1\157"+
		"\1\156\1\165\1\156\1\145\1\151\1\146\1\171\1\141\1\150\2\uffff\1\172\12"+
		"\uffff\1\145\1\162\1\172\1\163\1\144\1\162\1\156\2\172\1\164\1\154\1\172"+
		"\1\145\1\172\1\160\1\162\1\151\1\uffff\1\172\2\141\1\uffff\1\145\2\172"+
		"\1\143\2\uffff\2\172\1\uffff\1\156\1\uffff\1\145\1\172\1\154\1\153\1\171"+
		"\1\172\2\uffff\1\164\2\uffff\2\172\1\uffff\1\145\1\172\1\40\1\uffff\1"+
		"\151\2\uffff\1\172\2\uffff\1\157\1\uffff\1\156\1\172\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\uffff\1\3\1\4\2\uffff\1\11\1\12\1\14\1\15\1\16\1\17\1\20"+
		"\1\21\1\23\1\uffff\1\25\1\26\13\uffff\1\47\1\50\1\uffff\1\52\1\53\1\54"+
		"\1\2\1\22\1\5\1\6\1\7\1\13\1\10\21\uffff\1\51\3\uffff\1\30\4\uffff\1\35"+
		"\1\36\2\uffff\1\41\1\uffff\1\43\6\uffff\1\32\1\33\1\uffff\1\37\1\40\2"+
		"\uffff\1\45\3\uffff\1\31\1\uffff\1\42\1\44\1\uffff\1\24\1\27\1\uffff\1"+
		"\46\2\uffff\1\34";
	static final String DFA5_specialS =
		"\151\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\43\2\uffff\1\43\22\uffff\1\43\1\uffff\1\41\3\uffff\1\1\1\uffff\1\13"+
			"\1\14\1\10\1\12\1\15\1\7\1\16\1\3\12\40\1\2\1\17\1\6\1\4\1\5\2\uffff"+
			"\1\42\1\20\30\42\1\21\1\uffff\1\22\3\uffff\1\23\2\42\1\24\1\25\1\26\2"+
			"\42\1\27\2\42\1\30\1\42\1\31\1\32\4\42\1\33\1\42\1\34\1\35\3\42\1\36"+
			"\1\11\1\37",
			"",
			"\1\44",
			"",
			"",
			"\1\46",
			"\1\50\1\51",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\53",
			"",
			"",
			"\1\54",
			"\1\55",
			"\1\56\1\uffff\1\57",
			"\1\60\5\uffff\1\61",
			"\1\62\7\uffff\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67\6\uffff\1\70\11\uffff\1\71",
			"\1\72",
			"\1\73",
			"",
			"",
			"\12\75\7\uffff\32\42\6\uffff\32\42",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\76",
			"\1\77",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\107",
			"\1\110",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\112",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\114",
			"\1\115",
			"\1\116",
			"",
			"\12\75\7\uffff\32\42\6\uffff\32\42",
			"\1\117",
			"\1\120",
			"",
			"\1\121",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\124",
			"",
			"",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"",
			"\1\127",
			"",
			"\1\130",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\132",
			"\1\133",
			"\1\134",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"",
			"",
			"\1\136",
			"",
			"",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"",
			"\1\141",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\143",
			"",
			"\1\144",
			"",
			"",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"",
			"",
			"\1\146",
			"",
			"\1\147",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
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

	protected class DFA5 extends DFA {

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
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | ASSIG | DIV | EQ | GE | GT | LE | LT | MOINS | MULT | NE | OR | PLUS | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | INTLIT | STRINGLIT | ID | WS );";
		}
	}

}
