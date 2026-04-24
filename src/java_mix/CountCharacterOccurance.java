package java_mix;

public class CountCharacterOccurance {
	
	public static void main(String[] args) {
		
        String s = "java mama";
           int total_text = s.length();
        int total_text_after_a_remove = s.replace("a","").length();
        
        int count = total_text-total_text_after_a_remove;
        
        System.out.println("Number of accurance: " + count);
    }
}

