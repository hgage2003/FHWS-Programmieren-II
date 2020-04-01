package ueb16.aufgabe3C2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hinweis:
 * Besser wäre es, wenn man für den
 * Rateversuch eine eigene Klasse erstellt
 * und dann ein Objekt dieser Klasse an
 * den Client zurückschickt. In dieser Lösung wird
 * einfach nur ein String Objekt zurückgeschickt.
 *
 * Aber Funktioniert :)
 */
//TODO: Add class 'Try', which contains attributes of the current try
public class TCPServer {

    public static void main(String[] args) {

        try (
                ServerSocket serverSocket = new ServerSocket(5000);
                Socket clientSocket = serverSocket.accept();
                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream())
        ) {
            //Initialize new game
            Hangman hangman = new Hangman();
            hangman.start();

            String clientMsg;
            while (true) {
                try {
                    clientMsg = (String) in.readObject();
                    hangman.makeGuess(clientMsg.charAt(0));
                } catch (EOFException eof) {
                    break;
                }

                if (hangman.gameOver) {
                    out.writeObject("Gewonnen\n");
                    out.flush();
                    break;
                }

                if (hangman.wrongGuesses > 15) {
                    out.writeObject("Verloren\n");
                    out.flush();
                    break;
                }
                //Send to client
                out.writeObject(String.valueOf(hangman.toBeFound) + "\n"); //+ new line!
                out.flush();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}