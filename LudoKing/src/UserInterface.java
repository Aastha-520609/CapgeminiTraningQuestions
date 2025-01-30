import java.util.Scanner;
public class UserInterface
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		System.out.println("Enter Alex points");
		int alex = sc.nextInt();
		if(alex < 0 || alex > 50) {
			System.out.println(alex + " is an invalid number");
			return;
		}
		System.out.println("Enter Nikil points");
		int nikil = sc.nextInt();
		if(nikil < 0 || nikil > 50) {
			System.out.println(nikil + " is an invalid number");
			return;
		}
		System.out.println("Enter Sam points");
		int sam = sc.nextInt();
		if(sam < 0 || sam > 50) {
			System.out.println(sam + " is an invalid number");
			return;
		}
		
        String result = (alex == nikil && nikil == sam) ? "The game is a tie" :
        	(alex > nikil && alex > sam) ? "Alex scored " + alex + " points and won the game" :
        	(nikil > sam && nikil > alex) ? "Nikil scored " + nikil + " points and won the game":
        	(sam > alex && sam > nikil)? "Sam scored " + sam + " points and won the game":
        	(alex == nikil || alex == sam || nikil == sam) ? "The game is a tie" :
        		"The game is a tie";
        		
        
        System.out.println(result);
    }
}
