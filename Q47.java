// Create a program to merge two sorted arrays.
public class Q47 {
    public static void main(String[] args) {
        System.out.println("\nEnter Your First Array :- ");
        int[] arr1 = ArrayUtility.inputArray();
        System.out.println("\nEnter Your Second Array :- ");
        int[] arr2 = ArrayUtility.inputArray();
        System.out.print("\nYour First Array :- ");
        ArrayUtility.displayArray(arr1);
        System.out.print("\nYour Second Array :- ");
        ArrayUtility.displayArray(arr2);
        int[] ma = mergeTwoArray(arr1, arr2);
        if (!(ArrayUtility.arrayIsSortedOrNot(ma))) {
            ma = sortArray(ma);
        }
        System.out.print("\nYour Merged Array is :- ");
        ArrayUtility.displayArray(ma);
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

    // it just merge without sort

    // public static int[] mergeTwoArray(int[] arr1, int[] arr2) {
    // int[] arr3 = new int[arr1.length + arr2.length];
    // for (int j = 0, k = 0, i = 0; i < arr1.length || j < arr2.length;) {
    // if (i < arr1.length) {
    // arr3[k++] = arr1[i++];
    // } else {
    // arr3[k++] = arr2[j++];
    // }
    // }
    // return arr3;
    // }

    public static int[] mergeTwoArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
            while (i < arr1.length) {
                arr3[k++] = arr1[i++];
            }

            while (j < arr2.length) {
                arr3[k++] = arr2[j++];
            }
        }
        return arr3;
    }

}
