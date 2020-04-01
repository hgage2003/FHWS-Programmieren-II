package klausurvorbereitung.aufgabe9;

public class MusikStueck {
    protected String titel;     // Name des Musikstueckes
    protected String interpret;    // Gruppe/Saenger des Stueckes
    protected int laenge;     // Dauer in Sekunden
    
    public MusikStueck(String titel, String interpret, int laenge) {
        this.titel = titel;
        this.interpret = interpret;
        this.laenge = laenge;
    }
    
    public String toString() {
	return "'" + titel + "' von " + interpret + " / Dauer: " + laenge;
    }

    public String getTitel() {
        return titel;
    }

    public String getInterpret() {
        return interpret;
    }

    public int getLaenge() {
        return laenge;
    }

}//endclass MusikStueck