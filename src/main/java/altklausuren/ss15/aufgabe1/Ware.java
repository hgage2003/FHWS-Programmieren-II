package altklausuren.ss15.aufgabe1;

public class Ware implements IVerrechenbar {
    private int bestellnr, stueckzahl;
    private double stueckpreis;

    public double schreibeRechnung() {
        double gesamtbetrag = this.stueckzahl * this.stueckpreis;
        System.out.println(this.bestellnr + " " + this.stueckzahl + " " + this.stueckpreis);
        return gesamtbetrag;
    }
}
