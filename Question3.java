import java.util.*;
public class Question3{
	    
	public static void main(String[] args) {
	    	
	    //declare the objects
        int num;
        int rem=0;
        int sum=0;
        int store;

        Scanner scan = new Scanner(System.in);
		
        // enter number here.
        System.out.print("Enter a number : ");
        num = scan.nextInt();
		
        // stores the number.
        store = num;
		
        while(num>0){
 
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
		
        System.out.print("Sum of Digits of " +store+ " is : " +sum); 	}
}


