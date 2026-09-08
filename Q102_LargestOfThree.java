// Largest of Three Numbers - Take three integers and find the largest.

import java.util.Scanner;

public class Q102_LargestOfThree
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = (a >= b && a >= c) ? a : (b >= c) ? b : c;
		System.out.print(result + " is Greater");  
		sc.close();
	}
}
