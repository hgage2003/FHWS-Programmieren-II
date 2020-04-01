package vorlesung.vererbung;

public class Main {
    
    public static double berechneGesamtflaeche(GeometrischeFigur[] figuren) {
	
	double summe = 0;
	
	for(int i = 0; i < figuren.length; i++)	{
	    summe += figuren[i].berechneFlaeche();
	}
	    return summe;
	}
	
    public static void main(String[] args) {
	GeometrischeFigur[] figuren= new GeometrischeFigur[3];
	figuren[0] = new Dreieck(10, 5);
	figuren[1] = new Dreieck(20, 10);
	figuren[2] = new Rechteck(10, 10);
	double gesamtflaeche= berechneGesamtflaeche(figuren);
	System.out.println(gesamtflaeche);
    }
} 