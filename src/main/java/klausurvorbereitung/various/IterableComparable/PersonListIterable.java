package klausurvorbereitung.various.IterableComparable;

import java.util.Iterator;

public class PersonListIterable implements Iterable<Person> {

    @Override
    public Iterator<Person> iterator() {
        return new PersonListIterator();
    }

    private static class PersonListIterator implements Iterator<Person> {
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index > 10) return false;
            return true;
        }

        public Person next() {
            index++;
            Person p1 = new Person(1, "Jon");
            return p1;
        }
    }//End Custom Iterator


    public static void main(String[] args) {
        PersonListIterable list = new PersonListIterable();

        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
