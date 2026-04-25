class Quadrilateral extends Figure {
    private Point A, B, C, D;

    public Quadrilateral (Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;

        if (area() == 0) {
            throw new IllegalArgumentException("Чотирикутник вироджений");
        }
    }
    @Override
    public double area() {
        Triangle t1 = new Triangle(A, B, C);
        Triangle t2 = new Triangle(A, C, D);
        return t1.area() + t2.area();
    }
    @Override
    public Point centroid() {
        Triangle t1 = new Triangle(A, B, C);
        Triangle t2 = new Triangle(A, C, D);

        double S1 = t1.area();
        double S2 = t2.area();
        Point R1 = t1.centroid();
        Point R2 = t2.centroid();

        double x = (S1 * R1.getX() + S2 * R2.getX()) / (S1 + S2);
        double y = (S1 * R1.getY() + S2 * R2.getY()) / (S1 + S2);
        return new Point(x, y);
    }
    @Override
    public String toString() {
        return "Чотирикутник [Точка A:" + A + ", Точка B:" + B + ", Точка C:" + C + ", Точка D:" + D + "]";
    }
}