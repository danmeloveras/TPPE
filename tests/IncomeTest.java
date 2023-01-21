package tests;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import static org.junit.Assert.*; 
import org.junit.Test;
import org.junit.runners.MethodSorters;

import application.IRPF;
import application.Income;
import application.RegisterIncome;
import exceptions.NullIncomesException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@FixMethodOrder(MethodSorters.JVM)
public class IncomeTest {
	static IRPF irpf;
	
	@BeforeClass
	public static void setup() {
		irpf = new IRPF();
	}


	@Test
	public void shouldNotRegisterDuplicateIncomes() throws NullIncomesException {
		String description = "Hospital • Surgery"; 
		float value = 3000f;
		
		Income i = new Income(description, value);
		
		assertTrue(irpf.registerIncome.register(i));
		assertEquals(7000f, irpf.allIncomes(), 0f);
		assertEquals(1, irpf.sizeIncomes());
		
		
	}
	
	@Test
	public void shoulRegisterUniqueIncome() throws NullIncomesException {
		String description = "Hospital • Surgery";
		float value = 4000f;
		
		Income i = new Income(description, value); 
		
		assertTrue(irpf.registerIncome.register(i));
		
		assertEquals(1, irpf.sizeIncomes());
		assertEquals(4000f, irpf.allIncomes(), 0f);
		
	}
	
	@Test
	public void shouldRegisterKitchenGasBill() throws NullIncomesException {
		String description = "Bill • Kitchen Gas"; 

		float value = 1000f;
		
		Income i = new Income(description, value); 
		

		assertTrue(irpf.registerIncome.register(i));
		assertEquals(2, irpf.sizeIncomes());
		assertEquals(8000f, irpf.allIncomes(), 0f);
		
	}
}
