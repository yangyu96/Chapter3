package in.pacifico.bean;

public class Applicant_Hostel {
	private int studentId ;
	private int roomMateId ;
	private String roomNo ;
	@Override
	public String toString() {
		return "Applicant_Hostel [studentId=" + studentId + ", roomMateId="
				+ roomMateId + ", roomNo=" + roomNo + "]";
	}
	public Applicant_Hostel(int studentId, int roomMateId, String roomNo) {
		super();
		this.studentId = studentId;
		this.roomMateId = roomMateId;
		this.roomNo = roomNo;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getRoomMateId() {
		return roomMateId;
	}
	public void setRoomMateId(int roomMateId) {
		this.roomMateId = roomMateId;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

}
