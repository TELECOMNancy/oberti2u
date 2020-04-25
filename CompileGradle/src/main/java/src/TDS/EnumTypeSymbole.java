package src.TDS;

public enum EnumTypeSymbole {
    LABEL("LABEL"),
    PROCEDURE("PROCEDURE"),
    STRUCTURE("struct"),
    ARRAY("ARRAY"),
    RECORD("record"),
    VARIABLE("VAR"),
    SWITCH("SWITCH");
    private final String suffix;

    EnumTypeSymbole(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return this.suffix;
    }
}
