package CoreJava;

public class Student1 {
	//Creating the main class to access/use the methods in Students Class 
	public static void main(String[] args) {
		// Creating object of class Student
		Student student = new Student();
		//Object is use to access the methods of the class
		student.setId(1234);
		student.setName("Narendra");
		student.setAge(20);
		      
		System.out.println("Student Data");
		System.out.println("Student Id: " + student.getId());
		System.out.println("Student Name: " + student.getName());
		System.out.println("Student Age: " + student.getAge());

	}

}
