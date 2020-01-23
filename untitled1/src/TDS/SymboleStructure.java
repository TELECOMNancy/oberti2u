package TDS;

import org.antlr.runtime.tree.Tree;

public class SymboleStructure extends CompositionTableDesSymboles {

	public SymboleStructure(Tree node, String name, Scope scope, tableDesSymboles symboleTable) {
		super(node, EnumTypeSymbole.STRUCTURE, name, scope, symboleTable);
	}

	@Override
	public String toTable() {
		String str = super.toTable();

		str += "|" + Utils.padRight("STRUCT(" + this.getSymbolTable().getRegionNum() + ")", symboleTable.SYMBOL_TYPE_COL_WIDTH);
		//str += "|" + Utils.padRight(EnumType.RECORD.getToken(), tableDesSymboles.TYPE_COL_WIDTH);
		str += "|"+"\n";

		return str;
	}
}
