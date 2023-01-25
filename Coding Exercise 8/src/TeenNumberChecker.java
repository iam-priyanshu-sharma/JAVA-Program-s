public class TeenNumberChecker {

  public static void main(String[] args) {

    boolean return_value = hasTeen(23, 15, 42);

    if (return_value) {
      System.out.println(
          "Congrats, your input number is within the range.Hence, the number is Teen.");
    } else {
      System.out.println("Your input isn't within the range.Hence, the number isn't Teen.");
    }
  }

  public static boolean hasTeen(int first_number, int second_number, int third_number) {

    if (isTeen(first_number) || isTeen(second_number) || isTeen(third_number)) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isTeen(int number) {

    return (number >= 13 && number <= 19);
  }
}
