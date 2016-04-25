package gov.match.model;

import gov.match.enumeration.TreatmentArmStatus;
import gov.match.model.mutations.VariantReport;
import gov.match.validator.ValidMLH1Result;
import gov.match.validator.ValidMSCH2Result;
import gov.match.validator.ValidPtenResult;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.match.builder.DrugComboBuilder;

/**
 * This model represents a treatment arm that is assigned to a cancer patient. The
 * treatment arm object will be stored in the treatment arm repository.
 */

@ValidPtenResult
@ValidMLH1Result
@ValidMSCH2Result
public class TreatmentArm extends MatchObject implements Comparable<TreatmentArm> {
	
	/**
	 * The default max number of patients that can be assigned to the treatment arm.
	 */
	private static final int DEFAULT_MAX_PATIENTS_ALLOWED = 35;
	
	/**
	 * The official name of the treatment arm.
	 */
	@NotEmpty
	private String name;
	
	/**
	 * The sub-protocol version of the treatment arm.
	 */
	@NotEmpty
	private String version;

	/**
	 * A free-formed description of this treatment arm.
	 */
	private String description;
	
	/**
	 * The id of the treatment arm target.
	 */
	
	private String targetId;
	
	/**
	 * The name of the treatment arm target.
	 */
	
	private String targetName;
	
	/**
	 * The gene this treatment arm is targeting. It is our current understanding that there is
	 * only one gene per treatment arm.
	 */
	
	private String gene;
	
	// All DRUG List should be understood as having a logical AND between
	// elements in the list.
	
	/**
	 * A list of drugs associated with this treatment arm.
	 */
	@NotEmpty
	@Valid
	private List<Drug> treatmentArmDrugs;
	
	/**
	 * A list of diseases that would exclude a patient form taking this treatment arm.
	 */
	private List<Disease> exclusionDiseases;
	
	/**
	 *  A list of drugs that would exclude a patient from taking this treatment arm.
	 */
	@Valid
	private List<DrugCombo> exclusionDrugs;
	
	/**
	 * A list of criteria that would exclude a patient from taking this treatment arm.
	 */
	@Valid
	private List<ExclusionCriteria> exclusionCriterias;
	
	/**
	 * A list of assay rules that would include/exclude a patient from taking this treatment arm.
	 */
	@Valid
	private List<AssayResult> assayResults;
	
	/**
	 * The number of patients assigned to this treatment arm.
	 */
	@Min(0)
	private int numPatientsAssigned;
	
	/**
	 * The max number of patients that can be assigned to this treatment arm.
	 */
	@Min(0)
	private int maxPatientsAllowed;
	
	// Purposefully, not a part of the newTreatmentArm Message
	// By Default all newTreatmentArms have a status of PENDING
	// because variants and rules have to be created and added.
	
	/**
	 * The status of the treatment arm.
	 */
	private TreatmentArmStatus treatmentArmStatus; 
	
	/**
	 * A list of variants that is associated to this treatment arm.
	 */
	private VariantReport variantReport;
	
	/**
	 * Stores the changing of status for this treatment arm.
	 */
	private Map<Long, TreatmentArmStatus> statusLog;
	
	/** 
	 * The date this treatment arm was added to the MATCH system. 
	 */
	private Date dateCreated;
	
	public TreatmentArm () {
		this.treatmentArmDrugs = new ArrayList<Drug>();
		this.exclusionDiseases = new ArrayList<Disease>();
		this.exclusionDrugs = new ArrayList<DrugCombo>();
		this.exclusionCriterias = new ArrayList<ExclusionCriteria>();
		this.assayResults = new ArrayList<AssayResult>();
		this.maxPatientsAllowed = DEFAULT_MAX_PATIENTS_ALLOWED;
		this.numPatientsAssigned = 0;
		this.treatmentArmStatus = TreatmentArmStatus.PENDING;
		this.statusLog = new HashMap<Long, TreatmentArmStatus>();
		this.dateCreated = new Date();
		this.statusLog.put(this.dateCreated.getTime(), this.treatmentArmStatus);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getTargetId() {
		return targetId;
	}
	
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
	
	public String getTargetName() {
		return targetName;
	}
	
	public String getGene() {
		return gene;
	}
	
	public void setGene(String gene) {
		this.gene = gene;
	}
	
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}
	
