package ueb16.aufgabe3C;

import java.net.*;
import java.io.*;

public class TCPServer {
    public static void main(String[] args) {

        try (
                ServerSocket serverSocket = new ServerSocket(5000);
                Socket clientSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
        ) {
            //Initialize new game
            Hangman hangman = new Hangman();
            hangman.start();

            String clientMsg;
            while ((clientMsg = in.readLine()) != null) {
                hangman.makeGuess(clientMsg.charAt(0));

                if(hangman.gameOver) {
                    out.write("Gewonnen\n");
                    out.flush();
                    break;
                }

                if(hangman.wrongGuesses > 15) {
                    out.write("Verloren\n");
                    out.flush();
                    break;
                }
                //Send to client
                out.write(String.valueOf(hangman.toBeFound) + "\n"); //+ new line!
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}