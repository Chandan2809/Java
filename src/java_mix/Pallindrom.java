package java_mix;

public class Pallindrom {

	public static void main(String[] args) {
		int num = 121;
		int temp = num;
		
		int rev = 0;
		
		while(num>0) {
			
			int d = num%10;
			rev =rev*10 + d;
			num = num/10;
			
		}
		
		if (temp==rev) {
	    System.out.print(temp + " is a pallindrome");
	    
		}
		
		else {
			 System.out.print(temp + " is a not pallindrome");
		}
		
		
	}

}
