package klausurvorbereitung.aufgabe1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager implements ObjectManager<User> {

    @Override
    public void serialize(List<User> users) throws RuntimeException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\main\\java\\klausurvorbereitung\\aufgabe1\\user.dat"))) {
            for (User u : users) {
                oos.writeObject(u);
                oos.flush();
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public List<User> deserialize() throws RuntimeException {
        List<User> users = new ArrayList<>();
        Object object;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\main\\java\\klausurvorbereitung\\aufgabe1\\user.dat"))) {
            while (true) {
                object = ois.readObject();
                if (object instanceof User) {
                    users.add((User) object);
                }
            }
        } catch (EOFException e) {
            return users;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<User> input = new ArrayList<>();

        User u1 = new User("Max", "12345");
        User u2 = new User("Peter", "99999");

        users.add(u1);
        users.add(u2);

        UserManager um = new UserManager();
        try {
            um.serialize(users);
            input = um.deserialize();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        for (User u : input) {
            System.out.println(u.toString());
        }
    }
}
