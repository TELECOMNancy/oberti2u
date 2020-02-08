package TDS;

import org.antlr.runtime.tree.Tree;

import grammar.*;

public class TreeTraversal {
    private final gestionnaireDeTableDesSymboles gestionnaireTDS;
    private final Tree root;

    public TreeTraversal(Tree tree) {
        this.gestionnaireTDS = new gestionnaireDeTableDesSymboles();
        this.root = tree;
    }

    public tableDesSymboles buildSymbolTable()  {
        tableDesSymboles symbolTable = this.gestionnaireTDS.ouvrirTableDesSymboles();
        Type returntype =new Type(EnumType.VOID);
        SymbolFonction print= new SymbolFonction(root, "print", Scope.FUNCTION,"VOID",symbolTable,1);
        this.gestionnaireTDS.getTableDesSymboles().addSymbol(print);

        this.traverseFile(root, true);
        this.traverseFile(root, false);
        this.gestionnaireTDS.fermerTableDesSymboles();
        return symbolTable;
    }
    
    private void traverseFile(Tree root, boolean onlyDeclarations)  {
    	
    	if (root.getChildCount() <= 0 ){
            System.out.println("The file you want to load is empty");
    	}

    	else {
    		for(int i = 0; i < root.getChildCount() ; i ++) {
    			Tree child = root.getChild(i);
    			switch (child.getType()) {
                    case AlgolParser.DEC:
                        System.out.println("DEC");
                        Tree Child= child.getChild(1);
                        switch (Child.getType()){
                            case AlgolParser.PROCEDURE:
                                System.out.println("PROC");
                                this.traverseFunction(child, onlyDeclarations);
                                break;
                             case  AlgolParser.SWITCH:
                                 System.out.println("SWITCH");
                                 this.traverseswitch(child,onlyDeclarations);
                                 break;
                            case AlgolParser.ARRAY:
                                this.traverseStructure(child,onlyDeclarations);
                            default:
                            this.traverseVariable(child, onlyDeclarations);
                        }
                        break;

                	/*case AlgolParser.PROCEDURE:

                		this.traverseFunction(child, onlyDeclarations,"");

                		break;
                	case tigerParser.TYPE:

                		this.traverseStructure(child, onlyDeclarations);

                		break;
                	case tigerParser.VAR:

                		 this.traverseVariable(child, onlyDeclarations);

                		break;

                	 */
                	case AlgolParser.BLOCK:
                        for(int j=0;j<child.getChildCount();j++){
                            Tree Child1= child.getChild(i);
                            switch (Child1.getType()){
                                case AlgolParser.LABEL:
                                    this.traverselabel(child,onlyDeclarations);
                                    break;
                                case AlgolParser.IF:
                                    this.traverseIf(child);
                                    break;
                                //case ALgolParser.WHILE:

                                //     this.traverseBloc(child, EnumTypeTableSymbole.WHILE,false);

                                //    break;
                                case AlgolParser.FOR:
                                    this.traverseBloc(child, EnumTypeTableSymbole.WHILE,false);
                                    break;
                                case AlgolParser.BEGIN:
                                    if (onlyDeclarations) {
                                        this.traverseFile(child, onlyDeclarations);
                                    }
                                    break;
                            }
                        }
	        		}
	    }
	    }
  
    private void traverseFunction(Tree functionNode, boolean onlyDeclarations) {
        String idf = functionNode.getChild(1).getChild(0).getText();
        int nbrParametre = functionNode.getChild(1).getChild(1).getChildCount();

           Type returnType = new Type(EnumType.VOID);
           tableDesSymboles symbolTable = this.gestionnaireTDS.ouvrirTableDesSymboles();
             if ( functionNode.getChildCount()!=1/*functionNode.getChild(2).getChild(0).getType() != tigerParser.VOID*/ ){
                    returnType = traverseType(functionNode.getChild(0));}

            SymbolFonction functionSymbol = new SymbolFonction(
                    functionNode,
                    idf,
                    Scope.LOCAL,
                    "VOID",
                   symbolTable,

                    nbrParametre
            );
            this.gestionnaireTDS.fermerTableDesSymboles();
           

            if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(functionSymbol, true)) {
            	
                System.out.println("Redefining function " + idf + ". Line : " + functionNode.getLine());
            }
        for (int i = 0; i < functionNode.getChild(1).getChild(1).getChildCount(); i++){
            SymboleVariable symbVar=traverseParameter(functionNode.getChild(1).getChild(i).getChild(i),functionSymbol.getSymbolTable(), idf);
            functionSymbol.addParam(symbVar);

            this.gestionnaireTDS.getTableDesSymboles().addSymbol(symbVar);


        }

        this.gestionnaireTDS.ouvrirTableDesSymboles(functionSymbol.getSymbolTable());
        BlocType blocType = this.traverseBloc(functionNode.getChild(3), EnumTypeTableSymbole.PROCEDURE, false);

        this.gestionnaireTDS.fermerTableDesSymboles();

           this.gestionnaireTDS.getTableDesSymboles().addSymbol(functionSymbol);

            ///il faut faire pareil pour les labesl car ils ont aussi un bloc d'instruction
    }

