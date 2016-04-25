package gov.match.model.mutations;

import org.json.JSONObject;

public class CopyNumberVariant extends ConfirmableVariant {
	
	private double refCopyNumber;
	private double rawCopyNumber;
	private double copyNumber;
	private double confidenceInterval95percent;
	private double confidenceInterval5percent;
	
	public double getRefCopyNumber() {
		return refCopyNumber;
	}
	
	public void setRefCopyNumber(double refCopyNumber) {
		this.refCopyNumber = refCopyNumber;
	}
	
	public double getRawCopyNumber() {
		return rawCopyNumber;
	}
	
	public void setRawCopyNumber(double rawCopyNumber) {
		this.rawCopyNumber = rawCopyNumber;
	}
	
	public double getCopyNumber() {
		return copyNumber;
	}
	
	public void setCopyNumber(double copyNumber) {
		this.copyNumber = copyNumber;
	}

	
	public JSONObject toJSONObject() {
		JSONObject self = super.toJSONObject();
		self.put("refCopyNumber", refCopyNumber);
		self.put("rawCopyNumber", rawCopyNumber);
		self.put("copyNumber", copyNumber);
		self.put("confidenceInterval95percent", confidenceInterval95percent);
		self.put("confidenceInterval5percent", confidenceInterval5percent);
		return self;
	}
	
	public String toString() {
		return toJSONObject().toString();
	}

	public double getConfidenceInterval95percent() {
		return confidenceInterval95percent;
	}

	public void setConfidenceInterval95percent(double confidenceInterval95percent) {
		this.confidenceInterval95percent = confidenceInterval95percent;
	}

	public double getConfidenceInterval5percent() {
		return confidenceInterval5percent;
	}

	public void setConfidenceInterval5percent(double confidenceInterval5percent) {
		this.confidenceInterval5percent = confidenceInterval5percent;
	}

	
}