// 

import java.util.Scanner;
public class Q106_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt(),tnum = num,rnum=0; 
        while(tnum != 0)
        {
            rnum = (rnum*10) + (tnum % 10);  
            tnum /= 10;
        }
        if(num == rnum)
        {
            System.out.print(num + " is Palindrome");
        } else 
            {
                System.out.print(num + " is Not Palindrome");
            }
        sc.close();
    }
}
