import java.util.Scanner;

public class UserInterface 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence");
		String sentence = sc.nextLine();
		
		System.out.println("Enter the word");
		String word = sc.next();
		
	    String[] words = sentence.split(" ");
	    
	    boolean isPresent = false;
	    for(int i=0; i<words.length; i++) {
	    	if(words[i].equals(word)) {
		    	System.out.println(word + " is present in the sentence");
		    	isPresent = true;
		    	break;
		    }
	    }
	    
	    if(!isPresent){
	       System.out.println(word + " is not present in the sentence");	
	    }
	}
	
}	
