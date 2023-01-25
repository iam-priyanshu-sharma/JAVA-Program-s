public class NumberInWord {

  public static void main(String[] args) {

    printNumberInWord(10);
  }

  public static void printNumberInWord(int number) {

    switch (number) {
      case 0:
        System.out.println("ZERO");
        break;
      case 1:
        System.out.println("ONE");
        break;
      case 2:
        System.out.println("TWO");
        break;
      case 3:
        System.out.println("THREE");
        break;
      case 4:
        System.out.println("FOUR");
        break;
      case 5:
        System.out.println("FIVE");
        break;
      case 6:
        System.out.println("SIX");
        break;
      case 7:
        System.out.println("SEVEN");
        break;
      case 8:
        System.out.println("EIGHT");
        break;
      case 9:
        System.out.println("NINE");
        break;
      default:
        System.out.println("OTHER");
    }
  }

  // Using Enhanced Switch

  /*public static void printNumberInWord (int number) {

      switch (number) {
          case 0 -> System.out.println ("ZERO");
          case 1 -> System.out.println ("ONE");
          case 2 -> System.out.println ("TWO");
          case 3 -> System.out.println ("THREE");
          case 4 -> System.out.println ("FOUR");
          case 5 -> System.out.println ("FIVE");
          case 6 -> System.out.println ("SIX");
          case 7 -> System.out.println ("SEVEN");
          case 8 -> System.out.println ("EIGHT");
          case 9 -> System.out.println ("NINE");
          default -> System.out.println ("OTHER");
      }
  }*/
}
