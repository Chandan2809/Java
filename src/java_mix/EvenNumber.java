package java_mix;

import java.util.Scanner;

public class EvenNumber {
	
	public static void main(String[] args) {
	      System.out.println("Java Even number Program");

	      Scanner sr = new Scanner(System.in);

	      System.out.print("Enter the number : ");

	      int num = sr.nextInt();

	     if(num % 2 == 0){

	        System.out.print(num + " Even number");

	     }else{
	      System.out.print(num + " Not even number");
	     }


	    }
	}


