import java.text.SimpleDateFormat;
import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    //FILL THE CODE
		System.out.println("Enter the date");
		String date = sc.next();
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false);
		try {
			df.parse(date);
			System.out.println(date + " is a valid date");
		}
		catch(Exception e) {
			System.out.println(date + " is not a valid date");
		}
	}

}
