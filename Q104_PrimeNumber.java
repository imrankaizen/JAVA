// Prime Number - Check whether a given number is prime.

import java.util.Scanner;

public class Q104_PrimeNumber
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a Numeber: ");
		int num = sc.nextInt();
		boolean flag = true;
		for(int i = 2; i * i <= num; i++)
		{
			if(num < 1) 
			{
				System.out.print("Number is 0 or Negative");
			}
			else if(num % i == 0) 
			{
				flag = false;
				break;
			}
		}
		if(flag == true)
		{
			System.out.print(num + " is Prime Number");
		} else 
			{
				System.out.print(num + " is Not Prime Number");
			}
		sc.close();
	}
}
