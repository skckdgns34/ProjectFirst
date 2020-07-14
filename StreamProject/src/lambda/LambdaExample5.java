package lambda;

import java.util.function.IntBinaryOperator;

class GetMax implements IntBinaryOperator {

	@Override
	public int applyAsInt(int left, int right) {
		return left > right ? left:right;
	}
}
class GetMin implements IntBinaryOperator {

	@Override
	public int applyAsInt(int left, int right) {
		return left < right ? left:right;
	}
}


public class LambdaExample5 {
	private static int[] scores = { 10, 50, 3 };



	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		int max = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				if (left >= right)
					return left;
				else
					return right;
			}
		});

		System.out.println("최대값: " + max);

		int min = maxOrMin((a, b) -> a<=b ? a:b);
		System.out.println("최소값: " + min);
		
		int result = maxOrMin(new GetMax());
		System.out.println("결과값: " + result);
	}

}
