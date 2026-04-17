package java_mix;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter Employee Age: ");
		int age =scanner.nextInt();
		
		
		System.out.print("Enter Employee Salary: ");
		double salary = scanner.nextDouble();
		
		
		System.out.println("The Employee Name is: " + name);
		System.out.println("The Employee Age is: " + age);
		System.out.println("The Employee Salary is: " + salary);
		
		scanner.close();
	}

}
