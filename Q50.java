
// Create a program to find the sum of two diagonal elements.
import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of RowsXColumn in 2D Array: ");
        int r = scanner.nextInt();
        int[][] arr = new int[r][r];
        System.out.println("Enter Your 2D Array:- ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.format("Enter [%d][%d] Element: ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Your 2D Array:- ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int sum = sumOfDiagonalElement(arr, r);
        System.out.format("Sum of Two Diagonal Element is %d", sum);
        scanner.close();
    }

    public static int sumOfDiagonalElement(int[][] arr, int r) {
        int solde = sumOfLeftDiagonalElement(arr, r);
        int sorde = sumOfRightDiagonalElement(arr, r);
        int sum = solde + sorde;
        if (r % 2 != 0) {
            sum -= arr[arr.length / 2][arr.length / 2];
        }
        return sum;
    }

    public static int sumOfLeftDiagonalElement(int[][] arr, int r) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }

    public static int sumOfRightDiagonalElement(int[][] arr, int r) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int col = arr.length - 1 - i;
            sum += arr[i][col];
        }
        return sum;
    }
}
