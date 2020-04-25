package src.TDS;

import org.antlr.runtime.tree.Tree;

public abstract class Symbole {

    private final EnumTypeSymbole symboleType;
    private final String name;
    private int offset; //decalage
    private final Scope scope;
    private final Tree node; // imbrication

    protected Symbole(Tree node, EnumTypeSymbole symboleType, String name, Scope scope) {
        this.node = node;
        this.symboleType = symboleType;
        this.name = name;
        this.scope = scope;
    }

    public EnumTypeSymbole getSymbolType() {
        return this.symboleType;
    }

    public String getName(){
        return name;
    }

    public int getOffset() {
        return offset;
    }

    public Scope getScope() {
        return scope;
    }

    public Tree getNode() {
        return this.node;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getHashName() {

        return this.getName() + this.getSymbolType().getSuffix();
    }

    public String toTable() {
        String str = "";

        str += "|" + Utils.padRight(this.getName(), tableDesSymboles.NAME_COL_WIDTH);
        str += "|" + Utils.padRight(String.valueOf(this.getOffset()),tableDesSymboles.OFFSET_COL_WIDTH);

        return str;
    }
}
