class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius is less or equal 0.");
        }

        this.radius = radius; 
        this.x = x;
        this.y = y;
    }

    double getArea() {
        return radius*radius*Math.PI;
    }

    double getX() { return x; }
    double getY() { return y; }
    double getRadius() { return radius; }
    void setX(double x) { this.x = x; }
    void setY(double y) { this.y = y; }
    void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius is less or equal 0.");
        }

        this.radius = radius; 
    }

}

class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();

        System.out.println(c.getArea());

        c.setX(5);
        c.setY(2);
        c.setRadius(10);

        System.out.println(c.getArea());

        c.setRadius(0);
    }
}
