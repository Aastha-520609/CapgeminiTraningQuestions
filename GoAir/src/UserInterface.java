import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EntryUtility utility = new EntryUtility();
	    
        System.out.println("Enter the number of entries");
        int entries = scanner.nextInt();
        scanner.nextLine();
        
        for(int i=0; i<entries; i++) {
        	System.out.println("Enter entry " + (i+1) + " details");
        	String[] details = scanner.nextLine().split(":");
        	
        	String empId = details[0];
        	String empType = details[1];
        	int duration = Integer.parseInt(details[2]);
        	
        	try {
				if(utility.validateEmployeeId(empId) && utility.validateDuration(duration)) {
					System.out.println("Valid entry details");
				}
			} catch (InvalidEntryException e) {
				System.out.println("Invalid entry details");
			}
        }
    }
}
