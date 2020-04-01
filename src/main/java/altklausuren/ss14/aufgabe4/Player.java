package altklausuren.ss14.aufgabe4;

public class Player {
    // Instanzvariable
    String name;
    int numGoals = 0;
    
    // Konstruktor
    public Player (String name) { 
	this.name = name; 
    }
    
    // Getter
    public String getName() { 
	return name;
    }
    
    public int getGoals() { 
	return numGoals; 
    }
    
    // Tor!!!
    public void score() { 
	numGoals++; 
    }
    
    public String toString() {
	return "Der Spieler " + this.name +
		" hat " + this.numGoals + " Tore geschossen.";
    }
}