
// Create a program to print the Fibonacci series up to a certain number.
import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("\nEnter a Number: ");
        num = scanner.nextInt();
        fibonacciSeries(num);
        scanner.close();
    }

    public static void fibonacciSeries(int n) {
        int a = 0, b = 1, i = 1, temp = 1;
        while (i <= n) {
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;
            i++;
        }
    }
}
