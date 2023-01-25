public class DecimalComparator {

  public static void main(String[] args) {

    boolean return_value = areEqualByThreeDecimalPlaces(3.175, 3.176);

    System.out.println(return_value);
  }

  public static boolean areEqualByThreeDecimalPlaces(double first_value, double second_value) {

    int my_first_check = (int) (first_value * 1000);
    int my_second_check = (int) (second_value * 1000);

    if (my_first_check - my_second_check == 0) {
      return true;
    } else {
      return false;
    }
  }
}
