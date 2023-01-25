public class MegaBytesConverter {

  public static void main(String[] args) {

    printMegaBytesAndKiloBytes(3000);
  }

  public static void printMegaBytesAndKiloBytes(int KiloBytes) {

    if (KiloBytes < 0) {
      System.out.println("Invalid Value");
    } else {
      int MegaBytes = KiloBytes / 1024;
      int remaining_value = KiloBytes % 1024;
      System.out.println(KiloBytes + " KB = " + MegaBytes + " MB and " + remaining_value + " KB");
    }
  }
}

/*public class MegaBytesConverter {

    public static void main (String[] args) {
        printMegaBytesAndKiloBytes (2000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int myRemainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + myRemainder + " KB");
        }
    }

}*/
