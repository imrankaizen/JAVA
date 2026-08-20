
// Create a program using do-while to implement a number guessing game.
import java.util.Scanner;

public class Q60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass1 = 999;
        do {
            System.out.printx("Enter Your Pass : ");
            int pass2 = scanner.nextInt();
            if (pass1 == pass2) {
                System.out.print("Congratulations !, you Entered a Correct Password");
                break;
            } else {
                System.out.print("You Entered a Wrong Password, Try Again");
            }
        } while (true);
    }
}
