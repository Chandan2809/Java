package java_mix;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountEveryCharOccurrence {
	
	public static void main(String[] args) {

	      String s ="Java ki class";
	      
	      Map<Character , Integer> freq = new LinkedHashMap<>();

	      for(int i=0; i<s.length(); i++){

	        char ch = s.charAt(i);

	        if (ch == ' ') continue;

	         freq.put(ch, freq.getOrDefault(ch, 0) +1);

	      }
	      for(Map.Entry<Character, Integer> e : freq.entrySet()){

	        System.out.println(e.getKey() + " = " + e.getValue());
	      }

	    }

}
