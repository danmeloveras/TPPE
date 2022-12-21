package exceptions;

public class EmptyIncomes extends IncomeException {
	public final static String message = "Empty incomes: the number of incomes is "
			+ "equals zero.";
	
	public EmptyIncomes() {
		super(message);
	}
}
