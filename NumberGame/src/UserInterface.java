import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
       System.out.println("Enter the number of chances");
       int chances = sc.nextInt();
       
       if(chances <= 0 || chances > 5) {
    	   System.out.println("Your chance" + chances + " is out of range(1-5)");
    	   return;
       }
       
       System.out.println("Enter the numbers");
       int sum = 0;
       for(int i=0; i<chances; i++) {
    	   int n1 = sc.nextInt();
    	   if(n1 <= 0 || n1 >= 10) {
    		   System.out.println(n1 + " is an invalid number");
    		   return;
    	   }
    	   int n2 = sc.nextInt();
    	   if(n2 <= 0 || n2 >= 10) {
    		   System.out.println(n2 + " is an invalid number");
    		   return;
    	   }
    	   
           sum += n1 + n2;
       }
       
       if(isPrime(sum)) {
    	   System.out.println("The sum " + sum + " is a prime number.You won the game");
       }else {
    	   System.out.println("The sum " + sum + " is not a prime number.Better luck next time");
       }   
    }
    
    public static boolean isPrime(int num) {
    	if(num <= 1)
    		return false;
    	
    	for(int i = 2; i <= Math.sqrt(num); i++) {
    		if(num % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}