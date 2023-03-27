

class Circle
{
    private double x;
    private double y;
    private double radius;

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
}

class CircleMain
{
    public static void main(String[] args)
    {
        Circle c = new Circle(5, 2, 10);
        System.out.println("area = " + c.getArea());
    }
}
