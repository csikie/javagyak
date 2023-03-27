package pointm;

import point2d.Point;

class PointMain {
    public static void main(String[] args) {
        Point p = new Point(0,0);
        // point2d.Point p = new point2d.Point();
        Point p2 = new Point(1,1);

        System.out.println("(" + p.getX() + ", " + p.getY() + ")");

        p.move(1,1);
        System.out.println("(" + p.getX() + ", " + p.getY() + ")");

        double d = p.distance(p2);
        System.out.println(d);

        p.mirror(p2);
        System.out.println("(" + p.getX() + ", " + p.getY() + ")");
    }
}
