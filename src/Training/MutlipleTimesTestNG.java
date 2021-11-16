package Training;

import org.testng.annotations.Test;

public class MutlipleTimesTestNG 
{
	
	@Test(invocationCount=8)
	public void runMultiple() 
	{
		System.out.println("Execute 8 times");
	}

}