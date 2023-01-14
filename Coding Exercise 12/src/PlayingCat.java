public class PlayingCat {

    public static void main (String[] args) {

    boolean return_value=isCatPlaying (true,46);

    System.out.println(return_value);
    }

    public static boolean isCatPlaying(boolean summer,int temperature){

        if(summer && temperature>=25 && temperature<=45){
            return true;
        } else if (!summer && temperature>=25 && temperature<=35) {
            return true;
        }else {
            return false;
        }
    }
}

//using ternary operator

/*public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }
}*/