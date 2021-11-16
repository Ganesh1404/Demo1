package Training;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipExceptionTestNg 
{
	
	@Test(enabled=false)
	public void testCaseEnabling() 
	{
		System.out.println("I'm not ready, please do not execute me");
	}
	
	@Test
	public void testCaseSkipException() 
	{
		System.out.println("I am in Skip Exception");
		throw new SkipException("Skipping this exception");
	}
	
	@Test
	public void testCaseConditionalSkipException() 
	{
		System.out.println("I am in Conditional Skip");
		//if(!DataAvailable) 
			throw new SkipException("Skipping this exception");
	
	}

}