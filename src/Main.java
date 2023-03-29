import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> heroes = new ArrayList<Person>();
        heroes.add(new Person("Дункан", "Айдахо", 45));
        heroes.add(new Person("Джонатан", "Стрендж", 33));
        heroes.add(new Person("Федерико", "де Сойя", 44));
        heroes.add(new Person("Артур", "Дент", 32));
        heroes.add(new Person("Энтони", "Локвуд", 15));


        heroes.sort((o1, o2) -> {
            String[] wordsofSurnameOne = new String[o1.getSurname().split(" ").length];
            String[] wordsofSurnameTwo = new String[o2.getSurname().split(" ").length];
            if (wordsofSurnameOne.length > wordsofSurnameTwo.length) {
                return Integer.compare(o1.getSurname().length(), o2.getSurname().length());
            } else if (o1.getAge() > o2.getAge()) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                return -1;
            }
        });
        System.out.println(heroes);
    }
}