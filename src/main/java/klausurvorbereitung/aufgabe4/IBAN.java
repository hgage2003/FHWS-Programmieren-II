package klausurvorbereitung.aufgabe4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IBAN {

    public boolean ibanCheck(String iban) throws FalscheIBANException {
        if (iban.length() != 22 || !(iban.startsWith("DE")))
            throw new FalscheIBANException("Fehler: " + iban);
        return true;
    }

    public void ibanAusDateiLesen(String dateiname) throws FalscheIBANException {
        try (BufferedReader br = new BufferedReader(new FileReader(dateiname))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!ibanCheck(line)) throw new FalscheIBANException();
            }
        } catch (NullPointerException npe) {
            System.out.println("Datei " + dateiname + " exisitiert nicht");
        } catch (FileNotFoundException fne) {
            System.out.println("Datei " + dateiname + " nicht gefunden");
        } catch (IOException ioe) {
            System.out.println("Fehler beim Lesevorgang von Datei: " + dateiname);
        }
    }

    public void dateienTest(String[] dateien) {
        for (String s : dateien) {
            try {
                ibanAusDateiLesen(s);
            } catch (FalscheIBANException e) {
                System.out.println(s);
            }
        }
    }
}
