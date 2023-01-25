public class LastDigitChecker {

  public static void main(String[] args) {

    boolean return_value = hasSameLastDigit(435, 565, 698);

    System.out.println(return_value);
  }

  public static boolean hasSameLastDigit(int num1, int num2, int num3) {

    if (isValid(num1) && isValid(num2) && isValid(num3)) {

      num1 %= 10;
      num2 %= 10;
      num3 %= 10;

      return ((num1 == num2) || (num1 == num3) || (num2 == num3));
    }

    return false;
  }

  public static boolean isValid(int num) {

    return ((num >= 10) && (num <= 1000));
  }
}
