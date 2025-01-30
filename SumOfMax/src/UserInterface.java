import java.util.Arrays;
import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
        //Fill the code here
       System.out.println("Enter the array size");
       int size = sc.nextInt();
       
       if(size <= 0) 
       {
    	   System.out.println(size + " is an invalid array size");
    	   return;
       }
       else if(size % 2 != 0)
       {       
    	   System.out.println(size + " is an odd number.Please enter even number");
    	   return;
       }
       
        System.out.println("Enter the number");
        int[] number = new int[size];
        for(int i=0; i<number.length; i++) {
        	   number[i] = sc.nextInt();
           
       }
       
       Arrays.sort(number);
       int maxSum = Integer.MIN_VALUE;
       for(int i=0; i<number.length/2; i++) {
    	   int sum = number[i] + number[number.length - 1 - i];
    	   maxSum = Math.max(maxSum, sum);
       }
       
       System.out.println("The maximum number is " + maxSum);
       
    }
}