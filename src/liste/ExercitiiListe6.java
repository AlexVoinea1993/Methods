package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class ExercitiiListe6 {
    public static void main(String[] args) {

//        1. Declara o lista de numere cu 10 numere
//        2. Afiseaza toate numerele, folosind foreach

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7, 12, 23, 35, 41, 57, 62, 79, 82, 99));
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
