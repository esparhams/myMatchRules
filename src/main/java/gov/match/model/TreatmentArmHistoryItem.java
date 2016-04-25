package gov.match.model;

import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "treatmentArmHistory")
public class TreatmentArmHistoryItem extends MatchObject implements Comparable<TreatmentArmHistoryItem> {

	/** The date the treatment arm was archived. */
	@NotNull
	private Date dateArchived;
	
	/** A snapshot of the treatment arm that was archived at this time. */
	@NotNull
	private TreatmentArm treatmentArm;
	
	public TreatmentArmHistoryItem() {
		this.setId(UUID.randomUUID().toString());
		this.dateArchived = new Date();
	}
	
	public Date getDateArchived() {
		return this.dateArchived;
	}
	
	public TreatmentArm getTreatmentArm() {
		return this.treatmentArm;
	}
	
	public void setTreatmentArm(TreatmentArm treatmentArm) {
		this.treatmentArm = treatmentArm;
	}
	
	public int compareTo(TreatmentArmHistoryItem o) {
		return getDateArchived().compareTo(o.getDateArchived());
	}
	
}