import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.forEach(num ->  System.out.println(num));
		
		list.forEach(num -> {
			if(num%2 == 0) 
				System.out.println(num);
		});
	}
}
