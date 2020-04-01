package ueb17.aufgabe1;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -1797763146056954213L;
    private String vorname;
    private String nachname;
    private int telefonnr;

    public String getVorname() {
        return this.vorname;
    }

    public String getNachname() {
        return this.nachname;
    }

    public int getTelefonr() {
        return this.telefonnr;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setTelefonnr(int telefonnr) {
        this.telefonnr = telefonnr;
    }
}
