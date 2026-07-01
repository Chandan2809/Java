package java_mix;

public class Count_Repeating_Numbers_From_Array{
	
	public static void main(String[] args){
		
		int array[] = {1,1,1,1,2,2,2,3,3,3,3,4,4,5,6,7,7,7,7,8,9,10,10};
		
		System.out.println("The repeated array are: ");
		
		for(int i= 0; i<array.length; i++) {
			
			int count=1;
			
			for(int j =i+1; j<array.length; j++) {
				
				if(array[i]==array[j]) {
					count++;
						
				}
				
			}
			boolean alreadyPrinted=false;
			
			for(int k=0; k<i; k++) {
				
				if(array[i]==array[k]) {
					
					alreadyPrinted = true;
				}
			}
			if(!alreadyPrinted) {
				
				
				System.out.println(array[i] + " = " + count);
			}
			
		}
		
		
		
	}

}
