package gov.match.enumeration;

public enum AssayResultStatus {
	POSITIVE("P"),
	NEGATIVE("N"),
	INDETERMINATE("I"),
	PRE_PRESENT("S"),
	PRE_NEGATIVE("R"),
	PRE_INDETERMINATE("M");
	
	private String code;

	private AssayResultStatus(String code) {
		this.code = code;
	}
	
	public String getStatusCode() {
		return this.code;
	}
	
	public static boolean isName(String name) {
		for (AssayResultStatus ptenIhcStatus : AssayResultStatus.values()) {
			if (ptenIhcStatus.name().equals(name)) return true;
		}
		return false;
	}
	
	public static boolean isCode(String code) {
		for (AssayResultStatus ptenIhcStatus : AssayResultStatus.values()) {
			if (ptenIhcStatus.code.equals(code)) return true;
		}
		return false;
	}

	public static String getName(String code) {
		if (AssayResultStatus.isName(code)) return code;	
		for (AssayResultStatus ptenIhcStatus : AssayResultStatus.values()) {
			if (ptenIhcStatus.code.equals(code)) return ptenIhcStatus.name();
		}
		return AssayResultStatus.INDETERMINATE.name(); 
	}
}