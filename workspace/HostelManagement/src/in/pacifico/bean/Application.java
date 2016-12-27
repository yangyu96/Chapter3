package in.pacifico.bean;

public class Application {
	private int applicationId ;
	private int studentId ;
	private double percentage ;
	private String roomNo ;
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public Application(int applicationId, int studentId, double percentage,
			String roomNo) {
		super();
		this.applicationId = applicationId;
		this.studentId = studentId;
		this.percentage = percentage;
		this.roomNo = roomNo;
	}
	
	

}
