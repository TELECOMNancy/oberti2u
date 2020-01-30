// $ANTLR 3.5.1 /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g 2019-11-05 18:01:35

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Algol60Lexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public Algol60Lexer() {} 
	public Algol60Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public Algol60Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g"; }

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:7:7: ( '(' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:7:9: '('
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:8:7: ( ')' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:8:9: ')'
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:9:7: ( '+' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:9:9: '+'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:10:7: ( ',' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:10:9: ','
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:11:7: ( '-' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:11:9: '-'
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:12:7: ( ':' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:12:9: ':'
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
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:13:7: ( ':=' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:13:9: ':='
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:14:7: ( ';' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:14:9: ';'
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:15:7: ( 'ARRAY' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:15:9: 'ARRAY'
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:16:7: ( 'BEGIN' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:16:9: 'BEGIN'
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:17:7: ( 'BOOLEAN' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:17:9: 'BOOLEAN'
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:18:7: ( 'DO' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:18:9: 'DO'
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:19:7: ( 'ELSE' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:19:9: 'ELSE'
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
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:20:7: ( 'END' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:20:9: 'END'
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
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:21:7: ( 'FOR' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:21:9: 'FOR'
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
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:22:7: ( 'GOTO' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:22:9: 'GOTO'
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
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:23:7: ( 'IF' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:23:9: 'IF'
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
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:24:7: ( 'INTEGER' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:24:9: 'INTEGER'
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
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:25:7: ( 'LABEL' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:25:9: 'LABEL'
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
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:26:7: ( 'OWN' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:26:9: 'OWN'
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
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:27:7: ( 'POW' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:27:9: 'POW'
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
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:28:7: ( 'PROCEDURE' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:28:9: 'PROCEDURE'
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
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:29:7: ( 'REAL' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:29:9: 'REAL'
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
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:30:7: ( 'STEP' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:30:9: 'STEP'
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
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:31:7: ( 'STRING' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:31:9: 'STRING'
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
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:32:7: ( 'SWITCH' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:32:9: 'SWITCH'
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
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:33:7: ( 'THEN' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:33:9: 'THEN'
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
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:34:7: ( 'UNTIL' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:34:9: 'UNTIL'
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
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:35:7: ( 'VALUE' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:35:9: 'VALUE'
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
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:36:7: ( 'WHILE' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:36:9: 'WHILE'
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
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:37:7: ( 'Y' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:37:9: 'Y'
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
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:38:7: ( '[' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:38:9: '['
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
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:39:7: ( ']' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:39:9: ']'
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
	// $ANTLR end "T__67"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:479:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | 'a' .. 'b' | '_' )* )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:479:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | 'a' .. 'b' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:479:31: ( 'a' .. 'z' | 'A' .. 'Z' | 'a' .. 'b' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:482:5: ( ( '0' .. '9' )+ )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:482:7: ( '0' .. '9' )+
			{
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:482:7: ( '0' .. '9' )+
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:486:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:486:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:486:9: ( '0' .. '9' )+
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
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:486:25: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:
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

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:486:37: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:486:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:487:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:487:13: ( '0' .. '9' )+
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
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:
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

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:487:25: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:487:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:488:9: ( '0' .. '9' )+ EXPONENT
					{
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:488:9: ( '0' .. '9' )+
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
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:492:5: ( 'COMMENT' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='C') ) {
				alt13=1;
			}
			else if ( (LA13_0=='/') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:492:9: 'COMMENT' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("COMMENT"); 

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:492:19: (~ ( '\\n' | '\\r' ) )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:
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

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:492:33: ( '\\r' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:492:33: '\\r'
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:493:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:493:14: ( options {greedy=false; } : . )*
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
							// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:493:42: .
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:497:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:497:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:497:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:497:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:497:24: ~ ( '\\\\' | '\"' )
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:502:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:502:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:502:22: ( '+' | '-' )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='+'||LA15_0=='-') ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:
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

			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:502:33: ( '0' .. '9' )+
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:505:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:509:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:509:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:510:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:511:9: OCTAL_ESC
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:516:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:516:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:517:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:518:9: '\\\\' ( '0' .. '7' )
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
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:523:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:523:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
		// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | ID | INT | FLOAT | COMMENT | STRING )
		int alt19=38;
		alt19 = dfa19.predict(input);
		switch (alt19) {
			case 1 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:10: T__35
				{
				mT__35(); 

				}
				break;
			case 2 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:16: T__36
				{
				mT__36(); 

				}
				break;
			case 3 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:22: T__37
				{
				mT__37(); 

				}
				break;
			case 4 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:28: T__38
				{
				mT__38(); 

				}
				break;
			case 5 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:34: T__39
				{
				mT__39(); 

				}
				break;
			case 6 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:40: T__40
				{
				mT__40(); 

				}
				break;
			case 7 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:46: T__41
				{
				mT__41(); 

				}
				break;
			case 8 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:52: T__42
				{
				mT__42(); 

				}
				break;
			case 9 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:58: T__43
				{
				mT__43(); 

				}
				break;
			case 10 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:64: T__44
				{
				mT__44(); 

				}
				break;
			case 11 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:70: T__45
				{
				mT__45(); 

				}
				break;
			case 12 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:76: T__46
				{
				mT__46(); 

				}
				break;
			case 13 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:82: T__47
				{
				mT__47(); 

				}
				break;
			case 14 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:88: T__48
				{
				mT__48(); 

				}
				break;
			case 15 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:94: T__49
				{
				mT__49(); 

				}
				break;
			case 16 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:100: T__50
				{
				mT__50(); 

				}
				break;
			case 17 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:106: T__51
				{
				mT__51(); 

				}
				break;
			case 18 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:112: T__52
				{
				mT__52(); 

				}
				break;
			case 19 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:118: T__53
				{
				mT__53(); 

				}
				break;
			case 20 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:124: T__54
				{
				mT__54(); 

				}
				break;
			case 21 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:130: T__55
				{
				mT__55(); 

				}
				break;
			case 22 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:136: T__56
				{
				mT__56(); 

				}
				break;
			case 23 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:142: T__57
				{
				mT__57(); 

				}
				break;
			case 24 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:148: T__58
				{
				mT__58(); 

				}
				break;
			case 25 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:154: T__59
				{
				mT__59(); 

				}
				break;
			case 26 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:160: T__60
				{
				mT__60(); 

				}
				break;
			case 27 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:166: T__61
				{
				mT__61(); 

				}
				break;
			case 28 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:172: T__62
				{
				mT__62(); 

				}
				break;
			case 29 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:178: T__63
				{
				mT__63(); 

				}
				break;
			case 30 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:184: T__64
				{
				mT__64(); 

				}
				break;
			case 31 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:190: T__65
				{
				mT__65(); 

				}
				break;
			case 32 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:196: T__66
				{
				mT__66(); 

				}
				break;
			case 33 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:202: T__67
				{
				mT__67(); 

				}
				break;
			case 34 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:208: ID
				{
				mID(); 

				}
				break;
			case 35 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:211: INT
				{
				mINT(); 

				}
				break;
			case 36 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:215: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 37 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:221: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 38 :
				// /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Algol60.g:1:229: STRING
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
			return "485:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA19_eotS =
		"\6\uffff\1\42\1\uffff\20\36\1\70\2\uffff\1\36\1\72\6\uffff\3\36\1\76\4"+
		"\36\1\103\14\36\1\uffff\1\36\1\uffff\3\36\1\uffff\1\36\1\126\1\127\1\36"+
		"\1\uffff\2\36\1\133\1\134\15\36\1\152\2\uffff\1\153\2\36\2\uffff\1\36"+
		"\1\157\1\160\2\36\1\163\4\36\1\170\1\171\1\36\2\uffff\1\36\1\174\1\36"+
		"\2\uffff\2\36\1\uffff\1\u0080\1\u0081\1\u0082\1\36\2\uffff\2\36\1\uffff"+
		"\1\36\1\u0087\1\u0088\3\uffff\1\36\1\u008a\1\u008b\1\36\2\uffff\1\36\2"+
		"\uffff\2\36\1\u008f\1\uffff";
	static final String DFA19_eofS =
		"\u0090\uffff";
	static final String DFA19_minS =
		"\1\42\5\uffff\1\75\1\uffff\1\122\1\105\1\117\1\114\2\117\1\106\1\101\1"+
		"\127\1\117\1\105\1\124\1\110\1\116\1\101\1\110\1\101\2\uffff\1\117\1\56"+
		"\6\uffff\1\122\1\107\1\117\1\101\1\123\1\104\1\122\1\124\1\101\1\124\1"+
		"\102\1\116\1\127\1\117\1\101\1\105\1\111\1\105\1\124\1\114\1\111\1\uffff"+
		"\1\115\1\uffff\1\101\1\111\1\114\1\uffff\1\105\2\101\1\117\1\uffff\2\105"+
		"\2\101\1\103\1\114\1\120\1\111\1\124\1\116\1\111\1\125\1\114\1\115\1\131"+
		"\1\116\1\105\1\101\2\uffff\1\101\1\107\1\114\2\uffff\1\105\2\101\1\116"+
		"\1\103\1\101\1\114\3\105\3\101\2\uffff\1\105\1\101\1\104\2\uffff\1\107"+
		"\1\110\1\uffff\3\101\1\116\2\uffff\1\116\1\122\1\uffff\1\125\2\101\3\uffff"+
		"\1\124\2\101\1\122\2\uffff\1\0\2\uffff\1\105\1\0\1\101\1\uffff";
	static final String DFA19_maxS =
		"\1\172\5\uffff\1\75\1\uffff\1\122\2\117\1\116\2\117\1\116\1\101\1\127"+
		"\1\122\1\105\1\127\1\110\1\116\1\101\1\110\1\172\2\uffff\1\117\1\145\6"+
		"\uffff\1\122\1\107\1\117\1\172\1\123\1\104\1\122\1\124\1\172\1\124\1\102"+
		"\1\116\1\127\1\117\1\101\1\122\1\111\1\105\1\124\1\114\1\111\1\uffff\1"+
		"\115\1\uffff\1\101\1\111\1\114\1\uffff\1\105\2\172\1\117\1\uffff\2\105"+
		"\2\172\1\103\1\114\1\120\1\111\1\124\1\116\1\111\1\125\1\114\1\115\1\131"+
		"\1\116\1\105\1\172\2\uffff\1\172\1\107\1\114\2\uffff\1\105\2\172\1\116"+
		"\1\103\1\172\1\114\3\105\2\172\1\101\2\uffff\1\105\1\172\1\104\2\uffff"+
		"\1\107\1\110\1\uffff\3\172\1\116\2\uffff\1\116\1\122\1\uffff\1\125\2\172"+
		"\3\uffff\1\124\2\172\1\122\2\uffff\1\uffff\2\uffff\1\105\1\uffff\1\172"+
		"\1\uffff";
	static final String DFA19_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\10\21\uffff\1\40\1\41\2\uffff\1"+
		"\44\1\42\1\45\1\46\1\7\1\6\25\uffff\1\37\1\uffff\1\43\3\uffff\1\14\4\uffff"+
		"\1\21\22\uffff\1\16\1\17\3\uffff\1\24\1\25\15\uffff\1\15\1\20\3\uffff"+
		"\1\27\1\30\2\uffff\1\33\4\uffff\1\11\1\12\2\uffff\1\23\3\uffff\1\34\1"+
		"\35\1\36\4\uffff\1\31\1\32\1\uffff\1\13\1\22\3\uffff\1\26";
	static final String DFA19_specialS =
		"\u0089\uffff\1\0\3\uffff\1\1\2\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\40\5\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\35\1\37\12\34\1\6\1\7\5\uffff"+
			"\1\10\1\11\1\33\1\12\1\13\1\14\1\15\1\36\1\16\2\36\1\17\2\36\1\20\1\21"+
			"\1\36\1\22\1\23\1\24\1\25\1\26\1\27\1\36\1\30\1\36\1\31\1\uffff\1\32"+
			"\1\uffff\1\36\1\uffff\32\36",
			"",
			"",
			"",
			"",
			"",
			"\1\41",
			"",
			"\1\43",
			"\1\44\11\uffff\1\45",
			"\1\46",
			"\1\47\1\uffff\1\50",
			"\1\51",
			"\1\52",
			"\1\53\7\uffff\1\54",
			"\1\55",
			"\1\56",
			"\1\57\2\uffff\1\60",
			"\1\61",
			"\1\62\2\uffff\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"",
			"\1\71",
			"\1\35\1\uffff\12\34\13\uffff\1\35\37\uffff\1\35",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\73",
			"\1\74",
			"\1\75",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112\14\uffff\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"",
			"\1\121",
			"",
			"\1\122",
			"\1\123",
			"\1\124",
			"",
			"\1\125",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\130",
			"",
			"\1\131",
			"\1\132",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\154",
			"\1\155",
			"",
			"",
			"\1\156",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\161",
			"\1\162",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\172",
			"",
			"",
			"\1\173",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\175",
			"",
			"",
			"\1\176",
			"\1\177",
			"",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\u0083",
			"",
			"",
			"\1\u0084",
			"\1\u0085",
			"",
			"\1\u0086",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"",
			"",
			"\1\u0089",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\u008c",
			"",
			"",
			"\101\37\32\u008d\4\37\1\u008d\1\37\32\u008d\uff85\37",
			"",
			"",
			"\1\u008e",
			"\101\37\32\u008d\4\37\1\u008d\1\37\32\u008d\uff85\37",
			"\32\36\4\uffff\1\36\1\uffff\32\36",
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
			return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | ID | INT | FLOAT | COMMENT | STRING );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA19_137 = input.LA(1);
						s = -1;
						if ( ((LA19_137 >= 'A' && LA19_137 <= 'Z')||LA19_137=='_'||(LA19_137 >= 'a' && LA19_137 <= 'z')) ) {s = 141;}
						else if ( ((LA19_137 >= '\u0000' && LA19_137 <= '@')||(LA19_137 >= '[' && LA19_137 <= '^')||LA19_137=='`'||(LA19_137 >= '{' && LA19_137 <= '\uFFFF')) ) {s = 31;}
						else s = 30;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA19_141 = input.LA(1);
						s = -1;
						if ( ((LA19_141 >= '\u0000' && LA19_141 <= '@')||(LA19_141 >= '[' && LA19_141 <= '^')||LA19_141=='`'||(LA19_141 >= '{' && LA19_141 <= '\uFFFF')) ) {s = 31;}
						else if ( ((LA19_141 >= 'A' && LA19_141 <= 'Z')||LA19_141=='_'||(LA19_141 >= 'a' && LA19_141 <= 'z')) ) {s = 141;}
						else s = 30;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 19, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
