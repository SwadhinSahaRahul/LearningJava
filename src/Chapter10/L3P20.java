package Chapter10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class L3P20 {
    Set<Person> entry = new HashSet<>();

    public L3P20() {
    }

    public static void main(String[] args) throws Exception {
        L3P20 book = new L3P20();
        for (int i = 0; i < 10; i++) {
            Person person = new Person("Ms. X" + i);
            book.entry.add(person);
        }
        Iterator<Person> iterator = book.entry.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().name);
        }
    }
}