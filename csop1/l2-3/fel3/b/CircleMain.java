

class Circle
{
    private double x = 0;
    private double y = 0;
    private double radius = 1;

    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return radius; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    public void setRadius(double radius)
    {
        if (radius <= 0)
        {
            throw new IllegalArgumentException("Circle setRadius(): radius is negative");
        }
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }
}

class CircleMain
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        System.out.println("area = " + c.getArea());

        c.setX(5);
        c.setY(2);
        c.setRadius(10);
        System.out.println("area = " + c.getArea());
    }
}
