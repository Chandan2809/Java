package java_mix;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = scanner.nextInt();
		int temp = num, sum=0;
		
		while(num > 0) {
			int digit = num % 10;
			
			sum += digit * digit * digit;
			
			num /= 10; 
		}
		
		if(sum == temp) {
			System.out.println(temp + " is a Armstrong Number");
		}
		else {
			System.out.println(temp + " is not a Armstrong Number");
		}
			
			scanner.close();
	}

}
