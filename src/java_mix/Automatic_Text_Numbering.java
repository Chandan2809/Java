package java_mix;

import java.util.Scanner;

public class Automatic_Text_Numbering {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int lineNumber = 1;
		
		System.out.println("Enter the text:");
		
		while(sc.hasNextLine()) {
		
		String text = sc.nextLine();	
		
		// stop if user enters empty line
        if (text.isEmpty()) {
            break;
        }
		
		
			System.out.println(lineNumber + " " + text);
			
			lineNumber++;
			//text = sc.nextLine();
			
		}
		sc.close();
	}
	

}
