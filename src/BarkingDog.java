/*
* We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
Write a method shouldWakeUp that has 2 parameters.
1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.

We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.

In all other cases return false.

If the hourOfDay parameter is less than 0 or greater than 23 return false.*/
public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
        if (hourOfDay < 24 && hourOfDay >= 0 && barking) {
            if (hourOfDay<8) {
                System.out.println(true);
                return true;
            }
            if (hourOfDay>22) {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        shouldWakeUp(true,1);
        shouldWakeUp(false,2);
        shouldWakeUp(true,8);
        shouldWakeUp(true,-1);

    }
}
