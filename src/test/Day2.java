package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test(groups= {"Smoke"})
	public void test1() {
		System.out.println("World");
	}

	@BeforeTest
	public void test2() {
		System.out.println("I will execute first.");
	}
}