import java.io.File;
import java.util.Scanner;

@SuppressWarnings("unchecked")//Do not delete this line
public class UserInterface
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        File file = FileManager.createFile();

        while (true) {
            System.out.println("Enter Name");
            String name = scanner.nextLine();

            System.out.println("Enter Phone Number");
            String phoneNumber = scanner.nextLine();

            System.out.println("Enter Email");
            String email = scanner.nextLine();

            String record = name + "," + phoneNumber + "," + email;
            FileManager.writeFile(file, record);

            System.out.println("Do you want to enter another record(yes/no)");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        String[] records = FileManager.readFile(file);
        for (String record : records) {
            if (!record.isEmpty()) {
                System.out.println(record);
            }
        }

        scanner.close();
	}
    
}