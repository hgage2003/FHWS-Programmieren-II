package altklausuren.ss14.aufgabe4;

import java.util.Comparator;

public class ComparatorName implements Comparator<Player> {

    public int compare(Player first, Player second) {
	return first.getName().compareTo(second.getName());
    }
}
