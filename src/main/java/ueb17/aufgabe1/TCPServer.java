package ueb17.aufgabe1;

import java.io.*;
import java.net.*;

public class TCPServer {

    public static void main(String[] args) {
        Person person = null;
        try {
            ServerSocket server = new ServerSocket(5000); //Server erstellen
            System.out.println("Server gestartet!");

            Socket client = server.accept(); //socket wartet auf Client connection

            //Streams
            ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("src\\main\\java\\ueb17\\aufgabe1\\test.txt"));
            ObjectInputStream objectFromClient = new ObjectInputStream(client.getInputStream());

            while (true) {
                try {
                    person = (Person) objectFromClient.readObject();
                    writer.writeObject(person);
                } catch (EOFException e) { //Ende der Übertragung
                    break;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
            writer.close();
            server.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}