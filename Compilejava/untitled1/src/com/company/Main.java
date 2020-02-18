package com.company;



import antlr.collections.Stack;
import generation.Compiler;
import generation.Generator;
import generation.*;
import grammar.*;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import TDS.*;

//import TDS.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException,  RecognitionException {
        String source = "C:\\Users\\lataw\\FUCKINGFNALPCL\\Oberti2u\\Compilejava\\untitled1\\out\\artifacts\\compile_jar\\integer0.Algol";
        String outSt = "C:\\Users\\lataw\\FUCKINGFNALPCL\\Oberti2u\\Compilejava\\untitled1\\out\\artifacts\\compile_jar\\tds.txt";
        String out = "gen1.txt";

        AlgolLexer lex = new AlgolLexer(new ANTLRFileStream(source, "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        AlgolParser g = new AlgolParser(tokens);

        try {
            AlgolParser.prog_return ret = g.prog();
            Tree root = (Tree)ret.getTree();
            TDS.TreeTraversal treeTraversal = new TDS.TreeTraversal(root);
           //Stack t= (Stack) treeTraversal.gestionnaireTDS.getStack();

            TDS.tableDesSymboles symbolTable = treeTraversal.buildSymbolTable(null,"Root");

            if(!outSt.equals("")) {
               BufferedWriter writer = new BufferedWriter(new FileWriter(outSt));
                writer.write(symbolTable.toTable());
               writer.close();
            }

            File sourceFile = new File(source);
            File genFile = new File(out);
            Generator generator = new Generator(sourceFile, genFile, symbolTable);
            //generator.generate(root);

           // Compiler compiler = new Compiler(genFile);
           // compiler.compile();
        } catch (RecognitionException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
