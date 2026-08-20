import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, sum = 0;
        System.out.println("Sum of all Number From 1 to Given No.:- \n");
        System.out.print("Enter the Given no.: ");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.format("Sum of 1 to %d is %d", num, sum);
        scanner.close();
    }
}
