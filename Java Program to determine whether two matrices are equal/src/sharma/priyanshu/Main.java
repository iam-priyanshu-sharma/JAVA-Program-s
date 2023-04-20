package sharma.priyanshu;

public class Main {

    public static void main (String[] args) {
        int row1, col1, row2, col2;
        boolean flag = true;
        int[][] a = {
                {1, 2, 3},
                {8, 4, 6},
                {4, 5, 7}
        };
        int[][] b = {
                {1, 2, 3},
                {8, 4, 6},
                {4, 5, 7}
        };
        row1 = a.length;
        col1 = a[0].length;
        row2 = b.length;
        col2 = b[0].length;

        if ( row1 != row2 || col1 != col2 ) {
            System.out.println ("Matrices are not equal");
        } else {

            for (int i = 0; i < row1; i++) {

                for (int j = 0; j < col1; j++) {

                    if ( a[i][j] != b[i][j] ) {
                        flag = false;
                        break;
                    }
                }
            }

            if ( flag ) {
                System.out.println ("Matrices are equal");
            } else {
                System.out.println ("Matrices are not equal");
            }
        }
    }
}
