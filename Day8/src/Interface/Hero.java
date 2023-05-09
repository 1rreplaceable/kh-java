package Interface;

public interface Hero {
	// 체력
	int MAX_HP = 100;

	// 공격력
	void attack();

	// 치료(힐)
	void heal(int portion);
}
