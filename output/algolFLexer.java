// $ANTLR 3.5.1 /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g 2019-11-05 14:14:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class algolFLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public algolFLexer() {} 
	public algolFLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public algolFLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g"; }

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:7:7: ( '(' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:7:9: '('
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:8:7: ( ')' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:8:9: ')'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:9:7: ( '+' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:9:9: '+'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:10:7: ( ',' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:10:9: ','
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:11:7: ( '-' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:11:9: '-'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:12:7: ( ':' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:12:9: ':'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:13:7: ( ':=' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:13:9: ':='
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:14:7: ( ';' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:14:9: ';'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:15:7: ( 'ARRAY' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:15:9: 'ARRAY'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:16:7: ( 'BEGIN' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:16:9: 'BEGIN'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:17:7: ( 'BOOLEAN' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:17:9: 'BOOLEAN'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:18:7: ( 'DO' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:18:9: 'DO'
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:19:7: ( 'ELSE' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:19:9: 'ELSE'
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:20:7: ( 'END' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:20:9: 'END'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:21:7: ( 'FOR' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:21:9: 'FOR'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:22:7: ( 'GOTO' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:22:9: 'GOTO'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:23:7: ( 'IF' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:23:9: 'IF'
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:24:7: ( 'INTEGER' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:24:9: 'INTEGER'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:25:7: ( 'LABEL' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:25:9: 'LABEL'
			{
			match("LABEL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:26:7: ( 'OWN' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:26:9: 'OWN'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:27:7: ( 'POW' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:27:9: 'POW'
			{
			match("POW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:28:7: ( 'PROCEDURE' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:28:9: 'PROCEDURE'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:29:7: ( 'REAL' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:29:9: 'REAL'
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:30:7: ( 'STEP' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:30:9: 'STEP'
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:31:7: ( 'STRING' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:31:9: 'STRING'
			{
			match("STRING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:32:7: ( 'SWITCH' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:32:9: 'SWITCH'
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:33:7: ( 'THEN' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:33:9: 'THEN'
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:34:7: ( 'UNTIL' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:34:9: 'UNTIL'
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:35:7: ( 'VALUE' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:35:9: 'VALUE'
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:36:7: ( 'WHILE' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:36:9: 'WHILE'
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:37:7: ( 'Y' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:37:9: 'Y'
			{
			match('Y'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:38:7: ( '[' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:38:9: '['
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
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:39:7: ( ']' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:39:9: ']'
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
	// $ANTLR end "T__48"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:405:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | 'a' .. 'b' | '_' )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:405:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | 'a' .. 'b' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:405:31: ( 'a' .. 'z' | 'A' .. 'Z' | 'a' .. 'b' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:408:5: ( ( '0' .. '9' )+ )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:408:7: ( '0' .. '9' )+
			{
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:408:7: ( '0' .. '9' )+
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:412:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:412:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:412:9: ( '0' .. '9' )+
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
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:412:25: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:
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

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:412:37: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:412:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:413:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:413:13: ( '0' .. '9' )+
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
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:
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

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:413:25: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:413:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:414:9: ( '0' .. '9' )+ EXPONENT
					{
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:414:9: ( '0' .. '9' )+
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
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:
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

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:418:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='/') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='/') ) {
					alt13=1;
				}
				else if ( (LA13_1=='*') ) {
					alt13=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:418:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:418:14: (~ ( '\\n' | '\\r' ) )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
							break loop10;
						}
					}

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:418:28: ( '\\r' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:418:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:419:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:419:14: ( options {greedy=false; } : . )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0=='*') ) {
							int LA12_1 = input.LA(2);
							if ( (LA12_1=='/') ) {
								alt12=2;
							}
							else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
								alt12=1;
							}

						}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:419:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop12;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
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
	// $ANTLR end "COMMENT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:423:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:423:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:423:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\\') ) {
					alt14=1;
				}
				else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:423:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:423:24: ~ ( '\\\\' | '\"' )
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
					break loop14;
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:428:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:428:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:428:22: ( '+' | '-' )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='+'||LA15_0=='-') ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:
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

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:428:33: ( '0' .. '9' )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:
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
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:431:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:435:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt17=3;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='\\') ) {
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
					alt17=1;
					}
					break;
				case 'u':
					{
					alt17=2;
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
					alt17=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:435:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:436:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:437:9: OCTAL_ESC
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:442:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt18=3;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='\\') ) {
				int LA18_1 = input.LA(2);
				if ( ((LA18_1 >= '0' && LA18_1 <= '3')) ) {
					int LA18_2 = input.LA(3);
					if ( ((LA18_2 >= '0' && LA18_2 <= '7')) ) {
						int LA18_4 = input.LA(4);
						if ( ((LA18_4 >= '0' && LA18_4 <= '7')) ) {
							alt18=1;
						}

						else {
							alt18=2;
						}

					}

					else {
						alt18=3;
					}

				}
				else if ( ((LA18_1 >= '4' && LA18_1 <= '7')) ) {
					int LA18_3 = input.LA(3);
					if ( ((LA18_3 >= '0' && LA18_3 <= '7')) ) {
						alt18=2;
					}

					else {
						alt18=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:442:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:443:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:444:9: '\\\\' ( '0' .. '7' )
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:449:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:449:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
		// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | ID | INT | FLOAT | COMMENT | STRING )
		int alt19=38;
		alt19 = dfa19.predict(input);
		switch (alt19) {
			case 1 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:10: T__16
				{
				mT__16(); 

				}
				break;
			case 2 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:16: T__17
				{
				mT__17(); 

				}
				break;
			case 3 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:22: T__18
				{
				mT__18(); 

				}
				break;
			case 4 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:28: T__19
				{
				mT__19(); 

				}
				break;
			case 5 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:34: T__20
				{
				mT__20(); 

				}
				break;
			case 6 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:40: T__21
				{
				mT__21(); 

				}
				break;
			case 7 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:46: T__22
				{
				mT__22(); 

				}
				break;
			case 8 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:52: T__23
				{
				mT__23(); 

				}
				break;
			case 9 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:58: T__24
				{
				mT__24(); 

				}
				break;
			case 10 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:64: T__25
				{
				mT__25(); 

				}
				break;
			case 11 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:70: T__26
				{
				mT__26(); 

				}
				break;
			case 12 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:76: T__27
				{
				mT__27(); 

				}
				break;
			case 13 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:82: T__28
				{
				mT__28(); 

				}
				break;
			case 14 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:88: T__29
				{
				mT__29(); 

				}
				break;
			case 15 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:94: T__30
				{
				mT__30(); 

				}
				break;
			case 16 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:100: T__31
				{
				mT__31(); 

				}
				break;
			case 17 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:106: T__32
				{
				mT__32(); 

				}
				break;
			case 18 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:112: T__33
				{
				mT__33(); 

				}
				break;
			case 19 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:118: T__34
				{
				mT__34(); 

				}
				break;
			case 20 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:124: T__35
				{
				mT__35(); 

				}
				break;
			case 21 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:130: T__36
				{
				mT__36(); 

				}
				break;
			case 22 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:136: T__37
				{
				mT__37(); 

				}
				break;
			case 23 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:142: T__38
				{
				mT__38(); 

				}
				break;
			case 24 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:148: T__39
				{
				mT__39(); 

				}
				break;
			case 25 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:154: T__40
				{
				mT__40(); 

				}
				break;
			case 26 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:160: T__41
				{
				mT__41(); 

				}
				break;
			case 27 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:166: T__42
				{
				mT__42(); 

				}
				break;
			case 28 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:172: T__43
				{
				mT__43(); 

				}
				break;
			case 29 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:178: T__44
				{
				mT__44(); 

				}
				break;
			case 30 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:184: T__45
				{
				mT__45(); 

				}
				break;
			case 31 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:190: T__46
				{
				mT__46(); 

				}
				break;
			case 32 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:196: T__47
				{
				mT__47(); 

				}
				break;
			case 33 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:202: T__48
				{
				mT__48(); 

				}
				break;
			case 34 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:208: ID
				{
				mID(); 

				}
				break;
			case 35 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:211: INT
				{
				mINT(); 

				}
				break;
			case 36 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:215: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 37 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:221: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 38 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/algolF.g:1:229: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA19 dfa19 = new DFA19(this);
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
			return "411:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA19_eotS =
		"\6\uffff\1\41\1\uffff\20\33\1\67\3\uffff\1\70\5\uffff\3\33\1\74\4\33\1"+
		"\101\14\33\2\uffff\3\33\1\uffff\1\33\1\123\1\124\1\33\1\uffff\2\33\1\130"+
		"\1\131\14\33\1\146\2\uffff\1\147\2\33\2\uffff\1\33\1\153\1\154\2\33\1"+
		"\157\3\33\1\163\1\164\1\33\2\uffff\1\33\1\167\1\33\2\uffff\2\33\1\uffff"+
		"\1\173\1\174\1\175\2\uffff\2\33\1\uffff\1\33\1\u0081\1\u0082\3\uffff\1"+
		"\u0083\1\u0084\1\33\4\uffff\1\33\1\u0087\1\uffff";
	static final String DFA19_eofS =
		"\u0088\uffff";
	static final String DFA19_minS =
		"\1\42\5\uffff\1\75\1\uffff\1\122\1\105\1\117\1\114\2\117\1\106\1\101\1"+
		"\127\1\117\1\105\1\124\1\110\1\116\1\101\1\110\1\101\3\uffff\1\56\5\uffff"+
		"\1\122\1\107\1\117\1\101\1\123\1\104\1\122\1\124\1\101\1\124\1\102\1\116"+
		"\1\127\1\117\1\101\1\105\1\111\1\105\1\124\1\114\1\111\2\uffff\1\101\1"+
		"\111\1\114\1\uffff\1\105\2\101\1\117\1\uffff\2\105\2\101\1\103\1\114\1"+
		"\120\1\111\1\124\1\116\1\111\1\125\1\114\1\131\1\116\1\105\1\101\2\uffff"+
		"\1\101\1\107\1\114\2\uffff\1\105\2\101\1\116\1\103\1\101\1\114\2\105\3"+
		"\101\2\uffff\1\105\1\101\1\104\2\uffff\1\107\1\110\1\uffff\3\101\2\uffff"+
		"\1\116\1\122\1\uffff\1\125\2\101\3\uffff\2\101\1\122\4\uffff\1\105\1\101"+
		"\1\uffff";
	static final String DFA19_maxS =
		"\1\172\5\uffff\1\75\1\uffff\1\122\2\117\1\116\2\117\1\116\1\101\1\127"+
		"\1\122\1\105\1\127\1\110\1\116\1\101\1\110\1\172\3\uffff\1\145\5\uffff"+
		"\1\122\1\107\1\117\1\172\1\123\1\104\1\122\1\124\1\172\1\124\1\102\1\116"+
		"\1\127\1\117\1\101\1\122\1\111\1\105\1\124\1\114\1\111\2\uffff\1\101\1"+
		"\111\1\114\1\uffff\1\105\2\172\1\117\1\uffff\2\105\2\172\1\103\1\114\1"+
		"\120\1\111\1\124\1\116\1\111\1\125\1\114\1\131\1\116\1\105\1\172\2\uffff"+
		"\1\172\1\107\1\114\2\uffff\1\105\2\172\1\116\1\103\1\172\1\114\2\105\2"+
		"\172\1\101\2\uffff\1\105\1\172\1\104\2\uffff\1\107\1\110\1\uffff\3\172"+
		"\2\uffff\1\116\1\122\1\uffff\1\125\2\172\3\uffff\2\172\1\122\4\uffff\1"+
		"\105\1\172\1\uffff";
	static final String DFA19_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\10\21\uffff\1\40\1\41\1\42\1\uffff"+
		"\1\44\1\45\1\46\1\7\1\6\25\uffff\1\37\1\43\3\uffff\1\14\4\uffff\1\21\21"+
		"\uffff\1\16\1\17\3\uffff\1\24\1\25\14\uffff\1\15\1\20\3\uffff\1\27\1\30"+
		"\2\uffff\1\33\3\uffff\1\11\1\12\2\uffff\1\23\3\uffff\1\34\1\35\1\36\3"+
		"\uffff\1\31\1\32\1\13\1\22\2\uffff\1\26";
	static final String DFA19_specialS =
		"\u0088\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\37\5\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\35\1\36\12\34\1\6\1\7\5\uffff"+
			"\1\10\1\11\1\33\1\12\1\13\1\14\1\15\1\33\1\16\2\33\1\17\2\33\1\20\1\21"+
			"\1\33\1\22\1\23\1\24\1\25\1\26\1\27\1\33\1\30\1\33\1\31\1\uffff\1\32"+
			"\1\uffff\1\33\1\uffff\32\33",
			"",
			"",
			"",
			"",
			"",
			"\1\40",
			"",
			"\1\42",
			"\1\43\11\uffff\1\44",
			"\1\45",
			"\1\46\1\uffff\1\47",
			"\1\50",
			"\1\51",
			"\1\52\7\uffff\1\53",
			"\1\54",
			"\1\55",
			"\1\56\2\uffff\1\57",
			"\1\60",
			"\1\61\2\uffff\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"",
			"",
			"\1\35\1\uffff\12\34\13\uffff\1\35\37\uffff\1\35",
			"",
			"",
			"",
			"",
			"",
			"\1\71",
			"\1\72",
			"\1\73",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110\14\uffff\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"",
			"",
			"\1\117",
			"\1\120",
			"\1\121",
			"",
			"\1\122",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\125",
			"",
			"\1\126",
			"\1\127",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\150",
			"\1\151",
			"",
			"",
			"\1\152",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\155",
			"\1\156",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\160",
			"\1\161",
			"\1\162",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\165",
			"",
			"",
			"\1\166",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\170",
			"",
			"",
			"\1\171",
			"\1\172",
			"",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"",
			"\1\176",
			"\1\177",
			"",
			"\1\u0080",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"",
			"",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\u0085",
			"",
			"",
			"",
			"",
			"\1\u0086",
			"\32\33\4\uffff\1\33\1\uffff\32\33",
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

	protected class DFA19 extends DFA {

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
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | ID | INT | FLOAT | COMMENT | STRING );";
		}
	}

}
