package basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamExample {
	static int sum = 0;
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		for (int n : numbers) {
			if (n % 2 == 1) {
				int square = n * n;
				sum += square;
			}
		}
		
//		System.out.println("결과: " + sum);
//		if문과 동격(filter)
//		Predicate<Integer> predicate = ((t) -> t%2 ==1);
//		제곱하는것과 동격(map)
//		Function<Integer, Integer> function = new Function<Integer, Integer>(){
//			@Override
//			public Integer apply(Integer t) {
//				return t * t;
//			}
//		};
		
		numbers.stream().filter((t) -> t % 2 == 1).map((t) -> t * t).forEach(s -> sum+=s);
		System.out.println("결과" + sum);
	}
}
