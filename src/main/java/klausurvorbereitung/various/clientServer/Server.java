package klausurvorbereitung.various.clientServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
	try {
	    ServerSocket serverSocket = new ServerSocket(5000);
	    Socket client = serverSocket.accept();
	    	
	    BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
	    
	    System.out.println("Server empfängt: " + br.readLine());
	    
	    bw.write("Echo");
	    bw.newLine();
	    bw.flush();
	
	    bw.close();
	    br.close();
	    serverSocket.close();
	    client.close();
	} catch(IOException e ) {
	    e.printStackTrace();
	}

    }
}
