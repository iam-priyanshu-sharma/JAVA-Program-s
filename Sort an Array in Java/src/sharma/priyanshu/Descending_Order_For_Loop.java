package sharma.priyanshu;

public class Descending_Order_For_Loop {

    public static void main (String[] args) {
        int temp;
        int[] a = {12, 5, 56, -2, 32, 2, -26, 9, 43, 94, -78};

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if ( a[i] < a[j] ) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println ("Array elements in descending order:");

        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println (a[i]);
        }
    }
}
