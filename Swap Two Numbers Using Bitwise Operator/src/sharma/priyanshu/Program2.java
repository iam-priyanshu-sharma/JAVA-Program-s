package sharma.priyanshu;

public class Program2 {

    public static void main (String[] args) {
        int x = 12;
        int y = 34;
        swapNumbers (x, y);
    }

    static void swapNumbers (int x, int y) {
        System.out.println ("Before swapping");
        System.out.println ("x= " + x + ", y= " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println ("After swapping");
        System.out.println ("x= " + x + ", y= " + y);
    }
}
