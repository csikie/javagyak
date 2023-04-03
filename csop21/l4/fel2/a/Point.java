public class Point {
    private double x, y;
    private int id;
    private static int _id = 1;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
        this.id = _id++;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public String toString() {
        return id + ": (" + x + "," + y + ")";
    }

    public static Point calcMass(Point[] points) {
        double sumX = 0;
        double sumY = 0;
        
        for (int i = 0; i < points.length; i++) {
            sumX =+ points[i].getX();
            sumY =+ points[i].getY();
        }

        return new Point(sumX / points.length, sumY / points.length);
    }
}

