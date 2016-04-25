package gov.match.model.message;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import gov.match.enumeration.PatientStatus;

import org.hibernate.validator.constraints.NotEmpty;
import org.json.JSONObject;

public class PatientAssignmentMessage {
	@NotEmpty
	private String patientSequenceNumber;
	
	private String treatmentArmId; 
	
	private String treatmentArmName;

	@NotNull
	private PatientStatus status;
	
	private String message;
	
	@NotEmpty
	@Pattern(regexp = "[0-7]")
	private String stepNumber;

	public String getPatientSequenceNumber() {
		return patientSequenceNumber;
	}

	public void setPatientSequenceNumber(String patientSequenceNumber) {
		this.patientSequenceNumber = patientSequenceNumber;
	}

	public String getTreatmentArmId() {
		return treatmentArmId;
	}

	public void setTreatmentArmId(String treatmentArmId) {
		this.treatmentArmId = treatmentArmId;
	}

	public PatientStatus getStatus() {
		return status;
	}

	public void setStatus(PatientStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
	
	public String getStepNumber() {
		return stepNumber;
	}

	public void setStepNumber(String stepNumber) {
		this.stepNumber = stepNumber;
	}
	
	public String getTreatmentArmName() {
		return treatmentArmName;
	}

	public void setTreatmentArmName(String treatmentArmName) {
		this.treatmentArmName = treatmentArmName;
	}
	
	@Override
	public String toString() {
		JSONObject self = new JSONObject();
		self.put("patientSequenceNumber", patientSequenceNumber);
		self.put("treatmentArmId", treatmentArmId);
		self.put("treatmentArmName", treatmentArmName);
		self.put("status", (status != null) ? status.toString() : status);
		self.put("message", message);
		self.put("stepNumber", stepNumber);
		return self.toString();
	}
}