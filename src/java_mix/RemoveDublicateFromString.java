package java_mix;

import java.util.LinkedHashSet;

public class RemoveDublicateFromString {

	public static void main(String[] args) {
		
		String str = "mama java bbbb";
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(char c : str.toCharArray()) {
			   set.add(c);
			   
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : set) {
			  sb.append(c);
		}
		
      System.out.println(sb);
	}

}
