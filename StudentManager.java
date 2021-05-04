package javaKampOdev;

public class StudentManager {
	public void Login(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+" logged in");
	}
	public void add(User user) {
		System.out.println(user.getFirstName()+ " added the course!");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+" deteled the course!");
	}

}
