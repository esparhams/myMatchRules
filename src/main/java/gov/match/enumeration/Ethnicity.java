package gov.match.enumeration;

public enum Ethnicity {
	HISPANIC_OR_LATINO,
	NOT_HISPANIC_OR_LATINO,
	PATIENT_REFUSAL,
	INSTITUTION_REFUSAL,
	UNKNOWN;
	
	public static boolean isName(String name) {
		for (Ethnicity ethnicity : Ethnicity.values()) {
			if (ethnicity.name().equals(name)) return true;
		}
		return false;
	}
}