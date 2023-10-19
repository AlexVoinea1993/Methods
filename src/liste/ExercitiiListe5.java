package liste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExercitiiListe5 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 23, 36, 41, 59, 68, 72, 81, 98, 101));
        numbers.add(18);
        numbers.add(27);
        numbers.add(38);
        numbers.remove(0);

        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(numbers.size() - 1));
    }
}

