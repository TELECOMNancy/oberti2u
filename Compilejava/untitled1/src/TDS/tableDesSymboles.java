package TDS;

import jdk.nashorn.internal.ir.Symbol;
import org.antlr.runtime.tree.Tree;

import java.util.*;

public class tableDesSymboles {
	private static int regionCounter = 0;

	public static int NAME_COL_WIDTH = 20;
	public static int OFFSET_COL_WIDTH = 6;
	public static int SYMBOL_TYPE_COL_WIDTH = 15;
	public static int TYPE_COL_WIDTH = 15;

    private tableDesSymboles parent;
    public String name;
    private EnumTypeTableSymbole symbolTableType;
    private final Map<String,Symbole> symbols;
	private  int nestingLevel;
	private  int regionNum;
	private int offsetCount;
	public Map<Integer, tableDesSymboles> blocs;

	public tableDesSymboles(tableDesSymboles parent, int nestingLevel) {
	  //  System.out.println("SUUUUU");
		this.parent = parent;
		this.regionNum = tableDesSymboles.regionCounter++;
		this.nestingLevel = nestingLevel;
		this.symbols = new HashMap<>();
		this.offsetCount = 0;
		this.blocs = new HashMap<>();
	}

	public String getName(){
	    return name;
    }

    public void setName(String name){
	    this.name=name;
    }

	public boolean symbolExists(Symbole symbol,boolean checkParent){
		boolean exists = symbols.containsKey(symbol.getHashName());
		if(!exists && checkParent){
			if(this.getParent() != null){
				return this.getParent().symbolExists(symbol, true);
			}
		}
		return exists;
	}

	public void setParent(tableDesSymboles t){
	    this.parent=t;
    }

	public void removesymbole(Symbole symbol){
	    this.symbols.remove(symbol.getHashName());
    }

    public void addStrut(SymboleStructure a){
	    this.symbols.put(a.getHashName(),a);
	    this.offsetCount+=getTableauxSymbolSize2(a);
	    a.setOffset(this.offsetCount);
    }


	public void addSymbol(Symbole symbol){

		this.symbols.put(symbol.getHashName(), symbol);
		if (symbol instanceof SymboleVariable) {
		    if(symbol.getScope()== Scope.FUNCTION) {
                if(this.offsetCount >= 0) {
                    this.offsetCount = -2;
                }

                this.offsetCount -= this.getVariableSize((SymboleVariable) symbol);
                symbol.setOffset(this.offsetCount);
            }
            else{
                if (this.offsetCount <= 0){
                    this.offsetCount = 0;
                }

                this.offsetCount += this.getVariableSize((SymboleVariable) symbol);
                symbol.setOffset(this.offsetCount);
                
                
            }
        }
	}

    public int getEnvironmentSize() {
        int size = 0;

        for(Symbole symbol: this.getSymbols().values()) {
            if(symbol instanceof SymboleVariable) {
                size += this.getVariableSize((SymboleVariable) symbol);
            }
            else if(symbol instanceof SymboleStructure) {
                size += this.getTableauxSymbolSize2((SymboleStructure) symbol);
            } else if(symbol instanceof TableauxSymbol) {
                size += this.getTableauxSymbolSize((TableauxSymbol) symbol);
            }
            
        }

        return size;
    }

    public int getTableauxSymbolSize2(SymboleStructure TableauxSymbol) {
        int size = 0;
       String type= TableauxSymbol.type;
      for(int i=0;i<TableauxSymbol.list.size();i++){
          size= size+Integer.parseInt(TableauxSymbol.list.get(i).get(1))-Integer.parseInt(TableauxSymbol.list.get(i).get(0))+1;
          size=size*2;
      }
        return size;
    }

    public int getVariableSize(SymboleVariable variableSymbol) {
        int size = 0;
        String type = variableSymbol.getType();
        
        //if(type.isRecord()) {
        //	size = this.getStructureSize(this.getStructureSymbol(type.getNom(), true));;
        //}
         if(type.equals("ARRAY")) {
            size = this.getTableauxSymbolSize(this.getTableauxSymbol("ARRAY", true));
        }
        else if(type.equals("INTEGER")) {
            size = 2;
        }
        else if(type.equals("REAL")) {
            size = 2;
        }
        else if(type.equals("STRING")) {
            size = variableSymbol.getNode().getChild(0).getChild(1).getText().length()-2;
        }

        return size;
    }

    public int getStructureSize(SymboleStructure structureSymbol) {
        int size = 0;

        for(Symbole symbol: structureSymbol.getSymbolTable().getSymbols().values()) {
            if(symbol instanceof SymboleVariable) {
                size += this.getVariableSize((SymboleVariable) symbol);
            }
            else if(symbol instanceof SymboleStructure) {
                size += this.getStructureSize((SymboleStructure) symbol);
            }
            else if(symbol instanceof TableauxSymbol) {
                size += this.getTableauxSymbolSize((TableauxSymbol) symbol);
            }

        }

        return size;
    }

    
    public int getTableauxSymbolSize(TableauxSymbol TableauxSymbol) {
        int size = 0;

        for(Symbole symbol: TableauxSymbol.getSymbolTable().getSymbols().values()) {
            if(symbol instanceof SymboleVariable) {
                size += this.getVariableSize((SymboleVariable) symbol);
            }
            else if(symbol instanceof SymboleStructure) {
                size += this.getStructureSize((SymboleStructure) symbol);
            }
            
            else if(symbol instanceof TableauxSymbol) {
                size += this.getTableauxSymbolSize((TableauxSymbol) symbol);
            }

        }

        return size;
    }
    

