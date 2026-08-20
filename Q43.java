// Create a program to check if the given array is sorted.
public class Q43 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        if (arrayIsSortedOrNot(arr)) {
            System.out.print("\nArray is Sorted :- ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.print("\nArray is Not Sorted :- ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static boolean arrayIsSortedOrNot(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1])
                return false;
        }
        return true;
    }
}
