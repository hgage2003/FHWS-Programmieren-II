package ueb18.aufgabe1;

import java.util.*;

public class Spieler {

    //Set ist keine gute Lösung, da bei Duplikaten ein Spieler nur 4 Karten zieht (Wert wird überschrieben)
    //Set<Karte> hand = new HashSet<>();

    private final int MAX = 5; //Hand darf 5 Karten besitzen
    private List<Karte> hand = new ArrayList<>(MAX);

    public void zieheZufaelligeHand(List<Karte> deck) {
        Random random = new Random();
        int index;
        for (int i = 0; i < MAX; i++) {
            index = random.nextInt(deck.size()); //Random index von 0...deck.size()
            if (hand.contains(deck.get(index))) {
                --i; //nochmal ziehen
            } else {
                hand.add(deck.get(index));
            }
        }
    }

    public List<Karte> getHand() {
        return this.hand;
    }
}
