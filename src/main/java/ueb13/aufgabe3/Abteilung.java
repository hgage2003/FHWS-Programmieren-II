package ueb13.aufgabe3;

public class Abteilung extends Unternehmen {

    protected String bezeichnung;
    protected Unternehmen unternehmen;
	
    public Abteilung(String bezeichnung, Unternehmen unternehmen) {
	super(unternehmen.getUname());
	this.bezeichnung = bezeichnung;
	this.unternehmen = unternehmen;
    }
	
    public String getAbteilung() {
	return this.bezeichnung;
    }
    public Unternehmen getUnternehmen() {
	return this.unternehmen;
    }
}

