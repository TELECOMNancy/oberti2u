package TDS;

import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;

public class SymboleStructure extends CompositionTableDesSymboles {
 public  int a=1;

 public ArrayList<ArrayList<String>> list;

 public String type;
	public SymboleStructure(Tree node, String name,String type, Scope scope, tableDesSymboles symboleTable) {
		super(node, EnumTypeSymbole.STRUCTURE, name,type,scope, symboleTable);
		this.type=type;
		list=new ArrayList<ArrayList<String>>();
	}


public void addBorne(ArrayList<String> a){
		list.add(a);
}

	@Override
	public String toTable() {
		String str = super.toTable();
        if(a==1) {
			str += "|" + Utils.padRight("ARRAY", symboleTable.SYMBOL_TYPE_COL_WIDTH);
			//str += "|" + Utils.padRight(EnumType.RECORD.getToken(), tableDesSymboles.TYPE_COL_WIDTH);
			str +="|"+Utils.padRight(type, tableDesSymboles.TYPE_COL_WIDTH);
			str += "|" + "\n";
		}
        else{
			str += "|" + Utils.padRight("MATRICE", symboleTable.SYMBOL_TYPE_COL_WIDTH);
			//str += "|" + Utils.padRight(EnumType.RECORD.getToken(), tableDesSymboles.TYPE_COL_WIDTH);
			str +="|"+Utils.padRight(type, tableDesSymboles.TYPE_COL_WIDTH);
			str += "|" + "\n";
		}

		return str;
	}
}
