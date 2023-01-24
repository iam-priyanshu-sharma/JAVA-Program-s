public class DiagonalStar {

    public static void main (String[] args) {

    printSquareStar (8);
    }

    public static void printSquareStar(int number){

        if(number<5){
            System.out.println("Invalid Value");
        }else {
            for(int i=0;i<number;i++){

                for(int j=0;j<number;j++){

                    if((i==0) || (i==number-1) || (j==0) || (j==number-1) || (i==j) || (j==number-1-i)){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }

                System.out.println ("");
            }
        }
    }
}
