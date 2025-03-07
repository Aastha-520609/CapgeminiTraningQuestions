import java.util.Scanner;

public class UserInterface 
{
	public static void main(String args[]) 
	{
	
		Scanner sc = new Scanner(System.in);
		//Fill the code
		System.out.println("Enter the sentence");
		String sentence = sc.nextLine();
		if(!sentence.matches("[a-zA-Z ]+")) {
			System.out.println(sentence + " is an invalid sentence");
			return;
		}
		
		String[] words = sentence.split(" ");
		if(words.length <= 2) {
			System.out.println("Invalid Length");
			return;
		}
		
		String first = words[0];
		String last = words[words.length - 1];

		StringBuilder result = new StringBuilder();
		result.append(last).append(" ");
		
		for(int i = 1; i < words.length - 1; i++) {
			words[i] = new StringBuilder(words[i]).reverse().toString();
		}
		
		for (int i = 1, j = words.length - 2; i < j; i++, j--) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }
		
		for (int i = 1; i < words.length - 1; i++) {
            result.append(words[i]).append(" ");
        }
		
		result.append(first);
		
		System.out.println(result.toString());
		
	}
	
}	
