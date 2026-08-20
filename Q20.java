import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Age Group based on Age :- ");
        System.out.print("Enter Your Age: ");
        age = scanner.nextInt();
        if (age >= 60) {
            System.out.format("%d = SENIOR", age);
        } else if (age >= 20) {
            System.out.format("%d = ADULT", age);
        } else if (age >= 13) {
            System.out.format("%d = TEEN", age);
        } else {
            System.out.format("%d = CHILD", age);
        }
        scanner.close();
    }
}
