package in.pacifico.bean;

public class Student {
	private int studentId ;
	private String name ;
	private double percentage ;
	private int semester ;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public Student(int studentId, String name, double percentage, int semester) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.percentage = percentage;
		this.semester = semester;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name
				+ ", percentage=" + percentage + ", semester=" + semester + "]";
	}
	

}
