package altklausuren.ss14.aufgabe1;

import java.io.*;

public class Finder {

    public BufferedReader getSystemInAsBufferedReader() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br;
    }

    public void findStringInFiles(String searchString, String[] filenames) {
        String line;
        int zeilennr = 0;
        for (int i = 0; i < filenames.length; i++) {
            try {
                FileReader fr = new FileReader(filenames[i]);
                BufferedReader br = new BufferedReader(fr);
                try {
                    while ((line = br.readLine()) != null) {
                        if (line.contains(searchString)) {
                            System.out.println(line + " " + searchString + " " + zeilennr);
                        }
                        zeilennr++;
                    }
                    br.close();
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                System.out.println("Datei " + filenames[i] + " konnte nicht gelesen werden.");
                continue;
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
