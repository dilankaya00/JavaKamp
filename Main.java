package javaKampOdev;

public class Main {

	public static void main(String[] args) {
		User user1= new Student("Ali", "Bayraktar","123");
		User user2= new Instructor("Engin","Demiroğ","1452");
		User user3 =new Student("Dilan","Kaya","3563");
	
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.Login(user2);
		instructorManager.CourseAdd(user2);
		
		StudentManager studentManager= new StudentManager();
		studentManager.Login(user1);
		studentManager.add(user1);
		studentManager.Login(user3);
		studentManager.delete(user3);
		
		
		

	}

}
