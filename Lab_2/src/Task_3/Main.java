package Task_3;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(-2,-3);
        Point p3 = new Point(2,-3);
        Triangle t = new Triangle(p1, p2, p3);

        System.out.println("Площа трикутника: " + t.area());
        System.out.println("Центроїд трикутника: " + t.centroid());
    }
}