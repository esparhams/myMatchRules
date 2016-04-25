package gov.match.model;

import gov.match.enumeration.Ethnicity;
import gov.match.enumeration.Gender;
import gov.match.enumeration.PatientStatus;
import gov.match.enumeration.Race;
import gov.match.model.message.AssayMessage;
import gov.match.model.message.MdAndersonMessage;
import gov.match.model.message.PatientRejoinTrigger;
import gov.match.model.message.PatientTrigger;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Patient extends MatchObject implements Comparable<Patient> {
	@NotEmpty
	String patientSequenceNumber;
	
	@NotNull
	Gender gender = Gender.UNKNOWN;
	
	@NotNull 
	Ethnicity ethnicity = Ethnicity.UNKNOWN;
	
	@NotNull
	Set<Race> races;
	
	@Valid
	List<PatientRejoinTrigger> patientRejoinTriggers;
	
	@Valid
	List<PatientTrigger> patientTriggers;
	
	@Valid
	List<Biopsy> biopsies;
	
	@Pattern(regexp = "[0-7]")
	String currentStepNumber;
	
	TreatmentArm currentTreatmentArm;
	
	PatientAssignmentLogic currentPatientAssignmentLogic;
	
	PatientStatus currentPatientStatus;
	
	@Valid
	List<PatientAssignment> patientAssignments;
	
	/**
	 * A list of cancer diseases for this patient.
	 */
	List<Disease> diseases;
	
	@Pattern(regexp = "[Y|N|U|W]")
	String concordance = "U";
	
	/**
	 * A list of prior therapies (drugs) that the patient
	 * has taken that would exclude him/her from being
	 * assigned to a treatment arm.
	 */
	List<DrugCombo> priorDrugs;
	
	/**
	 * A list of criteria that excludes this patient from
	 * being assigned to a treatment arm.
	 */
	List<ExclusionCriteria> exclusionCriterias;
	
	/**
	 * The date the patient was registered with MATCH.
	 */
	Date registrationDate;

	
	public Patient () {
		races = new HashSet<Race>();
		patientRejoinTriggers = new ArrayList<PatientRejoinTrigger>();
		patientTriggers = new ArrayList<PatientTrigger>();
		biopsies = new ArrayList<Biopsy>();
		patientAssignments = new ArrayList<PatientAssignment>();
		diseases = new ArrayList<Disease>();
		priorDrugs = new ArrayList<DrugCombo>();
		exclusionCriterias = new ArrayList<ExclusionCriteria>();
	}

	public String getPatientSequenceNumber() {
		return patientSequenceNumber;
	}

	public void setPatientSequenceNumber(String patientSequenceNumber) {
		this.patientSequenceNumber = patientSequenceNumber;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Ethnicity getEthnicity() {
		return ethnicity;
	}
	
	public void setEthnicity(Ethnicity ethnicity) {
		this.ethnicity = ethnicity;
	}
	
	public Set<Race> getRaces() {
		return races;
	}
	
	public void setRaces(Set<Race> races) {
		this.races = races;
	}
	
	public void appendRace(Race race) {
		this.races.add(race);
	}
	
	public String getCurrentStepNumber() {
		return currentStepNumber;
	}

	public void setCurrentStepNumber(String currentStepNumber) {
		this.currentStepNumber = currentStepNumber;
	}
	
	public TreatmentArm getCurrentTreatmentArm() {
		return currentTreatmentArm;
	}
	public void setCurrentTreatmentArm(TreatmentArm currentTreatmentArm) {
		this.currentTreatmentArm = currentTreatmentArm;
	}

	public PatientAssignmentLogic getCurrentPatientAssignmentLogic() {
		return currentPatientAssignmentLogic;
	}
	public void setCurrentPatientAssignmentLogic(PatientAssignmentLogic currentPatientAssignmentLogic) {
		this.currentPatientAssignmentLogic = currentPatientAssignmentLogic;
	}
	
	public PatientStatus getCurrentPatientStatus() {
		return currentPatientStatus;
	}

	public void setCurrentPatientStatus(PatientStatus currentPatientStatus) {
		this.currentPatientStatus = currentPatientStatus;
	}
	
	public List<PatientRejoinTrigger> getPatientRejoinTriggers() {
		return patientRejoinTriggers;
	}
	
	public void setPatientRejoinTriggers(List<PatientRejoinTrigger> patientRejoinTriggers) {
		this.patientRejoinTriggers = patientRejoinTriggers;
	}
	
	public void appendPatientRejoinTrigger(PatientRejoinTrigger patientRejoinTrigger) {
		this.patientRejoinTriggers.add(patientRejoinTrigger);
	}

	public List<PatientTrigger> getPatientTriggers() {
		return patientTriggers;
	}

	public void setPatientTriggers(List<PatientTrigger> patientTriggers) {
		this.patientTriggers = patientTriggers;
	}
	
	public void appendPatientTrigger(PatientTrigger patientTrigger) {
		this.setCurrentStepNumber(patientTrigger.getStepNumber());
		this.setCurrentPatientStatus(patientTrigger.getPatientStatus());
		this.patientTriggers.add(patientTrigger);
	}

	public List<Biopsy> getBiopsies() {
		return biopsies;
	}

	public void setBiopsies(List<Biopsy> biopsies) {
		this.biopsies = biopsies;
	}	
	
	public void appendBiopsy(Biopsy biopsy) {
		this.biopsies.add(biopsy);
	}
	
	public List<PatientAssignment> getPatientAssignments() {
		return patientAssignments;
	}
	
	public void setPatientAssignments(List<PatientAssignment> patientAssignments) {
		this.patientAssignments = patientAssignments;
	}
	
	public void appendPatientAssignment(PatientAssignment patientAssignment) {
		this.patientAssignments.add(patientAssignment);
	}

	public List<Disease> getDiseases() {
		return diseases;
	}

	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}

	public void appendDisease(Disease disease) {
		this.diseases.add(disease);
	}
	
	public void removeDiseases() {
		this.diseases.clear();
	}
	
	public String getConcordance() {
		return this.concordance;
	}
	
	public void setConcordance(String concordance) {
		this.concordance = concordance;
	}
	
	public List<DrugCombo> getPriorDrugs() {
		return priorDrugs;
	}
	
	public void setPriorDrugs(List<DrugCombo> priorDrugs) {
		this.priorDrugs = priorDrugs;
	}
	
	public void appendPriorDrug(DrugCombo priorDrug) {
		this.priorDrugs.add(priorDrug);
	}
	
	public List<ExclusionCriteria> getExclusionCriterias() {
		return exclusionCriterias;
	}
	
	public void setExclusionCriterias(List<ExclusionCriteria> exclusionCriterias) {
		this.exclusionCriterias = exclusionCriterias;
	}
	
	public void appendExclusionCriteria(ExclusionCriteria exclusionCriteria) {
		this.exclusionCriterias.add(exclusionCriteria);
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	public int compareTo(Patient o) {
		return getRegistrationDate().compareTo(o.getRegistrationDate());
	}

	public boolean updateBiopsy(MdAndersonMessage mdAndersonMessage) {
		for (Biopsy currentBiopsy : biopsies) {
			if (currentBiopsy.getBiopsySequenceNumber().equals(mdAndersonMessage.getBiopsySequenceNumber())) {
				currentBiopsy.appendMdAndersonMessage(mdAndersonMessage);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateBiopsy(AssayMessage assayMessage) {
		for (Biopsy currentBiopsy : biopsies) {
			if (currentBiopsy.getBiopsySequenceNumber().equals(assayMessage.getBiopsySequenceNumber())) {
				currentBiopsy.appendAssayMessage(assayMessage);
				return true;
			}
		}
		return false;
	}
	
	public List<Biopsy> getSuccessfulBiopsies() {
		List<Biopsy> receivedBiopsies = new ArrayList<Biopsy>();		
		for (Biopsy currentBiopsy : biopsies) {
			if (!currentBiopsy.isFailure()) {
				receivedBiopsies.add(currentBiopsy);
			}
		}
		return receivedBiopsies;
	}
}