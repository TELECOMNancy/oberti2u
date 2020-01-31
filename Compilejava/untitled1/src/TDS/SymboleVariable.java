package TDS;


import org.antlr.runtime.tree.Tree;



public class SymboleVariable extends Symbole {

    public Type type;
    private boolean isDefined;

    public SymboleVariable(Tree node, String name, Scope scope, Type type, tableDesSymboles symbolTable) {
        super(node, EnumTypeSymbole.VARIABLE, name, scope/*,symbolTable*/);
        this.type = type;
        this.isDefined = false;
    }

    public Type getType(){
        return this.type;
    }

    public void setType(Type type){
        this.type = type;
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

	str += "|" + Utils.padRight("VAR", tableDesSymboles.SYMBOL_TYPE_COL_WIDTH);
str += "|" + Utils.padRight(String.valueOf(this.type.getType()), tableDesSymboles.TYPE_COL_WIDTH);

str += "|"+ "\n";
        return str;
    }

}
