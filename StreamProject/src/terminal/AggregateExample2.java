package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

import intermediate.Student;

public class AggregateExample2 {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Hong", 55), new Student("Hwang", 67),
				new Student("Part", 88));
		int result = students.stream().mapToInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getScore();
			}
		}).sum();// forEach(s -> System.out.println(s));
		System.out.println("sum 집계결과: " + result);

		result = students.stream()//.filter(n -> n.getScore() >= 100)
				.mapToInt(s -> s.getScore())
				.reduce(new IntBinaryOperator() {
					@Override
					public int applyAsInt(int left, int right) {
						System.out.println("left: " + left + ", right: " + right);
						return left + right;
					}
				}).getAsInt();
		System.out.println("reduce 집계결과: " + result);
		
		result = students.stream().filter(n -> n.getScore() >= 100)
			.mapToInt(s -> s.getScore())
			.reduce(0, new IntBinaryOperator() {
				
				@Override
				public int applyAsInt(int left, int right) {
					System.out.println("left: " + left + ", right: " + right);
					return left+right;
				}
			});
		System.out.println("집계결과 3: " + result);
	}
}
