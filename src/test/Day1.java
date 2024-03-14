package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	@AfterTest
	public void afterTest() {
		System.out.println("I will execute last.");
		
	}

	@Test
	public void test1() {
		System.out.println("Hello");
		Assert.assertTrue(false);
	}

	@Test(groups= {"Smoke"})
	public void test2() {
		System.out.println("*****");
	}
}
