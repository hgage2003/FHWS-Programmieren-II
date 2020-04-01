package klausurvorbereitung.aufgabe5;

import java.util.Iterator;

public class RouletteZahlenIterator implements Iterator<Integer> {

    private int anzahlNullen = 0;

    @Override
    public boolean hasNext() {
        if (anzahlNullen == 3) return false;
        return true;
    }

    @Override
    public Integer next() {
        int zahl = (int) (Math.random() * 37);
        if (zahl == 0) anzahlNullen++;
        return zahl;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
