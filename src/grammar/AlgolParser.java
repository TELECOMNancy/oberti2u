// $ANTLR 3.5.1 C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g 2020-01-30 17:29:59
package grammar;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class AlgolParser extends Parser {
    public static final String[] tokenNames = new String[] {
            "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCCESS", "ACCESS", "AND", "ARRAY",
            "ARRAYACCESS", "ASSIGEMENT", "BEGIN", "BLOCK", "BORNE", "CALL", "COMMENT2",
            "DEC", "DIV", "DO", "ELSE", "END", "EQUAL", "EQUIV", "ESC_SEQ", "EXPONENT",
            "FALSE", "FLOAT", "FOR", "FORLISTELEMENT", "GOTO", "GREATER", "HEX_DIGIT",
            "ID", "IF", "IMPL", "INT", "LABEL", "LESS", "LISTARG", "LISTFOR", "LISTPARA",
            "MINUS", "MULT", "NOT", "NOTEQUAL", "NOTGREATER", "NOTLESS", "OCTAL_ESC",
            "OR", "OWN", "PAS", "PLUS", "POWER", "PROCEDURE", "PROG", "SPECIFICATION",
            "STRING", "SWITCH", "SWITCHLIST", "THEN", "TRUE", "TYPEBOOL", "TYPEINT",
            "TYPEREAL", "UNICODE_ESC", "UNTIL", "VALUE", "WHILE", "WS", "'('", "')'",
            "','", "';'", "'VALUE'", "'['", "']'"
    };
    public static final int EOF=-1;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int ACCCESS=4;
    public static final int ACCESS=5;
    public static final int AND=6;
    public static final int ARRAY=7;
    public static final int ARRAYACCESS=8;
    public static final int ASSIGEMENT=9;
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
    public static final int SWITCHLIST=57;
    public static final int THEN=58;
    public static final int TRUE=59;
    public static final int TYPEBOOL=60;
    public static final int TYPEINT=61;
    public static final int TYPEREAL=62;
    public static final int UNICODE_ESC=63;
    public static final int UNTIL=64;
    public static final int VALUE=65;
    public static final int WHILE=66;
    public static final int WS=67;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AlgolParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AlgolParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }
    @Override public String[] getTokenNames() { return AlgolParser.tokenNames; }
    @Override public String getGrammarFileName() { return "C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g"; }


    CommonTree Idmemoire;


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:71:1: prog : prog1 -> ^( PROG prog1 ) ;
    public final AlgolParser.prog_return prog() throws RecognitionException {
        AlgolParser.prog_return retval = new AlgolParser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ParserRuleReturnScope prog11 =null;

        RewriteRuleSubtreeStream stream_prog1=new RewriteRuleSubtreeStream(adaptor,"rule prog1");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:71:6: ( prog1 -> ^( PROG prog1 ) )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:71:8: prog1
            {
                pushFollow(FOLLOW_prog1_in_prog285);
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
                // 71:14: -> ^( PROG prog1 )
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:71:16: ^( PROG prog1 )
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


    public static class prog1_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "prog1"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:74:1: prog1 : ( begin EOF -> begin | ( label ':' )+ begin -> ^( LABEL ( label )+ begin ) );
    public final AlgolParser.prog1_return prog1() throws RecognitionException {
        AlgolParser.prog1_return retval = new AlgolParser.prog1_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF3=null;
        Token char_literal5=null;
        ParserRuleReturnScope begin2 =null;
        ParserRuleReturnScope label4 =null;
        ParserRuleReturnScope begin6 =null;

        CommonTree EOF3_tree=null;
        CommonTree char_literal5_tree=null;
        RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_label=new RewriteRuleSubtreeStream(adaptor,"rule label");
        RewriteRuleSubtreeStream stream_begin=new RewriteRuleSubtreeStream(adaptor,"rule begin");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:74:7: ( begin EOF -> begin | ( label ':' )+ begin -> ^( LABEL ( label )+ begin ) )
            int alt2=2;
            int LA2_0 = input.LA(1);
            if ( (LA2_0==BEGIN) ) {
                alt2=1;
            }
            else if ( (LA2_0==ID||LA2_0==INT) ) {
                alt2=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 2, 0, input);
                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:74:11: begin EOF
                {
                    pushFollow(FOLLOW_begin_in_prog1305);
                    begin2=begin();
                    state._fsp--;

                    stream_begin.add(begin2.getTree());
                    EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog1307);
                    stream_EOF.add(EOF3);

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
                    // 74:20: -> begin
                    {
                        adaptor.addChild(root_0, stream_begin.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:75:19: ( label ':' )+ begin
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:75:19: ( label ':' )+
                    int cnt1=0;
                    loop1:
                    while (true) {
                        int alt1=2;
                        int LA1_0 = input.LA(1);
                        if ( (LA1_0==ID||LA1_0==INT) ) {
                            alt1=1;
                        }

                        switch (alt1) {
                            case 1 :
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:75:20: label ':'
                            {
                                pushFollow(FOLLOW_label_in_prog1330);
                                label4=label();
                                state._fsp--;

                                stream_label.add(label4.getTree());
                                char_literal5=(Token)match(input,BORNE,FOLLOW_BORNE_in_prog1332);
                                stream_BORNE.add(char_literal5);

                            }
                            break;

                            default :
                                if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee = new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    }

                    pushFollow(FOLLOW_begin_in_prog1336);
                    begin6=begin();
                    state._fsp--;

                    stream_begin.add(begin6.getTree());
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
                    // 75:37: -> ^( LABEL ( label )+ begin )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:75:39: ^( LABEL ( label )+ begin )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, "LABEL"), root_1);
                            if ( !(stream_label.hasNext()) ) {
                                throw new RewriteEarlyExitException();
                            }
                            while ( stream_label.hasNext() ) {
                                adaptor.addChild(root_1, stream_label.nextTree());
                            }
                            stream_label.reset();

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


    public static class begin_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "begin"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:78:1: begin : 'BEGIN' block -> ^( BEGIN block ) ;
    public final AlgolParser.begin_return begin() throws RecognitionException {
        AlgolParser.begin_return retval = new AlgolParser.begin_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal7=null;
        ParserRuleReturnScope block8 =null;

        CommonTree string_literal7_tree=null;
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:78:7: ( 'BEGIN' block -> ^( BEGIN block ) )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:78:9: 'BEGIN' block
            {
                string_literal7=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin388);
                stream_BEGIN.add(string_literal7);

                pushFollow(FOLLOW_block_in_begin390);
                block8=block();
                state._fsp--;

                stream_block.add(block8.getTree());
                // AST REWRITE
                // elements: block
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                root_0 = (CommonTree)adaptor.nil();
                // 78:22: -> ^( BEGIN block )
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:78:24: ^( BEGIN block )
                    {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BEGIN, "BEGIN"), root_1);
                        adaptor.addChild(root_1, stream_block.nextTree());
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


    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "block"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:81:2: block : ( declaration ';' ( declaration ';' )* compoundT -> ( ^( DEC declaration ) )+ ^( BLOCK compoundT ) | compoundT -> ^( BLOCK compoundT ) );
    public final AlgolParser.block_return block() throws RecognitionException {
        AlgolParser.block_return retval = new AlgolParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        ParserRuleReturnScope declaration9 =null;
        ParserRuleReturnScope declaration11 =null;
        ParserRuleReturnScope compoundT13 =null;
        ParserRuleReturnScope compoundT14 =null;

        CommonTree char_literal10_tree=null;
        CommonTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_compoundT=new RewriteRuleSubtreeStream(adaptor,"rule compoundT");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:81:8: ( declaration ';' ( declaration ';' )* compoundT -> ( ^( DEC declaration ) )+ ^( BLOCK compoundT ) | compoundT -> ^( BLOCK compoundT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);
            if ( (LA4_0==ARRAY||LA4_0==OWN||LA4_0==PROCEDURE||LA4_0==SWITCH||(LA4_0 >= TYPEBOOL && LA4_0 <= TYPEREAL)) ) {
                alt4=1;
            }
            else if ( (LA4_0==BEGIN||LA4_0==COMMENT2||LA4_0==FOR||LA4_0==GOTO||(LA4_0 >= ID && LA4_0 <= IF)||LA4_0==INT||LA4_0==68) ) {
                alt4=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 4, 0, input);
                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:81:10: declaration ';' ( declaration ';' )* compoundT
                {
                    pushFollow(FOLLOW_declaration_in_block431);
                    declaration9=declaration();
                    state._fsp--;

                    stream_declaration.add(declaration9.getTree());
                    char_literal10=(Token)match(input,71,FOLLOW_71_in_block433);
                    stream_71.add(char_literal10);

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:81:26: ( declaration ';' )*
                    loop3:
                    while (true) {
                        int alt3=2;
                        int LA3_0 = input.LA(1);
                        if ( (LA3_0==ARRAY||LA3_0==OWN||LA3_0==PROCEDURE||LA3_0==SWITCH||(LA3_0 >= TYPEBOOL && LA3_0 <= TYPEREAL)) ) {
                            alt3=1;
                        }

                        switch (alt3) {
                            case 1 :
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:81:27: declaration ';'
                            {
                                pushFollow(FOLLOW_declaration_in_block436);
                                declaration11=declaration();
                                state._fsp--;

                                stream_declaration.add(declaration11.getTree());
                                char_literal12=(Token)match(input,71,FOLLOW_71_in_block438);
                                stream_71.add(char_literal12);

                            }
                            break;

                            default :
                                break loop3;
                        }
                    }

                    pushFollow(FOLLOW_compoundT_in_block442);
                    compoundT13=compoundT();
                    state._fsp--;

                    stream_compoundT.add(compoundT13.getTree());
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
                    // 81:54: -> ( ^( DEC declaration ) )+ ^( BLOCK compoundT )
                    {
                        if ( !(stream_declaration.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_declaration.hasNext() ) {
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:81:56: ^( DEC declaration )
                            {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEC, "DEC"), root_1);
                                adaptor.addChild(root_1, stream_declaration.nextTree());
                                adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_declaration.reset();

                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:81:76: ^( BLOCK compoundT )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
                            adaptor.addChild(root_1, stream_compoundT.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:82:4: compoundT
                {
                    pushFollow(FOLLOW_compoundT_in_block460);
                    compoundT14=compoundT();
                    state._fsp--;

                    stream_compoundT.add(compoundT14.getTree());
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
                    // 82:13: -> ^( BLOCK compoundT )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:82:15: ^( BLOCK compoundT )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
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
        return retval;
    }
    // $ANTLR end "block"


    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:85:1: declaration : ( localorown typedeclaration | typedeclaration2 -> typedeclaration2 | switchdec -> switchdec );
    public final AlgolParser.declaration_return declaration() throws RecognitionException {
        AlgolParser.declaration_return retval = new AlgolParser.declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ParserRuleReturnScope localorown15 =null;
        ParserRuleReturnScope typedeclaration16 =null;
        ParserRuleReturnScope typedeclaration217 =null;
        ParserRuleReturnScope switchdec18 =null;

        RewriteRuleSubtreeStream stream_switchdec=new RewriteRuleSubtreeStream(adaptor,"rule switchdec");
        RewriteRuleSubtreeStream stream_typedeclaration2=new RewriteRuleSubtreeStream(adaptor,"rule typedeclaration2");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:86:2: ( localorown typedeclaration | typedeclaration2 -> typedeclaration2 | switchdec -> switchdec )
            int alt5=3;
            switch ( input.LA(1) ) {
                case OWN:
                case TYPEBOOL:
                case TYPEINT:
                case TYPEREAL:
                {
                    alt5=1;
                }
                break;
                case ARRAY:
                case PROCEDURE:
                {
                    alt5=2;
                }
                break;
                case SWITCH:
                {
                    alt5=3;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);
                    throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:86:4: localorown typedeclaration
                {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_localorown_in_declaration478);
                    localorown15=localorown();
                    state._fsp--;

                    adaptor.addChild(root_0, localorown15.getTree());

                    pushFollow(FOLLOW_typedeclaration_in_declaration480);
                    typedeclaration16=typedeclaration();
                    state._fsp--;

                    adaptor.addChild(root_0, typedeclaration16.getTree());

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:87:16: typedeclaration2
                {
                    pushFollow(FOLLOW_typedeclaration2_in_declaration497);
                    typedeclaration217=typedeclaration2();
                    state._fsp--;

                    stream_typedeclaration2.add(typedeclaration217.getTree());
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
                    // 87:32: -> typedeclaration2
                    {
                        adaptor.addChild(root_0, stream_typedeclaration2.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:88:15: switchdec
                {
                    pushFollow(FOLLOW_switchdec_in_declaration515);
                    switchdec18=switchdec();
                    state._fsp--;

                    stream_switchdec.add(switchdec18.getTree());
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
                    // 88:24: -> switchdec
                    {
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
        return retval;
    }
    // $ANTLR end "declaration"


    public static class localorown_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "localorown"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:91:1: localorown : ( type | OWN type );
    public final AlgolParser.localorown_return localorown() throws RecognitionException {
        AlgolParser.localorown_return retval = new AlgolParser.localorown_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OWN20=null;
        ParserRuleReturnScope type19 =null;
        ParserRuleReturnScope type21 =null;

        CommonTree OWN20_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:91:13: ( type | OWN type )
            int alt6=2;
            int LA6_0 = input.LA(1);
            if ( ((LA6_0 >= TYPEBOOL && LA6_0 <= TYPEREAL)) ) {
                alt6=1;
            }
            else if ( (LA6_0==OWN) ) {
                alt6=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 6, 0, input);
                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:91:15: type
                {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_localorown529);
                    type19=type();
                    state._fsp--;

                    adaptor.addChild(root_0, type19.getTree());

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:91:20: OWN type
                {
                    root_0 = (CommonTree)adaptor.nil();


                    OWN20=(Token)match(input,OWN,FOLLOW_OWN_in_localorown531);
                    OWN20_tree = (CommonTree)adaptor.create(OWN20);
                    adaptor.addChild(root_0, OWN20_tree);

                    pushFollow(FOLLOW_type_in_localorown533);
                    type21=type();
                    state._fsp--;

                    adaptor.addChild(root_0, type21.getTree());

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
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:94:1: type : ( TYPEREAL | TYPEINT | TYPEBOOL );
    public final AlgolParser.type_return type() throws RecognitionException {
        AlgolParser.type_return retval = new AlgolParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set22=null;

        CommonTree set22_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:94:6: ( TYPEREAL | TYPEINT | TYPEBOOL )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:
            {
                root_0 = (CommonTree)adaptor.nil();


                set22=input.LT(1);
                if ( (input.LA(1) >= TYPEBOOL && input.LA(1) <= TYPEREAL) ) {
                    input.consume();
                    adaptor.addChild(root_0, (CommonTree)adaptor.create(set22));
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
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:99:1: typeliste : identifier ( ',' identifier )* -> ( identifier )+ ;
    public final AlgolParser.typeliste_return typeliste() throws RecognitionException {
        AlgolParser.typeliste_return retval = new AlgolParser.typeliste_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal24=null;
        ParserRuleReturnScope identifier23 =null;
        ParserRuleReturnScope identifier25 =null;

        CommonTree char_literal24_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:99:16: ( identifier ( ',' identifier )* -> ( identifier )+ )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:99:18: identifier ( ',' identifier )*
            {
                pushFollow(FOLLOW_identifier_in_typeliste597);
                identifier23=identifier();
                state._fsp--;

                stream_identifier.add(identifier23.getTree());
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:99:29: ( ',' identifier )*
                loop7:
                while (true) {
                    int alt7=2;
                    int LA7_0 = input.LA(1);
                    if ( (LA7_0==70) ) {
                        alt7=1;
                    }

                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:99:30: ',' identifier
                        {
                            char_literal24=(Token)match(input,70,FOLLOW_70_in_typeliste600);
                            stream_70.add(char_literal24);

                            pushFollow(FOLLOW_identifier_in_typeliste602);
                            identifier25=identifier();
                            state._fsp--;

                            stream_identifier.add(identifier25.getTree());
                        }
                        break;

                        default :
                            break loop7;
                    }
                }

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
                // 99:46: -> ( identifier )+
                {
                    if ( !(stream_identifier.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_identifier.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "typeliste"


    public static class arraylist_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "arraylist"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:102:1: arraylist : arrayseg ( ',' arrayseg )* -> ( arrayseg )* ;
    public final AlgolParser.arraylist_return arraylist() throws RecognitionException {
        AlgolParser.arraylist_return retval = new AlgolParser.arraylist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal27=null;
        ParserRuleReturnScope arrayseg26 =null;
        ParserRuleReturnScope arrayseg28 =null;

        CommonTree char_literal27_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_arrayseg=new RewriteRuleSubtreeStream(adaptor,"rule arrayseg");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:102:16: ( arrayseg ( ',' arrayseg )* -> ( arrayseg )* )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:102:18: arrayseg ( ',' arrayseg )*
            {
                pushFollow(FOLLOW_arrayseg_in_arraylist624);
                arrayseg26=arrayseg();
                state._fsp--;

                stream_arrayseg.add(arrayseg26.getTree());
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:102:26: ( ',' arrayseg )*
                loop8:
                while (true) {
                    int alt8=2;
                    int LA8_0 = input.LA(1);
                    if ( (LA8_0==70) ) {
                        alt8=1;
                    }

                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:102:27: ',' arrayseg
                        {
                            char_literal27=(Token)match(input,70,FOLLOW_70_in_arraylist626);
                            stream_70.add(char_literal27);

                            pushFollow(FOLLOW_arrayseg_in_arraylist627);
                            arrayseg28=arrayseg();
                            state._fsp--;

                            stream_arrayseg.add(arrayseg28.getTree());
                        }
                        break;

                        default :
                            break loop8;
                    }
                }

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
                // 102:41: -> ( arrayseg )*
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:102:43: ( arrayseg )*
                    while ( stream_arrayseg.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "arraylist"


    public static class arrayseg_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "arrayseg"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:105:1: arrayseg : ID ( -> ID ) arrayConstructor -> arrayConstructor ;
    public final AlgolParser.arrayseg_return arrayseg() throws RecognitionException {
        AlgolParser.arrayseg_return retval = new AlgolParser.arrayseg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID29=null;
        ParserRuleReturnScope arrayConstructor30 =null;

        CommonTree ID29_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_arrayConstructor=new RewriteRuleSubtreeStream(adaptor,"rule arrayConstructor");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:105:9: ( ID ( -> ID ) arrayConstructor -> arrayConstructor )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:105:11: ID ( -> ID ) arrayConstructor
            {
                ID29=(Token)match(input,ID,FOLLOW_ID_in_arrayseg644);
                stream_ID.add(ID29);

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:105:14: ( -> ID )
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:105:15:
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
                    // 105:15: -> ID
                    {
                        adaptor.addChild(root_0, stream_ID.nextNode());
                    }


                    retval.tree = root_0;

                }

                Idmemoire=retval.tree;
                pushFollow(FOLLOW_arrayConstructor_in_arrayseg653);
                arrayConstructor30=arrayConstructor();
                state._fsp--;

                stream_arrayConstructor.add(arrayConstructor30.getTree());
                // AST REWRITE
                // elements: arrayConstructor
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                root_0 = (CommonTree)adaptor.nil();
                // 105:65: -> arrayConstructor
                {
                    adaptor.addChild(root_0, stream_arrayConstructor.nextTree());
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
    // $ANTLR end "arrayseg"


    public static class arrayConstructor_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "arrayConstructor"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:108:1: arrayConstructor : ( ( ->) '[' boundplist ']' -> $arrayConstructor boundplist | ( ->) ',' arrayseg -> arrayseg );
    public final AlgolParser.arrayConstructor_return arrayConstructor() throws RecognitionException {
        AlgolParser.arrayConstructor_return retval = new AlgolParser.arrayConstructor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal31=null;
        Token char_literal33=null;
        Token char_literal34=null;
        ParserRuleReturnScope boundplist32 =null;
        ParserRuleReturnScope arrayseg35 =null;

        CommonTree char_literal31_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree char_literal34_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_boundplist=new RewriteRuleSubtreeStream(adaptor,"rule boundplist");
        RewriteRuleSubtreeStream stream_arrayseg=new RewriteRuleSubtreeStream(adaptor,"rule arrayseg");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:108:18: ( ( ->) '[' boundplist ']' -> $arrayConstructor boundplist | ( ->) ',' arrayseg -> arrayseg )
            int alt9=2;
            int LA9_0 = input.LA(1);
            if ( (LA9_0==73) ) {
                alt9=1;
            }
            else if ( (LA9_0==70) ) {
                alt9=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 9, 0, input);
                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:108:20: ( ->) '[' boundplist ']'
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:108:20: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:108:21:
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
                        // 108:21: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    char_literal31=(Token)match(input,73,FOLLOW_73_in_arrayConstructor690);
                    stream_73.add(char_literal31);

                    pushFollow(FOLLOW_boundplist_in_arrayConstructor692);
                    boundplist32=boundplist();
                    state._fsp--;

                    stream_boundplist.add(boundplist32.getTree());
                    char_literal33=(Token)match(input,74,FOLLOW_74_in_arrayConstructor693);
                    stream_74.add(char_literal33);

                    // AST REWRITE
                    // elements: arrayConstructor, boundplist
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 108:52: -> $arrayConstructor boundplist
                    {
                        adaptor.addChild(root_0, stream_retval.nextTree());
                        adaptor.addChild(root_0, stream_boundplist.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:109:4: ( ->) ',' arrayseg
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:109:4: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:109:5:
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
                        // 109:5: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    char_literal34=(Token)match(input,70,FOLLOW_70_in_arrayConstructor708);
                    stream_70.add(char_literal34);

                    pushFollow(FOLLOW_arrayseg_in_arrayConstructor710);
                    arrayseg35=arrayseg();
                    state._fsp--;

                    stream_arrayseg.add(arrayseg35.getTree());
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
                    // 109:31: -> arrayseg
                    {
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
        return retval;
    }
    // $ANTLR end "arrayConstructor"


    public static class boundplist_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "boundplist"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:112:1: boundplist : boundp ( ',' boundp )* -> ( boundp )+ ;
    public final AlgolParser.boundplist_return boundplist() throws RecognitionException {
        AlgolParser.boundplist_return retval = new AlgolParser.boundplist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal37=null;
        ParserRuleReturnScope boundp36 =null;
        ParserRuleReturnScope boundp38 =null;

        CommonTree char_literal37_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_boundp=new RewriteRuleSubtreeStream(adaptor,"rule boundp");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:113:2: ( boundp ( ',' boundp )* -> ( boundp )+ )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:113:4: boundp ( ',' boundp )*
            {
                pushFollow(FOLLOW_boundp_in_boundplist724);
                boundp36=boundp();
                state._fsp--;

                stream_boundp.add(boundp36.getTree());
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:113:11: ( ',' boundp )*
                loop10:
                while (true) {
                    int alt10=2;
                    int LA10_0 = input.LA(1);
                    if ( (LA10_0==70) ) {
                        alt10=1;
                    }

                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:113:12: ',' boundp
                        {
                            char_literal37=(Token)match(input,70,FOLLOW_70_in_boundplist727);
                            stream_70.add(char_literal37);

                            pushFollow(FOLLOW_boundp_in_boundplist729);
                            boundp38=boundp();
                            state._fsp--;

                            stream_boundp.add(boundp38.getTree());
                        }
                        break;

                        default :
                            break loop10;
                    }
                }

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
                // 113:24: -> ( boundp )+
                {
                    if ( !(stream_boundp.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_boundp.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "boundplist"


    public static class boundp_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "boundp"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:116:1: boundp : simpleAr ':' simpleAr -> ^( BORNE simpleAr simpleAr ) ;
    public final AlgolParser.boundp_return boundp() throws RecognitionException {
        AlgolParser.boundp_return retval = new AlgolParser.boundp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal40=null;
        ParserRuleReturnScope simpleAr39 =null;
        ParserRuleReturnScope simpleAr41 =null;

        CommonTree char_literal40_tree=null;
        RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
        RewriteRuleSubtreeStream stream_simpleAr=new RewriteRuleSubtreeStream(adaptor,"rule simpleAr");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:116:8: ( simpleAr ':' simpleAr -> ^( BORNE simpleAr simpleAr ) )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:116:10: simpleAr ':' simpleAr
            {
                pushFollow(FOLLOW_simpleAr_in_boundp747);
                simpleAr39=simpleAr();
                state._fsp--;

                stream_simpleAr.add(simpleAr39.getTree());
                char_literal40=(Token)match(input,BORNE,FOLLOW_BORNE_in_boundp749);
                stream_BORNE.add(char_literal40);

                pushFollow(FOLLOW_simpleAr_in_boundp751);
                simpleAr41=simpleAr();
                state._fsp--;

                stream_simpleAr.add(simpleAr41.getTree());
                // AST REWRITE
                // elements: simpleAr, simpleAr
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                root_0 = (CommonTree)adaptor.nil();
                // 116:31: -> ^( BORNE simpleAr simpleAr )
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:116:33: ^( BORNE simpleAr simpleAr )
                    {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BORNE, "BORNE"), root_1);
                        adaptor.addChild(root_1, stream_simpleAr.nextTree());
                        adaptor.addChild(root_1, stream_simpleAr.nextTree());
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
    // $ANTLR end "boundp"


    public static class typedeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "typedeclaration"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:120:1: typedeclaration : ( typeliste | 'ARRAY' arraylist -> ^( ARRAY arraylist ) | procedure -> procedure );
    public final AlgolParser.typedeclaration_return typedeclaration() throws RecognitionException {
        AlgolParser.typedeclaration_return retval = new AlgolParser.typedeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal43=null;
        ParserRuleReturnScope typeliste42 =null;
        ParserRuleReturnScope arraylist44 =null;
        ParserRuleReturnScope procedure45 =null;

        CommonTree string_literal43_tree=null;
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_arraylist=new RewriteRuleSubtreeStream(adaptor,"rule arraylist");
        RewriteRuleSubtreeStream stream_procedure=new RewriteRuleSubtreeStream(adaptor,"rule procedure");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:120:16: ( typeliste | 'ARRAY' arraylist -> ^( ARRAY arraylist ) | procedure -> procedure )
            int alt11=3;
            switch ( input.LA(1) ) {
                case ID:
                case INT:
                {
                    alt11=1;
                }
                break;
                case ARRAY:
                {
                    alt11=2;
                }
                break;
                case PROCEDURE:
                {
                    alt11=3;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);
                    throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:120:18: typeliste
                {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_typeliste_in_typedeclaration770);
                    typeliste42=typeliste();
                    state._fsp--;

                    adaptor.addChild(root_0, typeliste42.getTree());

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:121:2: 'ARRAY' arraylist
                {
                    string_literal43=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_typedeclaration773);
                    stream_ARRAY.add(string_literal43);

                    pushFollow(FOLLOW_arraylist_in_typedeclaration775);
                    arraylist44=arraylist();
                    state._fsp--;

                    stream_arraylist.add(arraylist44.getTree());
                    // AST REWRITE
                    // elements: arraylist
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 121:19: -> ^( ARRAY arraylist )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:121:21: ^( ARRAY arraylist )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);
                            adaptor.addChild(root_1, stream_arraylist.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:122:2: procedure
                {
                    pushFollow(FOLLOW_procedure_in_typedeclaration784);
                    procedure45=procedure();
                    state._fsp--;

                    stream_procedure.add(procedure45.getTree());
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
                    // 122:11: -> procedure
                    {
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
        return retval;
    }
    // $ANTLR end "typedeclaration"


    public static class typedeclaration2_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "typedeclaration2"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:126:1: typedeclaration2 : ( 'ARRAY' arraylist -> ^( ARRAY arraylist ) | procedure -> procedure );
    public final AlgolParser.typedeclaration2_return typedeclaration2() throws RecognitionException {
        AlgolParser.typedeclaration2_return retval = new AlgolParser.typedeclaration2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal46=null;
        ParserRuleReturnScope arraylist47 =null;
        ParserRuleReturnScope procedure48 =null;

        CommonTree string_literal46_tree=null;
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_arraylist=new RewriteRuleSubtreeStream(adaptor,"rule arraylist");
        RewriteRuleSubtreeStream stream_procedure=new RewriteRuleSubtreeStream(adaptor,"rule procedure");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:126:17: ( 'ARRAY' arraylist -> ^( ARRAY arraylist ) | procedure -> procedure )
            int alt12=2;
            int LA12_0 = input.LA(1);
            if ( (LA12_0==ARRAY) ) {
                alt12=1;
            }
            else if ( (LA12_0==PROCEDURE) ) {
                alt12=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 12, 0, input);
                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:126:18: 'ARRAY' arraylist
                {
                    string_literal46=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_typedeclaration2794);
                    stream_ARRAY.add(string_literal46);

                    pushFollow(FOLLOW_arraylist_in_typedeclaration2796);
                    arraylist47=arraylist();
                    state._fsp--;

                    stream_arraylist.add(arraylist47.getTree());
                    // AST REWRITE
                    // elements: arraylist
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 126:35: -> ^( ARRAY arraylist )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:126:37: ^( ARRAY arraylist )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);
                            adaptor.addChild(root_1, stream_arraylist.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:127:2: procedure
                {
                    pushFollow(FOLLOW_procedure_in_typedeclaration2805);
                    procedure48=procedure();
                    state._fsp--;

                    stream_procedure.add(procedure48.getTree());
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
                    // 127:11: -> procedure
                    {
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
        return retval;
    }
    // $ANTLR end "typedeclaration2"


    public static class switchdec_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "switchdec"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:130:1: switchdec : 'SWITCH' identifier ':=' switchlist -> ^( SWITCH ^( ':=' identifier ^( SWITCHLIST switchlist ) ) ) ;
    public final AlgolParser.switchdec_return switchdec() throws RecognitionException {
        AlgolParser.switchdec_return retval = new AlgolParser.switchdec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal49=null;
        Token string_literal51=null;
        ParserRuleReturnScope identifier50 =null;
        ParserRuleReturnScope switchlist52 =null;

        CommonTree string_literal49_tree=null;
        CommonTree string_literal51_tree=null;
        RewriteRuleTokenStream stream_ASSIGEMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGEMENT");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_switchlist=new RewriteRuleSubtreeStream(adaptor,"rule switchlist");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:131:2: ( 'SWITCH' identifier ':=' switchlist -> ^( SWITCH ^( ':=' identifier ^( SWITCHLIST switchlist ) ) ) )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:131:4: 'SWITCH' identifier ':=' switchlist
            {
                string_literal49=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchdec817);
                stream_SWITCH.add(string_literal49);

                pushFollow(FOLLOW_identifier_in_switchdec819);
                identifier50=identifier();
                state._fsp--;

                stream_identifier.add(identifier50.getTree());
                string_literal51=(Token)match(input,ASSIGEMENT,FOLLOW_ASSIGEMENT_in_switchdec821);
                stream_ASSIGEMENT.add(string_literal51);

                pushFollow(FOLLOW_switchlist_in_switchdec823);
                switchlist52=switchlist();
                state._fsp--;

                stream_switchlist.add(switchlist52.getTree());
                // AST REWRITE
                // elements: identifier, ASSIGEMENT, switchlist
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                root_0 = (CommonTree)adaptor.nil();
                // 131:39: -> ^( SWITCH ^( ':=' identifier ^( SWITCHLIST switchlist ) ) )
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:131:41: ^( SWITCH ^( ':=' identifier ^( SWITCHLIST switchlist ) ) )
                    {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SWITCH, "SWITCH"), root_1);
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:131:50: ^( ':=' identifier ^( SWITCHLIST switchlist ) )
                        {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_ASSIGEMENT.nextNode(), root_2);
                            adaptor.addChild(root_2, stream_identifier.nextTree());
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:131:68: ^( SWITCHLIST switchlist )
                            {
                                CommonTree root_3 = (CommonTree)adaptor.nil();
                                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SWITCHLIST, "SWITCHLIST"), root_3);
                                adaptor.addChild(root_3, stream_switchlist.nextTree());
                                adaptor.addChild(root_2, root_3);
                            }

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
        return retval;
    }
    // $ANTLR end "switchdec"


    public static class switchlist_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "switchlist"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:134:1: switchlist : designExp ( ',' designExp )* -> ( designExp )+ ;
    public final AlgolParser.switchlist_return switchlist() throws RecognitionException {
        AlgolParser.switchlist_return retval = new AlgolParser.switchlist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal54=null;
        ParserRuleReturnScope designExp53 =null;
        ParserRuleReturnScope designExp55 =null;

        CommonTree char_literal54_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_designExp=new RewriteRuleSubtreeStream(adaptor,"rule designExp");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:135:2: ( designExp ( ',' designExp )* -> ( designExp )+ )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:135:5: designExp ( ',' designExp )*
            {
                pushFollow(FOLLOW_designExp_in_switchlist853);
                designExp53=designExp();
                state._fsp--;

                stream_designExp.add(designExp53.getTree());
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:135:15: ( ',' designExp )*
                loop13:
                while (true) {
                    int alt13=2;
                    int LA13_0 = input.LA(1);
                    if ( (LA13_0==70) ) {
                        alt13=1;
                    }

                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:135:16: ',' designExp
                        {
                            char_literal54=(Token)match(input,70,FOLLOW_70_in_switchlist856);
                            stream_70.add(char_literal54);

                            pushFollow(FOLLOW_designExp_in_switchlist857);
                            designExp55=designExp();
                            state._fsp--;

                            stream_designExp.add(designExp55.getTree());
                        }
                        break;

                        default :
                            break loop13;
                    }
                }

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
                // 135:30: -> ( designExp )+
                {
                    if ( !(stream_designExp.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_designExp.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "switchlist"


    public static class procedure_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "procedure"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:138:2: procedure : 'PROCEDURE' procedurehead statement -> ^( PROCEDURE procedurehead statement ) ;
    public final AlgolParser.procedure_return procedure() throws RecognitionException {
        AlgolParser.procedure_return retval = new AlgolParser.procedure_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal56=null;
        ParserRuleReturnScope procedurehead57 =null;
        ParserRuleReturnScope statement58 =null;

        CommonTree string_literal56_tree=null;
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_procedurehead=new RewriteRuleSubtreeStream(adaptor,"rule procedurehead");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:138:11: ( 'PROCEDURE' procedurehead statement -> ^( PROCEDURE procedurehead statement ) )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:138:13: 'PROCEDURE' procedurehead statement
            {
                string_literal56=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedure872);
                stream_PROCEDURE.add(string_literal56);

                pushFollow(FOLLOW_procedurehead_in_procedure874);
                procedurehead57=procedurehead();
                state._fsp--;

                stream_procedurehead.add(procedurehead57.getTree());
                pushFollow(FOLLOW_statement_in_procedure876);
                statement58=statement();
                state._fsp--;

                stream_statement.add(statement58.getTree());
                // AST REWRITE
                // elements: procedurehead, statement
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                root_0 = (CommonTree)adaptor.nil();
                // 138:48: -> ^( PROCEDURE procedurehead statement )
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:138:50: ^( PROCEDURE procedurehead statement )
                    {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE, "PROCEDURE"), root_1);
                        adaptor.addChild(root_1, stream_procedurehead.nextTree());
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
        return retval;
    }
    // $ANTLR end "procedure"


    public static class procedurehead_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "procedurehead"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:141:2: procedurehead : identifier formalparameterpart ';' ! valuepart specificationpart ;
    public final AlgolParser.procedurehead_return procedurehead() throws RecognitionException {
        AlgolParser.procedurehead_return retval = new AlgolParser.procedurehead_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal61=null;
        ParserRuleReturnScope identifier59 =null;
        ParserRuleReturnScope formalparameterpart60 =null;
        ParserRuleReturnScope valuepart62 =null;
        ParserRuleReturnScope specificationpart63 =null;

        CommonTree char_literal61_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:142:3: ( identifier formalparameterpart ';' ! valuepart specificationpart )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:142:5: identifier formalparameterpart ';' ! valuepart specificationpart
            {
                root_0 = (CommonTree)adaptor.nil();


                pushFollow(FOLLOW_identifier_in_procedurehead900);
                identifier59=identifier();
                state._fsp--;

                adaptor.addChild(root_0, identifier59.getTree());

                pushFollow(FOLLOW_formalparameterpart_in_procedurehead902);
                formalparameterpart60=formalparameterpart();
                state._fsp--;

                adaptor.addChild(root_0, formalparameterpart60.getTree());

                char_literal61=(Token)match(input,71,FOLLOW_71_in_procedurehead904);
                pushFollow(FOLLOW_valuepart_in_procedurehead907);
                valuepart62=valuepart();
                state._fsp--;

                adaptor.addChild(root_0, valuepart62.getTree());

                pushFollow(FOLLOW_specificationpart_in_procedurehead909);
                specificationpart63=specificationpart();
                state._fsp--;

                adaptor.addChild(root_0, specificationpart63.getTree());

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
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:145:1: formalparameterpart : (| '(' formalparameterlist ')' ( ID ':' '(' formalparameterlist ')' )* -> ^( LISTPARA formalparameterlist ( formalparameterlist )* ) );
    public final AlgolParser.formalparameterpart_return formalparameterpart() throws RecognitionException {
        AlgolParser.formalparameterpart_return retval = new AlgolParser.formalparameterpart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal64=null;
        Token char_literal66=null;
        Token ID67=null;
        Token char_literal68=null;
        Token char_literal69=null;
        Token char_literal71=null;
        ParserRuleReturnScope formalparameterlist65 =null;
        ParserRuleReturnScope formalparameterlist70 =null;

        CommonTree char_literal64_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree ID67_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree char_literal69_tree=null;
        CommonTree char_literal71_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_formalparameterlist=new RewriteRuleSubtreeStream(adaptor,"rule formalparameterlist");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:145:21: (| '(' formalparameterlist ')' ( ID ':' '(' formalparameterlist ')' )* -> ^( LISTPARA formalparameterlist ( formalparameterlist )* ) )
            int alt15=2;
            int LA15_0 = input.LA(1);
            if ( (LA15_0==71) ) {
                alt15=1;
            }
            else if ( (LA15_0==68) ) {
                alt15=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 15, 0, input);
                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:146:9:
                {
                    root_0 = (CommonTree)adaptor.nil();


                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:146:11: '(' formalparameterlist ')' ( ID ':' '(' formalparameterlist ')' )*
                {
                    char_literal64=(Token)match(input,68,FOLLOW_68_in_formalparameterpart932);
                    stream_68.add(char_literal64);

                    pushFollow(FOLLOW_formalparameterlist_in_formalparameterpart934);
                    formalparameterlist65=formalparameterlist();
                    state._fsp--;

                    stream_formalparameterlist.add(formalparameterlist65.getTree());
                    char_literal66=(Token)match(input,69,FOLLOW_69_in_formalparameterpart936);
                    stream_69.add(char_literal66);

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:146:39: ( ID ':' '(' formalparameterlist ')' )*
                    loop14:
                    while (true) {
                        int alt14=2;
                        int LA14_0 = input.LA(1);
                        if ( (LA14_0==ID) ) {
                            alt14=1;
                        }

                        switch (alt14) {
                            case 1 :
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:146:40: ID ':' '(' formalparameterlist ')'
                            {
                                ID67=(Token)match(input,ID,FOLLOW_ID_in_formalparameterpart939);
                                stream_ID.add(ID67);

                                char_literal68=(Token)match(input,BORNE,FOLLOW_BORNE_in_formalparameterpart941);
                                stream_BORNE.add(char_literal68);

                                char_literal69=(Token)match(input,68,FOLLOW_68_in_formalparameterpart942);
                                stream_68.add(char_literal69);

                                pushFollow(FOLLOW_formalparameterlist_in_formalparameterpart944);
                                formalparameterlist70=formalparameterlist();
                                state._fsp--;

                                stream_formalparameterlist.add(formalparameterlist70.getTree());
                                char_literal71=(Token)match(input,69,FOLLOW_69_in_formalparameterpart946);
                                stream_69.add(char_literal71);

                            }
                            break;

                            default :
                                break loop14;
                        }
                    }

                    // AST REWRITE
                    // elements: formalparameterlist, formalparameterlist
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 146:75: -> ^( LISTPARA formalparameterlist ( formalparameterlist )* )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:146:77: ^( LISTPARA formalparameterlist ( formalparameterlist )* )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTPARA, "LISTPARA"), root_1);
                            adaptor.addChild(root_1, stream_formalparameterlist.nextTree());
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:146:108: ( formalparameterlist )*
                            while ( stream_formalparameterlist.hasNext() ) {
                                adaptor.addChild(root_1, stream_formalparameterlist.nextTree());
                            }
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
        return retval;
    }
    // $ANTLR end "formalparameterpart"


    public static class specificationpart_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "specificationpart"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:149:1: specificationpart : specifier identifierlist ';' ( specifier identifierlist ';' )* -> ^( SPECIFICATION ( specifier identifierlist )+ ) ;
    public final AlgolParser.specificationpart_return specificationpart() throws RecognitionException {
        AlgolParser.specificationpart_return retval = new AlgolParser.specificationpart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal74=null;
        Token char_literal77=null;
        ParserRuleReturnScope specifier72 =null;
        ParserRuleReturnScope identifierlist73 =null;
        ParserRuleReturnScope specifier75 =null;
        ParserRuleReturnScope identifierlist76 =null;

        CommonTree char_literal74_tree=null;
        CommonTree char_literal77_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_specifier=new RewriteRuleSubtreeStream(adaptor,"rule specifier");
        RewriteRuleSubtreeStream stream_identifierlist=new RewriteRuleSubtreeStream(adaptor,"rule identifierlist");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:150:2: ( specifier identifierlist ';' ( specifier identifierlist ';' )* -> ^( SPECIFICATION ( specifier identifierlist )+ ) )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:150:3: specifier identifierlist ';' ( specifier identifierlist ';' )*
            {
                pushFollow(FOLLOW_specifier_in_specificationpart970);
                specifier72=specifier();
                state._fsp--;

                stream_specifier.add(specifier72.getTree());
                pushFollow(FOLLOW_identifierlist_in_specificationpart972);
                identifierlist73=identifierlist();
                state._fsp--;

                stream_identifierlist.add(identifierlist73.getTree());
                char_literal74=(Token)match(input,71,FOLLOW_71_in_specificationpart974);
                stream_71.add(char_literal74);

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:150:32: ( specifier identifierlist ';' )*
                loop16:
                while (true) {
                    int alt16=2;
                    int LA16_0 = input.LA(1);
                    if ( (LA16_0==ARRAY||LA16_0==LABEL||LA16_0==PROCEDURE||(LA16_0 >= STRING && LA16_0 <= SWITCH)||(LA16_0 >= TYPEBOOL && LA16_0 <= TYPEREAL)) ) {
                        alt16=1;
                    }

                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:150:33: specifier identifierlist ';'
                        {
                            pushFollow(FOLLOW_specifier_in_specificationpart977);
                            specifier75=specifier();
                            state._fsp--;

                            stream_specifier.add(specifier75.getTree());
                            pushFollow(FOLLOW_identifierlist_in_specificationpart979);
                            identifierlist76=identifierlist();
                            state._fsp--;

                            stream_identifierlist.add(identifierlist76.getTree());
                            char_literal77=(Token)match(input,71,FOLLOW_71_in_specificationpart981);
                            stream_71.add(char_literal77);

                        }
                        break;

                        default :
                            break loop16;
                    }
                }

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
                // 150:63: -> ^( SPECIFICATION ( specifier identifierlist )+ )
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:150:65: ^( SPECIFICATION ( specifier identifierlist )+ )
                    {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPECIFICATION, "SPECIFICATION"), root_1);
                        if ( !(stream_specifier.hasNext()||stream_identifierlist.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_specifier.hasNext()||stream_identifierlist.hasNext() ) {
                            adaptor.addChild(root_1, stream_specifier.nextTree());
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
        return retval;
    }
    // $ANTLR end "specificationpart"


    public static class identifierlist_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "identifierlist"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:153:1: identifierlist : identifier ( ',' identifier )* -> ( identifier )+ ;
    public final AlgolParser.identifierlist_return identifierlist() throws RecognitionException {
        AlgolParser.identifierlist_return retval = new AlgolParser.identifierlist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal79=null;
        ParserRuleReturnScope identifier78 =null;
        ParserRuleReturnScope identifier80 =null;

        CommonTree char_literal79_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:154:2: ( identifier ( ',' identifier )* -> ( identifier )+ )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:154:4: identifier ( ',' identifier )*
            {
                pushFollow(FOLLOW_identifier_in_identifierlist1006);
                identifier78=identifier();
                state._fsp--;

                stream_identifier.add(identifier78.getTree());
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:154:15: ( ',' identifier )*
                loop17:
                while (true) {
                    int alt17=2;
                    int LA17_0 = input.LA(1);
                    if ( (LA17_0==70) ) {
                        alt17=1;
                    }

                    switch (alt17) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:154:16: ',' identifier
                        {
                            char_literal79=(Token)match(input,70,FOLLOW_70_in_identifierlist1009);
                            stream_70.add(char_literal79);

                            pushFollow(FOLLOW_identifier_in_identifierlist1010);
                            identifier80=identifier();
                            state._fsp--;

                            stream_identifier.add(identifier80.getTree());
                        }
                        break;

                        default :
                            break loop17;
                    }
                }

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
                // 154:31: -> ( identifier )+
                {
                    if ( !(stream_identifier.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_identifier.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "identifierlist"


    public static class specifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "specifier"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:157:1: specifier : ( STRING | type specifierType -> type | ARRAY | LABEL | SWITCH | PROCEDURE );
    public final AlgolParser.specifier_return specifier() throws RecognitionException {
        AlgolParser.specifier_return retval = new AlgolParser.specifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STRING81=null;
        Token ARRAY84=null;
        Token LABEL85=null;
        Token SWITCH86=null;
        Token PROCEDURE87=null;
        ParserRuleReturnScope type82 =null;
        ParserRuleReturnScope specifierType83 =null;

        CommonTree STRING81_tree=null;
        CommonTree ARRAY84_tree=null;
        CommonTree LABEL85_tree=null;
        CommonTree SWITCH86_tree=null;
        CommonTree PROCEDURE87_tree=null;
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_specifierType=new RewriteRuleSubtreeStream(adaptor,"rule specifierType");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:158:2: ( STRING | type specifierType -> type | ARRAY | LABEL | SWITCH | PROCEDURE )
            int alt18=6;
            switch ( input.LA(1) ) {
                case STRING:
                {
                    alt18=1;
                }
                break;
                case TYPEBOOL:
                case TYPEINT:
                case TYPEREAL:
                {
                    alt18=2;
                }
                break;
                case ARRAY:
                {
                    alt18=3;
                }
                break;
                case LABEL:
                {
                    alt18=4;
                }
                break;
                case SWITCH:
                {
                    alt18=5;
                }
                break;
                case PROCEDURE:
                {
                    alt18=6;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);
                    throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:158:3: STRING
                {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING81=(Token)match(input,STRING,FOLLOW_STRING_in_specifier1026);
                    STRING81_tree = (CommonTree)adaptor.create(STRING81);
                    adaptor.addChild(root_0, STRING81_tree);

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:159:4: type specifierType
                {
                    pushFollow(FOLLOW_type_in_specifier1032);
                    type82=type();
                    state._fsp--;

                    stream_type.add(type82.getTree());
                    pushFollow(FOLLOW_specifierType_in_specifier1035);
                    specifierType83=specifierType();
                    state._fsp--;

                    stream_specifierType.add(specifierType83.getTree());
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
                    // 159:23: -> type
                    {
                        adaptor.addChild(root_0, stream_type.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:160:4: ARRAY
                {
                    root_0 = (CommonTree)adaptor.nil();


                    ARRAY84=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_specifier1042);
                    ARRAY84_tree = (CommonTree)adaptor.create(ARRAY84);
                    adaptor.addChild(root_0, ARRAY84_tree);

                }
                break;
                case 4 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:161:4: LABEL
                {
                    root_0 = (CommonTree)adaptor.nil();


                    LABEL85=(Token)match(input,LABEL,FOLLOW_LABEL_in_specifier1047);
                    LABEL85_tree = (CommonTree)adaptor.create(LABEL85);
                    adaptor.addChild(root_0, LABEL85_tree);

                }
                break;
                case 5 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:162:4: SWITCH
                {
                    root_0 = (CommonTree)adaptor.nil();


                    SWITCH86=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_specifier1052);
                    SWITCH86_tree = (CommonTree)adaptor.create(SWITCH86);
                    adaptor.addChild(root_0, SWITCH86_tree);

                }
                break;
                case 6 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:163:4: PROCEDURE
                {
                    root_0 = (CommonTree)adaptor.nil();


                    PROCEDURE87=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_specifier1058);
                    PROCEDURE87_tree = (CommonTree)adaptor.create(PROCEDURE87);
                    adaptor.addChild(root_0, PROCEDURE87_tree);

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


    public static class specifierType_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "specifierType"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:166:1: specifierType : (| ARRAY | PROCEDURE );
    public final AlgolParser.specifierType_return specifierType() throws RecognitionException {
        AlgolParser.specifierType_return retval = new AlgolParser.specifierType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARRAY88=null;
        Token PROCEDURE89=null;

        CommonTree ARRAY88_tree=null;
        CommonTree PROCEDURE89_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:166:15: (| ARRAY | PROCEDURE )
            int alt19=3;
            switch ( input.LA(1) ) {
                case ID:
                case INT:
                {
                    alt19=1;
                }
                break;
                case ARRAY:
                {
                    alt19=2;
                }
                break;
                case PROCEDURE:
                {
                    alt19=3;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);
                    throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:167:2:
                {
                    root_0 = (CommonTree)adaptor.nil();


                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:167:4: ARRAY
                {
                    root_0 = (CommonTree)adaptor.nil();


                    ARRAY88=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_specifierType1073);
                    ARRAY88_tree = (CommonTree)adaptor.create(ARRAY88);
                    adaptor.addChild(root_0, ARRAY88_tree);

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:168:4: PROCEDURE
                {
                    root_0 = (CommonTree)adaptor.nil();


                    PROCEDURE89=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_specifierType1078);
                    PROCEDURE89_tree = (CommonTree)adaptor.create(PROCEDURE89);
                    adaptor.addChild(root_0, PROCEDURE89_tree);

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
    // $ANTLR end "specifierType"


    public static class formalparameterlist_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "formalparameterlist"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:171:1: formalparameterlist : formalpara ( ',' formalpara )* -> ( formalpara )+ ;
    public final AlgolParser.formalparameterlist_return formalparameterlist() throws RecognitionException {
        AlgolParser.formalparameterlist_return retval = new AlgolParser.formalparameterlist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal91=null;
        ParserRuleReturnScope formalpara90 =null;
        ParserRuleReturnScope formalpara92 =null;

        CommonTree char_literal91_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_formalpara=new RewriteRuleSubtreeStream(adaptor,"rule formalpara");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:172:2: ( formalpara ( ',' formalpara )* -> ( formalpara )+ )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:172:4: formalpara ( ',' formalpara )*
            {
                pushFollow(FOLLOW_formalpara_in_formalparameterlist1090);
                formalpara90=formalpara();
                state._fsp--;

                stream_formalpara.add(formalpara90.getTree());
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:172:15: ( ',' formalpara )*
                loop20:
                while (true) {
                    int alt20=2;
                    int LA20_0 = input.LA(1);
                    if ( (LA20_0==70) ) {
                        alt20=1;
                    }

                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:172:16: ',' formalpara
                        {
                            char_literal91=(Token)match(input,70,FOLLOW_70_in_formalparameterlist1093);
                            stream_70.add(char_literal91);

                            pushFollow(FOLLOW_formalpara_in_formalparameterlist1095);
                            formalpara92=formalpara();
                            state._fsp--;

                            stream_formalpara.add(formalpara92.getTree());
                        }
                        break;

                        default :
                            break loop20;
                    }
                }

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
                // 172:32: -> ( formalpara )+
                {
                    if ( !(stream_formalpara.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_formalpara.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "formalparameterlist"


    public static class formalpara_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "formalpara"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:175:1: formalpara : expression2 -> expression2 ;
    public final AlgolParser.formalpara_return formalpara() throws RecognitionException {
        AlgolParser.formalpara_return retval = new AlgolParser.formalpara_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ParserRuleReturnScope expression293 =null;

        RewriteRuleSubtreeStream stream_expression2=new RewriteRuleSubtreeStream(adaptor,"rule expression2");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:176:2: ( expression2 -> expression2 )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:176:4: expression2
            {
                pushFollow(FOLLOW_expression2_in_formalpara1111);
                expression293=expression2();
                state._fsp--;

                stream_expression2.add(expression293.getTree());
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
                // 176:15: -> expression2
                {
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
        return retval;
    }
    // $ANTLR end "formalpara"


    public static class valuepart_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "valuepart"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:179:1: valuepart : ( 'VALUE' identifier2 ';' -> ^( VALUE identifier2 ) |);
    public final AlgolParser.valuepart_return valuepart() throws RecognitionException {
        AlgolParser.valuepart_return retval = new AlgolParser.valuepart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal94=null;
        Token char_literal96=null;
        ParserRuleReturnScope identifier295 =null;

        CommonTree string_literal94_tree=null;
        CommonTree char_literal96_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_identifier2=new RewriteRuleSubtreeStream(adaptor,"rule identifier2");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:179:11: ( 'VALUE' identifier2 ';' -> ^( VALUE identifier2 ) |)
            int alt21=2;
            int LA21_0 = input.LA(1);
            if ( (LA21_0==72) ) {
                alt21=1;
            }
            else if ( (LA21_0==ARRAY||LA21_0==LABEL||LA21_0==PROCEDURE||(LA21_0 >= STRING && LA21_0 <= SWITCH)||(LA21_0 >= TYPEBOOL && LA21_0 <= TYPEREAL)) ) {
                alt21=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 21, 0, input);
                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:179:12: 'VALUE' identifier2 ';'
                {
                    string_literal94=(Token)match(input,72,FOLLOW_72_in_valuepart1123);
                    stream_72.add(string_literal94);

                    pushFollow(FOLLOW_identifier2_in_valuepart1125);
                    identifier295=identifier2();
                    state._fsp--;

                    stream_identifier2.add(identifier295.getTree());
                    char_literal96=(Token)match(input,71,FOLLOW_71_in_valuepart1127);
                    stream_71.add(char_literal96);

                    // AST REWRITE
                    // elements: identifier2
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 179:35: -> ^( VALUE identifier2 )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:179:37: ^( VALUE identifier2 )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "VALUE"), root_1);
                            adaptor.addChild(root_1, stream_identifier2.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:181:2:
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
    // $ANTLR end "valuepart"


    public static class identifier2_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "identifier2"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:183:1: identifier2 : ID ( ',' ID )* -> ( ID )* ;
    public final AlgolParser.identifier2_return identifier2() throws RecognitionException {
        AlgolParser.identifier2_return retval = new AlgolParser.identifier2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID97=null;
        Token char_literal98=null;
        Token ID99=null;

        CommonTree ID97_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree ID99_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:183:15: ( ID ( ',' ID )* -> ( ID )* )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:183:17: ID ( ',' ID )*
            {
                ID97=(Token)match(input,ID,FOLLOW_ID_in_identifier21157);
                stream_ID.add(ID97);

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:183:19: ( ',' ID )*
                loop22:
                while (true) {
                    int alt22=2;
                    int LA22_0 = input.LA(1);
                    if ( (LA22_0==70) ) {
                        alt22=1;
                    }

                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:183:20: ',' ID
                        {
                            char_literal98=(Token)match(input,70,FOLLOW_70_in_identifier21159);
                            stream_70.add(char_literal98);

                            ID99=(Token)match(input,ID,FOLLOW_ID_in_identifier21160);
                            stream_ID.add(ID99);

                        }
                        break;

                        default :
                            break loop22;
                    }
                }

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
                // 183:27: -> ( ID )*
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:183:29: ( ID )*
                    while ( stream_ID.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "identifier2"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:186:1: expression : ( simpleOp -> simpleOp | 'IF' expression 'THEN' simpleDesign 'ELSE' expression -> ^( IF expression ^( THEN simpleDesign ) ^( ELSE expression ) ) );
    public final AlgolParser.expression_return expression() throws RecognitionException {
        AlgolParser.expression_return retval = new AlgolParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal101=null;
        Token string_literal103=null;
        Token string_literal105=null;
        ParserRuleReturnScope simpleOp100 =null;
        ParserRuleReturnScope expression102 =null;
        ParserRuleReturnScope simpleDesign104 =null;
        ParserRuleReturnScope expression106 =null;

        CommonTree string_literal101_tree=null;
        CommonTree string_literal103_tree=null;
        CommonTree string_literal105_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_simpleOp=new RewriteRuleSubtreeStream(adaptor,"rule simpleOp");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_simpleDesign=new RewriteRuleSubtreeStream(adaptor,"rule simpleDesign");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:187:2: ( simpleOp -> simpleOp | 'IF' expression 'THEN' simpleDesign 'ELSE' expression -> ^( IF expression ^( THEN simpleDesign ) ^( ELSE expression ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);
            if ( (LA23_0==AND||LA23_0==ASSIGEMENT||LA23_0==BORNE||(LA23_0 >= DIV && LA23_0 <= EQUIV)||(LA23_0 >= FALSE && LA23_0 <= FLOAT)||LA23_0==GREATER||LA23_0==ID||(LA23_0 >= IMPL && LA23_0 <= INT)||LA23_0==LESS||(LA23_0 >= MINUS && LA23_0 <= NOTLESS)||LA23_0==OR||(LA23_0 >= PAS && LA23_0 <= POWER)||LA23_0==STRING||(LA23_0 >= THEN && LA23_0 <= TRUE)||LA23_0==UNTIL||LA23_0==WHILE||(LA23_0 >= 68 && LA23_0 <= 71)||LA23_0==74) ) {
                alt23=1;
            }
            else if ( (LA23_0==IF) ) {
                alt23=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 23, 0, input);
                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:187:4: simpleOp
                {
                    pushFollow(FOLLOW_simpleOp_in_expression1177);
                    simpleOp100=simpleOp();
                    state._fsp--;

                    stream_simpleOp.add(simpleOp100.getTree());
                    // AST REWRITE
                    // elements: simpleOp
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 187:13: -> simpleOp
                    {
                        adaptor.addChild(root_0, stream_simpleOp.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:188:5: 'IF' expression 'THEN' simpleDesign 'ELSE' expression
                {
                    string_literal101=(Token)match(input,IF,FOLLOW_IF_in_expression1186);
                    stream_IF.add(string_literal101);

                    pushFollow(FOLLOW_expression_in_expression1188);
                    expression102=expression();
                    state._fsp--;

                    stream_expression.add(expression102.getTree());
                    string_literal103=(Token)match(input,THEN,FOLLOW_THEN_in_expression1190);
                    stream_THEN.add(string_literal103);

                    pushFollow(FOLLOW_simpleDesign_in_expression1192);
                    simpleDesign104=simpleDesign();
                    state._fsp--;

                    stream_simpleDesign.add(simpleDesign104.getTree());
                    string_literal105=(Token)match(input,ELSE,FOLLOW_ELSE_in_expression1194);
                    stream_ELSE.add(string_literal105);

                    pushFollow(FOLLOW_expression_in_expression1196);
                    expression106=expression();
                    state._fsp--;

                    stream_expression.add(expression106.getTree());
                    // AST REWRITE
                    // elements: simpleDesign, expression, expression
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 188:58: -> ^( IF expression ^( THEN simpleDesign ) ^( ELSE expression ) )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:188:60: ^( IF expression ^( THEN simpleDesign ) ^( ELSE expression ) )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);
                            adaptor.addChild(root_1, stream_expression.nextTree());
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:188:76: ^( THEN simpleDesign )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THEN, "THEN"), root_2);
                                adaptor.addChild(root_2, stream_simpleDesign.nextTree());
                                adaptor.addChild(root_1, root_2);
                            }

                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:188:96: ^( ELSE expression )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE, "ELSE"), root_2);
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


    public static class simpleOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "simpleOp"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:193:1: simpleOp : simpleLogEquiv ( ':=' ^ simpleLogAndOr )* ;
    public final AlgolParser.simpleOp_return simpleOp() throws RecognitionException {
        AlgolParser.simpleOp_return retval = new AlgolParser.simpleOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal108=null;
        ParserRuleReturnScope simpleLogEquiv107 =null;
        ParserRuleReturnScope simpleLogAndOr109 =null;

        CommonTree string_literal108_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:193:9: ( simpleLogEquiv ( ':=' ^ simpleLogAndOr )* )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:193:11: simpleLogEquiv ( ':=' ^ simpleLogAndOr )*
            {
                root_0 = (CommonTree)adaptor.nil();


                pushFollow(FOLLOW_simpleLogEquiv_in_simpleOp1225);
                simpleLogEquiv107=simpleLogEquiv();
                state._fsp--;

                adaptor.addChild(root_0, simpleLogEquiv107.getTree());

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:193:25: ( ':=' ^ simpleLogAndOr )*
                loop24:
                while (true) {
                    int alt24=2;
                    int LA24_0 = input.LA(1);
                    if ( (LA24_0==ASSIGEMENT) ) {
                        alt24=1;
                    }

                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:193:26: ':=' ^ simpleLogAndOr
                        {
                            string_literal108=(Token)match(input,ASSIGEMENT,FOLLOW_ASSIGEMENT_in_simpleOp1227);
                            string_literal108_tree = (CommonTree)adaptor.create(string_literal108);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal108_tree, root_0);

                            pushFollow(FOLLOW_simpleLogAndOr_in_simpleOp1230);
                            simpleLogAndOr109=simpleLogAndOr();
                            state._fsp--;

                            adaptor.addChild(root_0, simpleLogAndOr109.getTree());

                        }
                        break;

                        default :
                            break loop24;
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
    // $ANTLR end "simpleOp"


    public static class simpleLogEquiv_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "simpleLogEquiv"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:196:1: simpleLogEquiv : simpleLogImplication ( EQUIV ^ simpleLogImplication )* ;
    public final AlgolParser.simpleLogEquiv_return simpleLogEquiv() throws RecognitionException {
        AlgolParser.simpleLogEquiv_return retval = new AlgolParser.simpleLogEquiv_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUIV111=null;
        ParserRuleReturnScope simpleLogImplication110 =null;
        ParserRuleReturnScope simpleLogImplication112 =null;

        CommonTree EQUIV111_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:197:2: ( simpleLogImplication ( EQUIV ^ simpleLogImplication )* )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:197:4: simpleLogImplication ( EQUIV ^ simpleLogImplication )*
            {
                root_0 = (CommonTree)adaptor.nil();


                pushFollow(FOLLOW_simpleLogImplication_in_simpleLogEquiv1244);
                simpleLogImplication110=simpleLogImplication();
                state._fsp--;

                adaptor.addChild(root_0, simpleLogImplication110.getTree());

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:197:24: ( EQUIV ^ simpleLogImplication )*
                loop25:
                while (true) {
                    int alt25=2;
                    int LA25_0 = input.LA(1);
                    if ( (LA25_0==EQUIV) ) {
                        alt25=1;
                    }

                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:197:25: EQUIV ^ simpleLogImplication
                        {
                            EQUIV111=(Token)match(input,EQUIV,FOLLOW_EQUIV_in_simpleLogEquiv1246);
                            EQUIV111_tree = (CommonTree)adaptor.create(EQUIV111);
                            root_0 = (CommonTree)adaptor.becomeRoot(EQUIV111_tree, root_0);

                            pushFollow(FOLLOW_simpleLogImplication_in_simpleLogEquiv1249);
                            simpleLogImplication112=simpleLogImplication();
                            state._fsp--;

                            adaptor.addChild(root_0, simpleLogImplication112.getTree());

                        }
                        break;

                        default :
                            break loop25;
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
    // $ANTLR end "simpleLogEquiv"


    public static class simpleLogImplication_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "simpleLogImplication"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:200:1: simpleLogImplication : simpleLogAndOr ( IMPL ^ simpleLogAndOr )* ;
    public final AlgolParser.simpleLogImplication_return simpleLogImplication() throws RecognitionException {
        AlgolParser.simpleLogImplication_return retval = new AlgolParser.simpleLogImplication_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IMPL114=null;
        ParserRuleReturnScope simpleLogAndOr113 =null;
        ParserRuleReturnScope simpleLogAndOr115 =null;

        CommonTree IMPL114_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:201:2: ( simpleLogAndOr ( IMPL ^ simpleLogAndOr )* )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:201:4: simpleLogAndOr ( IMPL ^ simpleLogAndOr )*
            {
                root_0 = (CommonTree)adaptor.nil();


                pushFollow(FOLLOW_simpleLogAndOr_in_simpleLogImplication1263);
                simpleLogAndOr113=simpleLogAndOr();
                state._fsp--;

                adaptor.addChild(root_0, simpleLogAndOr113.getTree());

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:201:18: ( IMPL ^ simpleLogAndOr )*
                loop26:
                while (true) {
                    int alt26=2;
                    int LA26_0 = input.LA(1);
                    if ( (LA26_0==IMPL) ) {
                        alt26=1;
                    }

                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:201:19: IMPL ^ simpleLogAndOr
                        {
                            IMPL114=(Token)match(input,IMPL,FOLLOW_IMPL_in_simpleLogImplication1265);
                            IMPL114_tree = (CommonTree)adaptor.create(IMPL114);
                            root_0 = (CommonTree)adaptor.becomeRoot(IMPL114_tree, root_0);

                            pushFollow(FOLLOW_simpleLogAndOr_in_simpleLogImplication1268);
                            simpleLogAndOr115=simpleLogAndOr();
                            state._fsp--;

                            adaptor.addChild(root_0, simpleLogAndOr115.getTree());

                        }
                        break;

                        default :
                            break loop26;
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
    // $ANTLR end "simpleLogImplication"


    public static class simpleLogAndOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "simpleLogAndOr"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:204:1: simpleLogAndOr : simpleLog ( ( AND ^| OR ^) simpleLog )* ;
    public final AlgolParser.simpleLogAndOr_return simpleLogAndOr() throws RecognitionException {
        AlgolParser.simpleLogAndOr_return retval = new AlgolParser.simpleLogAndOr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND117=null;
        Token OR118=null;
        ParserRuleReturnScope simpleLog116 =null;
        ParserRuleReturnScope simpleLog119 =null;

        CommonTree AND117_tree=null;
        CommonTree OR118_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:205:2: ( simpleLog ( ( AND ^| OR ^) simpleLog )* )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:205:4: simpleLog ( ( AND ^| OR ^) simpleLog )*
            {
                root_0 = (CommonTree)adaptor.nil();


                pushFollow(FOLLOW_simpleLog_in_simpleLogAndOr1282);
                simpleLog116=simpleLog();
                state._fsp--;

                adaptor.addChild(root_0, simpleLog116.getTree());

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:205:13: ( ( AND ^| OR ^) simpleLog )*
                loop28:
                while (true) {
                    int alt28=2;
                    int LA28_0 = input.LA(1);
                    if ( (LA28_0==AND||LA28_0==OR) ) {
                        alt28=1;
                    }

                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:205:14: ( AND ^| OR ^) simpleLog
                        {
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:205:14: ( AND ^| OR ^)
                            int alt27=2;
                            int LA27_0 = input.LA(1);
                            if ( (LA27_0==AND) ) {
                                alt27=1;
                            }
                            else if ( (LA27_0==OR) ) {
                                alt27=2;
                            }

                            else {
                                NoViableAltException nvae =
                                        new NoViableAltException("", 27, 0, input);
                                throw nvae;
                            }

                            switch (alt27) {
                                case 1 :
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:205:15: AND ^
                                {
                                    AND117=(Token)match(input,AND,FOLLOW_AND_in_simpleLogAndOr1285);
                                    AND117_tree = (CommonTree)adaptor.create(AND117);
                                    root_0 = (CommonTree)adaptor.becomeRoot(AND117_tree, root_0);

                                }
                                break;
                                case 2 :
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:205:20: OR ^
                                {
                                    OR118=(Token)match(input,OR,FOLLOW_OR_in_simpleLogAndOr1288);
                                    OR118_tree = (CommonTree)adaptor.create(OR118);
                                    root_0 = (CommonTree)adaptor.becomeRoot(OR118_tree, root_0);

                                }
                                break;

                            }

                            pushFollow(FOLLOW_simpleLog_in_simpleLogAndOr1291);
                            simpleLog119=simpleLog();
                            state._fsp--;

                            adaptor.addChild(root_0, simpleLog119.getTree());

                        }
                        break;

                        default :
                            break loop28;
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
    // $ANTLR end "simpleLogAndOr"


    public static class simpleLog_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "simpleLog"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:208:1: simpleLog : simpleAr ( ( GREATER ^| LESS ^| EQUAL ^| NOTLESS ^| NOTGREATER ^| NOTEQUAL ^) simpleAr )* ;
    public final AlgolParser.simpleLog_return simpleLog() throws RecognitionException {
        AlgolParser.simpleLog_return retval = new AlgolParser.simpleLog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GREATER121=null;
        Token LESS122=null;
        Token EQUAL123=null;
        Token NOTLESS124=null;
        Token NOTGREATER125=null;
        Token NOTEQUAL126=null;
        ParserRuleReturnScope simpleAr120 =null;
        ParserRuleReturnScope simpleAr127 =null;

        CommonTree GREATER121_tree=null;
        CommonTree LESS122_tree=null;
        CommonTree EQUAL123_tree=null;
        CommonTree NOTLESS124_tree=null;
        CommonTree NOTGREATER125_tree=null;
        CommonTree NOTEQUAL126_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:209:2: ( simpleAr ( ( GREATER ^| LESS ^| EQUAL ^| NOTLESS ^| NOTGREATER ^| NOTEQUAL ^) simpleAr )* )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:209:4: simpleAr ( ( GREATER ^| LESS ^| EQUAL ^| NOTLESS ^| NOTGREATER ^| NOTEQUAL ^) simpleAr )*
            {
                root_0 = (CommonTree)adaptor.nil();


                pushFollow(FOLLOW_simpleAr_in_simpleLog1305);
                simpleAr120=simpleAr();
                state._fsp--;

                adaptor.addChild(root_0, simpleAr120.getTree());

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:209:12: ( ( GREATER ^| LESS ^| EQUAL ^| NOTLESS ^| NOTGREATER ^| NOTEQUAL ^) simpleAr )*
                loop30:
                while (true) {
                    int alt30=2;
                    int LA30_0 = input.LA(1);
                    if ( (LA30_0==EQUAL||LA30_0==GREATER||LA30_0==LESS||(LA30_0 >= NOTEQUAL && LA30_0 <= NOTLESS)) ) {
                        alt30=1;
                    }

                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:209:13: ( GREATER ^| LESS ^| EQUAL ^| NOTLESS ^| NOTGREATER ^| NOTEQUAL ^) simpleAr
                        {
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:209:13: ( GREATER ^| LESS ^| EQUAL ^| NOTLESS ^| NOTGREATER ^| NOTEQUAL ^)
                            int alt29=6;
                            switch ( input.LA(1) ) {
                                case GREATER:
                                {
                                    alt29=1;
                                }
                                break;
                                case LESS:
                                {
                                    alt29=2;
                                }
                                break;
                                case EQUAL:
                                {
                                    alt29=3;
                                }
                                break;
                                case NOTLESS:
                                {
                                    alt29=4;
                                }
                                break;
                                case NOTGREATER:
                                {
                                    alt29=5;
                                }
                                break;
                                case NOTEQUAL:
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
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:209:14: GREATER ^
                                {
                                    GREATER121=(Token)match(input,GREATER,FOLLOW_GREATER_in_simpleLog1308);
                                    GREATER121_tree = (CommonTree)adaptor.create(GREATER121);
                                    root_0 = (CommonTree)adaptor.becomeRoot(GREATER121_tree, root_0);

                                }
                                break;
                                case 2 :
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:209:23: LESS ^
                                {
                                    LESS122=(Token)match(input,LESS,FOLLOW_LESS_in_simpleLog1311);
                                    LESS122_tree = (CommonTree)adaptor.create(LESS122);
                                    root_0 = (CommonTree)adaptor.becomeRoot(LESS122_tree, root_0);

                                }
                                break;
                                case 3 :
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:209:29: EQUAL ^
                                {
                                    EQUAL123=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_simpleLog1314);
                                    EQUAL123_tree = (CommonTree)adaptor.create(EQUAL123);
                                    root_0 = (CommonTree)adaptor.becomeRoot(EQUAL123_tree, root_0);

                                }
                                break;
                                case 4 :
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:209:36: NOTLESS ^
                                {
                                    NOTLESS124=(Token)match(input,NOTLESS,FOLLOW_NOTLESS_in_simpleLog1317);
                                    NOTLESS124_tree = (CommonTree)adaptor.create(NOTLESS124);
                                    root_0 = (CommonTree)adaptor.becomeRoot(NOTLESS124_tree, root_0);

                                }
                                break;
                                case 5 :
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:209:45: NOTGREATER ^
                                {
                                    NOTGREATER125=(Token)match(input,NOTGREATER,FOLLOW_NOTGREATER_in_simpleLog1320);
                                    NOTGREATER125_tree = (CommonTree)adaptor.create(NOTGREATER125);
                                    root_0 = (CommonTree)adaptor.becomeRoot(NOTGREATER125_tree, root_0);

                                }
                                break;
                                case 6 :
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:209:57: NOTEQUAL ^
                                {
                                    NOTEQUAL126=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_simpleLog1323);
                                    NOTEQUAL126_tree = (CommonTree)adaptor.create(NOTEQUAL126);
                                    root_0 = (CommonTree)adaptor.becomeRoot(NOTEQUAL126_tree, root_0);

                                }
                                break;

                            }

                            pushFollow(FOLLOW_simpleAr_in_simpleLog1326);
                            simpleAr127=simpleAr();
                            state._fsp--;

                            adaptor.addChild(root_0, simpleAr127.getTree());

                        }
                        break;

                        default :
                            break loop30;
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
    // $ANTLR end "simpleLog"


    public static class simpleAr_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "simpleAr"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:214:1: simpleAr : multExp ( ( PLUS ^| MINUS ^) multExp )* ;
    public final AlgolParser.simpleAr_return simpleAr() throws RecognitionException {
        AlgolParser.simpleAr_return retval = new AlgolParser.simpleAr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS129=null;
        Token MINUS130=null;
        ParserRuleReturnScope multExp128 =null;
        ParserRuleReturnScope multExp131 =null;

        CommonTree PLUS129_tree=null;
        CommonTree MINUS130_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:214:9: ( multExp ( ( PLUS ^| MINUS ^) multExp )* )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:214:11: multExp ( ( PLUS ^| MINUS ^) multExp )*
            {
                root_0 = (CommonTree)adaptor.nil();


                pushFollow(FOLLOW_multExp_in_simpleAr1341);
                multExp128=multExp();
                state._fsp--;

                adaptor.addChild(root_0, multExp128.getTree());

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:214:18: ( ( PLUS ^| MINUS ^) multExp )*
                loop32:
                while (true) {
                    int alt32=2;
                    int LA32_0 = input.LA(1);
                    if ( (LA32_0==MINUS||LA32_0==PLUS) ) {
                        alt32=1;
                    }

                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:214:19: ( PLUS ^| MINUS ^) multExp
                        {
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:214:19: ( PLUS ^| MINUS ^)
                            int alt31=2;
                            int LA31_0 = input.LA(1);
                            if ( (LA31_0==PLUS) ) {
                                alt31=1;
                            }
                            else if ( (LA31_0==MINUS) ) {
                                alt31=2;
                            }

                            else {
                                NoViableAltException nvae =
                                        new NoViableAltException("", 31, 0, input);
                                throw nvae;
                            }

                            switch (alt31) {
                                case 1 :
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:214:20: PLUS ^
                                {
                                    PLUS129=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleAr1344);
                                    PLUS129_tree = (CommonTree)adaptor.create(PLUS129);
                                    root_0 = (CommonTree)adaptor.becomeRoot(PLUS129_tree, root_0);

                                }
                                break;
                                case 2 :
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:214:26: MINUS ^
                                {
                                    MINUS130=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleAr1347);
                                    MINUS130_tree = (CommonTree)adaptor.create(MINUS130);
                                    root_0 = (CommonTree)adaptor.becomeRoot(MINUS130_tree, root_0);

                                }
                                break;

                            }

                            pushFollow(FOLLOW_multExp_in_simpleAr1351);
                            multExp131=multExp();
                            state._fsp--;

                            adaptor.addChild(root_0, multExp131.getTree());

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
    // $ANTLR end "simpleAr"


    public static class multExp_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "multExp"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:217:1: multExp : multExpPower ( ( MULT ^| DIV ^) multExpPower )* ;
    public final AlgolParser.multExp_return multExp() throws RecognitionException {
        AlgolParser.multExp_return retval = new AlgolParser.multExp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MULT133=null;
        Token DIV134=null;
        ParserRuleReturnScope multExpPower132 =null;
        ParserRuleReturnScope multExpPower135 =null;

        CommonTree MULT133_tree=null;
        CommonTree DIV134_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:217:8: ( multExpPower ( ( MULT ^| DIV ^) multExpPower )* )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:217:10: multExpPower ( ( MULT ^| DIV ^) multExpPower )*
            {
                root_0 = (CommonTree)adaptor.nil();


                pushFollow(FOLLOW_multExpPower_in_multExp1362);
                multExpPower132=multExpPower();
                state._fsp--;

                adaptor.addChild(root_0, multExpPower132.getTree());

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:217:22: ( ( MULT ^| DIV ^) multExpPower )*
                loop34:
                while (true) {
                    int alt34=2;
                    int LA34_0 = input.LA(1);
                    if ( (LA34_0==DIV||LA34_0==MULT) ) {
                        alt34=1;
                    }

                    switch (alt34) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:217:23: ( MULT ^| DIV ^) multExpPower
                        {
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:217:23: ( MULT ^| DIV ^)
                            int alt33=2;
                            int LA33_0 = input.LA(1);
                            if ( (LA33_0==MULT) ) {
                                alt33=1;
                            }
                            else if ( (LA33_0==DIV) ) {
                                alt33=2;
                            }

                            else {
                                NoViableAltException nvae =
                                        new NoViableAltException("", 33, 0, input);
                                throw nvae;
                            }

                            switch (alt33) {
                                case 1 :
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:217:24: MULT ^
                                {
                                    MULT133=(Token)match(input,MULT,FOLLOW_MULT_in_multExp1365);
                                    MULT133_tree = (CommonTree)adaptor.create(MULT133);
                                    root_0 = (CommonTree)adaptor.becomeRoot(MULT133_tree, root_0);

                                }
                                break;
                                case 2 :
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:217:30: DIV ^
                                {
                                    DIV134=(Token)match(input,DIV,FOLLOW_DIV_in_multExp1368);
                                    DIV134_tree = (CommonTree)adaptor.create(DIV134);
                                    root_0 = (CommonTree)adaptor.becomeRoot(DIV134_tree, root_0);

                                }
                                break;

                            }

                            pushFollow(FOLLOW_multExpPower_in_multExp1371);
                            multExpPower135=multExpPower();
                            state._fsp--;

                            adaptor.addChild(root_0, multExpPower135.getTree());

                        }
                        break;

                        default :
                            break loop34;
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


    public static class multExpPower_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "multExpPower"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:220:1: multExpPower : atom ( POWER ^ atom )* ;
    public final AlgolParser.multExpPower_return multExpPower() throws RecognitionException {
        AlgolParser.multExpPower_return retval = new AlgolParser.multExpPower_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POWER137=null;
        ParserRuleReturnScope atom136 =null;
        ParserRuleReturnScope atom138 =null;

        CommonTree POWER137_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:220:14: ( atom ( POWER ^ atom )* )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:220:16: atom ( POWER ^ atom )*
            {
                root_0 = (CommonTree)adaptor.nil();


                pushFollow(FOLLOW_atom_in_multExpPower1384);
                atom136=atom();
                state._fsp--;

                adaptor.addChild(root_0, atom136.getTree());

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:220:20: ( POWER ^ atom )*
                loop35:
                while (true) {
                    int alt35=2;
                    int LA35_0 = input.LA(1);
                    if ( (LA35_0==POWER) ) {
                        alt35=1;
                    }

                    switch (alt35) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:220:21: POWER ^ atom
                        {
                            POWER137=(Token)match(input,POWER,FOLLOW_POWER_in_multExpPower1386);
                            POWER137_tree = (CommonTree)adaptor.create(POWER137);
                            root_0 = (CommonTree)adaptor.becomeRoot(POWER137_tree, root_0);

                            pushFollow(FOLLOW_atom_in_multExpPower1389);
                            atom138=atom();
                            state._fsp--;

                            adaptor.addChild(root_0, atom138.getTree());

                        }
                        break;

                        default :
                            break loop35;
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
    // $ANTLR end "multExpPower"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:223:1: atom : (| '(' expression ')' -> expression | INT | STRING | FALSE | TRUE | NOT ^ atom | FLOAT | ID ( -> ID ) beginwithID -> beginwithID );
    public final AlgolParser.atom_return atom() throws RecognitionException {
        AlgolParser.atom_return retval = new AlgolParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal139=null;
        Token char_literal141=null;
        Token INT142=null;
        Token STRING143=null;
        Token FALSE144=null;
        Token TRUE145=null;
        Token NOT146=null;
        Token FLOAT148=null;
        Token ID149=null;
        ParserRuleReturnScope expression140 =null;
        ParserRuleReturnScope atom147 =null;
        ParserRuleReturnScope beginwithID150 =null;

        CommonTree char_literal139_tree=null;
        CommonTree char_literal141_tree=null;
        CommonTree INT142_tree=null;
        CommonTree STRING143_tree=null;
        CommonTree FALSE144_tree=null;
        CommonTree TRUE145_tree=null;
        CommonTree NOT146_tree=null;
        CommonTree FLOAT148_tree=null;
        CommonTree ID149_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_beginwithID=new RewriteRuleSubtreeStream(adaptor,"rule beginwithID");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:223:6: (| '(' expression ')' -> expression | INT | STRING | FALSE | TRUE | NOT ^ atom | FLOAT | ID ( -> ID ) beginwithID -> beginwithID )
            int alt36=9;
            switch ( input.LA(1) ) {
                case AND:
                case ASSIGEMENT:
                case BORNE:
                case DIV:
                case DO:
                case ELSE:
                case END:
                case EQUAL:
                case EQUIV:
                case GREATER:
                case IMPL:
                case LESS:
                case MINUS:
                case MULT:
                case NOTEQUAL:
                case NOTGREATER:
                case NOTLESS:
                case OR:
                case PAS:
                case PLUS:
                case POWER:
                case THEN:
                case UNTIL:
                case WHILE:
                case 69:
                case 70:
                case 71:
                case 74:
                {
                    alt36=1;
                }
                break;
                case 68:
                {
                    alt36=2;
                }
                break;
                case INT:
                {
                    alt36=3;
                }
                break;
                case STRING:
                {
                    alt36=4;
                }
                break;
                case FALSE:
                {
                    alt36=5;
                }
                break;
                case TRUE:
                {
                    alt36=6;
                }
                break;
                case NOT:
                {
                    alt36=7;
                }
                break;
                case FLOAT:
                {
                    alt36=8;
                }
                break;
                case ID:
                {
                    alt36=9;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);
                    throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:224:10:
                {
                    root_0 = (CommonTree)adaptor.nil();


                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:224:11: '(' expression ')'
                {
                    char_literal139=(Token)match(input,68,FOLLOW_68_in_atom1412);
                    stream_68.add(char_literal139);

                    pushFollow(FOLLOW_expression_in_atom1414);
                    expression140=expression();
                    state._fsp--;

                    stream_expression.add(expression140.getTree());
                    char_literal141=(Token)match(input,69,FOLLOW_69_in_atom1416);
                    stream_69.add(char_literal141);

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
                    // 224:29: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:225:11: INT
                {
                    root_0 = (CommonTree)adaptor.nil();


                    INT142=(Token)match(input,INT,FOLLOW_INT_in_atom1430);
                    INT142_tree = (CommonTree)adaptor.create(INT142);
                    adaptor.addChild(root_0, INT142_tree);

                }
                break;
                case 4 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:226:11: STRING
                {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING143=(Token)match(input,STRING,FOLLOW_STRING_in_atom1442);
                    STRING143_tree = (CommonTree)adaptor.create(STRING143);
                    adaptor.addChild(root_0, STRING143_tree);

                }
                break;
                case 5 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:227:11: FALSE
                {
                    root_0 = (CommonTree)adaptor.nil();


                    FALSE144=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1454);
                    FALSE144_tree = (CommonTree)adaptor.create(FALSE144);
                    adaptor.addChild(root_0, FALSE144_tree);

                }
                break;
                case 6 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:228:11: TRUE
                {
                    root_0 = (CommonTree)adaptor.nil();


                    TRUE145=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1466);
                    TRUE145_tree = (CommonTree)adaptor.create(TRUE145);
                    adaptor.addChild(root_0, TRUE145_tree);

                }
                break;
                case 7 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:229:11: NOT ^ atom
                {
                    root_0 = (CommonTree)adaptor.nil();


                    NOT146=(Token)match(input,NOT,FOLLOW_NOT_in_atom1478);
                    NOT146_tree = (CommonTree)adaptor.create(NOT146);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT146_tree, root_0);

                    pushFollow(FOLLOW_atom_in_atom1481);
                    atom147=atom();
                    state._fsp--;

                    adaptor.addChild(root_0, atom147.getTree());

                }
                break;
                case 8 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:230:12: FLOAT
                {
                    root_0 = (CommonTree)adaptor.nil();


                    FLOAT148=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom1494);
                    FLOAT148_tree = (CommonTree)adaptor.create(FLOAT148);
                    adaptor.addChild(root_0, FLOAT148_tree);

                }
                break;
                case 9 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:231:11: ID ( -> ID ) beginwithID
                {
                    ID149=(Token)match(input,ID,FOLLOW_ID_in_atom1506);
                    stream_ID.add(ID149);

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:231:14: ( -> ID )
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:231:15:
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
                        // 231:15: -> ID
                        {
                            adaptor.addChild(root_0, stream_ID.nextNode());
                        }


                        retval.tree = root_0;

                    }

                    Idmemoire=retval.tree;
                    pushFollow(FOLLOW_beginwithID_in_atom1515);
                    beginwithID150=beginwithID();
                    state._fsp--;

                    stream_beginwithID.add(beginwithID150.getTree());
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
                    // 231:56: -> beginwithID
                    {
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
        return retval;
    }
    // $ANTLR end "atom"


    public static class beginwithID_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "beginwithID"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:234:1: beginwithID : ( ( ->) actualparametrepart -> actualparametrepart | ( ->) | ( ->) '[' expression ( ',' expression ( ')' )? )* ']' -> ^( ARRAYACCESS $beginwithID ^( ACCCESS ( expression )+ ) ) );
    public final AlgolParser.beginwithID_return beginwithID() throws RecognitionException {
        AlgolParser.beginwithID_return retval = new AlgolParser.beginwithID_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal152=null;
        Token char_literal154=null;
        Token char_literal156=null;
        Token char_literal157=null;
        ParserRuleReturnScope actualparametrepart151 =null;
        ParserRuleReturnScope expression153 =null;
        ParserRuleReturnScope expression155 =null;

        CommonTree char_literal152_tree=null;
        CommonTree char_literal154_tree=null;
        CommonTree char_literal156_tree=null;
        CommonTree char_literal157_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_actualparametrepart=new RewriteRuleSubtreeStream(adaptor,"rule actualparametrepart");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:234:12: ( ( ->) actualparametrepart -> actualparametrepart | ( ->) | ( ->) '[' expression ( ',' expression ( ')' )? )* ']' -> ^( ARRAYACCESS $beginwithID ^( ACCCESS ( expression )+ ) ) )
            int alt39=3;
            switch ( input.LA(1) ) {
                case 68:
                {
                    alt39=1;
                }
                break;
                case AND:
                case ASSIGEMENT:
                case BORNE:
                case DIV:
                case DO:
                case ELSE:
                case END:
                case EQUAL:
                case EQUIV:
                case GREATER:
                case IMPL:
                case LESS:
                case MINUS:
                case MULT:
                case NOTEQUAL:
                case NOTGREATER:
                case NOTLESS:
                case OR:
                case PAS:
                case PLUS:
                case POWER:
                case THEN:
                case UNTIL:
                case WHILE:
                case 69:
                case 70:
                case 71:
                case 74:
                {
                    alt39=2;
                }
                break;
                case 73:
                {
                    alt39=3;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);
                    throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:234:13: ( ->) actualparametrepart
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:234:13: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:234:14:
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
                        // 234:14: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    pushFollow(FOLLOW_actualparametrepart_in_beginwithID1531);
                    actualparametrepart151=actualparametrepart();
                    state._fsp--;

                    stream_actualparametrepart.add(actualparametrepart151.getTree());
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
                    // 234:48: -> actualparametrepart
                    {
                        adaptor.addChild(root_0, stream_actualparametrepart.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:235:3: ( ->)
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:235:3: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:235:4:
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
                        // 235:4: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:236:3: ( ->) '[' expression ( ',' expression ( ')' )? )* ']'
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:236:3: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:236:4:
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
                        // 236:4: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    char_literal152=(Token)match(input,73,FOLLOW_73_in_beginwithID1548);
                    stream_73.add(char_literal152);

                    pushFollow(FOLLOW_expression_in_beginwithID1549);
                    expression153=expression();
                    state._fsp--;

                    stream_expression.add(expression153.getTree());
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:236:32: ( ',' expression ( ')' )? )*
                    loop38:
                    while (true) {
                        int alt38=2;
                        int LA38_0 = input.LA(1);
                        if ( (LA38_0==70) ) {
                            alt38=1;
                        }

                        switch (alt38) {
                            case 1 :
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:236:33: ',' expression ( ')' )?
                            {
                                char_literal154=(Token)match(input,70,FOLLOW_70_in_beginwithID1552);
                                stream_70.add(char_literal154);

                                pushFollow(FOLLOW_expression_in_beginwithID1554);
                                expression155=expression();
                                state._fsp--;

                                stream_expression.add(expression155.getTree());
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:236:48: ( ')' )?
                                int alt37=2;
                                int LA37_0 = input.LA(1);
                                if ( (LA37_0==69) ) {
                                    alt37=1;
                                }
                                switch (alt37) {
                                    case 1 :
                                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:236:48: ')'
                                    {
                                        char_literal156=(Token)match(input,69,FOLLOW_69_in_beginwithID1556);
                                        stream_69.add(char_literal156);

                                    }
                                    break;

                                }

                            }
                            break;

                            default :
                                break loop38;
                        }
                    }

                    char_literal157=(Token)match(input,74,FOLLOW_74_in_beginwithID1560);
                    stream_74.add(char_literal157);

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
                    // 236:57: -> ^( ARRAYACCESS $beginwithID ^( ACCCESS ( expression )+ ) )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:236:59: ^( ARRAYACCESS $beginwithID ^( ACCCESS ( expression )+ ) )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAYACCESS, "ARRAYACCESS"), root_1);
                            adaptor.addChild(root_1, stream_retval.nextTree());
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:236:87: ^( ACCCESS ( expression )+ )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCCESS, "ACCCESS"), root_2);
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
    // $ANTLR end "beginwithID"


    public static class expression2_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "expression2"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:241:1: expression2 : ( simpleARi2 | 'IF' expression 'THEN' simpleDesign 'ELSE' expression2 -> ^( IF expression ^( THEN simpleDesign ) ^( ELSE expression2 ) ) );
    public final AlgolParser.expression2_return expression2() throws RecognitionException {
        AlgolParser.expression2_return retval = new AlgolParser.expression2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal159=null;
        Token string_literal161=null;
        Token string_literal163=null;
        ParserRuleReturnScope simpleARi2158 =null;
        ParserRuleReturnScope expression160 =null;
        ParserRuleReturnScope simpleDesign162 =null;
        ParserRuleReturnScope expression2164 =null;

        CommonTree string_literal159_tree=null;
        CommonTree string_literal161_tree=null;
        CommonTree string_literal163_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_simpleDesign=new RewriteRuleSubtreeStream(adaptor,"rule simpleDesign");
        RewriteRuleSubtreeStream stream_expression2=new RewriteRuleSubtreeStream(adaptor,"rule expression2");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:242:2: ( simpleARi2 | 'IF' expression 'THEN' simpleDesign 'ELSE' expression2 -> ^( IF expression ^( THEN simpleDesign ) ^( ELSE expression2 ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);
            if ( (LA40_0==DIV||LA40_0==ID||LA40_0==INT||(LA40_0 >= MINUS && LA40_0 <= MULT)||(LA40_0 >= PLUS && LA40_0 <= POWER)||LA40_0==STRING||(LA40_0 >= 68 && LA40_0 <= 70)) ) {
                alt40=1;
            }
            else if ( (LA40_0==IF) ) {
                alt40=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 40, 0, input);
                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:242:4: simpleARi2
                {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_simpleARi2_in_expression21593);
                    simpleARi2158=simpleARi2();
                    state._fsp--;

                    adaptor.addChild(root_0, simpleARi2158.getTree());

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:243:4: 'IF' expression 'THEN' simpleDesign 'ELSE' expression2
                {
                    string_literal159=(Token)match(input,IF,FOLLOW_IF_in_expression21599);
                    stream_IF.add(string_literal159);

                    pushFollow(FOLLOW_expression_in_expression21601);
                    expression160=expression();
                    state._fsp--;

                    stream_expression.add(expression160.getTree());
                    string_literal161=(Token)match(input,THEN,FOLLOW_THEN_in_expression21603);
                    stream_THEN.add(string_literal161);

                    pushFollow(FOLLOW_simpleDesign_in_expression21605);
                    simpleDesign162=simpleDesign();
                    state._fsp--;

                    stream_simpleDesign.add(simpleDesign162.getTree());
                    string_literal163=(Token)match(input,ELSE,FOLLOW_ELSE_in_expression21607);
                    stream_ELSE.add(string_literal163);

                    pushFollow(FOLLOW_expression2_in_expression21609);
                    expression2164=expression2();
                    state._fsp--;

                    stream_expression2.add(expression2164.getTree());
                    // AST REWRITE
                    // elements: expression, expression2, simpleDesign
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 243:59: -> ^( IF expression ^( THEN simpleDesign ) ^( ELSE expression2 ) )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:243:61: ^( IF expression ^( THEN simpleDesign ) ^( ELSE expression2 ) )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);
                            adaptor.addChild(root_1, stream_expression.nextTree());
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:243:77: ^( THEN simpleDesign )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THEN, "THEN"), root_2);
                                adaptor.addChild(root_2, stream_simpleDesign.nextTree());
                                adaptor.addChild(root_1, root_2);
                            }

                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:243:98: ^( ELSE expression2 )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE, "ELSE"), root_2);
                                adaptor.addChild(root_2, stream_expression2.nextTree());
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
        return retval;
    }
    // $ANTLR end "expression2"


    public static class simpleARi2_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "simpleARi2"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:246:1: simpleARi2 : multExp2 ( ( PLUS ^| MINUS ^) multExp2 )* ;
    public final AlgolParser.simpleARi2_return simpleARi2() throws RecognitionException {
        AlgolParser.simpleARi2_return retval = new AlgolParser.simpleARi2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS166=null;
        Token MINUS167=null;
        ParserRuleReturnScope multExp2165 =null;
        ParserRuleReturnScope multExp2168 =null;

        CommonTree PLUS166_tree=null;
        CommonTree MINUS167_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:246:14: ( multExp2 ( ( PLUS ^| MINUS ^) multExp2 )* )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:246:16: multExp2 ( ( PLUS ^| MINUS ^) multExp2 )*
            {
                root_0 = (CommonTree)adaptor.nil();


                pushFollow(FOLLOW_multExp2_in_simpleARi21641);
                multExp2165=multExp2();
                state._fsp--;

                adaptor.addChild(root_0, multExp2165.getTree());

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:246:24: ( ( PLUS ^| MINUS ^) multExp2 )*
                loop42:
                while (true) {
                    int alt42=2;
                    int LA42_0 = input.LA(1);
                    if ( (LA42_0==MINUS||LA42_0==PLUS) ) {
                        alt42=1;
                    }

                    switch (alt42) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:246:25: ( PLUS ^| MINUS ^) multExp2
                        {
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:246:25: ( PLUS ^| MINUS ^)
                            int alt41=2;
                            int LA41_0 = input.LA(1);
                            if ( (LA41_0==PLUS) ) {
                                alt41=1;
                            }
                            else if ( (LA41_0==MINUS) ) {
                                alt41=2;
                            }

                            else {
                                NoViableAltException nvae =
                                        new NoViableAltException("", 41, 0, input);
                                throw nvae;
                            }

                            switch (alt41) {
                                case 1 :
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:246:26: PLUS ^
                                {
                                    PLUS166=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleARi21644);
                                    PLUS166_tree = (CommonTree)adaptor.create(PLUS166);
                                    root_0 = (CommonTree)adaptor.becomeRoot(PLUS166_tree, root_0);

                                }
                                break;
                                case 2 :
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:246:34: MINUS ^
                                {
                                    MINUS167=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleARi21649);
                                    MINUS167_tree = (CommonTree)adaptor.create(MINUS167);
                                    root_0 = (CommonTree)adaptor.becomeRoot(MINUS167_tree, root_0);

                                }
                                break;

                            }

                            pushFollow(FOLLOW_multExp2_in_simpleARi21653);
                            multExp2168=multExp2();
                            state._fsp--;

                            adaptor.addChild(root_0, multExp2168.getTree());

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
    // $ANTLR end "simpleARi2"


    public static class multExp2_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "multExp2"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:249:1: multExp2 : multExpPower2 ( ( MULT ^| DIV ^) multExpPower2 )* ;
    public final AlgolParser.multExp2_return multExp2() throws RecognitionException {
        AlgolParser.multExp2_return retval = new AlgolParser.multExp2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MULT170=null;
        Token DIV171=null;
        ParserRuleReturnScope multExpPower2169 =null;
        ParserRuleReturnScope multExpPower2172 =null;

        CommonTree MULT170_tree=null;
        CommonTree DIV171_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:249:13: ( multExpPower2 ( ( MULT ^| DIV ^) multExpPower2 )* )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:249:15: multExpPower2 ( ( MULT ^| DIV ^) multExpPower2 )*
            {
                root_0 = (CommonTree)adaptor.nil();


                pushFollow(FOLLOW_multExpPower2_in_multExp21669);
                multExpPower2169=multExpPower2();
                state._fsp--;

                adaptor.addChild(root_0, multExpPower2169.getTree());

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:249:28: ( ( MULT ^| DIV ^) multExpPower2 )*
                loop44:
                while (true) {
                    int alt44=2;
                    int LA44_0 = input.LA(1);
                    if ( (LA44_0==DIV||LA44_0==MULT) ) {
                        alt44=1;
                    }

                    switch (alt44) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:249:29: ( MULT ^| DIV ^) multExpPower2
                        {
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:249:29: ( MULT ^| DIV ^)
                            int alt43=2;
                            int LA43_0 = input.LA(1);
                            if ( (LA43_0==MULT) ) {
                                alt43=1;
                            }
                            else if ( (LA43_0==DIV) ) {
                                alt43=2;
                            }

                            else {
                                NoViableAltException nvae =
                                        new NoViableAltException("", 43, 0, input);
                                throw nvae;
                            }

                            switch (alt43) {
                                case 1 :
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:249:30: MULT ^
                                {
                                    MULT170=(Token)match(input,MULT,FOLLOW_MULT_in_multExp21672);
                                    MULT170_tree = (CommonTree)adaptor.create(MULT170);
                                    root_0 = (CommonTree)adaptor.becomeRoot(MULT170_tree, root_0);

                                }
                                break;
                                case 2 :
                                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:249:38: DIV ^
                                {
                                    DIV171=(Token)match(input,DIV,FOLLOW_DIV_in_multExp21677);
                                    DIV171_tree = (CommonTree)adaptor.create(DIV171);
                                    root_0 = (CommonTree)adaptor.becomeRoot(DIV171_tree, root_0);

                                }
                                break;

                            }

                            pushFollow(FOLLOW_multExpPower2_in_multExp21681);
                            multExpPower2172=multExpPower2();
                            state._fsp--;

                            adaptor.addChild(root_0, multExpPower2172.getTree());

                        }
                        break;

                        default :
                            break loop44;
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


    public static class multExpPower2_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "multExpPower2"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:252:1: multExpPower2 : atom2 ( POWER ^ atom2 )* ;
    public final AlgolParser.multExpPower2_return multExpPower2() throws RecognitionException {
        AlgolParser.multExpPower2_return retval = new AlgolParser.multExpPower2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POWER174=null;
        ParserRuleReturnScope atom2173 =null;
        ParserRuleReturnScope atom2175 =null;

        CommonTree POWER174_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:252:14: ( atom2 ( POWER ^ atom2 )* )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:252:16: atom2 ( POWER ^ atom2 )*
            {
                root_0 = (CommonTree)adaptor.nil();


                pushFollow(FOLLOW_atom2_in_multExpPower21694);
                atom2173=atom2();
                state._fsp--;

                adaptor.addChild(root_0, atom2173.getTree());

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:252:21: ( POWER ^ atom2 )*
                loop45:
                while (true) {
                    int alt45=2;
                    int LA45_0 = input.LA(1);
                    if ( (LA45_0==POWER) ) {
                        alt45=1;
                    }

                    switch (alt45) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:252:22: POWER ^ atom2
                        {
                            POWER174=(Token)match(input,POWER,FOLLOW_POWER_in_multExpPower21696);
                            POWER174_tree = (CommonTree)adaptor.create(POWER174);
                            root_0 = (CommonTree)adaptor.becomeRoot(POWER174_tree, root_0);

                            pushFollow(FOLLOW_atom2_in_multExpPower21699);
                            atom2175=atom2();
                            state._fsp--;

                            adaptor.addChild(root_0, atom2175.getTree());

                        }
                        break;

                        default :
                            break loop45;
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
    // $ANTLR end "multExpPower2"


    public static class atom2_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "atom2"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:255:1: atom2 : (| ID ( -> ID ) beginwithID -> beginwithID | INT -> INT | STRING | '(' expression2 ')' -> expression2 );
    public final AlgolParser.atom2_return atom2() throws RecognitionException {
        AlgolParser.atom2_return retval = new AlgolParser.atom2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID176=null;
        Token INT178=null;
        Token STRING179=null;
        Token char_literal180=null;
        Token char_literal182=null;
        ParserRuleReturnScope beginwithID177 =null;
        ParserRuleReturnScope expression2181 =null;

        CommonTree ID176_tree=null;
        CommonTree INT178_tree=null;
        CommonTree STRING179_tree=null;
        CommonTree char_literal180_tree=null;
        CommonTree char_literal182_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_beginwithID=new RewriteRuleSubtreeStream(adaptor,"rule beginwithID");
        RewriteRuleSubtreeStream stream_expression2=new RewriteRuleSubtreeStream(adaptor,"rule expression2");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:255:7: (| ID ( -> ID ) beginwithID -> beginwithID | INT -> INT | STRING | '(' expression2 ')' -> expression2 )
            int alt46=5;
            switch ( input.LA(1) ) {
                case DIV:
                case MINUS:
                case MULT:
                case PLUS:
                case POWER:
                case 69:
                case 70:
                {
                    alt46=1;
                }
                break;
                case ID:
                {
                    alt46=2;
                }
                break;
                case INT:
                {
                    alt46=3;
                }
                break;
                case STRING:
                {
                    alt46=4;
                }
                break;
                case 68:
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
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:256:10:
                {
                    root_0 = (CommonTree)adaptor.nil();


                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:256:12: ID ( -> ID ) beginwithID
                {
                    ID176=(Token)match(input,ID,FOLLOW_ID_in_atom21723);
                    stream_ID.add(ID176);

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:256:15: ( -> ID )
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:256:16:
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
                        // 256:16: -> ID
                        {
                            adaptor.addChild(root_0, stream_ID.nextNode());
                        }


                        retval.tree = root_0;

                    }

                    Idmemoire=retval.tree;
                    pushFollow(FOLLOW_beginwithID_in_atom21732);
                    beginwithID177=beginwithID();
                    state._fsp--;

                    stream_beginwithID.add(beginwithID177.getTree());
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
                    // 256:59: -> beginwithID
                    {
                        adaptor.addChild(root_0, stream_beginwithID.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:257:11: INT
                {
                    INT178=(Token)match(input,INT,FOLLOW_INT_in_atom21748);
                    stream_INT.add(INT178);

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
                    // 257:14: -> INT
                    {
                        adaptor.addChild(root_0, stream_INT.nextNode());
                    }


                    retval.tree = root_0;

                }
                break;
                case 4 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:258:11: STRING
                {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING179=(Token)match(input,STRING,FOLLOW_STRING_in_atom21762);
                    STRING179_tree = (CommonTree)adaptor.create(STRING179);
                    adaptor.addChild(root_0, STRING179_tree);

                }
                break;
                case 5 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:259:12: '(' expression2 ')'
                {
                    char_literal180=(Token)match(input,68,FOLLOW_68_in_atom21775);
                    stream_68.add(char_literal180);

                    pushFollow(FOLLOW_expression2_in_atom21777);
                    expression2181=expression2();
                    state._fsp--;

                    stream_expression2.add(expression2181.getTree());
                    char_literal182=(Token)match(input,69,FOLLOW_69_in_atom21779);
                    stream_69.add(char_literal182);

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
                    // 259:31: -> expression2
                    {
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
        return retval;
    }
    // $ANTLR end "atom2"


    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:262:1: identifier : ( ID ( -> ID ) beginwithID2 -> beginwithID2 | INT );
    public final AlgolParser.identifier_return identifier() throws RecognitionException {
        AlgolParser.identifier_return retval = new AlgolParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID183=null;
        Token INT185=null;
        ParserRuleReturnScope beginwithID2184 =null;

        CommonTree ID183_tree=null;
        CommonTree INT185_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_beginwithID2=new RewriteRuleSubtreeStream(adaptor,"rule beginwithID2");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:263:2: ( ID ( -> ID ) beginwithID2 -> beginwithID2 | INT )
            int alt47=2;
            int LA47_0 = input.LA(1);
            if ( (LA47_0==ID) ) {
                alt47=1;
            }
            else if ( (LA47_0==INT) ) {
                alt47=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 47, 0, input);
                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:263:4: ID ( -> ID ) beginwithID2
                {
                    ID183=(Token)match(input,ID,FOLLOW_ID_in_identifier1794);
                    stream_ID.add(ID183);

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:263:7: ( -> ID )
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:263:8:
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
                        // 263:8: -> ID
                        {
                            adaptor.addChild(root_0, stream_ID.nextNode());
                        }


                        retval.tree = root_0;

                    }

                    Idmemoire=retval.tree;
                    pushFollow(FOLLOW_beginwithID2_in_identifier1803);
                    beginwithID2184=beginwithID2();
                    state._fsp--;

                    stream_beginwithID2.add(beginwithID2184.getTree());
                    // AST REWRITE
                    // elements: beginwithID2
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 263:56: -> beginwithID2
                    {
                        adaptor.addChild(root_0, stream_beginwithID2.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:264:3: INT
                {
                    root_0 = (CommonTree)adaptor.nil();


                    INT185=(Token)match(input,INT,FOLLOW_INT_in_identifier1809);
                    INT185_tree = (CommonTree)adaptor.create(INT185);
                    adaptor.addChild(root_0, INT185_tree);

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
    // $ANTLR end "identifier"


    public static class beginwithID2_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "beginwithID2"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:267:1: beginwithID2 : ( ( ->) INT -> ^( INT ) | ( ->) '[' expression ( ',' expression )* ']' -> ^( ARRAYACCESS $beginwithID2 ^( ACCCESS ( expression )+ ) ) | ( ->) );
    public final AlgolParser.beginwithID2_return beginwithID2() throws RecognitionException {
        AlgolParser.beginwithID2_return retval = new AlgolParser.beginwithID2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT186=null;
        Token char_literal187=null;
        Token char_literal189=null;
        Token char_literal191=null;
        ParserRuleReturnScope expression188 =null;
        ParserRuleReturnScope expression190 =null;

        CommonTree INT186_tree=null;
        CommonTree char_literal187_tree=null;
        CommonTree char_literal189_tree=null;
        CommonTree char_literal191_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:267:14: ( ( ->) INT -> ^( INT ) | ( ->) '[' expression ( ',' expression )* ']' -> ^( ARRAYACCESS $beginwithID2 ^( ACCCESS ( expression )+ ) ) | ( ->) )
            int alt49=3;
            switch ( input.LA(1) ) {
                case INT:
                {
                    alt49=1;
                }
                break;
                case 73:
                {
                    alt49=2;
                }
                break;
                case ASSIGEMENT:
                case ELSE:
                case END:
                case 68:
                case 69:
                case 70:
                case 71:
                {
                    alt49=3;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);
                    throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:267:16: ( ->) INT
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:267:16: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:267:17:
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
                        // 267:17: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    INT186=(Token)match(input,INT,FOLLOW_INT_in_beginwithID21824);
                    stream_INT.add(INT186);

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
                    // 267:34: -> ^( INT )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:267:36: ^( INT )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot(stream_INT.nextNode(), root_1);
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:268:18: ( ->) '[' expression ( ',' expression )* ']'
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:268:18: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:268:19:
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
                        // 268:19: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    char_literal187=(Token)match(input,73,FOLLOW_73_in_beginwithID21851);
                    stream_73.add(char_literal187);

                    pushFollow(FOLLOW_expression_in_beginwithID21852);
                    expression188=expression();
                    state._fsp--;

                    stream_expression.add(expression188.getTree());
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:268:47: ( ',' expression )*
                    loop48:
                    while (true) {
                        int alt48=2;
                        int LA48_0 = input.LA(1);
                        if ( (LA48_0==70) ) {
                            alt48=1;
                        }

                        switch (alt48) {
                            case 1 :
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:268:48: ',' expression
                            {
                                char_literal189=(Token)match(input,70,FOLLOW_70_in_beginwithID21855);
                                stream_70.add(char_literal189);

                                pushFollow(FOLLOW_expression_in_beginwithID21857);
                                expression190=expression();
                                state._fsp--;

                                stream_expression.add(expression190.getTree());
                            }
                            break;

                            default :
                                break loop48;
                        }
                    }

                    char_literal191=(Token)match(input,74,FOLLOW_74_in_beginwithID21860);
                    stream_74.add(char_literal191);

                    // AST REWRITE
                    // elements: beginwithID2, expression
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 268:67: -> ^( ARRAYACCESS $beginwithID2 ^( ACCCESS ( expression )+ ) )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:268:69: ^( ARRAYACCESS $beginwithID2 ^( ACCCESS ( expression )+ ) )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAYACCESS, "ARRAYACCESS"), root_1);
                            adaptor.addChild(root_1, stream_retval.nextTree());
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:268:98: ^( ACCCESS ( expression )+ )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCCESS, "ACCCESS"), root_2);
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
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:269:18: ( ->)
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:269:18: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:269:19:
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
                        // 269:19: ->
                        {
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
        return retval;
    }
    // $ANTLR end "beginwithID2"


    public static class designExp_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "designExp"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:272:1: designExp : ( simpleDesign | 'IF' expression 'THEN' simpleDesign 'ELSE' designExp -> ^( IF expression ^( THEN simpleDesign ) ^( ELSE designExp ) ) );
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
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_simpleDesign=new RewriteRuleSubtreeStream(adaptor,"rule simpleDesign");
        RewriteRuleSubtreeStream stream_designExp=new RewriteRuleSubtreeStream(adaptor,"rule designExp");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:272:13: ( simpleDesign | 'IF' expression 'THEN' simpleDesign 'ELSE' designExp -> ^( IF expression ^( THEN simpleDesign ) ^( ELSE designExp ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);
            if ( ((LA50_0 >= ELSE && LA50_0 <= END)||LA50_0==ID||LA50_0==INT||(LA50_0 >= 68 && LA50_0 <= 71)) ) {
                alt50=1;
            }
            else if ( (LA50_0==IF) ) {
                alt50=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 50, 0, input);
                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:272:15: simpleDesign
                {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_simpleDesign_in_designExp1914);
                    simpleDesign192=simpleDesign();
                    state._fsp--;

                    adaptor.addChild(root_0, simpleDesign192.getTree());

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:273:3: 'IF' expression 'THEN' simpleDesign 'ELSE' designExp
                {
                    string_literal193=(Token)match(input,IF,FOLLOW_IF_in_designExp1918);
                    stream_IF.add(string_literal193);

                    pushFollow(FOLLOW_expression_in_designExp1920);
                    expression194=expression();
                    state._fsp--;

                    stream_expression.add(expression194.getTree());
                    string_literal195=(Token)match(input,THEN,FOLLOW_THEN_in_designExp1922);
                    stream_THEN.add(string_literal195);

                    pushFollow(FOLLOW_simpleDesign_in_designExp1924);
                    simpleDesign196=simpleDesign();
                    state._fsp--;

                    stream_simpleDesign.add(simpleDesign196.getTree());
                    string_literal197=(Token)match(input,ELSE,FOLLOW_ELSE_in_designExp1926);
                    stream_ELSE.add(string_literal197);

                    pushFollow(FOLLOW_designExp_in_designExp1928);
                    designExp198=designExp();
                    state._fsp--;

                    stream_designExp.add(designExp198.getTree());
                    // AST REWRITE
                    // elements: designExp, expression, simpleDesign
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 273:56: -> ^( IF expression ^( THEN simpleDesign ) ^( ELSE designExp ) )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:273:58: ^( IF expression ^( THEN simpleDesign ) ^( ELSE designExp ) )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);
                            adaptor.addChild(root_1, stream_expression.nextTree());
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:273:74: ^( THEN simpleDesign )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THEN, "THEN"), root_2);
                                adaptor.addChild(root_2, stream_simpleDesign.nextTree());
                                adaptor.addChild(root_1, root_2);
                            }

                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:273:95: ^( ELSE designExp )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE, "ELSE"), root_2);
                                adaptor.addChild(root_2, stream_designExp.nextTree());
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
        return retval;
    }
    // $ANTLR end "designExp"


    public static class simpleDesign_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "simpleDesign"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:276:1: simpleDesign : (| identifier | '(' designExp ')' );
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

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:276:13: (| identifier | '(' designExp ')' )
            int alt51=3;
            switch ( input.LA(1) ) {
                case ELSE:
                case END:
                case 69:
                case 70:
                case 71:
                {
                    alt51=1;
                }
                break;
                case ID:
                case INT:
                {
                    alt51=2;
                }
                break;
                case 68:
                {
                    alt51=3;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);
                    throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:277:2:
                {
                    root_0 = (CommonTree)adaptor.nil();


                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:277:3: identifier
                {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_simpleDesign1960);
                    identifier199=identifier();
                    state._fsp--;

                    adaptor.addChild(root_0, identifier199.getTree());

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:278:3: '(' designExp ')'
                {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal200=(Token)match(input,68,FOLLOW_68_in_simpleDesign1965);
                    char_literal200_tree = (CommonTree)adaptor.create(char_literal200);
                    adaptor.addChild(root_0, char_literal200_tree);

                    pushFollow(FOLLOW_designExp_in_simpleDesign1967);
                    designExp201=designExp();
                    state._fsp--;

                    adaptor.addChild(root_0, designExp201.getTree());

                    char_literal202=(Token)match(input,69,FOLLOW_69_in_simpleDesign1969);
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
        return retval;
    }
    // $ANTLR end "simpleDesign"


    public static class compoundT_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "compoundT"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:281:1: compoundT : statement compoundTFacto -> statement compoundTFacto ;
    public final AlgolParser.compoundT_return compoundT() throws RecognitionException {
        AlgolParser.compoundT_return retval = new AlgolParser.compoundT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ParserRuleReturnScope statement203 =null;
        ParserRuleReturnScope compoundTFacto204 =null;

        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_compoundTFacto=new RewriteRuleSubtreeStream(adaptor,"rule compoundTFacto");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:282:2: ( statement compoundTFacto -> statement compoundTFacto )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:282:4: statement compoundTFacto
            {
                pushFollow(FOLLOW_statement_in_compoundT1981);
                statement203=statement();
                state._fsp--;

                stream_statement.add(statement203.getTree());
                pushFollow(FOLLOW_compoundTFacto_in_compoundT1983);
                compoundTFacto204=compoundTFacto();
                state._fsp--;

                stream_compoundTFacto.add(compoundTFacto204.getTree());
                // AST REWRITE
                // elements: statement, compoundTFacto
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                root_0 = (CommonTree)adaptor.nil();
                // 282:28: -> statement compoundTFacto
                {
                    adaptor.addChild(root_0, stream_statement.nextTree());
                    adaptor.addChild(root_0, stream_compoundTFacto.nextTree());
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
    // $ANTLR end "compoundT"


    public static class compoundTFacto_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "compoundTFacto"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:285:1: compoundTFacto : ( 'END' -> END | ';' compoundT -> compoundT );
    public final AlgolParser.compoundTFacto_return compoundTFacto() throws RecognitionException {
        AlgolParser.compoundTFacto_return retval = new AlgolParser.compoundTFacto_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal205=null;
        Token char_literal206=null;
        ParserRuleReturnScope compoundT207 =null;

        CommonTree string_literal205_tree=null;
        CommonTree char_literal206_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_compoundT=new RewriteRuleSubtreeStream(adaptor,"rule compoundT");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:285:16: ( 'END' -> END | ';' compoundT -> compoundT )
            int alt52=2;
            int LA52_0 = input.LA(1);
            if ( (LA52_0==END) ) {
                alt52=1;
            }
            else if ( (LA52_0==71) ) {
                alt52=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 52, 0, input);
                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:285:19: 'END'
                {
                    string_literal205=(Token)match(input,END,FOLLOW_END_in_compoundTFacto1999);
                    stream_END.add(string_literal205);

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
                    // 285:24: -> END
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(END, "END"));
                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:285:31: ';' compoundT
                {
                    char_literal206=(Token)match(input,71,FOLLOW_71_in_compoundTFacto2004);
                    stream_71.add(char_literal206);

                    pushFollow(FOLLOW_compoundT_in_compoundTFacto2006);
                    compoundT207=compoundT();
                    state._fsp--;

                    stream_compoundT.add(compoundT207.getTree());
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
                    // 285:44: -> compoundT
                    {
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
        return retval;
    }
    // $ANTLR end "compoundTFacto"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:288:1: statement : ( memoire -> memoire | gotostatement -> gotostatement | comment | 'IF' expression 'THEN' instructionsIf ( options {greedy=true; } : 'ELSE' statement )? -> ^( IF expression ^( THEN instructionsIf ) ( ^( ELSE statement ) )? ) | 'FOR' simpleAr ':=' forlist 'DO' statement -> ^( FOR ^( ':=' simpleAr ^( LISTFOR forlist ) ) ^( DO statement ) ) | begin -> begin | actualparametrepart );
    public final AlgolParser.statement_return statement() throws RecognitionException {
        AlgolParser.statement_return retval = new AlgolParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal211=null;
        Token string_literal213=null;
        Token string_literal215=null;
        Token string_literal217=null;
        Token string_literal219=null;
        Token string_literal221=null;
        ParserRuleReturnScope memoire208 =null;
        ParserRuleReturnScope gotostatement209 =null;
        ParserRuleReturnScope comment210 =null;
        ParserRuleReturnScope expression212 =null;
        ParserRuleReturnScope instructionsIf214 =null;
        ParserRuleReturnScope statement216 =null;
        ParserRuleReturnScope simpleAr218 =null;
        ParserRuleReturnScope forlist220 =null;
        ParserRuleReturnScope statement222 =null;
        ParserRuleReturnScope begin223 =null;
        ParserRuleReturnScope actualparametrepart224 =null;

        CommonTree string_literal211_tree=null;
        CommonTree string_literal213_tree=null;
        CommonTree string_literal215_tree=null;
        CommonTree string_literal217_tree=null;
        CommonTree string_literal219_tree=null;
        CommonTree string_literal221_tree=null;
        RewriteRuleTokenStream stream_ASSIGEMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGEMENT");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_simpleAr=new RewriteRuleSubtreeStream(adaptor,"rule simpleAr");
        RewriteRuleSubtreeStream stream_gotostatement=new RewriteRuleSubtreeStream(adaptor,"rule gotostatement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_instructionsIf=new RewriteRuleSubtreeStream(adaptor,"rule instructionsIf");
        RewriteRuleSubtreeStream stream_memoire=new RewriteRuleSubtreeStream(adaptor,"rule memoire");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forlist=new RewriteRuleSubtreeStream(adaptor,"rule forlist");
        RewriteRuleSubtreeStream stream_begin=new RewriteRuleSubtreeStream(adaptor,"rule begin");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:289:2: ( memoire -> memoire | gotostatement -> gotostatement | comment | 'IF' expression 'THEN' instructionsIf ( options {greedy=true; } : 'ELSE' statement )? -> ^( IF expression ^( THEN instructionsIf ) ( ^( ELSE statement ) )? ) | 'FOR' simpleAr ':=' forlist 'DO' statement -> ^( FOR ^( ':=' simpleAr ^( LISTFOR forlist ) ) ^( DO statement ) ) | begin -> begin | actualparametrepart )
            int alt54=7;
            switch ( input.LA(1) ) {
                case ID:
                case INT:
                {
                    alt54=1;
                }
                break;
                case GOTO:
                {
                    alt54=2;
                }
                break;
                case COMMENT2:
                {
                    alt54=3;
                }
                break;
                case IF:
                {
                    alt54=4;
                }
                break;
                case FOR:
                {
                    alt54=5;
                }
                break;
                case BEGIN:
                {
                    alt54=6;
                }
                break;
                case 68:
                {
                    alt54=7;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);
                    throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:289:3: memoire
                {
                    pushFollow(FOLLOW_memoire_in_statement2019);
                    memoire208=memoire();
                    state._fsp--;

                    stream_memoire.add(memoire208.getTree());
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
                    // 289:10: -> memoire
                    {
                        adaptor.addChild(root_0, stream_memoire.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:290:3: gotostatement
                {
                    pushFollow(FOLLOW_gotostatement_in_statement2025);
                    gotostatement209=gotostatement();
                    state._fsp--;

                    stream_gotostatement.add(gotostatement209.getTree());
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
                    // 290:16: -> gotostatement
                    {
                        adaptor.addChild(root_0, stream_gotostatement.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:291:3: comment
                {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_comment_in_statement2031);
                    comment210=comment();
                    state._fsp--;

                    adaptor.addChild(root_0, comment210.getTree());

                }
                break;
                case 4 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:292:3: 'IF' expression 'THEN' instructionsIf ( options {greedy=true; } : 'ELSE' statement )?
                {
                    string_literal211=(Token)match(input,IF,FOLLOW_IF_in_statement2035);
                    stream_IF.add(string_literal211);

                    pushFollow(FOLLOW_expression_in_statement2037);
                    expression212=expression();
                    state._fsp--;

                    stream_expression.add(expression212.getTree());
                    string_literal213=(Token)match(input,THEN,FOLLOW_THEN_in_statement2039);
                    stream_THEN.add(string_literal213);

                    pushFollow(FOLLOW_instructionsIf_in_statement2041);
                    instructionsIf214=instructionsIf();
                    state._fsp--;

                    stream_instructionsIf.add(instructionsIf214.getTree());
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:292:41: ( options {greedy=true; } : 'ELSE' statement )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);
                    if ( (LA53_0==ELSE) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:292:66: 'ELSE' statement
                        {
                            string_literal215=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement2052);
                            stream_ELSE.add(string_literal215);

                            pushFollow(FOLLOW_statement_in_statement2054);
                            statement216=statement();
                            state._fsp--;

                            stream_statement.add(statement216.getTree());
                        }
                        break;

                    }

                    // AST REWRITE
                    // elements: expression, instructionsIf, statement
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 292:84: -> ^( IF expression ^( THEN instructionsIf ) ( ^( ELSE statement ) )? )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:292:86: ^( IF expression ^( THEN instructionsIf ) ( ^( ELSE statement ) )? )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);
                            adaptor.addChild(root_1, stream_expression.nextTree());
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:292:102: ^( THEN instructionsIf )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THEN, "THEN"), root_2);
                                adaptor.addChild(root_2, stream_instructionsIf.nextTree());
                                adaptor.addChild(root_1, root_2);
                            }

                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:292:125: ( ^( ELSE statement ) )?
                            if ( stream_statement.hasNext() ) {
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:292:125: ^( ELSE statement )
                                {
                                    CommonTree root_2 = (CommonTree)adaptor.nil();
                                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE, "ELSE"), root_2);
                                    adaptor.addChild(root_2, stream_statement.nextTree());
                                    adaptor.addChild(root_1, root_2);
                                }

                            }
                            stream_statement.reset();

                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 5 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:293:3: 'FOR' simpleAr ':=' forlist 'DO' statement
                {
                    string_literal217=(Token)match(input,FOR,FOLLOW_FOR_in_statement2079);
                    stream_FOR.add(string_literal217);

                    pushFollow(FOLLOW_simpleAr_in_statement2081);
                    simpleAr218=simpleAr();
                    state._fsp--;

                    stream_simpleAr.add(simpleAr218.getTree());
                    string_literal219=(Token)match(input,ASSIGEMENT,FOLLOW_ASSIGEMENT_in_statement2083);
                    stream_ASSIGEMENT.add(string_literal219);

                    pushFollow(FOLLOW_forlist_in_statement2085);
                    forlist220=forlist();
                    state._fsp--;

                    stream_forlist.add(forlist220.getTree());
                    string_literal221=(Token)match(input,DO,FOLLOW_DO_in_statement2087);
                    stream_DO.add(string_literal221);

                    pushFollow(FOLLOW_statement_in_statement2089);
                    statement222=statement();
                    state._fsp--;

                    stream_statement.add(statement222.getTree());
                    // AST REWRITE
                    // elements: ASSIGEMENT, simpleAr, statement, forlist
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 293:45: -> ^( FOR ^( ':=' simpleAr ^( LISTFOR forlist ) ) ^( DO statement ) )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:293:47: ^( FOR ^( ':=' simpleAr ^( LISTFOR forlist ) ) ^( DO statement ) )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:293:53: ^( ':=' simpleAr ^( LISTFOR forlist ) )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot(stream_ASSIGEMENT.nextNode(), root_2);
                                adaptor.addChild(root_2, stream_simpleAr.nextTree());
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:293:69: ^( LISTFOR forlist )
                                {
                                    CommonTree root_3 = (CommonTree)adaptor.nil();
                                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTFOR, "LISTFOR"), root_3);
                                    adaptor.addChild(root_3, stream_forlist.nextTree());
                                    adaptor.addChild(root_2, root_3);
                                }

                                adaptor.addChild(root_1, root_2);
                            }

                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:293:89: ^( DO statement )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DO, "DO"), root_2);
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
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:294:3: begin
                {
                    pushFollow(FOLLOW_begin_in_statement2115);
                    begin223=begin();
                    state._fsp--;

                    stream_begin.add(begin223.getTree());
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
                    // 294:8: -> begin
                    {
                        adaptor.addChild(root_0, stream_begin.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 7 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:295:3: actualparametrepart
                {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_actualparametrepart_in_statement2121);
                    actualparametrepart224=actualparametrepart();
                    state._fsp--;

                    adaptor.addChild(root_0, actualparametrepart224.getTree());

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


    public static class memoire_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "memoire"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:298:1: memoire : ( ID ( -> ID ) statementWithID -> statementWithID | INT ( -> INT ) statementWithID -> statementWithID );
    public final AlgolParser.memoire_return memoire() throws RecognitionException {
        AlgolParser.memoire_return retval = new AlgolParser.memoire_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID225=null;
        Token INT227=null;
        ParserRuleReturnScope statementWithID226 =null;
        ParserRuleReturnScope statementWithID228 =null;

        CommonTree ID225_tree=null;
        CommonTree INT227_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_statementWithID=new RewriteRuleSubtreeStream(adaptor,"rule statementWithID");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:298:9: ( ID ( -> ID ) statementWithID -> statementWithID | INT ( -> INT ) statementWithID -> statementWithID )
            int alt55=2;
            int LA55_0 = input.LA(1);
            if ( (LA55_0==ID) ) {
                alt55=1;
            }
            else if ( (LA55_0==INT) ) {
                alt55=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 55, 0, input);
                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:298:10: ID ( -> ID ) statementWithID
                {
                    ID225=(Token)match(input,ID,FOLLOW_ID_in_memoire2130);
                    stream_ID.add(ID225);

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:298:12: ( -> ID )
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:298:13:
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
                        // 298:13: -> ID
                        {
                            adaptor.addChild(root_0, stream_ID.nextNode());
                        }


                        retval.tree = root_0;

                    }

                    Idmemoire=retval.tree;
                    pushFollow(FOLLOW_statementWithID_in_memoire2138);
                    statementWithID226=statementWithID();
                    state._fsp--;

                    stream_statementWithID.add(statementWithID226.getTree());
                    // AST REWRITE
                    // elements: statementWithID
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 298:61: -> statementWithID
                    {
                        adaptor.addChild(root_0, stream_statementWithID.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:299:7: INT ( -> INT ) statementWithID
                {
                    INT227=(Token)match(input,INT,FOLLOW_INT_in_memoire2150);
                    stream_INT.add(INT227);

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:299:10: ( -> INT )
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:299:11:
                    {
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
                        // 299:11: -> INT
                        {
                            adaptor.addChild(root_0, stream_INT.nextNode());
                        }


                        retval.tree = root_0;

                    }

                    Idmemoire=retval.tree;
                    pushFollow(FOLLOW_statementWithID_in_memoire2157);
                    statementWithID228=statementWithID();
                    state._fsp--;

                    stream_statementWithID.add(statementWithID228.getTree());
                    // AST REWRITE
                    // elements: statementWithID
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 299:59: -> statementWithID
                    {
                        adaptor.addChild(root_0, stream_statementWithID.nextTree());
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
    // $ANTLR end "memoire"


    public static class comment_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "comment"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:302:1: comment : COMMENT2 ;
    public final AlgolParser.comment_return comment() throws RecognitionException {
        AlgolParser.comment_return retval = new AlgolParser.comment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMENT2229=null;

        CommonTree COMMENT2229_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:302:9: ( COMMENT2 )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:302:10: COMMENT2
            {
                root_0 = (CommonTree)adaptor.nil();


                COMMENT2229=(Token)match(input,COMMENT2,FOLLOW_COMMENT2_in_comment2170);
                COMMENT2229_tree = (CommonTree)adaptor.create(COMMENT2229);
                adaptor.addChild(root_0, COMMENT2229_tree);

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
    // $ANTLR end "comment"


    public static class statementWithID_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "statementWithID"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:305:1: statementWithID : ( ( ->) ':=' simpleOp -> ^( ':=' $statementWithID simpleOp ) | actualparametrepart2 | ( ->) '[' expression ( ',' expression )* ']' ':=' simpleOp -> ^( ':=' ^( ARRAYACCESS $statementWithID ^( ACCCESS ( expression )+ ) ) simpleOp ) | ( ->) ':' statementWithLabel -> statementWithLabel );
    public final AlgolParser.statementWithID_return statementWithID() throws RecognitionException {
        AlgolParser.statementWithID_return retval = new AlgolParser.statementWithID_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal230=null;
        Token char_literal233=null;
        Token char_literal235=null;
        Token char_literal237=null;
        Token string_literal238=null;
        Token char_literal240=null;
        ParserRuleReturnScope simpleOp231 =null;
        ParserRuleReturnScope actualparametrepart2232 =null;
        ParserRuleReturnScope expression234 =null;
        ParserRuleReturnScope expression236 =null;
        ParserRuleReturnScope simpleOp239 =null;
        ParserRuleReturnScope statementWithLabel241 =null;

        CommonTree string_literal230_tree=null;
        CommonTree char_literal233_tree=null;
        CommonTree char_literal235_tree=null;
        CommonTree char_literal237_tree=null;
        CommonTree string_literal238_tree=null;
        CommonTree char_literal240_tree=null;
        RewriteRuleTokenStream stream_ASSIGEMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGEMENT");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_simpleOp=new RewriteRuleSubtreeStream(adaptor,"rule simpleOp");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementWithLabel=new RewriteRuleSubtreeStream(adaptor,"rule statementWithLabel");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:305:17: ( ( ->) ':=' simpleOp -> ^( ':=' $statementWithID simpleOp ) | actualparametrepart2 | ( ->) '[' expression ( ',' expression )* ']' ':=' simpleOp -> ^( ':=' ^( ARRAYACCESS $statementWithID ^( ACCCESS ( expression )+ ) ) simpleOp ) | ( ->) ':' statementWithLabel -> statementWithLabel )
            int alt57=4;
            switch ( input.LA(1) ) {
                case ASSIGEMENT:
                {
                    alt57=1;
                }
                break;
                case ELSE:
                case END:
                case 68:
                case 71:
                {
                    alt57=2;
                }
                break;
                case 73:
                {
                    alt57=3;
                }
                break;
                case BORNE:
                {
                    alt57=4;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);
                    throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:305:19: ( ->) ':=' simpleOp
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:305:19: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:305:20:
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
                        // 305:20: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    string_literal230=(Token)match(input,ASSIGEMENT,FOLLOW_ASSIGEMENT_in_statementWithID2185);
                    stream_ASSIGEMENT.add(string_literal230);

                    pushFollow(FOLLOW_simpleOp_in_statementWithID2187);
                    simpleOp231=simpleOp();
                    state._fsp--;

                    stream_simpleOp.add(simpleOp231.getTree());
                    // AST REWRITE
                    // elements: ASSIGEMENT, simpleOp, statementWithID
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 305:47: -> ^( ':=' $statementWithID simpleOp )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:305:49: ^( ':=' $statementWithID simpleOp )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGEMENT.nextNode(), root_1);
                            adaptor.addChild(root_1, stream_retval.nextTree());
                            adaptor.addChild(root_1, stream_simpleOp.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:306:4: actualparametrepart2
                {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_actualparametrepart2_in_statementWithID2201);
                    actualparametrepart2232=actualparametrepart2();
                    state._fsp--;

                    adaptor.addChild(root_0, actualparametrepart2232.getTree());

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:307:3: ( ->) '[' expression ( ',' expression )* ']' ':=' simpleOp
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:307:3: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:307:4:
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
                        // 307:4: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    char_literal233=(Token)match(input,73,FOLLOW_73_in_statementWithID2209);
                    stream_73.add(char_literal233);

                    pushFollow(FOLLOW_expression_in_statementWithID2210);
                    expression234=expression();
                    state._fsp--;

                    stream_expression.add(expression234.getTree());
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:307:32: ( ',' expression )*
                    loop56:
                    while (true) {
                        int alt56=2;
                        int LA56_0 = input.LA(1);
                        if ( (LA56_0==70) ) {
                            alt56=1;
                        }

                        switch (alt56) {
                            case 1 :
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:307:33: ',' expression
                            {
                                char_literal235=(Token)match(input,70,FOLLOW_70_in_statementWithID2213);
                                stream_70.add(char_literal235);

                                pushFollow(FOLLOW_expression_in_statementWithID2215);
                                expression236=expression();
                                state._fsp--;

                                stream_expression.add(expression236.getTree());
                            }
                            break;

                            default :
                                break loop56;
                        }
                    }

                    char_literal237=(Token)match(input,74,FOLLOW_74_in_statementWithID2218);
                    stream_74.add(char_literal237);

                    string_literal238=(Token)match(input,ASSIGEMENT,FOLLOW_ASSIGEMENT_in_statementWithID2220);
                    stream_ASSIGEMENT.add(string_literal238);

                    pushFollow(FOLLOW_simpleOp_in_statementWithID2222);
                    simpleOp239=simpleOp();
                    state._fsp--;

                    stream_simpleOp.add(simpleOp239.getTree());
                    // AST REWRITE
                    // elements: expression, ASSIGEMENT, statementWithID, simpleOp
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 307:66: -> ^( ':=' ^( ARRAYACCESS $statementWithID ^( ACCCESS ( expression )+ ) ) simpleOp )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:307:68: ^( ':=' ^( ARRAYACCESS $statementWithID ^( ACCCESS ( expression )+ ) ) simpleOp )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGEMENT.nextNode(), root_1);
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:307:75: ^( ARRAYACCESS $statementWithID ^( ACCCESS ( expression )+ ) )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAYACCESS, "ARRAYACCESS"), root_2);
                                adaptor.addChild(root_2, stream_retval.nextTree());
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:307:107: ^( ACCCESS ( expression )+ )
                                {
                                    CommonTree root_3 = (CommonTree)adaptor.nil();
                                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCCESS, "ACCCESS"), root_3);
                                    if ( !(stream_expression.hasNext()) ) {
                                        throw new RewriteEarlyExitException();
                                    }
                                    while ( stream_expression.hasNext() ) {
                                        adaptor.addChild(root_3, stream_expression.nextTree());
                                    }
                                    stream_expression.reset();

                                    adaptor.addChild(root_2, root_3);
                                }

                                adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_1, stream_simpleOp.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 4 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:308:4: ( ->) ':' statementWithLabel
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:308:4: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:308:5:
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
                        // 308:5: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    char_literal240=(Token)match(input,BORNE,FOLLOW_BORNE_in_statementWithID2255);
                    stream_BORNE.add(char_literal240);

                    pushFollow(FOLLOW_statementWithLabel_in_statementWithID2257);
                    statementWithLabel241=statementWithLabel();
                    state._fsp--;

                    stream_statementWithLabel.add(statementWithLabel241.getTree());
                    // AST REWRITE
                    // elements: statementWithLabel
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 308:42: -> statementWithLabel
                    {
                        adaptor.addChild(root_0, stream_statementWithLabel.nextTree());
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
    // $ANTLR end "statementWithID"


    public static class statementWithLabel_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "statementWithLabel"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:311:1: statementWithLabel : ( ( ->) label2 -> ^( LABEL $statementWithLabel label2 ) | ( ->) gotostatement -> ^( LABEL $statementWithLabel gotostatement ) | comment | ( ->) 'IF' expression 'THEN' instructionsIf -> ^( LABEL $statementWithLabel ^( IF expression ^( THEN instructionsIf ) ) ) | ( ->) 'FOR' simpleAr ':=' forlist 'DO' statement -> ^( LABEL $statementWithLabel ^( FOR ^( ':=' simpleAr forlist ) ^( DO statement ) ) ) | ( ->) begin -> ^( LABEL $statementWithLabel begin ) | ( ->) actualparametrepart2 -> actualparametrepart2 | ':' statementWithLabel -> statementWithLabel );
    public final AlgolParser.statementWithLabel_return statementWithLabel() throws RecognitionException {
        AlgolParser.statementWithLabel_return retval = new AlgolParser.statementWithLabel_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal245=null;
        Token string_literal247=null;
        Token string_literal249=null;
        Token string_literal251=null;
        Token string_literal253=null;
        Token char_literal257=null;
        ParserRuleReturnScope label2242 =null;
        ParserRuleReturnScope gotostatement243 =null;
        ParserRuleReturnScope comment244 =null;
        ParserRuleReturnScope expression246 =null;
        ParserRuleReturnScope instructionsIf248 =null;
        ParserRuleReturnScope simpleAr250 =null;
        ParserRuleReturnScope forlist252 =null;
        ParserRuleReturnScope statement254 =null;
        ParserRuleReturnScope begin255 =null;
        ParserRuleReturnScope actualparametrepart2256 =null;
        ParserRuleReturnScope statementWithLabel258 =null;

        CommonTree string_literal245_tree=null;
        CommonTree string_literal247_tree=null;
        CommonTree string_literal249_tree=null;
        CommonTree string_literal251_tree=null;
        CommonTree string_literal253_tree=null;
        CommonTree char_literal257_tree=null;
        RewriteRuleTokenStream stream_ASSIGEMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGEMENT");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_simpleAr=new RewriteRuleSubtreeStream(adaptor,"rule simpleAr");
        RewriteRuleSubtreeStream stream_actualparametrepart2=new RewriteRuleSubtreeStream(adaptor,"rule actualparametrepart2");
        RewriteRuleSubtreeStream stream_gotostatement=new RewriteRuleSubtreeStream(adaptor,"rule gotostatement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_instructionsIf=new RewriteRuleSubtreeStream(adaptor,"rule instructionsIf");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forlist=new RewriteRuleSubtreeStream(adaptor,"rule forlist");
        RewriteRuleSubtreeStream stream_statementWithLabel=new RewriteRuleSubtreeStream(adaptor,"rule statementWithLabel");
        RewriteRuleSubtreeStream stream_begin=new RewriteRuleSubtreeStream(adaptor,"rule begin");
        RewriteRuleSubtreeStream stream_label2=new RewriteRuleSubtreeStream(adaptor,"rule label2");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:311:20: ( ( ->) label2 -> ^( LABEL $statementWithLabel label2 ) | ( ->) gotostatement -> ^( LABEL $statementWithLabel gotostatement ) | comment | ( ->) 'IF' expression 'THEN' instructionsIf -> ^( LABEL $statementWithLabel ^( IF expression ^( THEN instructionsIf ) ) ) | ( ->) 'FOR' simpleAr ':=' forlist 'DO' statement -> ^( LABEL $statementWithLabel ^( FOR ^( ':=' simpleAr forlist ) ^( DO statement ) ) ) | ( ->) begin -> ^( LABEL $statementWithLabel begin ) | ( ->) actualparametrepart2 -> actualparametrepart2 | ':' statementWithLabel -> statementWithLabel )
            int alt58=8;
            switch ( input.LA(1) ) {
                case ID:
                case INT:
                {
                    alt58=1;
                }
                break;
                case GOTO:
                {
                    alt58=2;
                }
                break;
                case COMMENT2:
                {
                    alt58=3;
                }
                break;
                case IF:
                {
                    alt58=4;
                }
                break;
                case FOR:
                {
                    alt58=5;
                }
                break;
                case BEGIN:
                {
                    alt58=6;
                }
                break;
                case ELSE:
                case END:
                case 68:
                case 71:
                {
                    alt58=7;
                }
                break;
                case BORNE:
                {
                    alt58=8;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);
                    throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:311:22: ( ->) label2
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:311:22: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:311:23:
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
                        // 311:23: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    pushFollow(FOLLOW_label2_in_statementWithLabel2277);
                    label2242=label2();
                    state._fsp--;

                    stream_label2.add(label2242.getTree());
                    // AST REWRITE
                    // elements: label2, statementWithLabel
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 311:44: -> ^( LABEL $statementWithLabel label2 )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:311:46: ^( LABEL $statementWithLabel label2 )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, "LABEL"), root_1);
                            adaptor.addChild(root_1, stream_retval.nextTree());
                            adaptor.addChild(root_1, stream_label2.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:312:3: ( ->) gotostatement
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:312:3: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:312:4:
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
                        // 312:4: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    pushFollow(FOLLOW_gotostatement_in_statementWithLabel2294);
                    gotostatement243=gotostatement();
                    state._fsp--;

                    stream_gotostatement.add(gotostatement243.getTree());
                    // AST REWRITE
                    // elements: gotostatement, statementWithLabel
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 312:31: -> ^( LABEL $statementWithLabel gotostatement )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:312:33: ^( LABEL $statementWithLabel gotostatement )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, "LABEL"), root_1);
                            adaptor.addChild(root_1, stream_retval.nextTree());
                            adaptor.addChild(root_1, stream_gotostatement.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:313:3: comment
                {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_comment_in_statementWithLabel2307);
                    comment244=comment();
                    state._fsp--;

                    adaptor.addChild(root_0, comment244.getTree());

                }
                break;
                case 4 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:314:4: ( ->) 'IF' expression 'THEN' instructionsIf
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:314:4: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:314:5:
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
                        // 314:5: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    string_literal245=(Token)match(input,IF,FOLLOW_IF_in_statementWithLabel2316);
                    stream_IF.add(string_literal245);

                    pushFollow(FOLLOW_expression_in_statementWithLabel2318);
                    expression246=expression();
                    state._fsp--;

                    stream_expression.add(expression246.getTree());
                    string_literal247=(Token)match(input,THEN,FOLLOW_THEN_in_statementWithLabel2320);
                    stream_THEN.add(string_literal247);

                    pushFollow(FOLLOW_instructionsIf_in_statementWithLabel2322);
                    instructionsIf248=instructionsIf();
                    state._fsp--;

                    stream_instructionsIf.add(instructionsIf248.getTree());
                    // AST REWRITE
                    // elements: instructionsIf, statementWithLabel, expression
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 314:56: -> ^( LABEL $statementWithLabel ^( IF expression ^( THEN instructionsIf ) ) )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:314:58: ^( LABEL $statementWithLabel ^( IF expression ^( THEN instructionsIf ) ) )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, "LABEL"), root_1);
                            adaptor.addChild(root_1, stream_retval.nextTree());
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:314:86: ^( IF expression ^( THEN instructionsIf ) )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_2);
                                adaptor.addChild(root_2, stream_expression.nextTree());
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:314:102: ^( THEN instructionsIf )
                                {
                                    CommonTree root_3 = (CommonTree)adaptor.nil();
                                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THEN, "THEN"), root_3);
                                    adaptor.addChild(root_3, stream_instructionsIf.nextTree());
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
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:315:3: ( ->) 'FOR' simpleAr ':=' forlist 'DO' statement
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:315:3: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:315:4:
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
                        // 315:4: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    string_literal249=(Token)match(input,FOR,FOLLOW_FOR_in_statementWithLabel2349);
                    stream_FOR.add(string_literal249);

                    pushFollow(FOLLOW_simpleAr_in_statementWithLabel2351);
                    simpleAr250=simpleAr();
                    state._fsp--;

                    stream_simpleAr.add(simpleAr250.getTree());
                    string_literal251=(Token)match(input,ASSIGEMENT,FOLLOW_ASSIGEMENT_in_statementWithLabel2353);
                    stream_ASSIGEMENT.add(string_literal251);

                    pushFollow(FOLLOW_forlist_in_statementWithLabel2355);
                    forlist252=forlist();
                    state._fsp--;

                    stream_forlist.add(forlist252.getTree());
                    string_literal253=(Token)match(input,DO,FOLLOW_DO_in_statementWithLabel2357);
                    stream_DO.add(string_literal253);

                    pushFollow(FOLLOW_statement_in_statementWithLabel2359);
                    statement254=statement();
                    state._fsp--;

                    stream_statement.add(statement254.getTree());
                    // AST REWRITE
                    // elements: simpleAr, statementWithLabel, forlist, ASSIGEMENT, statement
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 315:60: -> ^( LABEL $statementWithLabel ^( FOR ^( ':=' simpleAr forlist ) ^( DO statement ) ) )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:315:62: ^( LABEL $statementWithLabel ^( FOR ^( ':=' simpleAr forlist ) ^( DO statement ) ) )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, "LABEL"), root_1);
                            adaptor.addChild(root_1, stream_retval.nextTree());
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:315:90: ^( FOR ^( ':=' simpleAr forlist ) ^( DO statement ) )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_2);
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:315:96: ^( ':=' simpleAr forlist )
                                {
                                    CommonTree root_3 = (CommonTree)adaptor.nil();
                                    root_3 = (CommonTree)adaptor.becomeRoot(stream_ASSIGEMENT.nextNode(), root_3);
                                    adaptor.addChild(root_3, stream_simpleAr.nextTree());
                                    adaptor.addChild(root_3, stream_forlist.nextTree());
                                    adaptor.addChild(root_2, root_3);
                                }

                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:315:121: ^( DO statement )
                                {
                                    CommonTree root_3 = (CommonTree)adaptor.nil();
                                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DO, "DO"), root_3);
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
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:316:3: ( ->) begin
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:316:3: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:316:4:
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
                        // 316:4: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    pushFollow(FOLLOW_begin_in_statementWithLabel2392);
                    begin255=begin();
                    state._fsp--;

                    stream_begin.add(begin255.getTree());
                    // AST REWRITE
                    // elements: begin, statementWithLabel
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 316:23: -> ^( LABEL $statementWithLabel begin )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:316:25: ^( LABEL $statementWithLabel begin )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, "LABEL"), root_1);
                            adaptor.addChild(root_1, stream_retval.nextTree());
                            adaptor.addChild(root_1, stream_begin.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 7 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:317:3: ( ->) actualparametrepart2
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:317:3: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:317:4:
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
                        // 317:4: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    pushFollow(FOLLOW_actualparametrepart2_in_statementWithLabel2409);
                    actualparametrepart2256=actualparametrepart2();
                    state._fsp--;

                    stream_actualparametrepart2.add(actualparametrepart2256.getTree());
                    // AST REWRITE
                    // elements: actualparametrepart2
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 317:38: -> actualparametrepart2
                    {
                        adaptor.addChild(root_0, stream_actualparametrepart2.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 8 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:318:3: ':' statementWithLabel
                {
                    char_literal257=(Token)match(input,BORNE,FOLLOW_BORNE_in_statementWithLabel2415);
                    stream_BORNE.add(char_literal257);

                    pushFollow(FOLLOW_statementWithLabel_in_statementWithLabel2416);
                    statementWithLabel258=statementWithLabel();
                    state._fsp--;

                    stream_statementWithLabel.add(statementWithLabel258.getTree());
                    // AST REWRITE
                    // elements: statementWithLabel
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 318:24: -> statementWithLabel
                    {
                        adaptor.addChild(root_0, stream_statementWithLabel.nextTree());
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
    // $ANTLR end "statementWithLabel"


    public static class label_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "label"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:323:1: label : ( ID | INT );
    public final AlgolParser.label_return label() throws RecognitionException {
        AlgolParser.label_return retval = new AlgolParser.label_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set259=null;

        CommonTree set259_tree=null;

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:323:6: ( ID | INT )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:
            {
                root_0 = (CommonTree)adaptor.nil();


                set259=input.LT(1);
                if ( input.LA(1)==ID||input.LA(1)==INT ) {
                    input.consume();
                    adaptor.addChild(root_0, (CommonTree)adaptor.create(set259));
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
    // $ANTLR end "label"


    public static class label2_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "label2"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:327:1: label2 : ( ID ( -> ID ) statementLabelLoop -> statementLabelLoop | INT ( -> INT ) statementLabelLoop -> statementLabelLoop );
    public final AlgolParser.label2_return label2() throws RecognitionException {
        AlgolParser.label2_return retval = new AlgolParser.label2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID260=null;
        Token INT262=null;
        ParserRuleReturnScope statementLabelLoop261 =null;
        ParserRuleReturnScope statementLabelLoop263 =null;

        CommonTree ID260_tree=null;
        CommonTree INT262_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_statementLabelLoop=new RewriteRuleSubtreeStream(adaptor,"rule statementLabelLoop");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:327:8: ( ID ( -> ID ) statementLabelLoop -> statementLabelLoop | INT ( -> INT ) statementLabelLoop -> statementLabelLoop )
            int alt59=2;
            int LA59_0 = input.LA(1);
            if ( (LA59_0==ID) ) {
                alt59=1;
            }
            else if ( (LA59_0==INT) ) {
                alt59=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 59, 0, input);
                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:327:10: ID ( -> ID ) statementLabelLoop
                {
                    ID260=(Token)match(input,ID,FOLLOW_ID_in_label22487);
                    stream_ID.add(ID260);

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:327:12: ( -> ID )
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:327:13:
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
                        // 327:13: -> ID
                        {
                            adaptor.addChild(root_0, stream_ID.nextNode());
                        }


                        retval.tree = root_0;

                    }

                    Idmemoire=retval.tree;
                    pushFollow(FOLLOW_statementLabelLoop_in_label22495);
                    statementLabelLoop261=statementLabelLoop();
                    state._fsp--;

                    stream_statementLabelLoop.add(statementLabelLoop261.getTree());
                    // AST REWRITE
                    // elements: statementLabelLoop
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 327:63: -> statementLabelLoop
                    {
                        adaptor.addChild(root_0, stream_statementLabelLoop.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:328:17: INT ( -> INT ) statementLabelLoop
                {
                    INT262=(Token)match(input,INT,FOLLOW_INT_in_label22515);
                    stream_INT.add(INT262);

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:328:21: ( -> INT )
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:328:22:
                    {
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
                        // 328:22: -> INT
                        {
                            adaptor.addChild(root_0, stream_INT.nextNode());
                        }


                        retval.tree = root_0;

                    }

                    Idmemoire=retval.tree;
                    pushFollow(FOLLOW_statementLabelLoop_in_label22524);
                    statementLabelLoop263=statementLabelLoop();
                    state._fsp--;

                    stream_statementLabelLoop.add(statementLabelLoop263.getTree());
                    // AST REWRITE
                    // elements: statementLabelLoop
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 328:73: -> statementLabelLoop
                    {
                        adaptor.addChild(root_0, stream_statementLabelLoop.nextTree());
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
    // $ANTLR end "label2"


    public static class statementLabelLoop_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "statementLabelLoop"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:331:1: statementLabelLoop : ( ( ->) ':=' simpleOp -> ^( ':=' $statementLabelLoop simpleOp ) | actualparametrepart2 | ':' statementWithLabel -> statementWithLabel );
    public final AlgolParser.statementLabelLoop_return statementLabelLoop() throws RecognitionException {
        AlgolParser.statementLabelLoop_return retval = new AlgolParser.statementLabelLoop_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal264=null;
        Token char_literal267=null;
        ParserRuleReturnScope simpleOp265 =null;
        ParserRuleReturnScope actualparametrepart2266 =null;
        ParserRuleReturnScope statementWithLabel268 =null;

        CommonTree string_literal264_tree=null;
        CommonTree char_literal267_tree=null;
        RewriteRuleTokenStream stream_ASSIGEMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGEMENT");
        RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
        RewriteRuleSubtreeStream stream_simpleOp=new RewriteRuleSubtreeStream(adaptor,"rule simpleOp");
        RewriteRuleSubtreeStream stream_statementWithLabel=new RewriteRuleSubtreeStream(adaptor,"rule statementWithLabel");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:331:20: ( ( ->) ':=' simpleOp -> ^( ':=' $statementLabelLoop simpleOp ) | actualparametrepart2 | ':' statementWithLabel -> statementWithLabel )
            int alt60=3;
            switch ( input.LA(1) ) {
                case ASSIGEMENT:
                {
                    alt60=1;
                }
                break;
                case ELSE:
                case END:
                case 68:
                case 71:
                {
                    alt60=2;
                }
                break;
                case BORNE:
                {
                    alt60=3;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);
                    throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:331:22: ( ->) ':=' simpleOp
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:331:22: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:331:23:
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
                        // 331:23: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    string_literal264=(Token)match(input,ASSIGEMENT,FOLLOW_ASSIGEMENT_in_statementLabelLoop2541);
                    stream_ASSIGEMENT.add(string_literal264);

                    pushFollow(FOLLOW_simpleOp_in_statementLabelLoop2544);
                    simpleOp265=simpleOp();
                    state._fsp--;

                    stream_simpleOp.add(simpleOp265.getTree());
                    // AST REWRITE
                    // elements: statementLabelLoop, simpleOp, ASSIGEMENT
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 331:51: -> ^( ':=' $statementLabelLoop simpleOp )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:331:53: ^( ':=' $statementLabelLoop simpleOp )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGEMENT.nextNode(), root_1);
                            adaptor.addChild(root_1, stream_retval.nextTree());
                            adaptor.addChild(root_1, stream_simpleOp.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:332:8: actualparametrepart2
                {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_actualparametrepart2_in_statementLabelLoop2562);
                    actualparametrepart2266=actualparametrepart2();
                    state._fsp--;

                    adaptor.addChild(root_0, actualparametrepart2266.getTree());

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:333:7: ':' statementWithLabel
                {
                    char_literal267=(Token)match(input,BORNE,FOLLOW_BORNE_in_statementLabelLoop2570);
                    stream_BORNE.add(char_literal267);

                    pushFollow(FOLLOW_statementWithLabel_in_statementLabelLoop2571);
                    statementWithLabel268=statementWithLabel();
                    state._fsp--;

                    stream_statementWithLabel.add(statementWithLabel268.getTree());
                    // AST REWRITE
                    // elements: statementWithLabel
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 333:28: -> statementWithLabel
                    {
                        adaptor.addChild(root_0, stream_statementWithLabel.nextTree());
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
    // $ANTLR end "statementLabelLoop"


    public static class forlist_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "forlist"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:336:1: forlist : forlistelement ( ',' forlistelement )* -> ( ^( FORLISTELEMENT forlistelement ) )+ ;
    public final AlgolParser.forlist_return forlist() throws RecognitionException {
        AlgolParser.forlist_return retval = new AlgolParser.forlist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal270=null;
        ParserRuleReturnScope forlistelement269 =null;
        ParserRuleReturnScope forlistelement271 =null;

        CommonTree char_literal270_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_forlistelement=new RewriteRuleSubtreeStream(adaptor,"rule forlistelement");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:336:9: ( forlistelement ( ',' forlistelement )* -> ( ^( FORLISTELEMENT forlistelement ) )+ )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:336:11: forlistelement ( ',' forlistelement )*
            {
                pushFollow(FOLLOW_forlistelement_in_forlist2593);
                forlistelement269=forlistelement();
                state._fsp--;

                stream_forlistelement.add(forlistelement269.getTree());
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:336:26: ( ',' forlistelement )*
                loop61:
                while (true) {
                    int alt61=2;
                    int LA61_0 = input.LA(1);
                    if ( (LA61_0==70) ) {
                        alt61=1;
                    }

                    switch (alt61) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:336:27: ',' forlistelement
                        {
                            char_literal270=(Token)match(input,70,FOLLOW_70_in_forlist2596);
                            stream_70.add(char_literal270);

                            pushFollow(FOLLOW_forlistelement_in_forlist2597);
                            forlistelement271=forlistelement();
                            state._fsp--;

                            stream_forlistelement.add(forlistelement271.getTree());
                        }
                        break;

                        default :
                            break loop61;
                    }
                }

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
                // 336:46: -> ( ^( FORLISTELEMENT forlistelement ) )+
                {
                    if ( !(stream_forlistelement.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_forlistelement.hasNext() ) {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:336:48: ^( FORLISTELEMENT forlistelement )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORLISTELEMENT, "FORLISTELEMENT"), root_1);
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
        return retval;
    }
    // $ANTLR end "forlist"


    public static class forlistelement_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "forlistelement"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:339:1: forlistelement : expression typeFor ;
    public final AlgolParser.forlistelement_return forlistelement() throws RecognitionException {
        AlgolParser.forlistelement_return retval = new AlgolParser.forlistelement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ParserRuleReturnScope expression272 =null;
        ParserRuleReturnScope typeFor273 =null;


        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:339:15: ( expression typeFor )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:339:16: expression typeFor
            {
                root_0 = (CommonTree)adaptor.nil();


                pushFollow(FOLLOW_expression_in_forlistelement2615);
                expression272=expression();
                state._fsp--;

                adaptor.addChild(root_0, expression272.getTree());

                pushFollow(FOLLOW_typeFor_in_forlistelement2617);
                typeFor273=typeFor();
                state._fsp--;

                adaptor.addChild(root_0, typeFor273.getTree());

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


    public static class typeFor_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "typeFor"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:342:1: typeFor : (| 'STEP' simpleAr 'UNTIL' expression -> ^( PAS simpleAr ^( UNTIL expression ) ) | 'WHILE' expression -> ^( WHILE expression ) );
    public final AlgolParser.typeFor_return typeFor() throws RecognitionException {
        AlgolParser.typeFor_return retval = new AlgolParser.typeFor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal274=null;
        Token string_literal276=null;
        Token string_literal278=null;
        ParserRuleReturnScope simpleAr275 =null;
        ParserRuleReturnScope expression277 =null;
        ParserRuleReturnScope expression279 =null;

        CommonTree string_literal274_tree=null;
        CommonTree string_literal276_tree=null;
        CommonTree string_literal278_tree=null;
        RewriteRuleTokenStream stream_PAS=new RewriteRuleTokenStream(adaptor,"token PAS");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_UNTIL=new RewriteRuleTokenStream(adaptor,"token UNTIL");
        RewriteRuleSubtreeStream stream_simpleAr=new RewriteRuleSubtreeStream(adaptor,"rule simpleAr");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:342:9: (| 'STEP' simpleAr 'UNTIL' expression -> ^( PAS simpleAr ^( UNTIL expression ) ) | 'WHILE' expression -> ^( WHILE expression ) )
            int alt62=3;
            switch ( input.LA(1) ) {
                case DO:
                case 70:
                {
                    alt62=1;
                }
                break;
                case PAS:
                {
                    alt62=2;
                }
                break;
                case WHILE:
                {
                    alt62=3;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);
                    throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:342:10:
                {
                    root_0 = (CommonTree)adaptor.nil();


                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:342:11: 'STEP' simpleAr 'UNTIL' expression
                {
                    string_literal274=(Token)match(input,PAS,FOLLOW_PAS_in_typeFor2637);
                    stream_PAS.add(string_literal274);

                    pushFollow(FOLLOW_simpleAr_in_typeFor2638);
                    simpleAr275=simpleAr();
                    state._fsp--;

                    stream_simpleAr.add(simpleAr275.getTree());
                    string_literal276=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_typeFor2640);
                    stream_UNTIL.add(string_literal276);

                    pushFollow(FOLLOW_expression_in_typeFor2641);
                    expression277=expression();
                    state._fsp--;

                    stream_expression.add(expression277.getTree());
                    // AST REWRITE
                    // elements: expression, simpleAr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 342:43: -> ^( PAS simpleAr ^( UNTIL expression ) )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:342:45: ^( PAS simpleAr ^( UNTIL expression ) )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PAS, "PAS"), root_1);
                            adaptor.addChild(root_1, stream_simpleAr.nextTree());
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:342:60: ^( UNTIL expression )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNTIL, "UNTIL"), root_2);
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
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:343:11: 'WHILE' expression
                {
                    string_literal278=(Token)match(input,WHILE,FOLLOW_WHILE_in_typeFor2665);
                    stream_WHILE.add(string_literal278);

                    pushFollow(FOLLOW_expression_in_typeFor2666);
                    expression279=expression();
                    state._fsp--;

                    stream_expression.add(expression279.getTree());
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
                    // 343:29: -> ^( WHILE expression )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:343:31: ^( WHILE expression )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);
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
        return retval;
    }
    // $ANTLR end "typeFor"


    public static class instructionsIfWithLabel_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "instructionsIfWithLabel"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:346:1: instructionsIfWithLabel : ( ID ( -> ID ) expressionWithId -> expressionWithId | INT ( -> INT ) expressionWithId -> expressionWithId | ( ->) gotostatement -> ^( LABEL $instructionsIfWithLabel gotostatement ) | ( ->) begin -> begin | 'FOR' simpleAr ':=' forlist 'DO' statement -> ^( FOR ^( ':=' simpleAr forlist ) ^( DO statement ) ) |);
    public final AlgolParser.instructionsIfWithLabel_return instructionsIfWithLabel() throws RecognitionException {
        AlgolParser.instructionsIfWithLabel_return retval = new AlgolParser.instructionsIfWithLabel_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID280=null;
        Token INT282=null;
        Token string_literal286=null;
        Token string_literal288=null;
        Token string_literal290=null;
        ParserRuleReturnScope expressionWithId281 =null;
        ParserRuleReturnScope expressionWithId283 =null;
        ParserRuleReturnScope gotostatement284 =null;
        ParserRuleReturnScope begin285 =null;
        ParserRuleReturnScope simpleAr287 =null;
        ParserRuleReturnScope forlist289 =null;
        ParserRuleReturnScope statement291 =null;

        CommonTree ID280_tree=null;
        CommonTree INT282_tree=null;
        CommonTree string_literal286_tree=null;
        CommonTree string_literal288_tree=null;
        CommonTree string_literal290_tree=null;
        RewriteRuleTokenStream stream_ASSIGEMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGEMENT");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_simpleAr=new RewriteRuleSubtreeStream(adaptor,"rule simpleAr");
        RewriteRuleSubtreeStream stream_gotostatement=new RewriteRuleSubtreeStream(adaptor,"rule gotostatement");
        RewriteRuleSubtreeStream stream_expressionWithId=new RewriteRuleSubtreeStream(adaptor,"rule expressionWithId");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forlist=new RewriteRuleSubtreeStream(adaptor,"rule forlist");
        RewriteRuleSubtreeStream stream_begin=new RewriteRuleSubtreeStream(adaptor,"rule begin");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:346:25: ( ID ( -> ID ) expressionWithId -> expressionWithId | INT ( -> INT ) expressionWithId -> expressionWithId | ( ->) gotostatement -> ^( LABEL $instructionsIfWithLabel gotostatement ) | ( ->) begin -> begin | 'FOR' simpleAr ':=' forlist 'DO' statement -> ^( FOR ^( ':=' simpleAr forlist ) ^( DO statement ) ) |)
            int alt63=6;
            switch ( input.LA(1) ) {
                case ID:
                {
                    alt63=1;
                }
                break;
                case INT:
                {
                    alt63=2;
                }
                break;
                case GOTO:
                {
                    alt63=3;
                }
                break;
                case BEGIN:
                {
                    alt63=4;
                }
                break;
                case FOR:
                {
                    alt63=5;
                }
                break;
                case ELSE:
                case END:
                case 71:
                {
                    alt63=6;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);
                    throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:346:28: ID ( -> ID ) expressionWithId
                {
                    ID280=(Token)match(input,ID,FOLLOW_ID_in_instructionsIfWithLabel2695);
                    stream_ID.add(ID280);

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:346:31: ( -> ID )
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:346:32:
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
                        // 346:32: -> ID
                        {
                            adaptor.addChild(root_0, stream_ID.nextNode());
                        }


                        retval.tree = root_0;

                    }

                    Idmemoire=retval.tree;
                    pushFollow(FOLLOW_expressionWithId_in_instructionsIfWithLabel2704);
                    expressionWithId281=expressionWithId();
                    state._fsp--;

                    stream_expressionWithId.add(expressionWithId281.getTree());
                    // AST REWRITE
                    // elements: expressionWithId
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 346:97: -> expressionWithId
                    {
                        adaptor.addChild(root_0, stream_expressionWithId.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:347:10: INT ( -> INT ) expressionWithId
                {
                    INT282=(Token)match(input,INT,FOLLOW_INT_in_instructionsIfWithLabel2717);
                    stream_INT.add(INT282);

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:347:14: ( -> INT )
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:347:15:
                    {
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
                        // 347:15: -> INT
                        {
                            adaptor.addChild(root_0, stream_INT.nextNode());
                        }


                        retval.tree = root_0;

                    }

                    Idmemoire=retval.tree;
                    pushFollow(FOLLOW_expressionWithId_in_instructionsIfWithLabel2726);
                    expressionWithId283=expressionWithId();
                    state._fsp--;

                    stream_expressionWithId.add(expressionWithId283.getTree());
                    // AST REWRITE
                    // elements: expressionWithId
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 347:81: -> expressionWithId
                    {
                        adaptor.addChild(root_0, stream_expressionWithId.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:348:4: ( ->) gotostatement
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:348:4: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:348:5:
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
                        // 348:5: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    pushFollow(FOLLOW_gotostatement_in_instructionsIfWithLabel2738);
                    gotostatement284=gotostatement();
                    state._fsp--;

                    stream_gotostatement.add(gotostatement284.getTree());
                    // AST REWRITE
                    // elements: gotostatement, instructionsIfWithLabel
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 348:33: -> ^( LABEL $instructionsIfWithLabel gotostatement )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:348:35: ^( LABEL $instructionsIfWithLabel gotostatement )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, "LABEL"), root_1);
                            adaptor.addChild(root_1, stream_retval.nextTree());
                            adaptor.addChild(root_1, stream_gotostatement.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 4 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:349:3: ( ->) begin
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:349:3: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:349:4:
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
                        // 349:4: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    pushFollow(FOLLOW_begin_in_instructionsIfWithLabel2755);
                    begin285=begin();
                    state._fsp--;

                    stream_begin.add(begin285.getTree());
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
                    // 349:23: -> begin
                    {
                        adaptor.addChild(root_0, stream_begin.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 5 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:350:4: 'FOR' simpleAr ':=' forlist 'DO' statement
                {
                    string_literal286=(Token)match(input,FOR,FOLLOW_FOR_in_instructionsIfWithLabel2762);
                    stream_FOR.add(string_literal286);

                    pushFollow(FOLLOW_simpleAr_in_instructionsIfWithLabel2764);
                    simpleAr287=simpleAr();
                    state._fsp--;

                    stream_simpleAr.add(simpleAr287.getTree());
                    string_literal288=(Token)match(input,ASSIGEMENT,FOLLOW_ASSIGEMENT_in_instructionsIfWithLabel2766);
                    stream_ASSIGEMENT.add(string_literal288);

                    pushFollow(FOLLOW_forlist_in_instructionsIfWithLabel2768);
                    forlist289=forlist();
                    state._fsp--;

                    stream_forlist.add(forlist289.getTree());
                    string_literal290=(Token)match(input,DO,FOLLOW_DO_in_instructionsIfWithLabel2770);
                    stream_DO.add(string_literal290);

                    pushFollow(FOLLOW_statement_in_instructionsIfWithLabel2772);
                    statement291=statement();
                    state._fsp--;

                    stream_statement.add(statement291.getTree());
                    // AST REWRITE
                    // elements: forlist, ASSIGEMENT, statement, simpleAr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 350:47: -> ^( FOR ^( ':=' simpleAr forlist ) ^( DO statement ) )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:350:50: ^( FOR ^( ':=' simpleAr forlist ) ^( DO statement ) )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:350:57: ^( ':=' simpleAr forlist )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot(stream_ASSIGEMENT.nextNode(), root_2);
                                adaptor.addChild(root_2, stream_simpleAr.nextTree());
                                adaptor.addChild(root_2, stream_forlist.nextTree());
                                adaptor.addChild(root_1, root_2);
                            }

                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:350:82: ^( DO statement )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DO, "DO"), root_2);
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
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:352:2:
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
    // $ANTLR end "instructionsIfWithLabel"


    public static class instructionsIf_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "instructionsIf"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:354:1: instructionsIf : ( 'FOR' simpleAr ':=' forlist 'DO' statement -> ^( FOR ^( ':=' simpleAr forlist ) ^( DO statement ) ) | ID ( -> ID ) instructionsIfWithID -> instructionsIfWithID | INT ( -> INT ) instructionsIfWithID -> instructionsIfWithID | gotostatement -> gotostatement | begin -> begin |);
    public final AlgolParser.instructionsIf_return instructionsIf() throws RecognitionException {
        AlgolParser.instructionsIf_return retval = new AlgolParser.instructionsIf_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal292=null;
        Token string_literal294=null;
        Token string_literal296=null;
        Token ID298=null;
        Token INT300=null;
        ParserRuleReturnScope simpleAr293 =null;
        ParserRuleReturnScope forlist295 =null;
        ParserRuleReturnScope statement297 =null;
        ParserRuleReturnScope instructionsIfWithID299 =null;
        ParserRuleReturnScope instructionsIfWithID301 =null;
        ParserRuleReturnScope gotostatement302 =null;
        ParserRuleReturnScope begin303 =null;

        CommonTree string_literal292_tree=null;
        CommonTree string_literal294_tree=null;
        CommonTree string_literal296_tree=null;
        CommonTree ID298_tree=null;
        CommonTree INT300_tree=null;
        RewriteRuleTokenStream stream_ASSIGEMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGEMENT");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_simpleAr=new RewriteRuleSubtreeStream(adaptor,"rule simpleAr");
        RewriteRuleSubtreeStream stream_gotostatement=new RewriteRuleSubtreeStream(adaptor,"rule gotostatement");
        RewriteRuleSubtreeStream stream_instructionsIfWithID=new RewriteRuleSubtreeStream(adaptor,"rule instructionsIfWithID");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forlist=new RewriteRuleSubtreeStream(adaptor,"rule forlist");
        RewriteRuleSubtreeStream stream_begin=new RewriteRuleSubtreeStream(adaptor,"rule begin");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:354:16: ( 'FOR' simpleAr ':=' forlist 'DO' statement -> ^( FOR ^( ':=' simpleAr forlist ) ^( DO statement ) ) | ID ( -> ID ) instructionsIfWithID -> instructionsIfWithID | INT ( -> INT ) instructionsIfWithID -> instructionsIfWithID | gotostatement -> gotostatement | begin -> begin |)
            int alt64=6;
            switch ( input.LA(1) ) {
                case FOR:
                {
                    alt64=1;
                }
                break;
                case ID:
                {
                    alt64=2;
                }
                break;
                case INT:
                {
                    alt64=3;
                }
                break;
                case GOTO:
                {
                    alt64=4;
                }
                break;
                case BEGIN:
                {
                    alt64=5;
                }
                break;
                case ELSE:
                case END:
                case 71:
                {
                    alt64=6;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);
                    throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:354:20: 'FOR' simpleAr ':=' forlist 'DO' statement
                {
                    string_literal292=(Token)match(input,FOR,FOLLOW_FOR_in_instructionsIf2809);
                    stream_FOR.add(string_literal292);

                    pushFollow(FOLLOW_simpleAr_in_instructionsIf2811);
                    simpleAr293=simpleAr();
                    state._fsp--;

                    stream_simpleAr.add(simpleAr293.getTree());
                    string_literal294=(Token)match(input,ASSIGEMENT,FOLLOW_ASSIGEMENT_in_instructionsIf2813);
                    stream_ASSIGEMENT.add(string_literal294);

                    pushFollow(FOLLOW_forlist_in_instructionsIf2815);
                    forlist295=forlist();
                    state._fsp--;

                    stream_forlist.add(forlist295.getTree());
                    string_literal296=(Token)match(input,DO,FOLLOW_DO_in_instructionsIf2817);
                    stream_DO.add(string_literal296);

                    pushFollow(FOLLOW_statement_in_instructionsIf2819);
                    statement297=statement();
                    state._fsp--;

                    stream_statement.add(statement297.getTree());
                    // AST REWRITE
                    // elements: statement, forlist, ASSIGEMENT, simpleAr
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 354:63: -> ^( FOR ^( ':=' simpleAr forlist ) ^( DO statement ) )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:354:66: ^( FOR ^( ':=' simpleAr forlist ) ^( DO statement ) )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:354:72: ^( ':=' simpleAr forlist )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot(stream_ASSIGEMENT.nextNode(), root_2);
                                adaptor.addChild(root_2, stream_simpleAr.nextTree());
                                adaptor.addChild(root_2, stream_forlist.nextTree());
                                adaptor.addChild(root_1, root_2);
                            }

                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:354:97: ^( DO statement )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DO, "DO"), root_2);
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
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:355:21: ID ( -> ID ) instructionsIfWithID
                {
                    ID298=(Token)match(input,ID,FOLLOW_ID_in_instructionsIf2861);
                    stream_ID.add(ID298);

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:355:24: ( -> ID )
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:355:25:
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
                        // 355:25: -> ID
                        {
                            adaptor.addChild(root_0, stream_ID.nextNode());
                        }


                        retval.tree = root_0;

                    }

                    Idmemoire=retval.tree;
                    pushFollow(FOLLOW_instructionsIfWithID_in_instructionsIf2870);
                    instructionsIfWithID299=instructionsIfWithID();
                    state._fsp--;

                    stream_instructionsIfWithID.add(instructionsIfWithID299.getTree());
                    // AST REWRITE
                    // elements: instructionsIfWithID
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 355:86: -> instructionsIfWithID
                    {
                        adaptor.addChild(root_0, stream_instructionsIfWithID.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 3 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:356:20: INT ( -> INT ) instructionsIfWithID
                {
                    INT300=(Token)match(input,INT,FOLLOW_INT_in_instructionsIf2896);
                    stream_INT.add(INT300);

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:356:24: ( -> INT )
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:356:25:
                    {
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
                        // 356:25: -> INT
                        {
                            adaptor.addChild(root_0, stream_INT.nextNode());
                        }


                        retval.tree = root_0;

                    }

                    Idmemoire=retval.tree;
                    pushFollow(FOLLOW_instructionsIfWithID_in_instructionsIf2905);
                    instructionsIfWithID301=instructionsIfWithID();
                    state._fsp--;

                    stream_instructionsIfWithID.add(instructionsIfWithID301.getTree());
                    // AST REWRITE
                    // elements: instructionsIfWithID
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 356:87: -> instructionsIfWithID
                    {
                        adaptor.addChild(root_0, stream_instructionsIfWithID.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 4 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:357:22: gotostatement
                {
                    pushFollow(FOLLOW_gotostatement_in_instructionsIf2933);
                    gotostatement302=gotostatement();
                    state._fsp--;

                    stream_gotostatement.add(gotostatement302.getTree());
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
                    // 357:36: -> gotostatement
                    {
                        adaptor.addChild(root_0, stream_gotostatement.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 5 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:358:20: begin
                {
                    pushFollow(FOLLOW_begin_in_instructionsIf2958);
                    begin303=begin();
                    state._fsp--;

                    stream_begin.add(begin303.getTree());
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
                    // 358:26: -> begin
                    {
                        adaptor.addChild(root_0, stream_begin.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 6 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:360:2:
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
    // $ANTLR end "instructionsIf"


    public static class instructionsIfWithID_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "instructionsIfWithID"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:362:1: instructionsIfWithID : ( ( ->) expressionWithId -> expressionWithId | ( ->) ':' instructionsIfLabelLoop -> instructionsIfLabelLoop );
    public final AlgolParser.instructionsIfWithID_return instructionsIfWithID() throws RecognitionException {
        AlgolParser.instructionsIfWithID_return retval = new AlgolParser.instructionsIfWithID_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal305=null;
        ParserRuleReturnScope expressionWithId304 =null;
        ParserRuleReturnScope instructionsIfLabelLoop306 =null;

        CommonTree char_literal305_tree=null;
        RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
        RewriteRuleSubtreeStream stream_expressionWithId=new RewriteRuleSubtreeStream(adaptor,"rule expressionWithId");
        RewriteRuleSubtreeStream stream_instructionsIfLabelLoop=new RewriteRuleSubtreeStream(adaptor,"rule instructionsIfLabelLoop");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:362:22: ( ( ->) expressionWithId -> expressionWithId | ( ->) ':' instructionsIfLabelLoop -> instructionsIfLabelLoop )
            int alt65=2;
            int LA65_0 = input.LA(1);
            if ( (LA65_0==ASSIGEMENT||(LA65_0 >= ELSE && LA65_0 <= END)||LA65_0==68||LA65_0==71) ) {
                alt65=1;
            }
            else if ( (LA65_0==BORNE) ) {
                alt65=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 65, 0, input);
                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:362:24: ( ->) expressionWithId
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:362:24: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:362:25:
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
                        // 362:25: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    pushFollow(FOLLOW_expressionWithId_in_instructionsIfWithID2996);
                    expressionWithId304=expressionWithId();
                    state._fsp--;

                    stream_expressionWithId.add(expressionWithId304.getTree());
                    // AST REWRITE
                    // elements: expressionWithId
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 362:56: -> expressionWithId
                    {
                        adaptor.addChild(root_0, stream_expressionWithId.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:363:18: ( ->) ':' instructionsIfLabelLoop
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:363:18: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:363:19:
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
                        // 363:19: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    char_literal305=(Token)match(input,BORNE,FOLLOW_BORNE_in_instructionsIfWithID3023);
                    stream_BORNE.add(char_literal305);

                    pushFollow(FOLLOW_instructionsIfLabelLoop_in_instructionsIfWithID3025);
                    instructionsIfLabelLoop306=instructionsIfLabelLoop();
                    state._fsp--;

                    stream_instructionsIfLabelLoop.add(instructionsIfLabelLoop306.getTree());
                    // AST REWRITE
                    // elements: instructionsIfLabelLoop
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 363:60: -> instructionsIfLabelLoop
                    {
                        adaptor.addChild(root_0, stream_instructionsIfLabelLoop.nextTree());
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
    // $ANTLR end "instructionsIfWithID"


    public static class expressionWithId_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "expressionWithId"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:366:1: expressionWithId : ( ( ->) ':=' simpleOp -> ^( ':=' $expressionWithId simpleOp ) | ( ->) actualparametrepart2 );
    public final AlgolParser.expressionWithId_return expressionWithId() throws RecognitionException {
        AlgolParser.expressionWithId_return retval = new AlgolParser.expressionWithId_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal307=null;
        ParserRuleReturnScope simpleOp308 =null;
        ParserRuleReturnScope actualparametrepart2309 =null;

        CommonTree string_literal307_tree=null;
        RewriteRuleTokenStream stream_ASSIGEMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGEMENT");
        RewriteRuleSubtreeStream stream_simpleOp=new RewriteRuleSubtreeStream(adaptor,"rule simpleOp");
        RewriteRuleSubtreeStream stream_actualparametrepart2=new RewriteRuleSubtreeStream(adaptor,"rule actualparametrepart2");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:366:19: ( ( ->) ':=' simpleOp -> ^( ':=' $expressionWithId simpleOp ) | ( ->) actualparametrepart2 )
            int alt66=2;
            int LA66_0 = input.LA(1);
            if ( (LA66_0==ASSIGEMENT) ) {
                alt66=1;
            }
            else if ( ((LA66_0 >= ELSE && LA66_0 <= END)||LA66_0==68||LA66_0==71) ) {
                alt66=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 66, 0, input);
                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:366:21: ( ->) ':=' simpleOp
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:366:21: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:366:22:
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
                        // 366:22: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    string_literal307=(Token)match(input,ASSIGEMENT,FOLLOW_ASSIGEMENT_in_expressionWithId3042);
                    stream_ASSIGEMENT.add(string_literal307);

                    pushFollow(FOLLOW_simpleOp_in_expressionWithId3045);
                    simpleOp308=simpleOp();
                    state._fsp--;

                    stream_simpleOp.add(simpleOp308.getTree());
                    // AST REWRITE
                    // elements: expressionWithId, simpleOp, ASSIGEMENT
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 366:51: -> ^( ':=' $expressionWithId simpleOp )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:366:53: ^( ':=' $expressionWithId simpleOp )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGEMENT.nextNode(), root_1);
                            adaptor.addChild(root_1, stream_retval.nextTree());
                            adaptor.addChild(root_1, stream_simpleOp.nextTree());
                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:367:4: ( ->) actualparametrepart2
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:367:4: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:367:5:
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
                        // 367:5: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    pushFollow(FOLLOW_actualparametrepart2_in_expressionWithId3066);
                    actualparametrepart2309=actualparametrepart2();
                    state._fsp--;

                    stream_actualparametrepart2.add(actualparametrepart2309.getTree());
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
    // $ANTLR end "expressionWithId"


    public static class instructionsIfLabelLoop_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "instructionsIfLabelLoop"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:370:1: instructionsIfLabelLoop : ( ( ->) instructionsIfWithLabel -> instructionsIfWithLabel | ':' instructionsIfLabelLoop -> instructionsIfLabelLoop );
    public final AlgolParser.instructionsIfLabelLoop_return instructionsIfLabelLoop() throws RecognitionException {
        AlgolParser.instructionsIfLabelLoop_return retval = new AlgolParser.instructionsIfLabelLoop_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal311=null;
        ParserRuleReturnScope instructionsIfWithLabel310 =null;
        ParserRuleReturnScope instructionsIfLabelLoop312 =null;

        CommonTree char_literal311_tree=null;
        RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
        RewriteRuleSubtreeStream stream_instructionsIfLabelLoop=new RewriteRuleSubtreeStream(adaptor,"rule instructionsIfLabelLoop");
        RewriteRuleSubtreeStream stream_instructionsIfWithLabel=new RewriteRuleSubtreeStream(adaptor,"rule instructionsIfWithLabel");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:370:25: ( ( ->) instructionsIfWithLabel -> instructionsIfWithLabel | ':' instructionsIfLabelLoop -> instructionsIfLabelLoop )
            int alt67=2;
            int LA67_0 = input.LA(1);
            if ( (LA67_0==BEGIN||(LA67_0 >= ELSE && LA67_0 <= END)||LA67_0==FOR||LA67_0==GOTO||LA67_0==ID||LA67_0==INT||LA67_0==71) ) {
                alt67=1;
            }
            else if ( (LA67_0==BORNE) ) {
                alt67=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 67, 0, input);
                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:370:26: ( ->) instructionsIfWithLabel
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:370:26: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:370:27:
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
                        // 370:27: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    pushFollow(FOLLOW_instructionsIfWithLabel_in_instructionsIfLabelLoop3080);
                    instructionsIfWithLabel310=instructionsIfWithLabel();
                    state._fsp--;

                    stream_instructionsIfWithLabel.add(instructionsIfWithLabel310.getTree());
                    // AST REWRITE
                    // elements: instructionsIfWithLabel
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 370:66: -> instructionsIfWithLabel
                    {
                        adaptor.addChild(root_0, stream_instructionsIfWithLabel.nextTree());
                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:371:3: ':' instructionsIfLabelLoop
                {
                    char_literal311=(Token)match(input,BORNE,FOLLOW_BORNE_in_instructionsIfLabelLoop3088);
                    stream_BORNE.add(char_literal311);

                    pushFollow(FOLLOW_instructionsIfLabelLoop_in_instructionsIfLabelLoop3090);
                    instructionsIfLabelLoop312=instructionsIfLabelLoop();
                    state._fsp--;

                    stream_instructionsIfLabelLoop.add(instructionsIfLabelLoop312.getTree());
                    // AST REWRITE
                    // elements: instructionsIfLabelLoop
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 371:30: -> instructionsIfLabelLoop
                    {
                        adaptor.addChild(root_0, stream_instructionsIfLabelLoop.nextTree());
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
    // $ANTLR end "instructionsIfLabelLoop"


    public static class actualparametrepart_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "actualparametrepart"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:374:1: actualparametrepart : ( ->) '(' actualparalist ')' ( ID ':' '(' actualparalist ')' )* -> ^( CALL $actualparametrepart actualparalist ( ^( LISTPARA ID actualparalist ) )* ) ;
    public final AlgolParser.actualparametrepart_return actualparametrepart() throws RecognitionException {
        AlgolParser.actualparametrepart_return retval = new AlgolParser.actualparametrepart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal313=null;
        Token char_literal315=null;
        Token ID316=null;
        Token char_literal317=null;
        Token char_literal318=null;
        Token char_literal320=null;
        ParserRuleReturnScope actualparalist314 =null;
        ParserRuleReturnScope actualparalist319 =null;

        CommonTree char_literal313_tree=null;
        CommonTree char_literal315_tree=null;
        CommonTree ID316_tree=null;
        CommonTree char_literal317_tree=null;
        CommonTree char_literal318_tree=null;
        CommonTree char_literal320_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_actualparalist=new RewriteRuleSubtreeStream(adaptor,"rule actualparalist");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:375:2: ( ( ->) '(' actualparalist ')' ( ID ':' '(' actualparalist ')' )* -> ^( CALL $actualparametrepart actualparalist ( ^( LISTPARA ID actualparalist ) )* ) )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:375:4: ( ->) '(' actualparalist ')' ( ID ':' '(' actualparalist ')' )*
            {
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:375:4: ( ->)
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:375:5:
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
                        adaptor.addChild(root_0, Idmemoire);
                    }


                    retval.tree = root_0;

                }

                char_literal313=(Token)match(input,68,FOLLOW_68_in_actualparametrepart3107);
                stream_68.add(char_literal313);

                pushFollow(FOLLOW_actualparalist_in_actualparametrepart3109);
                actualparalist314=actualparalist();
                state._fsp--;

                stream_actualparalist.add(actualparalist314.getTree());
                char_literal315=(Token)match(input,69,FOLLOW_69_in_actualparametrepart3110);
                stream_69.add(char_literal315);

                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:375:41: ( ID ':' '(' actualparalist ')' )*
                loop68:
                while (true) {
                    int alt68=2;
                    int LA68_0 = input.LA(1);
                    if ( (LA68_0==ID) ) {
                        alt68=1;
                    }

                    switch (alt68) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:375:42: ID ':' '(' actualparalist ')'
                        {
                            ID316=(Token)match(input,ID,FOLLOW_ID_in_actualparametrepart3113);
                            stream_ID.add(ID316);

                            char_literal317=(Token)match(input,BORNE,FOLLOW_BORNE_in_actualparametrepart3115);
                            stream_BORNE.add(char_literal317);

                            char_literal318=(Token)match(input,68,FOLLOW_68_in_actualparametrepart3116);
                            stream_68.add(char_literal318);

                            pushFollow(FOLLOW_actualparalist_in_actualparametrepart3118);
                            actualparalist319=actualparalist();
                            state._fsp--;

                            stream_actualparalist.add(actualparalist319.getTree());
                            char_literal320=(Token)match(input,69,FOLLOW_69_in_actualparametrepart3120);
                            stream_69.add(char_literal320);

                        }
                        break;

                        default :
                            break loop68;
                    }
                }

                // AST REWRITE
                // elements: actualparalist, actualparametrepart, actualparalist, ID
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                root_0 = (CommonTree)adaptor.nil();
                // 375:73: -> ^( CALL $actualparametrepart actualparalist ( ^( LISTPARA ID actualparalist ) )* )
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:375:75: ^( CALL $actualparametrepart actualparalist ( ^( LISTPARA ID actualparalist ) )* )
                    {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);
                        adaptor.addChild(root_1, stream_retval.nextTree());
                        adaptor.addChild(root_1, stream_actualparalist.nextTree());
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:375:118: ( ^( LISTPARA ID actualparalist ) )*
                        while ( stream_actualparalist.hasNext()||stream_ID.hasNext() ) {
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:375:118: ^( LISTPARA ID actualparalist )
                            {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTPARA, "LISTPARA"), root_2);
                                adaptor.addChild(root_2, stream_ID.nextNode());
                                adaptor.addChild(root_2, stream_actualparalist.nextTree());
                                adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_actualparalist.reset();
                        stream_ID.reset();

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
    // $ANTLR end "actualparametrepart"


    public static class actualparametrepart2_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "actualparametrepart2"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:379:1: actualparametrepart2 : ( ( ->) '(' actualparalist ')' ( ID ':' '(' actualparalist ')' )* -> ^( CALL $actualparametrepart2 actualparalist ( ^( LISTPARA ID actualparalist ) )* ) | ( ->) -> ^( LABEL $actualparametrepart2) );
    public final AlgolParser.actualparametrepart2_return actualparametrepart2() throws RecognitionException {
        AlgolParser.actualparametrepart2_return retval = new AlgolParser.actualparametrepart2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal321=null;
        Token char_literal323=null;
        Token ID324=null;
        Token char_literal325=null;
        Token char_literal326=null;
        Token char_literal328=null;
        ParserRuleReturnScope actualparalist322 =null;
        ParserRuleReturnScope actualparalist327 =null;

        CommonTree char_literal321_tree=null;
        CommonTree char_literal323_tree=null;
        CommonTree ID324_tree=null;
        CommonTree char_literal325_tree=null;
        CommonTree char_literal326_tree=null;
        CommonTree char_literal328_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_BORNE=new RewriteRuleTokenStream(adaptor,"token BORNE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_actualparalist=new RewriteRuleSubtreeStream(adaptor,"rule actualparalist");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:380:2: ( ( ->) '(' actualparalist ')' ( ID ':' '(' actualparalist ')' )* -> ^( CALL $actualparametrepart2 actualparalist ( ^( LISTPARA ID actualparalist ) )* ) | ( ->) -> ^( LABEL $actualparametrepart2) )
            int alt70=2;
            int LA70_0 = input.LA(1);
            if ( (LA70_0==68) ) {
                alt70=1;
            }
            else if ( ((LA70_0 >= ELSE && LA70_0 <= END)||LA70_0==71) ) {
                alt70=2;
            }

            else {
                NoViableAltException nvae =
                        new NoViableAltException("", 70, 0, input);
                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:380:4: ( ->) '(' actualparalist ')' ( ID ':' '(' actualparalist ')' )*
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:380:4: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:380:5:
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
                        // 380:5: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    char_literal321=(Token)match(input,68,FOLLOW_68_in_actualparametrepart23158);
                    stream_68.add(char_literal321);

                    pushFollow(FOLLOW_actualparalist_in_actualparametrepart23160);
                    actualparalist322=actualparalist();
                    state._fsp--;

                    stream_actualparalist.add(actualparalist322.getTree());
                    char_literal323=(Token)match(input,69,FOLLOW_69_in_actualparametrepart23161);
                    stream_69.add(char_literal323);

                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:380:41: ( ID ':' '(' actualparalist ')' )*
                    loop69:
                    while (true) {
                        int alt69=2;
                        int LA69_0 = input.LA(1);
                        if ( (LA69_0==ID) ) {
                            alt69=1;
                        }

                        switch (alt69) {
                            case 1 :
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:380:42: ID ':' '(' actualparalist ')'
                            {
                                ID324=(Token)match(input,ID,FOLLOW_ID_in_actualparametrepart23164);
                                stream_ID.add(ID324);

                                char_literal325=(Token)match(input,BORNE,FOLLOW_BORNE_in_actualparametrepart23166);
                                stream_BORNE.add(char_literal325);

                                char_literal326=(Token)match(input,68,FOLLOW_68_in_actualparametrepart23167);
                                stream_68.add(char_literal326);

                                pushFollow(FOLLOW_actualparalist_in_actualparametrepart23169);
                                actualparalist327=actualparalist();
                                state._fsp--;

                                stream_actualparalist.add(actualparalist327.getTree());
                                char_literal328=(Token)match(input,69,FOLLOW_69_in_actualparametrepart23171);
                                stream_69.add(char_literal328);

                            }
                            break;

                            default :
                                break loop69;
                        }
                    }

                    // AST REWRITE
                    // elements: actualparalist, actualparalist, ID, actualparametrepart2
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 380:73: -> ^( CALL $actualparametrepart2 actualparalist ( ^( LISTPARA ID actualparalist ) )* )
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:380:75: ^( CALL $actualparametrepart2 actualparalist ( ^( LISTPARA ID actualparalist ) )* )
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);
                            adaptor.addChild(root_1, stream_retval.nextTree());
                            adaptor.addChild(root_1, stream_actualparalist.nextTree());
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:380:119: ( ^( LISTPARA ID actualparalist ) )*
                            while ( stream_actualparalist.hasNext()||stream_ID.hasNext() ) {
                                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:380:119: ^( LISTPARA ID actualparalist )
                                {
                                    CommonTree root_2 = (CommonTree)adaptor.nil();
                                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTPARA, "LISTPARA"), root_2);
                                    adaptor.addChild(root_2, stream_ID.nextNode());
                                    adaptor.addChild(root_2, stream_actualparalist.nextTree());
                                    adaptor.addChild(root_1, root_2);
                                }

                            }
                            stream_actualparalist.reset();
                            stream_ID.reset();

                            adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                }
                break;
                case 2 :
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:381:3: ( ->)
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:381:3: ( ->)
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:381:4:
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
                        // 381:4: ->
                        {
                            adaptor.addChild(root_0, Idmemoire);
                        }


                        retval.tree = root_0;

                    }

                    // AST REWRITE
                    // elements: actualparametrepart2
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 381:18: -> ^( LABEL $actualparametrepart2)
                    {
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:381:21: ^( LABEL $actualparametrepart2)
                        {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LABEL, "LABEL"), root_1);
                            adaptor.addChild(root_1, stream_retval.nextTree());
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
    // $ANTLR end "actualparametrepart2"


    public static class actualparalist_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "actualparalist"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:384:1: actualparalist : actualpara ( ',' actualpara )* -> ^( LISTARG ( actualpara )* ) ;
    public final AlgolParser.actualparalist_return actualparalist() throws RecognitionException {
        AlgolParser.actualparalist_return retval = new AlgolParser.actualparalist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal330=null;
        ParserRuleReturnScope actualpara329 =null;
        ParserRuleReturnScope actualpara331 =null;

        CommonTree char_literal330_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_actualpara=new RewriteRuleSubtreeStream(adaptor,"rule actualpara");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:385:2: ( actualpara ( ',' actualpara )* -> ^( LISTARG ( actualpara )* ) )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:385:4: actualpara ( ',' actualpara )*
            {
                pushFollow(FOLLOW_actualpara_in_actualparalist3219);
                actualpara329=actualpara();
                state._fsp--;

                stream_actualpara.add(actualpara329.getTree());
                // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:385:15: ( ',' actualpara )*
                loop71:
                while (true) {
                    int alt71=2;
                    int LA71_0 = input.LA(1);
                    if ( (LA71_0==70) ) {
                        alt71=1;
                    }

                    switch (alt71) {
                        case 1 :
                            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:385:16: ',' actualpara
                        {
                            char_literal330=(Token)match(input,70,FOLLOW_70_in_actualparalist3222);
                            stream_70.add(char_literal330);

                            pushFollow(FOLLOW_actualpara_in_actualparalist3224);
                            actualpara331=actualpara();
                            state._fsp--;

                            stream_actualpara.add(actualpara331.getTree());
                        }
                        break;

                        default :
                            break loop71;
                    }
                }

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
                // 385:32: -> ^( LISTARG ( actualpara )* )
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:385:34: ^( LISTARG ( actualpara )* )
                    {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTARG, "LISTARG"), root_1);
                        // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:385:44: ( actualpara )*
                        while ( stream_actualpara.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "actualparalist"


    public static class actualpara_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "actualpara"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:388:1: actualpara : expression2 -> expression2 ;
    public final AlgolParser.actualpara_return actualpara() throws RecognitionException {
        AlgolParser.actualpara_return retval = new AlgolParser.actualpara_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ParserRuleReturnScope expression2332 =null;

        RewriteRuleSubtreeStream stream_expression2=new RewriteRuleSubtreeStream(adaptor,"rule expression2");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:389:2: ( expression2 -> expression2 )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:389:4: expression2
            {
                pushFollow(FOLLOW_expression2_in_actualpara3245);
                expression2332=expression2();
                state._fsp--;

                stream_expression2.add(expression2332.getTree());
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
                // 389:15: -> expression2
                {
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
        return retval;
    }
    // $ANTLR end "actualpara"


    public static class gotostatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        @Override
        public CommonTree getTree() { return tree; }
    };


    // $ANTLR start "gotostatement"
    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:392:1: gotostatement : 'GOTO' designExp -> ^( GOTO designExp ) ;
    public final AlgolParser.gotostatement_return gotostatement() throws RecognitionException {
        AlgolParser.gotostatement_return retval = new AlgolParser.gotostatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal333=null;
        ParserRuleReturnScope designExp334 =null;

        CommonTree string_literal333_tree=null;
        RewriteRuleTokenStream stream_GOTO=new RewriteRuleTokenStream(adaptor,"token GOTO");
        RewriteRuleSubtreeStream stream_designExp=new RewriteRuleSubtreeStream(adaptor,"rule designExp");

        try {
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:393:2: ( 'GOTO' designExp -> ^( GOTO designExp ) )
            // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:393:4: 'GOTO' designExp
            {
                string_literal333=(Token)match(input,GOTO,FOLLOW_GOTO_in_gotostatement3259);
                stream_GOTO.add(string_literal333);

                pushFollow(FOLLOW_designExp_in_gotostatement3261);
                designExp334=designExp();
                state._fsp--;

                stream_designExp.add(designExp334.getTree());
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
                // 393:20: -> ^( GOTO designExp )
                {
                    // C:\\Users\\lataw\\Downloads\\Oberti2u-master\\Oberti2u-master\\Algol.g:393:23: ^( GOTO designExp )
                    {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GOTO, "GOTO"), root_1);
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
        return retval;
    }
    // $ANTLR end "gotostatement"

    // Delegated rules



    public static final BitSet FOLLOW_prog1_in_prog285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_in_prog1305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_prog1330 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_BORNE_in_prog1332 = new BitSet(new long[]{0x0000000480000400L});
    public static final BitSet FOLLOW_begin_in_prog1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_begin388 = new BitSet(new long[]{0x7111000594004480L,0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_begin390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_block431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_block433 = new BitSet(new long[]{0x7111000594004480L,0x0000000000000010L});
    public static final BitSet FOLLOW_declaration_in_block436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_block438 = new BitSet(new long[]{0x7111000594004480L,0x0000000000000010L});
    public static final BitSet FOLLOW_compoundT_in_block442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundT_in_block460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localorown_in_declaration478 = new BitSet(new long[]{0x0010000480000080L});
    public static final BitSet FOLLOW_typedeclaration_in_declaration480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedeclaration2_in_declaration497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchdec_in_declaration515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localorown529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OWN_in_localorown531 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_type_in_localorown533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeliste597 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_typeliste600 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_identifier_in_typeliste602 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_arrayseg_in_arraylist624 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_arraylist626 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_arrayseg_in_arraylist627 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_arrayseg644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000240L});
    public static final BitSet FOLLOW_arrayConstructor_in_arrayseg653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_arrayConstructor690 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_boundplist_in_arrayConstructor692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_arrayConstructor693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_arrayConstructor708 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_arrayseg_in_arrayConstructor710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boundp_in_boundplist724 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_boundplist727 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_boundp_in_boundplist729 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_simpleAr_in_boundp747 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_BORNE_in_boundp749 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleAr_in_boundp751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeliste_in_typedeclaration770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_typedeclaration773 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_arraylist_in_typedeclaration775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_typedeclaration784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_typedeclaration2794 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_arraylist_in_typedeclaration2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_typedeclaration2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchdec817 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_identifier_in_switchdec819 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGEMENT_in_switchdec821 = new BitSet(new long[]{0x0000000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_switchlist_in_switchdec823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_designExp_in_switchlist853 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_switchlist856 = new BitSet(new long[]{0x0000000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_designExp_in_switchlist857 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedure872 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_procedurehead_in_procedure874 = new BitSet(new long[]{0x0000000594004400L,0x0000000000000010L});
    public static final BitSet FOLLOW_statement_in_procedure876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_procedurehead900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_formalparameterpart_in_procedurehead902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_procedurehead904 = new BitSet(new long[]{0x7190000800000080L,0x0000000000000100L});
    public static final BitSet FOLLOW_valuepart_in_procedurehead907 = new BitSet(new long[]{0x7190000800000080L});
    public static final BitSet FOLLOW_specificationpart_in_procedurehead909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_formalparameterpart932 = new BitSet(new long[]{0x0088000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_formalparameterlist_in_formalparameterpart934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_formalparameterpart936 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ID_in_formalparameterpart939 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_BORNE_in_formalparameterpart941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_formalparameterpart942 = new BitSet(new long[]{0x0088000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_formalparameterlist_in_formalparameterpart944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_formalparameterpart946 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_specifier_in_specificationpart970 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_identifierlist_in_specificationpart972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_specificationpart974 = new BitSet(new long[]{0x7190000800000082L});
    public static final BitSet FOLLOW_specifier_in_specificationpart977 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_identifierlist_in_specificationpart979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_specificationpart981 = new BitSet(new long[]{0x7190000800000082L});
    public static final BitSet FOLLOW_identifier_in_identifierlist1006 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_identifierlist1009 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_identifier_in_identifierlist1010 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_in_specifier1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_specifier1032 = new BitSet(new long[]{0x0010000000000080L});
    public static final BitSet FOLLOW_specifierType_in_specifier1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_specifier1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LABEL_in_specifier1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_specifier1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_specifier1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_specifierType1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_specifierType1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalpara_in_formalparameterlist1090 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_formalparameterlist1093 = new BitSet(new long[]{0x0088000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_formalpara_in_formalparameterlist1095 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_expression2_in_formalpara1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_valuepart1123 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_identifier2_in_valuepart1125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_valuepart1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier21157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_identifier21159 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_identifier21160 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_simpleOp_in_expression1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_expression1186 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_expression1188 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_THEN_in_expression1190 = new BitSet(new long[]{0x0000000480040000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleDesign_in_expression1192 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ELSE_in_expression1194 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_expression1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleLogEquiv_in_simpleOp1225 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ASSIGEMENT_in_simpleOp1227 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleLogAndOr_in_simpleOp1230 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_simpleLogImplication_in_simpleLogEquiv1244 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_EQUIV_in_simpleLogEquiv1246 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleLogImplication_in_simpleLogEquiv1249 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_simpleLogAndOr_in_simpleLogImplication1263 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_IMPL_in_simpleLogImplication1265 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleLogAndOr_in_simpleLogImplication1268 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_simpleLog_in_simpleLogAndOr1282 = new BitSet(new long[]{0x0000800000000042L});
    public static final BitSet FOLLOW_AND_in_simpleLogAndOr1285 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_simpleLogAndOr1288 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleLog_in_simpleLogAndOr1291 = new BitSet(new long[]{0x0000800000000042L});
    public static final BitSet FOLLOW_simpleAr_in_simpleLog1305 = new BitSet(new long[]{0x0000381020100002L});
    public static final BitSet FOLLOW_GREATER_in_simpleLog1308 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LESS_in_simpleLog1311 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_EQUAL_in_simpleLog1314 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOTLESS_in_simpleLog1317 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOTGREATER_in_simpleLog1320 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOTEQUAL_in_simpleLog1323 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleAr_in_simpleLog1326 = new BitSet(new long[]{0x0000381020100002L});
    public static final BitSet FOLLOW_multExp_in_simpleAr1341 = new BitSet(new long[]{0x0004010000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleAr1344 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_MINUS_in_simpleAr1347 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_multExp_in_simpleAr1351 = new BitSet(new long[]{0x0004010000000002L});
    public static final BitSet FOLLOW_multExpPower_in_multExp1362 = new BitSet(new long[]{0x0000020000010002L});
    public static final BitSet FOLLOW_MULT_in_multExp1365 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DIV_in_multExp1368 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_multExpPower_in_multExp1371 = new BitSet(new long[]{0x0000020000010002L});
    public static final BitSet FOLLOW_atom_in_multExpPower1384 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_POWER_in_multExpPower1386 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_atom_in_multExpPower1389 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_68_in_atom1412 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_atom1414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_atom1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_atom1478 = new BitSet(new long[]{0x0880040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_atom_in_atom1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000210L});
    public static final BitSet FOLLOW_beginwithID_in_atom1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualparametrepart_in_beginwithID1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_beginwithID1548 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_beginwithID1549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000440L});
    public static final BitSet FOLLOW_70_in_beginwithID1552 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_beginwithID1554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000460L});
    public static final BitSet FOLLOW_69_in_beginwithID1556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000440L});
    public static final BitSet FOLLOW_74_in_beginwithID1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleARi2_in_expression21593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_expression21599 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_expression21601 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_THEN_in_expression21603 = new BitSet(new long[]{0x0000000480040000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleDesign_in_expression21605 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ELSE_in_expression21607 = new BitSet(new long[]{0x0088000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression2_in_expression21609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExp2_in_simpleARi21641 = new BitSet(new long[]{0x0004010000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleARi21644 = new BitSet(new long[]{0x0088000480000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_MINUS_in_simpleARi21649 = new BitSet(new long[]{0x0088000480000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_multExp2_in_simpleARi21653 = new BitSet(new long[]{0x0004010000000002L});
    public static final BitSet FOLLOW_multExpPower2_in_multExp21669 = new BitSet(new long[]{0x0000020000010002L});
    public static final BitSet FOLLOW_MULT_in_multExp21672 = new BitSet(new long[]{0x0088000480000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DIV_in_multExp21677 = new BitSet(new long[]{0x0088000480000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_multExpPower2_in_multExp21681 = new BitSet(new long[]{0x0000020000010002L});
    public static final BitSet FOLLOW_atom2_in_multExpPower21694 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_POWER_in_multExpPower21696 = new BitSet(new long[]{0x0088000480000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_atom2_in_multExpPower21699 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ID_in_atom21723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000210L});
    public static final BitSet FOLLOW_beginwithID_in_atom21732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom21748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom21762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_atom21775 = new BitSet(new long[]{0x0088000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression2_in_atom21777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_atom21779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier1794 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_beginwithID2_in_identifier1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_identifier1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_beginwithID21824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_beginwithID21851 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_beginwithID21852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000440L});
    public static final BitSet FOLLOW_70_in_beginwithID21855 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_beginwithID21857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000440L});
    public static final BitSet FOLLOW_74_in_beginwithID21860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleDesign_in_designExp1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_designExp1918 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_designExp1920 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_THEN_in_designExp1922 = new BitSet(new long[]{0x0000000480040000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleDesign_in_designExp1924 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ELSE_in_designExp1926 = new BitSet(new long[]{0x0000000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_designExp_in_designExp1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleDesign1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_simpleDesign1965 = new BitSet(new long[]{0x0000000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_designExp_in_simpleDesign1967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_simpleDesign1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_compoundT1981 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000080L});
    public static final BitSet FOLLOW_compoundTFacto_in_compoundT1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_compoundTFacto1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_compoundTFacto2004 = new BitSet(new long[]{0x0000000594004400L,0x0000000000000010L});
    public static final BitSet FOLLOW_compoundT_in_compoundTFacto2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memoire_in_statement2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gotostatement_in_statement2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_statement2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement2035 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_statement2037 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_THEN_in_statement2039 = new BitSet(new long[]{0x0000000494040400L});
    public static final BitSet FOLLOW_instructionsIf_in_statement2041 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ELSE_in_statement2052 = new BitSet(new long[]{0x0000000594004400L,0x0000000000000010L});
    public static final BitSet FOLLOW_statement_in_statement2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement2079 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleAr_in_statement2081 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGEMENT_in_statement2083 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_forlist_in_statement2085 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DO_in_statement2087 = new BitSet(new long[]{0x0000000594004400L,0x0000000000000010L});
    public static final BitSet FOLLOW_statement_in_statement2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_in_statement2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualparametrepart_in_statement2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_memoire2130 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000210L});
    public static final BitSet FOLLOW_statementWithID_in_memoire2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_memoire2150 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000210L});
    public static final BitSet FOLLOW_statementWithID_in_memoire2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT2_in_comment2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGEMENT_in_statementWithID2185 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleOp_in_statementWithID2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualparametrepart2_in_statementWithID2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_statementWithID2209 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_statementWithID2210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000440L});
    public static final BitSet FOLLOW_70_in_statementWithID2213 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_statementWithID2215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000440L});
    public static final BitSet FOLLOW_74_in_statementWithID2218 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGEMENT_in_statementWithID2220 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleOp_in_statementWithID2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BORNE_in_statementWithID2255 = new BitSet(new long[]{0x0000000594005400L,0x0000000000000010L});
    public static final BitSet FOLLOW_statementWithLabel_in_statementWithID2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label2_in_statementWithLabel2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gotostatement_in_statementWithLabel2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_statementWithLabel2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statementWithLabel2316 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_statementWithLabel2318 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_THEN_in_statementWithLabel2320 = new BitSet(new long[]{0x0000000494000400L});
    public static final BitSet FOLLOW_instructionsIf_in_statementWithLabel2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statementWithLabel2349 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleAr_in_statementWithLabel2351 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGEMENT_in_statementWithLabel2353 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_forlist_in_statementWithLabel2355 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DO_in_statementWithLabel2357 = new BitSet(new long[]{0x0000000594004400L,0x0000000000000010L});
    public static final BitSet FOLLOW_statement_in_statementWithLabel2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_in_statementWithLabel2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualparametrepart2_in_statementWithLabel2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BORNE_in_statementWithLabel2415 = new BitSet(new long[]{0x0000000594005400L,0x0000000000000010L});
    public static final BitSet FOLLOW_statementWithLabel_in_statementWithLabel2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label22487 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000010L});
    public static final BitSet FOLLOW_statementLabelLoop_in_label22495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_label22515 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000010L});
    public static final BitSet FOLLOW_statementLabelLoop_in_label22524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGEMENT_in_statementLabelLoop2541 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleOp_in_statementLabelLoop2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualparametrepart2_in_statementLabelLoop2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BORNE_in_statementLabelLoop2570 = new BitSet(new long[]{0x0000000594005400L,0x0000000000000010L});
    public static final BitSet FOLLOW_statementWithLabel_in_statementLabelLoop2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forlistelement_in_forlist2593 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_forlist2596 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_forlistelement_in_forlist2597 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_expression_in_forlistelement2615 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeFor_in_forlistelement2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAS_in_typeFor2637 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleAr_in_typeFor2638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_UNTIL_in_typeFor2640 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_typeFor2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_typeFor2665 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_typeFor2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_instructionsIfWithLabel2695 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000010L});
    public static final BitSet FOLLOW_expressionWithId_in_instructionsIfWithLabel2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_instructionsIfWithLabel2717 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000010L});
    public static final BitSet FOLLOW_expressionWithId_in_instructionsIfWithLabel2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gotostatement_in_instructionsIfWithLabel2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_in_instructionsIfWithLabel2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_instructionsIfWithLabel2762 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleAr_in_instructionsIfWithLabel2764 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGEMENT_in_instructionsIfWithLabel2766 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_forlist_in_instructionsIfWithLabel2768 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DO_in_instructionsIfWithLabel2770 = new BitSet(new long[]{0x0000000594004400L,0x0000000000000010L});
    public static final BitSet FOLLOW_statement_in_instructionsIfWithLabel2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_instructionsIf2809 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleAr_in_instructionsIf2811 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGEMENT_in_instructionsIf2813 = new BitSet(new long[]{0x0888040583000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_forlist_in_instructionsIf2815 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DO_in_instructionsIf2817 = new BitSet(new long[]{0x0000000594004400L,0x0000000000000010L});
    public static final BitSet FOLLOW_statement_in_instructionsIf2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_instructionsIf2861 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000010L});
    public static final BitSet FOLLOW_instructionsIfWithID_in_instructionsIf2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_instructionsIf2896 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000010L});
    public static final BitSet FOLLOW_instructionsIfWithID_in_instructionsIf2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gotostatement_in_instructionsIf2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_in_instructionsIf2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionWithId_in_instructionsIfWithID2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BORNE_in_instructionsIfWithID3023 = new BitSet(new long[]{0x0000000494001400L});
    public static final BitSet FOLLOW_instructionsIfLabelLoop_in_instructionsIfWithID3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGEMENT_in_expressionWithId3042 = new BitSet(new long[]{0x0888040483000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_simpleOp_in_expressionWithId3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualparametrepart2_in_expressionWithId3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instructionsIfWithLabel_in_instructionsIfLabelLoop3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BORNE_in_instructionsIfLabelLoop3088 = new BitSet(new long[]{0x0000000494001400L});
    public static final BitSet FOLLOW_instructionsIfLabelLoop_in_instructionsIfLabelLoop3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_actualparametrepart3107 = new BitSet(new long[]{0x0088000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_actualparalist_in_actualparametrepart3109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_actualparametrepart3110 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ID_in_actualparametrepart3113 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_BORNE_in_actualparametrepart3115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_actualparametrepart3116 = new BitSet(new long[]{0x0088000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_actualparalist_in_actualparametrepart3118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_actualparametrepart3120 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_68_in_actualparametrepart23158 = new BitSet(new long[]{0x0088000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_actualparalist_in_actualparametrepart23160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_actualparametrepart23161 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ID_in_actualparametrepart23164 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_BORNE_in_actualparametrepart23166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_actualparametrepart23167 = new BitSet(new long[]{0x0088000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_actualparalist_in_actualparametrepart23169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_actualparametrepart23171 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_actualpara_in_actualparalist3219 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_actualparalist3222 = new BitSet(new long[]{0x0088000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_actualpara_in_actualparalist3224 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_expression2_in_actualpara3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_gotostatement3259 = new BitSet(new long[]{0x0000000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_designExp_in_gotostatement3261 = new BitSet(new long[]{0x0000000000000002L});
}
