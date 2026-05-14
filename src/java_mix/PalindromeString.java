package java_mix;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s = "madam";
		
		String Rev = "";
		
		
		for(int i=s.length()-1; i>=0; i--) {
			
			Rev = Rev + s.charAt(i);
		}
		
		if(s.equals(Rev)) {
			System.out.println("String is Palindrome " + Rev);
		}
		else {
			System.out.println("String is not Palindrome " + Rev);
		}
	
	}

}
