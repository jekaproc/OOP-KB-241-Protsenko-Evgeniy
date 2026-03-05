import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    static final int PASSWORD = 1234;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the secret password: ");

        try {
            int userInput = input.nextInt();
            if (userInput == PASSWORD) {
                System.out.print("Hello, Agent");
            } else {
                System.out.print("Access denied");
            }
        } catch (InputMismatchException e) {
            System.out.println("Access denied, use numbers only!");
        }
    }
}