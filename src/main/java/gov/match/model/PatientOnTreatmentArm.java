package gov.match.model;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

import gov.match.enumeration.PatientStatus;

//http://localhost:9000/views/patientAssignmentReasons.html?
//patientId=232re_Random&biopsySequenceNumber=N-15-00005
//&molecularSequenceNumber=232_N-15-00005
//&jobName=somejob1
//&treatmentArmId=CukeTest-125_GDC_PIK
//&dateAssigned=1433513264788
//&patientStatus=ON_TREATMENT_ARM
//&patientStepNumber=1

//http://localhost:9000/views/ngsRuns.html?
//treatmentArmId=CukeTest-125_GDC_PIK
//&patientId=232re_Random
//&biopsySequenceNumber=N-15-00005
//&molecularSequenceNumber=232_N-15-00005
//&jobName=somejob1
//&status=CONFIRMED


public class PatientOnTreatmentArm implements Comparator<PatientOnTreatmentArm>{
	private String slot;
	private String patientSequenceNumber;
	private PatientStatus patientStatus;
	private String formattedPatientStatus;
	private String treatmentArmId;
	private String treatmentArmVersion;
	private String assignmentReason;
	private Date dateSelected;
	private Date dateOnArm;
	private Date dateOffArm;
	private String formattedDiseaseNames;
	
	private List<Disease> diseases;
	
	//for patient assignment link
	private String biopsySequenceNumber;
	private String molecularSequenceNumber;
	private String ngsIdentifier;
	private Date dateAssigned;
	private String stepNumber;
	
	//for variant report link
	private boolean variantReportConfirmed;

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public String getPatientSequenceNumber() {
		return patientSequenceNumber;
	}

	public void setPatientSequenceNumber(String patientSequenceNumber) {
		this.patientSequenceNumber = patientSequenceNumber;
	}

	public PatientStatus getPatientStatus() {
		return patientStatus;
	}

	public void setPatientStatus(PatientStatus patientStatus) {
		this.patientStatus = patientStatus;
	}

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

	public String getBiopsySequenceNumber() {
		return biopsySequenceNumber;
	}

	public void setBiopsySequenceNumber(String biopsySequenceNumber) {
		this.biopsySequenceNumber = biopsySequenceNumber;
	}

	public String getMolecularSequenceNumber() {
		return molecularSequenceNumber;
	}

	public void setMolecularSequenceNumber(String molecularSequenceNumber) {
		this.molecularSequenceNumber = molecularSequenceNumber;
	}

	public String getNgsIdentifier() {
		return ngsIdentifier;
	}

	public void setNgsIdentifier(String ngsIdentifier) {
		this.ngsIdentifier = ngsIdentifier;
	}

	public Date getDateAssigned() {
		return dateAssigned;
	}

	public void setDateAssigned(Date dateAssigned) {
		this.dateAssigned = dateAssigned;
	}

	public String getStepNumber() {
		return stepNumber;
	}

	public void setStepNumber(String stepNumber) {
		this.stepNumber = stepNumber;
	}

	public boolean isVariantReportConfirmed() {
		return variantReportConfirmed;
	}

	public void setVariantReportConfirmed(boolean variantReportConfirmed) {
		this.variantReportConfirmed = variantReportConfirmed;
	}

	public Date getDateSelected() {
		return dateSelected;
	}

	public void setDateSelected(Date dateSelected) {
		this.dateSelected = dateSelected;
	}

	public Date getDateOnArm() {
		return dateOnArm;
	}

	public void setDateOnArm(Date dateOnArm) {
		this.dateOnArm = dateOnArm;
	}

	public Date getDateOffArm() {
		return dateOffArm;
	}

	public void setDateOffArm(Date dateOffArm) {
		this.dateOffArm = dateOffArm;
	}

	public String getFormattedDiseaseNames() {
		return formattedDiseaseNames;
	}

	public void setFormattedDiseaseNames(String formattedDiseaseNames) {
		this.formattedDiseaseNames = formattedDiseaseNames;
	}

	public String getFormattedPatientStatus() {
		return formattedPatientStatus;
	}

	public void setFormattedPatientStatus(String formattedPatientStatus) {
		this.formattedPatientStatus = formattedPatientStatus;
	}

	public String getAssignmentReason() {
		return assignmentReason;
	}

	public void setAssignmentReason(String assignmentReason) {
		this.assignmentReason = assignmentReason;
	}

	public List<Disease> getDiseases() {
		return diseases;
	}

	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}

	public int compare(PatientOnTreatmentArm o1,
			PatientOnTreatmentArm o2) {
		if((o1.getDateSelected() == null) || (o2.getDateSelected() == null))
			return 0;
		return (o1.getDateSelected().compareTo(o2.getDateSelected()));
	}

}
