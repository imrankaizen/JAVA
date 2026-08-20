import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Greater of 3 Number :- \n");
        System.out.print("Enter Three Numbers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a >= b && a >= c) {
            System.out.format("%d is Greater", a);
        } else if (b >= a && b >= c) {
            System.out.format("%d is Greater", b);
        } else {
            System.out.format("%d is Greater", c);
        }
        scanner.close();
    }
}