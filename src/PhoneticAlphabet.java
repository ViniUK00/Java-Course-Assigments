public class PhoneticAlphabet {
    public static void main(String[] args) {
        PhoneticValue('A');
        PhoneticValue('V');
        PhoneticValue('C');
    }

    public static void PhoneticValue(char charValue) {
        switch(charValue){
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println(charValue + " was not found in the switch statement.");
        }
    }
}
