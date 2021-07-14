
public class OutPatient extends Patient {

	protected double consultingFee;

	protected OutPatient(String patientId, String patientName, long mobileNumber, String gender, double consultingFee) {
		super(patientId, patientName, mobileNumber, gender);
		this.consultingFee = consultingFee;
	}
	
	protected double getConsultingFee() {
		return consultingFee;
	}

	protected void setConsultingFee(double consultingFee) {
		this.consultingFee = consultingFee;
	}
	
	
	public double calculateTotalBill(double scanPay,double medicinalBill) {
		return getConsultingFee()+scanPay+medicinalBill;
	}

}
