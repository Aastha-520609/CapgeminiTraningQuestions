import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter the numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		String result = (n1 == n2 && n2 == n3) ? "All numbers are equal" :
			            (n1 <= n2 && n1 <= n3) ? "The Smallest number is " + n1 :
			            (n2 <= n1 && n2 <= n3) ? "The Smallest number is " + n2 :
			            	"The Smallest number is " + n3;
		
		System.out.println(result);
	}

}
