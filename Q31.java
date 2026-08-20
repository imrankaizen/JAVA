
// Q31. Create a program that computes the sum of the digits of an integer.
import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, sum = 0;
        System.out.println("Calculate Sum of all Digit of an Integer :- \n");
        System.out.print("Enter a Number(Integer): ");
        num = scanner.nextInt();
        for (int rem, i = num; i > 0; i = i / 10) {
            rem = i % 10;
            sum = sum + rem;
        }
        System.out.format("Sum of all Digit of %d is %d", num, sum);
        scanner.close();
    }
}