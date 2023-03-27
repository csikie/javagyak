package circle;

import circle.utils.Point;

class CircleMain
{
    public static void main(String[] args)
    {
        Circle c = new Circle(5, 2, 10);
        System.out.println("area = " + c.getArea());
        Point center = c.getCenter();
        System.out.println("center x = " + center.getX() + ", y = " + center.getY());
    }
}


