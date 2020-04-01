package ueb13.aufgabe1;

public class Liste {
    public Person erzeugeStudent() {
	return new Student();
    }
	
    public Person erzeugeProfessor() {
	return new Professor();
    }

    public static void main(String[] args) {
		
	Liste liste = new Liste();
	Person[] personen = new Person[100];
		
	for(int i = 0; i < personen.length; i++){ //Erzeuge Objekte
	    if(i%2 == 0)
		personen[i] = liste.erzeugeStudent();
	    else
		personen[i] = liste.erzeugeProfessor();		
	}
		
	for(int i = 0; i < personen.length; i++) {
	    System.out.println((i+1) + " " + personen[i].gibTaetigkeitAus());
	}
    }
}
