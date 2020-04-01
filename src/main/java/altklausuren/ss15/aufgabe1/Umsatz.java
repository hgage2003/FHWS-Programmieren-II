package altklausuren.ss15.aufgabe1;

public class Umsatz {
    public double kumulierterUmsatz = 0;

    public void erhoeheUmsatz(IVerrechenbar param) {
        this.kumulierterUmsatz += param.schreibeRechnung();
    }
}
