package busIrctc_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import POM_Repository.HomePage;
import busIrctc_genericUtils.BaseClass;

public class Test1 extends BaseClass{
	HomePage home=new HomePage(driver);

	@Test
	public void test1() throws IOException, InterruptedException {
		Thread.sleep(5000);
		//home.getLoginBtn().click();
		Thread.sleep(5000);
	}
}
