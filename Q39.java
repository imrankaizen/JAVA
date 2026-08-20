// Create a program that print patterns: [RHP][RRHP][LHP][RLHP]

import java.util.Scanner;

public class Q39 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rc;
		System.out.print("Enter Row x Column: ");
		rc = scanner.nextInt(); 
		System.out.println("\nRight Hand Pyramid :- \n");
		rightHandPyramid(rc);
		System.out.println("\nReverse Right Hand Pyramid :- \n");
		reverseRightHandPyramid(rc);
		System.out.println("\nLeft Hand Pyramid :- \n");
		leftHandPyramid(rc);
		System.out.println("\nReverse Left Hand Pyramid :- \n");
		reverseLeftHandPyramid(rc);
		scanner.close();
	}
	public static void rightHandPyramid(int rc) {
		for(int i = 1; i <= rc; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
	public static void reverseRightHandPyramid(int rc) {
		for(int i = 1; i <= rc; i++) {
			for(int j = rc; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
			
	}
	public static void leftHandPyramid(int rc) {
		for(int i = 1; i <= rc; i++) {
			for(int j = rc; j >= i; j--) {
				System.out.print("  ");	
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	public static void reverseLeftHandPyramid(int rc) {
		for(int i = 1; i <= rc; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("  ");	
			}
			for(int k = rc; k >= i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}
