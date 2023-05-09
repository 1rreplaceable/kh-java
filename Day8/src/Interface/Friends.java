package Interface;

interface FriendComment {
	void friendComment();
}
public class Friends implements FriendComment{

	String job;
	String firstName;
	
	
	public Friends(String job, String firstName) {
		super();
		this.job = job;
		this.firstName = firstName;
	}



	@Override
	public void friendComment() {
		System.out.println("칭구 아이가!");
	}

}
