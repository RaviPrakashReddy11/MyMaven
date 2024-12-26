package test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry01 implements IRetryAnalyzer
{
	int count=0;
	int try1=2;
	@Override
	public boolean retry(ITestResult result)
	{
		// TODO Auto-generated method stub
		if(count<try1)
		{
			count++;
			return true;
		}
		return false;
	}

}
