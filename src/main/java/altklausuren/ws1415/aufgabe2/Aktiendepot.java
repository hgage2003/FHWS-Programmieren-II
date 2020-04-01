package altklausuren.ws1415.aufgabe2;

import java.util.*;

import altklausuren.ws1415.aufgabe1.Aktie;

public class Aktiendepot {

    Map<String, Aktie> depot = new HashMap<String, Aktie>();

    public void bucheAktieEin(Aktie a) {
        if (!depot.containsKey(a.getName())) {
            depot.put(a.getName(), a);
        }
    }

    public Aktie leseAktieAus(String name) {
        if (depot.containsKey(name)) {
            return depot.get(name);
        }
        return null;

    }

    public Aktie[] alleAktien() {
        Aktie[] array = new Aktie[depot.size()];
        int index = 0;
        Iterator<Aktie> it = depot.values().iterator();

        while (it.hasNext()) {
            array[index] = it.next();
            index++;
        }
        return array;
    }

    public Aktie[] alleAktienNachName() {
        Aktie[] array = alleAktien();
        Arrays.sort(array);
        return array;
    }

    public Aktie[] alleAktienNachWert() {
        Aktie[] array = alleAktien();
        Arrays.sort(array, new AktiendepotNachWertComparator());
        return array;
    }

    public static void main(String[] args) {
        Aktiendepot depot = new Aktiendepot();
        Aktie a1 = new Aktie("ZF", 20, 100);
        Aktie a2 = new Aktie("Audi", 50, 500);
        Aktie a3 = new Aktie("Bosch", 6, 800);
        depot.bucheAktieEin(a1);
        depot.bucheAktieEin(a2);
        depot.bucheAktieEin(a3);

        Aktie[] array = depot.alleAktienNachName();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
        System.out.println();
        array = depot.alleAktienNachWert();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }
}
