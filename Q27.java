import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Showcasing Right Shift (>>)) :- \n");
        System.out.print("Enter First Number: ");
        num = scanner.nextInt();
        if ((num & 1) == 0) {
            System.out.format("%d is EVEN", num);
        } else {
            System.out.format("%d is ODD", num);
        }
        scanner.close();
    }
}
