package gov.match.enumeration;

public enum PatientAssignmentReasonCategory {
	SELECTED,
	RANDOMIZE_TIE_BREAKER,
	SMALLEST_ACCRUED_NUMBER_TIE_BREAKER,
	ALLELE_FREQUENCY_TIE_BREAKER,
	LEVEL_OF_EVIDENCE_TIE_BREAKER,
	NO_CONCORDANCE,
	ARM_FULL,
	NOT_ELIGIBLE,
	COMMITTEE_REJECTED,
	PRIOR_ASSIGNMENT,
	RECORD_BASED_EXCLUSION,
	NO_VARIANT_MATCH,
	ARM_NOT_OPEN;
	
	public static boolean isName(String name) {
		for (PatientAssignmentReasonCategory reason : PatientAssignmentReasonCategory.values()) {
			if (reason.name().equals(name)) return true;
		}
		return false;
	}
}