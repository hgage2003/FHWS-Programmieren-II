package altklausuren.ws1415.aufgabe1;

public class Aktie implements Comparable<Aktie> {
    private String name;
    private double kurs;
    private int anzahl;

    public Aktie() {
        this("Telekom	AG", 14.50, 1000);
    }

    public Aktie(String name, double kurs, int anzahl) {
        this.name = name;
        this.kurs = kurs;
        this.anzahl = anzahl;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Name: " + this.name +
                " Kurs: " + this.kurs +
                " Anzahl: " + this.anzahl +
                " Wert: " + wert();
    }

    public double wert() {
        return this.kurs * this.anzahl;
    }

    @Override
    public int compareTo(Aktie a) {
        return this.name.compareTo(a.getName());
    }
}

