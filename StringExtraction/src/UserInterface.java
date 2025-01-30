import java.util.Scanner;

public class UserInterface {
	
	public String extractString(String sentence, int number1, int number2)
    {
		try {
			String extracted = sentence.substring(number1, number2);
			 return "The output string is " + extracted + ". Thanks for using the application.";
		}
		catch(StringIndexOutOfBoundsException e) {
			return "Invalid index position. Thanks for using the application.";
		}
        
    }
	
	public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String");
       String sentence = sc.nextLine();
       
       System.out.println("Enter First Index");
       int firstIndex = sc.nextInt();
       
       System.out.println("Enter Second Index");
       int secondIndex = sc.nextInt();
       
       UserInterface ui = new UserInterface();
       String result = ui.extractString(sentence, firstIndex, secondIndex);
       System.out.println(result);
    }
	

}
