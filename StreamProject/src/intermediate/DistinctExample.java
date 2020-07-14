package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DistinctExample {
	public static void main(String[] args) {
		IntStream is = IntStream.of(1,2,2,3,3,5,6,5);
		int sum = 0;
//		sum = is.distinct().peek(System.out::println).sum();
//		System.out.println("sum: " + sum);
		
		List<Student> list = Arrays.asList(new Student("Hong",33),
										   new Student("Hong",33),
										   new Student("Hwang",37),
										   new Student("Park",44));
		list.stream().distinct().forEach(System.out::println);
		
	}
	
}