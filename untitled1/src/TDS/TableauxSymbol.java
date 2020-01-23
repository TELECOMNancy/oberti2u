package TDS;


import org.antlr.runtime.tree.Tree;

public class TableauxSymbol extends CompositionTableDesSymboles{
	
	
	public TableauxSymbol(Tree node, String name, Scope scope, tableDesSymboles symboleTable) {
		super(node, EnumTypeSymbole.ARRAY, name, scope, symboleTable);
	}

	public String toTable() {
		String str = super.toTable();

		str += "|" + Utils.padRight("ARRAY(" + this.getSymbolTable().getRegionNum() + ")", symboleTable.SYMBOL_TYPE_COL_WIDTH);
		str += "|" + Utils.padRight(null, tableDesSymboles.TYPE_COL_WIDTH);
		str += "|" +"\n";

		return str;
	}
	
	
	
	
}
