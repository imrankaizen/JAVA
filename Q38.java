
// Create a program to verify if a number is a palindrome.
import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a Number: ");
        num = scanner.nextInt();
        if (palindromeOrNot(num)) {
            System.out.format("%d is Palindrome", num);
        } else {
            System.out.format("%d is NOT Palindrome", num);
        }
        scanner.close();
    }

    public static boolean palindromeOrNot(int num) {
        long sum = 0;
        for (int i = num; i > 0; i /= 10) {
            sum = (sum * 10) + i % 10;
        }
        System.out.println(sum);
        return sum == num;
    }
}