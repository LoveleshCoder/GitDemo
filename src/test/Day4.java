package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void WebLoginHomeLoan() {
		System.out.println("Web Login Home");
	}

	@Parameters({ "URL" })
	@Test
	public void MobileLoginHomeLoan(String urlName) {
		System.out.println("Mobile Login Home");
		System.out.println(urlName);
	}

	@Test(groups = { "Smoke" })
	public void LoginAPIHomeLoan() {
		System.out.println("API Login Home");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Last");
	}
}
