
// Create a program to do sum and average of all elements in a 2-D array.
import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Rows in 2D Array: ");
        int r = scanner.nextInt();
        System.out.print("Enter Number of Column in 2D Array: ");
        int c = scanner.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter Your 2D Array:- ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.format("Enter [%d][%d] Element: ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Your 2D Array:- ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int soe = sumOfAllElement(arr, r, c);
        float aoe = averageOfAllElement(soe, arr);
        System.out.format("\nSum of All Element is %d", soe);
        System.out.format("\nAverage of All Element is %f", aoe);
        scanner.close();
    }

    public static int sumOfAllElement(int[][] arr, int r, int c) {
        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static float averageOfAllElement(int soe, int[][] arr) {
        int avg = soe / arr.length;
        return avg;
    }
}
