package gov.match.model.message;

import gov.match.enumeration.PatientStatus;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.json.JSONObject;

public class PatientTrigger implements Comparable<PatientTrigger>{

	@NotEmpty
	@Pattern(regexp = "EAY131")
	private String studyId;

	@NotEmpty
	private String patientSequenceNumber;

	@NotEmpty
	@Pattern(regexp = "[0-7]")
	private String stepNumber;

	private PatientStatus patientStatus;
	private String message;
	private String accrualGroupId;
	
	@NotNull
	private Date dateCreated;
	
	private Date auditDate;

	public PatientTrigger () {
		this.auditDate = new Date();
	}
	
	public Date getAuditDate() {
		return auditDate;
	}

	public String getStudyId() {
		return studyId;
	}
	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}
	public String getPatientSequenceNumber() {
		return patientSequenceNumber;
	}
	public void setPatientSequenceNumber(String patientSequenceNumber) {
		this.patientSequenceNumber = patientSequenceNumber;
	}
	public String getStepNumber() {
		return stepNumber;
	}
	public void setStepNumber(String stepNumber) {
		this.stepNumber = stepNumber;
	}
	public PatientStatus getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(PatientStatus patientStatus) {
		this.patientStatus = patientStatus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAccrualGroupId() {
		return accrualGroupId;
	}
	public void setAccrualGroupId(String accrualGroupId) {
		this.accrualGroupId = accrualGroupId;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		JSONObject self = new JSONObject();
		self.put("studyId", studyId);
		self.put("patientSequenceNumber", patientSequenceNumber);
		self.put("stepNumber", stepNumber);
		self.put("patientStatus", (patientStatus != null) ? patientStatus.toString() : null);
		self.put("message", message);
		self.put("accrualGroupId", accrualGroupId);
		self.put("dateCreated", (dateCreated != null) ? dateCreated.getTime() : null);
		return self.toString();
	}
	public int compareTo(PatientTrigger o) {
		return getDateCreated().compareTo(o.getDateCreated());
	}
}
