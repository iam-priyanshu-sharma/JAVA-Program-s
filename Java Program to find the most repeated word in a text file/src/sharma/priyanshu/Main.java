package sharma.priyanshu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main (String[] args) throws Exception {
        String line, word = "";
        int count, maxCount = 0;
        ArrayList<String> words = new ArrayList<> ();
        FileReader file = new FileReader ("data.txt ");
        BufferedReader br = new BufferedReader (file);

        while ((line = br.readLine ()) != null) {
            String[] string = line.toLowerCase ().split ("([,.\\s]+) ");
            words.addAll (Arrays.asList (string));
        }

        for (int i = 0; i < words.size (); i++) {
            count = 1;

            for (int j = i + 1; j < words.size (); j++) {

                if ( words.get (i).equals (words.get (j)) ) {
                    count++;
                }
            }

            if ( count > maxCount ) {
                maxCount = count;
                word = words.get (i);
            }
        }

        System.out.println ("Most repeated word: " + word);
        br.close ();
    }
}
