package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test(groups ={"Regression"})
	public void test3() {
		System.out.println("Inside testcase 3");
	}

	@BeforeSuite
	public void beforesuite() {
		System.out.println("Inside before suite method");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("Inside after suite method");
	}
}
