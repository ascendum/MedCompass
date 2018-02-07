package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonLib.BaseTestLib;


public class TC1 extends BaseTestLib
{
	
	
	@Test
	   public void testAdd() {
	    
		//Enter user name
		WebElement un = driver.findElement(By.xpath("//input[@name='username']"));
		un.sendKeys("default");
		
	    //Enter Password 
		 WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("P@ssw0rd");
		
		//Click on Login button
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		LoginButton.click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "MedCompass");
		System.out.println("successfully Loged to the Application");
		
		//click on search button 
		WebElement Search_Button = driver.findElement(By.xpath("//a[@class='search-container']"));
		Search_Button.click();
		
		//=========
		WebElement Last_Name = driver.findElement(By.xpath("//input[@id='LastName']"));
		Last_Name.sendKeys("Johnson");
		
		WebElement SearchButton = driver.findElement(By.xpath("//div[@class='search-header-actions']//button[@class='mat-raised-button mat-accent']"));
		SearchButton.click();
		
		//Clicking on first link 
		WebElement firstLink = driver.findElement(By.xpath("//a[contains(text(),'Johnson , Lynn')]"));
		firstLink.click();
	   }

	
	
}
