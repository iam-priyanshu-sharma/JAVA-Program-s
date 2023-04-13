package sharma.priyanshu;

public class While_Loop2 {

    public static void main (String[] args) {
        int Num1 = 12, Num2 = 8, Temp, GCD;

        while (Num2 != 0) {
            Temp = Num2;
            Num2 = Num1 % Num2;
            Num1 = Temp;
        }

        GCD = Num1;
        System.out.println ("GCD =  " + GCD);
    }
}
