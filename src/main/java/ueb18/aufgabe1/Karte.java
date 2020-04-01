package ueb18.aufgabe1;

public class Karte {

    private Kartenwert wert;
    private Kartenfarbe farbe;

    public Karte(Kartenwert wert, Kartenfarbe farbe) {
        this.wert = wert;
        this.farbe = farbe;
    }

    public Kartenwert getKartenwert() {
        return this.wert;
    }

    public Kartenfarbe getKartenfarbe() {
        return this.farbe;
    }
}
