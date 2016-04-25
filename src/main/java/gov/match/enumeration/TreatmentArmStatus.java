package gov.match.enumeration;

public enum TreatmentArmStatus {
	OPEN("O"),
	REACTIVATED("R"),
	CLOSED("C"),
	SUSPENDED("S"),
	PENDING("P"),
	READY("D"),
	AMENDED("A"),
	UNKNOWN("U");

	private String statusCode;

	private TreatmentArmStatus(String treatmentArmStatus) {
		this.statusCode = treatmentArmStatus;
	}

	public String getStatusCode() {
		return statusCode;
	}

	static public boolean isName(String string) {
		for (TreatmentArmStatus treatmentArmStatus : TreatmentArmStatus.values()) {
			if (treatmentArmStatus.name().equals(string)) return true;
		}
		return false;
	}

	static public boolean isCode(String string) {
		for (TreatmentArmStatus treatmentArmStatus : TreatmentArmStatus.values()) {
			if (treatmentArmStatus.statusCode.equals(string)) return true;
		}
		return false;
	}

	static public String getName (String code) {
		if (TreatmentArmStatus.isName(code)) return code;	
		for (TreatmentArmStatus treatmentArmStatus : TreatmentArmStatus.values()) {
			if (treatmentArmStatus.statusCode.equals(code)) return treatmentArmStatus.name();
		}
		return TreatmentArmStatus.UNKNOWN.name(); 

	}
}
