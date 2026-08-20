
// Q32. Create a program to find the Least Common Multiple (LCM) of two numbers.
import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, lcm;
        System.out.println("Calculate LCM :- \n");
        System.out.print("Enter First Number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = scanner.nextInt();
        lcm = calculateLCM(num1, num2);
        System.out.format("LCM of %d & %d is %d", num1, num2, lcm);
        scanner.close();
    }

    public static int calculateLCM(int a, int b) {
        for (int i = 2; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
        }
        return 0;
    }

}
