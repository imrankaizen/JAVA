import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks;
        System.out.println("Grades on Marks :- ");
        System.out.print("Enter Your Marks[0 to 100]% : ");
        marks = scanner.nextInt();
        if (marks >= 90) {
            System.out.format("Marks is %d , You Got Grade 'A'", marks);
        } else if (marks >= 75) {
            System.out.format("Marks is %d , You Got Grade 'B'", marks);
        } else if (marks >= 60) {
            System.out.format("Marks is %d , You Got Grade 'C'", marks);
        } else if (marks >= 30) {
            System.out.format("Marks is %d , You Got Grade 'D'", marks);
        } else {
            System.out.format("Marks is %d , You Got Grade 'F'", marks);
        }
        scanner.close();
    }
}