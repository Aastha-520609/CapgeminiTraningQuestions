import java.util.Scanner;
public class UserInterface {
	public static boolean validString(String str) {
		if(str.matches("[a-zA-Z! ]+")) {
			return true;
		}
		
		return false;
	}
	
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        //fill the code here
       System.out.println("Enter the first string");
       String first = sc.nextLine();
       
       System.out.println("Enter the second string");
       String second = sc.nextLine();
       
       if(first.length() != second.length()) {
    	   System.out.println("Length of the strings" + first + " and " + second + " does not match");
    	   return;
       }
       
       if(!validString(first) && !validString(second)) {
    	   System.out.println(first + " and " + second + " contains invalid symbols");
           return;
       }
       else if(!validString(first)) {
    	   System.out.println(first + " contains invalid symbols");
           return;
       }
       else if(!validString(second)) {
    	   System.out.println(second + " contains invalid symbols");
           return;
       }
       
       StringBuilder correctWord = new StringBuilder();
       for(int i=0; i<first.length(); i++) {
    	   if(first.charAt(i) == '!') {
    		   correctWord.append(second.charAt(i));
    	   }
    	   else {
    		   correctWord.append(first.charAt(i));
    	   }
       }
       
       System.out.println(correctWord.toString());
    }
}
