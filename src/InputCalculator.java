import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        System.out.println("Give a number or any character to exit: ");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int counter = 0;
        while (true) {
            String nextEntry = input.nextLine();
        try {
            counter++;
            int validNum = Integer.parseInt(nextEntry);
            sum += validNum;
            avg = sum/counter;
        } catch (NumberFormatException nfe) {
            System.out.println("SUM = " + sum +" AVG = " + avg);
            break;
        }
    }
}
}
