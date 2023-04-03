package mass;

import mass.util.Point;

public class Main {
    public static void main(String[] args) {
        System.out.print("N: ");
        int n = Integer.parseInt(System.console().readLine());
        Point[] elems = new Point[n];
        for (int i = 0; i < elems.length; i++) {
            System.out.print("x: ");
            double x = Double.parseDouble(System.console().readLine());
            System.out.print("y: ");
            double y = Double.parseDouble(System.console().readLine());

            elems[i] = new Point(x, y);
            System.out.println(elems[i]);
        }

        System.out.println(Point.centerOfMass(elems));
    }
}
