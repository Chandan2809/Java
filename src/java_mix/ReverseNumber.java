package java_mix;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1234;
		
		//int temp = num;
		
		int rev = 0;
		
		while(num>0) {
			
			rev = rev*10 + num%10;
			num = num/10;
			
		}
		System.out.print(rev + " is a reverse numbers");
	}

}
