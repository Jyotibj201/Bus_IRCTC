package busIrctc_genericUtils;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	/** @author Admin
	 * 
	 */

	public WebDriver driver;
	FileUtils fUtil=new FileUtils();

//	@Parameters("browser")
//	@BeforeTest
//	public void launchBrowser(String browser) throws IOException {
//		Reporter.log(browser, true);
//
//		if(browser.equals("chrome")) {
//			driver=new ChromeDriver();
//		}
//
//		else if(browser.equals("firefox")) {
//			driver=new FirefoxDriver();
//		}
//
//		else {
//			driver=new InternetExplorerDriver();
//		}
//
//		driver.get(fUtil.getUrl());
//	}
	
	
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		
		driver=new ChromeDriver();
		System.out.println("Browser has been launched Successfully..!");
		
		driver.get(fUtil.getUrl());
		System.out.println("URL: "+fUtil.getUrl()+" has been entered Successfully..!");
		
		driver.manage().window().maximize();
		System.out.println("Browser has been maximized Successfully..!");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	
	@AfterTest(enabled = false)
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser has been closed Successfully..!");
	}
}
