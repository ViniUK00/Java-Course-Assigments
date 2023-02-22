public class DayOfTheWeek {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(7);
    }

    // Enhanced switch statement
    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day){
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Input";
        };
        System.out.println(dayOfWeek);
    }
}
