package gov.match.enumeration;

public enum MdAndersonMessageMessage {
	SPECIMEN_RECEIVED,
	SPECIMEN_FAILURE,
	PATHOLOGY_CONFIRMATION,
	PATHOLOGY_FAILURE,
	TISSUE_RECEIVED_MDL,
	INITIAL_EXTRACTION_FAILURE,
	ADDITIONAL_TISSUE_RECEIVED_MDL,
	NUCLEIC_ACID_SENDOUT;

	public static boolean isName(String mdAndersonMessageMessage) {
		for (MdAndersonMessageMessage message : MdAndersonMessageMessage.values()) {
			if (message.name().equals(mdAndersonMessageMessage)) return true;
		}
		return false;
	}
}

