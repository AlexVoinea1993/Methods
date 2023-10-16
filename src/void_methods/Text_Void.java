package void_methods;

public class Text_Void {

    public static void monthsAndSeasonsIF(String month) {
        if (month.equalsIgnoreCase("Ianuarie") || month.equalsIgnoreCase("Februarie")
                || month.equalsIgnoreCase("Decembrie")) {
            System.out.println("Anotimpul corespunzator lunii respective este iarna");
        } else if (month.equalsIgnoreCase("Martie") || month.equalsIgnoreCase("Aprilie")
                || month.equalsIgnoreCase("Mai")) {
            System.out.println("Anotimpul corespunzator lunii respective este primavara");
        } else if (month.equalsIgnoreCase("Iunie") || month.equalsIgnoreCase("Iulie")
                || month.equalsIgnoreCase("August")) {
            System.out.println("Anotimpul corespunzator lunii respective este, vara");
        } else if (month.equalsIgnoreCase("Septembrie") || month.equalsIgnoreCase("Octombrie")
                || month.equalsIgnoreCase("Noiembrie")) {
            System.out.println("Anotimpul corespunzator lunii respective este, toamna");
        } else {
            System.out.println("Anotimpul nu exista");
        }
    }

    public static void monthsAndSeasonSwitch(String months) {
        switch (months) {
            case "December", "January", "February":
                System.out.println("The following months are part of the winter season");
                break;
            case "March", "April", "Mai":
                System.out.println("The following months are part of the spring season");
                break;
            case "June", "July", "August":
                System.out.println("The following months are part of the summer season");
                break;
            case "September", "October", "November":
                System.out.println("The following months are part of the autumn season");
                break;
            default:
                System.out.println("Invalid season");
                break;
        }
    }
}
