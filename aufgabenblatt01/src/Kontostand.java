public class Kontostand extends Zahl{

	private double wert;

	public Kontostand(double wert) {
		this.wert = wert;
	}
	
	public Zahl neg() {
		wert = -wert;
		Kontostand returnneg = new Kontostand(wert);
		return returnneg;
	}
	
	public Zahl add(Zahl zahl) {
		Kontostand hilf = (Kontostand) zahl;
		wert += hilf.wert;
		Kontostand returnadd = new Kontostand(wert);
		return returnadd;
	}
	
	public String toString() {
		return "" + wert;
	}
	
	@Override
	public boolean equals(Object zahl) {
		Kontostand help = (Kontostand) zahl;
		if(wert == help.wert){
			return true;
		}
		else{
			return false;
		}
	}
}
