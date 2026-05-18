package java_mix;

public class SwapNumberWithoutThirdParameter {
	
public static void main(String[] args){
        
        int A = 500;
        int B = 30;
        
        System.out.println("Befor Swap A = " + A + " , B = " + B);
        
        A = A+B;
        B = A-B;
        A = A-B;
        
        System.out.println("After Swap A = " + A + " , B = " + B);
    }
}


