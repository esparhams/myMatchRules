package gov.match.enumeration;

public enum Status {
	SUCCESS("S"),
	FAILURE("F"),
	UNKNOWN("U");

	private String statusCode;

	private Status(String status) {
		this.statusCode = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	static public boolean isName(String string) {
		for (Status status : Status.values()) {
			if (status.name().equals(string)) return true;
		}
		return false;
	}

	static public boolean isCode(String string) {
		for (Status status : Status.values()) {
			if (status.statusCode.equals(string)) return true;
		}
		return false;
	}

	static public String getName (String code) {
		if (Status.isName(code)) return code;	
		for (Status status : Status.values()) {
			if (status.statusCode.equals(code)) return status.name();
		}
		return Status.UNKNOWN.name(); 

	}
}
