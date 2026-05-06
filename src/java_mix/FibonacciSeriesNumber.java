package java_mix;

public class FibonacciSeriesNumber {

	public static void main(String[] args) {
		int n = 10, FirstNum=0, SecondNum=1, NextNum;
		
		for(int i=1; i<=n; i++) {
			
			System.out.print(FirstNum + ", ");
			 NextNum = FirstNum + SecondNum;
			 FirstNum = SecondNum;
			 SecondNum = NextNum;
			
			}

	}

}
