package java_mix;

public class FullDiamondPattern {

	public static void main(String[] args) {
		int n=5, i, j, k;
		
		for(i=1; i<=n; i++) {
		
		for(j=n; j>=i; j--) {
		System.out.print(" ");
		}
		
		for(k=1; k<2*i; k++) { System.out.print("*"); }
		 
		System.out.println();
		}
		
		for(i=n-1; i<=n; i--) {
			
			for(j=n; j>=i; j--) {
			System.out.print(" ");
			}
			
			for(k=1; k<2*i; k++) { System.out.print("*"); }
			 
			System.out.println();
			}
	}

}
