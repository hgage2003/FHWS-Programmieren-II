package ueb13.aufgabe4;

public class SimpleChangeCalculatorEnhanced extends SimpleChangeCalculator {
    @Override
    public int[] getChange(int euros, int cent) {
        int value = euros * 100 + cent;
        int[] change = new int[Coin.availableCoins.length];

        for (int i = Coin.availableCoins.length - 1; i >= 0; i--) {
            change[i] = value / Coin.availableCoins[i].getValue();
            value = value % Coin.availableCoins[i].getValue();
        }
        return change;
    }

    public static void main(String[] args) {
        SimpleChangeCalculatorEnhanced s = new SimpleChangeCalculatorEnhanced();
        s.test();
    }
}
