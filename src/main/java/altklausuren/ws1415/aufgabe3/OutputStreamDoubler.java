package altklausuren.ws1415.aufgabe3;
import java.io.*;

public class OutputStreamDoubler extends OutputStream {
    OutputStream o1 = null;
    OutputStream o2 = null;
    
    public OutputStreamDoubler(OutputStream o1, OutputStream o2) {
	this.o1 = o1;
	this.o2 = o2;
    }
    
    public void close()	throws IOException {
	super.close();
	this.o1.close();
	this.o2.close();
    }
    
    public void write(int b) throws IOException	{
	boolean thrown = false;
	
	try {
	    o1.write(b);
	} catch(IOException e) {
	    thrown = true;
	}
	
	try {
	    o2.write(b);
	} catch(IOException e) {
	    thrown = true;
	}
	
	if(thrown) {
	    throw new IOException();
	}
    }
    
    public static void main(String[] args) {
	 try (FileOutputStream fos1 = new FileOutputStream("src\\main\\java\\altklausuren\\ws1415\\aufgabe3\\file1.txt");
	      FileOutputStream fos2 = new FileOutputStream("src\\main\\java\\altklausuren\\ws1415\\aufgabe3\\file2.txt");
	      OutputStreamDoubler osd = new OutputStreamDoubler(fos1, fos2);
	      OutputStreamWriter osw = new OutputStreamWriter(osd)) {
	     osw.write("Hello World");
	 } catch (IOException ex) {
	     ex.printStackTrace();
	 }
    }
}