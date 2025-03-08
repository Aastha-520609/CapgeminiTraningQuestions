import java.util.Scanner;

public class UserInterface {
	public static boolean validSentence(String sentence) {
		return sentence.matches("[a-zA-Z ]+");
	}
	
	public static int wordCount(String[] words) {
		int count = 0;
		for(String word : words) {
			if(!word.isEmpty()) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter the sentence");
	    String sentence = sc.nextLine();
	    
	    if (!validSentence(sentence)) {
            System.out.println("Invalid Sentence");
            return;
        }
	    
	    String[] words = sentence.split(" ");
	    StringBuilder result = new StringBuilder();
	    
	    int wordCount = wordCount(words);
    	
	    System.out.println("Word Count: " + wordCount);
	    
    	if(wordCount % 2 == 0) {
    		for(int i = words.length - 1; i >= 0; i--) {
    			result.append(words[i]).append(" ");
    		}
    	}
    	else {
    		for(int i = 0; i < words.length; i++) {
    			result.append(new StringBuilder(words[i]).reverse()).append(" ");
    		}
    	}
        
    	System.out.println(result.toString().trim());
	}
}
