package gov.match.model.message;

import gov.match.enumeration.MdAndersonMessageMessage;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.json.JSONObject;

public class MdAndersonMessage implements Comparable<MdAndersonMessage> {

	@NotEmpty
	private String patientSequenceNumber;
	
	@NotEmpty
	private String biopsySequenceNumber;

	@NotNull
	//@JsonDeserialize(using=MatchDateFormatter.class)
	private Date reportedDate;
	
	//@JsonDeserialize(using=MatchDateFormatter.class)
	private Date collectedDate;
	
	private String status;
	
	private String comment;
	
	private MdAndersonMessageMessage message;

	public String getPatientSequenceNumber() {
		return patientSequenceNumber;
	}

	public void setPatientSequenceNumber(String patientSequenceNumber) {
		this.patientSequenceNumber = patientSequenceNumber;
	}

	public String getBiopsySequenceNumber() {
		return biopsySequenceNumber;
	}

	public void setBiopsySequenceNumber(String biopsySequenceNumber) {
		this.biopsySequenceNumber = biopsySequenceNumber;
	}

	public Date getReportedDate() {
		return reportedDate;
	}
	
	public void setReportedDate(Date reportedDate) {
		this.reportedDate = reportedDate;
	}
	
	public Date getCollectedDate() {
		return collectedDate;
	}
	
	public void setCollectedDate(Date collectedDate) {
		this.collectedDate = collectedDate;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public MdAndersonMessageMessage getMessage() {
		return message;
	}

	public void setMessage(MdAndersonMessageMessage message) {
		this.message = message;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return toJSONObject().toString();
	}
	
	public JSONObject toJSONObject() {
		JSONObject self = new JSONObject();
		self.put("patientSequenceNumber", patientSequenceNumber);
		self.put("biopsySequenceNumber", biopsySequenceNumber);
		self.put("reportedDate", reportedDate);
		self.put("collectedDate", collectedDate);
		self.put("message", message);
		self.put("status", status);
		self.put("comment", comment);
		return self;
	}
	
	public int compareTo(MdAndersonMessage o) {
		return getReportedDate().compareTo(o.getReportedDate());
	}

}
