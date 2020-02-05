package TDS;

import org.antlr.runtime.tree.Tree;

import java.util.LinkedList;

public class SymbolSWITCH extends CompositionTableDesSymboles{
    private LinkedList<SymboleVariable> listswitch;
    private int nombre;
    private String type;
    public SymbolSWITCH(Tree node, String name,String type,Scope scope, tableDesSymboles symbolTable,int nombre){
       super(node, EnumTypeSymbole.SWITCH, name,type, scope, symbolTable);
       this.nombre=nombre;
       this.type=type;
        this.listswitch = new LinkedList<SymboleVariable>();
    }

    public LinkedList<SymboleVariable> returnlisswitch(){
        return this.listswitch;
    }

    public LinkedList<SymboleVariable> getSwitchpara() {
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

        str += "|" + Utils.padRight("SWITCH" +0+ ")", tableDesSymboles.SYMBOL_TYPE_COL_WIDTH);
       // str += "|" + Utils.padRight(String.valueOf(this.getReturnType().getNom()), tableDesSymboles.TYPE_COL_WIDTH);

        str += "|"+"\n";

        return str;
    }



    public void addPelement(SymboleVariable symb){
        this.listswitch.add(symb);

    }
}