    private void traverseStructure(Tree structureNode, boolean onlyDeclarations)  {
        //String idf = this.getID(structureNode.getChild(0));
String idf=structureNode.getChild(1).getChild(0).getText();
String type=structureNode.getChild(0).getText();
        if(onlyDeclarations) {
            tableDesSymboles symbolTable = this.gestionnaireTDS.ouvrirTableDesSymboles();
            SymboleStructure structureSymbol = new SymboleStructure(
                    structureNode,
                    idf,
                    type,
                    Scope.LOCAL,
                    symbolTable
            );

            if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(structureSymbol, true)) {
            	System.out.println("Redefining structure " + idf + ". Line : " + structureNode.getLine());
            }
           
            this.gestionnaireTDS.fermerTableDesSymboles();
            this.gestionnaireTDS.getTableDesSymboles().addSymbol(structureSymbol);
        }
        else{
            SymboleStructure structureSymbol = this.gestionnaireTDS.getTableDesSymboles().getStructureSymbol(idf, true);
            this.gestionnaireTDS.ouvrirTableDesSymboles(structureSymbol.getSymbolTable());



            for(int i = 1; i < structureNode.getChildCount(); i++) {
                Tree child = structureNode.getChild(i);

                switch (child.getType()) {
                    case tigerParser.FIELD:
                        this.traverseStructureField(child);
                        break;
                    default:
                        System.out.println("");
                }
            }


            this.gestionnaireTDS.fermerTableDesSymboles();}
        
    }

    private void traverseStructureField(Tree structFieldNode)  {

    	
    	String idf = this.getID(structFieldNode.getChild(0));

        Type type = this.traverseType(structFieldNode.getChild(1));
        tableDesSymboles symbolTable = this.gestionnaireTDS.ouvrirTableDesSymboles();
        SymboleVariable variableSymbol = new SymboleVariable(structFieldNode, idf, Scope.LOCAL, type,symbolTable);
      
        if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(variableSymbol,false)) {
            System.out.println("The element " + variableSymbol.getName()+" is already defined in the structure. Line : " + structFieldNode.getLine());
        }
        else {
        	this.gestionnaireTDS.fermerTableDesSymboles();
            this.gestionnaireTDS.getTableDesSymboles().addSymbol(variableSymbol);
        }
    }
    
    private void traverseASSIG(Tree variableNode)  {

    	String idf = variableNode.getChild(0).getText();

    	SymboleVariable variableSymbol;

		
         Type type = this.traverseExpr(variableNode.getChild(1));

        
		
        variableSymbol = this.gestionnaireTDS.getTableDesSymboles().getVariableSymbol(idf, true);
        

        
        String stringType2=type.getType().getToken();

        
        if(! stringType2.equals(String.valueOf(variableSymbol.type.getType().getToken()) )) {
            System.out.println("Affectation impossible car types incompatibles " + stringType2 + ". Line : " + variableNode.getChild(1).getLine());
        }
        }
    
 
    private void traverseVariable(Tree variableNode, boolean onlyDeclarations) {
    for(int i=1;i<variableNode.getChildCount();i++) {
        String idf = variableNode.getChild(i).getText();
        SymboleVariable variableSymbol;

        String stringType = variableNode.getText();
        String structureType = null;
        Type type;
        EnumType enumType;
        if (onlyDeclarations) {

            EnumType typeVariable = null;
            if (variableNode.getChildCount() == 2) {
                switch (variableNode.getChild(0).getText()) {
                    case "INTEGER":
                        typeVariable = EnumType.INT;
                        structureType = "int";
                        break;
                    case "STRING":
                        typeVariable = EnumType.STRING;
                        structureType = "string";
                        break;
                    default:

                        typeVariable = EnumType.RECORD;
                        SymboleStructure structureSymbol = this.gestionnaireTDS
                                .getTableDesSymboles()
                                .getStructureSymbol(variableNode.getChild(1).getText(), true);
                        if (structureSymbol != null) {
                            structureType = variableNode.getChild(1).getText();
                        } else {

                            System.out.println(variableNode.getChild(1).getText() + "n'est pas défini");
                        }
                }
            } else {
                try {
                    Integer.parseInt(variableNode.getChild(0).getChild(1).getText());
                    typeVariable = EnumType.INT;
                    structureType = "int";
                } catch (Exception e) {
                    if (variableNode.getChild(0).getChild(1).getType() == tigerParser.ARREC) {
                        typeVariable = EnumType.RECORD;
                        SymboleStructure structureSymbol = this.gestionnaireTDS
                                .getTableDesSymboles()
                                .getStructureSymbol(variableNode.getChild(0).getChild(1).getChild(0).getText(), true);

                        if (structureSymbol == null) {
                            System.out.println("Unknown type : " + stringType + ". Line : " + variableNode.getLine());
                        } else {
                            structureType = variableNode.getChild(0).getChild(1).getChild(0).getText();
                        }

                    } else {
                        typeVariable = EnumType.STRING;
                        structureType = "string";
                    }
                }
            }

            enumType = Type.getDefaultType(stringType);
            type = new Type(
                    typeVariable,
                    structureType);
            variableSymbol = new SymboleVariable(variableNode, idf, Scope.GLOBAL, type, this.gestionnaireTDS.getTableDesSymboles());    ///symbolTable);

            if (this.gestionnaireTDS.getTableDesSymboles().symbolExists(variableSymbol, true)) {
                System.out.println("Redefining  " + idf + ". Line : " + variableNode.getLine());
            }

            this.gestionnaireTDS.getTableDesSymboles().addSymbol(variableSymbol);

        }
    }}
    
    private Type traverseFunctionCall(Tree functionCallNode)  {

    	String idf = functionCallNode.getChild(0).getText();

        SymbolFonction functionSymbol = this.gestionnaireTDS.getTableDesSymboles().getFunctionSymbol(idf,true);

        if (functionSymbol == null){
            System.out.println("The function "+ idf + " is not defined. Line :" + functionCallNode.getLine());
        }

        int size = functionSymbol.getReturnNombre();
        
        int realSize = functionCallNode.getChild(1).getChildCount();

        if (size != realSize){
           System.out.println("The function "+ idf + " has been called with wrong number of arguments (" + realSize + " instead of " + size + "). Line :" + functionCallNode.getLine());
        }

        for (int i = 1; i < realSize + 1; i++){
            Tree param = functionCallNode.getChild(1).getChild(i);

            
            
            Type realType = functionSymbol.returnParam().get(i-1).getType();

            Type type = traverseExpr(param);

            if(!type.getType().equals(realType.getType())){
                System.out.println("The argument "+ param.getText() + " is called with the wrong type (" + type.getType().getToken() + " instead of " + realType.getType().getToken() + "). Line :" + functionCallNode.getLine());
            }
        }

        // Type de retour ??

        return functionSymbol.getReturnType();
    }


    
    private BlocType traverseBloc(Tree blocNode, EnumTypeTableSymbole symbolTableType, boolean createBloc)  {

    	BlocType type = new BlocType(EnumType.VOID, false, blocNode);

        if(createBloc) {
            this.gestionnaireTDS.ouvrirTableDesSymboles();
        }

        
        for(int i = 0; i < blocNode.getChildCount(); i++) {
            Tree child = blocNode.getChild(i);
            BlocType tempType;


            switch (child.getType()) {
                case tigerParser.BODY:
                case tigerParser.LET:
                	

                	this.traverseFile(child,true);
                    if(!type.isDeterminedByReturn()) {
                        type = new BlocType(EnumType.VOID, false, child);
                    }
            
                    break;
                case tigerParser.BLOCKF:

                	this.traverseBloc(child,symbolTableType,false);
                    if(!type.isDeterminedByReturn()) {
                        type = new BlocType(EnumType.VOID, false, child);
                    }
                    break;
                case tigerParser.IN:
                	for(int j = 0; j < child.getChildCount(); j++) {
                        Tree childOfChild = child.getChild(j);
                        this.traverseBloc(childOfChild,symbolTableType,false);
                    	}
                	break;
                case tigerParser.WHILE:
                    tempType = this.traverseWhile(child);

                    if(!type.isDeterminedByReturn()) {
                        type = tempType;
                    }
                    break;
                case tigerParser.FOR:
                    tempType = this.traverseWhile(child);


                        type = tempType;

                    break;
                case tigerParser.TYPEDERETOUR:
                    tempType = this.traverseReturn(child);

                    if(!type.isDeterminedByReturn()) {
                        type = tempType;
                    }
                    break;
                case tigerParser.IF:
                    tempType = this.traverseIf(child);

                    if(!type.isDeterminedByReturn()) {
                        type = tempType;
                    }
                    break;
                case tigerParser.VAR:
                	this.traverseVariable(child, true);
                	break;
                default:
                    Type exprType = this.traverseExpr(child);

                        type = new BlocType(exprType.getType(), false, child);
                    break;
            }
        }

       if(createBloc) {
        	
            tableDesSymboles blocSymbolTable = this.gestionnaireTDS.fermerTableDesSymboles();
           blocSymbolTable.setSymbolTableType(symbolTableType);
            this.gestionnaireTDS.getTableDesSymboles().addBloc(blocNode.hashCode(), blocSymbolTable);
        }

        return type;
    }

    private Type traverseType(Tree typeNode)  {
        Tree currentNode = typeNode;

        String structureType = "";
        String stringType=currentNode.getText();
        EnumType enumType = EnumType.UNDEFINED;

        try { if(currentNode.getText().equals("INTEGER")) {stringType = "INTEGER";}
        	else{Integer.parseInt(currentNode.getText());} 
        	
        	stringType = "INTEGER";
        	} 
        	catch (Exception e) { 
        		if(!Type.isDefaultType(stringType)) {
                    SymboleStructure structureSymbol = this.gestionnaireTDS
                            .getTableDesSymboles()
                            .getStructureSymbol(currentNode.getChild(1).getText(), true);

                    if(structureSymbol == null) {
                        System.out.println("Unknown type : " + stringType + ". Line : " + typeNode.getLine());
                    }

                    
                }
        		else {stringType = "STRING";	}
        	
        	}
        

        structureType = stringType;
        enumType = Type.getDefaultType(stringType);
        

        return new Type(
                enumType,
                structureType
               
        );
    }
    
    
    private Type traverseType2(Tree typeNode)  {
        Tree currentNode = typeNode;

        String structureType = "";
        String stringType=currentNode.getText();
        EnumType enumType = EnumType.UNDEFINED;

        try { if(currentNode.getText().equals("int")) {stringType = "int";}
        	else{Integer.parseInt(currentNode.getText());} 
        	
        	stringType = "int";
        	} 
        	catch (Exception e) { 
        		if(!Type.isDefaultType(stringType)) {
                    SymboleStructure structureSymbol = this.gestionnaireTDS
                            .getTableDesSymboles()
                            .getStructureSymbol(currentNode.getText(), true);

                    if(structureSymbol == null) {
                        System.out.println("Unknown type : " + stringType + ". Line : " + typeNode.getLine());
                    }

                    
                }
        		else {stringType = "string";	}
        	
        	}
        

        structureType = stringType;
        enumType = Type.getDefaultType(stringType);
        

        return new Type(
                enumType,
                structureType
               
        );
    }

    private SymboleVariable traverseParameter(Tree paramNode, tableDesSymboles symbolTable2,String nomFonction)  {
    	
    	String idf = this.getID(paramNode.getChild(0));
        Type type = this.traverseType(paramNode.getChild(1));

        SymboleVariable variableSymbol = new SymboleVariable(paramNode, idf, Scope.FUNCTION, type,symbolTable2);
        
        
        if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(variableSymbol, true)){
          System.out.println("The parameter " + idf + " is already defined in the function. Line : " + paramNode.getLine());
        }
      
        return variableSymbol;


    }

    private BlocType traverseWhile(Tree whileNode) {

    	BlocType type = null;

        if(whileNode.getType()==tigerParser.FOR) {
             	

                 Type type1 = new Type(
                         EnumType.INT,
                         "int");
                 SymboleVariable variableSymbol = new SymboleVariable(whileNode,whileNode.getChild(0).getChild(0).getText(), Scope.LOCAL, type1,this.gestionnaireTDS.getTableDesSymboles());
                 
                 if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(variableSymbol, true)) {
                 	System.out.println("Redefining variable " + whileNode.getChild(0).getChild(0).getText() + ". Line : " + whileNode.getLine());
                 }
                 this.gestionnaireTDS.getTableDesSymboles().addSymbol(variableSymbol);
                     
                     if(this.traverseExpr(whileNode.getChild(1).getChild(0)).getType()!=EnumType.INT || this.traverseExpr(whileNode.getChild(0).getChild(1)).getType()!=EnumType.INT ){
                      	System.out.println( "Integer expected in for expression"+" Line : " + whileNode.getLine());
                      }
      
                type = this.traverseBloc(whileNode.getChild(2), EnumTypeTableSymbole.FOR,false);
                 return type;
             	
            
        }

        else { this.traverseExpr(whileNode.getChild(0));

        if (!(this.traverseExpr(whileNode.getChild(0)).isInt())) {
        	System.out.println("Int expected in while condition expression. Line : " + whileNode.getLine() + ".");
        }}

        type = this.traverseBloc(whileNode.getChild(1), EnumTypeTableSymbole.WHILE,false);
        if (!type.isVoid()) {
        	System.out.println("void expected in while  block expression. Line : " + whileNode.getLine() + ".");
        }

        return type;
    }

    private BlocType traverseIf(Tree ifNode) {
        BlocType ifType;

        traverseExpr(ifNode.getChild(0));

        if (!(this.traverseExpr(ifNode.getChild(0)).isInt())) {
        	System.out.println("integer expected in if condition expression. Line : "+ ifNode.getLine()+ ".");
        }

        ifType = traverseBloc(ifNode.getChild(1), EnumTypeTableSymbole.IF,false);

        if(ifNode.getChildCount() > 2){
            BlocType elseType = traverseElse(ifNode.getChild(2));
            if(!elseType.equals(ifType)) {
            	System.out.println("Line " + ifNode.getLine() + " Different block types : " + ifType.getType().getToken() + " : " + elseType.getType().getToken());
            }

            ifType = elseType;
        }

        return ifType;
    }

    private BlocType traverseElse(Tree elseNode)  {
        BlocType type;

        switch(elseNode.getType()){
            case tigerParser.BLOCK :
                type = traverseBloc(elseNode, EnumTypeTableSymbole.ELSE,false);
                break;
            case tigerParser.IF :
                type = traverseIf(elseNode);
                break;
            default:
                System.out.println("Unknown node : " + elseNode.getText());
                type=null;
        }

        return type;
    }

    private Type traverseExpr(Tree exprNode)  {
        Type leftExpr;
        Type rightExpr;
        Type type;

        switch(exprNode.getType()){
        	case tigerParser.IN:
        	case tigerParser.BLOCK:

        	
                type = this.traverseBloc(exprNode, EnumTypeTableSymbole.ANONYMOUS,false);
                break;
            case tigerParser.OR:
            case tigerParser.AND :
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if(!leftExpr.isInt() || !rightExpr.isInt() ){
                	System.out.println("The logical connectives AND and OR should be used with two integers. Line : " + exprNode.getLine());
                }

                type = new Type(EnumType.INT);
                break;
            case tigerParser.ASSIG:
            	
            	this.traverseASSIG(exprNode);
            	
            	type = new Type( EnumType.VOID,exprNode.getChild(0).getText());
            	break;
            	
            case tigerParser.LT:
            case tigerParser.LE :
            case tigerParser.GT :
            case tigerParser.GE :
            case tigerParser.EQ :
            case tigerParser.NE :
            	
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

               
                if(!(leftExpr.isInt() && rightExpr.isInt())) {
                	System.out.println("Mathematical inequalities or comparisons should be done between two integers. Line : "+ exprNode.getLine());

                }

                type = new Type(EnumType.INT);
                break;
            /*case AlgolParser.COND :
            	 
            	type=this.traverseExpr(exprNode.getChild(0));
            	break;*/
            case AlgolParser.PLUS:
            //case AlgolParser.MINUS:
            case AlgolParser.MULT :
            case AlgolParser.DIV :

                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));


                if(!leftExpr.isInt() || !rightExpr.isInt()) { // check type int
                	System.out.println("Mathematical operations should be done between two integers. Line : " + exprNode.getLine());
                }

                type = new Type(EnumType.INT);
                break;
            case tigerParser.NEGATION :
                leftExpr = this.traverseExpr(exprNode.getChild(0));

               try{ 
                if(!leftExpr.isInt()){

                    System.out.println("Unary operation should be done with an integer, " + exprNode.getChild(0).getText() + "is not one. Line : " + exprNode.getLine());
                }} catch(Exception e){
                	System.out.println(" Unary operation should be done with an integer :");
                }

                type = new Type(EnumType.INT);
                break;
             
           case tigerParser.SUBFIELD : 

                
            case tigerParser.APPELFONCTION :
            	if (!exprNode.getChild(0).getText().equals("print")){
            		type = this.traverseFunctionCall(exprNode);
            		break;
            	}else {
            		Type typePrint = this.traverseExpr(exprNode.getChild(1));
            		
            		if (typePrint.getType().equals(EnumType.VOID)){
                        System.out.println(exprNode.getChild(0).getText()+" has a void type and can't be printed. Line : " + exprNode.getLine());
                
            		}
            		type = new Type(EnumType.VOID);
                    break; 
            	}
                 
            
                
            case tigerParser.SEQEXP :
                type = this.traverseSeq(exprNode);
                break;
            case tigerParser.INTLIT :     
                type = new Type(EnumType.INT);
                break;
            case tigerParser.STRINGLIT :
                type = new Type(EnumType.STRING);
                break;
         
            case tigerParser.ID :
            	tableDesSymboles tds = null;

            	SymboleVariable variableSymbol = this.gestionnaireTDS.getTableDesSymboles().getVariableSymbol(exprNode.getText(), true);
             
            	if(variableSymbol == null) {
            		System.out.println("the variable does not exist " + exprNode.getText() + ". Line : " + exprNode.getLine());
                }
             
            	for (int i=0; i < this.gestionnaireTDS.getStack().size();i++){
            		tds = (tableDesSymboles) this.gestionnaireTDS.getStack().get(i);

            	}

            	SymboleVariable variableSymbol1 = tds.getVariableSymbol(exprNode.getText(), true);
            	
            	
                if(variableSymbol1 == null) {
                    type = new Type(EnumType.UNDEFINED);
                }
                else {
                    type = variableSymbol1.getType();
                    }

                break;
            default:

                System.out.println("Unknown node : " + exprNode.getText());
                type=null;
              
        }

        return type;
    }


    private void traverselabel(Tree labelnode, boolean onlyDeclarations){
        String idf = labelnode.getChild(0).getText();
        tableDesSymboles symbolTable = this.gestionnaireTDS.ouvrirTableDesSymboles();
        SymbolLABEL lab= new SymbolLABEL(
                labelnode,
                idf,
                null,
                Scope.LOCAL,
                symbolTable
                );

        this.gestionnaireTDS.fermerTableDesSymboles();

        if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(lab, true)) {

            System.out.println("Redefining function " + idf + ". Line : " + labelnode.getLine());
        }
        this.gestionnaireTDS.ouvrirTableDesSymboles(lab.getSymbolTable());
        BlocType blocType = this.traverseBloc(labelnode.getChild(1), EnumTypeTableSymbole.LABEL, false);

        this.gestionnaireTDS.fermerTableDesSymboles();
        this.gestionnaireTDS.getTableDesSymboles().addSymbol(lab);



    }

    private void traverseswitch(Tree switchNode,boolean onlyDeclarations){
        String idf = switchNode.getChild(0).getChild(0).getChild(0).getText();
        int nbrElement = switchNode.getChild(0).getChild(0).getChild(1).getChildCount();

        //Type returnType = new Type(EnumType.VOID);
        tableDesSymboles symbolTable = this.gestionnaireTDS.ouvrirTableDesSymboles();
       // if (onlyDeclarations){
           // returnType = traverseType(switchNode.getChild(0));}

        SymbolSWITCH functionSymbol = new SymbolSWITCH(
                switchNode,
                idf,
                null,
                Scope.LOCAL,
                symbolTable,
                nbrElement
        );
        this.gestionnaireTDS.fermerTableDesSymboles();

        if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(functionSymbol, true)) {

            System.out.println("Redefining function " + idf + ". Line : " + switchNode.getLine());
        }
        for (int i = 0; i < switchNode.getChild(1).getChild(1).getChildCount(); i++){
            SymboleVariable symbVar=traverseParameter(switchNode.getChild(1).getChild(i).getChild(i),functionSymbol.getSymbolTable(), idf);
            functionSymbol.addPelement(symbVar);

            this.gestionnaireTDS.getTableDesSymboles().addSymbol(symbVar);


        }

        this.gestionnaireTDS.ouvrirTableDesSymboles(functionSymbol.getSymbolTable());
        BlocType blocType = this.traverseBloc(switchNode.getChild(3), EnumTypeTableSymbole.PROCEDURE, false);

        this.gestionnaireTDS.fermerTableDesSymboles();

        this.gestionnaireTDS.getTableDesSymboles().addSymbol(functionSymbol);


    }


    private BlocType traverseReturn(Tree returnNode) {
        Type type;

        if(returnNode.getChildCount() == 1){
            type = traverseExpr(returnNode.getChild(0));
        }
        else {
            type = new Type(EnumType.VOID);
        }

        return new BlocType(type, true, returnNode);
    }

    private BlocType traverseBegin(Tree letNode)  {

        BlocType exprRightType=this.traverseBloc(letNode.getChild(1), EnumTypeTableSymbole.ANONYMOUS,false );
       Type type;

      
        if(exprRightType == null) {
             type = new Type(EnumType.VOID);
             return new BlocType(type,true,letNode);
        }
        else {
        	
            return  exprRightType;
           
        }

    
    }
    private Type traverseSeq(Tree vecNode)  {
        Type type = null;

        if (vecNode.getChildCount()==0) {
        	type= new Type(EnumType.VOID,null);
        }
        else{        	
        	type = this.traverseBloc(vecNode,EnumTypeTableSymbole.ANONYMOUS,false);

        	}
        return type;
    }


    public String getID(Tree node)  {
        if(node.getType() == tigerParser.ID) {
            return node.getText();
        }
        
        else{
            System.out.println(node.getText() + " is an unknown node. Line : " + node.getLine());
            return node.getText();
        }
    }
}
