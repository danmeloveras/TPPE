package application;
import java.util.ArrayList; 

public class RegisterIncome {

	private ArrayList<Income> incomes;
	
	public RegisterIncome(ArrayList<Income> incomes) {
		this.incomes = incomes;
	}
	
	private Income seeIncome(String description) {
		Income result = null;
		for (Income i : incomes) {
			if (i.description.equalsIgnoreCase(description))
				result = i;
		}
		return result;
	}

		public boolean register(Income i) {
		Income temporaryIncome = seeIncome(i.description);
		if (temporaryIncome != null) {
			this.incomes.remove(temporaryIncome);
			i.value += temporaryIncome.value;
		}
		boolean result = this.incomes.add(i);
		return result;
	}
}