	private Symbole getSymbol(String key, boolean checkParent){

	    Symbole symbol = symbols.get(key);
	    if(this.getParent()==null && symbol==null){
	        System.out.println("yo");
            for(Map.Entry<Integer, tableDesSymboles> entry: this.blocs.entrySet()) {
                    symbol=entry.getValue().getSymbol(key,false);

            }
        }
	    if(symbol == null && checkParent && this.getParent() != null) {
	        return this.getParent().getSymbol(key, true);
        }
        else {

            return symbol;
        }
    }
	
	public SymbolFonction getFunctionSymbol(String name, boolean checkParent){
		return (SymbolFonction) getSymbol(name + EnumTypeSymbole.PROCEDURE.getSuffix(), checkParent);
	}

	public SymboleStructure getStructureSymbol(String name, boolean checkParent){
		return (SymboleStructure) getSymbol(name + EnumTypeSymbole.STRUCTURE.getSuffix(), checkParent);
	}

	public SymboleVariable getVariableSymbol(String name, boolean checkParent){

    	
		return (SymboleVariable) getSymbol(name + EnumTypeSymbole.VARIABLE.getSuffix(), checkParent);
	}

	public TableauxSymbol getTableauxSymbol(String name, boolean checkParent){
	return (TableauxSymbol) getSymbol(name + EnumTypeSymbole.ARRAY.getSuffix(), checkParent);
	}

    public SymbolLABEL getLabelSymbol(String name, boolean checkParent){
        return (SymbolLABEL) getSymbol(name + EnumTypeSymbole.LABEL.getSuffix(), checkParent);
    }

    public SymbolSWITCH getSWITCHSymbol(String name, boolean checkParent){
        return (SymbolSWITCH) getSymbol(name + EnumTypeSymbole.SWITCH.getSuffix(), checkParent);
    }
	

	public Map<String,Symbole> getSymbols(){
		return symbols;
	}
	
	public tableDesSymboles getParent(){
		return parent;
	}

	public int getNestingLevel() {
		return nestingLevel;
	}


	public void setNestingLevel(int nest){
	    //this.nestingLevel=nest;
    }

   public void  setRegionnum(int num){
	    this.regionNum=num;
   }
	public int getRegionNum() {
		return regionNum;
	}

	public String toTable() {
		LinkedList<tableDesSymboles> toVisit = new LinkedList<>();
		StringBuilder str = new StringBuilder();
		
		List<Map.Entry<String, Symbole>> list = new ArrayList<>(this.symbols.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Symbole>>() {
            @Override
            public int compare(Map.Entry<String, Symbole> o1, Map.Entry<String, Symbole> o2) {
                return o1.getValue().getOffset() - o2.getValue().getOffset();
            }
        });

			if (list.size() != 0){
			   // System.out.println("wawa");
			    str.append("\n").append(this.getName());
		//str.append("\n").append("|").append(this.getRegionNum())
		//.append("|").append(this.getNestingLevel())
		//.append("|").append("\n");

str.append("|").append(Utils.padRight("NAME", tableDesSymboles.NAME_COL_WIDTH))
		.append("|").append(Utils.padRight("OFFSET", tableDesSymboles.OFFSET_COL_WIDTH))
		.append("|").append(Utils.padRight("SYMB", tableDesSymboles.SYMBOL_TYPE_COL_WIDTH))
		.append("|").append(Utils.padRight("TYPE", tableDesSymboles.TYPE_COL_WIDTH))
		.append("|").append("\n");
	
	}
		for(Map.Entry<String, Symbole> entry: list) {
			
			Symbole symbol = entry.getValue();
           // System.out.println(entry.toString());
			str.append(symbol.toTable());
			if(symbol instanceof CompositionTableDesSymboles) {
				toVisit.offer(((CompositionTableDesSymboles) symbol).getSymbolTable());
			}
		}

		for(Map.Entry<Integer, tableDesSymboles> entry: this.blocs.entrySet()) {
		    //str.append("\n").append(entry.getValue().getName());
			str.append(entry.getValue().toTable());
		}

		return str.toString();
	}

	public void addBloc(int line, tableDesSymboles symbolTable) {
	    this.blocs.put(line, symbolTable);
    }

    public tableDesSymboles  getBloc(int line) {
	    return this.blocs.get(line);
    }

    public EnumTypeTableSymbole getSymbolTableType() {
        return symbolTableType;
    }

    public void setSymbolTableType(EnumTypeTableSymbole symbolTableType) {
        this.symbolTableType = symbolTableType;
    }
}
