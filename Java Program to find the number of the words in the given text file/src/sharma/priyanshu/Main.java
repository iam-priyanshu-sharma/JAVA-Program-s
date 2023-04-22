package sharma.priyanshu;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main (String[] args) {
        String line;
        int count = 0;
        BufferedReader br = null;

        try {
            FileReader file = new FileReader ("E:\\BCA\\Program's\\Java Program's\\Java Program to find the most repeated word in a text file\\src\\sharma\\priyanshu\\resource\\data.txt");
            br = new BufferedReader (file);

            while ((line = br.readLine ()) != null) {
                String[] words = line.split ("[,.\\s]+");
                count = count + words.length;
            }

            System.out.println ("Number of words present in given file: " + count);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}