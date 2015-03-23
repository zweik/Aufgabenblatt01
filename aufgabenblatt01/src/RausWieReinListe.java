public class RausWieReinListe implements WarteListe {

	private Patient[] PatientenListe = new Patient [1000];
	private static int bisherigePatienten = 0;
	private static int index = 0;
	
	public void rein(Patient p) {
		for(int i = 0; i <= PatientenListe.length; i++) {
			if(PatientenListe[i] == null){
				PatientenListe[i] = p;
				System.out.println("Hinzufügen erfolgreich");
				bisherigePatienten++;
				return;
			}
		}
	}
	
	public Patient raus() {
		Patient hilf = new Patient("leer", 0);
		hilf = PatientenListe[index];
		for(int i = 0; i <= PatientenListe.length; i++) {
			PatientenListe[i] = PatientenListe[i+1];
			if(PatientenListe[i+1] == null) {
				break;
			}
		}
		return hilf;
	}
}
