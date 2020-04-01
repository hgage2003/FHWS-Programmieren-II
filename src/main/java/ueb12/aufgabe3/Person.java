package ueb12.aufgabe3;

public class Person {
    private String vorname;
    private String nachname;
    Adresse adresse = null;

    public Person(String vorname, String nachname, Adresse adresse) {
        if (Character.isLowerCase(vorname.charAt(0))) throw new RuntimeException("Ungueltiger Vorname");

        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
    }

    public String getVorname() {
        return this.vorname;
    }

    public String getNachname() {
        return this.nachname;
    }
}