import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class UserInterface
{
	public static boolean validPassword(String password) {
		String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[@$*#])[A-Za-z0-9@$*#]{6,12}$";
		Pattern pattern = Pattern.compile(passwordRegex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
	
	public static void countComponents(String password) {
        int lowercaseCount = 0, uppercaseCount = 0, specialCount = 0, digitCount = 0;
        
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if ("@$*#".indexOf(c) != -1) {
                specialCount++;
            }
        }
        
        System.out.println("The generated password " + password + " is valid and has " +
                lowercaseCount + " lowercase alphabet " +
                uppercaseCount + " uppercase alphabet " +
                specialCount + " special character " +
                digitCount + " digit");
    }
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Generate your password");
		String password = sc.next();
		
		if (validPassword(password)) {
            countComponents(password);
        } else {
            System.out.println(password + " is an invalid password");
        }
	}
}