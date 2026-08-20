import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("No. is Positive, Negative or Zero");
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.format("%d is EVEN", num);
        } else {
            System.out.format("%d is ODD", num);
        }
        scanner.close();
    }
}
