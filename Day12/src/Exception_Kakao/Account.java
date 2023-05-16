package Exception_Kakao;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
	ArrayList<Account> list = new ArrayList<>();
	int no;
	String name;
	int pw;
	public Account() {}
	int id = 1;
	
	public Account(int no, String name, int pw) {
		this.no = no;
		this.name = name;
		this.pw = pw;
	}

	void insert() {
		Account a = new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("고객계좌 등록");
		System.out.println("계좌번호>");
		a.no = sc.nextInt();sc.nextLine();
		System.out.println("이름>");
		a.name = sc.nextLine();
		System.out.println("비밀번호>");
		a.pw = sc.nextInt();
		a.id++;
		
		list.add(a);
	}
	void search(int userno) throws Exception{
		int num = 0;
		for (int i = 0; i<this.list.size(); i ++) {
			
			if(this.list.get(i).no == userno) {
				System.out.println("계좌번호: "+ this.list.get(i).no);
				System.out.println("이름: "+ this.list.get(i).name);
				System.out.println("비밀번호: "+ this.list.get(i).pw);
				System.out.println(id);
			}else {
				num += 1;
			}
			if (num == this.list.size()) {
				throw new Exception("찾는 고객이 없습니다.");
			}
		}
	}
	
}
