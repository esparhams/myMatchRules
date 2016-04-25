package gov.match.enumeration;

public enum PatientStatus {
	REGISTRATION ("G"),
	PROGRESSION("P"),
	PROGRESSION_REBIOPSY("R"),
	ON_TREATMENT_ARM("A"),
	TREATMENT_ARM_CLOSED("C"),
	TREATMENT_ARM_SUSPENDED("D"),
	PENDING_APPROVAL("P"),
	COMPASSIONATE_CARE("CC"),
	PENDING_OFF_STUDY("S"),
	NOT_ELIGIBLE("E"),
	OFF_TRIAL("F"),
	OFF_TRIAL_NOT_CONSENTED("O"),
	OFF_TRIAL_NO_TA_AVAILABLE("N"), 
	OFF_TRIAL_DECEASED("D"),
	OFF_TRIAL_BIOPSY_EXPIRED("BE"),
	OFF_TRIAL_REGISTRATION_ERROR("RE"),
	PENDING_CONFIRMATION("PC"),
	COMMITTEE_REJECTED("CR"),
	POTENTIAL_RULES_ISSUE("PRI"),
	REJOIN("RJ"),
	REJOIN_REQUESTED("RR"),
	RB_ORDER_REQUESTED("ROR"),
	RB_ORDERED("RO"),
	RB_RESULT_RECEIVED("RRR"),
	UNKNOWN("U");
 
	private String statusCode;
	
	private PatientStatus(String status) {
		this.statusCode = status;
	}
	
	public String getStatusCode() {
		return statusCode;
	}
	
	static public boolean isName(String string) {
		for (PatientStatus patientStatus : PatientStatus.values()) {
			if (patientStatus.name().equals(string)) return true;
		}
		return false;
	}
	
	static public boolean isCode(String string) {
		for (PatientStatus patientStatus : PatientStatus.values()) {
			if (patientStatus.statusCode.equals(string)) return true;
		}
		return false;
	}
	
	static public String getName (String code) {
		if (PatientStatus.isName(code)) return code;	
		for (PatientStatus patientStatus : PatientStatus.values()) {
			if (patientStatus.statusCode.equals(code)) return patientStatus.name();
		}
		return PatientStatus.UNKNOWN.name(); 
	}
	
	static public boolean isOffTrial(PatientStatus status) {
		return status != null &&
			(status == PatientStatus.OFF_TRIAL ||
			 status == PatientStatus.OFF_TRIAL_DECEASED ||
			 status == PatientStatus.OFF_TRIAL_NO_TA_AVAILABLE ||
			 status == PatientStatus.OFF_TRIAL_NOT_CONSENTED ||
			 status == PatientStatus.OFF_TRIAL_BIOPSY_EXPIRED ||
			 status == PatientStatus.OFF_TRIAL_REGISTRATION_ERROR);
	}

}
