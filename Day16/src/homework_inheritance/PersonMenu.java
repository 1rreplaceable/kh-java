package homework_inheritance;

import java.util.Scanner;

public class PersonMenu {

	Scanner in = new Scanner(System.in);
	PersonController pc = new PersonController();

	public void mainMenu() {
		System.out.println("학생은 최대 3명까지 저장할수 있습니다.");
		System.out.println("현재 저장된 학생은 명입니다.");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 명입니다.");
		while (true) {
			System.out.println();
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			int choice = in.nextInt();
			if (choice == 1) {
				studentMenu();
			} else if (choice == 2) {
				employeeMenu();
			} else if (choice == 9) {
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}

	}

	public void studentMenu() {
		while (true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.println("메뉴 번호 : ");
			int choiceStu = in.nextInt();
			in.nextLine();
			if (choiceStu == 1) {
				insertStudent();
			} else if (choiceStu == 2) {
				printStudent();
			} else if (choiceStu == 9) {
				System.out.println("메인으로 돌아갑니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void employeeMenu() {
		while (true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			System.out.println("메뉴 번호 : ");
			int choiceEmp = in.nextInt();
			in.nextLine();
			if (choiceEmp == 1) {
				insertEmployee();
			} else if (choiceEmp == 2) {
				printEmployee();
			} else if (choiceEmp == 9) {
				System.out.println("메인으로 돌아갑니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void insertStudent() {
		while (true) {
			int[] a = pc.personCount();
			if (a[0] < 3) {

				System.out.println("학생 이름 : ");
				String stuName = in.nextLine();
				System.out.println("학생 나이 : ");
				int stuAge = in.nextInt();
				System.out.println("학생 키 : ");
				double stuHei = in.nextDouble();
				System.out.println("학생 몸무게 : ");
				double stuWei = in.nextDouble();
				System.out.println("학생 학년 : ");
				int stuGrade = in.nextInt();
				in.nextLine();
				System.out.println("학생 전공 : ");
				String stuMajor = in.nextLine();

				pc.insertStudent(stuName, stuAge, stuHei, stuWei, stuGrade, stuMajor);

				System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 :");
				String stuGoStop = in.nextLine();
				if (stuGoStop.equals("N") || stuGoStop.equals("n")) {
					break;
				} else {
					continue;
				}
			} else {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				break;
			}
		}
	}

	public void printStudent() {
		for (Student student : pc.printStudent()) {
			System.out.println(student);
		}

	}

	public void insertEmployee() {
		while (true) {
			int[] a = pc.personCount();
			if (a[1] < 10) {

				System.out.println("사원 이름 : ");
				String empName = in.nextLine();
				System.out.println("사원 나이 : ");
				int empAge = in.nextInt();
				System.out.println("사원 키 : ");
				double empHei = in.nextDouble();
				System.out.println("사원 몸무게 : ");
				double empWei = in.nextDouble();
				System.out.println("사원 급여 : ");
				int empSalary = in.nextInt();
				in.nextLine();
				System.out.println("사원 부서 : ");
				String empDept = in.nextLine();

				pc.insertEmployee(empName, empAge, empHei, empWei, empSalary, empDept);

				System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 :");
				String empGoStop = in.nextLine();
				if (empGoStop.equals("N") || empGoStop.equals("n")) {
					break;
				} else {
					continue;
				}
			} else {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
				break;
			}
		}
	}

	public void printEmployee() {
		for (Employee employee : pc.printEmployee()) {
			System.out.println(employee);
		}
	}
}
