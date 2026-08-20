import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("For Calculating Perimeter of Rectangle Enter[ABCD]:- ");
		System.out.print("\nEnter A: ");
		a = scanner.nextInt();
		System.out.print("\nEnter B: ");
		b = scanner.nextInt();
		System.out.print("\nEnter C: ");
		c = scanner.nextInt();
		System.out.print("\nEnter D: ");
		d = scanner.nextInt();
		System.out.format("\n\nPerimeter of Rectangle Based on A = %d | B = %d | C = %d | D = %d :- ",a,b,c,d);
		System.out.print("\nPerimeter = " + (a+b+c+d));
		scanner.close();
	}
}