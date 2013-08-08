package be.jevota.service.exception;

public class InvalidPasswordUpdateException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidPasswordUpdateException(String message) {
		super(message);
	}
	
}
