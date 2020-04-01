package ueb17.aufgabe1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestReadObject {

    public static void main(String[] args) throws Exception {
        Person person = null;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\main\\java\\ueb17\\aufgabe1\\test.txt"));

        while (true) {
            try {
                person = (Person) ois.readObject();
                System.out.println(person.getTelefonr());
            } catch (EOFException e) {
                break;
            }
        }
        ois.close();
    }
}
