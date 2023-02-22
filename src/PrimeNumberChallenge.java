public class PrimeNumberChallenge {
    public static void main(String[] args) {
        System.out.println("0 is " + ((isPrime(0) ? "" : "NOT")+ " prime number"));
        System.out.println("1 is " + ((isPrime(1) ? "" : "NOT") + " prime number"));
        System.out.println("2 is " + ((isPrime(2) ? "" : "NOT") + " prime number"));
        System.out.println("3 is " + ((isPrime(3) ? "" : "NOT") + " prime number"));
        System.out.println("4 is " + ((isPrime(4) ? "" : "NOT") + " prime number"));
        System.out.println("17 is " + ((isPrime(17) ? "" : "NOT") + " prime number"));


    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2){
            return wholeNumber == 2;
        }

        for (int i=2; i<wholeNumber; i++) {
            if (wholeNumber%2 == 0) {
                return false;
            }
        }
        return true;
    }
}
