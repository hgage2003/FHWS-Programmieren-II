package altklausuren.ss15.aufgabe1;

public class Dienstleistung implements IVerrechenbar {
    private String kundenname;
    private double stundenanzahl, stundensatz;

    public double schreibeRechnung() {
        double gesamtbetrag = this.stundenanzahl * this.stundensatz;
        System.out.println(this.kundenname + " " + this.stundenanzahl + " " + this.stundensatz);
        return gesamtbetrag;
    }
}
