//  Create a program to find the minimum of two numbers.

import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Two Number : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = (a > b) ? a : b;
        System.out.print("Greater btw " + a + " and " + b + " is " + c);
        scanner.close();
    }
}
