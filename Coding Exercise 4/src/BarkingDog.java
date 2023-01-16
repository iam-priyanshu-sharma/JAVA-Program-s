public class BarkingDog {

    public static void main (String[] args) {

        boolean return_value=shouldWakeUp (true, 1);

        System.out.println(return_value);
    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {

        if ( barking == false || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23) ) {
            return false;
        } else {
            return true;
        }
    }

}

/*public class BarkingDog {

    public static void main (String[] args) {

        shouldWakeUp (true, 7);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)){
            return false;
        }
        return true;
    }
}*/
