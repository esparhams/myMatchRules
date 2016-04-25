package gov.match.model;

import java.util.Date;

import org.json.JSONObject;

public class AssayActivationPeriod {
	private Date startDate;
	private Date endDate;
	
	public Date getStartDate() {
		return this.startDate;
	}
	
	public void setSartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return this.endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public boolean contains(Date date) {
		return (date.after(startDate) && (endDate == null || date.before(endDate)));
	}
	
	public JSONObject toJSONObject() {
		JSONObject self = new JSONObject();
		self.put("startDate", startDate);
		self.put("endDate", endDate);
		return self;
	}
	
	public String toString() {
		return toJSONObject().toString();
	}
}