package testNGPractice;

import org.testng.annotations.Test;

public class TestNGGrouping {

	@Test (groups = {"Sanity"})
	public void TestExecution1() {
		System.out.println("Test Execution 1.");
	}
	
	@Test (groups = {"Regression"})
	public void TestExecution2() {
		System.out.println("Test Execution 2.");
	}
	
	@Test (groups = {"Sanity", "Regression"})
	public void TestExecution3() {
		System.out.println("Test Execution 3.");
	}
	
	@Test (groups = {"Regression"})
	public void TestExecution4() {
		System.out.println("Test Execution 4.");
	}
	
	@Test ()
	public void TestExecution5() {
		System.out.println("Test Execution 5.");
	}
	
	@Test ()
	public void TestExecution6() {
		System.out.println("Test Execution 6.");
	}
	
	@Test ()
	public void TestExecution7() {
		System.out.println("Test Execution 7.");
	}
	
}
