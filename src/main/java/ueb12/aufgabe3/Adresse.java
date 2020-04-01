package ueb12.aufgabe3;

public class Adresse {
    String strasse;
    String hausnr;
    int plz;
    String ort;

    public Adresse(String strasse, String hausnr, int plz, String ort) {
        if (Character.isLowerCase(strasse.charAt(0))) throw new RuntimeException("Ungueltige Strasse");
        if (Character.isLowerCase(ort.charAt(0))) throw new RuntimeException("Ungueltiger Ort");
        if (!Character.isDigit(hausnr.charAt(0))) throw new RuntimeException("Ungueltige Hausnr");

        this.strasse = strasse;
        this.hausnr = hausnr;
        this.plz = plz;
        this.ort = ort;
    }

    public int getPLZ() {
        return plz;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getHausnr() {
        return hausnr;
    }

    public String getOrt() {
        return ort;
    }
}
