import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b, h;
        System.out.println("For Calculating Area of Traingle Enter[BH]:- ");
        System.out.print("\nEnter Breadth: ");
        b = scanner.nextInt();
        System.out.print("\nEnter Height: ");
        h = scanner.nextInt();
        System.out.print("\n\nArea of Traingle :- " + (float) ((1 / 2.0) * b * h));
        scanner.close();
    }
}
