package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	 public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[.='Login']")     
	private WebElement loginBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}


//	public void clickOnLoginBtn() throws InterruptedException {
//		Thread.sleep(5000);
////		loginBtn.click();
//
//	}



}
