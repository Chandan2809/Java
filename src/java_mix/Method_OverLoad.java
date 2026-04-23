package java_mix;

public class Method_OverLoad {
	
	 public static void main(String[] args){
	        Calender obj = new Calender();
	        
	         System.out.println(obj.add (10, 20));
	         System.out.println(obj.add (10, 20, 40));
	         System.out.println(obj.add (10.5, 20.5));
	        
	    }
	}
	class Calender{
	    int add(int a, int b){
	        return a+b;
	    }
	    
	    int add(int a, int b, int c){ // Different parameter type
	        return a+b+c;
	    }
	    
	    double add(double a, double b){  // different data type parameter
	        return a+b;
	    }
	}



