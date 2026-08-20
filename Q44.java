
// Create a program to return a new array deleting a specific element.
import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        int[] arr2, arr = ArrayUtility.inputArray();
        Scanner scanner = new Scanner(System.in);
        int num, noc;
        System.out.print("Enter the Element you want to Delete in Array: ");
        num = scanner.nextInt();
        noc = noOfOccurrence(arr, num);
        System.out.print("\nNumber of Occurrence is " + noc);
        arr2 = newArrayAfterDeletingThatElement(arr, num, noc);
        System.out.print("\nNew Array After Deleting That Element :- ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        scanner.close();
    }

    public static int noOfOccurrence(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                count++;
            }
        }
        return count;
    }

    public static int[] newArrayAfterDeletingThatElement(int[] arr, int num, int noc) {
        int[] arr2 = new int[arr.length - noc];
        for (int j = 0, i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                arr2[j] = arr[i];
                j++;
            }
        }
        return arr2;
    }

}
