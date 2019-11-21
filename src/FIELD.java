public class FIELD {
    public String nom;
    public String type;

    public FIELD(String n, String type ){
        this.nom = n;
        this.type = type;
    }

    public void setNom(String noun){
        this.nom = noun;

    }
    public void setType(String t){
        this.type = t;
    }

    public String getNom(){
        return this.nom;
    }
    public String getType(){
        return this.type;
    }
}
