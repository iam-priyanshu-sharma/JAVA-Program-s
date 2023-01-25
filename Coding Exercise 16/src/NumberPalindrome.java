public class NumberPalindrome {

  public static void main(String[] args) {

    boolean return_value = isPalindrome(-454);

    if (return_value) {
      System.out.println("Palindrome Number!");
    } else {
      System.out.println("Not a Palindrome Number!");
    }
  }

  public static boolean isPalindrome(int number) {

    if (number < 0) {
      number *= -1;
    }

    int r, sum = 0, temp;
    temp = number;
    while (number > 0) {
      r = number % 10;
      sum = (sum * 10) + r;
      number = number / 10;
    }
    return temp == sum;
  }
}
