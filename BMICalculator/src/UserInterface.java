import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		//Fill the code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in kg");
		double weight = sc.nextDouble();
		System.out.println("Enter height in cm");
		double height = sc.nextDouble();
		double BMI = weight/((height/100) * (height/100));
		double reduce = BMI - 25;
		double gain = 18.5 - BMI;
		if(BMI > 25) {
			System.out.printf("Your BMI is %.2f. ", BMI);
			System.out.println("You are overweight");
			System.out.printf("Reduce %.2f kg to be fit", reduce);
		}
		else if(BMI < 18.5) {
			System.out.printf("Your BMI is %.2f. ", BMI);
			System.out.println("You are underweight");
			System.out.printf("Gain %.2f kg to be fit", gain);
		}
		else {
			System.out.printf("Your BMI is %.2f. ", BMI);
			System.out.println("You are fit and healthy");
		}
		
	}

}
