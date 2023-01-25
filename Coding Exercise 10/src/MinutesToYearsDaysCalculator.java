public class MinutesToYearsDaysCalculator {

  public static void main(String[] args) {

    printYearsAndDays(1051200);
  }

  public static void printYearsAndDays(long minutes) {

    if (minutes < 0) {
      System.out.println("Invalid Value");
    } else {
      long year = minutes / 525600;
      long days = (minutes % 525600) / 1440;

      System.out.println(minutes + " min = " + year + " y and " + days + " d");
    }
  }
}

// Detailed Solution below

/*public static void printYearsAndDays (long minutes){
    if( minutes<0){
        System.out.println("Invalid Value");
    }else {
        long hours = minutes / 60;
        long days = hours / 24;
        if (days>=365){
            long years = days / 365;
            long remainingDays= days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
        else {
            long years = days / 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}*/
