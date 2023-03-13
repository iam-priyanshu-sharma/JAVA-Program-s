import java.util.Scanner;

public class HollowDiamond {

    public static void main (String[] args) {

        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int alphabet_number = 0;
        String[] diamond = new String[26]; // array of strings

        System.out.print ("Enter a Character between A to Z : ");
        try (Scanner reader = new Scanner (System.in)) {
            char user_alphabet = reader.next ("[A-Z]").charAt (0);

            for (int ii = 0; ii < alphabet.length; ii++) {
                if ( alphabet[ii] == user_alphabet ) {
                    alphabet_number = ii;
                    break;
                }
            }

            for (int i = 0; i <= alphabet_number; i++) {
                diamond[i] = " ";
                for (int j = 0; j < alphabet_number - i; j++) {
                    diamond[i] += " ";
                }

                diamond[i] += alphabet[i];

                if ( alphabet[i] != 'A' ) {
                    for (int j = 0; j < 2 * i - 1; j++) {
                        diamond[i] += " ";
                    }
                    diamond[i] += alphabet[i];
                }
                System.out.println (diamond[i]);
            }

            for (int i = alphabet_number - 1; i >= 0; i--) {
                System.out.println (diamond[i]);
            }
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}

/*import java.util.Scanner;

public class DiamondCharacterPattern {
    public static void main(String[] args) {
        char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        int alphabet_number = 0;
        String[] diamond = new String[26]; // array of strings
        System.out.print("Enter a Character between A to Z : ");
        Scanner reader = new Scanner(System.in);
        try {
            char user_alphabet = reader.next("[A-Z]").charAt(0);
            // search for letter number in the array alphabet
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] == user_alphabet) {
                    alphabet_number = i;
                    break;
                }
            }
            //construct diamond
            for (int i = 0; i <= alphabet_number; i++) {
                diamond[i] = "";
                //add initial spaces
                for (int j = 0; j < alphabet_number - i; j++) {
                    diamond[i] += " ";
                }
                // add alphabet
                diamond[i] += alphabet[i];
                //add space between letters
                if (alphabet[i] != 'A') {
                    for (int j = 0; j < 2 * i - 1; j++) {
                        diamond[i] += " ";
                    }
                    // add alphabet
                    diamond[i] += alphabet[i];
                }
                // Draw the first part of the diamond
                System.out.println(diamond[i]);
            }
            for (int i = alphabet_number - 1; i >= 0; i--) {
                // Draw the second part of the diamond
                // prints the diamondArray in the reverse order
                System.out.println(diamond[i]);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        }
    }
}
*/