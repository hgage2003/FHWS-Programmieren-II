package vorlesung.vererbung;

public class Dreieck extends GeometrischeFigur {
    double grundseite;
    double hoehe;

    public Dreieck(double grundseite, double hoehe) {
	this.grundseite= grundseite;
	this.hoehe= hoehe;
    }
	
    @Override
    public double berechneFlaeche() {
	return 0.5 * grundseite* hoehe;
    }
}
