
public class InPatient extends Patient{
	
	protected double roomRent;
	
	protected InPatient(String patientId, String patientName, long mobileNumber, String gender, double roomRent) {
		super(patientId, patientName, mobileNumber, gender);
		this.roomRent = roomRent;
	}

	protected double getRoomRent() {
		return roomRent;
	}

	protected void setRoomRent(double roomRent) {
		this.roomRent = roomRent;
	}
	
	public double calculateTotalBill(int noOfDays,double medicinalBill) {
		return getRoomRent()*noOfDays+medicinalBill;
	}
}
