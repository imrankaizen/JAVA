import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("No. is Positive, Negative or Zero");
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        if (num > 0) {
            System.out.format("%d is Positive", num);
        } else if (num < 0) {
            System.out.format("%d is Negative", num);
        } else {
            System.out.print("Number is Zero");
        }
        scanner.close();
    }
}
