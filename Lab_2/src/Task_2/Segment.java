package Task_2;

public class Segment {
    private final Point start;
    private final Point end;

    public Segment(Point start, Point end) {
        if (start.getX() == end.getX() && start.getY() == end.getY()) {
            throw new RuntimeException("Відрізка не існує!");
        }
        this.start = start;
        this.end = end;
    }
    public double length() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    public Point middle() {
        double x = (start.getX() + end.getX()) / 2;
        double y = (start.getY() + end.getY()) / 2;
        return new Point(x, y);
    }
    public Point intersection(Segment second) {
        double x1 = start.getX();
        double y1 = start.getY();
        double x2 = end.getX();
        double y2 = end.getY();

        double x3 = second.start.getX();
        double y3 = second.start.getY();
        double x4 = second.end.getX();
        double y4 = second.end.getY();
        double denominator = (x1-x2)*(y3-y4) - (y1-y2)*(x3-x4);
        if (denominator == 0) {
            return null;
        }
        double ix = ((x1*y2 - y1*x2)*(x3-x4) - (x1-x2)*(x3*y4 - y3*x4)) / denominator;
        double iy = ((x1*y2 - y1*x2)*(y3-y4) - (y1-y2)*(x3*y4 - y3*x4)) / denominator;
        return new Point(ix, iy);
    }
}