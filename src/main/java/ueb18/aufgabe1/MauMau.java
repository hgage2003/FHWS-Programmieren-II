package ueb18.aufgabe1;

public class MauMau {

    //a.) Karte, Deck, Enums: Farbe, Kartenwert
    //b.) Set. Es stellt die Insertion-Order sicher, leicht sortierbar, Methode .shuffle steht zur Verfügun

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.erstelleKartendeckOhneDuplikate();

        Spieler spieler = new Spieler();
        spieler.zieheZufaelligeHand(deck.getDeck());

        for (Karte k : spieler.getHand()) {
            System.out.println(k.getKartenfarbe() + " " + k.getKartenwert());
        }
    }
}
