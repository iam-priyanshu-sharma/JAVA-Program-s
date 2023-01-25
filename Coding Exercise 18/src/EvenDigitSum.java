public class EvenDigitSum {

  public static void main(String[] args) {

    int return_value = getEvenDigitSum(986);

    if (return_value == -1) {
      System.out.println("Invalid Value!");
    } else {
      System.out.println("Sum of Even Digits = " + return_value);
    }
  }

  public static int getEvenDigitSum(int number) {

    if (number < 0) {
      return -1;
    }

    int sum = 0, remainder;

    while (number > 0) {
      remainder = number % 10;
      if (remainder % 2 == 0) {
        sum += remainder;
      } else {
        sum += 0;
      }
      number /= 10;
    }

    return sum;
  }
}
