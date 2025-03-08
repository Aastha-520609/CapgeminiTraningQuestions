import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserInterface{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ForensicReport report = new ForensicReport();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Enter number of reports to be added");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Forensic reports (Reporting Officer: Report Filed Date)");
		for(int i=0; i<n; i++) {
			String[] details = sc.nextLine().split(":");
			String name = details[0];
			Date date = null;
			try {
				date = dateFormat.parse(details[1]);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			report.addReportDetails(name, date);
		}
		
		System.out.println("Enter the filed date to identify the reporting officers");
	    String dateInput = sc.nextLine();
	    
	    Date date = null;
	    try {
			 date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    
	    List<String> result = report.getOfficersWhoFiledReportsOnDate(date);
	    
	    if(result.isEmpty()) {
	    	System.out.println("No reporting officer filed the report");
	    	return;
	    }
	    
	    System.out.println("Reports filed on the " + dateFormat.format(date) + " are by");
	    for(String name : result) {
	    	System.out.println(name);
	    }
	    
	}

}


