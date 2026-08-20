import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fahrenheit to Celsius :- ");
        int f, c;
        System.out.print("Enter Fahrenheit: ");
        f = scanner.nextInt();
        c = (int) ((f - 32) * 5 / 9.0);
        System.out.format("IF Fahrenheit is %d then, \nCelsius is %d", f, c);
        scanner.close();
    }
}
