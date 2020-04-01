package klausurvorbereitung.aufgabe8;

import java.io.*;
import java.util.*;

public class Mitarbeiter implements Serializable {
    private String vorname = null;
    private String nachname = null;
    private int nummer = 0;
    private transient int gehalt = 0;

    public Mitarbeiter(String vorname, String nachname,
                       int nummer, int gehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.nummer = nummer;
        this.gehalt = gehalt;
    }//endconstructor

    // . . . alle getter- und setter-Methoden
    public String toString() {
        return "Nachname: " + nachname + " Vorname: " +
                vorname + " Personalnummer: " + nummer + " Gehalt: " + gehalt;
    }//endmethod toString



    public static Mitarbeiter[] sortiere(Collection<Mitarbeiter> team) {
        Mitarbeiter[] arrTeam = new Mitarbeiter[team.size()];
        int index = 0;
        for(Mitarbeiter m : team) {
            arrTeam[index] = m;
            index++;
        }
        Arrays.sort(arrTeam, new VergleichePersonalNummer());
        return arrTeam;
    }

    public static class VergleichePersonalNummer implements Comparator<Mitarbeiter> {
        @Override
        public int compare(Mitarbeiter m1, Mitarbeiter m2) {
            return m1.nummer - m2.nummer;
        }
    }
    public static void main(String[] args) {
        Set<Mitarbeiter> set = new HashSet<>();
        Mitarbeiter m1 = new Mitarbeiter("Max", "Muster", 1, 2000);
        Mitarbeiter m2 = new Mitarbeiter("Peter", "Maier", 20, 1000);
        Mitarbeiter m3 = new Mitarbeiter("Hans", "Wurscht", 12, 5000);

        try (ObjectOutputStream oos = new ObjectOutputStream((new FileOutputStream("src\\main\\java\\klausurvorbereitung\\aufgabe8\\mitarbeiter.dat")));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\main\\java\\klausurvorbereitung\\aufgabe8\\mitarbeiter.dat"))) {
            oos.writeObject(m1);
            oos.writeObject(m2);
            oos.writeObject(m3);

            while (true) {
                try {
                    set.add((Mitarbeiter) ois.readObject());
                } catch (EOFException eof) {
                    break;
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        Mitarbeiter[] team = sortiere(set);

        for(Mitarbeiter m : team) {
            System.out.println(m.toString());
        }

    }
}//endclass Mitarbeiter
