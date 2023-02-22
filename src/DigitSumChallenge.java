public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 1234 is: " + sumDigits(1234));
        System.out.println("The sum of the digits in number 123456789 is: " + sumDigits(123456789));
        System.out.println("The sum of the digits in number -1 is: " + sumDigits(-12));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 9) {
            sum += number%10;
            number = number/10;
        }
        sum += number;
        return sum;
    }
}
