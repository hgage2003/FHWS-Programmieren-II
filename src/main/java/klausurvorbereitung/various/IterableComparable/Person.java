package klausurvorbereitung.various.IterableComparable;

public class Person implements Comparable<Person> {

    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name;
    }

    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.name);
    }
}
