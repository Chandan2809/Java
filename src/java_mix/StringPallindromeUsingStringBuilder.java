package java_mix;

public class StringPallindromeUsingStringBuilder {

	public static void main(String[] args) {
		String str = "madamj";
		
		String Temp = str;
		
		String rev = new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev)) {
			
			System.out.print(rev + " It is a pallindrome string");
		}
		else {
			System.out.print(rev + " It is not a pallindrome string");
		}
	}

}
