import java.util.Scanner;
public class UserInterface {
	public static void main(String[] arg)
    {
        // Fill the code
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's Id: ");
		int studentId = sc.nextInt();
		
		System.out.println("Enter Student's Name: ");
		String studentName = sc.next();
		
		System.out.println("Enter Student's address: ");
		String studentAddress = sc.next();
		
		String collegeName = "NIT";
		
		while(true) {
			System.out.println("Whether the student is from NIT(Yes/No): ");
			String isNIT = sc.next().toLowerCase();
			
			if(isNIT.equals("yes")) {
				Student obj1 = new Student(studentId, studentName, studentAddress);
				studentDetails(obj1);
				break;
			}
			else if(isNIT.equals("no")) {
				System.out.println("Enter the college name");
				collegeName = sc.next();
				
				Student obj1 = new Student(studentId, studentName, studentAddress, collegeName);
				studentDetails(obj1);
				break;
			}
			else
			{
				System.out.println("Wrong Input");
			}
		}
    }
	
	public static void studentDetails(Student student) {
		System.out.println("Student id:" + student.getStudentId());
        System.out.println("Student name:" + student.getStudentName());
        System.out.println("Address:" + student.getStudentAddress());
        System.out.println("College name:" + student.getCollegeName());
	}
}

