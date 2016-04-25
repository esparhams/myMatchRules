package gov.match.enumeration;

public enum ECOGTreatmentArmStatus {
	ASSIGNED, 
	NOT_ELIGIBLE;
	
	public static boolean isName(String name) {
		for (ECOGTreatmentArmStatus status : ECOGTreatmentArmStatus.values()) {
			if (status.name().equals(name)) return true;
		}
		return false;
	}
}