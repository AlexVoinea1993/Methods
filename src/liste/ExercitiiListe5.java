package liste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExercitiiListe5 {
    public static void main(String[] args) {

//        Declara o lista cu 10 numere
//        1. Adauga inca 3 numere in lista
//        2. Sterge primul numar
//        3. Sorteaza lista
//        4. Afiseaza cel mai mic numar din lista
//        5. Afiseaza cel mai mare numar din lista

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
        System.out.println(numbers.get(numbers.size()-1));
    }
}

