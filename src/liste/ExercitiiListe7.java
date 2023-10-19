package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class ExercitiiListe7 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("orange", "blue", "green", "purple",
                "yellow", "black"));

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
