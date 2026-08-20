
//Create a program to find number of occurrences of an element in an array.
import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        int num;
        System.out.print("Enter a Number to Search Occurrence: ");
        num = scanner.nextInt();
        int noc = numberOfOccurrence(arr, num);
        System.out.println("No. of Occurrence is " + noc);
        scanner.close();
    }

    public static int numberOfOccurrence(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                count++;
            }
        }
        return count;
    }
}