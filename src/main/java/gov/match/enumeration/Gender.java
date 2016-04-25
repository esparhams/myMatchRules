package gov.match.enumeration;

public enum Gender {
	MALE("M"),
	FEMALE("F"),
	UNKNOWN("U");
	
	private String code;

	private Gender(String code) {
		this.code = code;
	}
	
	public String getStatusCode() {
		return this.code;
	}
	
	public static boolean isName(String name) {
		for (Gender gender : Gender.values()) {
			if (gender.name().equals(name)) return true;
		}
		return false;
	}
	
	public static boolean isCode(String code) {
		for (Gender gender : Gender.values()) {
			if (gender.code.equals(code)) return true;
		}
		return false;
	}

	public static String getName(String code) {
		if (Gender.isName(code)) return code;	
		for (Gender gender : Gender.values()) {
			if (gender.code.equals(code)) return gender.name();
		}
		return Gender.UNKNOWN.name(); 
	}
}