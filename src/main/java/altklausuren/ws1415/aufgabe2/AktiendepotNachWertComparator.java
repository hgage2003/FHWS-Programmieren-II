package altklausuren.ws1415.aufgabe2;

import java.util.*;

import altklausuren.ws1415.aufgabe1.Aktie;

public class AktiendepotNachWertComparator implements Comparator<Aktie> {

    @Override
    public int compare(Aktie a, Aktie b) {
        if (a.wert() < b.wert()) {
            return -1;
        } else if (a.wert() == b.wert()) {
            return 0;
        } else {
            return 1;
        }
    }
}
