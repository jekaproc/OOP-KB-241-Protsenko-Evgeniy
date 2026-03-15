package Task_1;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1, 5);
        Line line2 = new Line(-2, 2);
        System.out.println("Координати перетину прямих: " + line1.intersection(line2));
    }
}