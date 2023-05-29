package homework_inheritance;

public class Student extends Person{
	
	int grade;
	String major;
	
	public Student() {}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.grade = grade;
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return name + ", " + age + ", " + height + ", " + weight + ", " + grade +", " + major;
	}
	
	
	
	
}
