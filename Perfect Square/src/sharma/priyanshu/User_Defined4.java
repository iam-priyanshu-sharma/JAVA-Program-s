package sharma.priyanshu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User_Defined4 {

    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Please enter an integer: ");
        int n = Integer.parseInt (reader.readLine ());
        int sqrt = (int) Math.sqrt (n);

        if ( sqrt * sqrt == n ) {
            System.out.println (n + " is a perfect square number.");
        } else {
            System.out.println (n + " is not a perfect square number.");
        }
    }
}
