public class StudentController {
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	//model Controller
	public String getStudentName() {
		return model.getName();
	}
	
	public void setStudentName(String name) {
		model.setName(name);
	}
	
	public String getStudentRollNum() {
		return model.getRollNo();
	}
	
	public void setStudentRollNum(String rollNo) {
		model.setRollNo(rollNo);
	}
	
	//view controller
	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}

}
