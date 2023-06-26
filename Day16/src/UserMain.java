import java.util.HashMap;
import java.util.TreeMap;

class User {
	private String id;
	private String pw;

	public User() {
	}

	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}

public class UserMain {

	public static void main(String[] args) {

		// id pw 3
		User p = new User("p", "1111");
		User p2 = new User("p2", "2222");
		User p3 = new User("p3", "3333");

		HashMap<String, User> list = new HashMap<>();
		
		list.put(p.getId(), p);
		list.put(p2.getId(), p2);
		list.put(p3.getId(), p3);

		// 1. key가 있는지 확인
		// 2. id -> qwer (
		String find = "hjgk";
		
		for (String key : list.keySet()) {
			if (find.equals(key)) {

				// 찾았다. 그럼 수정

				list.get(key).setId(find);
				break;
			}
		}

		System.out.println(list);
		TreeMap<String, String> list2 = new TreeMap<>();
		list2.put("이서희", "010-1234-1234");
		list2.put("김다다", "010-2234-2234");
		list2.put("하하", "010-3334-3234");
		list2.put("유재석", "010-4434-4234");
		System.out.println(list2);
	}
}
