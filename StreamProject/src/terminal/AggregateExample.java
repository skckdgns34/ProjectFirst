package terminal;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;
import java.util.stream.IntStream;

public class AggregateExample {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 4, 5 };
		IntStream iStream = Arrays.stream(intAry);
		OptionalDouble od = iStream.filter(n -> n > 5).average();
		double result;
		
		od.ifPresent(new DoubleConsumer() {
			
			@Override
			public void accept(double value) {
				System.out.println("결과는: " + value);
			}
		});
		
//		result = od.orElse(0.0);
//		System.out.println(result);
		
//		if (od.isPresent()) {
//			result = od.getAsDouble();	
//			System.out.println(result);
//		}else
//			System.out.println("값이 없습니다.");

		
		
//		long count = Arrays.stream(new int[] {1,2,3,4,5}).filter(n -> n%2 ==0).count();
//		System.out.println("2의 배수 개수: " + count);
//		
//		long sum = Arrays.stream(new int[] {1,2,3,4,5}).filter(n -> n%2 ==0).sum();
//		System.out.println("2의 배수 합: " + sum);
//		
//		double avg = Arrays.stream(new int[] {1,2,3,4,5}).filter(n -> n%2 ==0).average().getAsDouble();
//		System.out.println("2의 배수 평균: " + avg);
//		
//		int max = Arrays.stream(new int[] {1,2,3,4,5}).filter(n -> n%2 ==0).max().getAsInt();
//		System.out.println("2의 배수 최고값: " + max);
//		
//		int min = Arrays.stream(new int[] {1,2,3,4,5}).filter(n -> n%2 ==0).min().getAsInt();
//		System.out.println("2의 배수 최소값: " + min);
//		
//		int first = Arrays.stream(new int[] {1,2,3,4,5}).filter(n -> n%3 ==0).findFirst().getAsInt();
//		System.out.println("2의 배수 첫 값: " + first);
	}
}
