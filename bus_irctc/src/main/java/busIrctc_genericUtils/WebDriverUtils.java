package busIrctc_genericUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {

	
	/** @author Jyoti Jogur
	 * @param driver
	 */
	public void implicitWate(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/** @author Jyoti Jogur
	 * @param driver
	 */
//	public void explicitWate(WebDriver driver, WebElement element) {
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(element));	
//	}
	
	
	/**
	 * @author Jyoti Jogur
	 * Custom Wait
	 * @param element
	 */
	public void customWaitForElementPresent(WebElement element) {
		int i=0;
		    while(i<=100) {
			                try {
				            element.isDisplayed();
			                break;
			                	}
		                        catch(Exception e) {
			                    i++;
		                                            }
		                   }
	
	                                                              }
	
	/** @author Jyoti Jogur
	 * Mouse Hover action method using Actions Class
	 * @param driver
	 * @param element
	 */
	public void moveToElement(WebDriver driver, WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	/** @author Jyoti Jogur
	 * Right click on Element action method using Actions Class
	 * @param driver
	 * @param element
	 */
	public void rightClickonElement(WebDriver driver, WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
	}
	
	/** @author Jyoti Jogur
	 * Right click on page action method using Actions Class
	 * @param driver
	 */
	public void rightClick(WebDriver driver) {
		Actions action=new Actions(driver);
		action.contextClick().perform();
	}
	
	/** @author Jyoti Jogur
	 * Drag and drop the dropdown using Actions Class
	 * @param driver
	 * @param source
	 * @param target
	 */
	public void dragAndDrop(WebDriver driver, WebElement source, WebElement target ) {
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}
	
	
	/** @author Jyoti Jogur
	 * Double click on the Element
	 * @param driver
	 * @param element
	 */
	public void doubleClickOnElement(WebDriver driver, WebElement element ) {
		Actions action=new Actions(driver);
		action.doubleClick(element).perform();
	}
	
	/** @author Jyoti Jogur
	 * Double click on the page
	 * @param driver
	 * @param element
	 */
	public void doubleClic(WebDriver driver) {
		Actions action=new Actions(driver);
		action.doubleClick().perform();
	}
	
	/** @author Jyoti Jogur
	 * Switch to Frame with the help of Index Value
	 * @param driver
	 * @param indexValue
	 */
	public void switchToFrame(WebDriver driver, int indexValue) {
		driver.switchTo().frame(indexValue);//index value
		//driver.switchTo().frame("StringNameorID");
		//driver.switchTo().frame("WebElementID");
		//driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent(); //Switch to Super most parent frame
	}
	
	/** @author Jyoti Jogur
	 * Switch to Frame with the help of Frame String Name or ID
	 * @param driver
	 * @param indexValue
	 */
	public void switchToFrame(WebDriver driver, String StringNameorID) {
		//driver.switchTo().frame(indexValue);//index value
		driver.switchTo().frame("StringNameorID");
		//driver.switchTo().frame("WebElementID");
		//driver.switchTo().parentFrame();
	}
	
	/** @author Jyoti Jogur
	 * Switch to Frame with the help of Frame WebElement ID
	 * @param driver
	 * @param indexValue
	 */
	public void switchToFrame(WebDriver driver, WebElement WebElementID) {
		//driver.switchTo().frame(indexValue);//index value
		//driver.switchTo().frame("StringNameorID");
		driver.switchTo().frame("WebElementID");
		//driver.switchTo().parentFrame();
	}
	
	/** @author Jyoti Jogur
	 * Switch to Frame with the help of Frame WebElement ID
	 * @param driver
	 * @param indexValue
	 */
	public void switchToParentFrame(WebDriver driver) {
		//driver.switchTo().frame(indexValue);//index value
		//driver.switchTo().frame("StringNameorID");
		//driver.switchTo().frame("WebElementID");
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
	}
	
	public void switchToSuperParentFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	
}
