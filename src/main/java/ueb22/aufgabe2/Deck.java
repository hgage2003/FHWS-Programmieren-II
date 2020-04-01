package ueb22.aufgabe2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import ueb22.aufgabe2.Farbe;
import ueb22.aufgabe2.Wert;

public class Deck {
    List<Karte> karten;

    public Deck() {
	karten = new ArrayList<>();
    }
    
    public void erzeuge() {
	karten = Arrays.stream(Farbe.values())
		.flatMap(f -> Arrays.stream(Wert.values())
			.map(w -> new Karte(f, w)))
		.collect(Collectors.toList());
    }
    
    @Override
    public String toString() {
	String s = karten.stream()
		.map(Object::toString)
		.collect(Collectors.joining(", "));
        return s;
    }
    
    public static void main(String[] args) {
	Deck d = new Deck();
	d.erzeuge();
	System.out.println(d.toString());
    }
}
