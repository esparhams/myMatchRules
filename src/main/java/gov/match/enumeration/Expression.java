package gov.match.enumeration;

public enum Expression {
	POSITIVE("P"),
	NEGATIVE("N"),
	UNDETERMINED("U");

	private String statusCode;

	private Expression(String status) {
		this.statusCode = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	static public boolean isName(String string) {
		for (Expression expression : Expression.values()) {
			if (expression.name().equals(string)) return true;
		}
		return false;
	}

	static public boolean isCode(String string) {
		for (Expression expression : Expression.values()) {
			if (expression.statusCode.equals(string)) return true;
		}
		return false;
	}

	static public String getName (String code) {
		if (Expression.isName(code)) return code;	
		for (Expression expression : Expression.values()) {
			if (expression.statusCode.equals(code)) return expression.name();
		}
		return Expression.UNDETERMINED.name(); 
	}
}
