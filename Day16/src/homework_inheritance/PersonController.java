package homework_inheritance;

import java.util.ArrayList;

public class PersonController {

	int[] personCnt = new int[2];
	ArrayList<Student> stuList = new ArrayList<>();
	ArrayList<Employee> empList = new ArrayList<>();

	public int[] personCount() {
		personCnt[0] = stuList.size();
		personCnt[1] = empList.size();

		return personCnt;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {

		stuList.add(new Student(name, age, height, weight, grade, major));

	}

	public ArrayList<Student> printStudent() {
		return stuList;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {

		empList.add(new Employee(name, age, height, weight, salary, dept));

	}

	public ArrayList<Employee> printEmployee() {
		return empList;
	}

}
