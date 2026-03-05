import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void cycleSwap(int[] array) {
        int last_elem = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last_elem;
    }

    public static void cycleSwap(int[] array, int shift) {
        int[] shift_arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            shift_arr[(i + shift) % array.length] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = shift_arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   //Створення масиву
        System.out.print("Введіть кількість елементів: ");
        int n = input.nextInt();
        while (n <= 1) {
            System.out.print("!! Замало. Повторіть спробу: ");
            n = input.nextInt();
        }
        int[] numbers = new int[n];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        while (true) {
            System.out.print("\nПоточний масив: " + Arrays.toString(numbers) + "\nОберіть дію (1 чи 2), або введіть 3 для виходу: ");
            int choice = input.nextInt();
            if (choice == 1) {   // > 1
                cycleSwap(numbers);
                System.out.print("++ Вміст масиву пересунуто вправо на 1 елемент ++\n");
                Arrays.toString(numbers);

            } else if (choice == 2)   { // > shift
                System.out.print("Введіть кількість символів для переходу вправо: ");
                int k = input.nextInt();
                while (k > n || k <= 0) {
                    System.out.print("\n!! Значення не повинно перевищувати довжину масиву або <= 0. Повторіть спробу: ");
                    k = input.nextInt();
                }
                cycleSwap(numbers, k);
                System.out.print("++ Вміст масиву пересунуто вправо на " + k + " елементів ++\n");
                Arrays.toString(numbers);

            } else if (choice == 3) {   // exit
                System.out.print("Вихід із системи... ");
                break;
            }
        }
        }
    }