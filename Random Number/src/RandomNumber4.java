// Using the ThreadLocalRandom Class

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber4 {

    public static void main (String[] args) {

        int a = ThreadLocalRandom.current ().nextInt ();
        int b = ThreadLocalRandom.current ().nextInt ();

        System.out.println ("Randomly Generated Integer Values:");
        System.out.println (a);
        System.out.println (b);

        double c = ThreadLocalRandom.current ().nextDouble ();
        double d = ThreadLocalRandom.current ().nextDouble ();

        System.out.println ("Randomly Generated Double Values:");
        System.out.println (c);
        System.out.println (d);

        boolean e = ThreadLocalRandom.current ().nextBoolean ();
        boolean f = ThreadLocalRandom.current ().nextBoolean ();

        System.out.println ("Randomly Generated Boolean Values:");
        System.out.println (e);
        System.out.println (f);
    }
}
