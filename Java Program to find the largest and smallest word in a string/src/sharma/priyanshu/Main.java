package sharma.priyanshu;

public class Main {

    public static void main (String[] args) {
        String string = "Hardships often prepare ordinary people for an extraordinary destiny";
        StringBuilder word = new StringBuilder ();
        String small;
        String large;
        String[] words = new String[100];
        int length = 0;
        string = string + " ";

        for (int i = 0; i < string.length (); i++) {

            if ( string.charAt (i) != ' ' ) {
                word.append (string.charAt (i));
            } else {
                words[length] = word.toString ();
                length++;
                word = new StringBuilder ();
            }
        }

        small = large = words[0];

        for (int k = 0; k < length; k++) {

            if ( small.length () > words[k].length () ) {
                small = words[k];
            }

            if ( large.length () < words[k].length () ) {
                large = words[k];
            }
        }

        System.out.println ("Smallest word: " + small);
        System.out.println ("Largest word: " + large);
    }
}
