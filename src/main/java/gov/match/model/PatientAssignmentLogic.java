package gov.match.model;

import org.hibernate.validator.constraints.NotBlank;
import gov.match.enumeration.PatientAssignmentReasonCategory;

public class PatientAssignmentLogic {

	/** The treatment arm id. */
	@NotBlank
	private String treatmentArmId;
	
	/** The version of the treatment arm that was used for this assignment. */
	private String treatmentArmVersion;
	
	/** The reason why a treatment arm was assigned or not assigned to the patient. */
	@NotBlank
	private String reason;
	
	@NotBlank
	private PatientAssignmentReasonCategory patientAssignmentReasonCategory;
	
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
	
	public PatientAssignmentReasonCategory getReasonCategory() {
		return patientAssignmentReasonCategory;
	}
	
	public void setReasonCategory(PatientAssignmentReasonCategory patientAssignmentReasonCategory) {
		this.patientAssignmentReasonCategory = patientAssignmentReasonCategory;
	}
}
