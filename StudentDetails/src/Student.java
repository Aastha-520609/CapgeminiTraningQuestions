
public class Student {
	
	// Fill the code
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;
	
	public Student(int studentId, String studentName, String studentAddress, String collegeName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}
	
	public Student(int studentId, String studentName, String studentAddress) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = "NIT";
	}
	
	public int getStudentId() {
	  return studentId;
	}
	
	public void setStudentId() {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName() {
		this.studentName = studentName;
	}
	
	public String getStudentAddress() {
		return studentAddress;
	}
	
	public void setStudentAddress() {
		this.studentAddress = studentAddress;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
