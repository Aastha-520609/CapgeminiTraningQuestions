
public class Demo {
	public static void main(String[] args) {
		Student model = retrieveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		//controller.setStudentRollNum("2000");
		//controller.updateView();
	}
	
	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Aastha");
		student.setRollNo("1000");
		return student;
	}

}
