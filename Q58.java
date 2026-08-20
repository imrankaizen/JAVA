
//  Create a program to create a simple calculator that uses a switch statement to perform basic arithmetic operations like addition, subtraction, multiplication, and division.
import java.util.Scanner;

public class Q58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Two Number : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.print("Enter the Operation Symbol (+ - * / %) : ");
        String s = scanner.next();
        switch (s) {
            case "+":
                System.out.print("Addition = " + (num1 + num2));
                break;
            case "-":
                System.out.print("Subtraction = " + (num1 - num2));
                break;
            case "*":
                System.out.print("Multiplication = " + (num1 * num2));
                break;
            case "/":
                System.out.print("Division = " + (num1 / num2));
                break;
            case "%":
                System.out.print("Remainder = " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid input");
        }
        scanner.close();
    }
}
