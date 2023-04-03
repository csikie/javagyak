public class Point
{
    private double x, y;
    private int id;
    private static int counter = 1;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
        this.id = counter++;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public String toString() {
        return id + ": (" + x + "," + y + ")";
    }

    public static Point centerOfMass(Point[] elems) {
        double sumX = 0;
        double sumY = 0;

        for (int i = 0; i < elems.length; i++) {
            sumX += elems[i].getX();
            sumY += elems[i].getY();
        }

        return new Point(sumX / elems.length, sumY / elems.length);
    }
}

