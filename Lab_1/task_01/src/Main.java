import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введіть ваше ім'я: ");
        String name = input.nextLine();
        System.out.print("Привіт, " + name + "!");
    }
}