package homework_inheritance;

public class Employee extends Person{

	int salary;
	String dept;
	
	public Employee() {}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.salary = salary;
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return name + ", " + age + ", " + height + ", " + weight + ", " + salary +", " + dept;
	}
	
	
	
}
