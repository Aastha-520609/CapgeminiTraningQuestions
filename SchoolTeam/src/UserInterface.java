import java.util.HashSet;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        if (numStudents <= 0) {
            System.out.println("Invalid input");
            return;
        }

        ClassHouseFormation houseFormation = new ClassHouseFormation();
        System.out.println("Enter the details");
        for (int i = 0; i < numStudents; i++) {
            String details = scanner.nextLine();
            houseFormation.addName(details);
        }

        HashSet<String> result = houseFormation.formTeam();
        for (String entry : result) {
            System.out.println(entry);
        }
	}
}