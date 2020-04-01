package ueb13.aufgabe3;

public class Angestellter extends Abteilung {

    protected String nachname;
    protected String vorname;
    protected int persNr;
    protected double grundgehalt;
    protected double gehaltsfaktor = 1.0;
    protected String geburtsdatum;
    protected Abteilung abteilung;
	
    public Angestellter(String nachname, String vorname, int persNr, 
			double grundgehalt, String geburtsdatum, Abteilung abteilung) {
	super(abteilung.getAbteilung(),abteilung.getUnternehmen());
	this.nachname = nachname;
	this.vorname = vorname;
	this.persNr = persNr;
	this.grundgehalt = grundgehalt;
	this.geburtsdatum = geburtsdatum;
    }
	
    public String getNachname() {
	return this.nachname;
    }
    public String getVorname() {
	return this.vorname;
    }
    public int getIdent() {
	return this.persNr;
    }
    public double getGrundgehalt() {
	return this.grundgehalt;
    }
    public double getGehaltsfaktor() {
	return this.gehaltsfaktor;
    }
    public double getGehalt() {
	return this.grundgehalt * this.gehaltsfaktor;
    }
    public String getGeburtsdatum() {
	return this.geburtsdatum;
    }
	
    public void setNachname(String nachname) {
	this.nachname = nachname;
    }
    public void setVorname(String vorname) {
	this.vorname = vorname;
    }
    public void setIdent(int persNr) {
	this.persNr = persNr;
    }
    public void setGrundgehalt(double grundgehalt) {
	this.grundgehalt = grundgehalt;
    }
    public void setGehaltsfaktor(double gehaltsfaktor) {
	this.gehaltsfaktor = gehaltsfaktor;
    }
    public void setGeburtsdatum(String geburtsdatum) {
	this.geburtsdatum = geburtsdatum;
    }
}
