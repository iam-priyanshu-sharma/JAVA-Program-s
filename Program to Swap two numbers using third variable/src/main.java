import java.util.*;
class Swapnumber
{
    public static void main(String[] args)
    {
        int a, b, c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Value in a :");
        a=s.nextInt();
        System.out.println("Enter Value in b :");
        b=s.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("Values in a:" +a);
        System.out.println("Values in b:" +b);
    }
}