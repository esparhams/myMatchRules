package gov.match.validator;

public class InvalidException extends Exception {
	private static final long serialVersionUID = 7214597528886977043L;

	public InvalidException (String message) {
		super (message);
	}
}