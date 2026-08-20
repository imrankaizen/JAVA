// Create a program to find if the given number is even or odd.

import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = scanner.nextInt();
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.print(a + " is " + result);
        scanner.close();
    }
}
