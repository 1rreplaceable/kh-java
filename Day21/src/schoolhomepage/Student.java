package schoolhomepage;

import java.util.ArrayList;

public class Student {

	private String name;
	private String id;
	private String pw;
	private String phnum;
	private int studySubject;
	private ArrayList<Subject> subjectlist = new ArrayList<>();

	public Student() {
	}

	public Student(String name, String id, String pw, String phnum, int studySubject, ArrayList<Subject> subjectlist) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phnum = phnum;
		this.studySubject = studySubject;
		this.subjectlist = subjectlist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPhnum() {
		return phnum;
	}

	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}

	public int getStudySubject() {
		return studySubject;
	}

	public void setStudySubject(int studySubject) {
		this.studySubject = studySubject;
	}

	public ArrayList<Subject> getSubjectlist() {
		return subjectlist;
	}

	public void setSubjectlist(ArrayList<Subject> subjectlist) {
		this.subjectlist = subjectlist;
	}

}
