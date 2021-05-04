package javaKampOdev;

public class InstructorManager {

	public void CourseAdd(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" added course");
	}
	public void Login(User user) {
		System.out.println(user.getFirstName()+" logged in");
	}
}
