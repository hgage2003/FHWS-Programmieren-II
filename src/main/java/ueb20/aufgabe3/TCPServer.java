package ueb20.aufgabe3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class TCPServer {

    private static class ThreadHandler implements Runnable {

        Socket client;
        ArrayList<Boolean> data;

        public ThreadHandler(Socket client) {
            this.client = client;
            data = new ArrayList<>();
        }

        public boolean testPrim(int primZahl) {
            if (primZahl < 2) return false;
            for (int divisor = 2; divisor < primZahl; divisor++)
                if (primZahl % divisor == 0) return false;
            return true;
        }

        @Override
        public void run() {
            try (ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
                 ObjectInputStream in = new ObjectInputStream((client.getInputStream()))) {

                ArrayList<Integer> clientMsg = (ArrayList<Integer>) in.readObject();

                for (Integer i : clientMsg) {
                    data.add(testPrim(i));
                }
                out.writeObject(data);
                out.flush();

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            while (true) { //Just for test, endless loop
                Socket clientSocket = serverSocket.accept();
                Thread t = new Thread(new ThreadHandler(clientSocket));
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
