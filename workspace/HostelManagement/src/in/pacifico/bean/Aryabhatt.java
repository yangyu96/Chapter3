package in.pacifico.bean;

public class Aryabhatt {
	private String roomNo ;
	private String availability ;
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public Aryabhatt(String roomNo, String availability) {
		super();
		this.roomNo = roomNo;
		this.availability = availability;
	}
	
	
	

}
