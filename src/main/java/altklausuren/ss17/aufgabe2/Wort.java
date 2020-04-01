package altklausuren.ss17.aufgabe2;

public final class Wort implements Comparable<Wort> {
    String wort, wortTyp, sprache;
    int laenge;

    public Wort(String wort) {
        this.wort = wort;
    }

    public String toString() {
        return wort;
    }

    @Override
    public int compareTo(Wort o) {
        return 0;
    }
}
