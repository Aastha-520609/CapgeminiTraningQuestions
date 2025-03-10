import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class UserInterface 
{
	public static boolean validPAN(String panNum) {
		String panRegex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		Pattern pattern = Pattern.compile(panRegex);
		Matcher matcher = pattern.matcher(panNum);
		return matcher.matches();
	}
	
	public static boolean validEmail(String emailID) {
		String emailRegex = "^[a-z]{5,10}@digitec\\.com$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(emailID);
		return matcher.matches();
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your PAN number");
        String panNumber = scanner.nextLine();
        
        if (!validPAN(panNumber)) {
            System.out.println(panNumber + " is an invalid PAN number");
            return;
        }

        System.out.println("Enter your E-mail ID");
        String emailID = scanner.nextLine();

        if (!validEmail(emailID)) {
            System.out.println("Invalid E-mail ID");
            return;
        }

        System.out.println("Profile of " + name + " updated successfully");
	}
}