package tests;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@SuiteClasses({ DeductionTest.class, IncomeTest.class})

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class AllTests {

}
