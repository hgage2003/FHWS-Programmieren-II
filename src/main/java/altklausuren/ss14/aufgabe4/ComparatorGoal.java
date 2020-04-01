package altklausuren.ss14.aufgabe4;

import java.util.Comparator;

public class ComparatorGoal implements Comparator<Player> {

    public int compare(Player first, Player second) {
	if(first.getGoals()<second.getGoals()) {
	    return -1;
	} else if(first.getGoals()==second.getGoals()) {
	    return 0;
	} else {
	    return 1;
	}
    }
}
