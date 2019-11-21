/*
 * Exception pour le compilateur : problème de type dans les expression (arithémtiques ou autres).
 * @author : REHIOUI WALID KHAY OUSSAMA LATA WARREN ELLIOTTE LALMENT
 * Pour Clooc - PCL 2017 - TELECOM Nancy
 */

public class MismatchTypeException extends Exception {

  public MismatchTypeException() {
    super();
  }

  public MismatchTypeException(String s) {
    super(s);
  }
}
