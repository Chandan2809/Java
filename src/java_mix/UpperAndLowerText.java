package java_mix;

public class UpperAndLowerText {
	
public static void main (String[] args){
        
        String s = "Welcome to Java";
        
        String upper = "";
        String lower = "";
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(ch >= 65 && ch <= 90){
                
                  upper =  upper+ch;
            }
        else {
           lower = lower+ch;
        }
        }
        System.out.println("Upper Text: "+upper);
        System.out.println("Lower Text: "+lower);
    }
}

	


