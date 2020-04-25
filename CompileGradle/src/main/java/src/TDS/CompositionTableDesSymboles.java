package src.TDS;

import org.antlr.runtime.tree.Tree;

public abstract class CompositionTableDesSymboles extends Symbole{
   public final tableDesSymboles symboleTable;

    protected CompositionTableDesSymboles(Tree node, EnumTypeSymbole symboleType, String name,String type, Scope scope, tableDesSymboles symboleTable) {
        super(node, symboleType, name, scope);
        this.symboleTable = symboleTable;
    }

    
    public  tableDesSymboles getSymbolTable() {
        return this.symboleTable;
    }


}
