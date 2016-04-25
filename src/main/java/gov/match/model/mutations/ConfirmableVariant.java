package gov.match.model.mutations;

import org.json.JSONObject;

public abstract class ConfirmableVariant extends NonHotspotRule implements IConfirmableVariant {
	// Used to determine if the CLIA labs agree that this variant is a
	// good call. Only Indels, CNVs, and fusions can be confirmed...assay validators can not
	// so those should extend this class while the other will just extend variant.
	
	private boolean confirmed;
	
	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	
	public JSONObject toJSONObject() {
		JSONObject self = super.toJSONObject();
		self.put("confirmed", confirmed);
		return self;
	}
	
	public String toString() {
		return toJSONObject().toString();
	}
	
}
