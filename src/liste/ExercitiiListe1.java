package liste;

import java.util.ArrayList;

public class ExercitiiListe1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(153);
        numbers.add(23);
        numbers.add(71);
        numbers.add(89);
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        System.out.println(numbers.size());
    }
}
