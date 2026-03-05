import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int day = 0; int p = 0; int perc = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Равлик думає...");
        System.out.print("Введіть число футів рухаючись вгору: ");
        int up = input.nextInt(); input.nextLine();
        System.out.print("Введіть число футів рухаючись вниз: ");
        int down = input.nextInt(); input.nextLine();
        System.out.print("Введіть висоту дерева: ");
        int height = input.nextInt(); input.nextLine();

        if (up < 0 | down < 0 | height <= 0) {
            System.out.print("Неправильні вхідні дані!");
        } else {
            if (up >= height) {
                System.out.println("Равлик проповз " + height + " футів за один день");
            } else if (up - down <= 0) {
                System.out.println("Равлику буде важко!");
            } else {
                while (p < height) {
                    day = day + 1;
                    p = p + up - down;
                    perc = 100 * p / height;
                    System.out.println("День: " + day + ". Равлик проповз " + p + " футів (" + perc + "%)");
                }
                System.out.println("Равлик проповз " + height + " футів за " + day + " днів");
            }
            }
    }
        }