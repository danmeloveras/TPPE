package tests;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;


import aplicacao.Deduction;
import aplicacao.IRPF;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeductionTest {

	static IRPF irpf; 
	
	@BeforeClass
	public static void setup() {
		irpf = new IRPF();
	}
	
	@Test
	public void shouldRegisterFirstDeduction() {
		Deduction d = new Deduction("Social Security Contribution", 
				                2000f);
		
		boolean result = irpf.registerDeduction(d);

		assertEquals(1, irpf.sizeAllDeductions());
		assertTrue(result); 
		assertEquals(2000f, irpf.allDeductions(), 0f);
	}
	
	@Test 
	public void shouldRegisterSecondDeduction() {
		Deduction d = new Deduction("Plano de Saude", 
				                500f);
		boolean result = irpf.registerDeduction(d);
		assertTrue(result);
		assertEquals(2, irpf.sizeAllDeductions());
		assertEquals(2500f, irpf.allDeductions(), 0f);
	}
}
