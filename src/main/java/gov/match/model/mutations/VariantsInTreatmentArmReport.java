package gov.match.model.mutations;

import java.util.ArrayList;
import java.util.List;

public class VariantsInTreatmentArmReport {

	private List<VariantInTreatmentArm> singleNucleotideVariants;

	private List<VariantInTreatmentArm> indels;
	
	private List<VariantInTreatmentArm> copyNumberVariants;

	private List<VariantInTreatmentArm> geneFusions;
	
	private List<VariantInTreatmentArm> unifiedGeneFusions;
	
	private List<VariantInTreatmentArm> nonHotspotRules;
	
	public VariantsInTreatmentArmReport() {
		singleNucleotideVariants = new ArrayList<VariantInTreatmentArm>();
		
		indels = new ArrayList<VariantInTreatmentArm>();
		copyNumberVariants = new ArrayList<VariantInTreatmentArm>();
		geneFusions = new ArrayList<VariantInTreatmentArm>();
		unifiedGeneFusions = new ArrayList<VariantInTreatmentArm>();
		nonHotspotRules = new ArrayList<VariantInTreatmentArm>();
		
	}

	public List<VariantInTreatmentArm> getSingleNucleotideVariants() {
		return singleNucleotideVariants;
	}

	public void setSingleNucleotideVariants(
			List<VariantInTreatmentArm> singleNucleotideVariants) {
		this.singleNucleotideVariants = singleNucleotideVariants;
	}

	public List<VariantInTreatmentArm> getIndels() {
		return indels;
	}

	public void setIndels(List<VariantInTreatmentArm> indels) {
		this.indels = indels;
	}

	public List<VariantInTreatmentArm> getCopyNumberVariants() {
		return copyNumberVariants;
	}

	public void setCopyNumberVariants(List<VariantInTreatmentArm> copyNumberVariants) {
		this.copyNumberVariants = copyNumberVariants;
	}

	public List<VariantInTreatmentArm> getGeneFusions() {
		return geneFusions;
	}

	public void setGeneFusions(List<VariantInTreatmentArm> geneFusions) {
		this.geneFusions = geneFusions;
	}

	public List<VariantInTreatmentArm> getUnifiedGeneFusions() {
		return unifiedGeneFusions;
	}

	public void setUnifiedGeneFusions(List<VariantInTreatmentArm> unifiedGeneFusions) {
		this.unifiedGeneFusions = unifiedGeneFusions;
	}

	public List<VariantInTreatmentArm> getNonHotspotRules() {
		return nonHotspotRules;
	}

	public void setNonHotspotRules(List<VariantInTreatmentArm> nonHotspotRules) {
		this.nonHotspotRules = nonHotspotRules;
	}
}
