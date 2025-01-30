import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
       System.out.println("Enter the size for the first array");
       int firstArraySize = sc.nextInt();
       if(firstArraySize <= 0) {
    	   System.out.println(firstArraySize + " is an invalid array size");
    	   return;
       }
       
       System.out.println("Enter the elements for the first array");
       int[] firstArray = new int[firstArraySize];
       for(int i=0; i<firstArray.length; i++) {
    	   firstArray[i] = sc.nextInt();
       }
       
       System.out.println("Enter the size for the second array");
       int secondArraySize = sc.nextInt();
       if(secondArraySize <= 0) {
    	   System.out.println(secondArraySize + " is an invalid array size");
    	   return;
       }
       
       System.out.println("Enter the elements for the second array");
       int[] secondArray = new int[secondArraySize];
       for(int i=0; i<secondArray.length; i++) {
    	   secondArray[i] = sc.nextInt();
       }
       
       if(firstArraySize != secondArraySize) {
    	   System.out.println("Both array size are not the same");
       }
       
       int[] thirdArray = new int[firstArraySize];
       for(int i=0; i<thirdArray.length; i++) {
    	   if(i % 2 == 0) {
    		   thirdArray[i] = firstArray[i] + secondArray[i];
    	   }
    	   else {
    		   thirdArray[i] = firstArray[i] - secondArray[i];
    	   }
       }
       
       System.out.println("The elements of the third array");
       for(int i=0; i<thirdArray.length; i++) {
    	   System.out.println(thirdArray[i]);
       }
    }
}