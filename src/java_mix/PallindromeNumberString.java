package java_mix;

public class PallindromeNumberString {

	public static void main(String[] args) {
		int num = 1216;
		
		String str = Integer.toString(num);
		
		String rev = new StringBuilder(str).reverse().toString();
		
		
		if(str.equals(rev)) {
			
		System.out.print(rev + " It is a pallindrome number");
		}
		else {
			System.out.print(rev + " It is not a pallindrome number");	

	}
     
    	 
     }
}
