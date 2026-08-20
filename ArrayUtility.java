// This is Utility Class Used to Input Array

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter Size of Array: ");
        size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " Element: ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] reverseArray(int[] arr) {
        int[] arr2 = arr;
        for (int i = 0, j = arr2.length - 1; i < j; i++, j--) {
            int temp = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp;
        }
        return arr2;
    }

    public static boolean arrayIsPalindromeOrNot(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[(arr.length - 1) - i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean arrayIsSortedOrNot(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1])
                return false;
        }
        return true;
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
