package intermediate;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample2 {
	public static void main(String[] args) {
		List<Employee> employees = Employee.persons();

//		employees.stream()
//			.map(t -> t.getName())
//			.filter(t -> t.startsWith("H"))
//			.forEach(s->System.out.println(s));
		
		// 방법 1
		employees.stream().map(t -> t.getName())
		
				.flatMap(t -> IntStream.range(0, t.length())
						.mapToObj(value -> t.charAt(value)))
				.forEach(s -> System.out.println(s));
	}
}

// 방법2
//		}).Map(new Function<String, Character>() {
//			@Override
//			public Character apply(String t) {
//				return IntStream.range(0, t.length()).mapToObj(new IntFunction<Character>() {
//
//					@Override
//					public Character apply(int value) {
//						System.out.println(t.charAt(value));
//						return t.charAt(value);
//					}
//				});
//			}
//		})
