package exceptions;

public class IncomeException extends Exception{
	public static final String message = "Generic income exception.";
	
	public IncomeException() {
		super(message);
	}

	public IncomeException(String message) {
		super(message);
	}
}
