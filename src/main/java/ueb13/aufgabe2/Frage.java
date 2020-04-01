package ueb13.aufgabe2;

public abstract class Frage {
	
    String frage;
    String antwort;
    String[] multiplechoice; //Array für Antwortmöglichkeiten
	
    public String getFrage() {
	return this.frage;
    }
    public void setFrage(String frage) {
	this.frage = frage;
    }
	
    public String getAntwort() {
	return this.antwort;
    }
    public void setAntwort(String antwort) {
	this.antwort = antwort;
    }

    public String[] getMultiplechoice() {
	return multiplechoice;
    }
    public void setMultiplechoice(String[] multiplechoice) {
	this.multiplechoice = multiplechoice;
    }
}