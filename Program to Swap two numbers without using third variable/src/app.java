import java.util.Scanner;
class Swapnumber
{
    public static void main(String[] args)
    {
        int a, b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Value in a :");
        a=s.nextInt();
        System.out.println("Enter Value in b :");
        b=s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Values in a:" +a);
        System.out.println("Values in b:" +b);
    }
}