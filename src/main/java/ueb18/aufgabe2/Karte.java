package ueb18.aufgabe2;

public class Karte implements Comparable<Karte> {

    private Kartenwert wert;
    private Kartenfarbe farbe;
    
    public Karte(Kartenwert wert, Kartenfarbe farbe) {
	this.wert = wert;
	this.farbe = farbe;
    }
    
    public Kartenwert getKartenwert() {
	return this.wert;
    }
    
    public Kartenfarbe getKartenfarbe() {
	return this.farbe;
    }

    /*
     * Sortierkriterien: 1. Wert, 2. Farbe
     * Math.signum gibt folgendes zurück: -1 wenn Berechnung (negativ), 0 wenn Berechnung (0), 1 wenn Berechnung (positiv)
     * 
     * Ablauf:
     * Enums sind Absteigend nach Wertigkeit sortiert.
     * Beispiel: An erster Stelle der Liste steht ein Koenig, die übergebene Karte hat den Wert Bube:
     * 3 (Pos von Koenig) - 0 (Pos von Bube) = 3 
     * -> Math.signum gibt deswegen 1 zurück und Bube kommt damit vor dem König in die Liste.
     * Das gleiche passiert mit der Farbe als zweites Sortierkriterium.
     */
    @Override
    public int compareTo(Karte karte) {
	if(karte==null) {
	    return 1;
	}
	
	if(this.wert!=karte.wert) {
	    return (int) Math.signum(this.wert.ordinal() - karte.wert.ordinal());
	}
	
	return (int) Math.signum(this.farbe.ordinal() - karte.farbe.ordinal());
    }
    
    @Override
    public String toString() {
        return this.farbe + " " + this.wert;
    }
}
