package altklausuren.ss15.aufgabe4;

import java.io.*;
import java.util.*;

public class Mitarbeiter implements Serializable {
    private static final long serialVersionUID = 1L;
    private String vorname = null;
    private String nachname = null;
    private int nummer = 0;
    private transient int gehalt = 0;

    public Mitarbeiter(String vorname, String nachname, int nummer, int gehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.nummer = nummer;
        this.gehalt = gehalt;
    }

    public int getNummer() {
        return nummer;
    }

    public String toString() {
        return "Nachname: " + nachname + " Vorname: " + vorname +
                " Personalnummer: " + nummer + " Gehalt: " + gehalt;
    }

    public static void legDateiAn() {
        Mitarbeiter m1 = new Mitarbeiter("Max", "Mustermann", 19, 3000);
        Mitarbeiter m2 = new Mitarbeiter("Peter", "Lustig", 24, 5000);
        Mitarbeiter m3 = new Mitarbeiter("Fritz", "Walter", 3, 1000);

        try (FileOutputStream fos = new FileOutputStream("src\\main\\java\\altklausuren\\ss15\\aufgabe4\\mitarbeiter.dat");
             ObjectOutputStream ois = new ObjectOutputStream(fos);) {
            ois.writeObject(m1);
            ois.writeObject(m2);
            ois.writeObject(m3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Collection<Mitarbeiter> leseDatei() {
        Collection<Mitarbeiter> team = new ArrayList<>();
        Mitarbeiter m = null;

        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\altklausuren\\ss15\\aufgabe4\\mitarbeiter.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    m = (Mitarbeiter) ois.readObject();
                    team.add(m);
                } catch (EOFException e) {
                    break;
                }
            }
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return team;
    }

    public static void gibCollectionAus(Collection<Mitarbeiter> team) {
        for (Mitarbeiter m : team) {
            System.out.println(m.toString());
        }
    }

    public static Mitarbeiter[] sortiere(Collection<Mitarbeiter> team) {
        Mitarbeiter[] array = new Mitarbeiter[team.size()];
        int index = 0;
        for (Mitarbeiter m : team) {
            array[index] = m;
            index++;
        }
        Arrays.sort(array, new VergleichePersonalNummer());
        return array;
    }

    public static void main(String[] args) {
        legDateiAn();
        Collection<Mitarbeiter> collection = leseDatei();
        Mitarbeiter[] array = sortiere(collection);
        gibCollectionAus(Arrays.asList(array));
    }
}
