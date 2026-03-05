import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть загальну суму (грн): ");
        int sum = input.nextInt(); input.nextLine();
        System.out.println("Введіть кількість людей (>1): ");
        int people = input.nextInt(); input.nextLine();

        if (sum <= 0) {
            System.out.println("Загальну суму введено неправильно!   ");
        }
        else if (people <= 1) {
            System.out.println("Не вистачає друга((");
        } else {
            result = sum * 1.1 / people;
            System.out.println("Кожна людина заплатить по " + result + " гривень");
            }
        }
    }