class Point {
    double x;
    double y;

    void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    void mirror(Point that) { 
        x += 2*(that.x - x);
        y += 2*(that.y - y);
    }

    double distance(Point that) {
        return Math.sqrt(Math.pow(that.x-x, 2) + Math.pow(that.y-y, 2));
    }
}
