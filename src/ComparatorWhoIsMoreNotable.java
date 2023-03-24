import java.util.Comparator;

public class ComparatorWhoIsMoreNotable implements Comparator <Person> {

    @Override
    public int compare(Person o1, Person o2) {
        String[] wordsofSurnameOne = new String[o1.getSurname().split(" ").length];
        String[] wordsofSurnameTwo = new String[o2.getSurname().split(" ").length];
        boolean gentry = wordsofSurnameOne.length > wordsofSurnameTwo.length;
        boolean older = o1.getAge() > o2.getAge();
        if (gentry) {
            return Integer.compare(o1.getSurname().length(), o2.getSurname().length());
        } else if (older) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else {
            return -1;
        }
    }
}

