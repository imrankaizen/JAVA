import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float p, t, r;
        double si;
        System.out.println("Calculating Simple Intrest Enter[PTR]");
        System.out.print("Enter Principle Amount: ");
        p = scanner.nextFloat();
        System.out.print("Enter Time : ");
        t = scanner.nextFloat();
        System.out.print("Enter Rate: ");
        r = scanner.nextFloat();
        si = (p * t * r) / 100.0;
        System.out.format(
                "If || Principle Amount is %3f | Rate is %3f | Time is %3f ||\nThen || SIMPLE INTREST is %4f ||", p, t,
                r, si);
        scanner.close();
    }
}