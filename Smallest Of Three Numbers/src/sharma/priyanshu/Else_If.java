package sharma.priyanshu;

public class Else_If {

    public static void main (String[] args) {
        int a = 101, b = 8, c = 19;

        if ( a <= b && a <= c ) {
            System.out.println (a + " is the smallest number");
        } else if ( b <= a && b <= c ) {
            System.out.println (b + " is the smallest number");
        } else {
            System.out.println (c + " is the smallest number");
        }
    }
}
