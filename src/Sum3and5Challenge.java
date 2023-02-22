public class Sum3and5Challenge {
    public static void main(String[] args) {
        int sumOfMatches = 0;
        int counterOfMatches = 0;
        for (int i=1; i<=1000; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println(i + " is divisible by 3 and 5");
                sumOfMatches += i;
                counterOfMatches++;
            }
            if (counterOfMatches==5){
                break;
            }
        }
        System.out.println("Sum of the numbers that found are divisible by 3 and 5 is " + sumOfMatches);
    }
}
