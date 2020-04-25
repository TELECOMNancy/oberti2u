package src.TDS;
import org.antlr.runtime.tree.Tree;

public class BlocType extends Type {
    private final boolean determinedByReturn;
    private final Tree previousNode;

    public BlocType(EnumType type, boolean determinedByReturn, Tree previousNode) {
        super(type);
        this.determinedByReturn = determinedByReturn;
        this.previousNode = previousNode;
    }

    public BlocType(Type type, boolean determinedByReturn, Tree lastNode) {
        super(type.getType(),
                type.getNom());
        this.determinedByReturn = determinedByReturn;
        this.previousNode = lastNode;
    }

    public boolean isDeterminedByReturn() {
        return determinedByReturn;
    }

    public Tree getLastNode() {
        return previousNode;
    }
}
