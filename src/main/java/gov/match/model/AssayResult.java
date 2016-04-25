package gov.match.model;

import gov.match.enumeration.AssayResultStatus;
import gov.match.enumeration.AssayVariant;

public class AssayResult {
	
	private String gene;
	
	//@org.kie.api.definition.type.Position(value = 0)
	private AssayResultStatus assayResultStatus;
	
	//@org.kie.api.definition.type.Position(value = 1)
	private AssayVariant assayVariant;
	
	private String description;
	
	private Float levelOfEvidence;

	public AssayResultStatus getAssayResultStatus() {
		return assayResultStatus;
	}

	public void setAssayResultStatus(AssayResultStatus assayResultStatus) {
		this.assayResultStatus = assayResultStatus;
	}

	public AssayVariant getAssayVariant() {
		return assayVariant;
	}

	public void setAssayVariant(AssayVariant assayVariant) {
		this.assayVariant = assayVariant;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getGene() {
		return gene;
	}

	public void setGene(String gene) {
		this.gene = gene;
	}

	public Float getLevelOfEvidence() {
		return levelOfEvidence;
	}

	public void setLevelOfEvidence(Float levelOfEvidence) {
		this.levelOfEvidence = levelOfEvidence;
	}

}
