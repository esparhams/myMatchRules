package gov.match.model;

import gov.match.enumeration.PatientStatus;
import gov.match.model.message.AssayMessage;
import gov.match.model.message.MdAndersonMessage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class Biopsy implements Comparable<Biopsy>{
	// This should match the earliest date in the list of associated assay messages
	private Date dateCreated;
	
	@NotEmpty
	private String biopsySequenceNumber;
	
	@Pattern(regexp = "[Y|N]")
	private String concordance;
	
	// Normally would only have one but may have multiple because one run was not able to be confirmed and they
	// want to rerun the sequencing.
	@Valid
	//private List<NextGenerationSequence> nextGenerationSequences;
	
	// Historical Records
	private List<AssayMessage> assayMessages;
	
	private List<MdAndersonMessage> mdAndersonMessages;
	
	private boolean failure; 
	
	// Patient status at time of the SPECIMENT_RECEIVED message was received.
	private PatientStatus associatedPatientStatus;
	
	public Biopsy () {
	//	nextGenerationSequences = new ArrayList<NextGenerationSequence>();
		assayMessages = new ArrayList<AssayMessage>();
		mdAndersonMessages = new ArrayList<MdAndersonMessage>();
		this.setDateCreated(new Date());
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getBiopsySequenceNumber() {
		return biopsySequenceNumber;
	}

	public void setBiopsySequenceNumber(String biopsySequenceNumber) {
		this.biopsySequenceNumber = biopsySequenceNumber;
	}
	
	public String getConcordance() {
		return concordance;
	}

	public void setConcordance(String concordance) {
		this.concordance = concordance;
	}
/*
	public List<NextGenerationSequence> getNextGenerationSequences() {
		return nextGenerationSequences;
	}

	public void setNextGenerationSequences(List<NextGenerationSequence> nextGenerationSequences) {
		this.nextGenerationSequences = nextGenerationSequences;
	}
	
	public void appendNextGenerationSequences(NextGenerationSequence nextGenerationSequence) {
		this.nextGenerationSequences.add(nextGenerationSequence);
	}
	*/
	public List<AssayMessage> getAssayMessagesWithResult() {
		if (assayMessages == null || assayMessages.size() == 0) return Collections.emptyList();
		List<AssayMessage> result = new ArrayList<AssayMessage>();
		for (AssayMessage assayMessage : assayMessages) {
			if (assayMessage.getResult() != null) {
				result.add(assayMessage);
			}
		}
		return result;
	}
	
	public AssayMessage getOrderedAssay(String biomarker) {
		if (assayMessages == null || assayMessages.size() == 0) return null;
		for (AssayMessage assayMessage : assayMessages) {
			if (assayMessage.getBiomarker().equals(biomarker) && 
				assayMessage.getOrderedDate() != null &&
				assayMessage.getResult() == null) {
				return assayMessage;
			}
		}
		return null;
	}
	
	public AssayMessage getResultAssay(String biomarker) {
		if (assayMessages == null || assayMessages.size() == 0) return null;
		for (AssayMessage assayMessage : assayMessages) {
			if (assayMessage.getBiomarker().equals(biomarker) && 
				assayMessage.getResult() != null) {
				return assayMessage;
			}
		}
		return null;
	}
	
	public AssayMessage getRequestedAssay(String biomarker) {
		if (assayMessages == null || assayMessages.size() == 0) return null;
		for (AssayMessage assayMessage : assayMessages) {
			if (assayMessage.getBiomarker().equals(biomarker) && 
				assayMessage.getRequestedDate() != null) {
				return assayMessage;
			}
		}
		return null;
	}
	
/*	public boolean isRbAssayRequired() {
		int ngsSize = nextGenerationSequences.size();
		if (ngsSize == 0) 
			return false;
		
		return NextGenerationSequenceHelper.rbGeneFound(nextGenerationSequences.get(ngsSize-1)
				.getIonReporterResults().getVariantReport().getCopyNumberVariants());
	}
	*/
	public List<AssayMessage> getAssayMessages() {
		return assayMessages;
	}

	public void setAssayMessages(List<AssayMessage> assayMessages) {
		this.assayMessages = assayMessages;
	}	
	
	public void appendAssayMessage(AssayMessage assayMessage) {
		this.assayMessages.add(assayMessage);
	}

	public List<MdAndersonMessage> getMdAndersonMessages() {
		return mdAndersonMessages;
	}

	public void setMdAndersonMessages(List<MdAndersonMessage> mdAndersonMessages) {
		this.mdAndersonMessages = mdAndersonMessages;
	}

	public PatientStatus getAssociatedPatientStatus() {
		return associatedPatientStatus;
	}

	public void setAssociatedPatientStatus(PatientStatus associatedPatientStatus) {
		this.associatedPatientStatus = associatedPatientStatus;
	}

	public void appendMdAndersonMessage(MdAndersonMessage mdAndersonMessage) {
		this.mdAndersonMessages.add(mdAndersonMessage);
	}
	
	/*public boolean isConfirmed() {
		if (nextGenerationSequences != null && nextGenerationSequences.size() > 0) {
			for (NextGenerationSequence nextGenerationSequence : nextGenerationSequences) {
				if (nextGenerationSequence.isConfirmed()) {
					return true;
				}
			}
		}
		return false;
	}*/

	public boolean isFailure() {
		return failure;
	}

	public void setFailure(boolean failure) {
		this.failure = failure;
	}
	
	public int compareTo(Biopsy o) {
		return getDateCreated().compareTo(o.getDateCreated());
	}
}
