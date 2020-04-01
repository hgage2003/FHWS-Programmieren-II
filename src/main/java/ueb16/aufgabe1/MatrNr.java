package ueb16.aufgabe1;

import java.io.*;

import myExceptions.MatrikelNummerException;

public class MatrNr {

    public static void splitStudiengaenge(String dateiname) throws MatrikelNummerException {

        try (BufferedReader br = new BufferedReader(new FileReader(dateiname));
             BufferedWriter bw1 = new BufferedWriter(new FileWriter("src\\main\\java\\ueb16\\aufgabe1\\WInfNr.txt"));
             BufferedWriter bw2 = new BufferedWriter(new FileWriter("src\\main\\java\\ueb16\\aufgabe1\\InfNr.txt"));
             BufferedWriter bw3 = new BufferedWriter(new FileWriter("src\\main\\java\\ueb16\\aufgabe1\\ECNr.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {

                if (line.length() > 7) throw new MatrikelNummerException("Ungültige Matrikelnr - zu lang");

                switch (line.substring(0, 2)) {
                    case "50":
                        bw1.write(line);
                        bw1.newLine();
                        break;
                    case "51":
                        bw2.write(line);
                        bw2.newLine();
                        break;
                    case "61":
                        bw3.write(line);
                        bw3.newLine();
                        break;
                    default:
                        throw new MatrikelNummerException("Ungültige Matrikelnr - startet mit: " + line.substring(0, 2));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            splitStudiengaenge("src\\main\\java\\ueb16\\aufgabe1\\MatrNr.txt");
        } catch (MatrikelNummerException e) {
            e.printStackTrace();
        }
    }
}
