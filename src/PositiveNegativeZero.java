public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(0);
        checkNumber(-12);
    }

    public static void checkNumber(int num) {
        if (num == 0) {
            System.out.println("Number is equal to: 0");
        } else if (num > 0) {
            System.out.println("Number " + num + " is positive");
        } else {
            System.out.println("Number " + num + " is negative");
        }
    }
}
