package tutorium.uebung5;

import java.util.HashMap;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
	
	Mannschaft mannschaftA = new Mannschaft("MannschaftA")
		.addSpieler(new Spieler("SpielerA",10))
		.addSpieler(new Spieler("SpielerB",5))
		.addSpieler(new Spieler("SpielerC",5))
		.addSpieler(new Spieler("SpielerD",7));

	Mannschaft mannschaftB = new Mannschaft("MannschaftB")
                .addSpieler(new Spieler("SpielerE", 1))
                .addSpieler(new Spieler("SpielerF", 2))
                .addSpieler(new Spieler("SpielerG", 1))
                .addSpieler(new Spieler("SpielerH", 4));
	
	HashMap<String, Mannschaft> map = new HashMap<>();
	map.put(mannschaftA.getName(), mannschaftA);
	map.put(mannschaftB.getName(), mannschaftB);
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Bitte Mannschaftsnamen eingeben:");
	
	String eingabe = scanner.nextLine();
	if(map.containsKey(eingabe)) {
	    Mannschaft spieler = map.get(eingabe);
	    for(Spieler s : spieler.getSpieler()) {
		System.out.println(s.getName() + "\t" + s.getRank());
	    }
	    System.out.println("Durchschnitt: " + "\t" + spieler.getDurchschnittsRanking());
	} else {
	    System.out.println("Ungültige Eingabe!");
	}
	scanner.close();
    }
}
