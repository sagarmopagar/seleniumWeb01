package Tests.Sam.Base;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {

	@BeforeSuite
	public void beforeSuieTest(ITestContext cxt) {
		System.out.println("This method executed before any test in the suite");
		System.out.println("Suite name is: "+cxt.getSuite().getName());
		
	}
	
}
