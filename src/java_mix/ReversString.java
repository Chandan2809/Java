package java_mix;

public class ReversString {
	
	public static void main(String[] args) {
		
		String s = "Selenium";
		
		String Rev = "";
		
		for(int i= s.length()-1; i>=0; i--) {
			
			Rev = Rev + s.charAt(i);
			
		}
	   System.out.println("Reverse String is: " + Rev);
	}

}
