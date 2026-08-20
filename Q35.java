
// Create a program to reverse the digits of a number.
import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, rd;
        System.out.print("Enter a Number: ");
        num = scanner.nextInt();
        rd = reverseDigit(num);
        System.out.format("%d is Reverse of Digit of %d", rd, num);
        scanner.close();
    }

    public static int reverseDigit(int n) {
        int sum = 0;
        for (int i = n; i > 0; i = i / 10) {
            sum = (sum * 10) + (i % 10);
        }
        return sum;
    }
}
