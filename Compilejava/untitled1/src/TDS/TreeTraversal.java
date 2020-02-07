package TDS;

import org.antlr.runtime.tree.Tree;

import grammar.*;

import java.awt.*;
import java.util.ArrayList;

public class TreeTraversal {
    public final gestionnaireDeTableDesSymboles gestionnaireTDS;
    private final Tree root;
    public int region=0;
    public int nestion=0;
    public TreeTraversal(Tree tree) {
        this.gestionnaireTDS = new gestionnaireDeTableDesSymboles();
        this.root = tree;
    }

    public tableDesSymboles buildSymbolTable(tableDesSymboles parent)  {
        tableDesSymboles symbolTable = this.gestionnaireTDS.ouvrirTableDesSymboles();
        Type returntype =new Type(EnumType.VOID);
        this.gestionnaireTDS.getTableDesSymboles().setParent(parent);
        SymbolFonction print= new SymbolFonction(root, "print", Scope.FUNCTION,"VOID",symbolTable,1);
        this.gestionnaireTDS.getTableDesSymboles().addSymbol(print);

        this.traverseFile(root, true);
        this.gestionnaireTDS.fermerTableDesSymboles();
        return symbolTable;
    }
    
    private void traverseFile(Tree root, boolean onlyDeclarations)  {
    	if (root.getChildCount() <= 0 ){
            System.out.println("The file11 you want to load is empty");
    	}

    	else {
    		for(int i = 0; i <root.getChildCount() ;i++) {
    			Tree child = root.getChild(i);
    			switch (child.getType()) {
                    case AlgolParser.DEC:
                        Tree Child;
                        if(child.getChildCount()>1){
                             Child=child.getChild(1);
                        }
                        else{
                            Child=child.getChild(0);
                        }
                        switch (Child.getType()){
                            case AlgolParser.PROCEDURE:
                                this.traverseFunction(child, onlyDeclarations);
                                break;
                             case  AlgolParser.SWITCH:
                                 this.traverseswitch(child,onlyDeclarations);
                                 break;
                            case AlgolParser.ARRAY:
                                this.traverseStructure(child,onlyDeclarations);
                                break;
                            default:
                                this.traverseVariable(child, onlyDeclarations);
                                break;
                        }
                        break;
                    case AlgolParser.BLOCK:
                        for(int j=0;j<child.getChildCount();j++){
                            Tree Child1= child.getChild(j);
                            if(Child1.getText().equals(":=")){
                                this.traverseASSIG(Child1);
                            }
                        }
                        for(int j=0;j<child.getChildCount();j++){
                            Tree Child1= child.getChild(j);
                            switch (Child1.getType()){
                                case AlgolParser.LABEL:
                                    this.traverselabel(Child1,onlyDeclarations);
                                    break;
                                case AlgolParser.IF:
                                    this.traverseIf(child);
                                    break;
                                case AlgolParser.FOR:
                                    this.traverseFor(Child1);
                                    break;
                                case AlgolParser.CALL:
                                    this.traverseFunctionCall(Child1);
                                    break;
                                case AlgolParser.BEGIN:
                                    if (onlyDeclarations) {
                                        TreeTraversal func= new TreeTraversal(Child1);
                                        TDS.tableDesSymboles symbolTable1 = func.buildSymbolTable(this.gestionnaireTDS.getTableDesSymboles());
                                        SymbolFonction print= new SymbolFonction(root, "print", Scope.FUNCTION,"VOID",symbolTable1,1);
                                        symbolTable1.removesymbole(print);
                                        symbolTable1.setParent(this.gestionnaireTDS.getTableDesSymboles());
                                        this.gestionnaireTDS.getTableDesSymboles().addBloc(0,symbolTable1);
                                    }
                                    break;
                                default:

                                    break;
                            }
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
                    case AlgolParser.LABEL:
                	    break;
                	case AlgolParser.IF:
                		 this.traverseBloc(child, EnumTypeTableSymbole.IF,false);

                		break;
                	case AlgolParser.FOR:

                		  this.traverseBloc(child, EnumTypeTableSymbole.WHILE,false);

                		break;
                	//case AlgolParser.BODY:
                	case AlgolParser.BEGIN:
                		if (onlyDeclarations) {
                		    this.traverseFile(child, onlyDeclarations);
                		}

                		break;
                	case tigerParser.IN:
                			this.traverseBloc(child, EnumTypeTableSymbole.IN,false);
                	
            }
        }
    }
    }
  
    private void traverseFunction(Tree functionNode, boolean onlyDeclarations) {
        String idf = functionNode.getChild(1).getChild(0).getText();
        ArrayList<String> typearg=new ArrayList<String>();
        int nbrParametre = functionNode.getChild(1).getChild(1).getChildCount();

           Type returnType = new Type(EnumType.VOID);
           String types="";
           tableDesSymboles symbolTable = this.gestionnaireTDS.ouvrirTableDesSymboles();
             if ( functionNode.getChildCount()!=1/*functionNode.getChild(2).getChild(0).getType() != tigerParser.VOID*/ ){
                    returnType = traverseType(functionNode.getChild(0));
             types=functionNode.getChild(0).getText();}

            SymbolFonction functionSymbol = new SymbolFonction(
                    functionNode,
                    idf,
                    Scope.LOCAL,
                    types,
                    symbolTable,
                    nbrParametre
            );
            this.gestionnaireTDS.fermerTableDesSymboles();

            if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(functionSymbol, true)) {

                System.out.println("Redefining function " + idf + ". Line : " + functionNode.getLine());
            }
                if(functionNode.getChild(1).getChild(3).getChildCount()==functionNode.getChild(1).getChild(1).getChildCount()+1){
                    typearg.add(functionNode.getChild(1).getChild(3).getChild(0).getText());
                }
                if(functionNode.getChild(1).getChild(3).getChildCount()==functionNode.getChild(1).getChild(1).getChildCount()*2){
                    int j=0;
                    while(j<functionNode.getChild(1).getChild(3).getChildCount()){
                        typearg.add(functionNode.getChild(1).getChild(3).getChild(j).getText());
                        j=j+2;
                    }
                }


        for (int i = 0; i < functionNode.getChild(1).getChild(1).getChildCount(); i++){
            if(typearg.size()==1) {
                SymboleVariable symbVar = traverseParameter(functionNode.getChild(1).getChild(1).getChild(i), functionSymbol.getSymbolTable(), idf, typearg.get(0));
                functionSymbol.addParam(symbVar);

                this.gestionnaireTDS.getTableDesSymboles().addSymbol(symbVar);
            }
            else{
                SymboleVariable symbVar = traverseParameter(functionNode.getChild(1).getChild(1).getChild(i), functionSymbol.getSymbolTable(), idf, typearg.get(i));
                functionSymbol.addParam(symbVar);

                this.gestionnaireTDS.getTableDesSymboles().addSymbol(symbVar);
            }

        }

        this.gestionnaireTDS.ouvrirTableDesSymboles(functionSymbol.getSymbolTable());
        // this.traverseFile(functionNode.getChild(1).getChild(4),onlyDeclarations);
        this.gestionnaireTDS.fermerTableDesSymboles();


        this.gestionnaireTDS.getTableDesSymboles().addSymbol(functionSymbol);
        TreeTraversal func= new TreeTraversal(functionNode.getChild(1).getChild(4));
        TDS.tableDesSymboles symbolTable1 = func.buildSymbolTable(this.gestionnaireTDS.getTableDesSymboles());
        SymbolFonction print= new SymbolFonction(root, "print", Scope.FUNCTION,"VOID",symbolTable,1);
        symbolTable1.removesymbole(print);
        symbolTable1.setRegionnum(functionSymbol.getSymbolTable().getRegionNum());
        functionSymbol.settds(symbolTable1);
        this.gestionnaireTDS.getTableDesSymboles().removesymbole(functionSymbol);
        this.gestionnaireTDS.getTableDesSymboles().addSymbol(functionSymbol);
        this.gestionnaireTDS.getTableDesSymboles().addBloc(1,symbolTable1);

    }

