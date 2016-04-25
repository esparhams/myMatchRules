package gov.match.enumeration;

public enum AssayVariant {
	PRESENT("P"),
	NEGATIVE("N"),
	EMPTY("E");
	
	private String code;
	
	private AssayVariant(String code) {
		this.code = code;
	}
	
	public String getStatusCode() {
		return this.code;
	}
	
	public static boolean isName(String name) {
		for (AssayVariant ptenVariant : AssayVariant.values()) {
			if (ptenVariant.name().equals(name))
				return true;
		}
		return false;
	}
	
	public static boolean isCode(String code) {
		for (AssayVariant ptenVariant : AssayVariant.values()) {
			if (ptenVariant.code.equals(code))
				return true;
		}
		return false;
	}

	public static String getName(String code) {
		if (AssayVariant.isName(code)) 
			return code;	
		for (AssayVariant ptenVariant : AssayVariant.values()) {
			if (ptenVariant.code.equals(code))
				return ptenVariant.name();
		}
		return AssayVariant.EMPTY.name(); 
	}
}
