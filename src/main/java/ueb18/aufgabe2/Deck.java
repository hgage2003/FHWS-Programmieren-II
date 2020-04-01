package ueb18.aufgabe2;

import java.util.*;

public class Deck {

    private List<Karte> kartendeck = new ArrayList<>();

    //Erstelle Kartendeck nach Anzahl Kartenvariationen (Wert, Farbe)
    public void erstelleKartendeckOhneDuplikate() {
	for(Kartenwert wert : Kartenwert.values()) {
	    for(Kartenfarbe farbe : Kartenfarbe.values()) {
		kartendeck.add(new Karte(wert,farbe));
	    }
	}
    }
    
    public List<Karte> getDeck() {
	return this.kartendeck;
    }
}
