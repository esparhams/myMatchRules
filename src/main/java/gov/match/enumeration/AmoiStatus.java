package gov.match.enumeration;

public enum AmoiStatus implements IAmoiStatus{
	PRIOR,
	PRIOR_EXCLUSION,
	CURRENT,
	CURRENT_EXCLUSION,
	FUTURE,
	FUTURE_EXCLUSION;
	
	public boolean isName(String name) {
		for (AmoiStatus amoiStatus : AmoiStatus.values()) {
			if (amoiStatus.name().equals(name)) return true;
		}
		return false;
	}
	
}
