package ueb16.aufgabe3C;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {

        String serverMsg, scInput;

        try (
                Scanner sc = new Scanner(System.in);
                Socket clientSocket = new Socket("localhost", 5000);
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
        ) {

            while (true) {
                //Input
                System.out.print("Eingabe: ");
                scInput = sc.nextLine();

                //Send to server
                out.write(scInput + "\n"); //+ new line!
                out.flush();

                //Receive
                serverMsg = in.readLine();
                if(serverMsg.equals("Gewonnen") || serverMsg.equals("Verloren")) break;
                System.out.println("Server: " + serverMsg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}