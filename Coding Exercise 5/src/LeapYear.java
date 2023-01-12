public class LeapYear {

    public static void main (String[] args) {


       boolean return_value =isLeapYear (1924);

       if(return_value){
           System.out.println("Given Year is a Leap Year.");
       }else{
           System.out.println("Not a leap year");
       }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else return year % 100 == 0 && year % 400 == 0;
    }
}
