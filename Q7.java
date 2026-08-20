import java.util.Scanner;

public class Q7{
	public static void main(String[] args){
		Scanner scanner  = new Scanner(System.in);
		int a,b;
		System.out.print("Enter a: "); 
		a = scanner.nextInt();
		System.out.print("Enter b: ");
		b = scanner.nextInt();
		System.out.format("\nBefore Swap:- || A = %d  | B = %d ||", a, b);
		a = a+b;	// a = a^b;
		b = a-b;	// b = a^b;
		a = a-b;	// a = a^b;
		System.out.format("\nAfter Swap:- || A = %d  | B = %d ||", a, b);
		scanner.close();
	}
}