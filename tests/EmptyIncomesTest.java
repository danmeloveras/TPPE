package tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import application.IRPF;
import exceptions.NullIncomesException;
import exceptions.EmptyIncomesException;

public class EmptyIncomesTest {
	IRPF irpf;
	
	@Before
	public void setup() {
		irpf = new IRPF();
	}
	
	@Test(expected = EmptyIncomesException.class)
	public void shouldNotCalculateIncomeBasis() throws EmptyIncomesException {
		irpf.calculateBasis();
	}
	
	@Test(expected = NullIncomesException.class)
	public void shouldCalculateTaxWithoutIncomes() throws NullIncomesException {
		irpf.allIncomes();
	}
}