class Circle extends Figure {
    private Point O;
    private double radius;

    public Circle(Point O, double radius) {
        this.O = O;
        this.radius = radius;

        if (radius <= 0) {
            throw new IllegalArgumentException("Коло вироджене");
        }
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public Point centroid(){
        return O;
    }
    @Override
    public String toString() {
        return "Коло [Центр: " + O + ", Радіус: " + radius + "]";
    }
}