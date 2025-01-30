import java.util.Scanner;
public class UserInterface {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the room(in m) ");
        double l = sc.nextDouble();
        if(l <= 0) {
        	System.out.println("Invalid Length");
        	return;
        }
        System.out.println("Enter the breadth of the room(in m) ");
        double b = sc.nextDouble();
        if(b <= 0) {
        	System.out.println("Invalid Breadth");
        	return;
        }
        System.out.println("Enter the plant area of a single plant (in cm2) ");
        double area = sc.nextDouble();
        if(area <= 0) {
        	System.out.println("Invalid plant area");
        	return;
        }
        
        double totalArea = l * b;
        double plantArea = area / (100*100);
        int totalPlants = (int) (totalArea / plantArea);
        totalPlants = (totalPlants/10) * 10;
        
        double totalOxygen = totalPlants * 0.9;
        
        System.out.println("Total number of plants is " + totalPlants);
        System.out.printf("Total oxygen production is %.2f litres\n", totalOxygen);
    }

}
