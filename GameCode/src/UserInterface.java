import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserInterface 
{	
	public static void main(String[] args)
	{
		    Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your profile code");
	        String code = sc.nextLine();
	        
	        if (!code.startsWith("#")) {
	            System.out.println(code + " does not start with a valid special character");
	            return;
	        }
	        
	        if (code.length() != 8) {
	            System.out.println(code + " does not have the specified length");
	            return;
	        }
	        
	        String up = code.substring(1, 5);
	        if (!up.matches("[A-Z]{4}")) {
	            int count = 0;
	            for (char a : up.toCharArray()) {
	                if (Character.isUpperCase(a)) {
	                    count++;
	                }
	            }
	            System.out.println(count + " is an invalid number for uppercase character");
	            return;
	        }
	        
	        String dp = code.substring(5);
	        if (!dp.matches("[0-9]{3}")) {
	            int count = 0;
	            int n = dp.length();
	            boolean isValid = true;
	            while (isValid) {
	                char a = dp.charAt(n - 1);
	                if (Character.isDigit(a)) {
	                    count++;
	                } else {
	                    isValid = false;
	                }
	                n--;
	            }
	            System.out.println(count + " is an invalid number for digits");
	            return;
	        }
	        
	        System.out.println(code + " is a valid profile code whose last 3 digits are " + dp);
	}
}