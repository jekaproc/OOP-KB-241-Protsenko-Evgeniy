import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть числа порядково: ");
        int number = input.nextInt();
        int max = number; int i = 0;

        while (number != 0) {
            number = input.nextInt();
            i++;
            if (number > max) {
                max = number;
            }
        }
        if (i == 0) {
            System.out.print("Error: Недостатньо даних!");
        } else {
            System.out.print("Максимальне значення: " + max);
        }
        input.close();
    }
}