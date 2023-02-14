public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        if (year > 0 && year < 9999) {
            if (year%4 == 0 || year%100 == 0 && year%400 == 0) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
    public static void main(String[] args){
        isLeapYear(1700); // false
        isLeapYear(1800); // false
        isLeapYear(2600); // false
        isLeapYear(1600); // true
        isLeapYear(2000); // true
        isLeapYear(1964);
    }
}
