package ueb17.aufgabe1;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {

    public static void main(String[] args) {
        Person person = null;
        Scanner scanner = new Scanner(System.in);
        String eingabeStr;
        int eingabeInt;

        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Client gestartet!");

            //Streams
            ObjectOutputStream sendObject = new ObjectOutputStream(socket.getOutputStream());

            for (int i = 0; i < 3; i++) {
                person = new Person();
                System.out.print("Eingabe Vorname: ");
                eingabeStr = scanner.nextLine();
                person.setVorname(eingabeStr);

                System.out.print("Eingabe Nachname: ");
                eingabeStr = scanner.nextLine();
                person.setNachname(eingabeStr);

                System.out.print("Eingabe Telefonnr: ");
                eingabeInt = scanner.nextInt();
                person.setTelefonnr(eingabeInt);
                scanner.nextLine(); //Konsumiere fehlendes newline Character

                sendObject.writeObject(person);
                sendObject.flush();
            }

            sendObject.close();
            scanner.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
