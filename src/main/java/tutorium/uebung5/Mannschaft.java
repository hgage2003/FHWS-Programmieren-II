package tutorium.uebung5;

import java.util.ArrayList;

public class Mannschaft implements Comparable<Mannschaft> {

    String name;
    ArrayList<Spieler> spieler = new ArrayList<>();
    
    public Mannschaft(String name) {
	this.name = name;
    }
    
    public String getName() {
	return this.name;
    }
    
    public ArrayList<Spieler> getSpieler() {
	return this.spieler;
    }
    
    public Mannschaft addSpieler(Spieler s) {
	this.spieler.add(s);
	return this;
    }
    
    public double getDurchschnittsRanking() {
	double durchschnitt = 0;
	for(Spieler s : this.spieler) {
	    durchschnitt += s.getRank();
	}
	return durchschnitt /= this.spieler.size();
    }
    
    @Override
    public int compareTo(Mannschaft m) {
	return (int) (this.getDurchschnittsRanking() - m.getDurchschnittsRanking());
    }
    
}
