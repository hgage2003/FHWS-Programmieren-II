package ueb16.aufgabe3C2;

import java.io.Serializable;

public class Hangman implements Serializable {


    private static final long serialVersionUID = -6556025618017733102L;
    public int wrongGuesses;
    public char[] toBeFound;
    private char[] answer;
    public boolean gameOver = false;
    public boolean wrongGuess = false;
    private final String[] LIBRARY = {"Hallowelt", "Programmieren", "Java"};

    public void start() {

        int i = (int) (Math.random() * LIBRARY.length); //Get random word

        //Initializing
        this.wrongGuesses = 0;
        this.answer = LIBRARY[i].toCharArray();
        this.toBeFound = new char[answer.length];

        for (i = 0; i < toBeFound.length; i++) {
            toBeFound[i] = '_';
        }
        //
    }

    public void makeGuess(char g) {
        int foundCounter = 0;
        for (int i = 0 ; i < answer.length; i++) {
            if(toBeFound[i] != '_') continue; //skip already found letters
            if (Character.toUpperCase(answer[i]) == Character.toUpperCase(g)) {
                toBeFound[i] = Character.toUpperCase(g);
                foundCounter++;
                continue;
            }

            if(foundCounter <= 0) wrongGuess = true;
        }

        if (String.valueOf(toBeFound).equalsIgnoreCase(String.valueOf(answer))) { //converting char[] back to string & compare
            gameOver = true;
            return;
        }

         if(wrongGuess) {
            wrongGuesses++;
        }
    }
}
