
// Create a program using do-while to find password checker until a valid password is entered.
import java.util.Scanner;

public class Q59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass1, pass = "IMRAN";
        do {
            System.out.print("Enter a Valid Password: ");
            pass1 = scanner.nextLine();
            if (pass.equals(pass1)) {
                System.out.print("Congratulations !, you Entered a Correct Password");
                break;
            } else {
                System.out.print("You Entered a Wrong Password, Try Again");
            }
        } while (true);
        scanner.close();
    }
}
