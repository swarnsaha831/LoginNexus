package testNGPractice;

import org.testng.annotations.*;

public class Test1 {
	
	@Test (priority = 1)
	public void TestExecution1() {
		System.out.println("Test Execution 1.");
	}
	
	@Test (priority = 3)
	public void TestExecution2() {
		System.out.println("Test Execution 2.");
	}
	
	@Test (priority = 1)
	public void TestExecution3() {
		System.out.println("Test Execution 3.");
	}
	
	@Test (priority = 3)
	public void TestExecution4() {
		System.out.println("Test Execution 4.");
	}
	
	@Test (priority = 0)
	public void TestExecution5() {
		System.out.println("Test Execution 5.");
	}
	
	@Test (priority = 3)
	public void TestExecution6() {
		System.out.println("Test Execution 6.");
	}
	
	@Test (priority = 3)
	public void TestExecution7() {
		System.out.println("Test Execution 7.");
	}

}
