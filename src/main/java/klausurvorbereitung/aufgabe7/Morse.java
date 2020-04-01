package klausurvorbereitung.aufgabe7;

import java.util.HashMap;

public class Morse {
    public static String[][] tabelle = {
            {"A", ".−"},
            {"B", "−..."},
            {"C", "−.-."},
            {"D", "-.."},
            {"E", "."},
            {"F", "..-."},
            {"G", "--."},
            {"H", "...."},
            {"I", ".."},
            {"J", ".---"},
            {"K", "_._"},
            {"L", ".-.."},
            {"M", "--"},
            {"N", "-."},
            {"O", "---"},
            {"P", ".--."},
            {"Q", "--.-"},
            {"R", ".-."},
            {"S", "..."},
            {"T", "-"},
            {"U", "..-"},
            {"V", "...-"},
            {"W", ".--"},
            {"X", "-..-"},
            {"Y", "-.--"},
            {"Z", "--.."}
    }; // end tabelle 


    public HashMap<String, String> getMorseCodeMap(String[][] table) {
        HashMap<String, String> map = new HashMap<>(table.length);
        for (String[] arr : table) {
            map.put(arr[0], arr[1]);
        }
        return map;
    }

    public String zeichenketteToMorse(String s) {
        HashMap<String, String> map = getMorseCodeMap(tabelle);
        String morsecode = "";
		String letter = "";
        for(Character c : s.toCharArray()) {
        	letter = Character.toString(c).toUpperCase();
        	if(!map.containsKey(letter)) return null;
        	morsecode += map.get(letter) + " ";
		}

        return morsecode;
    }

    public static void main(String[] args) {
        Morse morse = new Morse();
        String test = morse.zeichenketteToMorse("Klausurerfolg");
        System.out.println(test);
    }
}
