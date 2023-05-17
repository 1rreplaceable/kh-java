package Object2;

class Person {

	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		// 만약 현 객체 this와 매개변수 객체가 같을 경우 true
		if (this == obj) {return true;}

		// 만약 Person타입이 아니다 호환되지 않으면 에러
		// true 객체 참조가 가능하다. false 객체랑 관계 없다
		// false 그대로 집어 넣으면 if문이 실행되지않는다
		if (!(obj instanceof Person)) {return false;}
		
		// 객체 비교
		// 지금현재 obj 부모타입 참조 다형성(업캐스팅)
		// 다운캐스팅	Object -> Person
		Person person = (Person)obj;
		
		if(person.name == this.name) {return true;}
		else {return false;}
	}

}

public class Main {

	public static void main(String[] args) {

		Person a1 = new Person("hello");
		Person a2 = new Person("hello");
		
		if (a1.equals(a2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

	}
}


