class PointMain {
    public static void main(String[] args) {
        Point p = new Point();
        Point p2 = new Point();
        p.x = 1;
        p.y = 1;

        System.out.println("(" + p.x + ", " + p.y + ")");

        p.move(1,1);
        System.out.println("(" + p.x + ", " + p.y + ")");

        double d = p.distance(p2);
        System.out.println(d);

        p.mirror(p2);
        System.out.println("(" + p.x + ", " + p.y + ")");
    }
}
