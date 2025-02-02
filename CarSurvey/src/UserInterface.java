
import java.util.List;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Car car = new Car();
		
		while(true) {
			System.out.println("1.Add car");
			System.out.println("2.Search by name");
			System.out.println("3.Search by count");
			System.out.println("4.Total");
			System.out.println("5.Exit");
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
		    sc.nextLine();
		    
		    if(choice == 1) {
		    	System.out.println("Enter the car name");
                String name = sc.nextLine();
                System.out.println("Enter no of cars sold");
                int num = sc.nextInt();

                if (num > 0) {
                    if (car.getCarMap().containsKey(name)) {
                        car.getCarMap().put(name, car.getCarMap().get(name) + num);
                    } else {
                        car.addCar(name, num);
                    }
                } 
		    }
		    else if(choice == 2) {
		    	 if (car.totalCarsSold() == 0) {
                     System.out.println("The map is empty");
                 }else {
		    		System.out.println("Enter the car name");
		    		String carName = sc.nextLine();
		    		int sales = car.carByName(carName);
		    		if (sales == -1) {
                         System.out.println("Car not found");
                    } else {
                         System.out.println(sales);
                    }
		    	}
		    	
		    }else if(choice == 3) {
		    	if (car.totalCarsSold() == 0) {
                    System.out.println("The map is empty");
                } else {
                    System.out.println("Enter the count");
                    int minCount = sc.nextInt();
                    List<String> cars = car.carByCount(minCount);
                    if (cars == null) {
                        System.out.println("No cars found");
                    } else {
                        for (String c : cars) {
                            System.out.println(c);
                        }
                    }
                }
		    	
		    }else if(choice == 4) {
		    	if (car.totalCarsSold() == 0) {
                    System.out.println("The map is empty");
                } else {
                    System.out.println(car.totalCarsSold());
                }
		    	
		    }else if(choice == 5) {
		    	System.out.println("Thank you for using the application");
		    	break;
		    }
		}
		
	}
}

