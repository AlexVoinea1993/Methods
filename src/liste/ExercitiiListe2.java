package liste;

import java.util.ArrayList;

public class ExercitiiListe2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(71);
        numbers.add(23);
        numbers.add(11);
        numbers.add(99);
        numbers.add(48);
        numbers.add(36);
        numbers.add(82);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
