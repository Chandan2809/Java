package java_mix;

public class OddArray {

	public static void main(String[] args) {
		int arr[] = {3,5,7,8,1,9,4};
		System.out.print("Odd number: ");
		
		for(int i = 0; i < arr.length; i++ ) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
