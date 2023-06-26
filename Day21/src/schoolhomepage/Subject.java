package schoolhomepage;

public class Subject {

	private String title;
	private String datetime;

	public Subject() {
	}

	public Subject(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	@Override
	public String toString() {
		return title+"\t"+datetime;
	}

}
