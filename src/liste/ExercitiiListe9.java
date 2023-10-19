package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class ExercitiiListe9 {
    public static void main(String[] args) {


        ArrayList<String> animals = new ArrayList<>(Arrays.asList("tiger", "bear", "giraffe", "lion",
                "zebra", "penguin", "puma", "cheetah"));

        for (int i = 0; i < animals.size(); i++) {
            System.out.print(animals.get(i) + " ");
        }
        System.out.println();
        System.out.println(animals.get(0));
        System.out.println(animals.get(3));
        System.out.println(animals.get(5));
    }
}
