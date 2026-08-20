import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, ans;
        System.out.println("Showcasing Left Shift (<<)) :- \n");
        System.out.print("Enter First Number: ");
        a = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        b = scanner.nextInt();
        ans = a << b;
        System.out.println("Result of " + a + " & " + b + " is " + ans);
        scanner.close();
    }
}
