package src.TDS;

import java.util.Stack;

public class gestionnaireDeTableDesSymboles {
    private final Stack<tableDesSymboles> stack;

    public gestionnaireDeTableDesSymboles() {
        this.stack = new Stack<>();
    }

    public tableDesSymboles ouvrirTableDesSymboles() {
        tableDesSymboles parent = null;

        if(!this.stack.empty()) {
            parent = stack.peek();
        }

        return this.stack.push(new tableDesSymboles(parent, this.stack.size()));
    }

    public tableDesSymboles ouvrirTableDesSymboles(tableDesSymboles tableDesSymboles) {
        return this.stack.push(tableDesSymboles);
    }

    public tableDesSymboles fermerTableDesSymboles() {
        return this.stack.pop();
    }

    public tableDesSymboles getTableDesSymboles() {
    		return this.stack.peek();
    	
    }
    public Stack getStack(){
    	return this.stack;
    }
}
