package klausurvorbereitung.aufgabe1;

import java.io.Serializable;

public class User implements Serializable, Comparable<User> {

    private final transient String username, passwort;

    public User(String username, String passwort) {
        this.username = username;
        this.passwort = passwort;
    }

    @Override
    public int compareTo(User u) {
        return this.username.compareTo(u.username);
    }
}
