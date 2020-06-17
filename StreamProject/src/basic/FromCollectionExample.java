package basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

class Student{
	private String name;
	private int score;
	
	public Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
}

public class FromCollectionExample {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Hong",35), new Student("Hwang",55), new Student("Park",60));

//		Stream<Student> stream = students.stream();
		students.stream().filter((t)-> t.getScore() > 50)
		.forEach((t) ->System.out.println(t.getName() + ", " + t.getScore()));
	}
}
