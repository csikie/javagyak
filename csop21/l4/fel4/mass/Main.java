package mass;

import mass.util.Point;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = Integer.parseInt(System.console().readLine());
        Point[] points = new Point[3];
        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x: ");
            double x = Double.parseDouble(System.console().readLine());
            System.out.print("Enter y: ");
            double y = Double.parseDouble(System.console().readLine());

            points[i] = new Point(x, y);
            System.out.println(points[i]);
        }

        System.out.println(Point.calcMass(points));
    }
}
