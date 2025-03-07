import java.util.Scanner;
public class UserInterface 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code	
		System.out.println("Enter the name");
		String name = sc.next();
		
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		System.out.println("Enter the gender");
		String gender = sc.next();
		
		sc.nextLine();
		System.out.println("Enter the blood group");
		String bloodGroup = sc.nextLine();
		
		System.out.println("Enter the phone no");
		long phoneNumber = sc.nextLong();
		
		DonorDetails details = new DonorDetails(name, age, gender, bloodGroup, phoneNumber);
		System.out.println("Name: " + details.getName());
		System.out.println("Age: " + details.getAge());
		System.out.println("Gender: " + details.getGender());
		System.out.println("Blood group: " + details.getBloodGroup());
		System.out.println("Phone no: " + details.getPhoneNumber());
	}
}
