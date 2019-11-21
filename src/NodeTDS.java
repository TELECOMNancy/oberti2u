import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import org.antlr.runtime.tree.*;
/*
 * Arbre pour stocker les TDS, ansi que leur id et leur porté/linkage statique (en étudiant le lien filial).
 * Cet arbre se modélise comme des noeuds possédent 1 ou + parents et une liste de fils éventuellement vide.
 * @author : REHIOUI WALID KHAY OUSSAMA LATA WARREN
 * Pour Clooc - PCL 2018 - TELECOM Nancy
 */

public class NodeTDS {

  private String id;
  private  int nRegion;
  private  int nImbrication;
  private final List<NodeTDS> fils = new ArrayList<>();
  private final List<NodeTDS> parent = new ArrayList<>();
  private HashMap<String,LinkedList> table;
  static LinkedList Lekhra = new LinkedList();

  static ArrayList<Deplacement> mesDeplacement = new ArrayList<>();
  public NodeTDS(NodeTDS parent) {
    this.parent.add(parent);
  }
  static int cb;
  static int deplacement;

  public void setnRegion(int nRegion){
    this.nRegion =nRegion;
  }
  public void setnImbrication(int nImbrication){
    this.nImbrication = nImbrication;
  }

  public int getnRegion(){
    return this.nRegion;
  }

  public int getnImbrication(){
    return this.nImbrication;
  }
  /*
   * Retourne l'id du noeud et donc de la TDS
   */
  public String getId() {
    return id;
  }

  /*
   * Change l'id u noeud et donc de la TDS
   */
  public void setId(String id) {
    this.id = id;
  }

  /*
   * Change la TDS du noeud, permet de charger une TDS dans 1 noeud (1 TDS/noeud max)
   */
  public void setTable(HashMap<String,LinkedList> table) {
    this.table=table;
  }

  /*
   * Retroune la TDS contenue dans ce noeud de l'arbre
   */
  public HashMap<String,LinkedList> getTable() {
    return table;
  }

  /*
   * Retourne la liste des fils (peut être nulle)
   */
  public List<NodeTDS> getChildren() {
    return fils;
  }

  /*
   * Retourne la liste des parents.
   * La plupart du temps les noeuds n'ont qu'un seul parent, mais dans certains cas (ex : classe héritant d'une autre) ils en ont 2.
   */
  public List<NodeTDS> getParent() {
    return parent;
  }

  /*
   * Cherche le noeuds avec l'id ID et le renvoie
   *
   *
   *
   */






  public NodeTDS getChild(String id) throws NoSuchIdfException {
    NodeTDS child;
    String idtocheck;
    List<NodeTDS> children;
    int size;

    // Vérifie que le noeud a des parents et récupère le nombre d'enfant
    try {
      children = this.getChildren();
      size = children.size();
    }
    catch (NullPointerException e) {
      throw new NoSuchIdfException();
    }

    for (int i = 0; i < size; i++) {
      child = children.get(i);
      idtocheck = child.getId();
      if (id.equals(idtocheck)) return child;
    }

    // Si le for n'a rien retourné c'est qu'il n'y a aucun fils correspondant à l'id fourni. Donc on throw une exception.
    throw new NoSuchIdfException();
  }

  /*
   * Ajoute un fils à ce noeud. (linkage statique simple)
   */
  public void addChild(NodeTDS fils) {
    this.fils.add(fils);
  }

  /*
   * Ajoute un parent à ce neoud (linkage dynamique? comme par ex une classe qui hérite d'une autre)
   */
  public void addParent(NodeTDS parent) {
    this.parent.add(parent);
  }

  /*
   * Retourne true si le noeud a un parent (minimum), false sinon (=root)
   */
  public Boolean hasParent(NodeTDS node) {
    try {
      node.getParent();
      return true;
    }
    catch (NullPointerException e) {
      return false;
    }
  }


