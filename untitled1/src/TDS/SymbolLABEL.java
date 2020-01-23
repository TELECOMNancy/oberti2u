package TDS;
import org.antlr.runtime.tree.Tree;

import java.util.LinkedList;

public class SymbolLABEL extends CompositionTableDesSymboles {

    public String nom;
    private boolean isDefined;
    public SymbolLABEL(Tree node, String name, Scope scope, tableDesSymboles symbolTable) {
        super(node, EnumTypeSymbole.LABEL, name, scope, symbolTable);
        this.nom=name;
        this.isDefined = false;
    }

    public boolean isDefined() {
        return isDefined;
    }

    public void setDefined(boolean defined) {
        isDefined = defined;
    }

@Override
    public String toTable() {
        String str = super.toTable();

        str += "|" + Utils.padRight("LABEL", tableDesSymboles.SYMBOL_TYPE_COL_WIDTH);
       // str += "|" + Utils.padRight(String.valueOf(this.type.getType()), tableDesSymboles.TYPE_COL_WIDTH);

        str += "|"+ "\n";
        return str;
    }
}
