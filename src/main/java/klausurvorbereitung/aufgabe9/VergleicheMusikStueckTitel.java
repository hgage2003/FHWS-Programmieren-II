package klausurvorbereitung.aufgabe9;

import java.util.Comparator;

public class VergleicheMusikStueckTitel implements Comparator<MusikStueck> {

    @Override
    public int compare(MusikStueck ms1, MusikStueck ms2) {
	return ms1.getTitel().compareTo(ms2.getTitel());
    }
}