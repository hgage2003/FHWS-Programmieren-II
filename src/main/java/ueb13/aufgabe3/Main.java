package ueb13.aufgabe3;

public class Main {

    public static void main(String[] args) {
	Unternehmen unternehmen = new Unternehmen("Bosch AG");
	Abteilung buchhaltung = new Abteilung("Buchhaltung", unternehmen);
	Angestellter angestellter = new Angestellter("Peter","Lustig",98765,20000,"05.10.1987",
													buchhaltung);
	Abteilungsleiter abteilungsleiter = new Abteilungsleiter("Max", "Mustermann", 12345,
																40000,"01.04.1965",buchhaltung);
	//Test
	System.out.println(abteilungsleiter.getGehalt());
	System.out.println(abteilungsleiter.getAbteilung());
	System.out.println(abteilungsleiter.getUname());
		
	abteilungsleiter.befoerdern(angestellter);
	System.out.println(angestellter.getGehalt());
	System.out.println(angestellter.getAbteilung());
		
	abteilungsleiter.befoerdern(angestellter);
	System.out.println(angestellter.getGehalt());
    }
}
