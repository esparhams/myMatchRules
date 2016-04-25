package gov.match.model;

import java.util.Date;


// Object containing just the basic patient info for quick viewing
// This is not a document in the datastore rather it is derived
// from the patient document on demand
public class BasicPatientData {
	private String patientSequenceNumber;
	private String currentStatus;
	private String currentStepNumber;
	private String diseases;
	private TreatmentArm currentTreatmentArm;
	private Date registrationDate;
	private Date offTrialDate;
	private String assignedTreatmentArm;
	private String assignedTreatmentArmVersion;

	public String getPatientSequenceNumber() {
		return patientSequenceNumber;
	}
	public void setPatientSequenceNumber(String patientSequenceNumber) {
		this.patientSequenceNumber = patientSequenceNumber;
	}
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	public String getCurrentStepNumber() {
		return currentStepNumber;
	}
	public void setCurrentStepNumber(String currentStepNumber) {
		this.currentStepNumber = currentStepNumber;
	}
	public String getDiseases() {
		return diseases;
	}
	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}
	public TreatmentArm getCurrentTreatmentArm() {
		return currentTreatmentArm;
	}
	public void setCurrentTreatmentArm(TreatmentArm currentTreatmentArm) {
		this.currentTreatmentArm = currentTreatmentArm;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public Date getOffTrialDate() {
		return offTrialDate;
	}
	public void setOffTrialDate(Date offTrialDate) {
		this.offTrialDate = offTrialDate;
	}
	public String getAssignedTreatmentArm() {
		return assignedTreatmentArm;
	}
	public void setAssignedTreatmentArm(String patientAssignment) {
		this.assignedTreatmentArm = patientAssignment;
	}
	public String getAssignedTreatmentArmVersion() {
		return assignedTreatmentArmVersion;
	}
	public void setAssignedTreatmentArmVersion(
			String assignedTreatmentArmVersion) {
		this.assignedTreatmentArmVersion = assignedTreatmentArmVersion;
	}
}
