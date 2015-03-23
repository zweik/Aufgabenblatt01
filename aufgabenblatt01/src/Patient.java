public class Patient {
  private String name;
  private int geburtsJahr;
  public Patient (String n, int gj) {
    name = n;
    geburtsJahr = gj;
  }
  public int getGeburtsJahr() {
    return geburtsJahr;
  }
  
  public String getName() {
	  return name;
  }
  
  public String toString() {
    return name + " (geb. " + geburtsJahr + ")";
  }
}
