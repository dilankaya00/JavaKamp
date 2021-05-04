package javaKampOdev;

public class Student extends User {

	private String courseName;
	public Student(String firstName, String lastName, String password) {
		super(firstName, lastName, password);
		
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
