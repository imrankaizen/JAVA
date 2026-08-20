
//Greatest Common Divisor of two Number
import java.util.Scanner;

public class Q33 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int num1, num2, gcd;
                System.out.print("\nEnter First Number: ");
                num1 = scanner.nextInt();
                System.out.print("\nEnter Secong Number: ");
                num2 = scanner.nextInt();
                gcd = greatestCommonDivisor(num1, num2);
                System.out.format("Greatest Common Divisor of %d and %d is %d", num1, num2, gcd);
                scanner.close();
        }

        public static int greatestCommonDivisor(int a, int b) {
                int least = (a > b) ? a : b;
                for (int i = 2; i <= least; i++) {
                        if (a % i == 0 && b % i == 0) {
                                return i;
                        }
                }
                return 1;
        }

}
