package gov.match.model.mutations;

public class VariantInTreatmentArm {
	String treatmentArmId;
	Variant variant;
	
	int numberOfPatientsWithVariant;
	int numberOfPatientsWithVariantOnArm;
	int percentPatientsWithVariantOnArm;
	
	public String getTreatmentArmId() {
		return treatmentArmId;
	}
	public void setTreatmentArmId(String treatmentArmId) {
		this.treatmentArmId = treatmentArmId;
	}
	
	public Variant getVariant() {
		return variant;
	}
	public void setVariant(Variant variant) {
		this.variant = variant;
	}
	
	public int getNumberOfPatientsWithVariantOnArm() {
		return numberOfPatientsWithVariantOnArm;
	}
	public void setNumberOfPatientsWithVariantOnArm(
			int numberOfPatientsWithVariantOnArm) {
		this.numberOfPatientsWithVariantOnArm = numberOfPatientsWithVariantOnArm;
	}
	public int getPercentPatientsWithVariantOnArm() {
		return percentPatientsWithVariantOnArm;
	}
	public void setPercentPatientsWithVariantOnArm(
			int percentPatientsWithVariantOnArm) {
		this.percentPatientsWithVariantOnArm = percentPatientsWithVariantOnArm;
	}
	public int getNumberOfPatientsWithVariant() {
		return numberOfPatientsWithVariant;
	}
	public void setNumberOfPatientsWithVariant(int numberOfPatientsWithVariant) {
		this.numberOfPatientsWithVariant = numberOfPatientsWithVariant;
	}
}
