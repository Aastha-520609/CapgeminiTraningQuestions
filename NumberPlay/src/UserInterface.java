import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc = new Scanner(System.in);
       
        //Fill the code here
       System.out.println("Enter the number");
       int number = sc.nextInt();
       if(number < 10 || number > 99) {
    	   System.out.println("Invalid number");   
       }else {
    	   int tens = number / 10;
    	   int units = number % 10;
    	   
    	   if(number > 50) {
    		   System.out.println(tens - units);
    	   }
    	   else {
    		   int reverse = units * 10 + tens;
    		   System.out.println((reverse/10) - (reverse%10));
    	   }
       }
        
    }
}