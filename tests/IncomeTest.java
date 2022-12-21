package tests;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import static org.junit.Assert.*; 
import org.junit.Test;
import org.junit.runners.MethodSorters;

import application.IRPF;
import application.Income;
import exceptions.NullIncomesException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IncomeTest {
	static IRPF irpf;
	
	@BeforeClass
	public static void setup() {
		irpf = new IRPF();
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void shouldNotAccessIncomesNotRegisters() {
		Object[] incomes = irpf.getIncomes();
		Object i = incomes[0];
	}
	
	
	@Test
	public void shouldNotRegisterDuplicateIncomes() throws NullIncomesException {
		String description = "Hospital • Surgery"; 
		float value = 3000f;
		
		System.out.println(2 + " " + irpf);
		Income i = new Income(description, value);
		
		assertEquals(1, irpf.sizeIncomes());
		assertEquals(8000f, irpf.allIncomes(), 0f);
		assertTrue(irpf.registerIncome(r));
	}
	
	@Test
	public void shoulRegisterUniqueIncome() throws NullIncomesException {
		String description = "Bills • Energy";
		float value = 5000f;
		
		Income i = new Income(description, value); 
		
		System.out.println(1 + " " + irpf);

		assertEquals(1, irpf.sizeIncomes());
		assertEquals(5000f, irpf.allIncomes(), 0f);
		assertTrue(irpf.registerIncome(r));
	}
	
	@Test
	public void shouldRegisterKitchenGasBill() throws NullIncomesException {
		String description = "Bill • Kitchen Gas"; 

		float value = 1000f;
		
		Income i = new Income(description, value); 
		
		System.out.println(3 + " " + irpf);

		assertEquals(2, irpf.sizeIncomes());
		assertEquals(9000f, irpf.allIncomes(), 0f);
		assertTrue(irpf.registerIncome(r));

	}

}
