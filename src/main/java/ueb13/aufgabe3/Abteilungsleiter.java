package ueb13.aufgabe3;

public class Abteilungsleiter extends Angestellter {
	
    public Abteilungsleiter(String nachname, String vorname, int persNr, 
	    		double grundgehalt, String geburtsdatum, Abteilung abteilung) {
		
	super(nachname, vorname, persNr, grundgehalt, geburtsdatum, abteilung);
	this.gehaltsfaktor = 2.0;
    }
	
    public void befoerdern(Angestellter angestellter) {
	angestellter.setGehaltsfaktor(angestellter.gehaltsfaktor+0.1);
    }

    public double getGehalt() {
	return super.grundgehalt * this.gehaltsfaktor;
    }
}
