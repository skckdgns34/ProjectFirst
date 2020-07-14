package lambda;

import java.util.function.ToIntFunction;

public class LambdaExample6 {
	private static Student[] students = { new Student("홍길동", 90, 96), new Student("신용권", 95, 93) };

	// avg 메소드 작성
	private static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for (Student student : students) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / students.length;
		return avg;
	}

	// 그냥 메소드
	private static double avgTotal() {
		int sum = 0;
		for (Student student : students) {
			sum += student.getEnglishScore() + student.getMathScore();
		}
		return (double) sum / students.length;
	}

	public static double avgEnglish() {
		int sum = 0;
		for (Student student : students) {
			sum += student.getEnglishScore();
		}
		return (double) sum / students.length;
	}

	public static double avgMath() {
		int sum = 0;
		for (Student student : students) {
			sum += student.getMathScore();
		}
		return (double) sum / students.length;
	}

	public static void main(String[] args) {

		System.out.println("수학평균: " + avgMath());
		System.out.println("영어평균: " + avgEnglish());
		System.out.println("토탈평균: " + avgTotal());

		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("영어 평균 점수: " + englishAvg);

		double mathAvg = avg(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {

				return value.getMathScore();
			}

		});
		System.out.println("수학 평균 점수: " + mathAvg);

		double totalAvg = avg(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {

				return value.getMathScore() + value.getEnglishScore();
			}
		});
		System.out.println("전체 평균 점수: " + totalAvg);

	}

	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;

		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		public String getName() {
			return name;
		}

		public int getEnglishScore() {
			return englishScore;
		}

		public int getMathScore() {
			return mathScore;
		}
	}// end of Student
}
