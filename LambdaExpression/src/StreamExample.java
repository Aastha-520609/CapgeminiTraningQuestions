import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		Stream<Integer> s1 = list.stream();
//		Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
//		Stream<Integer> s3 = s2.map(n -> n * 2);
//		s3.forEach(n -> System.out.println(n));
		
		Stream<Integer> s1 = list.stream()
				.filter(n -> n % 2 == 0)
				.map(n -> n * 2);
		
		s1.forEach(n -> System.out.println(n));
		
//		int result = list.stream()
//                             .filter(n -> n % 2 == 0)
//                   			 .map(n -> n * 2)
//                   			 .reduce(0,  (c,e) -> (c+e) );
//		
//		System.out.println(result);
		
//		list.forEach(n -> {
//			if(n % 2 == 0)
//			  System.out.println(n);
//		});
	}

}
