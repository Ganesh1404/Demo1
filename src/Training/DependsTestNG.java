package Training;

import org.testng.annotations.Test;

public class DependsTestNG {
	
	@Test(groups= {"viewaccount"})
	public void viewAccount() {
		System.out.println("View Dashboard");
	}
	
	@Test(groups= {"sanity","regression"})
	public void viewAccount2() {
		System.out.println("This test case belongs to multiple groups");
	}
	
	@Test(groups= {"openBrowser"})
	public void OpenBrowser() {
		System.out.println("The browser is opened");
	}
	
	@Test(groups= {"login"})
	public void login() {
		System.out.println("Login to Account Successful");
	}
	
	@Test(groups= {"logout"})
	public void logout() {
		System.out.println("Logout from Application");
	}

}