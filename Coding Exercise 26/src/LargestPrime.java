public class LargestPrime {

  public static void main(String[] args) {

    int return_value = getLargestPrime(21);

    if (return_value == -1) {
      System.out.println("Invalid Value!");
    } else {
      System.out.println("Largest Prime Factor is " + return_value);
    }
  }

  public static int getLargestPrime(int number) {

    if (number < 2) {
      return -1;
    }

    for (int i = 2; i < number; i++) {

      if ((number % i) == 0) {
        number /= i;
        i--;
      }
    }

    return number;
  }
}
