package Task_2;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(1,1);
        Point p2 = new Point(-2,-3);
        Segment s1 = new Segment(p1, p2);

        Point p3 = new Point(-2,6);
        Point p4 = new Point(0,2);
        Segment s2 = new Segment(p3, p4);

        System.out.println("Довжина відрізку: " + s1.length());
        System.out.println("Середина відрізку: " + s1.middle());
        System.out.println("Точка перетину відрізків: " + s1.intersection(s2));
    }
}