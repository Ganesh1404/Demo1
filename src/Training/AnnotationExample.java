package Training;

import org.testng.annotations.*;

public class AnnotationExample {
	
	@Test
	public void tc1() {
		System.out.println("TestCase1");
	}
	
	@Test(priority=2)
	public void tc2() {
		System.out.println("TestCase2");
	}
	
	@Test(priority=1)
	public void tc3() {
		System.out.println("TestCase3");
	}

	@BeforeTest
	public void open() {
		System.out.println("Open");
	}
	
	@AfterTest
	public void close() {
		System.out.println("Close");
	}
	
	@BeforeMethod
	public void OpenBrowser() {
		System.out.println("Open Browser");
	}
	
	@AfterMethod
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}
}