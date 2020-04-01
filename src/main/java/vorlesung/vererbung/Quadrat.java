package vorlesung.vererbung;

public class Quadrat extends GeometrischeFigur {
    double seitenlaenge;

    public Quadrat(double seitenlaenge) {
	this.seitenlaenge= seitenlaenge;
    }
	
    @Override
    public double berechneFlaeche() {
	return seitenlaenge*seitenlaenge;
    }
}