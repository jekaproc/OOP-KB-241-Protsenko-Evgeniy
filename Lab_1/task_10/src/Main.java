import java.util.Scanner;
public class Main {

    public static int max(int[] array) {
        int maxValue = array[0];
        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть кількість елементів: ");
        int n = input.nextInt();
        while (n <= 0) {
            System.out.print("Замало(((   Повторіть спробу: ");
            n = input.nextInt();
        }
            int[] numbers = new int[n];
            System.out.println("Введіть елементи масиву:");
            for (int i = 0; i < n; i++) {
                numbers[i] = input.nextInt();
            }
            System.out.print("Максимальне значення: " + max(numbers));
        }
    }