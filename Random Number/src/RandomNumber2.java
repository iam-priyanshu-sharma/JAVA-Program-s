// using random class

import java.util.Random;

public class RandomNumber2 {

    public static void main (String[] args) {

        Random random = new Random ();
        int x = random.nextInt (50);
        int y = random.nextInt (1000);

        System.out.println ("Randomly Generated Integers Values");
        System.out.println (x);
        System.out.println (y);

        double a = random.nextDouble ();
        double b = random.nextDouble ();

        System.out.println ("Randomly Generated Double Values");
        System.out.println (a);
        System.out.println (b);

        float f = random.nextFloat ();
        float i = random.nextFloat ();

        System.out.println ("Randomly Generated Float Values");
        System.out.println (f);
        System.out.println (i);

        long p = random.nextLong ();
        long q = random.nextLong ();

        System.out.println ("Randomly Generated Long Values");
        System.out.println (p);
        System.out.println (q);

        boolean m = random.nextBoolean ();
        boolean n = random.nextBoolean ();

        System.out.println ("Randomly Generated Boolean Values");
        System.out.println (m);
        System.out.println (n);
    }
}
