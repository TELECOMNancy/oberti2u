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
    public int bloc=0;
    public TreeTraversal(Tree tree) {
        this.gestionnaireTDS = new gestionnaireDeTableDesSymboles();
        this.root = tree;
    }

    public void setNestion(int nestion) {
        this.nestion = nestion;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public tableDesSymboles buildSymbolTable(tableDesSymboles parent,String idf)  {
        tableDesSymboles symbolTable = this.gestionnaireTDS.ouvrirTableDesSymboles();
        Type returntype =new Type(EnumType.VOID);
        this.gestionnaireTDS.getTableDesSymboles().setParent(parent);
        this.gestionnaireTDS.getTableDesSymboles().setName(idf);
        SymbolFonction print= new SymbolFonction(root, "print", Scope.FUNCTION,"VOID",symbolTable,1);
        this.gestionnaireTDS.getTableDesSymboles().addSymbol(print);

        this.traverseFile(root, true);
        this.gestionnaireTDS.fermerTableDesSymboles();
        return symbolTable;
    }
    
    private void traverseFile(Tree root, boolean onlyDeclarations)  {
        //this.gestionnaireTDS.getTableDesSymboles().setName("Begin");
    	if (root.getChildCount() <= 0 ){
            System.out.println("The file you want to load is empty");
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
                               // this.nestion++;
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
                                    this.traverseIf(Child1);
                                    break;
                                case AlgolParser.FOR:
                                    this.traverseFor(Child1);
                                    break;
                                case AlgolParser.CALL:
                                    this.traverseFunctionCall(Child1);
                                    break;
                                case AlgolParser.GOTO:
                                    this.traverseGoto(Child1);
                                    break;
                                case AlgolParser.BEGIN:
                                    if (onlyDeclarations) {
                                     //   this.region++;
                                        bloc++;
                                        TreeTraversal func= new TreeTraversal(Child1);
                                        func.setRegion(region);
                                        func.setNestion(nestion);
                                        TDS.tableDesSymboles symbolTable1 = func.buildSymbolTable(this.gestionnaireTDS.getTableDesSymboles(),"Begin");
                                        SymbolFonction print= new SymbolFonction(root, "print", Scope.FUNCTION,"VOID",symbolTable1,1);
                                        symbolTable1.removesymbole(print);
                                        symbolTable1.setParent(this.gestionnaireTDS.getTableDesSymboles());
                                        symbolTable1.setName("Begin");
                                        this.gestionnaireTDS.getTableDesSymboles().addBloc(bloc-1,symbolTable1);
                                    }
                                    break;
                                default:

                                    break;
                            }
                        }
                        break;

                    case AlgolParser.GOTO:
                        this.traverseGoto(child);
                        break;
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

            }

        }
    }
    }
  
    private void traverseFunction(Tree functionNode, boolean onlyDeclarations) {
        if(functionNode.getChildCount()==2) {
           // System.out.println(functionNode.getText());
            String idf = functionNode.getChild(1).getChild(0).getText();
            ArrayList<String> typearg = new ArrayList<String>();
            int nbrParametre = functionNode.getChild(1).getChild(1).getChildCount();

            Type returnType = new Type(EnumType.VOID);
            String types = "";
            tableDesSymboles symbolTable = this.gestionnaireTDS.ouvrirTableDesSymboles();
            if (functionNode.getChildCount() != 1) {
                returnType = traverseType(functionNode.getChild(0));
                types = functionNode.getChild(0).getText();
            }

            SymbolFonction functionSymbol = new SymbolFonction(
                    functionNode,
                    idf,
                    Scope.LOCAL,
                    types,
                    symbolTable,
                    nbrParametre
            );
            this.gestionnaireTDS.fermerTableDesSymboles();

            if (this.gestionnaireTDS.getTableDesSymboles().symbolExists(functionSymbol, true)) {

                System.out.println("Redefining function " + idf + ". Line : " + functionNode.getLine());
            }
            if (functionNode.getChild(1).getChild(3).getChildCount() == functionNode.getChild(1).getChild(1).getChildCount() + 1) {
                typearg.add(functionNode.getChild(1).getChild(3).getChild(0).getText());
            }
            if (functionNode.getChild(1).getChild(3).getChildCount() == functionNode.getChild(1).getChild(1).getChildCount() * 2) {
                int j = 0;
                while (j < functionNode.getChild(1).getChild(3).getChildCount()) {
                    typearg.add(functionNode.getChild(1).getChild(3).getChild(j).getText());
                    j = j + 2;
                }
            }

            for (int i = 0; i < functionNode.getChild(1).getChild(1).getChildCount(); i++) {
                if (typearg.size() == 1) {
                    SymboleVariable symbVar = traverseParameter(functionNode.getChild(1).getChild(1).getChild(i), functionSymbol.getSymbolTable(), idf, typearg.get(0));
                    functionSymbol.addParam(symbVar);

                   // this.gestionnaireTDS.getTableDesSymboles().addSymbol(symbVar);
                } else {
                    SymboleVariable symbVar = traverseParameter(functionNode.getChild(1).getChild(1).getChild(i), functionSymbol.getSymbolTable(), idf, typearg.get(i));
                    functionSymbol.addParam(symbVar);

                    //this.gestionnaireTDS.getTableDesSymboles().addSymbol(symbVar);
                }

            }

            this.gestionnaireTDS.ouvrirTableDesSymboles(functionSymbol.getSymbolTable());
            // this.traverseFile(functionNode.getChild(1).getChild(4),onlyDeclarations);
            this.gestionnaireTDS.fermerTableDesSymboles();


            this.gestionnaireTDS.getTableDesSymboles().addSymbol(functionSymbol);
            TreeTraversal func = new TreeTraversal(functionNode.getChild(1).getChild(4));
            //func.gestionnaireTDS.getTableDesSymboles().setName(idf);
            //this.gestionnaireTDS.getTableDesSymboles().setName(idf);
            //TDS.tableDesSymboles symb=this.gestionnaireTDS.getTableDesSymboles();
            //symb.setName(idf);
            TDS.tableDesSymboles symbolTable1 = func.buildSymbolTable(this.gestionnaireTDS.getTableDesSymboles(), idf);
            SymbolFonction print = new SymbolFonction(root, "print", Scope.FUNCTION, "VOID", symbolTable, 1);
            symbolTable1.removesymbole(print);
            symbolTable1.setName(idf);
            //symbolTable1.addSymbol(functionSymbol.ge);
            for(int k=0;k<functionSymbol.listparam.size();k++){
              symbolTable1.addSymbol(functionSymbol.getParam(k));
            }
            symbolTable1.setRegionnum(functionSymbol.getSymbolTable().getRegionNum());
            symbolTable1.setNestingLevel(this.nestion);
            functionSymbol.settds(symbolTable1);
            this.gestionnaireTDS.getTableDesSymboles().removesymbole(functionSymbol);
            this.gestionnaireTDS.getTableDesSymboles().addSymbol(functionSymbol);
            bloc++;
            this.gestionnaireTDS.getTableDesSymboles().addBloc(bloc - 1, symbolTable1);
        }
        else{
            String idf =functionNode.getChild(0).getChild(0).getText();
            ArrayList<String> typearg = new ArrayList<String>();
          //System.out.println(idf);
            int nbrParametre = functionNode.getChild(0).getChild(1).getChildCount();
            String types = "VOID";
            tableDesSymboles symbolTable = this.gestionnaireTDS.ouvrirTableDesSymboles();
            SymbolFonction functionSymbol = new SymbolFonction(
                    functionNode,
                    idf,
                    Scope.LOCAL,
                    types,
                    symbolTable,
                    nbrParametre
            );
            this.gestionnaireTDS.fermerTableDesSymboles();

            if (this.gestionnaireTDS.getTableDesSymboles().symbolExists(functionSymbol, true)) {
                System.out.println("Redefining function " + idf + ". Line : " + functionNode.getLine());
            }

            if (functionNode.getChild(0).getChild(1).getChildCount() == functionNode.getChild(0).getChild(2).getChildCount()+1) {
                typearg.add(functionNode.getChild(2).getChild(0).getText());
            }
          //  System.out.println(functionNode.getChild(0).getChild(1).getChildCount());
            if (functionNode.getChild(0).getChild(2).getChildCount() == functionNode.getChild(0).getChild(1).getChildCount()*2) {
                int j = 0;
              //  System.out.println("wawawa");
                while (j < functionNode.getChild(0).getChild(2).getChildCount()) {
                    typearg.add(functionNode.getChild(0).getChild(2).getChild(j).getText());
                    j = j + 2;
                }
            }

            for (int i = 0; i < functionNode.getChild(0).getChild(1).getChildCount(); i++) {
                if (typearg.size() == 1) {
                    SymboleVariable symbVar = traverseParameter(functionNode.getChild(0).getChild(1).getChild(i), functionSymbol.getSymbolTable(), idf, typearg.get(0));
                    functionSymbol.addParam(symbVar);

                  //  this.gestionnaireTDS.getTableDesSymboles().addSymbol(symbVar);
                } else {
                    SymboleVariable symbVar = traverseParameter(functionNode.getChild(0).getChild(1).getChild(i), functionSymbol.getSymbolTable(), idf, typearg.get(i));
                    functionSymbol.addParam(symbVar);

                   // this.gestionnaireTDS.getTableDesSymboles().addSymbol(symbVar);
                }

            }

            this.gestionnaireTDS.ouvrirTableDesSymboles(functionSymbol.getSymbolTable());
            // this.traverseFile(functionNode.getChild(1).getChild(4),onlyDeclarations);
            this.gestionnaireTDS.fermerTableDesSymboles();

            this.gestionnaireTDS.getTableDesSymboles().addSymbol(functionSymbol);
            TreeTraversal func = new TreeTraversal(functionNode.getChild(0).getChild(3));
            //func.gestionnaireTDS.getTableDesSymboles().setName(idf);
            //this.gestionnaireTDS.getTableDesSymboles().setName(idf);
            //TDS.tableDesSymboles symb=this.gestionnaireTDS.getTableDesSymboles();
            //symb.setName(idf);
            TDS.tableDesSymboles symbolTable1 = func.buildSymbolTable(this.gestionnaireTDS.getTableDesSymboles(), idf);
            SymbolFonction print = new SymbolFonction(root, "print", Scope.FUNCTION, "VOID", symbolTable, 1);
            symbolTable1.removesymbole(print);
            symbolTable1.setName(idf);

            for(int k=0;k<functionSymbol.listparam.size();k++){
                symbolTable1.addSymbol(functionSymbol.getParam(k));
            }
            symbolTable1.setRegionnum(functionSymbol.getSymbolTable().getRegionNum());
            symbolTable1.setNestingLevel(this.nestion);
            functionSymbol.settds(symbolTable1);
            this.gestionnaireTDS.getTableDesSymboles().removesymbole(functionSymbol);
            this.gestionnaireTDS.getTableDesSymboles().addSymbol(functionSymbol);
            bloc++;
            this.gestionnaireTDS.getTableDesSymboles().addBloc(bloc - 1, symbolTable1);


        }

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
        SymboleVariable variableSymbol = new SymboleVariable(structFieldNode, idf, Scope.LOCAL, "ARRAY",symbolTable,0);
      
        if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(variableSymbol,false)) {
            System.out.println("The element " + variableSymbol.getName()+" is already defined in the structure. Line : " + structFieldNode.getLine());
        }
        else {
        	this.gestionnaireTDS.fermerTableDesSymboles();
            this.gestionnaireTDS.getTableDesSymboles().addSymbol(variableSymbol);
        }
    }
    
    private void traverseASSIG(Tree variableNode) {
        tableDesSymboles Parent=this.gestionnaireTDS.getTableDesSymboles().getParent();
        tableDesSymboles courant= this.gestionnaireTDS.getTableDesSymboles();
        String idf = variableNode.getChild(0).getText();
        String types = "";
        SymboleVariable variableSymbol = null;
        String type = this.traverseExpr(variableNode.getChild(1));
        String stringType2 = type;

        if(courant.getName().equals(idf)){
            SymbolFonction fcourant=courant.getFunctionSymbol(idf,true);
            String typeRetour= fcourant.getReturn();
            if(!typeRetour.equals(type)){
                System.out.println("La fonction " + idf + " doit retourner un  " +typeRetour+ " et pas un " + type + ". Ligne "+variableNode.getChild(1).getLine());
            }
        }

        else{

            if (idf.equals("ARRAYACCESS")) {
                types = traverseArrayacces(variableNode.getChild(0));
            //System.out.println(types);
                if (!types.equals(type)) {
                    System.out.println("Affectation impossibles car types incompatibles " + types + ". Ligne " + variableNode.getChild(1).getLine());
                }
            }

            else {
                variableSymbol = this.gestionnaireTDS.getTableDesSymboles().getVariableSymbol(idf, true);
                if (variableSymbol == null) {
                    System.out.println("Affectation impossibles : " + idf + " n'existe pas. Ligne " + variableNode.getChild(1).getLine());
                }
                else {
                    types = variableSymbol.getType();
                    if (!types.equals(type)) {
                        System.out.println("Affectation impossibles car types incompatibles " + type + ". Ligne " + variableNode.getChild(1).getLine());
                    }
                }
            /*}
            else{
                if (!type.equals(variableSymbol.types)) {
                    System.out.println("Affectation impossible car types incompatibles " + stringType2 + ". Ligne " + variableNode.getChild(1).getLine());
                }
            }*/
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
                    //Integer.parseInt(variableNode.getChild(0).getChild(1).getText());
                    typeVariable = EnumType.INT;
                    structureType = variableNode.getChild(0).getText();
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
            variableSymbol = new SymboleVariable(variableNode, idf, Scope.GLOBAL, structureType , this.gestionnaireTDS.getTableDesSymboles(),0);    ///symbolTable);

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
            System.out.println("La fonction "+ idf + " n'existe pas. Ligne" + functionCallNode.getLine());

        }

        else{
             size = functionSymbol.getReturnNombre();

        }

        int realSize = functionCallNode.getChild(1).getChildCount();

        if (size != realSize){
           System.out.println("La fonction "+ idf + " a été appelée avec le mauvais nombre d'arguments (" + realSize + " au lieu de  " + size + "). Ligne " + functionCallNode.getLine());
        }
        if(!(functionSymbol==null)) {
            for (int i = 0; i < realSize; i++) {
                Tree param = functionCallNode.getChild(1).getChild(i);
                String realType = functionSymbol.returnParam().get(i).getType();
                String type = traverseExpr(param);
                if (!type.equals(realType)) {
                    System.out.println("L'argument " + param.getText() + " est de type " + type + " et pas " + realType + ". Ligne " + functionCallNode.getLine());
                }
            }
            type1=functionSymbol.getReturn();
        }
        return type1;
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
                case AlgolParser.BEGIN:
                	//this.traverseFile(child,true);
                    TreeTraversal func= new TreeTraversal(child);
                    //func.setRegion(this.region);
                    func.setNestion(this.nestion);
                    TDS.tableDesSymboles symbolTable1 = func.buildSymbolTable(this.gestionnaireTDS.getTableDesSymboles(),"Begin");
                    SymbolFonction print= new SymbolFonction(root, "print", Scope.FUNCTION,"VOID",symbolTable1,1);
                    symbolTable1.removesymbole(print);
                    symbolTable1.setName("Begin");
                    symbolTable1.setParent(this.gestionnaireTDS.getTableDesSymboles());
                    this.gestionnaireTDS.getTableDesSymboles().addBloc(2,symbolTable1);
                    if(!type.isDeterminedByReturn()) {
                        type = new BlocType(EnumType.VOID, false, child);
                    }
            
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
        SymboleVariable variableSymbol = new SymboleVariable(paramNode, idf, Scope.FUNCTION, typearg,symbolTable2,1);
        
        
        if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(variableSymbol, true)){
          System.out.println("Le parametre " + idf + " est déjà défini dans la fonction. Ligne  " + paramNode.getLine());
        }
      
        return variableSymbol;


    }

    private SymboleVariable traverseSwitchelement(Tree paramNode, tableDesSymboles symbolTable2,String nomFonction, String typearg)  {
        //System.out.println(paramNode.getText());
        String idf = this.getID(paramNode);
        Type type = this.traverseType(paramNode);
        SymboleVariable variableSymbol = new SymboleVariable(paramNode, idf, Scope.GLOBAL, typearg,symbolTable2,0);


        if(this.gestionnaireTDS.getTableDesSymboles().symbolExists(variableSymbol, true)){
            System.out.println("Le paramètre  " + idf + " est déjà défini dans la fonction. Ligne " + paramNode.getLine());
        }

        return variableSymbol;

    }
    private BlocType traverseFor(Tree forNode) {

        BlocType type = null;
        Type type2 = new Type(
                EnumType.INT,
                "int");
        String type1="INTEGER";
        SymboleVariable variableSymbol = new SymboleVariable(forNode, forNode.getChild(0).getChild(0).getText(), Scope.LOCAL, type1, this.gestionnaireTDS.getTableDesSymboles(),0);

        if (!this.gestionnaireTDS.getTableDesSymboles().symbolExists(variableSymbol, true)) {
            System.out.println("FOR : Variable non déclarée :  " + forNode.getChild(0).getChild(0).getText() + ". Ligne  " + forNode.getLine());
        }
        else if(!traverseExpr(forNode.getChild(0).getChild(0)).equals("INTEGER")){
            System.out.println("FOR : La variable " + forNode.getChild(0).getChild(0).getText() + " n'est pas entière. Ligne  " + forNode.getLine());
        }
        for(int i = 0; i <forNode.getChild(0).getChild(1).getChildCount();i++) {
            Tree actualNode = forNode.getChild(0).getChild(1).getChild(i);
            if(actualNode.getChildCount() == 1)
            {
                if(actualNode.getChild(0).getText().equals("IF")){
                    traverseIf(actualNode.getChild(0));
                }
                else if(!traverseExpr(actualNode.getChild(0)).equals("INTEGER") && !traverseExpr(actualNode.getChild(0)).equals("REAL")){
                    System.out.println("FOR : L'expression n'est pas entière ou réel. Line : " + forNode.getLine());
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
                            if(!actualNode.getChild(1).getChild(0).getChild(0).getText().matches("^[0-9]+$")){
                                System.out.println("FOR : La variable n'est pas entière ou réel: -" + actualNode.getChild(1).getChild(0).getChild(0).getText() + ". Line : " + actualNode.getChild(1).getChild(0).getChild(0).getLine());
                            }
                        }
                        else{
                            SymboleVariable stepVariable = new SymboleVariable(forNode, actualNode.getChild(1).getChild(0).getText(), Scope.LOCAL, type1, this.gestionnaireTDS.getTableDesSymboles(),0);
                            if(!this.gestionnaireTDS.getTableDesSymboles().symbolExists(stepVariable, true)){
                                System.out.println("FOR : Variable non déclarée: " + actualNode.getChild(1).getChild(0).getText() + ". Line : " + actualNode.getChild(1).getChild(0).getLine());
                            }
                            else if(!actualNode.getChild(1).getChild(0).getText().equals("INTEGER")){
                                System.out.println("FOR : La variable n'est pas entière ou réel: " + actualNode.getChild(1).getChild(0).getText() + ". Line : " +actualNode.getChild(1).getChild(0).getLine());
                            }
                        }
                    }
                    if(!infLimit.matches("^[0-9]+$")){
                        if(infLimit.matches("-")){
                            if(!actualNode.getChild(0).getChild(0).getText().matches("^[0-9]+$")){
                                System.out.println("FOR : La variable n'est pas entière: -" + actualNode.getChild(1).getChild(0).getChild(0).getText() + ". Line : " + actualNode.getChild(1).getChild(0).getChild(0).getLine());
                            }
                        }
                        else{
                            SymboleVariable stepVariable = new SymboleVariable(forNode, actualNode.getChild(0).getText(), Scope.LOCAL, type1, this.gestionnaireTDS.getTableDesSymboles(),0);
                            if(!this.gestionnaireTDS.getTableDesSymboles().symbolExists(stepVariable, true)){
                                System.out.println("FOR : Variable non déclarée: " + actualNode.getChild(0).getText() + ". Line : " + actualNode.getChild(0).getLine());
                            }
                            else if(!actualNode.getChild(0).getText().equals("INTEGER")){
                                System.out.println("FOR : La variable n'est pas entière ou réel: " +actualNode.getChild(0).getText() + ". Line : " +actualNode.getChild(0).getLine());
                            }
                        }
                    }
                    if(!supLimit.matches("^[0-9]+$")){
                        if(supLimit.matches("-")){
                            if(!actualNode.getChild(1).getChild(1).getChild(0).getChild(0).getText().matches("^[0-9]+$")){
                                System.out.println("FOR : La variable n'est pas entière: -" + actualNode.getChild(1).getChild(1).getChild(0).getChild(0).getText() + ". Line : " + actualNode.getChild(1).getChild(1).getChild(0).getChild(0).getLine());
                            }
                        }
                        else{
                            SymboleVariable stepVariable = new SymboleVariable(forNode, actualNode.getChild(1).getChild(1).getChild(0).getText(), Scope.LOCAL, type1, this.gestionnaireTDS.getTableDesSymboles(),0);
                            if(!this.gestionnaireTDS.getTableDesSymboles().symbolExists(stepVariable, true)){
                                System.out.println("FOR : Variable non déclarée: " + actualNode.getChild(1).getChild(1).getChild(0).getText() + ". Line : " + actualNode.getChild(1).getChild(1).getChild(0).getLine());
                            }
                            else if(!stepVariable.getType().equals("INTEGER")){
                                System.out.println("FOR : La variable n'est pas entière: " +actualNode.getChild(1).getChild(1).getChild(0).getText() + ". Line : " +actualNode.getChild(1).getChild(1).getChild(0).getLine());
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
                    SymboleVariable VarWhile = new SymboleVariable(forNode, sVarWhile, Scope.LOCAL, type1, this.gestionnaireTDS.getTableDesSymboles(),0);
                    String infLimit = actualNode.getChild(0).getText();
                    String supLimit = actualNode.getChild(1).getChild(0).getChild(1).getText();
                    if(!infLimit.matches("^[0-9]+$")){
                        if(infLimit.matches("-")){
                            if(!actualNode.getChild(0).getChild(0).getText().matches("^[0-9]+$")){
                                System.out.println("FOR : La variable n'est pas entière: -" + actualNode.getChild(1).getChild(0).getChild(0).getText() + ". Line : " + actualNode.getChild(1).getChild(0).getChild(0).getLine());
                            }
                        }
                        else{
                            SymboleVariable stepVariable = new SymboleVariable(forNode, actualNode.getChild(0).getText(), Scope.LOCAL, type1, this.gestionnaireTDS.getTableDesSymboles(),0);
                            if(!this.gestionnaireTDS.getTableDesSymboles().symbolExists(stepVariable, true)){

                                System.out.println("FOR : Variable non déclarée: " + actualNode.getChild(0).getText() + ". Line : " + actualNode.getChild(0).getLine());
                            }
                            else if(!stepVariable.getType().equals("INTEGER")){
                                System.out.println("FOR : La variable n'est pas entière: " +actualNode.getChild(0).getText() + ". Line : " +actualNode.getChild(0).getLine());
                            }
                        }
                    }
                    if (!(this.traverseExpr(actualNode.getChild(1)).equals("BOOL"))) {
                        System.out.println("FOR: Expression doit être BOOL. Line : "+ actualNode.getChild(1).getLine()+ ".");
                    }


                }
            }
        }

        type = this.traverseBloc(forNode.getChild(1), EnumTypeTableSymbole.FOR, false);
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
    private void traverseGoto(Tree GOTO) {
        Tree fils = GOTO.getChild(0);

        if (fils.getType() == AlgolParser.ARRAYACCESS) {
            String idf = fils.getChild(0).getText();
            SymbolSWITCH symbol = this.gestionnaireTDS.getTableDesSymboles().getSWITCHSymbol(idf, true);
            if (symbol == null) {
                System.out.println("Le switch " + idf + " n'existe pas. Ligne " + GOTO.getChild(0).getLine());
            } else {
                if(fils.getChild(1).getChildCount()>1){System.out.println("Il ne doit y avoir qu'un seul indice. Ligne "+GOTO.getChild(0).getLine());}
                else{
                    String type1 = traverseExpr(fils.getChild(1).getChild(0));
                    if (!type1.equals("INTEGER")) {
                        System.out.println("L'indice d'accès à un element de switch doit être entier. Ligne " + GOTO.getChild(0).getLine());
                    }

                }
            }
        }
        else {
            if(fils.getType()==AlgolParser.IF) {
                traverseIf(fils);
                Tree filsThen = fils.getChild(1).getChild(0);
                Tree filsElse = fils.getChild(2).getChild(0);
                while (filsElse.getType() == AlgolParser.IF) {
                    traverseGoto(filsThen.getParent());

                    if (filsElse.getType() == AlgolParser.IF) {
                        //traverseIf(filsElse);
                        filsThen = filsElse.getChild(1).getChild(0);
                        filsElse = filsElse.getChild(2).getChild(0);
                    } else {
                        traverseGoto(filsElse.getParent());
                    }

                }
                traverseGoto(filsThen.getParent());
                traverseGoto(filsElse.getParent());
            }

            else{
                String labelName = fils.getText();
                SymbolLABEL label = this.gestionnaireTDS.getTableDesSymboles().getLabelSymbol(labelName, true);
                if (label == null) {
                    System.out.println("Le label "+labelName+" n'existe pas. Ligne " + GOTO.getChild(0).getLine());




                }

            }

        }
    }


    private BlocType traverseIf(Tree ifNode) {
        BlocType type = null;
        if(!traverseExpr(ifNode.getChild(0)).equals("BOOL")){
            System.out.println("IF : Expression must be boolean. Line : " + ifNode.getChild(0).getLine());
        }
        type = this.traverseBloc(ifNode.getChild(1), EnumTypeTableSymbole.IF, true);
        if(ifNode.getChildCount() == 3){
            type = this.traverseBloc(ifNode.getChild(2),EnumTypeTableSymbole.IF,true);
        }
        return type;
    }


    private String traverseExpr(Tree exprNode)  {
        String leftExpr; //on peut pas faire leftExpr = this.traverseExpr(exprNode.getChild(0)); malheureusement
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
        if(exprNode.getText().equals("-")){
            String aux = traverseExpr(exprNode.getChild(0));
            if(aux.equals("REAL") || aux.equals("INTEGER"))
                return aux;
        }

        switch (exprNode.getType()) {
            //case tigerParser.IN:
            //case tigerParser.BLOCK:
               // break;

            case AlgolParser.OR:
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if (!leftExpr.equals("BOOL") || !rightExpr.equals("BOOL")) {
                    System.out.println("La connection logique || doit être utilisée avec 2 entitées booléennes. Line : " + exprNode.getLine());
                    a = 1;
                }
                else {
                    type = "BOOL";
                }
                break;

            case AlgolParser.AND:
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if (!leftExpr.equals("BOOL") || !rightExpr.equals("BOOL")) {
                    System.out.println("La connection logique && doit être utilisée avec 2 entitées booléennes. Line : " + exprNode.getLine());
                    a = 1;
                }
                else {
                    type = "BOOL";
                }
                break;

            case AlgolParser.GREATER:
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if (leftExpr.equals("BOOL") || rightExpr.equals("BOOL")) {
                    System.out.println("La connection logique > ne peut pas être utilisée avec des entitées booléennes. Line : " + exprNode.getLine());
                    a = 1;
                }
                else {
                    type = "BOOL";
                }
                break;

            case AlgolParser.NOTGREATER:
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if (leftExpr.equals("BOOL") || rightExpr.equals("BOOL")) {
                    System.out.println("La connection logique !> ne peut pas être utilisée avec des entitées booléennes. Line : " + exprNode.getLine());
                    a = 1;
                }
                else {
                    type = "BOOL";
                }
                break;

            case AlgolParser.LESS:
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if (leftExpr.equals("BOOL") || rightExpr.equals("BOOL")) {
                    System.out.println("La connection logique < ne peut pas être utilisée avec des entitées booléennes. Line : " + exprNode.getLine());
                    a = 1;
                }
                else {
                    type = "BOOL";
                }
                break;

            case AlgolParser.NOTLESS:
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if (leftExpr.equals("BOOL") || rightExpr.equals("BOOL")) {
                    System.out.println("La connection logique !< ne peut pas être utilisée avec des entitées booléennes. Line : " + exprNode.getLine());
                    a = 1;
                }
                else {
                    type = "BOOL";
                }
                break;

            case AlgolParser.EQUAL:
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if (leftExpr.equals("BOOL") || rightExpr.equals("BOOL")) {
                    System.out.println("La connection logique == ne peut pas être utilisée avec des entitées booléennes. Line : " + exprNode.getLine());
                    a = 1;
                }
                else {
                    type = "BOOL";
                }
                break;

            case AlgolParser.NOTEQUAL:
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if (leftExpr.equals("BOOL") || rightExpr.equals("BOOL")) {
                    System.out.println("La connection logique != ne peut pas être utilisée avec des entitées booléennes. Line : " + exprNode.getLine());
                    a = 1;
                }
                else {
                    type = "BOOL";
                }
                break;

            case AlgolParser.NOT:
                leftExpr = this.traverseExpr(exprNode.getChild(0));

                if (!leftExpr.equals("BOOL")) {
                    System.out.println("La connection logique négation doit être utilisée avec 1 entitée booléenne. Line : " + exprNode.getLine());
                    a = 1;
                }
                else {
                    type = "BOOL";
                }
                break;
            case AlgolParser.IMPL:


            case AlgolParser.ASSIGEMENT:
                //	System.out.println("assignement");
                //	System.out.println(exprNode.getText()+exprNode.getChild(0).getText());
                this.traverseASSIG(exprNode);

                //type = new Type( EnumType.VOID,exprNode.getChild(0).getText());
                //	break;
                leftExpr = this.traverseExpr(exprNode.getChild(0));
//                rightExpr = this.traverseExpr(exprNode.getChild(1));
//
//                if (!(leftExpr.equals("INTEGER") && rightExpr.equals("INTEGER"))) {
//                    System.out.println("Mathematical inequalities or comparisons should be done between two integers. Line : " + exprNode.getLine());
//                    a = 1;
//                }

                type = leftExpr;
                break;
            /*case AlgolParser.COND :
            	 
            	type=this.traverseExpr(exprNode.getChild(0));
            	break;*/
            case AlgolParser.PLUS:
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if (leftExpr.equals("BOOL") || rightExpr.equals("BOOL")) {
                    System.out.println("L'opperation + ne peut pas être utilisée avec des entitées booléennes. Line : " + exprNode.getLine());
                    a=1;
                }
                else if (leftExpr.equals("INTEGER") && rightExpr.equals("INTEGER")){
                    type = "INTEGER";
                }
                else {
                    type = "REAL";
                }
                break;

            case AlgolParser.MINUS:
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if (leftExpr.equals("BOOL") || rightExpr.equals("BOOL")) {
                    System.out.println("L'opperation - ne peut pas être utilisée avec des entitées booléennes. Line : " + exprNode.getLine());
                    a=1;
                }
                else if (leftExpr.equals("INTEGER") && rightExpr.equals("INTEGER")){
                    type = "INTEGER";
                }
                else {
                    type = "REAL";
                }
                break;

            case AlgolParser.MULT:
                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if (leftExpr.equals("BOOL") || rightExpr.equals("BOOL")) {
                    System.out.println("L'opperation * ne peut pas être utilisée avec des entitées booléennes. Line : " + exprNode.getLine());
                    a=1;
                }
                else if (leftExpr.equals("INTEGER") && rightExpr.equals("INTEGER")){
                    type = "INTEGER";
                }
                else {
                    type = "REAL";
                }
                break;

            case AlgolParser.DIV:

                leftExpr = this.traverseExpr(exprNode.getChild(0));
                rightExpr = this.traverseExpr(exprNode.getChild(1));

                if (leftExpr.equals("BOOL") || rightExpr.equals("BOOL")) {
                    System.out.println("L'opperation / ne peut pas être utilisée avec des entitées booléennes. Line : " + exprNode.getLine());
                    a=1;
                }
                else if (leftExpr.equals("INTEGER") && rightExpr.equals("INTEGER")){
                    type = "INTEGER";
                }
                else {
                    type = "REAL";
                }
                break;

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

            case AlgolParser.TRUE:
                type = "BOOL";
                break;

            case AlgolParser.FALSE:
                type = "BOOL";
                break;

            case AlgolParser.ARRAYACCESS:
                type = this.traverseArrayacces(exprNode);
                break;
            default:
                SymboleVariable variableSymbol = this.gestionnaireTDS.getTableDesSymboles().getVariableSymbol(exprNode.getText(), true);

                if (variableSymbol == null) {
                    System.out.println("La variable " + exprNode.getText() + " n'a pas été declarée. Line : " + exprNode.getLine());
                    type = "INCONNU";
                } else {
                    type = variableSymbol.getType();
                }

        }


        if(a==1){
            type="ERROR";
        }

        return type;
    }


    private String traverseArrayacces(Tree accessnode){
        String type="";
        String idf= accessnode.getChild(0).getText();
        SymboleStructure symbol =this.gestionnaireTDS.getTableDesSymboles().getStructureSymbol(idf,true);
        if(symbol==null){
            System.out.println("le tableau "+ idf+ " n'est pas déclaré. "+ "Ligne "+ accessnode.getChild(0).getLine());
        }
        else{
             if(accessnode.getChild(1).getChildCount()!=symbol.list.size()){
                 String plur="";
                 if(symbol.list.size()>1){
                     plur="s";
                 }
            System.out.println("Le tableau "+ idf+ " est un tableau à "+ symbol.list.size()+" dimension"+plur);
            }
             else{
                 for(int k=0;k<accessnode.getChild(1).getChildCount();k++){
                     String type1= traverseExpr(accessnode.getChild(1).getChild(k));
                     if (!type1.equals("INTEGER")){
                         System.out.println(accessnode.getChild(1).getChild(k).getText()+" n'est pas un entier. "+ "Ligne "+accessnode.getChild(1).getChild(k).getLine());
                     }
                 }
             }
            type=symbol.type;
        }
        return type;
    }


    private void traverselabel(Tree labelnode, boolean onlyDeclarations){
        String idf = labelnode.getChild(0).getText();
        //System.out.println("label");
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

            System.out.println("Redefinition de fonction " + idf + ". Ligne " + labelnode.getLine());
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

            System.out.println("Redefinition de fonction " + idf + ". Ligne  " + switchNode.getLine());
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
