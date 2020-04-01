package ueb13.aufgabe4;

public class SimpleChangeCalculator {

    public int[] getChange(int euros, int cent) {
        return new int[]{
                euros * 100 + cent,  // alles in 1-Cent-Muenzen
                0,                   // keine 2-Cent-Muenzen
                0,                   // keine 5-Cent-Muenzen
                0,                   // keine 10-Cent-Muenzen
                0,                   // keine 20-Cent-Muenzen
                0,                   // keine 50-Cent-Muenzen
                0,                   // keine 1-Euro-Muenzen
                0                    // keine 2-Euro-Muenzen
        };
    }

    public void test() {
        int j = 0;

        System.out.println("\nZuerst ein simpler Fall: Es sollen 1 Euro und 70 Cent Wechselgeld zurückgegeben werden:");
        int[] result = getChange(1, 70);

        System.out.println("\nDer Automat gibt folgende Muenzen zurueck:");
        j = 0;
        for (int i = 0; i < Coin.availableCoins.length; i++) {
            System.out.println(result[i] + " x " + Coin.availableCoins[i].getName());
            j += result[i];
        }
        System.out.println("Anzahl der Münzen: " + j);

        System.out.println("\nJetzt ein bisschen schwieriger: Es sollen 3 Euro und 88 Cent Wechselgeld zurückgegeben werden:");
        result = getChange(3, 88);

        System.out.println("\nDer Automat gibt folgende Muenzen zurueck:");
        j = 0;
        for (int i = 0; i < Coin.availableCoins.length; i++) {
            System.out.println(result[i] + " x " + Coin.availableCoins[i].getName());
            j += result[i];
        }
        System.out.println("Anzahl der Münzen: " + j);

        System.out.println("\nJetzt ein bisschen schwieriger: Es sollen 2 Euro und 26 Cent Wechselgeld zurückgegeben werden:");
        result = getChange(2, 26);

        System.out.println("\nDer Automat gibt folgende Muenzen zurueck:");
        j = 0;
        for (int i = 0; i < Coin.availableCoins.length; i++) {
            System.out.println(result[i] + " x " + Coin.availableCoins[i].getName());
            j += result[i];
        }
        System.out.println("Anzahl der Münzen: " + j);
    }

    public static void main(String[] args) {
        SimpleChangeCalculator s = new SimpleChangeCalculator();
        s.test();
    }
}