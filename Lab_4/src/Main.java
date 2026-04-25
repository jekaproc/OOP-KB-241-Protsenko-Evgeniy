public class Main {
    public static void main(String[] args) {

        Triangle t = new Triangle(new Point(0, 0), new Point(4, 0), new Point(0, 3));
        System.out.println("\n" + t);
        System.out.println("Площа: " + t.area());
        System.out.println("Центроїд: " + t.centroid());

        Circle c = new Circle(new Point(0, 0), 5);
        System.out.println("\n" + c);
        System.out.println("Площа: " + c.area());
        System.out.println("Центроїд: " + c.centroid());

        Quadrilateral q = new Quadrilateral(new Point(0, 0), new Point(4, 0), new Point(4, 3), new Point(0, 3));
        System.out.println("\n" + q);
        System.out.println("Площа: " + q.area());
        System.out.println("Центроїд: " + q.centroid());

        System.out.println("\n         ↓ Вироджені фігури ↓");

        try {
        Triangle t_wrong = new Triangle(new Point(0, 0), new Point(2, 3), new Point(4, 6)); // Точки утворюють лінію
        System.out.println("\n" + t_wrong);
        System.out.println("Площа: " + t_wrong.area());
        System.out.println("Центроїд: " + t_wrong.centroid());
        } catch (Exception e) {
            System.out.println("\nПроблема з трикутником: " + e.getMessage());
        }

        try {
        Circle c_wrong = new Circle(new Point(0, 0), -1); // Некоректний радіус
        System.out.println("\n" + c_wrong);
        System.out.println("Площа: " + c_wrong.area());
        System.out.println("Центроїд: " + c_wrong.centroid());
        } catch (Exception e) {
            System.out.println("\nПроблема з колом: " + e.getMessage());
        }

        try {
        Quadrilateral q_wrong = new Quadrilateral(new Point(0, 1), new Point(0, 2), new Point(0, 3), new Point(0, 4));
        System.out.println("\n" + q_wrong); // Всі точки фігури на вісі Y
        System.out.println("Площа: " + q_wrong.area());
        System.out.println("Центроїд: " + q_wrong.centroid());
        } catch (Exception e) {
            System.out.println("\nПроблема з чотирикутником: " + e.getMessage());
        }
    }
}