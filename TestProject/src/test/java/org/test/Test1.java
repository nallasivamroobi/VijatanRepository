package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test1 {

	 public WebDriver driver;
	 
	 @Test
	 public void verifydocumentsFunctionality() throws InterruptedException, AWTException
	 {
		 System.setProperty("webdriver.chrome.driver", "D:\\Nalla\\TestRepository\\TestProject\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         driver.get("https://www.scribd.com/");
         driver.findElement(By.xpath("(//span[@class='SvgIcon-module_wrapper__1fPqw']/child::*[@class='SvgIcon-module_icon__sUHUn'])[1]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name='search']/parent::div/parent::div/following-sibling::button/child::span/child::span")).click();
         WebElement searchButton = driver.findElement(By.xpath("//input[@type='search'][@class='search_input']"));
         searchButton.sendKeys("data science");
         
         Thread.sleep(5000);
         
         Robot ro = new Robot();
         for(int i=1;i<=3;i++)
         {
              ro.keyPress(KeyEvent.VK_DOWN);
              ro.keyRelease(KeyEvent.VK_DOWN);
         }
         
         
         ro.keyPress(KeyEvent.VK_ENTER);
         ro.keyRelease(KeyEvent.VK_ENTER);
         
       //  Thread.sleep(6000);
         
         WebElement documentsLink = driver.findElement(By.xpath("(//div[@tabindex='-1'])[2]/child::*/child::li[7]"));
         
         WebDriverWait wait = new WebDriverWait(driver, 50);
         wait.until(ExpectedConditions.elementToBeClickable(documentsLink)).click();
         
         Thread.sleep(2000);
         
         
       //  String expectedRecords = "1,346,888";
        // String actualRecords = driver.findElement(By.xpath("//div[contains(text(),'"+expectedRecords+"')]")).getText();
                      
         
         
//         System.out.println("Records in database is   "+actualRecords);
         
           
		 
		 
				 
		 
		 //
	 }
 
}