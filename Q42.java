//Create a program to find the maximum and minimum element in an array.

public class Q42 {
    public static void main(String[] args) {
        int max, min;
        int[] arr = ArrayUtility.inputArray();
        max = maximum(arr);
        min = minimum(arr);
        System.out.format("\nMAXIMUM = %d | MINIMUM = %d", max, min);
    }

    public static int maximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
