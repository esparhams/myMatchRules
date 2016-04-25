package gov.match.model.mutations;

import org.json.JSONObject;

public class Metadata {
	private String id;
	private String comment;
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getComment() {
		return this.comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public JSONObject toJSONObject() {
		JSONObject self = new JSONObject();
		self.put("id", id);
		self.put("comment", comment);
		return self;
	}
	
	public String toString() {
		return toJSONObject().toString();
	}
}
