package ueb18.aufgabe2;

import java.util.Collections;

public class Skat {
    
    public static void main(String[] args) {
	Deck deck = new Deck();
	deck.erstelleKartendeckOhneDuplikate();
	
	Spieler spieler = new Spieler();
	spieler.zieheZufaelligeHand(deck.getDeck());
	
	Collections.sort(spieler.getHand());
	for(Karte k : spieler.getHand()) {
	    System.out.println(k);
	}
    }
}
