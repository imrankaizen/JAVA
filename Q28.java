import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Table of a Given Number :- \n");
        System.out.print("Enter a Number: ");
        num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d * %d = %d\n", num, i, num * i);
        }
        scanner.close();
    }
}
