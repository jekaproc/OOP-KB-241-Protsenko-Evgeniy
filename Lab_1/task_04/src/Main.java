import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введіть число незнайомців та їх імена порядково: ");
        int count = input.nextInt(); input.nextLine();

        if (count < 0) {
            System.out.println("Неправильні вхідні дані!");
        }
        else if (count == 0) {
            System.out.println("Незнайомців не виявлено!");
        } else {
            for (int i = 0; i < count; i++) {
                String name = input.nextLine();
                System.out.println("Hello, " + name);
            }
        }
    }
}