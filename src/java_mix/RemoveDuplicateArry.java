package java_mix;

import java.util.LinkedHashSet;

public class RemoveDuplicateArry {

	public static void main(String[] args){

	    int arry[] = {1,2,2,3,4,4,5,6,7,8,8,9};


	    LinkedHashSet<Integer> set = new LinkedHashSet<>();

	    for(int c : arry){

	      set.add(c);
	    }
	    StringBuilder sb = new StringBuilder();

	     for(int c: set){
	      sb.append(c);
	     }
	     System.out.print(sb);
	  }
	}