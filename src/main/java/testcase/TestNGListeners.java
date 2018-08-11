package testcase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class TestNGListeners implements IAnnotationTransformer,IRetryAnalyzer{
int maxretry =1;
	@Override
	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		arg0.setRetryAnalyzer(this.getClass());
		
	}

	@Override
	public boolean retry(ITestResult arg0) {
		if(!arg0.isSuccess() && maxretry<2)
		{
			maxretry++;
			return true;
		}
		else {
		return false;
		}
	}

}
