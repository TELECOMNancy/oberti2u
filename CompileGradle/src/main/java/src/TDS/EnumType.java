package src.TDS;

public enum EnumType {
    VOID("void"),
    INT("INTEGER"),
    REAL("REAL"),
    STRING("STRING"),
    RECORD("record"),
    ARRAY("ARRAY"),
    //REAL("REAL"),
   // RECORD("record"),
   UNDEFINED ("undefined");

    private final String token;

    EnumType(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
