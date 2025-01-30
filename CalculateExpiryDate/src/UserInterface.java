import java.text.*;
import java.util.Calendar;
import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    //FILL THE CODE
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false);
		
		System.out.println("Enter the Manufacturing Date");
		String mf = sc.next();
		
		try {
			Calendar c = Calendar.getInstance();
			c.setTime(df.parse(mf));
			System.out.println("Enter the Month");
			int month = sc.nextInt();
			c.add(Calendar.MONTH, month);
			String date = df.format(c.getTime());
			System.out.println(date + " is the expiry date");
		}catch(Exception e) {
			System.out.println(mf + " is not a valid date");
		}
	
	}

}
