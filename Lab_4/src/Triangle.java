class Triangle extends Figure {
    private Point A, B, C;

    public Triangle (Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;

        if (area() == 0) {
            throw new IllegalArgumentException("Трикутник вироджений");
        }
    }
    @Override
    public double area() {
        return Math.abs(A.getX() * (B.getY() - C.getY()) + B.getX() * (C.getY() - A.getY()) + C.getX() * (A.getY() - B.getY())) / 2.0;
    }
    @Override
    public Point centroid() {
        double x = (A.getX() + B.getX() + C.getX()) / 3.0;
        double y = (A.getY() + B.getY() + C.getY()) / 3.0;
        return new Point(x, y);
    }
    @Override
    public String toString() {
        return "Трикутник [Точка A:" + A + ", Точка B:" + B + ", Точка C:" + C + "]";
    }
}