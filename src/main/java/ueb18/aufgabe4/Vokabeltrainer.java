package ueb18.aufgabe4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Vokabeltrainer {

	private static Map<String, Set<String>> vokTrainer = new HashMap<>();

	public static void putToDictionary(String english, String german) {
		Set<String> set = vokTrainer.get(english);

		if(set == null) {
			set = new HashSet<>();
			set.add(german);
			vokTrainer.put(english, set);
		} else {
			set.add(german);
		}
	}

	public static Set<String> getFromDictionary(String english) {
		return vokTrainer.get(english);
	}

	public static void main(String[] args) {

		//put
		Vokabeltrainer.putToDictionary("to clean", "saeubern");
		Vokabeltrainer.putToDictionary("to clean", "putzen");
		Vokabeltrainer.putToDictionary("to drive", "fahren");
		for(Map.Entry<String, Set<String>> entry : vokTrainer.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		//get
		Set<String> set = Vokabeltrainer.getFromDictionary("to clean");
		for(String s : set) {
			System.out.println(s);
		}

	}
}
