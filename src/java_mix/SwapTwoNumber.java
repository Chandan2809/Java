package java_mix;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int A = sc.nextInt();
		System.out.println("Enter the second number:");
		int B = sc.nextInt();
		
		System.out.println("Before swapping: A = " + A + ", B = " + B);
		
		// Swapping using a temporary variable	
		int temp = A;
		A = B;
		B = temp;
		System.out.println("After swapping: A = " + A + ", B = " + B);
		

	}

}
