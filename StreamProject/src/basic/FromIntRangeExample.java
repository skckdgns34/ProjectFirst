package basic;

import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static void main(String[] args) {
		IntStream stream = IntStream.range(11, 20); //range는 뒤에값은 포함안함
		IntStream stream1 = IntStream.rangeClosed(11, 20); //rangeClosed는 뒤에값도 포함
		
		IntPredicate predicate = new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value%2==1;
			}
		};
//		stream.filter(predicate).forEach(s -> System.out.println(s));
		
		Random random = new Random();
		IntStream stream2 = random.ints(20,11,100);
		stream2.filter(t-> 50<=t).filter(t-> t<60).forEach(s -> System.out.println(s));
	}
}
