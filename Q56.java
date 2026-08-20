// Create a program to Based on a student's score, categorize as "High", "Moderate", or "Low" using the ternary operator 
// (e.g., High for scores > 80, Moderate for 50-80, Low for < 50).

import java.util.Scanner;

public class Q56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int score = scanner.nextInt();
        String result = ((score > 50) ? ((score > 80) ? "High" : "Moderate") : "Low");
        System.err.print("Result = " + result);
        scanner.close();
    }
}
