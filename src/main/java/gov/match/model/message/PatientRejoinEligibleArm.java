package gov.match.model.message;

public class PatientRejoinEligibleArm {
	private String treatmentArmId;
	private String treatmentArmVersion;
	private String reason;
	
	public String getTreatmentArmId() {
		return treatmentArmId;
	}
	
	public void setTreatmentArmId(String treatmentArmId) {
		this.treatmentArmId = treatmentArmId;
	}

	public String getTreatmentArmVersion() {
		return treatmentArmVersion;
	}

	public void setTreatmentArmVersion(String treatmentArmVersion) {
		this.treatmentArmVersion = treatmentArmVersion;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
