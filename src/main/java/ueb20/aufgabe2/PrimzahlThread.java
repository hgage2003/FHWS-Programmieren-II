package ueb20.aufgabe2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimzahlThread extends Thread {
    int[] zahlenZumTesten;
    static List<Map<Integer, Boolean>> ergebnise;

    public PrimzahlThread(int[] zahlZumTesten) {
        this.zahlenZumTesten = zahlZumTesten;
        ergebnise = new ArrayList<>();
    }

    public boolean testeObPrimzahl(int primZahl) {
        if (primZahl < 2) return false;
        for (int divisor = 2; divisor < primZahl; divisor++)
            if (primZahl % divisor == 0) return false;
        return true;
    }

    @Override
    public void run() {
        Map<Integer, Boolean> map = new HashMap<>();
        for (Integer i : zahlenZumTesten) {
            boolean istPrimzahl = testeObPrimzahl(i);
            map.put(i, istPrimzahl);
            ergebnise.add(map);
        }
    }

    public static void main(String[] args) {
        Map<Integer, Boolean> map = new HashMap<>();
        int[] arr1 = {341};
        int[] arr2 = {633910099};

        PrimzahlThread pt1 = new PrimzahlThread(arr1);
        pt1.start();
        PrimzahlThread pt2 = new PrimzahlThread(arr2);
        pt2.start();
        try {
            pt1.join();
            pt2.join();
            for(Map<Integer, Boolean> entry : ergebnise) {
                for(Map.Entry<Integer, Boolean> entry2 : entry.entrySet()) {
                    map.put(entry2.getKey(), entry2.getValue());
                    System.out.println(entry2.getKey() + " -> " + entry2.getValue());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
