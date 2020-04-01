package klausurvorbereitung.aufgabe5;

import java.util.Iterator;

public class RouletteZahlen implements Iterable<Integer> {

    @Override
    public Iterator<Integer> iterator() {
        return new RouletteZahlenIterator();
    }

    public static void main(String[] args) {
        RouletteZahlen zahlen = new RouletteZahlen();
        Iterator<Integer> iterator = zahlen.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
