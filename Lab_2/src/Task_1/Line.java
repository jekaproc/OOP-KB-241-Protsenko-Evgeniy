package Task_1;

public class Line {
    private double k;
    private double b;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line second) {
        if (this.k == second.k) {
            return null;
        }
        double x = (second.b - this.b) / (this.k - second.k);
        double y = this.k * x + this.b;
        return new Point(x, y);
    }
}