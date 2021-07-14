
public class Patient {

	protected String patientId;

	protected String patientName;

	protected long mobileNumber;

	protected String gender;

	
	protected Patient(String patientId, String patientName, long mobileNumber, String gender) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}

	protected String getPatientId() {
		return patientId;
	}

	protected void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	protected String getPatientName() {
		return patientName;
	}

	protected void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	protected long getMobileNumber() {
		return mobileNumber;
	}

	protected void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	protected String getGender() {
		return gender;
	}

	protected void setGender(String gender) {
		this.gender = gender;
	}
}
