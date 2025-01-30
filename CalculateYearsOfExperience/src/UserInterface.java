import java.text.*;
import java.util.Scanner;
import java.util.Date;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    //FILL THE CODE
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false);
		
		System.out.println("Enter the date of joining");
		String doj = sc.next();
		
		try {
			Date joiningDate = df.parse(doj);
			Date currentDate = df.parse("15/12/2020");
			
			long diffInMS = currentDate.getTime() - joiningDate.getTime();
			long yearsOfExp = diffInMS / (1000L * 60 * 60 * 24 * 365);
			System.out.println(yearsOfExp + " years of experience");
		}catch(Exception e) {
			System.out.println("Invalid date format");
		}
	
	}

}
