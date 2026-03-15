package Task_3;

public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        if (a.getX() == b.getX() && a.getY() == b.getY() ||   // a=b
                b.getX() == c.getX() && b.getY() == c.getY() ||   // b=c
                a.getX() == c.getX() && a.getY() == c.getY()) {   // a=c
            throw new RuntimeException("Трикутника не існує!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double x1 = a.getX() * (b.getY() - c.getY());
        double x2 = b.getX() * (c.getY() - a.getY());
        double x3 = c.getX() * (a.getY() - b.getY());
        double square;
        square = 0.5 * Math.abs(x1 +x2 + x3);
        if (square <= 0) {
            throw new RuntimeException("Трикутника не існує!");
        }
        return square;
    }
    public Point centroid() {
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(x, y);
    }
}