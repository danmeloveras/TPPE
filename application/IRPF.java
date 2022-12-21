package aplicacao;
import java.util.ArrayList; 
import exceptions.EmptyIncomesException;
import exceptions.NullIncomesException;

public class IRPF {
	ArrayList<Deduction> deductions = new ArrayList<Deduction>();
	ArrayList<Income> incomes = new ArrayList<Income>();
	
	public boolean registerIncome(Income i) {
		Income temporaryIncome = seeIncome(i.description);
		if (temporaryIncome != null) {
			incomes.remove(temporaryIncome);
			i.value += temporaryIncome.value;
		}
		boolean result = incomes.add(i);
		return result;
	}

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

	private Income seeIncome(String description) {
		Income result = null;
		for (Income i : incomes) {
			if (i.description.equalsIgnoreCase(description))
				result = r;
		}
		return result;
	}

	public float calculateBasis() throws EmptyIncomesException  {
		if (incomes.isEmpty())
			throw new EmptyIncomesException();
		else {
			float basis = 0; 
			for (Income i : incomes) {
				basis += i.getValue();
			}
			return basis;
		}
	}
}
