package selenium1.exam1;

public class InsufficientQuantityException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String errorMessage = "Quantity is not sufficient in store";
	
	public InsufficientQuantityException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	
	public InsufficientQuantityException() {
		super();
	}

	public InsufficientQuantityException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InsufficientQuantityException(String message, Throwable cause) {
		super(message, cause);
	}

	public InsufficientQuantityException(Throwable cause) {
		super(cause);
	}

	@Override
	public String getMessage() {
		return errorMessage;
	}
}
