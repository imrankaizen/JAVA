import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, f = 1;
        System.out.println("Factorial of a Given Number :- \n");
        System.out.print("Enter a Number: ");
        num = scanner.nextInt();
        for (int i = 2; i <= num; i++) {
            f *= i;
        }
        System.out.format("Factorial of %d is %d", num, f);
        scanner.close();
    }
}
