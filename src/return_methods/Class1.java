package return_methods;

public class Class1 {

//        Scrie o metoda care primeste 2 numere si il returneaza pe cel mai mare

    public static int findMin(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

//    Scrie 1 metoda care primeste 1 numar, si returneaza  pozitiv sau negativ

    public static String findPositiveNumber(int number) {
        if (number > 0) {
            return "Positive";
        } else {
            return "Negative";
        }
    }

//    Scrie 1 metoda care primeste 5 numbere double si returneaza media lor

    public static double averageOfAllNumbers(double number1, double number2, double number3, double number4,
                                             double number5) {
        double sum = number1 + number2 + number3 + number4 + number5;
        return sum / 5;
    }

//    Scrie 1 metoda playFizzBuzz care primeste 1 numar si returneaza Fizz, Buzz, sau FizzBuzz

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
}


