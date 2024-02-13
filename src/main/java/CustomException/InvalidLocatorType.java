package CustomException;

public class InvalidLocatorType extends RuntimeException {
	
	public InvalidLocatorType(String message) {
		super(message);
	}
}
