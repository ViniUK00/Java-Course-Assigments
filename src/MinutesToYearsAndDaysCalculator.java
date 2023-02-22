public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1440);
    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        }

        if (minutes >= 0 ) {
            int hour = (int) (minutes / 60);
            int days = (hour / 24) % 365;
            int years = (hour / 24) / 365;
            System.out.println(minutes +  " min = " + years+ " y and " + days + " d");
        }
    }
}
