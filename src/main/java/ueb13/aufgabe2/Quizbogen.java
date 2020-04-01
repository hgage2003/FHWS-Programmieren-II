package ueb13.aufgabe2;

import java.util.Scanner;

public class Quizbogen {

    public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	String eingabe;
	Frage[] fragen = new Frage[2];
		
	fragen[0] = new Text();
	fragen[0].setFrage("Hauptstadt von Deutschland?");
	fragen[0].setAntwort("Berlin");
		
	fragen[1] = new MultipleChoice();
	fragen[1].setFrage("Wie viele Protonen hat ein Wasserstoff-Atom?");
	fragen[1].setAntwort("1");
	String[] mc = {"A: 4","B: 2", "C: 1", "D: 0"};
		
	fragen[1].setMultiplechoice(mc);
	
	for(int i = 0; i < fragen.length; i++) { //Fragen-Array durchlaufen
	    System.out.println(fragen[i].getFrage());
			
	    if(fragen[i].getClass() == Text.class) { //Wenn Textfrage
		eingabe = scanner.nextLine();
			if(fragen[i].getAntwort().equals(eingabe)) {
			    System.out.println("Richtig!");
			} else {
			    System.out.println("Falsch!");
			}
		System.out.print("\n");
	    } else if (fragen[i].getClass() == MultipleChoice.class) { //Wenn MC 
		for(int j = 0; j < fragen[i].multiplechoice.length; j++) { //MC-Antwortmöglichkeiten
		    System.out.println(fragen[i].multiplechoice[j]);
		}
		eingabe = scanner.nextLine();
		if(fragen[i].getAntwort().equals(eingabe)) {
		    System.out.println("Richtig!");
		} else {
		    System.out.println("Falsch!");
		}
	    }
	}
	scanner.close();
    }
}
