public class NumberPalindrome {
    public static void main(String[] args) {
        // Test case 100  -> False
        System.out.println(isPalindrome(100));

        // Test case 101  -> True
        System.out.println(isPalindrome(101));

        // Test case -222  -> True
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int num){
        int lastDigit;
        int number = num;
        int reverse = 0;
        while (num != 0) {
            lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num /10;
        }
        return (reverse == number);
    }
}
