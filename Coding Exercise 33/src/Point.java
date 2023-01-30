public class Point {

    private int x;
    private int y;

    public Point () {
    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX () {
        return x;
    }

    public void setX (int x) {
        this.x = x;
    }

    public int getY () {
        return y;
    }

    public void setY (int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt ((getX ()-0.0)*(getX ())+(getY ())*(getY ()));
    }

    public double distance(int x, int y){

        return Math.sqrt( (getX() - x) * ( getX() - x)  + (getY() - y ) * (getY() - y));
    }

    public double distance(Point xy){

        return Math.sqrt( (getX() - xy.getX()) * ( getX() - xy.getX())  + (getY() - xy.getY() ) * (getY() - xy.getY()));
    }
}
