package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Inside before Test ");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Inside before ");
	}
	
	
	@Test(groups ={"Regression"})
	public void CreditTest1() {
		System.out.println("Inside testcase 1");
	}
	@Test(enabled= true)
	public void CreditTest2() {
		System.out.println("Inside testcase 2");
	}
	
	@Test(enabled= true, groups ={"Regression"})
	public void CreditTest3() {
		System.out.println("Inside testcase 3");
	}
	
	@Test(groups ={"Smoke"})
	public void loantest() {
		System.out.println("Inside loan test 1");
	}
	@Test
	public void loantest1() {
		System.out.println("Inside loantest 2");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("Inside after ");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("Inside after Test ");
	}
	
	
}
