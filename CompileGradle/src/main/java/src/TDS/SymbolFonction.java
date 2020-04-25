package src.TDS;

import org.antlr.runtime.tree.Tree;

import java.util.LinkedList;

public class SymbolFonction extends CompositionTableDesSymboles {
	private Type returnType;
	private String types;
	private int NbrParametre=0;
	public LinkedList<SymboleVariable> listparam;
	public tableDesSymboles tds;

	public SymbolFonction(Tree node, String name, Scope scope, String types, tableDesSymboles symbolTable,int nbrParametre) {
		super(node, EnumTypeSymbole.PROCEDURE, name, types,scope, symbolTable);
		this.returnType = returnType;
		this.types=types;
		this.NbrParametre=nbrParametre;
		this.tds=symbolTable;
		this.listparam = new LinkedList<SymboleVariable>();
	}

	public tableDesSymboles gettds(){
		return tds;
	}

	public void settds(tableDesSymboles  tds){
		this.tds=tds;
	}

	public Type getReturnType(){
		return this.returnType;
	}

	public String getReturn(){
		return this.types;
	}

	public void setNombre(int nombre){
		this.NbrParametre=nombre;
	}

	public int getReturnNombre(){

		if(this.listparam.size()==0){
			return 0;
		}
		else{
			return this.NbrParametre;
		}
	}

	public void addParam(SymboleVariable symb){
		this.listparam.add(symb);

	}

	public SymboleVariable getParam(int i){
		return this.listparam.get(i);
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

		str += "|" + Utils.padRight("FUNC", tableDesSymboles.SYMBOL_TYPE_COL_WIDTH);
		str += "|" + Utils.padRight(String.valueOf(this.getReturn()), tableDesSymboles.TYPE_COL_WIDTH);

		str += "|"+"\n";

		return str;
	}
}
