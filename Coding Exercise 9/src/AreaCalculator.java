public class AreaCalculator {

    public static void main (String[] args) {

        double area_of_circle = area (17.5);
        if ( area_of_circle == -1.0 ) {
            System.out.println ("Invalid Value");
        } else {
            System.out.println ("Area Of Circle = " + area_of_circle + "sq units");
        }

        double area_of_rectangle = area (15.9, 7.3);
        if ( area_of_rectangle == -1.0 ) {
            System.out.println ("Invalid Value");
        } else {
            System.out.println ("Area Of Rectangle = " + area_of_rectangle + "sq units");
        }
    }

    public static double area (double radius) {

        if ( radius < 0 ) {
            return -1.0;
        } else {
            return radius * radius * Math.PI;
        }
    }

    public static double area (double length, double width) {
        if ( length < 0 || width < 0 ) {
            return -1.0;
        } else {
            return length * width;
        }
    }
}
/*public class AreaCalculator {
    public static double area (double radius) {
        return (radius < 0) ? -1 : radius * radius * Math.PI;
    }

    public static double area (double x, double y) {
        return (x < 0 || y < 0) ? -1 : x * y;
    }
}*/