	public DrugCombo getTreatmentArmCombo() {
		DrugComboBuilder builder = new DrugComboBuilder();
		for (Drug treatmentArmDrug : this.treatmentArmDrugs) {
			builder.drug(treatmentArmDrug);
		}
		return builder.build();
	}

	public List<Drug> getTreatmentArmDrugs() {
		return treatmentArmDrugs;
	}

	public void setTreatmentArmDrugs(List<Drug> treatmentArmDrugs) {
		this.treatmentArmDrugs = treatmentArmDrugs;
	}
	
	public void appendTreatmentDrug(Drug treatmentArmDrug) {
		this.treatmentArmDrugs.add(treatmentArmDrug);		
	}
	
	public List<Disease> getExclusionDiseases() {
		return exclusionDiseases;
	}
	
	public void setExclusionDiseases(List<Disease> exclusionDiseases) {
		this.exclusionDiseases = exclusionDiseases;
	}
	
	public void appendExclusionDisease(Disease exclusionDisease) {
		this.exclusionDiseases.add(exclusionDisease);
	}
	
	public List<AssayResult> getAssayResults() {
		return assayResults;
	}
	
	public void setAssayResults(List<AssayResult> assayResults) {
		this.assayResults = assayResults;
	}
	
	public void appendAssayResult(AssayResult assayResult) {
		this.assayResults.add(assayResult);
	}
	
	public List<DrugCombo> getExclusionDrugs() {
		return exclusionDrugs;
	}
	
	public void setExclusionDrugs(List<DrugCombo> exclusionDrugs) {
		this.exclusionDrugs = exclusionDrugs;
	}
	
	public void appendExclusionDrug(DrugCombo exclusionDrug) {
		this.exclusionDrugs.add(exclusionDrug);
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

	public int getNumPatientsAssigned() {
		return numPatientsAssigned;
	}
	
	public void setNumPatientsAssigned(int numPatientsAssigned) {
		this.numPatientsAssigned = numPatientsAssigned;
	}
	
	public void incrementNumPatientsAssigned() {
		this.numPatientsAssigned++;
	}
	
	public void decrementNumPatientsAssigned() {
		this.numPatientsAssigned--;
	}
	
	public int getMaxPatientsAllowed() {
		return maxPatientsAllowed;
	}
	
	public void setMaxPatientsAllowed(int maxPatientsAllowed) {
		this.maxPatientsAllowed = maxPatientsAllowed;
	}

	public TreatmentArmStatus getTreatmentArmStatus() {
		return treatmentArmStatus;
	}

	public void setTreatmentArmStatus(TreatmentArmStatus treatmentArmStatus) {
		this.treatmentArmStatus = treatmentArmStatus;
	}
	
	public VariantReport getVariantReport() {
		return variantReport;
	}

	public void setVariantReport(VariantReport variantReport) {
		this.variantReport = variantReport;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public Map<Long, TreatmentArmStatus> getStatusLog() {
		return statusLog;
	}
	
	public void appendStatusLog(Long key, TreatmentArmStatus value) {
		statusLog.put(key, value);
	}
	
	public void clearStatusLog() {
		statusLog.clear();
	}
	
	public boolean isFull() {
		// Should never be greater than the max patients allowed.
		return (this.numPatientsAssigned >= this.maxPatientsAllowed);
	}
	
	public int compareTo(TreatmentArm o) {
		return getDateCreated().compareTo(o.getDateCreated());
	}
	
}
