package ueb20.aufgabe3;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class TCPClient {

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(341);
        data.add(633910099);

        ArrayList<Boolean> serverMsg;

        try (Socket client = new Socket("localhost", 5000);
             ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
             ObjectInputStream in = new ObjectInputStream(client.getInputStream())) {

            System.out.println("Sende Daten...");

            out.writeObject(data);
            out.flush();

            serverMsg = (ArrayList<Boolean>) in.readObject();

            for(Boolean b : serverMsg) {
                System.out.println(b);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
