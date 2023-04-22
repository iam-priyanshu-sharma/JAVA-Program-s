package sharma.priyanshu;

public class Main {

    public static void main (String[] args) {
        String string = "Dream big";
        StringBuilder reversedStr = new StringBuilder ();

        for (int i = string.length () - 1; i >= 0; i--) {
            reversedStr.append (string.charAt (i));
        }

        System.out.println ("Original string: " + string);
        System.out.println ("Reverse of given string: " + reversedStr);
    }
}
