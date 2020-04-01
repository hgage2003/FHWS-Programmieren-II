package ueb16.aufgabe3AB;

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
			while (in.readLine() != null) {
				//Send to client
				out.write("ok\n"); //+ new line!
				out.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}