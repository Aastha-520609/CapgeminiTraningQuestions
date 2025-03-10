import java.util.Scanner;
public class UserInterface {
    public static void main(String args[])
    {
        // fill the code here
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the number of teams");
        int teams = sc.nextInt();
        
        if(teams < 2) {
        	System.out.println(teams + " is an invalid input");
        	return;
        }
        
        sc.nextLine(); 
        
        String winningTeam = "";
        double minTime = Double.MAX_VALUE;
        
        System.out.println("Enter the details");
        for(int i=0; i<teams; i++) {
        	String input = sc.nextLine();
        	
        	String[] details = input.split(":");
        	
        	 if (details.length != 5) {
                 System.out.println("Invalid input format");
                 return;
             }
        	
        	String teamName = details[0];
        	double timeTaken1 = Double.parseDouble(details[1]);
        	double timeTaken2 = Double.parseDouble(details[2]);
        	double timeTaken3 = Double.parseDouble(details[3]);
        	double timeTaken4 = Double.parseDouble(details[4]);
        	
        	if(timeTaken1 < 1 || timeTaken2 < 1 || timeTaken3 < 1 || timeTaken4 < 1) {
        		System.out.println("Invalid number");
        		return;
        	}
        	
        	double totalTime = timeTaken1 + timeTaken2 + timeTaken3 + timeTaken4;

            if (totalTime < minTime) {
                minTime = totalTime;
                winningTeam = teamName;
            }
        }
        
        System.out.printf("%s team wins the race in %.2f minutes\n", winningTeam, minTime);
    }
    

}
