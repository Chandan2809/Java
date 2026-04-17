package java_mix;

public class CountVowelAndConsonant {

	public static void main(String[] args) {
		
		String sr = "Hello World";
		
		 sr = sr.toLowerCase(); // Convert in small letter
		 
		 int vowel = 0, consonant = 0;
		 
		 for( int i = 0; i< sr.length(); i++) {
			 
		      char ch = sr.charAt(i);
		 
		 if( ch >= 'a' && ch <= 'z') {
			if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
				vowel++;
			}
			else {
				consonant++;
			}
		 }
			 
		 }
		 System.out.println("Vowels = " + vowel);
		 System.out.println("Consonant = " + consonant);
	}

}
