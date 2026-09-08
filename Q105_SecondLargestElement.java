// Second Largest Element - Find the second-largest element in an array without sorting.

import java.util.Scanner;

public class Q105_SecondLargestElement
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();
        System.out.println("\nEnter Array :- \n");
        int[] arr = new int[size]; 
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter " + (i+1) + "st Element: ");
            arr[i] = sc.nextInt();
        }
        int largest = arr[0],secondLargest = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++)
        {
            if(largest < arr[i])
            {
                secondLargest = largest;
                largest = arr[i];
            } else if (secondLargest < arr[i] && largest != arr[i])
                {
                    secondLargest = arr[i];
                }
        }
        if(secondLargest != Integer.MIN_VALUE) 
        {
            System.out.print("Second Largest is " + secondLargest); 
        } else
            {
                System.out.print("Second Largest is doesn't Exist");
            }

        sc.close();
    }   
}