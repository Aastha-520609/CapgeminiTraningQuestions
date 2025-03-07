import java.util.Scanner;

public class UserInterface 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code
		System.out.println("Enter the training id");
		String id = sc.next();
		if(id.length() != 9) {
			System.out.println(id + " is an invalid training id");
			return;
		}
		
		String year = id.substring(0, 4);
		if(!year.equals("2021")){
			System.out.println(year + " is an invalid year");
			return;
		}
		
		String fourthFifth = id.substring(4,6);
		if(!fourthFifth.equals("01") && !fourthFifth.equals("02") && !fourthFifth.equals("03")
				&& !fourthFifth.equals("04") && !fourthFifth.equals("05") && !fourthFifth.equals("06")) 
		{
			System.out.println(fourthFifth + " is an invalid team code");
			return;
		}
		
		String rollNo = id.substring(6, 9);
		int rollNum = Integer.parseInt(rollNo);
		if(rollNum < 1 || rollNum > 999) {
			System.out.println(rollNo + " is an invalid roll number");
			return;
		}
		
		String output = "SIET";
		
		if(fourthFifth.equals("01")) {
			output += "LP";
		}
		else if(fourthFifth.equals("02")) {
			output += "TA";
		}
		else if(fourthFifth.equals("03")) {
			output += "CT";
		}
		else if(fourthFifth.equals("04")) {
			output += "PT";
		}
		else if(fourthFifth.equals("05")) {
			output += "TT";
		}
		
		output += rollNo;
		
		System.out.println("Employee Id: " + output);
	}
	
}	
