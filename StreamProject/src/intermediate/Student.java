package intermediate;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public int getScore() {
		return this.score;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.score;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student std = (Student) obj;
		boolean stdBool = this.name.equals(std.name);
		boolean scoreBool = this.score==std.score;
		return stdBool && scoreBool;
	}
	
	@Override
	public String toString() {
		String str = String.format("%s %s", name, score);
		return str;
	}

	@Override
	public int compareTo(Student o) {
		// -1 오름차순 (음수)
		//  1 내림차순 (양수)
		//  0은 같다. (??)
//		return this.score - o.score; //점수기준
		return this.name.compareTo(o.name);
	}
}
