package liste;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExercitiiListe4 {
    public static void main(String[] args) {

//        Declara o lista "masini" care sa contina 5 masini
//        1. Adauga 3 masini noi in lista
//        2. Parcurge lista intr-un fori si afiseaza toate masinile pe acelasi rand cu spatiu intre ele
//        3. Sterge prima si ultima masina din lista
//        4. Parcurge lista intr-un foreach, si afiseaza toate masinile pe acelasi rand
//        5. Sorteaza lista
//        6. Afiseaza numarul total de elemente din lista
//        7. Afiseaza prima, a treia si ultima masina

        ArrayList<String> cars = new ArrayList<>(Arrays.asList("Suzuki", "Skoda", "Toyota", "Honda", "Mazda"));
        cars.add("Hyundai");
        cars.add("Dacia");
        cars.add("Lexus");
        cars.remove(0);
        cars.remove(6);

        Collections.sort(cars);
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();
        for (String car : cars) {
            System.out.print(car + " ");
        }
        System.out.println();
        System.out.println(cars.size());
        System.out.println(cars.get(0));
        System.out.println(cars.get(2));
        System.out.println(cars.get(4));
    }
}



