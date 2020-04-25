package src.com.company;



import src.generation.Compiler;
import src.generation.Generator;
import src.generation.*;
import src.grammar.*;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "" + args[0];
        String outSt = "tds.txt";
        String out = ""+ args[1];

        AlgolLexer lex = new AlgolLexer(new ANTLRFileStream(source, "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        AlgolParser g = new AlgolParser(tokens);

        try {
            AlgolParser.prog_return ret = g.prog();
            Tree root = (Tree)ret.getTree();
            src.TDS.TreeTraversal treeTraversal = new src.TDS.TreeTraversal(root);

            src.TDS.tableDesSymboles symbolTable = treeTraversal.buildSymbolTable(null,"Root");


            if(!outSt.equals("")) {
               BufferedWriter writer = new BufferedWriter(new FileWriter(outSt));
                writer.write(symbolTable.toTable().toString());
               writer.close();
            }

            File sourceFile = new File(source);
            File genFile = new File(out);

            Generator generator = new Generator(sourceFile, genFile, symbolTable);

            generator.generate(root);

            Compiler compiler = new Compiler(genFile);

            compiler.compile();

        } catch (RecognitionException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
