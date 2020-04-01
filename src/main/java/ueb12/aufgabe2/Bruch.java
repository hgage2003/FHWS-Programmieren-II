package ueb12.aufgabe2;

//Das hier ist ein Test zu m löschen
public class Bruch {
	
    private int zaehler;
    private int nenner;
	
    public Bruch(int zaehler, int nenner) {
	if (nenner==0) {
	    throw new  ArithmeticException("Teilen durch 0 nicht möglich");
	}
	this.zaehler = zaehler;
	this.nenner = nenner;
    }
	
    public int getZaehler() {
	return this.zaehler;
    }
    public int getNenner() {
	return this.nenner;
    }
	
    public static void main(String[] args) {
	try {
	    Bruch bruch = new Bruch(2,0);
	    double b = (double) bruch.getZaehler() / bruch.getNenner();
	    System.out.println(b);
	} catch (ArithmeticException e) {
	    System.out.println(e.getMessage());
	}
    }
}
