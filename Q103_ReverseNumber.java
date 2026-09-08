// Reverse a Number - Take an integer and print its reverse.

import java.util.Scanner;

public class Q103_ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt(),tnum = num,rnum=0;
		while(tnum != 0)
		{
			rnum = (rnum * 10) + (tnum % 10);
			tnum = tnum/10; 
		}
		System.out.print("Reverse of " + num + " is " + rnum);		
		sc.close();
	}
}
