package klausurvorbereitung.various.IterableComparable;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonListComparable {

    List<Person> personList;

    public PersonListComparable() {
        this.personList = new ArrayList<>();
    }

    Comparator<Person> anonymousComparatorName = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.name.compareTo(p2.name);
        }
    };

    Comparator<Person> anonymousComparatorID = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.id - p2.id;
        }
    };

    private static class InnerClassComparatorName implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.name.compareTo(p2.name);
        }
    }

    private static class InnerClassComparatorID implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.id - p2.id;
        }
    }

    public static void main(String[] args) {
        PersonListComparable list = new PersonListComparable();
        Person p1 = new Person(1, "Jon");
        Person p2 = new Person(2, "Bob");
        Person p3 = new Person(3, "Clara");
        Person p4 = new Person(4, "Mike");

        list.personList.add(p1);
        list.personList.add(p2);
        list.personList.add(p3);
        list.personList.add(p4);

        Collections.sort(list.personList, new InnerClassComparatorName()); //Inner Class is not able to be directly instantiate
        for (Person p : list.personList) {
            System.out.println(p.toString());
        }

        System.out.println();

        Collections.sort(list.personList, new InnerClassComparatorID());
        for (Person p : list.personList) {
            System.out.println(p.toString());
        }
    }
}
