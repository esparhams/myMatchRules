package gov.match.model;

import java.util.Date;

import gov.match.enumeration.TreatmentArmStatus;

//Object containing just the basic treatment arm info for quick viewing
//This is not a document in the datastore rather it is derived
//from the patient document on demand
public class BasicTreatmentArmData {
	
	private String treatmentArmId;
	private String treatmentArmName;
	private int currentPatients;
	private int formerPatients;
	private int notEnrolledPatients;
	private int pendingPatients;
	private TreatmentArmStatus treatmentArmStatus;
	private Date dateCreated;
	private Date dateOpened;
	private Date dateClosed;
	private Date dateSuspended;
	
	public String getTreatmentArmId() {
		return treatmentArmId;
	}
	public void setTreatmentArmId(String treatmentArmId) {
		this.treatmentArmId = treatmentArmId;
	}
	public String getTreatmentArmName() {
		return treatmentArmName;
	}
	public void setTreatmentArmName(String treatmentArmName) {
		this.treatmentArmName = treatmentArmName;
	}
	public int getCurrentPatients() {
		return currentPatients;
	}
	public void setCurrentPatients(int currentPatients) {
		this.currentPatients = currentPatients;
	}
	public int getFormerPatients() {
		return formerPatients;
	}
	public void setFormerPatients(int formerPatients) {
		this.formerPatients = formerPatients;
	}
	public int getNotEnrolledPatients() {
		return notEnrolledPatients;
	}
	public void setNotEnrolledPatients(int notEnrolledPatients) {
		this.notEnrolledPatients = notEnrolledPatients;
	}
	public int getPendingPatients() {
		return pendingPatients;
	}
	public void setPendingPatients(int pendingPatients) {
		this.pendingPatients = pendingPatients;
	}
	public TreatmentArmStatus getTreatmentArmStatus() {
		return treatmentArmStatus;
	}
	public void setTreatmentArmStatus(TreatmentArmStatus treatmentArmStatus) {
		this.treatmentArmStatus = treatmentArmStatus;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public Date getDateOpened() {
		return dateOpened;
	}
	public void setDateOpened(Date dateOpened) {
		this.dateOpened = dateOpened;
	}
	public Date getDateClosed() {
		return dateClosed;
	}
	public void setDateClosed(Date dateClosed) {
		this.dateClosed = dateClosed;
	}
	
	public Date getDateSuspended() {
		return dateSuspended;
	}
	public void setDateSuspended(Date dateSuspended) {
		this.dateSuspended = dateSuspended;
	}
	
	public void incrementCurrentPatientCounter() {
		this.currentPatients += 1;
	}
	
	public void incrementFormerPatientCounter() {
		this.formerPatients += 1;
	}
	
	public void incrementNotEnrolledPatientCounter() {
		this.notEnrolledPatients += 1;
	}
	
	public void incrementPendingPatientCounter() {
		this.pendingPatients += 1;
	}

}
