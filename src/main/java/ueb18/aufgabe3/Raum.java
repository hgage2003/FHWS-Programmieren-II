package ueb18.aufgabe3;

import java.util.*;

public class Raum {
    
    Collection<Studenten> studenten = new ArrayList<>();
    Studenten[] studentenArray = {new Studenten("Max"), new Studenten("Peter")};
    
    public void listeStudentenImRaum() {
	Iterator<Studenten> iterator = studenten.iterator();
	
	//Langform
	while(iterator.hasNext()) {
	    Studenten student = iterator.next();
	    System.out.println(student.getName());
	}
	//Kurzform
	for(Studenten s : studenten) {
	    System.out.println(s.getName());
	}
    }
    
    public void listeStudentenImRaumArray() {
	//Langfrom
	for(int i = 0;i<this.studentenArray.length;i++) {
	    System.out.println(this.studentenArray[i].getName());
	}
	
	//Kurzform
	for(Studenten s : studentenArray) {
	    System.out.println(s.getName());
	}
    }
    
    public static void main(String[] args) {
	Raum raum = new Raum();
	raum.studenten.add(new Studenten("Max"));
	raum.studenten.add(new Studenten("Peter"));
	raum.listeStudentenImRaum();
	
	System.out.println("\nArray:");
	
	raum.listeStudentenImRaumArray();
    }
}
