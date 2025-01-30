import java.util.Scanner;
public class UserInterface
{
	public static void main(String[] args)
	{
        
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the sentence");
	       String sentence = sc.nextLine();
	       if(!sentence.matches("[a-z ]+")){
	    	   System.out.println(sentence + " is an invalid input");
	    	   return;
	       }
	       
	       String[] words = sentence.split(" ");
	       StringBuilder result = new StringBuilder();
	       
	       for(String word : words) {
	    	   char[] chars = word.toCharArray();
	    	   
	    	   for(int i=0; i<chars.length; i++) {
	    		   for(int j=i+1; j<chars.length; j++) {
	    			   if(chars[i] > chars[j]) {
	    				   char temp = chars[i];
	    				   chars[i] = chars[j];
	    				   chars[j] = temp;
	    			   }
	    		   }
	    		   
	    	   }
	    	   result.append(new String(chars) + " ");
	       }
	       
	       System.out.println(result.toString().trim());
	      
	    }
}
