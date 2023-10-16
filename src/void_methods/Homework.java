package void_methods;

public class Homework {

    public static void theBiggerNumber(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is bigger");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is bigger");
        } else if (number3 > number2 && number3 > number1) {
            System.out.println(number3 + " is bigger");
        } else {
            System.out.println("The numbers are equal");
        }
    }

    public static void waterState(int waterTemperature) {
        if (waterTemperature <= 0) {
            System.out.println("water turns into ice");
        } else if (waterTemperature <= 100) {
            System.out.println("water turns into liquid");
        } else {
            System.out.println("water turns into gas");
        }
    }
    public static void theSmallestNumber(int number1, int number2, int number3, int number4) {
        if (number1 < number2 && number1 < number3 && number1 < number4) {
            System.out.println(number1 + " is the smallest");
        } else if (number2 < number1 && number2 < number3 && number2 < number4) {
            System.out.println(number2 + " is the smallest");
        } else if (number3 < number1 && number3 < number2 && number3 < number4) {
            System.out.println(number3 + " is the smallest");
        } else if (number4 < number1 && number4 < number2 && number4 < number3) {
            System.out.println(number4 + " is the smallest");
        } else {
            System.out.println("They are equal");
        }
    }
}





