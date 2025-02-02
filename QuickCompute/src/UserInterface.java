import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		NumAvg numAvg = new NumAvg();
		
		while(true) {
			System.out.println("1.Add number");
			System.out.println("2.Find average");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				System.out.println("Enter the number");
				int num = sc.nextInt();
				numAvg.addNum(num);
			}
			else if(choice == 2) {
				if(numAvg.calAvg() == -1) {
					System.out.println("The set is empty");
				}else {
					System.out.println(numAvg.calAvg());
				}
			}else if(choice == 3) {
				System.out.println("Thank you for using the application");
				break;
			}
		}
	}
}
