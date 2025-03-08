import java.util.Scanner;
 
public class UserInterface {
	public static boolean validName(String name) {
		if (!name.matches("^[A-Z]{4}@[0-9]{3}$")) {
            return false;
        }
        int courseId = Integer.parseInt(name.substring(5));
        return courseId >= 101 && courseId <= 115;
	}
	
	public static String passwordGeneration(String name) {
		StringBuilder result = new StringBuilder();
		String last = name.substring(6);
		
		String first = name.substring(0,4).toLowerCase();
		int sum = 0;
		for(int i = 0; i < first.length(); i++) {
			sum += first.charAt(i);
		}
        
		result.append("TECH_").append(sum).append(last);
		
		return result.toString();
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the username");
        String username = sc.nextLine();
        
        if(username.length() != 8  || !validName(username)) {
        	System.out.println(username + " is an invalid username");
        	return;
        }
        
        System.out.println("Password: " + passwordGeneration(username));
        
    }
}

