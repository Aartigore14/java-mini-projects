package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BasicOperations obj = new BasicOperations();

        while (true) {
            System.out.println("===== Calculator Menu =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result = " + obj.add(num1, num2));
                    break;

                case 2:
                    System.out.println("Result = " + obj.subtract(num1, num2));
                    break;

                case 3:
                    System.out.println("Result = " + obj.multiply(num1, num2));
                    break;

                case 4:
                    System.out.println("Result = " + obj.divide(num1, num2));
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}