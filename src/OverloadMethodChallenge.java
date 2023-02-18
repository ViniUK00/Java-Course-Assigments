public class OverloadMethodChallenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5,8) + "cm");
        System.out.println(convertToCentimeters(10) + "cm");
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }
    public static double convertToInches(int feet) {
        return (feet * 12);
    }
    public static double convertToCentimeters(int feet, int inches) {
        return ((inches+convertToInches(feet))* 2.54);
    }
}
