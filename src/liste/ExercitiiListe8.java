package liste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExercitiiListe8 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7, 12, 26, 31, 47, 52, 68, 71, 82, 94,
                105, 209));

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 1) {
                System.out.println(numbers.get(i));
            }
        }
    }
}
