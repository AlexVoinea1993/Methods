public class Mathematics {

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

    public static void biggestNumber(int number1, int number2) {
        if (number1 > number2) {
            System.out.println(number1 + " is greater");
        }else {
            System.out.println(number2 + " is greater");
        }
    }
}

