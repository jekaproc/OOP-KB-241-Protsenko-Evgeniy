import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int[] removeLocalMaxima(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if ((i == 0 && array[i] > array[i + 1]) ||   //Перевірка елемента 0 масиву
            (i == array.length - 1 && array[i] > array[i - 1]) ||   //Перевірка останнього елемента масиву
            (i > 0 && array[i] > array[i - 1] && array[i] > array[i + 1])) {  //Перевірка елементів у масиві
                continue;
            }
            list.add(array[i]);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
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
        int[] result = removeLocalMaxima(numbers);
        System.out.print("Масив без локальних максимумів: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}