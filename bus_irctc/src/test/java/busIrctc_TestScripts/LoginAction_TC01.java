package busIrctc_TestScripts;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import busIrctc_genericUtils.BaseClass;

public class LoginAction_TC01 extends BaseClass{
	String expTitle="IRCTC Bus - Online Bus Ticket Booking | Bus Reservation";
	@Test
	public void basicActions_TC_01() throws Throwable   {
		Thread.sleep(20000);
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//S1: click on login btn
		driver.findElement(By.linkText("Login")).click();
		
		Thread.sleep(20000);
		WebElement UserName= driver.findElement(By.xpath("//input[@id='loginuserid']"));
		UserName.sendKeys("Jyotibj201");
		WebElement Password=driver.findElement(By.xpath("//input[@id='pwd']"));
		Password.sendKeys("Gouravva1996@");
		//S2: Click on Login button on Login window or popup
		WebElement popupLoginBtn=driver.findElement(By.xpath("//div[@class='text-center']/child::button[@class='btn btn-md btn-primary btn-radius yellow-gradient btn-shadow'][1]"));
	popupLoginBtn.click();
	Thread.sleep(5000);
	
	
//	Robot robo=new Robot();
//	robo.keyPress(KeyEvent.VK_F8);
//	
	//After login success msg verify
//	String successMsg=driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
	//	Assert.assertEquals(true, successMsg);
//	System.out.println(successMsg);
	
	String title=driver.getTitle();
	Assert.assertEquals(expTitle, title);
	System.out.println(title);
	}

}
