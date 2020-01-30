package TDS;

import org.antlr.runtime.tree.Tree;

import java.util.LinkedList;

public class SymbolFonction extends CompositionTableDesSymboles {
	private Type returnType;
	private String types;
	private int NbrParametre;
	private LinkedList<SymboleVariable> listparam;
	
	public SymbolFonction(Tree node, String name, Scope scope, String types, tableDesSymboles symbolTable,int nbrParametre) {
		super(node, EnumTypeSymbole.PROCEDURE, name, types,scope, symbolTable);
		this.returnType = returnType;
		this.types=types;
		this.NbrParametre=nbrParametre;
		this.listparam = new LinkedList<SymboleVariable>();
	}

	public Type getReturnType(){
		return this.returnType;
	}
	
	public int getReturnNombre(){
		return this.NbrParametre;
	}
	
 public void addParam(SymboleVariable symb){
	 this.listparam.add(symb);
	 
 }
	
	public LinkedList<SymboleVariable> returnParam(){
		return this.listparam;
	}
	
	public LinkedList<SymboleVariable> getParameters() {
		LinkedList<SymboleVariable> parameters = new LinkedList<>();

		for(String key: this.getSymbolTable().getSymbols().keySet()) {
		    Symbole symbol = this.getSymbolTable().getSymbols().get(key);

			if(symbol instanceof SymboleVariable) {
		        SymboleVariable variableSymbol = (SymboleVariable)symbol;

		        if(variableSymbol.getOffset() < 0) {
                    parameters.add(variableSymbol);
                }
            }
        }

        return parameters;
	}

	@Override
	public String toTable() {
		String str = super.toTable();

		str += "|" + Utils.padRight("FUNC(" + this.getSymbolTable().getRegionNum() + ")", tableDesSymboles.SYMBOL_TYPE_COL_WIDTH);
		str += "|" + Utils.padRight(String.valueOf(this.getReturnType().getNom()), tableDesSymboles.TYPE_COL_WIDTH);

		str += "|"+"\n";

		return str;
	}
}
