import java.util.Scanner;

public class UserInterface {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Endowment Id");
        String endowmentId = sc.nextLine();

        System.out.println("Enter Holder Name");
        String holderName = sc.nextLine();

        System.out.println("Enter Endowment Type");
        String endowmentType = sc.nextLine();
        
        if (!endowmentType.equalsIgnoreCase("Educational") && !endowmentType.equalsIgnoreCase("Health")) {
            System.out.println(endowmentType + " is an invalid endowment type");
            return;
        }

        System.out.println("Enter Registration Date");
        String registrationDate = sc.nextLine();

        if (endowmentType.equalsIgnoreCase("educational")) {
            System.out.println("Enter Educational Institution");
            String eduInstitution = sc.nextLine();

            System.out.println("Enter Educational Division");
            String eduDivision = sc.nextLine();

            EducationalEndowment educationalEndowment = new EducationalEndowment(
                    endowmentId, holderName, endowmentType, registrationDate, eduInstitution, eduDivision);

            System.out.printf("Endowment Amount %.2f", educationalEndowment.calculateEndowment());

        } else if (endowmentType.equalsIgnoreCase("health")) {
            System.out.println("Enter Health Care Center");
            String healthCareCenter = sc.nextLine();

            System.out.println("Enter Holder Age");
            int holderAge = sc.nextInt();

            HealthEndowment healthEndowment = new HealthEndowment(
                    endowmentId, holderName, endowmentType, registrationDate, healthCareCenter, holderAge);

            System.out.printf("Endowment Amount %.2f", healthEndowment.calculateEndowment());

        } 
	}

}
