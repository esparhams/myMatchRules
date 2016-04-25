package gov.match.model.mutations;

import org.json.JSONObject;

public interface IConfirmableVariant{
		
	public boolean isConfirmed();
	public void setConfirmed(boolean confirmed);
	public JSONObject toJSONObject();
	public String toString();
	
}