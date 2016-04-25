package gov.match.enumeration;

public enum QueueDataType {
	
	PATIENT_ASSIGNMENT,
	BAI_GENERATION,
	CONFIRM_PATIENT_ASSIGNMENT,
	CONFIRM_VARIANT_REPORT_EMAIL,
	RB_ASSAY_ORDER_REQUEST;
	
	public static boolean isName(String name) {
		for (QueueDataType queueDataType : QueueDataType.values()) {
			if (queueDataType.name().equals(name)) return true;
		}
		return false;
	}
}
