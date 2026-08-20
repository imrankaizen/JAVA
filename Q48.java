import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Row of 2D Array: ");
        int r = scanner.nextInt();
        System.out.print("Enter Column of 2D Array: ");
        int c = scanner.nextInt();
        System.out.println("Enter Your 2D Array:- ");
        int[][] arr = new int[r][c];
        input2DArray(arr, r, c, scanner);
        System.out.println("Your 2D Array is :- ");
        display2DArray(arr, r, c);
        System.out.print("Enter a Number to Search in 2D Array: ");
        int num = scanner.nextInt();
        searchThatElement(arr, r, c, num);
        scanner.close();
    }

    public static void input2DArray(int[][] arr, int r, int c, Scanner scanner) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.format("Enter [%d][%d] Element :", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static void display2DArray(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void searchThatElement(int[][] arr, int r, int c, int num) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == num) {
                    System.out.format("Element Found at [%d][%d] Position", i, j);
                }
            }
        }
    }
}