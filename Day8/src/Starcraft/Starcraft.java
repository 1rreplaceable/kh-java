package Starcraft;

interface Repairable{} // 기계들만 표시
interface Medical{}	// 사람만 표시

public class Starcraft {}

class 테란 extends Starcraft {}
class 저그 extends Starcraft {}
class 프로토스 extends Starcraft {}

abstract class Unit {
	final int maxhp;
	public int hp;
	int x, y;
	
	Unit(int maxhp){
		this.maxhp = maxhp;
		this.hp = maxhp;
	}
	abstract void attack(); // 공격
	abstract void move(); // 이동
}

class Dropship extends Unit implements Repairable{

	Dropship(int maxhp) {
		super(maxhp);
		// TODO Auto-generated constructor stub
	}
	@Override
	void attack() {}
	@Override
	void move() {}
}

class Tank extends Unit implements Repairable{

	Tank(int maxhp) {
		super(maxhp);
		// TODO Auto-generated constructor stub
	}
	@Override
	void attack() {}
	@Override
	void move() {}
}

class Marine extends Unit implements Medical{

	Marine(int maxhp) {
		super(maxhp);
		// TODO Auto-generated constructor stub
	}
	@Override
	void attack() {}
	@Override
	void move() {}
}

class Doctor extends Unit implements Medical{	// 사람만 고치는 의사
	
	Doctor(int maxhp) {
		super(maxhp);
	}

	void heal(Medical m) {
		Unit u = (Unit)m;
		while(u.hp <= u.maxhp) {
			
			System.out.println(u.hp++);
//			try {Thread.sleep(100);} 
//			catch (InterruptedException e) {} 
			// 프로그램 지연
			// 1초 1000
		}
		System.out.println("수리완료");
	}

	@Override
	void attack() {}

	@Override
	void move() {}
}

class SCV extends Unit implements Repairable{

	SCV(int maxhp) {
		super(maxhp);
	}
	// 자식클래스가 탱크 안에는 유닛과 Repairable 들어있다
	// 자식입장에서는 타입을 변환
	void repair(Repairable r) {
		Unit u = (Unit)r;
		while(u.hp <= u.maxhp) {
			
			System.out.println(u.hp++);
//			try {Thread.sleep(100);} 
//			catch (InterruptedException e) {} 
			// 프로그램 지연
			// 1초 1000
		}
		System.out.println("수리완료");
	}

	@Override
	void attack() {}

	@Override
	void move() {}
	
}

//// 빈 인터페이스
//// marker interface
////  상속관계가 아닌 클래스들을 그룹화 시켜줄 수 있다.
//interface a{}