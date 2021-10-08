package Chapter10;

class L2P17 {
    private static final int DEFAULT_SIZE = 25;

    Person[] entry;
    int currentIndex = 0;
    boolean isDirty = false;
    public L2P17() {
        this(DEFAULT_SIZE);
    }
    public L2P17(int size) {
        if (size <= 0) { //invalid data value, use default
            throw new IllegalArgumentException("Size must be positive.");
        }
        entry = new Person[size];
        System.out.println("array of " + size + " is created."); //TEMP
    }
    public static void main(String[] args) throws Exception {
        L2P17 book = new L2P17(5);
        for (int i = 0; i < 5; i++) {
            Person person = new Person("Ms. X" + i);
            book.entry[i] = person;
        }
        Person firstPerson = book.getFirstPerson();
        Person nextPerson = book.getNextPerson();
        Person nextPerson1 = book.getNextPerson();
        Person nextPerson2 = book.getNextPerson();
        Person nextPerson3 = book.getNextPerson();
        Person nextPerson4 = book.getNextPerson();
        Person nextPerson5 = book.getNextPerson();
        System.out.println(nextPerson3.name);
        System.out.println(nextPerson5);
    }
    public Person getFirstPerson() {
        isDirty = true;
        return entry[0];
    }
    public Person getNextPerson() throws Exception {
        if (!isDirty) {
            throw new Exception("Get First Person Should be called first.");
        }
        if (currentIndex > entry.length - 1) {
            return null;
        } else {
            return entry[currentIndex++];
        }
    }
}