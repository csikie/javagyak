package point2d;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

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

    public double getX() { return x; }
    public double getY() { return y; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
}

