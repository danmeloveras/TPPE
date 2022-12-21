package exceptions;

public class NullIncomesException extends IncomeException{
	public static final String message = "The total income equals zero.";
	
	public NullIncomesException() {
		super(message);
	}
	
	public NullIncomesException(String message) {
		super(message);
	}
}
