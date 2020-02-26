package TDS;


import org.antlr.runtime.tree.Tree;



public class SymboleVariable extends Symbole {

    public Type type;
    public String types;
    private boolean isDefined;
    public int typess;

    public SymboleVariable(Tree node, String name, Scope scope, String type, tableDesSymboles symbolTable, int typess) {
        super(node, EnumTypeSymbole.VARIABLE, name, scope/*,symbolTable*/);
        this.types = type;
        this.isDefined = false;
        this.typess = typess;
    }

    public String getType() {
        return this.types;
    }

    public void setType(Type type) {
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
        if (typess == 0) {

            str += "|" + Utils.padRight("VAR", tableDesSymboles.SYMBOL_TYPE_COL_WIDTH);
            str += "|" + Utils.padRight(String.valueOf(this.types), tableDesSymboles.TYPE_COL_WIDTH);

            str += "|" + "\n";
            //return str;
        } else {
            str += "|" + Utils.padRight("ARG", tableDesSymboles.SYMBOL_TYPE_COL_WIDTH);
            str += "|" + Utils.padRight(String.valueOf(this.types), tableDesSymboles.TYPE_COL_WIDTH);

            str += "|" + "\n";
        }
        return str;
    }
}
