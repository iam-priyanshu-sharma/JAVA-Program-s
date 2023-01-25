public class NumberOfDaysInMonth {

  public static void main(String[] args) {

    int return_days = getDaysInMonth(2, 2020);

    if (return_days == -1) {
      System.out.println("Invalid Month or Year.");
    } else {
      System.out.println(return_days + " days");
    }
  }

  public static boolean isLeapYear(int year) {

    if (year < 1 || year > 9999) {
      return false;
    } else {
      return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
  }

  public static int getDaysInMonth(int month, int year) {

    if (month < 1 || month > 12 || year < 1 || year > 9999) {
      return -1;
    } else {
      return switch (month) {
        case 4, 6, 9, 11 -> 30;

        case 2 -> {
          if (isLeapYear(year)) {
            yield 29;
          } else {
            yield 28;
          }
        }
        default -> 31;
      };
    }
  }
}
