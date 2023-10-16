public class Mathematics_Void {

    public static void addTwoNumbers(int x, int y) {
        System.out.println(x + y);
    }

    public static void multiplyTwoNumbers(int d, int c) {
        System.out.println(d * c);
    }

    public static void averageOfThreeNumbers(double t, double o, double c) {
        System.out.println((t + o + c) / 3);
    }

    public static void squareNumber(int number) {
        System.out.println(number * number);
    }

    public static void findBiggestNumber(int number1, int number2) {
        if (number1 > number2) {
            System.out.println(number1 + " is greater");
        } else {
            System.out.println(number2 + " is greater");
        }
    }

    public static void playFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("That is all");
        }
    }

    public static void multiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }

    public static void positiveAndNegativeNumbers(int number) {
        if (number > 0 && number % 2 == 0) {
            System.out.println("The number is positive and even");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("The number is positive and odd");
        } else if (number < 0 && number % 2 == 0) {
            System.out.println("The number is negative and even");
        } else if (number < 0 && number % 2 != 0) {
            System.out.println("The number is negative and odd");
        }
    }
}




