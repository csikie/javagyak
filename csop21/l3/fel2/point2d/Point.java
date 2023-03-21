package point2d;

public class Point {
    public double x;
    public double y;

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void mirror(Point that) { 
        x += 2*(that.x - x);
        y += 2*(that.y - y);
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(that.x-x, 2) + Math.pow(that.y-y, 2));
    }
}
