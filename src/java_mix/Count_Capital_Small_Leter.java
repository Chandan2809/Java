package java_mix;

public class Count_Capital_Small_Leter {

	public static void main(String[] args) {
		
		String s = " Welcome To My JAVA Class";
		
		int lower = 0;
		int upper = 0;
		
	     for(int i= 0; i<s.length(); i++) {
	    	 
	    	 char ch = s.charAt(i);
	    	 
	    	 if( ch>=65 && ch<=90) {
	    		 
	    		 upper++;
	    	 }
	    	 else  if(ch >= 97 && ch <= 122) { 
	    		 lower++;
	    	 }
	     }
          System.out.println("Lower: "+ lower);
          System.out.println("Upper: " + upper);
	}

}
