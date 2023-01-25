import java.util.Scanner;

public class InputCalculator {

  public static void main(String[] args) {

    inputThenPrintSumAndAverage();
  }

  public static void inputThenPrintSumAndAverage() {

    Scanner scanner = new Scanner(System.in);
    int sum = 0, count = 0, number;

    System.out.println("Enter numbers:");

    while (true) {

      boolean is_an_int = scanner.hasNextInt();

      if (is_an_int) {
        number = scanner.nextInt();
        sum += number;
        count++;
      } else {
        break;
      }
    }

    System.out.println("SUM = " + sum + " AVERAGE = " + Math.round((double) sum / count));
    scanner.close();
  }
}
