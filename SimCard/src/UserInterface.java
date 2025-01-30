import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
       System.out.println("Enter the phone number");
       long number = sc.nextLong();
       long odd = 0;
       long even = 0;
       
       while(number > 0) {
    	   long digit = number % 10;
    	   if(digit % 2 == 0) {
    		   even += digit;
    	   }
    	   else {
    		   odd += digit;
    	   }
    	   number /= 10;	   
       }
       
       if(odd == even) {
    	   System.out.println("Sum of odd and even are equal");
       }
       else if(odd > even) {
    	   System.out.println("Sum of odd is greater than sum of even");
       }
       else {
    	   System.out.println("Sum of even is greater than sum of odd");
       }
    }
}