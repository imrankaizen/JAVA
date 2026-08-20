import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Leap Year or Not :- \n");
        System.out.print("Enter Year Number: ");
        year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.format("%d Year is Leap Year", year);
        } else {
            System.out.format("%d Year is Not Leap Year", year);
        }
        scanner.close();
    }
}
