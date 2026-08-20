//  Create a program to check if a number is an Armstrong number .

import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a Number(3 Digit): ");
        num = scanner.nextInt();
        if (armstrongOrNot(num)) {
            System.out.format("%d is Armstrong Number", num);
        } else {
            System.out.format("%d is Not Armstrong Number", num);
        }
        scanner.close();
    }

    public static boolean armstrongOrNot(int num) {
        long sum = 0;
        for (int i = num; i > 0; i /= 10) {
            sum += (long) (Math.pow((i % 10), 3));
        }
        return sum == num;
    }
}