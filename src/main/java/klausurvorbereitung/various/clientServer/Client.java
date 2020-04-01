package klausurvorbereitung.various.clientServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
	try {
	    Socket socket = new Socket("localhost",5000);
	    BufferedReader bir = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
	    BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	    
	    bo.write("Hello");
	    bo.newLine();
	    bo.flush();
	    
	    System.out.println("Client empfängt: " + bir.readLine());
	    
	    bo.close();
	    bir.close();
	    socket.close();
	    
	} catch(IOException e) {
	    e.printStackTrace();
	}
	
    }
    
}
