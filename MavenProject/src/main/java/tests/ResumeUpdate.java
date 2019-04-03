package tests;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ResumeUpdate {
	public WebDriver driver1;
	
		@BeforeTest
		public void beforeTest() {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Webdriver\\chromedriver.exe");
			driver1=new ChromeDriver();
		}
		
		@Test
		public void resumeUpdate() throws InterruptedException, IOException {
		driver1.get("https://www.naukri.com");
		driver1.manage().window().maximize();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait (driver1, 60);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='block']")));
//		driver.findElement(By.xpath("//span[@id='block']")).click();
		
		driver1.findElement(By.xpath("//div[@class='mTxt'][contains(text(),'Login')] ")).click();
		
		driver1.findElement(By.xpath("//input[@id='eLoginNew']")).sendKeys("shubhojitdutta09@gmail.com");
		driver1.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("l1nK&3xPndE");
		driver1.findElement(By.xpath("//button[@value='Login']")).click();
		
		
//		driver1.findElement(By.xpath("//a[@class='socialBtn goog processed']")).click();
//		String winHandleBefore = driver1.getWindowHandle();
//		 for (String winHandle : driver1.getWindowHandles()) 
		//{
//		   // Switch to child window
//		   driver1.switchTo().window(winHandle);
//		 }
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='identifier']")));
//		// Do some operation on child window and get child window handle.
//		 driver1.findElement(By.xpath("//input[@name='identifier']")).sendKeys("shubhojitdutta09@gmail.com");
//		 driver1.findElement(By.xpath("//span[contains(text(),'Next')]")).click();;
//		String winHandleAfter = driver1.getWindowHandle();
//		driver1.switchTo().window(winHandleBefore);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-block btn-large white-text']")));
		driver1.findElement(By.xpath("//a[@class='btn btn-block btn-large white-text']")).click();
		driver1.findElement(By.xpath("//div[@class='uploadBtn']//input[@type='file']")).click();
		Runtime.getRuntime().exec("C:\\Users\\user\\Pictures\\Resume\\FileUpload.exe");
		
		String actV=driver1.findElement(By.xpath("//span[@id='attachCVMsgBox']")).getText();
		System.out.println(actV);
		Thread.sleep(10000);
		}
		@AfterTest
		public void afterClass() {
			driver1.quit();
		}
}
