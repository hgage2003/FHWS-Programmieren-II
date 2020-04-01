package altklausuren.ws1314.aufgabe5;

import java.util.*;

public abstract class AbstractVocabularyTrainer {

    // In dieser Map sollen die Vokabeln gespeichert werden
    protected Map<String, String> dictionary = null;

    // Mit dieser Methode wird eine Zeile von System.in gelesen
    public abstract String readLineFromSystemIn();

    // Vokabeln aus einer Datei in die Map laden
    public abstract void load(String filename)
            throws IllegalArgumentException;

    // Diese Methode wählt ein zufälliges Wort der ersten Sprache aus
    public abstract String getRandomFirstLanguageWord();

    // Diese Methode prüft, ob ein Übersetzungsvorschlag richtig ist
    public abstract boolean testTranslation(String lang1, String lang2);

    // Hier wird das eigentliche Training durchgeführt.
    public void runTraining() {
        System.out.println("Vokabeltrainer");
        String filename = readLineFromSystemIn();

        try {
            load(filename);
        } catch (IllegalArgumentException e) {
            System.out.println("Datei konnte nicht geladen werden.");
            return;
        }

        int errorCount = 0;
        for (int i = 0; i < 10; i++) {
            String lang1Word = getRandomFirstLanguageWord();
            System.out.println("Übersetung von " + lang1Word + "?");
            String lang2Word = readLineFromSystemIn();
            if (testTranslation(lang1Word, lang2Word)) {
                System.out.println("Richtig!");
            } else {
                System.out.println("Falsch!");
                errorCount++;
            }
        }
        System.out.println("Training abgeschlossen. ");
        System.out.println(errorCount + " Fehler.");
    }
}
