package gov.match.model;

import gov.match.enumeration.PatientAssignmentStatus;
import gov.match.model.message.PatientAssignmentMessage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class PatientAssignment  implements Comparable<PatientAssignment> {
	private Date dateAssigned;
	
	@NotEmpty
	private String biopsySequenceNumber; 
	 
	private TreatmentArm treatmentArm;

	// do we need to add a date?
	private PatientAssignmentStatus patientAssignmentStatus;

	private List<PatientAssignmentLogic> patientAssignmentLogic;
	
	// From ECOG PatientAssignment message; explains why a patient is ineligible for a particular TreatmentArm.
	private String patientAssignmentStatusMessage;
	
	@NotEmpty
	@Pattern(regexp = "[0-7]")
	private String stepNumber;
	
	private List<PatientAssignmentMessage> patientAssignmentMessages;
	
	//Confirm button clicked
	private Date dateConfirmed;
	
	//Each time the assignment is sent to ECOG
	//In the case where ECOG is down, this is renewed every time the assignment report is attempted to be sent
	//private Date dateConfirmationEnqueued;
	private Date dateSentToECOG;
	
	private Date dateReceivedByECOG;
	
	private Date dateRejected;

	public Date getDateSentToECOG() {
		return dateSentToECOG;
	}

	public void setDateSentToECOG(Date dateSentToECOG) {
		this.dateSentToECOG = dateSentToECOG;
	}

	public Date getDateReceivedByECOG() {
		return dateReceivedByECOG;
	}

	public void setDateReceivedByECOG(Date dateReceivedByECOG) {
		this.dateReceivedByECOG = dateReceivedByECOG;
	}

	public PatientAssignment() {
		patientAssignmentLogic = new ArrayList<PatientAssignmentLogic>();
		patientAssignmentMessages = new ArrayList<PatientAssignmentMessage>();
	}

	public Date getDateAssigned() {
		return dateAssigned;
	}

	public void setDateAssigned(Date dateAssigned) {
		this.dateAssigned = dateAssigned;
	}
	
	public String getBiopsySequenceNumber() {
		return biopsySequenceNumber;
	}
	
	public void setBiopsySequenceNumber(String biopsySequenceNumber) {
		this.biopsySequenceNumber = biopsySequenceNumber;
	}

	public TreatmentArm getTreatmentArm() {
		return treatmentArm;
	}

	public void setTreatmentArm(TreatmentArm treatmentArm) {
		this.treatmentArm = treatmentArm;
	}

	public List<PatientAssignmentLogic> getPatientAssignmentLogic() {
		return patientAssignmentLogic;
	}

	public void setPatientAssignmentLogic(List<PatientAssignmentLogic> patientAssignmentLogic) {
		this.patientAssignmentLogic = patientAssignmentLogic;
	}

	public PatientAssignmentStatus getPatientAssignmentStatus() {
		return patientAssignmentStatus;
	}

	public void setPatientAssignmentStatus(
			PatientAssignmentStatus patientAssignmentStatus) {
		this.patientAssignmentStatus = patientAssignmentStatus;
	}
	
	public String getPatientAssignmentStatusMessage() {
		return patientAssignmentStatusMessage;
	}

	public void setPatientAssignmentStatusMessage(
			String patientAssignmentStatusMessage) {
		this.patientAssignmentStatusMessage = patientAssignmentStatusMessage;
	}
	
	public void appendPatientAssignmentLogic(PatientAssignmentLogic patientAssignmentLogic) {
		this.patientAssignmentLogic.add(patientAssignmentLogic);
	}

	public int compareTo(PatientAssignment o) {
		return getDateAssigned().compareTo(o.getDateAssigned());
	}
	
	public String getStepNumber() {
		return stepNumber;
	}
	public void setStepNumber(String stepNumber) {
		this.stepNumber = stepNumber;
	}
	
	public List<PatientAssignmentMessage> getPatientAssignmentMessage() {
		return patientAssignmentMessages;
	}

	public void setPatientAssignmentMessage(
			List<PatientAssignmentMessage> patientAssignmentMessage) {
		this.patientAssignmentMessages = patientAssignmentMessage;
	}
	
	public void appendPatientAssignmentMessage(PatientAssignmentMessage patientAssignmentMessage) {
		if (this.patientAssignmentMessages == null)
			this.patientAssignmentMessages = new ArrayList<PatientAssignmentMessage>();
		this.patientAssignmentMessages.add(patientAssignmentMessage);
	}
	
	public PatientAssignmentLogic getPatientAssignmentLogicFromTreatmentArmId(String treatmentArmId) {
		for (PatientAssignmentLogic logic : getPatientAssignmentLogic()) {
			if(logic.getTreatmentArmId() != null)
				if (logic.getTreatmentArmId().equals(treatmentArmId))
					return logic;
		}
		return null;
	}

	public Date getDateConfirmed() {
		return dateConfirmed;
	}

	public void setDateConfirmed(Date dateConfirmed) {
		this.dateConfirmed = dateConfirmed;
	}

	public Date getDateRejected() {
		return dateRejected;
	}

	public void setDateRejected(Date dateRejected) {
		this.dateRejected = dateRejected;
	}
	
}
