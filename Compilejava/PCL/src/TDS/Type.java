package TDS;

public class Type {
    private final EnumType type;
    private final String nom;


    public static boolean isDefaultType(String type) {
        switch (type) {
            case "int":
            case "string":
                return true;
            default:
                return false;
        }
    }
    
    
    
    
    
    
    public static EnumType getDefaultType(String type) {
        EnumType enumType;

        switch (type) {
            case "int":
                enumType = EnumType.INT;
                break;
           
            case "string" :
                enumType = EnumType.STRING;
            
            default:
                enumType = null;
        }

        return enumType;
    }

   public Type(EnumType type, String nom) {
        this.type = type;
        this.nom = nom;
    }
   
    public Type(EnumType type) {
        this(type, type.getToken());
    }

    //public boolean isRecord() {
    //    return this.type == EnumType.RECORD;
    //}


    public boolean isArray() {
        return this.type == EnumType.ARRAY;
    }

    public boolean isInt() {
        return this.type == EnumType.INT;
    }

    public boolean isVoid() {
        return this.type == EnumType.VOID;
    }

    public boolean isString() {
        return this.type == EnumType.STRING;
    }

    public EnumType getType() {
        return type;
    }

    public String getNom() {
        return nom;
    }


    @Override
    public boolean equals(Object o) {
        if(o instanceof Type) {
            Type a = (Type)o;

            return ((a.type == null && this.type == null) || (a.type != null && a.type.equals(this.type)))
                    && ((a.nom== null && this.nom== null) || (a.nom != null && a.nom.equals(this.nom)));
        }
        else {
            return false;
        }
    }


}
