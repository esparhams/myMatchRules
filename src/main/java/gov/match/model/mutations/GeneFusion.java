package gov.match.model.mutations;

import org.json.JSONObject;

public class GeneFusion extends ConfirmableVariant {
	
	private String fusionIdentity;

	public String getFusionIdentity() {
		return fusionIdentity;
	}

	public void setFusionIdentity(String fusionIdentity) {
		this.fusionIdentity = fusionIdentity;
	}
	
	public JSONObject toJSONObject() {
		JSONObject self = super.toJSONObject();
		self.put("fusionIdentity", fusionIdentity);
		return self;
	}
	
	public String toString() {
		return toJSONObject().toString();
	}
	
}