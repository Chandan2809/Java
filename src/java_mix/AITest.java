package java_mix;

public class AITest {
	
	public static void main(String[] args) {
		
		String s = "Welcome to Java";
		
		String upper = "";
		String lower = "";
		
		for(int i=0; i<s.length(); i++){
			
			char ch = s.charAt(i);
			
			if(ch >= 65 && ch <= 90){
				
				  upper =  upper+ch;
			}
		else {
		   lower = lower+ch;
		}
		}
		System.out.println("Upper Text: "+upper);
		System.out.println("Lower Text: "+lower);
		
		System.out.print("The Vowels are: ");
		
		for(char ch= 'a'; ch<='z'; ch++) {
			
			if(ch == 'a'|| ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
				
				System.out.print(ch + " ");
			}
			
		}
		
	}

}