  /*
   * Print le noeud courant ainsi que ses fils de façon récursive. Ne print pas les TDS vides
   */
  public void printNode() {
    //  TreeParser trip = new TreeParser();
    //  LinkedList params = trip.subsidiaire;
    HashMap<String,LinkedList> tds = this.getTable();
    String idtds = this.getId();
    Iterator it = (Iterator) tds.keySet().iterator();
    ArrayList<LinkedList> liste = new ArrayList<>();

    // Si la TDS est vide on ne la print pas.
    if (tds.isEmpty() || idtds.equals("root") || (idtds.toUpperCase().equals("LET") && cb>0)  ) {
      return;
    }

    if(idtds.toUpperCase().equals("LET")) {
      cb=1;
    }


    System.out.println("|nr : "+nRegion+"| ni : "+nImbrication+"|");
    System.out.println("============================================================================================= TDS : " + idtds + " ===============================================================================================");

    while (it.hasNext()) {
      String key = (String) it.next();
      LinkedList infos = tds.get(key);
      String type = infos.get(0).toString();

      // Parsing selon le type
      if(!idtds.toUpperCase().equals("LET")) {
        if(!Lekhra.isEmpty()) {
          //  System.out.println(params.get(0).toString());
          for (int i=0;i<Lekhra.size();i++) {
            LinkedList subKhra = new LinkedList();
            subKhra = (LinkedList) Lekhra.get(i);
            int a = subKhra.size();
            // System.out.println(subKhra);
            // int pas =a /5;
            if (subKhra.get(0).toString().toUpperCase().equals(idtds.toUpperCase())) {
              if(a>5) {
                for (int j=2;j<a;j=j+4) {
                  System.out.println("Idf : " + subKhra.get(j).toString() + " || Type d'entité : PARAM" + " || Type : " + subKhra.get(j+1).toString() + " || déplacement : " + subKhra.get(j+2).toString() + "||");

                }
              } else if (a==5) {
                System.out.println("Idf : " + subKhra.get(2).toString() + " || Type d'entité : PARAM" + " || Type : " + subKhra.get(3).toString() + " || déplacement : " + subKhra.get(4).toString() + "||");

              }

              Lekhra.remove(subKhra);
            }



          }

        }
      }

      /*
      if(type.equals("PARAM")) {

          //  System.out.println("Idf : " + infos.get(1) + " || Type d'entité : PARAM" + " || Type : " + infos.get(2) + " || déplacement : "+ infos.get(3)+ "||");



      }*/
      if (type.equals("IF")) {
        String cond = ((CommonTree) infos.get(1)).toStringTree();
        System.out.println("Idf : " + key + " || Type d'entité : " + type + " || Condition : " + cond + " ||");
      }
      else if (type.equals("FOR")) {
        String index = (String) infos.get(1);
        String min = ((CommonTree) infos.get(2)).toStringTree();
        String max = ((CommonTree) infos.get(3)).toStringTree();
        System.out.println("Idf : " + key + " || Type d'entité : " + type + " || Index : " + index + " || Min : " + min + " || Max : " + max + " ||");
      }


      else if (type.equals("ARG")) {
        String typestatic = infos.get(1).toString();
        System.out.println("Idf : " + key + " || Type d'entité : " + type + " || Type : " + typestatic + " ||");
      }
      else if(type.equals("FUNCTION")){
        LinkedList params = new LinkedList();

        liste  = (ArrayList<LinkedList>) infos.get(2);
        params = (LinkedList) infos.getLast();
        Lekhra.add(params);
        String s="[";

        for (int i=0; i< liste.size();i++) {
          s=s+liste.get(i).get(2) + "|";
        }
        s=s+"]";
        System.out.println("Idf : " + key + " || Type d'entité : " + type +  "  || Type Retour : "+ infos.get(1).toString() + " || Paramètres : "+ s + "||");




      }
      else if(type.equals("STRUCT")){
        String typestatic = infos.get(1).toString();
        String valeur;
        System.out.print("STRUCT :" + key + "|| les champs de la structure :" + infos.get(1).toString()+ " ||");

      }
      else if (type.equals("VAR")) {
        String typestatic = infos.get(1).toString();
        String valeur;
        try {
          valeur = infos.get(2).toString();
        }
        catch (NullPointerException ne) {
          valeur = "null"; // Différent de nil
        }
        System.out.println("Idf : " + infos.get(1).toString() + " || Type d'entité : " + infos.get(0).toString() + " || Type : " + infos.get(2).toString() + " || Valeur : " + infos.get(3).toString() + " || déplacement :" + infos.get(4).toString()+ "||");

      }



      else { // Cas improbable :.
        String valeur="WTF";

  /*      try {
          valeur = infos.get(1).toString();
        }
        catch (NullPointerException ne) {
          valeur = "null";
        }*/
        // System.out.println("Idf : " + key + " || Type : " + type + " || Valeur : " + valeur + " ||");
      }
    }

    System.out.println("========================================================================================================================================================================================================");
    System.out.println("");

    return;
  }
  public int getenvirnementsize(){
    int size=0;
    HashMap<String,LinkedList> tds = this.getTable();
    String idtds = this.getId();
    Iterator it = (Iterator) tds.keySet().iterator();
    while(it.hasNext()){
      String key = (String) it.next();
      LinkedList infos = tds.get(key);
      String type = infos.get(0).toString();
      if(type.equals("VAR")){
        size+=2;
      }
    }
    return size;
  }
}
