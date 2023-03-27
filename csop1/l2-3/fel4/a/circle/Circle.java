package circle;

import circle.utils.Point;

public class Circle
{
    private double x = 0;
    private double y = 0;
    private double radius = 1;

    public Circle(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        if (radius <= 0)
        {
            throw new IllegalArgumentException("Circle setRadius(): radius is negative");
        }
        this.radius = radius;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return radius; }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    public Point getCenter()
    {
        Point center = new Point();
        center.setX(x);
        center.setY(y);
        return center;
    }
}


