package gov.match.model.message;

import gov.match.enumeration.AssayResultStatus;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;
import org.json.JSONObject;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AssayMessage implements Comparable<AssayMessage>{
	@NotEmpty
	private String patientSequenceNumber;
	
	@NotEmpty
	private String biopsySequenceNumber;

	@NotEmpty
	private String biomarker;
	
	private AssayResultStatus result;
	
	private Date orderedDate;
	private Date reportedDate;
	private Date requestedDate;
	
	private String comment;
	
	public Date getRequestedDate() {
		return requestedDate;
	}
	public void setRequestedDate(Date requestedDate) {
		this.requestedDate = requestedDate;
	}
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
	public String getBiomarker() {
		return biomarker;
	}
	public void setBiomarker(String biomarker) {
		this.biomarker = biomarker;
	}
	public Date getOrderedDate() {
		return orderedDate;
	}
	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}
	public AssayResultStatus getResult() {
		return result;
	}
	public void setResult(AssayResultStatus result) {
		this.result = result;
	}
	public Date getReportedDate() {
		return reportedDate;
	}
	public void setReportedDate(Date reportedDate) {
		this.reportedDate = reportedDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String toString() {
		JSONObject self = new JSONObject();
		self.put("patientSequenceNumber", patientSequenceNumber);
		self.put("biopsySequenceNumber", biopsySequenceNumber);
		self.put("biomarker", biomarker);
		self.put("result", result);
		self.put("orderedDate", orderedDate);
		self.put("reportedDate", reportedDate);
		self.put("comment", comment);
		return self.toString();
	}
	public int compareTo(AssayMessage o) {
		return getOrderedDate().compareTo(o.getOrderedDate());
	}
}