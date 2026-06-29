package java_mix;

public class RemoveStringDuplication {

	public static void main(String[] args) {
		
	     String str = "abcabc";
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			if(!result.contains(""+str.charAt(i))) {
				result += str.charAt(i);
			}
		}
		
		System.out.println(result);
	         
	}

}
