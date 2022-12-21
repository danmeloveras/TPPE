package exceptions;

public class EmptyIncomesException extends IncomeException {
	public final static String message = "Empty incomes: the number of incomes is "
			+ "equals zero.";
	
	public EmptyIncomesException() {
		super(message);
	}
}
