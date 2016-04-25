package gov.match.enumeration;

public enum PatientAssignmentStatus {
	AVAILABLE("A"),
	REQUESTED_COM_CARE("CC"),
	NO_ARM_ASSIGNED("NA"),
	UNKNOWN("U");

	private String statusCode;

	private PatientAssignmentStatus(String patientAssignmentStatus) {
		this.statusCode = patientAssignmentStatus;
	}

	public String getStatusCode() {
		return statusCode;
	}

	static public boolean isName(String string) {
		for (PatientAssignmentStatus patientAssignmentStatus : PatientAssignmentStatus.values()) {
			if (patientAssignmentStatus.name().equals(string)) return true;
		}
		return false;
	}

	static public boolean isCode(String string) {
		for (PatientAssignmentStatus patientAssignmentStatus : PatientAssignmentStatus.values()) {
			if (patientAssignmentStatus.statusCode.equals(string)) return true;
		}
		return false;
	}

	static public String getName (String code) {
		if (PatientAssignmentStatus.isName(code)) return code;	
		for (PatientAssignmentStatus patientAssignmentStatus : PatientAssignmentStatus.values()) {
			if (patientAssignmentStatus.statusCode.equals(code)) return patientAssignmentStatus.name();
		}
		return PatientAssignmentStatus.UNKNOWN.name(); 

	}
}

