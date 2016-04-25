package gov.match.enumeration;

public enum NextGenerationSequenceStatus {
	PENDING,
	CONFIRMED,
	REJECTED,
	ERROR_QC;
	
	public static boolean isName(String name) {
		for (NextGenerationSequenceStatus status : NextGenerationSequenceStatus.values()) {
			if (status.name().equals(name)) return true;
		}
		return false;
	}
}