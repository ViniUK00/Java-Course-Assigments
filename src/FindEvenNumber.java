public class FindEvenNumber {
    public static void main(String[] args) {
        int start = 5;
        int end = 20;
        int counterOfEvenNumber = 0;
        int counterOfOddNumber = 0;

        while (start <= end) {

            if (isEvenNumber(start)) {
                System.out.println("Number " + start + " is even.");
                start++;
                counterOfEvenNumber++;
            }

            if (!isEvenNumber(start)) {
                counterOfOddNumber++;
            }

            if (counterOfEvenNumber == 5) {
                break;
            }
            start++;
        }
        System.out.println("The total counter of even number is: " + counterOfEvenNumber);
        System.out.println("The total counter of odd number is: " + counterOfOddNumber);
    }

    public static boolean isEvenNumber(int number) {
        if (number < 0) {
            return false;
        }
        return (number % 2 == 0);
    }
}
