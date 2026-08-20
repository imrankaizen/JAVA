
// Given Number is Prime or Not
import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("\nEnter a Number: ");
        num = scanner.nextInt();
        if (primeOrNot(num)) {
            System.out.format("%d is Prime", num);
        } else {
            System.out.format("%d is Not Prime", num);
        }
        scanner.close();
    }

    public static boolean primeOrNot(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