    private void traverseStructure(Tree structureNode, boolean onlyDeclarations)  {
     String idf=structureNode.getChild(1).getChild(0).getText();
     int c=0;
     //System.out.println("idf"+idf);
     String type=structureNode.getChild(0).getText();
        if(onlyDeclarations) {
            //tableDesSymboles symbolTable = new tableDesSymboles(null,1);//this.gestionnaireTDS.ouvrirTableDesSymboles();
            SymboleStructure structureSymbol = new SymboleStructure(
                    structureNode,
                    idf,
                    type,
                    Scope.LOCAL,
                    null
            );
  if( structureNode.getChild(1).getChildCount()>2){
      structureSymbol.a=2;
            }
  else{
      structureSymbol.a=1;
    }

            if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(structureSymbol, true)) {
            	System.out.println("Redefining structure " + idf + ". Line : " + structureNode.getLine());
            }
           
          //  this.gestionnaireTDS.fermerTableDesSymboles();

            for(int i=1;i<structureNode.getChild(1).getChildCount();i++){
                Tree fils=structureNode.getChild(1).getChild(i);
                if(fils.getText().equals("BORNE")){
                    ArrayList<String> a= new ArrayList<String>();
                    int  borne1=Integer.parseInt(fils.getChild(0).getText());
                    int  borne2=Integer.parseInt(fils.getChild(1).getText());
                    a.add(fils.getChild(0).getText());
                    a.add(fils.getChild(1).getText());
                    structureSymbol.addBorne(a);
                    if(borne1>borne2){
                        c=1;

                        System.out.println("Probleme de borne"+ "ligne:"+ fils.getChild(0).getLine());
                    }
                }
            }
            if(c==0) {
                //structureSymbol.setOffset(8);
                this.gestionnaireTDS.getTableDesSymboles().addStrut(structureSymbol);
            }
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
            this.gestionnaireTDS.fermerTableDesSymboles();
        }
    }

    private void traverseStructureField(Tree structFieldNode)  {

    	
    	String idf = this.getID(structFieldNode.getChild(0));

        Type type = this.traverseType(structFieldNode.getChild(1));
        tableDesSymboles symbolTable = this.gestionnaireTDS.ouvrirTableDesSymboles();
        SymboleVariable variableSymbol = new SymboleVariable(structFieldNode, idf, Scope.LOCAL, "ARRAY",symbolTable);
      
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
        String types="";
    	SymboleVariable variableSymbol= null;

    	String type = this.traverseExpr(variableNode.getChild(1));
       if(variableNode.getChild(1).getText().equals(":=")){
           type=traverseExpr(variableNode.getChild(1).getChild(0));
           this.traverseASSIG(variableNode.getChild(1));
       }


        variableSymbol = this.gestionnaireTDS.getTableDesSymboles().getVariableSymbol(idf, true);


        String stringType2=type;

        if(idf.equals("ARRAYACCESS")){
            types=traverseArrayacces(variableNode.getChild(0));
            System.out.println(types);
   variableSymbol=null;
        }
            if(variableSymbol==null) {
                if (!types.equals(type)) {
                    System.out.println("Affectation impossibles car types incompatibles " + type+ ". Line : " + variableNode.getChild(1).getLine());
                }
            }
            else{
                if (!type.equals(variableSymbol.types)) {
                    System.out.println("Affectation impossible car types incompatibles " + stringType2 + ". Line : " + variableNode.getChild(1).getLine());
                }
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
                        structureType = "INTEGER";
                        break;
                    case "REAL":
                        typeVariable = EnumType.STRING;
                        structureType = "REAL";
                        break;
                    case "BOOLEAN":
                        typeVariable = EnumType.REAL;
                        structureType = "REAL";
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
            }
            else {
                try {
                    Integer.parseInt(variableNode.getChild(0).getChild(1).getText());
                    typeVariable = EnumType.INT;
                    structureType = "INTEGER";
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
                        structureType = "STRING";
                    }
                }
            }
            enumType = Type.getDefaultType(stringType);
            type = new Type(
                    typeVariable,
                    structureType);
            variableSymbol = new SymboleVariable(variableNode, idf, Scope.GLOBAL, structureType , this.gestionnaireTDS.getTableDesSymboles());    ///symbolTable);

            if (this.gestionnaireTDS.getTableDesSymboles().symbolExists(variableSymbol, true)) {
                System.out.println("Redefining  " + idf + ". Line : " + variableNode.getLine());
            }

            this.gestionnaireTDS.getTableDesSymboles().addSymbol(variableSymbol);

        }
        if(onlyDeclarations){

        }
    }}
    
    private String traverseFunctionCall(Tree functionCallNode)  {
        String type1= " ";
    	String idf = functionCallNode.getChild(0).getText();
        SymbolFonction functionSymbol = this.gestionnaireTDS.getTableDesSymboles().getFunctionSymbol(idf,true);
       int size=0;
        if (functionSymbol == null){
            System.out.println("The function "+ idf + " is not defined. Line :" + functionCallNode.getLine());

        }

        else{
             size = functionSymbol.getReturnNombre();

        }

        
        int realSize = functionCallNode.getChild(1).getChildCount();

        if (size != realSize){
           System.out.println("The function "+ idf + " has been called with wrong number of arguments (" + realSize + " instead of " + size + "). Line :" + functionCallNode.getLine());
        }
        if(!(functionSymbol==null)) {
            for (int i = 0; i < realSize; i++) {
                Tree param = functionCallNode.getChild(1).getChild(i);
                String realType = functionSymbol.returnParam().get(i).getType();
                String type = traverseExpr(param);
                if (!type.equals(realType)) {
                    System.out.println("The argument " + param.getText() + " is called with the wrong type (" + type + " instead of " + realType + "). Line :" + functionCallNode.getLine());
                }
            }
            type1=functionSymbol.getReturn();
        }
        return type1;
    }


    
    private BlocType traverseBloc(Tree blocNode, EnumTypeTableSymbole symbolTableType, boolean createBloc)  {

    	BlocType type = new BlocType(EnumType.VOID, false, blocNode);
        if(createBloc) {
            System.out.println("wawa");
            this.gestionnaireTDS.ouvrirTableDesSymboles();
        }
        for(int i = 0; i < blocNode.getChildCount(); i++) {
            System.out.println("Begin");
            Tree child = blocNode.getChild(i);
            BlocType tempType;
            switch (child.getType()) {
                case AlgolParser.BEGIN:
                    System.out.println("Begin");
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
                  //  tempType = this.traverseWhile(child);

                    if(!type.isDeterminedByReturn()) {
                       // type = tempType;
                    }
                    break;
                case tigerParser.FOR:
                    //tempType = this.traverseWhile(child);
                        //type = tempType;

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
                    //Type exprType = this.traverseExpr(child);

                        //type = new BlocType(exprType.getType(), false, child);
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

        if(typeNode.getChildCount()==0){
            stringType = "INTEGER";
        }
else{
        try { if(currentNode.getText().equals("INTEGER")) {stringType = "INTEGER";}
        	else{Integer.parseInt(currentNode.getText());} 
        	
        	stringType = "INTEGER";
        	} 
        	catch (Exception e) {
                if (!Type.isDefaultType(stringType)) {
                    SymboleStructure structureSymbol = this.gestionnaireTDS
                            .getTableDesSymboles()
                            .getStructureSymbol(currentNode.getChild(1).getText(), true);

                    if (structureSymbol == null) {
                        System.out.println("Unknown type : " + stringType + ". Line : " + typeNode.getLine());
                    }


                } else {
                    stringType = "STRING";
                }
            }
        	
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

    private SymboleVariable traverseParameter(Tree paramNode, tableDesSymboles symbolTable2,String nomFonction, String typearg)  {
    	//System.out.println(paramNode.getText());
    	String idf = this.getID(paramNode);
        Type type = this.traverseType(paramNode);
  //Type type = null;
        SymboleVariable variableSymbol = new SymboleVariable(paramNode, idf, Scope.FUNCTION, typearg,symbolTable2);
        
        
        if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(variableSymbol, true)){
          System.out.println("The parameter " + idf + " is already defined in the function. Line : " + paramNode.getLine());
        }
      
        return variableSymbol;


    }

    private SymboleVariable traverseSwitchelement(Tree paramNode, tableDesSymboles symbolTable2,String nomFonction, String typearg)  {
        //System.out.println(paramNode.getText());
        String idf = this.getID(paramNode);
        Type type = this.traverseType(paramNode);
        SymboleVariable variableSymbol = new SymboleVariable(paramNode, idf, Scope.GLOBAL, typearg,symbolTable2);


        if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(variableSymbol, true)){
            System.out.println("The parameter " + idf + " is already defined in the function. Line : " + paramNode.getLine());
        }

        return variableSymbol;

    }
    private BlocType traverseFor(Tree forNode) {

        BlocType type = null;
        Type type2 = new Type(
                EnumType.INT,
                "int");
        String type1="INTEGER";
        SymboleVariable variableSymbol = new SymboleVariable(forNode, forNode.getChild(0).getChild(0).getText(), Scope.LOCAL, type1, this.gestionnaireTDS.getTableDesSymboles());

        if (!this.gestionnaireTDS.getTableDesSymboles().symbolExists(variableSymbol, true)) {
            System.out.println("FOR : Variable used but not declared: " + forNode.getChild(0).getChild(0).getText() + ". Line : " + forNode.getLine());
        }
        else if(!variableSymbol.getType().equals("INTEGER")){
            System.out.println("FOR : Variable used is not integer: " + forNode.getChild(0).getChild(0).getText() + ". Line : " + forNode.getLine());
        }
        for(int i = 0; i <forNode.getChild(0).getChild(1).getChildCount();i++) {
            Tree actualNode = forNode.getChild(0).getChild(1).getChild(i);
            if(actualNode.getChildCount() == 1)
            {
                if(actualNode.getChild(0).getText().equals("IF")){
                    traverseIf(actualNode.getChild(0));
                }
                else if(!actualNode.getChild(0).getText().matches("^[0-9]+$")){
                    System.out.println("FOR : Value used is not integer: " + actualNode.getChild(0).getText() + ". Line : " + forNode.getLine());
                }
            }
            else{
                if(actualNode.getChild(1).getText().equals("PAS")){
                    String strStepValue = actualNode.getChild(1).getChild(0).getText();
                    boolean stepNegative = false;
                    String infLimit = actualNode.getChild(0).getText();
                    String supLimit = actualNode.getChild(1).getChild(1).getChild(0).getText();
                    if(!strStepValue.matches("^[0-9]+$")){
                        if(strStepValue.matches("-")){
                            stepNegative = true;
                            if(!actualNode.getChild(1).getChild(0).getChild(0).getText().matches("^[0-9]+$")){
                                System.out.println("FOR : Value used is not integer: -" + actualNode.getChild(1).getChild(0).getChild(0).getText() + ". Line : " + actualNode.getChild(1).getChild(0).getChild(0).getLine());
                            }
                        }
                        else{
                            SymboleVariable stepVariable = new SymboleVariable(forNode, actualNode.getChild(1).getChild(0).getText(), Scope.LOCAL, type1, this.gestionnaireTDS.getTableDesSymboles());
                            if(!this.gestionnaireTDS.getTableDesSymboles().symbolExists(stepVariable, true)){
                                System.out.println("FOR : Variable used but not declared: " + actualNode.getChild(1).getChild(0).getText() + ". Line : " + actualNode.getChild(1).getChild(0).getLine());
                            }
                            else if(!stepVariable.getType().equals("INTEGER")){
                                System.out.println("FOR : Value used is not integer: " + actualNode.getChild(1).getChild(0).getText() + ". Line : " +actualNode.getChild(1).getChild(0).getLine());
                            }
                        }
                    }
                    if(!infLimit.matches("^[0-9]+$")){
                        if(infLimit.matches("-")){
                            if(!actualNode.getChild(0).getChild(0).getText().matches("^[0-9]+$")){
                                System.out.println("FOR : Value used is not integer: -" + actualNode.getChild(1).getChild(0).getChild(0).getText() + ". Line : " + actualNode.getChild(1).getChild(0).getChild(0).getLine());
                            }
                        }
                        else{
                            SymboleVariable stepVariable = new SymboleVariable(forNode, actualNode.getChild(0).getText(), Scope.LOCAL, type1, this.gestionnaireTDS.getTableDesSymboles());
                            if(!this.gestionnaireTDS.getTableDesSymboles().symbolExists(stepVariable, true)){
                                System.out.println("FOR : Variable used but not declared: " + actualNode.getChild(0).getText() + ". Line : " + actualNode.getChild(0).getLine());
                            }
                            else if(!stepVariable.getType().equals("INTEGER")){
                                System.out.println("FOR : Value used is not integer: " +actualNode.getChild(0).getText() + ". Line : " +actualNode.getChild(0).getLine());
                            }
                        }
                    }
                    if(!supLimit.matches("^[0-9]+$")){
                        if(supLimit.matches("-")){
                            if(!actualNode.getChild(1).getChild(1).getChild(0).getChild(0).getText().matches("^[0-9]+$")){
                                System.out.println("FOR : Value used is not integer: -" + actualNode.getChild(1).getChild(1).getChild(0).getChild(0).getText() + ". Line : " + actualNode.getChild(1).getChild(1).getChild(0).getChild(0).getLine());
                            }
                        }
                        else{
                            SymboleVariable stepVariable = new SymboleVariable(forNode, actualNode.getChild(1).getChild(1).getChild(0).getText(), Scope.LOCAL, type1, this.gestionnaireTDS.getTableDesSymboles());
                            if(!this.gestionnaireTDS.getTableDesSymboles().symbolExists(stepVariable, true)){
                                System.out.println("FOR : Variable used but not declared: " + actualNode.getChild(1).getChild(1).getChild(0).getText() + ". Line : " + actualNode.getChild(1).getChild(1).getChild(0).getLine());
                            }
                            else if(!stepVariable.getType().equals("INTEGER")){
                                System.out.println("FOR : Value used is not integer: " +actualNode.getChild(1).getChild(1).getChild(0).getText() + ". Line : " +actualNode.getChild(1).getChild(1).getChild(0).getLine());
                            }
                        }
                    }
                    /*if(!actualNode.getChild(0).getText().matches("^[0-9]+$") ||
                        !actualNode.getChild(1).getChild(0).getText().matches("^[0-9]+$") ||
                        !actualNode.getChild(1).getChild(1).getChild(0).getText().matches("^[0-9]+$")){
                        System.out.println("FOR : Value used in STEP is not integer."+ "Line : " + forNode.getLine());
                    }
                    else{
                        if(Integer.parseInt(actualNode.getChild(1).getChild(0).getText()) > 0){
                            if(Integer.parseInt(actualNode.getChild(0).getText()) > Integer.parseInt(actualNode.getChild(1).getChild(1).getChild(0).getText()))
                                System.out.println("FOR (positive step value) : Inferior limit " + actualNode.getChild(0).getText() + " is bigger than the superior limit. Line :" + forNode.getLine());
                        }
                        else if(Integer.parseInt(actualNode.getChild(1).getChild(0).getText()) < 0){
                            if(Integer.parseInt(actualNode.getChild(0).getText()) < Integer.parseInt(actualNode.getChild(1).getChild(1).getChild(0).getText()))
                                System.out.println("FOR (negative step value) : Superior limit " + actualNode.getChild(0).getText() + " is smaller than the inferior limit. Line :" + forNode.getLine());
                        }
                        else if(Integer.parseInt(actualNode.getChild(1).getChild(0).getText()) == 0)
                            System.out.println("FOR : Step value equal to 0" +" Line :" + forNode.getLine());
                    }*/
                }
                else if(actualNode.getChild(1).getText().equals("WHILE")){
                    String sVarWhile = actualNode.getChild(1).getChild(0).getChild(0).getText();
                    SymboleVariable VarWhile = new SymboleVariable(forNode, sVarWhile, Scope.LOCAL, type1, this.gestionnaireTDS.getTableDesSymboles());
                    String infLimit = actualNode.getChild(0).getText();
                    String supLimit = actualNode.getChild(1).getChild(0).getChild(1).getText();
                    if(!infLimit.matches("^[0-9]+$")){
                        if(infLimit.matches("-")){
                            if(!actualNode.getChild(0).getChild(0).getText().matches("^[0-9]+$")){
                                System.out.println("FOR : Value used is not integer: -" + actualNode.getChild(1).getChild(0).getChild(0).getText() + ". Line : " + actualNode.getChild(1).getChild(0).getChild(0).getLine());
                            }
                        }
                        else{
                            SymboleVariable stepVariable = new SymboleVariable(forNode, actualNode.getChild(0).getText(), Scope.LOCAL, type1, this.gestionnaireTDS.getTableDesSymboles());
                            if(!this.gestionnaireTDS.getTableDesSymboles().symbolExists(stepVariable, true)){
                                System.out.println("FOR : Variable used but not declared: " + actualNode.getChild(0).getText() + ". Line : " + actualNode.getChild(0).getLine());
                            }
                            else if(!stepVariable.getType().equals("INTEGER")){
                                System.out.println("FOR : Value used is not integer: " +actualNode.getChild(0).getText() + ". Line : " +actualNode.getChild(0).getLine());
                            }
                        }
                    }
                    if(!this.gestionnaireTDS.getTableDesSymboles().symbolExists(VarWhile, true)){
                        System.out.println("FOR : Variable used but not declared: " + actualNode.getChild(1).getChild(0).getChild(0).getText() + ". Line : " + actualNode.getChild(1).getChild(0).getChild(0).getLine());
                    }
                        /*else if(!VarWhile.getType().isInt()){
                            System.out.println("FOR : Value used is not integer: " +actualNode.getChild(1).getChild(1).getChild(0).getText() + ". Line : " +actualNode.getChild(1).getChild(1).getChild(0).getLine());
                        }*/
                    if(!supLimit.matches("^[0-9]+$")){
                        if(supLimit.matches("-")){
                            if(!actualNode.getChild(1).getChild(0).getChild(1).getChild(0).getText().matches("^[0-9]+$")){
                                System.out.println("FOR : Value used is not integer: -" + actualNode.getChild(1).getChild(0).getChild(1).getChild(0).getText() + ". Line : " + actualNode.getChild(1).getChild(1).getChild(1).getChild(0).getLine());
                            }
                        }
                        else{
                            SymboleVariable stepVariable = new SymboleVariable(forNode, actualNode.getChild(1).getChild(0).getChild(0).getText(), Scope.LOCAL, type1, this.gestionnaireTDS.getTableDesSymboles());
                            if(!this.gestionnaireTDS.getTableDesSymboles().symbolExists(stepVariable, true)){
                                System.out.println("FOR : Variable used but not declared: " + actualNode.getChild(1).getChild(0).getChild(1).getText() + ". Line : " + actualNode.getChild(1).getChild(1).getChild(1).getLine());
                            }
                            else if(!stepVariable.getType().equals("INTEGER")){
                                System.out.println("FOR : Value used is not integer: " +actualNode.getChild(1).getChild(0).getChild(1).getText() + ". Line : " +actualNode.getChild(1).getChild(1).getChild(1).getLine());
                            }
                        }
                    }

                }
            }
        }

        //type = this.traverseBloc(forNode.getChild(2), EnumTypeTableSymbole.FOR, false);
        return type;
    }






    /*private BlocType traverseWhile(Tree whileNode) {

    	BlocType type = null;

        if(whileNode.getType()==tigerParser.FOR) {
            Type type1 = new Type(
                         EnumType.INT,
                         "int");
                 SymboleVariable variableSymbol = new SymboleVariable(whileNode,whileNode.getChild(0).getChild(0).getText(), Scope.LOCAL, "int",this.gestionnaireTDS.getTableDesSymboles());
                 
                 if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(variableSymbol, true)) {
                 	System.out.println("Redefining variable " + whileNode.getChild(0).getChild(0).getText() + ". Line : " + whileNode.getLine());
                 }
                 this.gestionnaireTDS.getTableDesSymboles().addSymbol(variableSymbol);
                     
                     if(!this.traverseExpr(whileNode.getChild(1).getChild(0)).equals("INTEGER") || !this.traverseExpr(whileNode.getChild(0).getChild(1)).equals("INTEGER") ){
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
    }*/

    private BlocType traverseIf(Tree ifNode) {
        BlocType ifType;

        traverseExpr(ifNode.getChild(0));

        if (!(this.traverseExpr(ifNode.getChild(0)).equals("INTEGER"))) {
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

    private String traverseExpr(Tree exprNode)  {
        String leftExpr;
        String rightExpr;
        String type=" ";
        int a=0;
        /*if(exprNode.getChildCount()>1){
            System.out.println("wawa2"+exprNode.getText());
            String type1=traverseExpr(exprNode.getChild(0));
            String type2=traverseExpr(exprNode.getChild(1));
            if(!type1.equals(type2)){
                type="ERROR";
            }
            else{
                type=type1;
            }
        }*/
        switch (exprNode.getType()) {
            case tigerParser.IN:
            case tigerParser.BLOCK:
                break;
            case AlgolParser.OR:
            case AlgolParser.AND:
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if (!leftExpr.equals("INTEGER") || !rightExpr.equals("INTEGER")) {
                    System.out.println("The logical connectives AND and OR should be used with two integers. Line : " + exprNode.getLine());
                    a = 1;
                }


                break;
            case AlgolParser.ASSIGEMENT:
                //	System.out.println("assignement");
                //	System.out.println(exprNode.getText()+exprNode.getChild(0).getText());
                this.traverseASSIG(exprNode);

                //type = new Type( EnumType.VOID,exprNode.getChild(0).getText());
                //	break;
                break;

            case AlgolParser.GREATER:
            case AlgolParser.NOTLESS:
            case AlgolParser.NOT:
            case AlgolParser.IMPL:
            case AlgolParser.LESS:
            case AlgolParser.EQUAL:

                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));


                if (!(leftExpr.equals("INTEGER") && rightExpr.equals("INTEGER"))) {
                    System.out.println("Mathematical inequalities or comparisons should be done between two integers. Line : " + exprNode.getLine());
                    a = 1;
                }

                type = "BOOL";
                break;
            /*case AlgolParser.COND :
            	 
            	type=this.traverseExpr(exprNode.getChild(0));
            	break;*/
            case AlgolParser.PLUS:
            case AlgolParser.MINUS:
            case AlgolParser.MULT:
            case AlgolParser.DIV:

                type = "INTEGER";

                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));


                if (!leftExpr.equals("INTEGER") || !rightExpr.equals("INTEGER")) { // check type int
                    System.out.println("Mathematical operations should be done between two integers. Line : " + exprNode.getLine());
                }

                type = "INTEGER";
                break;
            case tigerParser.NEGATION:
                leftExpr = this.traverseExpr(exprNode.getChild(0));

                try {
                    if (!leftExpr.equals("INTEGER")) {

                        System.out.println("Unary operation should be done with an integer, " + exprNode.getChild(0).getText() + "is not one. Line : " + exprNode.getLine());
                    }
                } catch (Exception e) {
                    System.out.println(" Unary operation should be done with an integer :");
                }

                type = "INTEGER";
                break;

            //case tigerParser.SUBFIELD :

           /* case tigerParser.APPELFONCTION :
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
                 
            */
                
           /* case tigerParser.SEQEXP :
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
                    type = null;
                    }

                break;*/
            case AlgolParser.CALL:
                if (exprNode.getChild(0).getText().equals("print")) {
                    System.out.println(" Cette fonction est de type void et ne peut pas être utlisée pour ce type d'opération LIgne :" + exprNode.getChild(0).getLine());
                } else {
                    type = traverseFunctionCall(exprNode);
                }
                break;
            case AlgolParser.INT:
                type = "INTEGER";
                break;

            case AlgolParser.FLOAT:
                type="REAL";
                break;

            case AlgolParser.ARRAYACCESS:
                //System.out.println("wawa");
                type = this.traverseArrayacces(exprNode);
                break;
            default:
                SymboleVariable variableSymbol = this.gestionnaireTDS.getTableDesSymboles().getVariableSymbol(exprNode.getText(), true);

                if (variableSymbol == null) {
                    System.out.println("the variable does not exist " + exprNode.getText() + ". Line : " + exprNode.getLine());
                    type = "INCONNU";
                } else {
                    type = variableSymbol.getType();
                }

                // System.out.println("Unknown node : " + exprNode.hashCode());
                // type="INCONNU";

        }


        if(a==1){
            type="ERROR";
        }

        return type;
    }


    public String traverseArrayacces(Tree accessnode){
        String type="";
        String idf= accessnode.getChild(0).getText();
        SymboleStructure symbol =this.gestionnaireTDS.getTableDesSymboles().getStructureSymbol(idf,true);
        if(symbol==null){
            System.out.println("le tableau"+ idf+ " n'est pas déclaré"+ "Ligne"+ accessnode.getChild(0).getLine());
        }
        else{
             if(accessnode.getChild(1).getChildCount()!=symbol.list.size()){
         System.out.println(" Le tableau"+ idf+ "est un tableau a"+ symbol.list.size()+"dimension");
            }
             else{
                 for(int k=0;k<accessnode.getChild(1).getChildCount();k++){
                     String type1= traverseExpr(accessnode.getChild(1).getChild(k));
                     if (!type1.equals("INTEGER")){
                         System.out.println(accessnode.getChild(1).getChild(k).getText()+" n'est pas un entier"+ "Ligne"+accessnode.getChild(1).getChild(k).getLine());
                     }
                 }
             }
            type=symbol.type;
        }
        return type;
    }


    private void traverselabel(Tree labelnode, boolean onlyDeclarations){
        String idf = labelnode.getChild(0).getText();
        System.out.println("label");
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
        tableDesSymboles symbolTable = null;//this.gestionnaireTDS.ouvrirTableDesSymboles();
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
        ArrayList<String> typearg= new ArrayList<String>();
        //this.gestionnaireTDS.fermerTableDesSymboles();

        if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(functionSymbol, true)) {

            System.out.println("Redefining function " + idf + ". Line : " + switchNode.getLine());
        }
        for (int i = 0; i < switchNode.getChild(0).getChild(0).getChild(1).getChildCount(); i++){
            SymboleVariable symbVar=traverseSwitchelement(switchNode.getChild(0).getChild(0).getChild(1).getChild(i),functionSymbol.getSymbolTable(), idf,"Switchelement");
            functionSymbol.addPelement(symbVar);

            this.gestionnaireTDS.getTableDesSymboles().addSymbol(symbVar);


        }

        this.gestionnaireTDS.ouvrirTableDesSymboles(functionSymbol.getSymbolTable());
       // BlocType blocType = this.traverseBloc(switchNode.getChild(3), EnumTypeTableSymbole.PROCEDURE, false);

        this.gestionnaireTDS.fermerTableDesSymboles();

        this.gestionnaireTDS.getTableDesSymboles().addSymbol(functionSymbol);


    }


    private BlocType traverseReturn(Tree returnNode) {
        Type type=null;

        if(returnNode.getChildCount() == 1){
           // type = traverseExpr(returnNode.getChild(0));
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
        if(node.getType() == AlgolParser.ID) {
            return node.getText();
        }
        
        else{
            System.out.println(node.getText() + " is an unknown node. Line : " + node.getLine());
            return node.getText();
        }
    }
}
