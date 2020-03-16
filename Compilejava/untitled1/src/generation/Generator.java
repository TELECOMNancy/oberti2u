package generation;

import antlr.actions.cpp.ActionLexer;
import grammar.tigerLexer;
import grammar.AlgolParser;
import grammar.AlgolLexer;
import grammar.tigerParser;
import javafx.util.Pair;
import org.antlr.runtime.tree.Tree;
import TDS.tableDesSymboles;
import TDS.SymbolFonction;
import TDS.SymboleStructure;
import TDS.SymboleVariable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class Generator {

    private final BufferedStringBuilder code;


    private final tableDesSymboles symbolTable;

    private final RegistersManager registersManager;
    private final EnvironmentManager environmentManager;
    private final SourceManager sourceManager;
    private Stack<SymbolFonction> usedFunctions;
    private String currentFunction;

    public Generator(File sourceFile, File genFile, tableDesSymboles symbolTable ) throws FileNotFoundException {
        if(genFile.exists() && genFile.length() > 0) {
            genFile.delete();
        }

        this.code = new BufferedStringBuilder(new FileOutputStream(genFile));
        this.symbolTable = symbolTable;
        this.registersManager = new RegistersManager(0, 10);
        this.environmentManager = new EnvironmentManager();
        this.sourceManager = new SourceManager(sourceFile);
        this.usedFunctions = new Stack<>();
    }


    public void generate(Tree root ) throws IOException {

          Tree newroot= root.getChild(0).getChild(1);


        this.code
                .append("// Registres usuels")
                .append("SP EQU R15")
                .append("WR EQU R14")
                .append("BP EQU R13")
                .append("// Trappes usuelles")
                .append("EXIT_EXC EQU 64")
                .append("READ_EXC EQU 65")
                .append("WRITE_EXC EQU 66")
                .append("// Definitions de la valeur NULL")
                .append("NUL EQU 0")
                .append("NULL EQU 0")
                .append("NIL EQU 0")
                .append("// Adresse debut de la pile")
                .append("STACK_ADDRS EQU 0x1000")
                .append("// Adresse debut de programme")
                .append("LOAD_ADDRS EQU 0xF000")
                .append("ORG LOAD_ADDRS");
                
                
                
        this.code.append("START IN_");
        
        
        this.code
        .append("LDW SP, #STACK_ADDRS")
        .append("LDW BP, #NIL");


        this.generatePrintFunction();
        this.generatePrintiFunction();
        this.generateItoaFunction();
        //System.out.println(root.getChild(0).getText());
        for(int i = 0; i < root.getChild(0).getChildCount(); i++) {
            Tree child = root.getChild(0).getChild(i);
            
           
           if ( child.getType()== AlgolLexer.PROCEDURE) {
        	   //String functionIdf = child.getChild(0).getText();

              // this.generateFunction(child, this.symbolTable.getFunctionSymbol(functionIdf, true));
           }
            
        }
        this.code.append("IN_");

        while(!this.registersManager.getreturnRegister().isEmpty()){
        	this.registersManager.unlockRegister();

        }
        this.registersManager.lockRegister();
        Tree region =null;
        Environment environment3 = this.environmentManager.createEnvironment(this.symbolTable.getEnvironmentSize());
        environment3.openEnvironment(this.code);
        for(int i=0;i<root.getChild(0).getChildCount();i++){
            if(root.getChild(0).getChild(i).getText().equals("BLOCK")){
                region=root.getChild(0).getChild(i);
            }
        }
        for(int i = 0; i < region.getChildCount(); i++) {
            Tree child = region.getChild(i)/*.getChild(i)*/;
            
           if (child.getType()== AlgolLexer.ASSIGEMENT) {
              // this.generateAssig(child, this.symbolTable);
           }
           /*else{if ( child.getType()== AlgolLexer.BLOCK) {
               for(int j = 0; j < child.getChild(0).getChild(0).getChildCount()-1; j++) {
                   this.generateAssig(child.getChild(0).getChild(0).getChild(j), this.symbolTable);
               }

           }}*/
           else {
               //this.generateBloc(child,this.symbolTable);
            }

        }
        System.out.println(this.registersManager.getreturnRegister().size());
        this.generateBloc(region,this.symbolTable);
        //this.generateBloc(newroot, this.symbolTable);
        this.environmentManager.closeEnvironment(this.code);

        this.code
        .append("TRP #EXIT_EXC")
        .append("JEA @IN_");
        this.code.close();
    }

    private List<String> genratedFunction = new ArrayList<>();


    private void generateFunction(Tree functionNode, SymbolFonction functionSymbol) throws IOException {
        this.currentFunction = functionSymbol.getName();
        String nom = functionSymbol.getName();
        String functionLabel = functionSymbol.getName() + "_";

        this.code
                .append(functionLabel);

       
        Environment environment = this.environmentManager.createEnvironment(functionSymbol.getSymbolTable().getEnvironmentSize());
        environment.openEnvironment(this.code);

      
        this.generateBloc(
                functionNode.getChild(3),
                functionSymbol.getSymbolTable()
        );
        
        this.code
                .append(nom + "_end");
       
        this.environmentManager.closeEnvironment(this.code);

       
            this.code
                    .append("RTS");
        
    }

    private void generateBloc(Tree blocNode, tableDesSymboles currentSymbolTable) throws IOException {
        for(int i = 0; i <blocNode.getChildCount(); i++) {
           // System.out.println("yoo"+blocNode.getChild(i).getText());
            Tree child = blocNode.getChild(i);
            switch (child.getType()) {
            case AlgolLexer.BEGIN:
            	if (child.getChild(0).getType()== AlgolLexer.PROCEDURE){
            		
            		 String functionIdf = child.getChild(0).getChild(0).getText();
            		 
            		 this.code.append("JMP #"+functionIdf+"_end_end"+"-$-2");

                     this.generateFunction(child.getChild(0), currentSymbolTable.getFunctionSymbol(functionIdf, true));
                     this.code.append(functionIdf+"_end_end");
            	}
            	else {
            	    System.out.println("wawawa");
            	    this.generateBloc(child.getChild(child.getChildCount()-1),currentSymbolTable);
            	//this.generateAssig(child.getChild(0).getChild(0),currentSymbolTable);
            	}
                break;

                case AlgolLexer.ASSIGEMENT:
                    ///System.out.println("wawawa");
                    this.generateAssig(child, currentSymbolTable);
                    break;
                case AlgolLexer.WHILE:
                    this.generateWhile(child, currentSymbolTable);
                    break;
                case AlgolLexer.FOR:
                    this.generateFor(child, currentSymbolTable);
                    break;
                case AlgolLexer.IF:
                    ///System.out.println("iffff");
                    this.generateIf(child, currentSymbolTable);
                    System.out.println(this.registersManager.getreturnRegister().size());
                    break;

                case AlgolLexer.CALL:
                    this.generateFunctionCall(child,currentSymbolTable);
                    break;
                case tigerLexer.DO:
                case tigerLexer.IN:
                case tigerLexer.BODY:
                case tigerLexer.BLOCK:
                //case tigerLexer.BLOCKF:
                case tigerLexer.SEQEXP:

                    this.generateBloc(child, currentSymbolTable);
                    break;

                  default : this.generateExpr(child, currentSymbolTable);
                  break;
            }
        }
    }



    private void generateWhile(Tree whileNode, tableDesSymboles currentSymbolTable) throws IOException {
        Tree condition = whileNode.getChild(0).getChild(0);
        
        Tree bloc = whileNode.getChild(1);

        String label = "while" + whileNode.hashCode();
        String beginLabel = "begin_cond_" + label;
        String endLabel = "end_cond_" + label;

        this.code
                .append(beginLabel);

        this.generateExpr(condition, currentSymbolTable);

        int r0 = this.registersManager.unlockRegister();
        this.code
                .append("// cond")
                .append("TST R" +r0)
                .append("JEQ #" + endLabel + "-$-2");

        this.generateBloc(bloc, currentSymbolTable);

        this.code
                .append("JMP #" + beginLabel + "-$-2")
                .append(endLabel);
    }
    
    
    
    private void generateFor(Tree forNode, tableDesSymboles currentSymbolTable) throws IOException {
        Tree condition = forNode.getChild(0).getChild(1).getChild(0).getChild(1).getChild(1).getChild(0);//forNode.getChild(1).getChild(0);
        Tree assig= forNode.getChild(0);

        Tree bloc = forNode.getChild(1);
        
        String label = "For" + forNode.hashCode();
        String beginLabel = "begin_cond_" + label;
        String endLabel = "end_cond_" + label;


        this.generateAssig(assig, currentSymbolTable);
        
        

        this.code
        .append(beginLabel);
          	 //this.generateExpr(condition.getParent().getParent().getChild(0).getChild(0),currentSymbolTable);
          	 
          	this.generateExpr(forNode.getChild(0).getChild(0),currentSymbolTable);
               this.generateExpr(condition, currentSymbolTable);
               int r2 = this.registersManager.unlockRegister();
               int r1 = this.registersManager.unlockRegister();

               String op="BGT ";
              
              int r3 = this.registersManager.lockRegister();

               this.code
                       .append("CMP R" + r1 + ", R" + r2)
                       .append(op + endLabel+ "-$-2");


       int r0 = this.registersManager.unlockRegister();

       //
        //
        //
        //
        //System.out.println("YOO"+bloc.getText());
        this.generateBloc(bloc, currentSymbolTable);
        System.out.println("YOO"+bloc.getText());
        this.code.append("// " + forNode.getChild(0).getChild(0).getText() +"="+forNode.getChild(0).getChild(0).getText()+"+1") ;
        System.out.println("ICCC"+bloc.getText());
        this.generateExpr(forNode.getChild(0).getChild(0), currentSymbolTable);

        String op1="ADQ";
        
       
        this.code
                .append(op1 +" 1"+", R"+r1);
        Pair<Integer, SymboleVariable> temp = this.getOffset(forNode.getChild(0).getChild(0), currentSymbolTable);
        int offset = temp.getKey();
        
        this.code
               .append("STW R" + r1 + ", (BP)-" + offset + "");
      
        this.code
                .append("BMP " + beginLabel + "-$-2")
                .append(endLabel);
    }
    

   private Pair<Integer, SymboleVariable> getOffset(Tree variableNode, tableDesSymboles currentSymbolTable) {
	    int offset = 0;
        Stack<Pair<String, Integer>> nodes = new Stack<>();
        Tree currentNode = variableNode;
        //System.out.println(currentNode.getText());
        nodes.push(new Pair<>(currentNode.getText(), 0));
        String idf = nodes.pop().getKey();

        SymboleVariable variableSymbol = currentSymbolTable.getVariableSymbol(idf, true);
        ///currentSymbolTable.get
        offset += variableSymbol.getOffset();

        return new Pair<>(offset, variableSymbol);
    }

    private void generateIf(Tree ifNode, tableDesSymboles currentSymbolTable) throws IOException {
        Tree condition = ifNode.getChild(0);
        Tree bloc = ifNode.getChild(1);

        String label = "if" + ifNode.hashCode();
        String beginLabel = "begin_cond_" + label;
        String endLabel = "end_cond_" + label;
        String endifLabel = "end_cond_if_" + label;

        this.code
                .append(beginLabel);

        this.generateExpr(condition, currentSymbolTable);
        int r0 = this.registersManager.unlockRegister();
        this.code
                .append("// cond")
                .append("TST R" + r0)
                .append("JEQ #" + endLabel + "-$-2");

        this.generateBloc(bloc, currentSymbolTable);
        this.code
                .append("JMP #" + endifLabel + "-$-2")
                .append(endLabel);

        
        if (ifNode.getChildCount() > 2) {
        //    System.out.println("yoo"+this.registersManager.getreturnRegister().size());
        	this.registersManager.unlockRegister();
            //System.out.println("yoo"+this.registersManager.getreturnRegister().size());
            this.generateBloc(ifNode.getChild(2), currentSymbolTable);
           // System.out.println("yoo"+this.registersManager.getreturnRegister().size());

        }

        this.code
                .append(endifLabel);
    }

    private void generateAssig(Tree ASSIgNode, tableDesSymboles currentSymbolTable) throws IOException {
        System.out.println("ICCi"+ASSIgNode.getChild(0).getText());
    	Pair<Integer, SymboleVariable> temp = this.getOffset(ASSIgNode.getChild(0), currentSymbolTable);
        int offset = temp.getKey();
        SymboleVariable variableSymbol = temp.getValue();

            if(ASSIgNode.getChildCount() > 1) {
                if(this.sourceManager.getLine(ASSIgNode.getLine()).contains("IF")){
                    this.code.append("//"+ASSIgNode.getChild(0).getText()+ASSIgNode.getText()+ASSIgNode.getChild(1).getText());
                }
                else {
                    this.code
                            .append("// " + this.sourceManager.getLine(ASSIgNode.getLine()));
                }


                if (ASSIgNode.getChild(1).getType()==AlgolLexer.STRING){
                	this.generateExpr(ASSIgNode.getChild(1), currentSymbolTable);
                	int r0=this.registersManager.unlockRegister();
                    
                    String bp;
                    if(offset < 0) {
                        bp = String.valueOf(-offset);
                    }
                    else {
                        bp = "-" + offset;
                    }
                	this.code
                    .append("STW R" + r0 + ", (BP)" + bp + "");
                }
                else {
                    if (ASSIgNode.getChild(1).getText().equals("LISTFOR")) {
                        this.generateExpr(ASSIgNode.getChild(1).getChild(0).getChild(0),currentSymbolTable);
                        int r0 = this.registersManager.unlockRegister();
                        String bp;
                        if (offset < 0) {
                            bp = String.valueOf(-offset);
                        } else {
                            bp = "-" + offset;
                        }

                        this.code
                                .append("STW R" + r0 + ", (BP)" + bp + "");
                    }
                    else {
                        this.generateExpr(ASSIgNode.getChild(1), currentSymbolTable);

                        int r0 = this.registersManager.unlockRegister();

                        String bp;
                        if (offset < 0) {
                            bp = String.valueOf(-offset);
                        } else {
                            bp = "-" + offset;
                        }

                        this.code
                                .append("STW R" + r0 + ", (BP)" + bp + "");

                    }
                }
            }

    }

    private void generateExpr(Tree exprNode, tableDesSymboles currentSymbolTable) throws IOException {
        switch(exprNode.getType()) {
            case AlgolLexer.AND:
                this.generateAnd(exprNode, currentSymbolTable);
                break;
            case AlgolLexer.OR:
                this.generateOr(exprNode, currentSymbolTable);
                break;
            case AlgolLexer.LESS:
            case AlgolParser.NOTLESS:
            case AlgolParser.GREATER:
            case AlgolParser.NOTGREATER:
            case AlgolParser.EQUAL:
            case AlgolParser.NOTEQUAL:
                this.generateLogicalExpr(exprNode, currentSymbolTable);
                break;
            case AlgolParser.NOT:
                break;
            case AlgolParser.ASSIGEMENT:
                this.generateAssig(exprNode, currentSymbolTable);
                break;
            case AlgolParser.PLUS:
            case AlgolParser.MINUS:
            case AlgolParser.MULT:
            case AlgolParser.DIV:
                this.generateArithmeticExpr(exprNode, currentSymbolTable);
                break;
            case AlgolParser.CALL:
                this.generateFunctionCall(exprNode, currentSymbolTable);
                break;
            /*case tigerLexer.OR:
            case tigerLexer.AND:
            case tigerLexer.EQ:
            case tigerLexer.LE:
            case tigerLexer.LT:
            case tigerLexer.GE:
            case tigerLexer.GT:
                this.generateLogicalExpr(exprNode, currentSymbolTable);
                break;
            case tigerLexer.PLUS:
            //case tigerLexer.MOINS:
            case tigerLexer.MULT:
            case tigerLexer.DIV:
                this.generateArithmeticExpr(exprNode, currentSymbolTable);
                break;
            case tigerLexer.NEGATION:
                this.generateUnaryMinus(exprNode, currentSymbolTable);
                break;
 
            case tigerLexer.APPELFONCTION:
                this.generateFunctionCall(exprNode, currentSymbolTable);
                break;*/
            
            case AlgolLexer.INT:
            case AlgolLexer.STRING :
            case AlgolLexer.ID:
                this.generateAssignation(exprNode, currentSymbolTable);
                break;
        }
    }

  
    private void generatePrintCas(Tree Node, tableDesSymboles currentSymbolTable)throws IOException{
      //  System.out.println("okkkk");
    	switch (Node.getType()) {
    		case AlgolLexer.STRING :
    			generatePrint(Node,currentSymbolTable);
    			break;
    		case AlgolLexer.CALL :
    			SymbolFonction symbolFonction = currentSymbolTable.getFunctionSymbol(Node.getChild(0).getText(), true) ;
    			String typeRetour = symbolFonction.getReturnType().getType().getToken();
    			if (typeRetour.equals("string)")){
    				generatePrint(Node,currentSymbolTable);
    			}else{
    				generatePrinti(Node,currentSymbolTable);
    			}
    			break;
    		case AlgolLexer.ID :
             //   System.out.println("okkk111");
    			SymboleVariable symbolVar = currentSymbolTable.getVariableSymbol(Node.getText(),true);
    			String type = symbolVar.getType();
    			if (type.equals("STRING")){
    				generatePrint(Node,currentSymbolTable);
    			}else{
    				generatePrinti(Node,currentSymbolTable);
    			}
    			break;
    	}
    		
    }
    
    
    
  

    private void generateFunctionCall(Tree functionCallNode, tableDesSymboles currentSymbolTable) throws IOException {
        String functionIdf = functionCallNode.getChild(0).getText();
      // System.out.println(functionIdf);
        if (functionIdf.equals("outinteger")){
            //System.out.println(functionIdf);
        	this.generatePrintCas(functionCallNode.getChild(1).getChild(1),currentSymbolTable);
        }
        else{

        if (!this.genratedFunction.contains(functionIdf)) {
            this.genratedFunction.add(functionIdf);
            this.usedFunctions.push(currentSymbolTable.getFunctionSymbol(functionIdf, true));
        }
        int nbParametre = functionCallNode.getChildCount()-1;
        this.code
                .append("//Appel de la fonction : " + functionCallNode.getChild(0).getText())
                .append("//Gestion des potentiels paramètres");

        if (nbParametre > 0){
            for(int i = nbParametre; i>0; i--){
                //System.out.println(this.registersManager.getreturnRegister().size());
                this.generateExpr(functionCallNode.getChild(i), currentSymbolTable);
                
                
                int register = this.registersManager.unlockRegister();

                this.code
                        .append("STW R" + register + ", -(SP)       //On empile les paramètres de la fonction appelée");
            }
        }

        String functionName = functionCallNode.getChild(0).getText()+"_";

        this.code
                    .append("JSR @"+ functionName +"          //on appelle la fonction à l'aide de son adresse");

        if (nbParametre>0) {
            this.code
                .append("ADQ 2*" + nbParametre + ", SP");
        }
        }

        //this.registersManager.lockRegister();
    }


    private void generateAssignation(Tree exprNode, tableDesSymboles currentSymbolTable) throws IOException {
        int register = this.registersManager.lockRegister();

        switch (exprNode.getType()) {
            case AlgolLexer.ID:
                SymboleVariable variableSymbol = currentSymbolTable.getVariableSymbol(exprNode.getText(), true);

               int offset = variableSymbol.getOffset();
                String bp;

                if(offset < 0) {
                    bp = String.valueOf(-offset);
                }
                else {
                    bp = "-" + offset;
                }

                this.code
                        .append("LDW R" + register + ", (BP)" + bp);
                break;
            case AlgolLexer.INT:
                int value = Integer.parseInt(exprNode.getText());

                if(value >= -128 && value <= 127) {
                    this.code
                            .append("LDQ " + value + ", R" + register + "");
                }
                else {
                    this.code
                            .append("LDW R" + register + ", #" + value);
                }
                break;
            case AlgolLexer.STRING:
            	this.code
                .append("STRING"+exprNode.hashCode() + " string "+ exprNode.getText())
            	.append("LDW R"+register+",#"+"STRING"+exprNode.hashCode());
            	break;
            	
            	
        }
       
    }

    private void generateArithmeticExpr(Tree arithmeticExprNode, tableDesSymboles currentSymbolTable) throws IOException {

        this.generateExpr(arithmeticExprNode.getChild(0), currentSymbolTable);
        this.generateExpr(arithmeticExprNode.getChild(1), currentSymbolTable);

        int r2 = this.registersManager.unlockRegister();
        int r1 = this.registersManager.unlockRegister();


        int r3 = this.registersManager.lockRegister();
        String op;

        switch (arithmeticExprNode.getType()) {
            case AlgolParser.PLUS:
                op = "ADD";
                break;
            case AlgolParser.MINUS:
                op = "SUB";
                break;
            case AlgolParser.MULT:
                op = "MUL";
                break;
            case AlgolParser.DIV:
                op = "DIV";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + arithmeticExprNode.getType());
        }

        this.code
                .append(op + " R" + r1 + ", R" + r2 + ", R" + r3 + "");
    }

    private void generateLogicalExpr(Tree logicalExprNode, tableDesSymboles currentSymbolTable) throws IOException {
        if(logicalExprNode.getType() == AlgolLexer.OR) {
            this.generateOr(logicalExprNode, currentSymbolTable);
        }
        else if(logicalExprNode.getType() == AlgolLexer.AND) {
            this.generateAnd(logicalExprNode, currentSymbolTable);
        }
        else if(logicalExprNode.getType() == AlgolLexer.ID){
        	 this.generateExpr(logicalExprNode.getParent().getParent().getChild(0).getChild(0),currentSymbolTable);
             this.generateExpr(logicalExprNode, currentSymbolTable);
             int r2 = this.registersManager.unlockRegister();
             int r1 = this.registersManager.unlockRegister();

             String op="BGE";
             int r3 = this.registersManager.lockRegister();

             this.code
                     .append("CMP R" + r1 + ", R" + r2)
                     .append(op + " 4")
                     .append("LDQ 1, R" + r3 + "")
                     .append("BMP 2")
                     .append("LDQ 0, R" + r3 + "");
         
     
        }
        else if(logicalExprNode.getType() == AlgolLexer.INT){
       	    this.generateExpr(logicalExprNode.getParent().getParent().getChild(0).getChild(0),currentSymbolTable);
            this.generateExpr(logicalExprNode, currentSymbolTable);
            int r2 = this.registersManager.unlockRegister();
            int r1 = this.registersManager.unlockRegister();

            String op="BGE";
            int r3 = this.registersManager.lockRegister();

            this.code
                    .append("CMP R" + r1 + ", R" + r2)
                    .append(op + " 4")
                    .append("LDQ 1, R" + r3 + "")
                    .append("BMP 2")
                    .append("LDQ 0, R" + r3 + "");
        
    
       }
        else {
            this.generateExpr(logicalExprNode.getChild(0), currentSymbolTable);
            this.generateExpr(logicalExprNode.getChild(1), currentSymbolTable);

            int r2 = this.registersManager.unlockRegister();
            int r1 = this.registersManager.unlockRegister();

            String op;

            switch (logicalExprNode.getType()) {
                case AlgolLexer.EQUAL:
                    op = "BNE";
                    break;
                case AlgolLexer.LESS:
                case AlgolParser.NOTGREATER:
                    op = "BGE";
                    break;
                case AlgolParser.NOTLESS:
                case AlgolParser.GREATER:
                    op = "BLE";
                    break;
                case AlgolParser.NOTEQUAL:
                    op = "BEQ";
                    break;
                default:
                    op = "BEQ";
                    break;
            }

            int r3 = this.registersManager.lockRegister();

            this.code
                    .append("CMP R" + r1 + ", R" + r2)
                    .append(op + " 4")
                    .append("LDQ 1, R" + r3 + "")
                    .append("BMP 2")
                    .append("LDQ 0, R" + r3 + "");
        }
    }

    private void generateOr(Tree logicalExprNode, tableDesSymboles currentSymbolTable) throws IOException {
        this.generateLogicalExpr(logicalExprNode.getChild(0), currentSymbolTable);
        this.code
                .append("// or");
        this.generateLogicalExpr(logicalExprNode.getChild(1), currentSymbolTable);

        int r1 = this.registersManager.unlockRegister();
        int r2 = this.registersManager.unlockRegister();
        int r3 = this.registersManager.lockRegister();

        this.code
                .append("OR R" + r2 + ", R" + r1 + ", R" + r3);
    }

    private void generateAnd(Tree logicalExprNode, tableDesSymboles currentSymbolTable) throws IOException {
        this.generateLogicalExpr(logicalExprNode.getChild(0), currentSymbolTable);
        this.code
                .append("// and");
        this.generateLogicalExpr(logicalExprNode.getChild(1), currentSymbolTable);

        int r1 = this.registersManager.unlockRegister();
        int r2 = this.registersManager.unlockRegister();
        int r3 = this.registersManager.lockRegister();

        this.code
                .append("AND R" + r2 + ", R" + r1 + ", R" + r3);
    }

  
    


    private void generateUnaryMinus(Tree exprNode, tableDesSymboles currentSymbolTable) throws  IOException{
        this.generateExpr(exprNode.getChild(0), currentSymbolTable);
        int r0 = this.registersManager.peekRegister();

        this.code
                .append("NEG R" + r0 + ", R" + r0);
    }

    private void generatePrint(Tree exprNode, tableDesSymboles currentSymbolTable) throws IOException {
        this.code
                .append("// " + this.sourceManager.getLine(exprNode.getLine()));

        this.generateExpr(exprNode, currentSymbolTable);
        int r0 = this.registersManager.unlockRegister();

        this.code
                .append("STW R" + r0 + ", -(SP)")
                .append("JSR @print_")
                .append("ADI SP, SP, #2");
    }

    
    
    private void generatePrinti(Tree exprNode, tableDesSymboles currentSymbolTable) throws IOException {
        this.code
                .append("// " + this.sourceManager.getLine(exprNode.getLine()));

        this.generateExpr(exprNode, currentSymbolTable);
        int r0 = this.registersManager.unlockRegister();

        this.code
                .append("STW R" + r0 + ", -(SP)")
                .append("JSR @printi_")
                .append("ADI SP, SP, #2");
    }

    private void generateItoaFunction() throws IOException {
        this.code
                .append("ITOA_I      equ 4      // offset du paramètre i\n" +
                        "ITOA_P      equ 6      // offset du paramètre p\n" +
                        "ITOA_B      equ 8      // offset du paramètre b\n" +
                        "ASCII_MINUS equ 45     // code ASCII de -\n" +
                        "ASCII_PLUS  equ 43     // code ASCII de +\n" +
                        "ASCII_SP    equ 32     // code ASCII d'eSPace SP\n" +
                        "ASCII_0     equ 48     // code ASCII de zéro (les autres chiffres jusqu'à 9 suivent dans l'ordre)\n" +
                        "ASCII_A     equ 65     // code ASCII de A (les autres lettres jusqu'à Z suivent dans l'ordre alphabétique)\n" +
                        "itoa_\n" +
                        "stw BP, -(SP)\n" +
                        "ldw BP, SP\n" +
                        "// récupération des paramètres depuis pile vers registres\n" +
                        "ldw r0, (BP)ITOA_I    // r0 = i    \n" +
                        "ldw r1, (BP)ITOA_B    // r1 = b\n" +
                        "// gère le signe: normalement itoa gère des int c'est à dire des entiers signés, \n" +
                        "// mais en fait seulement pour b=10;\n" +
                        "// dans ce cas calcule le signe dans r3 et charge r0 avec la valeur absolue de i\n" +
                        "ldq ASCII_SP, r3      // code ASCII de eSPace (SPace) -> r3\n" +
                        "ldq 10, WR            // 10 -> WR\n" +
                        "cmp r1, WR            // charge les indicateurs de b - 10\n" +
                        "bne NOSIGN-$-2        // si non égal (donc si b != 10) saute en NOSIGN, sinon calcule signe\n" +
                        "ldq ASCII_PLUS, r3    // charge le code ASCII du signe plus + dans r3\n" +
                        "tst r0                // charge les indicateurs de r0 et donc de i\n" +
                        "bge POSIT-$-2         // saute en POSIT si i >= 0\n" +
                        "neg r0, r0            // change le signe de r0\n" +
                        "ldq ASCII_MINUS, r3   // charge le code ASCII du signe moins - dans r3\n" +
                        "POSIT   NOP                   // r3 = code ASCII de signe: SP pour aucun, - ou +\n" +
                        "\n" +
                        "// convertit l'entier i en chiffres et les empile de droite à gauche\n" +
                        "NOSIGN  ldw r2, r0            // r2 <- r0\n" +
                        "CNVLOOP ldw r0, r2            // r0 <- r2\n" +
                        "// effectue \"créativement\" la division par b supposé pair (car l'instruction div est hélas signée ...)\n" +
                        "// d=2*d' , D = d * q + r  , D = 2*D'+r\" , D' = d' * q + r' => r = 2*r'+r\"\n" +
                        "// un bug apparaît avec SRL r0, r0 avec r0 = 2 : met CF à 1 !!\n" +
                        "srl r1, r1            // r1 = b/2\n" +
                        "ani r0, r4, #1        // ANd Immédiate entre r0 et 00...01 vers r4:\n" +
                        "\t\t\t\t  // bit n°0 de r0 -> r4; r4 = reste\" de r0/2\n" +
                        "srl r0, r0            // r0 / 2 -> r0\n" +
                        "div r0, r1, r2        // quotient = r0 / r1 -> r2, reste' = r0 % r1 -> r0\n" +
                        "shl r0, r0            // r0 = 2 * reste'\n" +
                        "add r0, r4, r0        // r0 = reste = 2 * reste' + reste\" => r0 = chiffre\n" +
                        "shl r1, r1            // r1 = b\n" +
                        "\n" +
                        "adq -10, r0           // chiffre - 10 -> r0 \n" +
                        "bge LETTER-$-2        // saute en LETTER si chiffre >= 10\n" +
                        "adq 10+ASCII_0, r0    // ajoute 10 => r0 = chiffre, ajoute code ASCII de 0 \n" +
                        "\t\t\t\t  // => r0 = code ASCII de chiffre\n" +
                        "bmp STKCHR-$-2        // saute en STKCHR \n" +
                        "LETTER  adq ASCII_A, r0       // r0 = ASCII(A) pour chiffre = 10, ASCII(B) pour 11 ...\n" +
                        "\t\t\t\t  // ajoute code ASCII de A => r = code ASCII de chiffre\n" +
                        "STKCHR  stw r0, -(SP)         // empile code ASCII du chiffre \n" +
                        "\t\t\t\t  // (sur un mot complet pour pas désaligner pile)\n" +
                        "tst r2                // charge les indicateurs en fonction du quotient ds r2)\n" +
                        "bne CNVLOOP-$-2       // boucle si quotient non nul; sinon sort\n" +
                        "// les caractères sont maintenant empilés : gauche en haut et droit en bas\n" +
                        "// recopie les caractères dans le tampon dans le bon ordre: de gauche à droite\n" +
                        "ldw r1, (BP)ITOA_P    // r1 pointe sur le début du tampon déjà alloué \n" +
                        "stb r3, (r1)+         // copie le signe dans le tampon\n" +
                        "CPYLOOP ldw r0, (SP)+         // dépile code du chiffre gauche (sur un mot) dans r0\n" +
                        "stb r0, (r1)+         // copie code du chiffre dans un Byte du tampon de gauche à droite\n" +
                        "cmp SP, BP            // compare SP et sa valeur avant empilement des caractères qui était BP\n" +
                        "bne CPYLOOP-$-2       // boucle s'il reste au moins un chiffre sur la pile\n" +
                        "ldq 10, r0\n" +
                        "stb r0, (r1)+\n" +
                        "ldq NUL, r0           // charge le code du caractère NUL dans r0\n" +
                        "stb r0, (r1)+         // sauve code NUL pour terminer la chaîne de caractères\n" +
                        "// termine\n" +
                        "ldw r0, (BP)ITOA_P    // retourne le pointeur sur la chaîne de caractères\n" +
                        "// UNLINK: fermeture de l'environnement de la fonction itoa\n" +
                        "ldw SP, BP            // SP <- BP : abandonne infos locales; SP pointe sur ancinne valeur de BP\n" +
                        "ldw BP, (SP)+         // dépile ancienne valeur de BP dans BP; SP pointe sur adresse de retour\n" +
                        "rts                   // retourne au programme appelant");
    }

    private void generatePrintFunction() throws IOException {
        this.code
                .append("print_     \n" +
                        "LDQ 0, R1\n" +
                        "STW BP, -(SP)\n" +
                        "LDW BP, SP\n" +
                        "SUB SP, R1, SP\n" +
                        "LDW R0, (BP)4\n" +
                        "TRP #WRITE_EXC\n" +
                        "LDW SP, BP\n" +
                        "LDW BP, (SP)+\n" +
                        "RTS ");
    }

    private void generatePrintiFunction() throws IOException {
        this.code
                .append("printi_\n" +
                        "STW BP, -(SP)\n" +
                        "LDW BP, SP\n" +
                        "ADI SP, SP, #-8\n" +
                        "ADI SP, SP, #-2\n" +
                        "LDW R0, (BP)4\n" +
                        "STW R0, (BP)-10\n" +
                        "LDW R0, #10\n" +
                        "STW R0, -(SP)\n" +
                        "ADI BP, R0, #-8\n" +
                        "STW R0, -(SP)\n" +
                        "LDW R0, (BP)-10\n" +
                        "STW R0, -(SP)\n" +
                        "JSR @itoa_\n" +
                        "ADI SP, SP, #6\n" +
                        "ADI BP, R0, #-8\n" +
                        "STW R0, -(SP)\n" +
                        "JSR @print_\n" +
                        "ADI SP, SP, #2\n" +
                        "LDW SP, BP\n" +
                        "LDW BP, (SP)+\n" +
                        "RTS");
    }


}
