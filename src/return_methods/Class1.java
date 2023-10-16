package return_methods;

import java.util.ArrayList;

public class Class1 {

    public static int findMin(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static String findPositiveNumber(int number) {
        if (number > 0) {
            return "Positive";
        } else {
            return "Negative";
        }
    }

    public static double averageOfAllNumbers(double number1, double number2, double number3, double number4,
                                             double number5) {
        double sum = number1 + number2 + number3 + number4 + number5;
        return sum / 5;
    }

    public static String fizzBuzzGame(int number) {
        if (number % 5 == 0 && number % 3 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Fizz";
        } else if (number % 3 == 0) {
            return "Buzz";
        } else {
            return "The number is not divisible by 5 or 3";
        }
    }
    public static int daysAndHours(int days) {
        return 24 * days;
    }

//    Scrie o metoda care primeste o lista de numere si returneaza suma lor

    public static int sumOfNumbers(ArrayList<Integer> numbers){
        return 1;
    }
}



