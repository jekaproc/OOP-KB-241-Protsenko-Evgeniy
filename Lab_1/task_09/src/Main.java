import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть a b c для формули знаходження дискримінанта:");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.print("Два корені: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.print("Один корінь: x = " + x);
        } else {
            System.out.print("Немає коренів!");
        }
    }
}