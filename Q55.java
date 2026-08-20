//Create a program to calculate the absolute value of a given integer.

import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = scanner.nextInt();
        int ans = (num < 0) ? -num : num;
        System.out.format("Absolute value is %d", ans);
        scanner.close();
    }
}
