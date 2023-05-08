package Variable;

class Employee {

	String name; // 이름
	int[] hours; // 요일별 일한 시간

	public Employee(String name, int[] hours) {
		this.name = name;
		this.hours = hours;
	}

	// 시간을 출력
	void printTotalHours() {
		System.out.println(name + " -> " + totalHours() + " 시간");
	}

	// 시간 계산
	int totalHours() {

		int sum = 0;
//		for(int i =0; i <hours.length; i++) {
//			sum+= hours[i];
//		}
		for (int num : hours) {
			sum += num;
		}

		return sum;
	}

}

public class ReferenceVar {

	public static void main(String[] args) {

		int[] hours0 = { 2, 4, 3, 4, 5, 8, 8 };
		int[] hours1 = { 7, 3, 4, 3, 3, 4, 4 };
		int[] hours2 = { 3, 3, 4, 3, 3, 2, 2 };
		int[] hours3 = { 9, 3, 4, 7, 3, 4, 1 };
		int[] hours4 = { 3, 5, 4, 3, 6, 3, 8 };
		int[] hours5 = { 3, 4, 4, 6, 3, 4, 4 };
		int[] hours6 = { 3, 7, 4, 8, 3, 8, 4 };
		int[] hours7 = { 6, 3, 5, 9, 2, 7, 9 };

		Employee[] list = new Employee[8];
		Employee e0 = new Employee("직원0", hours0);
		Employee e1 = new Employee("직원1", hours1);
		Employee e2 = new Employee("직원2", hours2);
		Employee e3 = new Employee("직원3", hours3);
		Employee e4 = new Employee("직원4", hours4);
		Employee e5 = new Employee("직원5", hours5);
		Employee e6 = new Employee("직원6", hours6);
		Employee e7 = new Employee("직원7", hours7);

		list[0] = e0;
		list[1] = e1;
		list[2] = e2;
		list[3] = e3;
		list[4] = e4;
		list[5] = e5;
		list[6] = e6;
		list[7] = e7;
		
		for (Employee employee : list) {
			employee.printTotalHours();
		}


//		레퍼런스 변수
//		레퍼런스 변수란, 객체를 가리키는 변수다.
//		기본형 변수는 값을 직접 저장하나, 레퍼런스 변수는 객체의 위치를 가리킨다.
//		static 키워드
//		static 키워드는 필드와 메소드에 적용될 수 있다.
//		클래스 변수
//		클래스 변수란, 클래스 영역에 존재한다.
//		인스턴스 변수란, 객체 내부에 존재한다.
//		인스턴스 변수
//		클래스 메소드란, 주체 객체가 없이 수행되는 메소드다.
//		인스턴스 메소드란, 주체 객체가 실행하는 메소드다.
	}

}
