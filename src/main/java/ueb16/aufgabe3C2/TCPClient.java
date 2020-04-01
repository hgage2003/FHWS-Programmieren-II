package ueb16.aufgabe3C2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

    public static void main(String[] args) {

        String serverMsg, scInput;

        try (
                Scanner sc = new Scanner(System.in);
                Socket clientSocket = new Socket("localhost", 5000);
                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream())
        ) {

            while (true) {
                //Input
                System.out.print("Eingabe: ");
                scInput = sc.nextLine();

                //Send to server
                out.writeObject(scInput + "\n"); //+ new line!
                out.flush();

                //Receive
                try {
                    serverMsg = (String) in.readObject();
                } catch(EOFException eof) {
                    break;
                }

                if(serverMsg.equals("Gewonnen") || serverMsg.equals("Verloren")) break;
                System.out.println("Server: " + serverMsg);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}