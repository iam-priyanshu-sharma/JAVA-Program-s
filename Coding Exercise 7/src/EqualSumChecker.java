public class EqualSumChecker {

  public static void main(String[] args) {

    boolean return_value = hasEqualSum(1, 1, 1);

    if (return_value) {
      System.out.println("Yeah!, Sum of 1st and 2nd number is equal to 3rd number.");
    } else {
      System.out.println("Oops!, Sum of 1st and 2nd number isn't equal to 3rd number");
    }
  }

  public static boolean hasEqualSum(int first_number, int second_number, int third_number) {

    if (first_number + second_number == third_number) {
      return true;
    } else {
      return false;
    }
  }
}
