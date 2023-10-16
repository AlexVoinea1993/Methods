package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class ExercitiiListe3 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 11, 23, 32, 47, 51, 66, 72, 81, 91, 101));
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.println(numbers.get(i));
            }
        }
    }
}