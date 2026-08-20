import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,ans;
        System.out.println("Showcasing Bitwise AND(&) :- \n");
        System.out.print("Enter a Number: ");
        a = scanner.nextInt();
        ans = ~ a;
        System.out.println("Result of ~ " + a + " is " + ans);
        scanner.close();
    }
}
