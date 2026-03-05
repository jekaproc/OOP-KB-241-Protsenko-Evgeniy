import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number; int i = 0; double sum = 0;
        System.out.println("Введіть числа порядково: ");

        while (true) {
            number = input.nextDouble();
            if (number == 0) {
                break;
            }
            sum += number;
            i++;
        }

        if (i == 0) {
            System.out.print("Error: Недостатньо даних!");
        } else {
            double average = sum / i;
            System.out.print("Середнє значення: " + average);
        }
    }
}