package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class ExercitiiListe10 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, 23, 31, 49, 51, 66, 71));
        int suma = 0;
        for (int i = 0; i < numbers.size(); i++) {
            suma += numbers.get(i);
        }
        System.out.println(suma);
    }
}

