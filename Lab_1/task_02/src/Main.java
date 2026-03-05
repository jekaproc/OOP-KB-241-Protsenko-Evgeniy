import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введіть секунди для переводу: ");
        int inputseconds = input.nextInt();

        int iseconds = inputseconds % 86400;

        int hours = iseconds / 3600;
        int minutes = (iseconds % 3600) / 60;
        int seconds = iseconds % 60;

        System.out.printf("%d:%02d:%02d", hours, minutes, seconds);
    }
}