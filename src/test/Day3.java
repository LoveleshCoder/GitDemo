package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Parameters({ "URL", "APIkey" })
	@Test
	public void WebLoginCarLoan(String urlName, String key) {
		System.out.println("Web Login Car");
		System.out.println(urlName);
		System.out.println(key);
	}

	@Test(dataProvider = "getData")
	public void MobileLoginCarLoan(String username, String password) {
		System.out.println("Mobile Login Car");
		System.out.println(username);
		System.out.println(password);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("******");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("-------");
	}

	@Test(enabled = false)
	public void MobileSigninCarLoan() {
		System.out.println("Mobile Signin Car");
	}

	@BeforeSuite
	public void beforesuite() {
		System.out.println("First");
	}

	@Test(groups = { "Smoke" })
	public void MobileLogOutCarLoan() {
		System.out.println("Mobile LogOut Car");
	}

	@Test(dependsOnMethods = { "WebLoginCarLoan" })
	public void LoginAPICarLoan() {
		System.out.println("API Login Car");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before executing class Day3");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After executing class Day3");
	}

	@DataProvider
	public Object[][] getData() {
		// 3 - Number of Rows & 2 - Number of Column
		Object[][] data = new Object[3][2];
		// 1st combination - good credit history
		data[0][0] = "username1";
		data[0][1] = "password1";
		// 2nd combination - no credit history
		data[1][0] = "username2";
		data[1][1] = "password2";
		// 3rd combination - fraudulant credit history
		data[2][0] = "username3";
		data[2][1] = "password3";
		return data;
	}
}
