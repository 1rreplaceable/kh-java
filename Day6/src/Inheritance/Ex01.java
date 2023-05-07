package Inheritance;

class Animal {
	String name;

	void cry() {
	}
}

class Pet extends Animal {
	String age;
	int price;

	void play() {
	}
	void petInfo() {
		System.out.println("Pet { name: " + this.name + ", age: " + this.age + ", price: " + this.price + "원 }");
	}
}

class Elf {
	String name;
	int hp;
}

class HighElf extends Elf {
	int mp;
}

class ElfLord extends HighElf {
	int shield;
}

class Cylinder {
	int radius;
	public Cylinder(int radius, int height) {
		super();
		this.radius = radius;
		this.height = height;
	}

	int height;

	double getVolume() {
		return ((radius * radius) * 3.14) * height;
	}

	double getArea() {
		return ((radius * radius) * 3.14 * 2) + 2 * 3.14 * radius * height;
	}
}

class Food{
	String name;
	int price;
	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	void foodInfo() {
		System.out.println("Food { name: "+this.name+", price: "+this.price+"원 }");
	}
}

public class Ex01 {

	public static void main(String[] args) {

		Pet a1 = new Pet();
		a1.name = "차우차우";
		a1.age = "3세";
		a1.price = 2200000;
		a1.petInfo();
		Elf e1 = new Elf();
		e1.name = "티란데";
		e1.hp = 100;
		HighElf e2 = new HighElf();
		e2.name = "말퓨리온";
		e2.hp = 100;
		e2.mp = 100;
		ElfLord e3 = new ElfLord();
		e3.name = "마이에브";
		e3.hp = 230;
		e3.mp = 140;
		e3.shield = 100;

		System.out.println("[엘프] Name: " + e1.name + ", HP: " + e1.hp);
		System.out.println("[하이엘프] Name: " + e2.name + ", HP: " + e1.hp + ", MP: " + e2.mp);
		System.out.println("[엘프로드] Name: " + e3.name + ", HP: " + e1.hp + ", MP: " + e3.mp + ", SH: " + e3.shield);
		
		Cylinder k = new Cylinder(20,10);
		
		System.out.println("원기둥의 부피: "+k.getVolume());
		System.out.println("원기둥의 겉넓이: "+k.getArea());
		
		Food f1 = new Food("치킨", 10000);
		Food f2 = new Food("피자", 28000);
		Food f3 = new Food("초밥세트", 22000);
		f1.foodInfo();
		f2.foodInfo();
		f3.foodInfo();
	}

}
