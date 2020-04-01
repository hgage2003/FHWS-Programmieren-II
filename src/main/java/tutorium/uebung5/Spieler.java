package tutorium.uebung5;

public class Spieler {

    String name;
    int rank;
    
    public Spieler(String name, int rank) {
	this.name = name;
	this.rank = rank;
    }
    
    public String getName() {
	return this.name;
    }
    
    public int getRank() {
	return this.rank;
    }
}
