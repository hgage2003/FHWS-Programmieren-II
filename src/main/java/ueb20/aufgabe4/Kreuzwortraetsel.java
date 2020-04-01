package ueb20.aufgabe4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Kreuzwortraetsel {
    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian",
            "Carmen"};

    private static class WortComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            if(s1.length() > s2.length()) {
                return 1;
            } else if(s1.length() < s2.length()) {
                return -1;
            }
            return s1.compareTo(s2);
        }
    }

    public static void main(String[] args) {

        //Comparator inner class
        TreeSet<String> t1 = new TreeSet<>(new WortComparator());
        t1.addAll(Arrays.asList(alleWoerter));
        for (String wort : t1)
            System.out.println(wort);

        System.out.println("***************************");

        //Comparator anonymous class
        TreeSet<String> t2 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() > s2.length()) {
                    return 1;
                } else if(s1.length() < s2.length()) {
                    return -1;
                }
                return s1.compareTo(s2);
            }
        });
        t2.addAll(Arrays.asList(alleWoerter));
        for (String wort : t2)
            System.out.println(wort);
    }
}