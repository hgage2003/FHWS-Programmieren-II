package ueb15.aufgabe1;
import java.io.*;

@SuppressWarnings("all") 
public class Exceptions {
	
    public static void numberFormatException() {
	int zahl=Integer.parseInt ("XYZ");
    }
	
    public static void arrayIndexOutOfBoundsException() {
	int[] arr= {1,2,3};
	System.out.println(arr[3]);
    }
	
    public static void nullPointerException() {
	Object obj = null;
        obj.toString();
    }
	
    public static void outOfMemoryError() {
	long[] l = new long[Integer.MAX_VALUE];
    }
	
    public static void fileNotFoundException() {
	FileInputStream fis = null;
	try {
	    fis = new FileInputStream("pic.jpg");
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    try {
		if(fis!=null) fis.close();
	    } catch (IOException e) {}
	}
    }
	
    public static void arithmeticException() {
	int zaehler = 5;
	int nenner = 0;
	int dezimal = zaehler/nenner;
    }
    public static void main(String[] args) {
	//numberFormatException();
	//arrayIndexOutOfBoundsException();
	//nullPointerException();
	//outOfMemoryError();
	//fileNotFoundException();
	arithmeticException();
    }
}
