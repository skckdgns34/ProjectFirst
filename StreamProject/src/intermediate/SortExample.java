package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortExample {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Hong", 30), new Student("Park", 15),
				new Student("Hwang", 25));

//		students.stream().sorted().forEach(s -> System.out.println(s));
		List<Person> persons = Arrays.asList(new Person("Hong", 30), new Person("Park", 15), new Person("Hwang", 25));
		persons.stream().sorted(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o2.name.compareTo(o1.name); //값이 음수가 반환
			}

		}).forEach(System.out::println);
	}
}
