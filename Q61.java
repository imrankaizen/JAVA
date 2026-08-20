
// Create a program using for loop multiplication table for a number
import java.util.Scanner;

public class Q61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number to Print Table: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.format("\n%d * %d = %d", num, i, num * i);
            scanner.close();
        }
    }
}
