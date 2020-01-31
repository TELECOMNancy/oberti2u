package TDS;

public enum EnumType {
    VOID("void"),
    INT("INTEGER"),
    STRING("STRING"),
    RECORD("record"),
    ARRAY("ARRAY"),
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
