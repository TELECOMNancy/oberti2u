import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        AlgolLexer lex = new AlgolLexer(new ANTLRFileStream("/media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/output/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        AlgolParser g = new AlgolParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}