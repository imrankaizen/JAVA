// Create a program to reverse an array.

public class Q45 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        System.out.print("\nArray :- ");
        ArrayUtility.displayArray(arr);
        int[] arr2 = reverseArray(arr);
        System.out.print("\nReverse Array :- ");
        ArrayUtility.displayArray(arr2);
    }

    public static int[] reverseArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j ; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
