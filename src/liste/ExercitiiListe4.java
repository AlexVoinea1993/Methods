package liste;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExercitiiListe4 {
    public static void main(String[] args) {


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



