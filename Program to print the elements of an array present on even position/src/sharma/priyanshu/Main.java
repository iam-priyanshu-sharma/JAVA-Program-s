package sharma.priyanshu;

public class Main {

    public static void main (String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println ("Elements of given array present on even position: ");

        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println (arr[i]);
        }
    }
}
