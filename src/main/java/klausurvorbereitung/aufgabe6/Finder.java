package klausurvorbereitung.aufgabe6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finder {

    public BufferedReader getSystemInAsBufferedReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

    public void findStringInFiles(String searchString, String[] filenames) {

        for (String s : filenames) {
            int zeile = 0;
            try (BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\klausurvorbereitung\\aufgabe5\\" + s));) {
                String line;
                while ((line = br.readLine()) != null) {
                    zeile++;
                    if (line.toLowerCase().contains(searchString.toLowerCase())) {
                        System.out.println("Datei: " + s + " Zeile: " + zeile);
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Finder finder = new Finder();
        BufferedReader br = finder.getSystemInAsBufferedReader();
        String searchString = null;

        try {
            searchString = br.readLine();
            finder.findStringInFiles(searchString, args);
            br.close();
        } catch (IOException ex) {
            System.out.println("Einlesen fehlgeschlagen.");
        }
    }
}
