package altklausuren.ws1314.aufgabe5;

import java.util.*;
import java.io.*;

public class VocabularyTrainer extends AbstractVocabularyTrainer {

    public String readLineFromSystemIn() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        } catch (IOException e) {
            return " ";
        }
    }

    public void load(String filename) throws IllegalArgumentException {
        dictionary = new HashMap<>();

        try (FileReader fr = new FileReader("src\\main\\java\\altklausuren\\ws1314\\aufgabe5\\" + filename);
             BufferedReader br = new BufferedReader(fr);) {
            String line;
            while ((line = br.readLine()) != null) {
                dictionary.put(line, (line = br.readLine()));
            }
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getRandomFirstLanguageWord() {
        int random = (int) (Math.random() * dictionary.size());
        Iterator<Map.Entry<String, String>> it = dictionary.entrySet().iterator();
        while (random > 0 && it.hasNext()) {
            it.next();
            random--;
        }
        return it.next().getKey();
    }

    public boolean testTranslation(String lang1, String lang2) {
        if (dictionary.containsKey(lang1)) {
            String value = dictionary.get(lang1);
            if (value.equals(lang2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        VocabularyTrainer vt = new VocabularyTrainer();
        //test method 'load'
        vt.load("file.txt");
        for (Map.Entry<String, String> m : vt.dictionary.entrySet()) {
            System.out.println(m.getKey() + "-->" + m.getValue());
        }
        //test method 'getRandomFirstLanguageWord'
        System.out.println("Zufälliges Wort: " + vt.getRandomFirstLanguageWord());
        //test method 'testTranslation'
        System.out.println(vt.testTranslation("ja", "yes"));
    }
}
