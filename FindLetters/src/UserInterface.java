import java.util.*;
public class UserInterface{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//FILL CODE HERE
		System.out.println("Enter the word");
		String word = sc.next();
		int len = word.length();
		
		System.out.println("Enter the two indices");
		
		int n1 = sc.nextInt();
		if(n1 > len) {
				System.out.println(n1 + " is greater than the word length");
				return;
		}
		
		int n2 = sc.nextInt();
		if(n2 > len) {
			System.out.println(n2 + " is greater than the word length");
			return;
		}
		
		
		if(n1 > n2) {
			System.out.println("Index2 should be greater than Index1");
			return;
		}
	
		String result = word.substring(n1,n2);
		System.out.println(result);
	}
}
