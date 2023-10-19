package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class ExercitiiListe7 {
    public static void main(String[] args) {

//        1. Declara o lista culori, care sa contina 6 culori
//        Afiseaza culorile folosind foreach

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("orange", "blue", "green", "purple",
                "yellow", "black"));

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
