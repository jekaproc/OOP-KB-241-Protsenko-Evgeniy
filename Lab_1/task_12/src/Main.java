import java.util.Scanner;
public class Main {

    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] result = new boolean[array.length];
        for (int i = 2; i < array.length; i++) {
            result[i] = (array[i] == array[i - 1] + array[i - 2]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть кількість елементів: ");
        int n = input.nextInt();
        while (n <= 1) {
            System.out.print("Замало(((   Повторіть спробу: ");
            n = input.nextInt();
        }

        int[] numbers = new int[n];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
            boolean[] check = getSumCheckArray(numbers);
        System.out.print("Результат: ");
        for (boolean value : check) {
                System.out.print(value + " ");
            }
        }
    }