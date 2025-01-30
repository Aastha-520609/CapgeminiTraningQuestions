import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class UserInterface 
{
	public static boolean validID(String id) {
		String idRegex = "^SPC[0-9]{3}(0[1-9]|1[0-2])(AM|PM)$";
		Pattern pattern = Pattern.compile(idRegex);
		Matcher matcher = pattern.matcher(id);
		return matcher.matches();
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//Fill code here 
		System.out.println("Enter your name");
		String name = sc.next();
		
		System.out.println("Enter your ID");
		String id = sc.next(); //SPC01004PM
		
		if (!validID(id)) {
            System.out.println(id + " is an Invalid ID");
            return;
        }
		
		int seatNum = Integer.parseInt(id.substring(3,6));
		int startTime = Integer.parseInt(id.substring(6,8));
		String timeZone = id.substring(8);
		
		System.out.println("Hi " + name + " your seat number is " + seatNum + " and the event starts at " + startTime + timeZone);
	}
}