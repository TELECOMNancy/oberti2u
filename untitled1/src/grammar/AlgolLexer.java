// $ANTLR 3.5.1 C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g 2019-12-01 17:49:04
package grammar;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AlgolLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AlgolLexer() {}
    public AlgolLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AlgolLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    @Override public String getGrammarFileName() { return "C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g"; }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:7:5: ( 'AND' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:7:7: 'AND'
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

    // $ANTLR start "ASSIGENMENT"
    public final void mASSIGENMENT() throws RecognitionException {
        try {
            int _type = ASSIGENMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:8:13: ( ':=' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:8:15: ':='
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
    // $ANTLR end "ASSIGENMENT"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:9:7: ( 'BEGIN' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:9:9: 'BEGIN'
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:10:7: ( ':' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:10:9: ':'
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

    // $ANTLR start "BORNESUPP"
    public final void mBORNESUPP() throws RecognitionException {
        try {
            int _type = BORNESUPP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:11:11: ( 'UNTIL' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:11:13: 'UNTIL'
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
    // $ANTLR end "BORNESUPP"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:12:5: ( '/' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:12:7: '/'
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

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:13:6: ( 'ELSE' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:13:8: 'ELSE'
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

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:14:7: ( 'EQUAL' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:14:9: 'EQUAL'
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

    // $ANTLR start "EQV"
    public final void mEQV() throws RecognitionException {
        try {
            int _type = EQV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:15:5: ( 'EQUIV' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:15:7: 'EQUIV'
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
    // $ANTLR end "EQV"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:16:7: ( 'FALSE' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:16:9: 'FALSE'
            {
                match("FALSE");

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:17:5: ( 'FOR' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:17:7: 'FOR'
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:18:6: ( 'GOTO' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:18:8: 'GOTO'
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:19:9: ( 'GREATER' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:19:11: 'GREATER'
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:20:4: ( 'IF' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:20:6: 'IF'
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:21:6: ( 'IMPL' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:21:8: 'IMPL'
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

    // $ANTLR start "LABEL"
    public final void mLABEL() throws RecognitionException {
        try {
            int _type = LABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:22:7: ( 'LABEL' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:22:9: 'LABEL'
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
    // $ANTLR end "LABEL"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:23:6: ( 'LESS' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:23:8: 'LESS'
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

    // $ANTLR start "LOCAL"
    public final void mLOCAL() throws RecognitionException {
        try {
            int _type = LOCAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:24:7: ( 'OWN' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:24:9: 'OWN'
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
    // $ANTLR end "LOCAL"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:25:6: ( '*' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:25:8: '*'
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:26:5: ( 'NOT' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:26:7: 'NOT'
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

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:27:10: ( 'NOTEQUAL' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:27:12: 'NOTEQUAL'
            {
                match("NOTEQUAL");

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "NOTGREATER"
    public final void mNOTGREATER() throws RecognitionException {
        try {
            int _type = NOTGREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:28:12: ( 'NOTGREATER' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:28:14: 'NOTGREATER'
            {
                match("NOTGREATER");

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "NOTGREATER"

    // $ANTLR start "NOTLESS"
    public final void mNOTLESS() throws RecognitionException {
        try {
            int _type = NOTLESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:29:9: ( 'NOTLESS' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:29:11: 'NOTLESS'
            {
                match("NOTLESS");

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "NOTLESS"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:30:4: ( 'OR' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:30:6: 'OR'
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

    // $ANTLR start "PARENTHESEF"
    public final void mPARENTHESEF() throws RecognitionException {
        try {
            int _type = PARENTHESEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:31:13: ( ')' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:31:15: ')'
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
    // $ANTLR end "PARENTHESEF"

    // $ANTLR start "PARENTHESEO"
    public final void mPARENTHESEO() throws RecognitionException {
        try {
            int _type = PARENTHESEO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:32:13: ( '(' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:32:15: '('
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
    // $ANTLR end "PARENTHESEO"

    // $ANTLR start "PAS"
    public final void mPAS() throws RecognitionException {
        try {
            int _type = PAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:33:5: ( 'STEP' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:33:7: 'STEP'
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:34:6: ( '+' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:34:8: '+'
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:35:7: ( 'POWER' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:35:9: 'POWER'
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:36:11: ( 'PROCEDURE' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:36:13: 'PROCEDURE'
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:37:6: ( 'PROG' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:37:8: 'PROG'
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:38:8: ( 'SWITCH' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:38:10: 'SWITCH'
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:39:6: ( 'THEN' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:39:8: 'THEN'
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

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:40:6: ( 'TRUE' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:40:8: 'TRUE'
            {
                match("TRUE");

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "TYPEBOOL"
    public final void mTYPEBOOL() throws RecognitionException {
        try {
            int _type = TYPEBOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:41:10: ( 'BOOLEAN' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:41:12: 'BOOLEAN'
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:42:9: ( 'INTEGER' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:42:11: 'INTEGER'
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:43:10: ( 'REAL' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:43:12: 'REAL'
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

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:44:7: ( 'WHILE' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:44:9: 'WHILE'
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

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:45:7: ( ',' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:45:9: ','
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:46:7: ( '-' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:46:9: '-'
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:47:7: ( ';' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:47:9: ';'
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:48:7: ( 'ARRAY' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:48:9: 'ARRAY'
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:49:7: ( 'DO' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:49:9: 'DO'
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:50:7: ( 'END' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:50:9: 'END'
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:51:7: ( 'POW' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:51:9: 'POW'
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:52:7: ( 'STRING' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:52:9: 'STRING'
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:53:7: ( 'VALUE' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:53:9: 'VALUE'
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:54:7: ( '[' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:54:9: '['
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:55:7: ( ']' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:55:9: ']'
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

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:56:7: ( 'a' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:56:9: 'a'
            {
                match('a');
            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:521:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:521:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
                if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    recover(mse);
                    throw mse;
                }
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:521:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
                loop1:
                while (true) {
                    int alt1=2;
                    int LA1_0 = input.LA(1);
                    if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                        alt1=1;
                    }

                    switch (alt1) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:524:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:524:7: ( '0' .. '9' )+
            {
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:524:7: ( '0' .. '9' )+
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
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:528:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:528:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:528:9: ( '0' .. '9' )+
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
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:
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
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:528:25: ( '0' .. '9' )*
                    loop4:
                    while (true) {
                        int alt4=2;
                        int LA4_0 = input.LA(1);
                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }

                        switch (alt4) {
                            case 1 :
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:
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

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:528:37: ( EXPONENT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);
                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:528:37: EXPONENT
                        {
                            mEXPONENT();

                        }
                        break;

                    }

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:529:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                {
                    match('.');
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:529:13: ( '0' .. '9' )+
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
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:
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

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:529:25: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);
                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:529:25: EXPONENT
                        {
                            mEXPONENT();

                        }
                        break;

                    }

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:530:9: ( '0' .. '9' )+ EXPONENT
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:530:9: ( '0' .. '9' )+
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
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:539:5: ( . 'COMMENT' ( options {greedy=false; } : . )* ';' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:539:8: . 'COMMENT' ( options {greedy=false; } : . )* ';'
            {
                matchAny();
                match("COMMENT");

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:540:23: ( options {greedy=false; } : . )*
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
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:540:51: .
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:543:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:543:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:551:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:551:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
                match('\"');
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:551:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:551:14: ESC_SEQ
                        {
                            mESC_SEQ();

                        }
                        break;
                        case 2 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:551:24: ~ ( '\\\\' | '\"' )
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:556:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:556:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
                if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    recover(mse);
                    throw mse;
                }
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:556:22: ( '+' | '-' )?
                int alt12=2;
                int LA12_0 = input.LA(1);
                if ( (LA12_0=='+'||LA12_0=='-') ) {
                    alt12=1;
                }
                switch (alt12) {
                    case 1 :
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:
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

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:556:33: ( '0' .. '9' )+
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
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:559:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:563:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:563:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:564:9: UNICODE_ESC
                {
                    mUNICODE_ESC();

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:565:9: OCTAL_ESC
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:570:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:570:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:571:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:572:9: '\\\\' ( '0' .. '7' )
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
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:577:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:577:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:8: ( AND | ASSIGENMENT | BEGIN | BORNE | BORNESUPP | DIV | ELSE | EQUAL | EQV | FALSE | FOR | GOTO | GREATER | IF | IMPL | LABEL | LESS | LOCAL | MULT | NOT | NOTEQUAL | NOTGREATER | NOTLESS | OR | PARENTHESEF | PARENTHESEO | PAS | PLUS | POWER | PROCEDURE | PROG | SWITCH | THEN | TRUE | TYPEBOOL | TYPEINT | TYPEREAL | WHILE | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | ID | INT | FLOAT | COMMENT2 | WS | STRING )
        int alt16=56;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:10: AND
            {
                mAND();

            }
            break;
            case 2 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:14: ASSIGENMENT
            {
                mASSIGENMENT();

            }
            break;
            case 3 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:26: BEGIN
            {
                mBEGIN();

            }
            break;
            case 4 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:32: BORNE
            {
                mBORNE();

            }
            break;
            case 5 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:38: BORNESUPP
            {
                mBORNESUPP();

            }
            break;
            case 6 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:48: DIV
            {
                mDIV();

            }
            break;
            case 7 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:52: ELSE
            {
                mELSE();

            }
            break;
            case 8 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:57: EQUAL
            {
                mEQUAL();

            }
            break;
            case 9 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:63: EQV
            {
                mEQV();

            }
            break;
            case 10 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:67: FALSE
            {
                mFALSE();

            }
            break;
            case 11 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:73: FOR
            {
                mFOR();

            }
            break;
            case 12 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:77: GOTO
            {
                mGOTO();

            }
            break;
            case 13 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:82: GREATER
            {
                mGREATER();

            }
            break;
            case 14 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:90: IF
            {
                mIF();

            }
            break;
            case 15 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:93: IMPL
            {
                mIMPL();

            }
            break;
            case 16 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:98: LABEL
            {
                mLABEL();

            }
            break;
            case 17 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:104: LESS
            {
                mLESS();

            }
            break;
            case 18 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:109: LOCAL
            {
                mLOCAL();

            }
            break;
            case 19 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:115: MULT
            {
                mMULT();

            }
            break;
            case 20 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:120: NOT
            {
                mNOT();

            }
            break;
            case 21 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:124: NOTEQUAL
            {
                mNOTEQUAL();

            }
            break;
            case 22 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:133: NOTGREATER
            {
                mNOTGREATER();

            }
            break;
            case 23 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:144: NOTLESS
            {
                mNOTLESS();

            }
            break;
            case 24 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:152: OR
            {
                mOR();

            }
            break;
            case 25 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:155: PARENTHESEF
            {
                mPARENTHESEF();

            }
            break;
            case 26 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:167: PARENTHESEO
            {
                mPARENTHESEO();

            }
            break;
            case 27 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:179: PAS
            {
                mPAS();

            }
            break;
            case 28 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:183: PLUS
            {
                mPLUS();

            }
            break;
            case 29 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:188: POWER
            {
                mPOWER();

            }
            break;
            case 30 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:194: PROCEDURE
            {
                mPROCEDURE();

            }
            break;
            case 31 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:204: PROG
            {
                mPROG();

            }
            break;
            case 32 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:209: SWITCH
            {
                mSWITCH();

            }
            break;
            case 33 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:216: THEN
            {
                mTHEN();

            }
            break;
            case 34 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:221: TRUE
            {
                mTRUE();

            }
            break;
            case 35 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:226: TYPEBOOL
            {
                mTYPEBOOL();

            }
            break;
            case 36 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:235: TYPEINT
            {
                mTYPEINT();

            }
            break;
            case 37 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:243: TYPEREAL
            {
                mTYPEREAL();

            }
            break;
            case 38 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:252: WHILE
            {
                mWHILE();

            }
            break;
            case 39 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:258: T__63
            {
                mT__63();

            }
            break;
            case 40 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:264: T__64
            {
                mT__64();

            }
            break;
            case 41 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:270: T__65
            {
                mT__65();

            }
            break;
            case 42 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:276: T__66
            {
                mT__66();

            }
            break;
            case 43 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:282: T__67
            {
                mT__67();

            }
            break;
            case 44 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:288: T__68
            {
                mT__68();

            }
            break;
            case 45 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:294: T__69
            {
                mT__69();

            }
            break;
            case 46 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:300: T__70
            {
                mT__70();

            }
            break;
            case 47 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:306: T__71
            {
                mT__71();

            }
            break;
            case 48 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:312: T__72
            {
                mT__72();

            }
            break;
            case 49 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:318: T__73
            {
                mT__73();

            }
            break;
            case 50 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:324: T__74
            {
                mT__74();

            }
            break;
            case 51 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:330: ID
            {
                mID();

            }
            break;
            case 52 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:333: INT
            {
                mINT();

            }
            break;
            case 53 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:337: FLOAT
            {
                mFLOAT();

            }
            break;
            case 54 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:343: COMMENT2
            {
                mCOMMENT2();

            }
            break;
            case 55 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:352: WS
            {
                mWS();

            }
            break;
            case 56 :
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:1:355: STRING
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
            return "527:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }

    static final String DFA16_eotS =
            "\1\uffff\1\47\1\51\2\47\1\55\6\47\1\74\1\47\1\76\1\77\1\47\1\102\4\47"+
                    "\1\111\1\112\1\113\2\47\1\116\1\117\1\120\1\47\1\121\1\uffff\1\124\2\uffff"+
                    "\3\47\3\uffff\3\47\1\uffff\7\47\1\144\5\47\1\152\1\uffff\1\47\2\uffff"+
                    "\2\47\1\uffff\6\47\3\uffff\1\165\1\47\4\uffff\1\121\4\uffff\1\170\7\47"+
                    "\1\u0081\1\47\1\u0083\2\47\1\uffff\4\47\1\u008a\1\uffff\1\u008e\3\47\1"+
                    "\u0093\5\47\1\uffff\1\47\2\uffff\5\47\1\u00a1\2\47\1\uffff\1\47\1\uffff"+
                    "\1\u00a5\1\47\1\u00a7\2\47\1\u00aa\1\uffff\3\47\1\uffff\1\u00ae\3\47\1"+
                    "\uffff\1\47\1\u00b3\1\u00b4\1\u00b5\1\u00b6\2\47\1\uffff\1\u00ba\1\47"+
                    "\1\u00bc\1\47\1\u00be\1\uffff\1\u00bf\1\u00c0\1\u00c1\1\uffff\1\47\1\uffff"+
                    "\1\47\1\u00c4\1\uffff\3\47\1\uffff\2\47\1\u00ca\1\47\4\uffff\1\u00cc\1"+
                    "\u00cd\2\uffff\1\47\1\uffff\1\47\4\uffff\2\47\1\uffff\3\47\1\u00d6\1\u00d7"+
                    "\1\uffff\1\47\3\uffff\1\47\1\u00db\1\u00dc\1\u00dd\2\47\1\u00e0\2\uffff"+
                    "\1\47\1\uffff\1\47\3\uffff\1\u00e4\1\47\1\uffff\1\47\1\uffff\1\47\1\uffff"+
                    "\1\47\1\u00ec\1\43\1\126\2\uffff\1\u00f1\15\uffff";
    static final String DFA16_eofS =
            "\u00f9\uffff";
    static final String DFA16_minS =
            "\1\0\1\103\1\75\4\103\1\101\2\103\1\101\17\103\1\101\2\103\1\60\1\103"+
                    "\1\56\1\60\1\103\1\0\1\uffff\1\104\1\122\1\117\3\uffff\1\107\1\117\1\124"+
                    "\1\uffff\1\123\1\125\1\104\1\114\1\122\1\124\1\105\1\60\1\120\1\124\1"+
                    "\102\1\123\1\116\1\60\1\uffff\1\124\2\uffff\1\105\1\111\1\uffff\1\127"+
                    "\1\117\1\105\1\125\1\101\1\111\3\uffff\1\60\1\114\4\uffff\1\56\2\uffff"+
                    "\1\0\1\uffff\1\60\1\101\1\115\1\111\1\114\1\111\1\105\1\101\1\60\1\123"+
                    "\1\60\1\117\1\101\1\uffff\1\114\2\105\1\123\1\60\1\uffff\1\60\1\120\1"+
                    "\111\1\124\1\60\1\103\1\116\1\105\2\114\1\uffff\1\125\1\0\1\uffff\1\131"+
                    "\1\115\1\116\1\105\1\114\1\60\1\114\1\126\1\uffff\1\105\1\uffff\1\60\1"+
                    "\124\1\60\1\107\1\114\1\60\1\uffff\1\121\1\122\1\105\1\uffff\1\60\1\116"+
                    "\1\103\1\122\1\uffff\1\105\4\60\2\105\1\0\1\60\1\105\1\60\1\101\1\60\1"+
                    "\uffff\3\60\1\uffff\1\105\1\uffff\1\105\1\60\1\uffff\1\125\1\105\1\123"+
                    "\1\uffff\1\107\1\110\1\60\1\104\4\uffff\2\60\1\0\1\uffff\1\116\1\uffff"+
                    "\1\116\4\uffff\2\122\1\uffff\2\101\1\123\2\60\1\uffff\1\125\2\uffff\1"+
                    "\0\1\124\3\60\1\114\1\124\1\60\2\uffff\1\122\2\0\3\uffff\1\60\1\105\1"+
                    "\uffff\1\105\2\0\1\uffff\1\122\1\60\4\0\1\60\1\uffff\4\0\1\uffff\7\0";
    static final String DFA16_maxS =
            "\1\uffff\1\122\1\103\1\117\1\116\1\103\1\121\1\117\1\122\1\116\1\105\1"+
                    "\127\1\103\1\117\2\103\1\127\1\103\2\122\1\105\1\110\3\103\1\117\3\103"+
                    "\1\172\1\103\1\145\2\103\1\uffff\1\uffff\1\104\1\122\1\117\3\uffff\1\107"+
                    "\1\117\1\124\1\uffff\1\123\1\125\1\104\1\114\1\122\1\124\1\105\1\172\1"+
                    "\120\1\124\1\102\1\123\1\116\1\172\1\uffff\1\124\2\uffff\1\122\1\111\1"+
                    "\uffff\1\127\1\117\1\105\1\125\1\101\1\111\3\uffff\1\172\1\114\4\uffff"+
                    "\1\145\2\uffff\1\uffff\1\uffff\1\172\1\101\1\115\1\111\1\114\1\111\1\105"+
                    "\1\111\1\172\1\123\1\172\1\117\1\101\1\uffff\1\114\2\105\1\123\1\172\1"+
                    "\uffff\1\172\1\120\1\111\1\124\1\172\1\107\1\116\1\105\2\114\1\uffff\1"+
                    "\125\1\uffff\1\uffff\1\131\1\115\1\116\1\105\1\114\1\172\1\114\1\126\1"+
                    "\uffff\1\105\1\uffff\1\172\1\124\1\172\1\107\1\114\1\172\1\uffff\1\121"+
                    "\1\122\1\105\1\uffff\1\172\1\116\1\103\1\122\1\uffff\1\105\4\172\2\105"+
                    "\1\uffff\1\172\1\105\1\172\1\101\1\172\1\uffff\3\172\1\uffff\1\105\1\uffff"+
                    "\1\105\1\172\1\uffff\1\125\1\105\1\123\1\uffff\1\107\1\110\1\172\1\104"+
                    "\4\uffff\2\172\1\uffff\1\uffff\1\116\1\uffff\1\116\4\uffff\2\122\1\uffff"+
                    "\2\101\1\123\2\172\1\uffff\1\125\2\uffff\1\uffff\1\124\3\172\1\114\1\124"+
                    "\1\172\2\uffff\1\122\2\uffff\3\uffff\1\172\1\105\1\uffff\1\105\2\uffff"+
                    "\1\uffff\1\122\1\172\4\uffff\1\172\1\uffff\4\uffff\1\uffff\7\uffff";
    static final String DFA16_acceptS =
            "\43\uffff\1\66\3\uffff\1\63\1\2\1\4\3\uffff\1\6\16\uffff\1\23\1\uffff"+
                    "\1\31\1\32\2\uffff\1\34\6\uffff\1\47\1\50\1\51\2\uffff\1\60\1\61\1\62"+
                    "\1\64\1\uffff\1\65\1\67\1\uffff\1\70\15\uffff\1\16\5\uffff\1\30\12\uffff"+
                    "\1\53\2\uffff\1\1\10\uffff\1\54\1\uffff\1\13\6\uffff\1\22\3\uffff\1\24"+
                    "\4\uffff\1\55\15\uffff\1\7\3\uffff\1\14\1\uffff\1\17\2\uffff\1\21\3\uffff"+
                    "\1\33\4\uffff\1\37\1\41\1\42\1\45\3\uffff\1\52\1\uffff\1\3\1\uffff\1\5"+
                    "\1\10\1\11\1\12\2\uffff\1\20\5\uffff\1\35\1\uffff\1\46\1\57\10\uffff\1"+
                    "\56\1\40\3\uffff\1\43\1\15\1\44\2\uffff\1\27\3\uffff\1\25\7\uffff\1\36"+
                    "\4\uffff\1\26\7\uffff";
    static final String DFA16_specialS =
            "\1\25\41\uffff\1\17\62\uffff\1\10\41\uffff\1\11\43\uffff\1\12\35\uffff"+
                    "\1\13\24\uffff\1\14\12\uffff\1\15\1\20\7\uffff\1\26\1\16\3\uffff\1\5\1"+
                    "\27\1\2\1\21\2\uffff\1\3\1\0\1\7\1\1\1\uffff\1\22\1\4\1\31\1\23\1\30\1"+
                    "\24\1\6}>";
    static final String[] DFA16_transitionS = {
            "\11\43\2\41\2\43\1\41\22\43\1\41\1\43\1\42\5\43\1\17\1\16\1\14\1\21\1"+
                    "\26\1\27\1\40\1\5\12\37\1\2\1\30\5\43\1\1\1\3\1\36\1\31\1\6\1\7\1\10"+
                    "\1\36\1\11\2\36\1\12\1\36\1\15\1\13\1\22\1\36\1\24\1\20\1\23\1\4\1\32"+
                    "\1\25\3\36\1\33\1\43\1\34\1\43\1\36\1\43\1\35\31\36\uff85\43",
            "\1\46\12\uffff\1\44\3\uffff\1\45",
            "\1\50\5\uffff\1\43",
            "\1\46\1\uffff\1\52\11\uffff\1\53",
            "\1\46\12\uffff\1\54",
            "\1\43",
            "\1\46\10\uffff\1\56\1\uffff\1\60\2\uffff\1\57",
            "\1\61\1\uffff\1\46\13\uffff\1\62",
            "\1\46\13\uffff\1\63\2\uffff\1\64",
            "\1\46\2\uffff\1\65\6\uffff\1\66\1\67",
            "\1\70\1\uffff\1\46\1\uffff\1\71",
            "\1\46\16\uffff\1\73\4\uffff\1\72",
            "\1\43",
            "\1\46\13\uffff\1\75",
            "\1\43",
            "\1\43",
            "\1\46\20\uffff\1\100\2\uffff\1\101",
            "\1\43",
            "\1\46\13\uffff\1\103\2\uffff\1\104",
            "\1\46\4\uffff\1\105\11\uffff\1\106",
            "\1\46\1\uffff\1\107",
            "\1\46\4\uffff\1\110",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\46\13\uffff\1\114",
            "\1\115\1\uffff\1\46",
            "\1\43",
            "\1\43",
            "\12\47\7\uffff\2\47\1\46\27\47\4\uffff\1\47\1\uffff\32\47",
            "\1\46",
            "\1\123\1\uffff\12\122\11\uffff\1\43\1\uffff\1\123\37\uffff\1\123",
            "\12\123\11\uffff\1\43",
            "\1\43",
            "\103\126\1\125\uffbc\126",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\153",
            "",
            "",
            "\1\154\14\uffff\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\166",
            "",
            "",
            "",
            "",
            "\1\123\1\uffff\12\122\13\uffff\1\123\37\uffff\1\123",
            "",
            "",
            "\117\126\1\167\uffb0\126",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177\7\uffff\1\u0080",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0082",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0084",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\4\47\1\u008b\1\47\1\u008c\4\47\1\u008d\16\47\4\uffff"+
                    "\1\47\1\uffff\32\47",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\47\7\uffff\4\47\1\u0092\25\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0094\3\uffff\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\1\u009a",
            "\115\126\1\u009b\uffb2\126",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a6",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a8",
            "\1\u00a9",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b7",
            "\1\u00b8",
            "\115\126\1\u00b9\uffb2\126",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00bb",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00bd",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00cb",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\105\126\1\u00ce\uffba\126",
            "",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "",
            "",
            "",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00d8",
            "",
            "",
            "\116\126\1\u00d9\uffb1\126",
            "\1\u00da",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00de",
            "\1\u00df",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u00e1",
            "\124\126\1\u00e2\uffab\126",
            "\60\43\12\u00e3\7\43\32\u00e3\4\43\1\u00e3\1\43\32\u00e3\uff85\43",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "\42\u00ea\1\u00e8\30\u00ea\1\u00e7\40\u00ea\1\u00e9\uffa3\u00ea",
            "\60\43\12\u00e3\7\43\32\u00e3\4\43\1\u00e3\1\43\32\u00e3\uff85\43",
            "",
            "\1\u00eb",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\42\u00ea\1\u00e8\30\u00ea\1\u00e7\40\u00ea\1\u00e9\uffa3\u00ea",
            "\0\43",
            "\42\43\1\u00ed\4\43\1\u00ed\10\43\4\u00ef\4\u00f0\44\43\1\u00ed\5\43"+
                    "\1\u00ed\3\43\1\u00ed\7\43\1\u00ed\3\43\1\u00ed\1\43\1\u00ed\1\u00ee"+
                    "\uff8a\43",
            "\42\u00ea\1\u00e8\30\u00ea\1\u00e7\40\u00ea\1\u00e9\uffa3\u00ea",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\42\u00ea\1\u00e8\30\u00ea\1\u00e7\40\u00ea\1\u00e9\uffa3\u00ea",
            "\60\43\12\u00f2\7\43\6\u00f2\32\43\6\u00f2\uff99\43",
            "\42\u00ea\1\u00e8\15\u00ea\10\u00f3\3\u00ea\1\u00e7\40\u00ea\1\u00e9"+
                    "\uffa3\u00ea",
            "\42\u00ea\1\u00e8\15\u00ea\10\u00f4\3\u00ea\1\u00e7\40\u00ea\1\u00e9"+
                    "\uffa3\u00ea",
            "",
            "\60\43\12\u00f5\7\43\6\u00f5\32\43\6\u00f5\uff99\43",
            "\42\u00ea\1\u00e8\15\u00ea\10\u00f6\3\u00ea\1\u00e7\40\u00ea\1\u00e9"+
                    "\uffa3\u00ea",
            "\42\u00ea\1\u00e8\30\u00ea\1\u00e7\40\u00ea\1\u00e9\uffa3\u00ea",
            "\60\43\12\u00f7\7\43\6\u00f7\32\43\6\u00f7\uff99\43",
            "\42\u00ea\1\u00e8\30\u00ea\1\u00e7\40\u00ea\1\u00e9\uffa3\u00ea",
            "\60\43\12\u00f8\7\43\6\u00f8\32\43\6\u00f8\uff99\43",
            "\42\u00ea\1\u00e8\30\u00ea\1\u00e7\40\u00ea\1\u00e9\uffa3\u00ea"
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
            return "1:1: Tokens : ( AND | ASSIGENMENT | BEGIN | BORNE | BORNESUPP | DIV | ELSE | EQUAL | EQV | FALSE | FOR | GOTO | GREATER | IF | IMPL | LABEL | LESS | LOCAL | MULT | NOT | NOTEQUAL | NOTGREATER | NOTLESS | OR | PARENTHESEF | PARENTHESEO | PAS | PLUS | POWER | PROCEDURE | PROG | SWITCH | THEN | TRUE | TYPEBOOL | TYPEINT | TYPEREAL | WHILE | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | ID | INT | FLOAT | COMMENT2 | WS | STRING );";
        }
        @Override
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch ( s ) {
                case 0 :
                    int LA16_238 = input.LA(1);
                    s = -1;
                    if ( ((LA16_238 >= '0' && LA16_238 <= '9')||(LA16_238 >= 'A' && LA16_238 <= 'F')||(LA16_238 >= 'a' && LA16_238 <= 'f')) ) {s = 242;}
                    else if ( ((LA16_238 >= '\u0000' && LA16_238 <= '/')||(LA16_238 >= ':' && LA16_238 <= '@')||(LA16_238 >= 'G' && LA16_238 <= '`')||(LA16_238 >= 'g' && LA16_238 <= '\uFFFF')) ) {s = 35;}
                    if ( s>=0 ) return s;
                    break;

                case 1 :
                    int LA16_240 = input.LA(1);
                    s = -1;
                    if ( ((LA16_240 >= '0' && LA16_240 <= '7')) ) {s = 244;}
                    else if ( (LA16_240=='\"') ) {s = 232;}
                    else if ( (LA16_240=='\\') ) {s = 233;}
                    else if ( (LA16_240==';') ) {s = 231;}
                    else if ( ((LA16_240 >= '\u0000' && LA16_240 <= '!')||(LA16_240 >= '#' && LA16_240 <= '/')||(LA16_240 >= '8' && LA16_240 <= ':')||(LA16_240 >= '<' && LA16_240 <= '[')||(LA16_240 >= ']' && LA16_240 <= '\uFFFF')) ) {s = 234;}
                    if ( s>=0 ) return s;
                    break;

                case 2 :
                    int LA16_233 = input.LA(1);
                    s = -1;
                    if ( (LA16_233=='\"'||LA16_233=='\''||LA16_233=='\\'||LA16_233=='b'||LA16_233=='f'||LA16_233=='n'||LA16_233=='r'||LA16_233=='t') ) {s = 237;}
                    else if ( (LA16_233=='u') ) {s = 238;}
                    else if ( ((LA16_233 >= '0' && LA16_233 <= '3')) ) {s = 239;}
                    else if ( ((LA16_233 >= '4' && LA16_233 <= '7')) ) {s = 240;}
                    else if ( ((LA16_233 >= '\u0000' && LA16_233 <= '!')||(LA16_233 >= '#' && LA16_233 <= '&')||(LA16_233 >= '(' && LA16_233 <= '/')||(LA16_233 >= '8' && LA16_233 <= '[')||(LA16_233 >= ']' && LA16_233 <= 'a')||(LA16_233 >= 'c' && LA16_233 <= 'e')||(LA16_233 >= 'g' && LA16_233 <= 'm')||(LA16_233 >= 'o' && LA16_233 <= 'q')||LA16_233=='s'||(LA16_233 >= 'v' && LA16_233 <= '\uFFFF')) ) {s = 35;}
                    if ( s>=0 ) return s;
                    break;

                case 3 :
                    int LA16_237 = input.LA(1);
                    s = -1;
                    if ( (LA16_237=='\"') ) {s = 232;}
                    else if ( (LA16_237=='\\') ) {s = 233;}
                    else if ( (LA16_237==';') ) {s = 231;}
                    else if ( ((LA16_237 >= '\u0000' && LA16_237 <= '!')||(LA16_237 >= '#' && LA16_237 <= ':')||(LA16_237 >= '<' && LA16_237 <= '[')||(LA16_237 >= ']' && LA16_237 <= '\uFFFF')) ) {s = 234;}
                    if ( s>=0 ) return s;
                    break;

                case 4 :
                    int LA16_243 = input.LA(1);
                    s = -1;
                    if ( ((LA16_243 >= '0' && LA16_243 <= '7')) ) {s = 246;}
                    else if ( (LA16_243=='\"') ) {s = 232;}
                    else if ( (LA16_243=='\\') ) {s = 233;}
                    else if ( (LA16_243==';') ) {s = 231;}
                    else if ( ((LA16_243 >= '\u0000' && LA16_243 <= '!')||(LA16_243 >= '#' && LA16_243 <= '/')||(LA16_243 >= '8' && LA16_243 <= ':')||(LA16_243 >= '<' && LA16_243 <= '[')||(LA16_243 >= ']' && LA16_243 <= '\uFFFF')) ) {s = 234;}
                    if ( s>=0 ) return s;
                    break;

                case 5 :
                    int LA16_231 = input.LA(1);
                    s = -1;
                    if ( (LA16_231==';') ) {s = 231;}
                    else if ( (LA16_231=='\"') ) {s = 232;}
                    else if ( (LA16_231=='\\') ) {s = 233;}
                    else if ( ((LA16_231 >= '\u0000' && LA16_231 <= '!')||(LA16_231 >= '#' && LA16_231 <= ':')||(LA16_231 >= '<' && LA16_231 <= '[')||(LA16_231 >= ']' && LA16_231 <= '\uFFFF')) ) {s = 234;}
                    else s = 35;
                    if ( s>=0 ) return s;
                    break;

                case 6 :
                    int LA16_248 = input.LA(1);
                    s = -1;
                    if ( (LA16_248=='\"') ) {s = 232;}
                    else if ( (LA16_248=='\\') ) {s = 233;}
                    else if ( (LA16_248==';') ) {s = 231;}
                    else if ( ((LA16_248 >= '\u0000' && LA16_248 <= '!')||(LA16_248 >= '#' && LA16_248 <= ':')||(LA16_248 >= '<' && LA16_248 <= '[')||(LA16_248 >= ']' && LA16_248 <= '\uFFFF')) ) {s = 234;}
                    if ( s>=0 ) return s;
                    break;

                case 7 :
                    int LA16_239 = input.LA(1);
                    s = -1;
                    if ( ((LA16_239 >= '0' && LA16_239 <= '7')) ) {s = 243;}
                    else if ( (LA16_239=='\"') ) {s = 232;}
                    else if ( (LA16_239=='\\') ) {s = 233;}
                    else if ( (LA16_239==';') ) {s = 231;}
                    else if ( ((LA16_239 >= '\u0000' && LA16_239 <= '!')||(LA16_239 >= '#' && LA16_239 <= '/')||(LA16_239 >= '8' && LA16_239 <= ':')||(LA16_239 >= '<' && LA16_239 <= '[')||(LA16_239 >= ']' && LA16_239 <= '\uFFFF')) ) {s = 234;}
                    if ( s>=0 ) return s;
                    break;

                case 8 :
                    int LA16_85 = input.LA(1);
                    s = -1;
                    if ( (LA16_85=='O') ) {s = 119;}
                    else if ( ((LA16_85 >= '\u0000' && LA16_85 <= 'N')||(LA16_85 >= 'P' && LA16_85 <= '\uFFFF')) ) {s = 86;}
                    if ( s>=0 ) return s;
                    break;

                case 9 :
                    int LA16_119 = input.LA(1);
                    s = -1;
                    if ( (LA16_119=='M') ) {s = 155;}
                    else if ( ((LA16_119 >= '\u0000' && LA16_119 <= 'L')||(LA16_119 >= 'N' && LA16_119 <= '\uFFFF')) ) {s = 86;}
                    if ( s>=0 ) return s;
                    break;

                case 10 :
                    int LA16_155 = input.LA(1);
                    s = -1;
                    if ( (LA16_155=='M') ) {s = 185;}
                    else if ( ((LA16_155 >= '\u0000' && LA16_155 <= 'L')||(LA16_155 >= 'N' && LA16_155 <= '\uFFFF')) ) {s = 86;}
                    if ( s>=0 ) return s;
                    break;

                case 11 :
                    int LA16_185 = input.LA(1);
                    s = -1;
                    if ( (LA16_185=='E') ) {s = 206;}
                    else if ( ((LA16_185 >= '\u0000' && LA16_185 <= 'D')||(LA16_185 >= 'F' && LA16_185 <= '\uFFFF')) ) {s = 86;}
                    if ( s>=0 ) return s;
                    break;

                case 12 :
                    int LA16_206 = input.LA(1);
                    s = -1;
                    if ( (LA16_206=='N') ) {s = 217;}
                    else if ( ((LA16_206 >= '\u0000' && LA16_206 <= 'M')||(LA16_206 >= 'O' && LA16_206 <= '\uFFFF')) ) {s = 86;}
                    if ( s>=0 ) return s;
                    break;

                case 13 :
                    int LA16_217 = input.LA(1);
                    s = -1;
                    if ( (LA16_217=='T') ) {s = 226;}
                    else if ( ((LA16_217 >= '\u0000' && LA16_217 <= 'S')||(LA16_217 >= 'U' && LA16_217 <= '\uFFFF')) ) {s = 86;}
                    if ( s>=0 ) return s;
                    break;

                case 14 :
                    int LA16_227 = input.LA(1);
                    s = -1;
                    if ( ((LA16_227 >= '\u0000' && LA16_227 <= '/')||(LA16_227 >= ':' && LA16_227 <= '@')||(LA16_227 >= '[' && LA16_227 <= '^')||LA16_227=='`'||(LA16_227 >= '{' && LA16_227 <= '\uFFFF')) ) {s = 35;}
                    else if ( ((LA16_227 >= '0' && LA16_227 <= '9')||(LA16_227 >= 'A' && LA16_227 <= 'Z')||LA16_227=='_'||(LA16_227 >= 'a' && LA16_227 <= 'z')) ) {s = 227;}
                    else s = 39;
                    if ( s>=0 ) return s;
                    break;

                case 15 :
                    int LA16_34 = input.LA(1);
                    s = -1;
                    if ( (LA16_34=='C') ) {s = 85;}
                    else if ( ((LA16_34 >= '\u0000' && LA16_34 <= 'B')||(LA16_34 >= 'D' && LA16_34 <= '\uFFFF')) ) {s = 86;}
                    if ( s>=0 ) return s;
                    break;

                case 16 :
                    int LA16_218 = input.LA(1);
                    s = -1;
                    if ( ((LA16_218 >= '\u0000' && LA16_218 <= '/')||(LA16_218 >= ':' && LA16_218 <= '@')||(LA16_218 >= '[' && LA16_218 <= '^')||LA16_218=='`'||(LA16_218 >= '{' && LA16_218 <= '\uFFFF')) ) {s = 35;}
                    else if ( ((LA16_218 >= '0' && LA16_218 <= '9')||(LA16_218 >= 'A' && LA16_218 <= 'Z')||LA16_218=='_'||(LA16_218 >= 'a' && LA16_218 <= 'z')) ) {s = 227;}
                    else s = 39;
                    if ( s>=0 ) return s;
                    break;

                case 17 :
                    int LA16_234 = input.LA(1);
                    s = -1;
                    if ( (LA16_234==';') ) {s = 231;}
                    else if ( (LA16_234=='\"') ) {s = 232;}
                    else if ( (LA16_234=='\\') ) {s = 233;}
                    else if ( ((LA16_234 >= '\u0000' && LA16_234 <= '!')||(LA16_234 >= '#' && LA16_234 <= ':')||(LA16_234 >= '<' && LA16_234 <= '[')||(LA16_234 >= ']' && LA16_234 <= '\uFFFF')) ) {s = 234;}
                    if ( s>=0 ) return s;
                    break;

                case 18 :
                    int LA16_242 = input.LA(1);
                    s = -1;
                    if ( ((LA16_242 >= '0' && LA16_242 <= '9')||(LA16_242 >= 'A' && LA16_242 <= 'F')||(LA16_242 >= 'a' && LA16_242 <= 'f')) ) {s = 245;}
                    else if ( ((LA16_242 >= '\u0000' && LA16_242 <= '/')||(LA16_242 >= ':' && LA16_242 <= '@')||(LA16_242 >= 'G' && LA16_242 <= '`')||(LA16_242 >= 'g' && LA16_242 <= '\uFFFF')) ) {s = 35;}
                    if ( s>=0 ) return s;
                    break;

                case 19 :
                    int LA16_245 = input.LA(1);
                    s = -1;
                    if ( ((LA16_245 >= '0' && LA16_245 <= '9')||(LA16_245 >= 'A' && LA16_245 <= 'F')||(LA16_245 >= 'a' && LA16_245 <= 'f')) ) {s = 247;}
                    else if ( ((LA16_245 >= '\u0000' && LA16_245 <= '/')||(LA16_245 >= ':' && LA16_245 <= '@')||(LA16_245 >= 'G' && LA16_245 <= '`')||(LA16_245 >= 'g' && LA16_245 <= '\uFFFF')) ) {s = 35;}
                    if ( s>=0 ) return s;
                    break;

                case 20 :
                    int LA16_247 = input.LA(1);
                    s = -1;
                    if ( ((LA16_247 >= '0' && LA16_247 <= '9')||(LA16_247 >= 'A' && LA16_247 <= 'F')||(LA16_247 >= 'a' && LA16_247 <= 'f')) ) {s = 248;}
                    else if ( ((LA16_247 >= '\u0000' && LA16_247 <= '/')||(LA16_247 >= ':' && LA16_247 <= '@')||(LA16_247 >= 'G' && LA16_247 <= '`')||(LA16_247 >= 'g' && LA16_247 <= '\uFFFF')) ) {s = 35;}
                    if ( s>=0 ) return s;
                    break;

                case 21 :
                    int LA16_0 = input.LA(1);
                    s = -1;
                    if ( (LA16_0=='A') ) {s = 1;}
                    else if ( (LA16_0==':') ) {s = 2;}
                    else if ( (LA16_0=='B') ) {s = 3;}
                    else if ( (LA16_0=='U') ) {s = 4;}
                    else if ( (LA16_0=='/') ) {s = 5;}
                    else if ( (LA16_0=='E') ) {s = 6;}
                    else if ( (LA16_0=='F') ) {s = 7;}
                    else if ( (LA16_0=='G') ) {s = 8;}
                    else if ( (LA16_0=='I') ) {s = 9;}
                    else if ( (LA16_0=='L') ) {s = 10;}
                    else if ( (LA16_0=='O') ) {s = 11;}
                    else if ( (LA16_0=='*') ) {s = 12;}
                    else if ( (LA16_0=='N') ) {s = 13;}
                    else if ( (LA16_0==')') ) {s = 14;}
                    else if ( (LA16_0=='(') ) {s = 15;}
                    else if ( (LA16_0=='S') ) {s = 16;}
                    else if ( (LA16_0=='+') ) {s = 17;}
                    else if ( (LA16_0=='P') ) {s = 18;}
                    else if ( (LA16_0=='T') ) {s = 19;}
                    else if ( (LA16_0=='R') ) {s = 20;}
                    else if ( (LA16_0=='W') ) {s = 21;}
                    else if ( (LA16_0==',') ) {s = 22;}
                    else if ( (LA16_0=='-') ) {s = 23;}
                    else if ( (LA16_0==';') ) {s = 24;}
                    else if ( (LA16_0=='D') ) {s = 25;}
                    else if ( (LA16_0=='V') ) {s = 26;}
                    else if ( (LA16_0=='[') ) {s = 27;}
                    else if ( (LA16_0==']') ) {s = 28;}
                    else if ( (LA16_0=='a') ) {s = 29;}
                    else if ( (LA16_0=='C'||LA16_0=='H'||(LA16_0 >= 'J' && LA16_0 <= 'K')||LA16_0=='M'||LA16_0=='Q'||(LA16_0 >= 'X' && LA16_0 <= 'Z')||LA16_0=='_'||(LA16_0 >= 'b' && LA16_0 <= 'z')) ) {s = 30;}
                    else if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {s = 31;}
                    else if ( (LA16_0=='.') ) {s = 32;}
                    else if ( ((LA16_0 >= '\t' && LA16_0 <= '\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 33;}
                    else if ( (LA16_0=='\"') ) {s = 34;}
                    else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '\b')||(LA16_0 >= '\u000B' && LA16_0 <= '\f')||(LA16_0 >= '\u000E' && LA16_0 <= '\u001F')||LA16_0=='!'||(LA16_0 >= '#' && LA16_0 <= '\'')||(LA16_0 >= '<' && LA16_0 <= '@')||LA16_0=='\\'||LA16_0=='^'||LA16_0=='`'||(LA16_0 >= '{' && LA16_0 <= '\uFFFF')) ) {s = 35;}
                    if ( s>=0 ) return s;
                    break;

                case 22 :
                    int LA16_226 = input.LA(1);
                    s = -1;
                    if ( (LA16_226==';') ) {s = 231;}
                    else if ( (LA16_226=='\"') ) {s = 232;}
                    else if ( (LA16_226=='\\') ) {s = 233;}
                    else if ( ((LA16_226 >= '\u0000' && LA16_226 <= '!')||(LA16_226 >= '#' && LA16_226 <= ':')||(LA16_226 >= '<' && LA16_226 <= '[')||(LA16_226 >= ']' && LA16_226 <= '\uFFFF')) ) {s = 234;}
                    if ( s>=0 ) return s;
                    break;

                case 23 :
                    int LA16_232 = input.LA(1);
                    s = -1;
                    if ( ((LA16_232 >= '\u0000' && LA16_232 <= '\uFFFF')) ) {s = 35;}
                    else s = 86;
                    if ( s>=0 ) return s;
                    break;

                case 24 :
                    int LA16_246 = input.LA(1);
                    s = -1;
                    if ( (LA16_246=='\"') ) {s = 232;}
                    else if ( (LA16_246=='\\') ) {s = 233;}
                    else if ( (LA16_246==';') ) {s = 231;}
                    else if ( ((LA16_246 >= '\u0000' && LA16_246 <= '!')||(LA16_246 >= '#' && LA16_246 <= ':')||(LA16_246 >= '<' && LA16_246 <= '[')||(LA16_246 >= ']' && LA16_246 <= '\uFFFF')) ) {s = 234;}
                    if ( s>=0 ) return s;
                    break;

                case 25 :
                    int LA16_244 = input.LA(1);
                    s = -1;
                    if ( (LA16_244=='\"') ) {s = 232;}
                    else if ( (LA16_244=='\\') ) {s = 233;}
                    else if ( (LA16_244==';') ) {s = 231;}
                    else if ( ((LA16_244 >= '\u0000' && LA16_244 <= '!')||(LA16_244 >= '#' && LA16_244 <= ':')||(LA16_244 >= '<' && LA16_244 <= '[')||(LA16_244 >= ']' && LA16_244 <= '\uFFFF')) ) {s = 234;}
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
