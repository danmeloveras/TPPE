package application;
import java.util.ArrayList; 
import exceptions.EmptyIncomesException;
import exceptions.NullIncomesException;

public class IRPF {
	ArrayList<Deduction> deductions = new ArrayList<Deduction>();
	ArrayList<Income> incomes = new ArrayList<Income>();
	
	public RegisterIncome registerIncome = new RegisterIncome(incomes);


	public boolean registerDeduction(Deduction d) {
		boolean result = deductions.add(d);
		return result;
	}

	public float allIncomes() throws NullIncomesException {
		float allIncomes = 0f;
		for (Income i : incomes)
			allIncomes += i.getValue();
		if (allIncomes == 0) 
			throw new NullIncomesException();
		else 
			return allIncomes;
	}

	public float allDeductions() {
		float result = 0f;
		for (Deduction d : deductions){
			result += d.getValue();
		}
		return result;
	}

	public int sizeIncomes() {
		return incomes.size();
	}

	public int sizeAllDeductions() {
		return deductions.size();
	}

	public Object[] getIncomes() {
		Object[] result = incomes.toArray();
		return result;
	}


	public float logicToCalculateBasis() {
		float result = 0; 
			for (Income i : incomes) {
				result += i.getValue();
			}
			return result;
	}

	public float calculateBasis() throws EmptyIncomesException  {
		if (incomes.isEmpty())
			throw new EmptyIncomesException();
		return sizeAllDeductions();
	}
}
