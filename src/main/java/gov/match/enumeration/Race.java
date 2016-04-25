package gov.match.enumeration;

public enum Race {
	WHITE,
	BLACK_OR_AFRICAN_AMERICAN,
	ASIAN,
	NATIVE_HAWAIIAN_OR_OTHER_PACIFIC_ISLANDER,
	AMERICAN_INDIAN_OR_ALASKA_NATIVE,
	PATIENT_REFUSAL,
	INSTITUTION_REFUSAL,
	NOT_REPORTED,
	UNKNOWN;
	
	public static boolean isName(String name) {
		for (Race race : Race.values()) {
			if (race.name().equals(name)) return true;
		}
		return false;
	}
}