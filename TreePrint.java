import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;



public class TreePrint {
    public static void main(String[] args) throws Exception {
        String fileName = "./Tests/Test3.txt";
        File file = new File(fileName);
        FileInputStream fis = null;
        fis = new FileInputStream(file);
        ANTLRInputStream input = new ANTLRInputStream(fis);
        CharStream stream = input;
        FINALLexer lexer = new FINALLexer(stream);
        FINALParser parser = new FINALParser(new CommonTokenStream(lexer));
        FINALParser.prog_return returnValue = parser.prog();
        CommonTree tree = (CommonTree)returnValue.getTree();
	      String STree = tree.toStringTree();

        String indentation = "";
        for (int i = 0; i < STree.length(); i++) {
            if(STree.charAt(i) == '('){
                indentation = indentation + "-";
                System.out.print("\n" + indentation);
            }
            else if(STree.charAt(i) == ')'){
                indentation = indentation.substring(0, indentation.length() - 1);
            }
            else if(STree.charAt(i) == ' '){
              System.out.print(" ");
            }
            else
              System.out.print(STree.charAt(i));
        }
    }
}
