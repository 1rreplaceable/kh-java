
public class Person {

	private String name;
	private String phnum;
	private String address;
	public Person(){}
	public Person(String name, String phnum, String address) {
		this.name = name;
		this.phnum = phnum;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnum() {
		return phnum;
	}
	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
