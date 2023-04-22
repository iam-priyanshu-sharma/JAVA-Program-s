package sharma.priyanshu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main (String[] args) throws Exception {
        String line;
        Map<String, Integer> wordCounts = new HashMap<> ();
        FileReader file = new FileReader ("E:\\BCA\\Program's\\Java Program's\\Java Program to find the most repeated" + " word in a text file\\src\\sharma\\priyanshu\\resource\\data.txt");
        BufferedReader br = new BufferedReader (file);

        while ((line = br.readLine ()) != null) {
            String[] words = line.toLowerCase ().split ("[,.\\s]+");

            for (String word : words) {
                if ( wordCounts.containsKey (word) ) {
                    wordCounts.put (word, wordCounts.get (word) + 1);
                } else {
                    wordCounts.put (word, 1);
                }
            }
        }

        String mostRepeatedWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet ()) {
            if ( entry.getValue () > maxCount ) {
                maxCount = entry.getValue ();
                mostRepeatedWord = entry.getKey ();
            }
        }

        System.out.println ("Most repeated word: " + mostRepeatedWord);
        br.close ();
    }
}