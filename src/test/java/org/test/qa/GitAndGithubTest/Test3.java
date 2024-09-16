package org.test.qa.GitAndGithubTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test3 {
	WebDriver driver;
	@Test
	public void TC001() throws InterruptedException {
		 driver = new ChromeDriver();
		 
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 
		 driver.get("www.google.com");
		 
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 Assert.assertEquals(title, "Google");
		 
		 Thread.sleep(2000);
		 driver.quit();
	}
	
	

}
