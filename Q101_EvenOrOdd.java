// 1. Even or Odd - Take an integer and check whether it is even or odd.
import java.util.Scanner;

public class Q101_EvenOrOdd
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if(num % 2 == 0) 
        {
            System.out.print(num + " is Even");
        } else 
            {
                System.out.print(num + " is Odd");
            }   
        sc.close();
    }
}