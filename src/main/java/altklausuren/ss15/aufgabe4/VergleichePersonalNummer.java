package altklausuren.ss15.aufgabe4;

import java.util.Comparator;

public class VergleichePersonalNummer implements Comparator<Mitarbeiter> {

    @Override
    public int compare(Mitarbeiter first, Mitarbeiter second) {
        return Integer.compare(first.getNummer(), second.getNummer());
    }

}
