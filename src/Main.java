import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> heroes = new ArrayList<>();
        heroes.add(new Person("Дункан", "Айдахо", 45));
        heroes.add(new Person("Джонатан", "Стрендж", 33));
        heroes.add(new Person("Федерико", "де Сойя", 44));
        heroes.add(new Person("Артур", "Дент", 32));
        heroes.add(new Person("Энтони", "Локвуд", 15));

        Collections.sort(heroes, new ComparatorWhoIsMoreNotable());
        System.out.println(heroes);
    }
}