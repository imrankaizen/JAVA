// Create a program to check is the array is palindrome or not.
public class Q46 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        if (arrayIsPalindromeOrNot(arr)) {
            System.out.print("\nArray is Palindrome:- ");
            ArrayUtility.displayArray(arr);
        } else {
            System.out.print("\nArray is Not Palindrome :- ");
            ArrayUtility.displayArray(arr);
        }
    }

    public static boolean arrayIsPalindromeOrNot(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[(arr.length - 1) - i]) {
                return false;
            }
        }
        return true;
    }
}