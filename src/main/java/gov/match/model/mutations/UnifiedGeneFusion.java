package gov.match.model.mutations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.JSONObject;

public class UnifiedGeneFusion extends ConfirmableVariant {
	
	private static final Pattern pattern = Pattern.compile("(.*\\..*\\.(.+))\\.");
	private static final int ID_MATCHER_GROUP = 1;
	private String matchingId;
	
	private int driverReadCount;
	private int partnerReadCount;
	private String driverGene;
	private String partnerGene;
	private String annotation;
	
	@Override
	public String getMatchingId() {
		if (super.getIdentifier() == null) return super.getIdentifier();
		if (matchingId != null) return matchingId;
		Matcher matcher = pattern.matcher(super.getIdentifier());
		if (matcher != null && matcher.find()) {
			matchingId = (matcher.groupCount() >= ID_MATCHER_GROUP) ? matcher.group(ID_MATCHER_GROUP) : super.getIdentifier();
		} else {
			matchingId = super.getIdentifier();
		}
		return matchingId;
	}
	public int getDriverReadCount() {
		return driverReadCount;
	}
	public void setDriverReadCount(int driverReadCount) {
		this.driverReadCount = driverReadCount;
	}
	public int getPartnerReadCount() {
		return partnerReadCount;
	}
	public void setPartnerReadCount(int partnerReadCount) {
		this.partnerReadCount = partnerReadCount;
	}
	public String getDriverGene() {
		return driverGene;
	}
	public void setDriverGene(String driverGene) {
		this.driverGene = driverGene;
	}
	public String getPartnerGene() {
		return partnerGene;
	}
	public void setPartnerGene(String partnerGene) {
		this.partnerGene = partnerGene;
	}
	public String getAnnotation() {
		return annotation;
	}
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	public JSONObject toJSONObject() {
		JSONObject self = super.toJSONObject();
		self.put("driverReadCount", driverReadCount);
		self.put("driverGene", driverGene);
		self.put("partnerReadCount", partnerReadCount);
		self.put("partnerGene", partnerGene);
		self.put("annotation", annotation);
		return self;
	}
	
	public String toString() {
		return toJSONObject().toString();
	}

}
